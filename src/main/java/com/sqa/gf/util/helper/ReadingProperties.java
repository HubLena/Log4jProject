/**
 *   File Name: ReadingProperties.java<br>
 *   Gelena Finberg
 *   Created: Mar 12, 2016 
 */

package com.sqa.gf.util.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ReadingProperties //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author     Finberg, Gelena
 * @version     1.0.0
 * @since       1.0
 *
 */
public class ReadingProperties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		String userName;
		String pass;
		String url;

		try {
			FileInputStream is;
			is = new FileInputStream("sqa.properties");
			prop.load(is);
			System.out.println("Properties loaded.");
			userName = prop.getProperty("userName");
			pass = prop.getProperty("password");
			url = prop.getProperty("url");
			System.out.println(prop);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
