package com.springDemo.SpringCore;

public class SamsungTv implements RemoteMaster {

	@Override
	public void channalChange() {
		
		System.out.println("Samsung Tv Channal Change");
		
	}

	@Override
	public void colourChange() {
		System.out.println("Samsung Tv Color Change");
	}

}
