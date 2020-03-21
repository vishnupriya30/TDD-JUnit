package com.epam.tddJunit;

public class RemoveFirst2CharsIfA {
	public String removeFirst2A(String string){
		String res = "";
		for(int i = 0;i < 2; i++){
		    if(string.charAt(i) != 'A')	
		    	res = res+string.charAt(i);
		}
		return res+string.substring(2,string.length());
	}
}
