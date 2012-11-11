package com.mythings.playground;

import javax.inject.Singleton;

@Singleton
public final class ServerId {

	private final String id;

	public ServerId() {
		this.id = "id";

	}

	public String getId() {
		return id;
	}

}
