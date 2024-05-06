package com.pack;

public class InsuffFundEx extends Exception {
	double amount;
	InsuffFundEx(double amt){
		amount = amt ;
	}
}
