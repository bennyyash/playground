package com.mythings.playground;

import java.io.IOException;

import com.netflix.servo.monitor.Monitors;

public class App {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Server server = new Server("bubu");
		Monitors.registerObject(server);

		System.out.println("Hello World");

	}

}
