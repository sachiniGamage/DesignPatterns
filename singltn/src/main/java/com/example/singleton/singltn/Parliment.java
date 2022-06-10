package com.example.singleton.singltn;

public class Parliment {
	private static volatile Parliment parliment = new Parliment();
	
	
	private Parliment() {
		//private constructor - So no one can create a instance from that
		if(parliment != null) {
			throw new RuntimeException("Please use getParliment method");
		}
	}
	
	public static Parliment getParliment() {
		 //in here it still being creating the test
		if(parliment == null) {
			//make thread safe
			synchronized (parliment) {
				//if it still parliament null , then create a parliament
				if(parliment == null) {
					parliment = new Parliment();
				}
			}
		}
		return parliment;
	}
	
	
}
