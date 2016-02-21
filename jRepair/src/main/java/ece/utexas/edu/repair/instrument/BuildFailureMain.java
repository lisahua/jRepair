/**
 * @author Lisa Feb 16, 2016 BuildFailureRecorder.java 
 */
package ece.utexas.edu.repair.instrument;

import java.io.File;

import org.apache.tools.ant.Main;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

public class BuildFailureMain extends Main{

	
	public void editTestTarget() {
		File buildFile = new File("build.xml");
		   Project p = new Project();
		   p.setUserProperty("ant.file", buildFile.getAbsolutePath());
		   p.init();
		   ProjectHelper helper = ProjectHelper.getProjectHelper();
		   p.addReference("ant.projectHelper", helper);
		   helper.parse(p, buildFile);
		   p.executeTarget(p.getDefaultTarget());
	}
}
