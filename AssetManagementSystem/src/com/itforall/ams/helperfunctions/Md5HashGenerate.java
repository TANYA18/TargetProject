package com.itforall.ams.helperfunctions;

/**
 * 
 */

import java.security.MessageDigest;


/**
 * The Class Md5HashGenerate.
 *
 * @author 441484
 */
public class Md5HashGenerate {

	/**
	 * Hash generator.
	 *
	 * @param password the password
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String HashGenerator(String password) throws Exception {

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());

		byte byteData[] = md.digest();

		//convert the byte to hex format method 1
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}

		return sb.toString();
	}

}
