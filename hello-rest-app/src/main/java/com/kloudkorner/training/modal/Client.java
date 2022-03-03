package com.kloudkorner.training.modal;

public class Client {

	private final String firstName;
	private final String lastName;

	private Client(ClientBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}

	public static ClientBuilder newBuilder() {
		return new ClientBuilder();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static class ClientBuilder {
		private String firstName;
		private String lastName;

		private ClientBuilder() {

		}

		public ClientBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public ClientBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Client build() {
			return new Client(this);
		}
	}

}
