package com.springDemo.SpringCore;

public class LgTv implements RemoteMaster {
	
	
	LgTv(){
		System.out.println("LgTv Constructor");
	}

	@Override
	public void channalChange() {
		System.out.println("Lg Tv Channal Change");
	}

	@Override
	public void colourChange() {
		System.out.println("Lg Tv Color Change");
	}

}
