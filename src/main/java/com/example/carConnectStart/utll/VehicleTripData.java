package com.example.carConnectStart.utll;



import com.microsoft.azure.sdk.iot.device.Message;

public class VehicleTripData implements CarDataGenerator {

	@Override
	public Message generateData() {
		String msgStr = "{\"speed\":"+ ((int)(1000*Math.random()%180))+"\"usercase\":\"VehicleTrip\""+",\"tripid\":"+ ((int)(100*Math.random())) +",\"longitude\":"+ ((int)(100*Math.random()))+",\"latitude\":"+ ((int)(100*Math.random()))+",\"vin\":"+ ((int)(10000*Math.random()))+",\"fuel\":"+ ((int)(100*Math.random()%60))+",\"rpm\":"+ ((int)(10000*Math.random()%2500))+"}";
		Message msg = new Message(msgStr);
		System.out.println(msgStr);
		return msg;
	}

}
