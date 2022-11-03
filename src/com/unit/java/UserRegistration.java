package com.unit.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class userRegistration {
	
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
	public boolean lastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}
}
