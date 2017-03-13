package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	//Making the class final to avoid extending this class
	public static final class Person {
		
		//Making class fields private & final so that the values can be assigned only once
		private final Set<String> phoneNumbers = new HashSet<String>();
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, String phoneNumber) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers.add(phoneNumber);
		}

		public Set<String> getPhoneNumbers() {
			//Returning a copy of Set
			HashSet<String> retVal = new HashSet<String>();
			retVal.addAll(phoneNumbers);
			return retVal;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}