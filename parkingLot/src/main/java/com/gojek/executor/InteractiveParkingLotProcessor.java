package com.gojek.executor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.gojek.beans.Car;
import com.gojek.constants.Command;
import com.gojek.process.ParkingLot;

public class InteractiveParkingLotProcessor extends AbstractProcessor {
	
	public void process() throws Exception {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(true) {
        	String inputString = bufferRead.readLine();
        	validateAndProcess(inputString);
        }
	}

	

}
