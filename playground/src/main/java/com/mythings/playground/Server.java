package com.mythings.playground;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import com.netflix.servo.annotations.DataSourceType;
import com.netflix.servo.annotations.Monitor;

public class Server {
	private final String id;

	@Monitor(name = "Status", type = DataSourceType.INFORMATIONAL)
	private AtomicReference<String> status = new AtomicReference<String>("UP");

	@Monitor(name = "CurrentConnections", type = DataSourceType.GAUGE)
	private AtomicInteger currentConnections = new AtomicInteger(0);

	@Monitor(name = "TotalConnections", type = DataSourceType.COUNTER)
	private AtomicInteger totalConnections = new AtomicInteger(0);

	@Monitor(name = "BytesIn", type = DataSourceType.COUNTER)
	private AtomicLong bytesIn = new AtomicLong(0L);

	@Monitor(name = "BytesOut", type = DataSourceType.COUNTER)
	private AtomicLong bytesOut = new AtomicLong(0L);

	public Server(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	// ...
}