package com.allStringInterviewPrograms;

public class ReversWordLeters {
public static void main(String[] args) {
	String str = "Leena Guttedar";       //output= aneeL radettuG
	
	String[] ary = str.split(" ");     //LeenaGuttedar
	
	for(int i=0;i<ary.length;i++) {
		char[] ch = ary[i].toCharArray();
		//String str1 = ary[i];
		String temp = "";
		for(int j=ch.length-1; j>=0; j--) {
		temp=temp+ch[j];
		}
		System.out.print(temp+" ");
		}
}
}
