/**
 * @author Lisa Feb 21, 2016 InstrumentAgent.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.util.HashSet;
import java.util.Set;

public class InstrumentAgent {
	public static Set<String> excluded;
	public static void premain(String args, Instrumentation inst) {
		excluded=readExculdedTestClasses();
	    inst.addTransformer(new ClassTransformer());
	  } 
	public static Set<String> readExculdedTestClasses(){
		File file=new File("TestClasses.dat");
		Set<String> res=new HashSet<String>();
		if(!file.exists())
			return res;
		try { 
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line=reader.readLine();
			while(line!=null){
				res.add(line);
				line=reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
}
