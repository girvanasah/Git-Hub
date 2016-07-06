package com.github.utility;

import java.io.*;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Utility 
{
	private static Map<String,String> testData;
	private static void yamlParser(){
		Yaml yaml = new Yaml();
		Reader reader = null;
		try {
			reader = new FileReader("resources/config.yml");
			testData = (Map<String,String>) yaml.load(reader);
		} catch (final FileNotFoundException fnfe) {
			System.err.println("We had a problem reading the YAML from the file because we couldn't find the file." + fnfe);
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (final IOException ioe) {
					System.err.println("We got the following exception trying to clean up the reader: " + ioe);
				}
			}
		}
	}
	
	public static String getYamlValues(String key) {
		yamlParser();
		return  testData.get(key);
	}
}
