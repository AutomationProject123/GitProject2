package com.allStringInterviewPrograms;

public class ReverseWords {
public static void main(String[] args) {
	String str = "Leena Guttedar";
	String temp = "";
	String[] ary = str.split(" ");
	for(int i=ary.length-1; i>=0;i--) {
		temp = temp+ary[i]+" ";
		}
	System.out.println(temp);
}
}
