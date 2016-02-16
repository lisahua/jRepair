/**
 * @author Lisa Feb 16, 2016 PropertyJsonHandler.java 
 */
package ece.utexas.edu.repair.configure;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PropertyJsonHandler {
	private static PropertyJsonHandler handler = new PropertyJsonHandler();

	private PropertyJsonHandler() {

	}

	public static PropertyJsonHandler getInstance() {
		return handler;
	}

	private ObjectMapper mapper = new ObjectMapper();
	private String defaultPath = "src/main/resources/properties/property.json";
	private PropertyJsonModel model = null;

	public PropertyJsonModel getPropertyModel() {
		if (model == null)
			readFromJsonFile();
		return model;
	}

	public void readFromJsonFile() {
		try {
			this.model = mapper.readValue(new File(defaultPath), PropertyJsonModel.class);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeToJsonFile() {
		PropertyJsonModel model = new PropertyJsonModel();
		model.setProjectPath("/Users/lisahua/Documents/lisa/project/build/Closure_1_buggy");
		try {
			mapper.writeValue(new File(defaultPath), model);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
