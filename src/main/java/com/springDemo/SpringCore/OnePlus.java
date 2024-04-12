package com.springDemo.SpringCore;

public class OnePlus implements RemoteMaster {

	@Override
	public void channalChange() {
		System.out.println("OnePlus Tv Channal Change");
		
	}

	@Override
	public void colourChange() {
		System.out.println("OnePlus Tv Color Change");
		
	}

}
