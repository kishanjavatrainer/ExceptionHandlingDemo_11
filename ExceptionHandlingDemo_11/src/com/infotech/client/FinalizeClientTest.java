package com.infotech.client;

public class FinalizeClientTest {

	public static void main(String[] args) throws ClassNotFoundException  {
		
		FinalizeClientTest clientTest = new FinalizeClientTest();
		clientTest.greet();
		clientTest = null;
		System.gc();
	}
	
	private void greet() {
		System.out.println("Welcome..");
	}

	@Override
	public void finalize()  {
		System.out.println("finalize is called...");
	}
}
