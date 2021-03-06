package com.mindgate.pojo;

public class Address {
	private int addressId;
	private String street;
	private String city;
	private String state;

	public Address() {
		System.out.println("Default constructor of address called");
	}

	public Address(int addressId, String street, String city, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		System.out.println("Parametrised constructor address called");
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
		System.out.println("Setting AddressId ::"+ addressId);
	}

	public String getStreet() {
		return street;
		
	}

	public void setStreet(String street) {
		this.street = street;
		System.out.println("Setting Street::"+ street);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("Set city::"+ city);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("set State"+ state);
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}


}
