package com.doltics.commerce.utils;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

import com.doltics.commerce.abstracts.AbstractUtil;

/**
 * 
 * IDUtils
 * 
 * @author <a href="mailto:paul@hubloy.com">Paul Kevin</a>
 * @version enter version, 14 Feb 2022
 * @since  enter jdk version
 */
public class IDUtils extends AbstractUtil {
	
	/**
	 * Generate ID
	 * 
	 * @return
	 */
	public static String id() {
		SecureRandom random;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
			return new BigInteger(100, random).toString(32);
		} catch (NoSuchAlgorithmException e) {
			return UUID.randomUUID().toString();
		}

	}

	/**
	 * Generate Password
	 * 
	 * @param username
	 * @return
	 */
	public static String generatePassword(String username) {

		StringBuilder output = new StringBuilder();
		char[] names = username.substring(0, 3).toCharArray();
		for (int i = 0; i < names.length; i++) {
			output.append((int) names[i]);
		}

		SecureRandom random = null;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
			output.append(new BigInteger(10, random));
			return output.toString();
		} catch (NoSuchAlgorithmException e) {
			return UUID.randomUUID().toString();
		}

	}

	/**
	 * Generate short id
	 * 
	 * @return
	 */
	public static String generateMixedShortId() {
		String sampleAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		char[] buf = new char[12];
		for (int i = 0; i < 12; i++)
			buf[i] = sampleAlphabet.charAt(random.nextInt(sampleAlphabet.length()));
		return new String(buf);
	}

	/**
	 * Generate reset token
	 * 
	 * @return
	 */
	public static String generateUniqueString() {
		return mixString(generatePassword(id()), generateMixedShortId());
	}

	/**
	 * Mix strings
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static String mixString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int max = Math.max(aLen, bLen);
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < max; i++) {
			if (i <= aLen - 1)
				builder.append(a.substring(i, i + 1));
			if (i <= bLen - 1)
				builder.append(b.substring(i, i + 1));

		}
		return builder.toString();
	}
	
	public static long[] digits(String string) {
		int len = string.length();
		long[] digits = new long[len];
		String str = null;
		for (int i = 0; i <= (len - 1); i++) {
			str = string.substring(i, i + 1);
			digits[i] = Long.parseLong(str);
		}
		return digits;
	}
}