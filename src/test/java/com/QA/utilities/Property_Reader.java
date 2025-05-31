package com.QA.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Reader {

	static Properties pro;
	
	public static Properties init_Prop() {
		
		try {
			FileInputStream fi=new FileInputStream("src/test/resources/Data/Headers.properties");
			pro=new Properties();
			pro.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;
	}
}
