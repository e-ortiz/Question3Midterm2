package application;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
	
	// FirstName, MiddleInit, LastName, Gender,  Address, City, St, Zip. 
	private String FirstName;
	private String MiddleInit;
	private String LastName;
	private boolean Gender;
	private String Address;
	private String City;
	private State St;
	private int Zip;
	
	public Customer() {
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleInit() {
		return MiddleInit;
	}

	public void setMiddleInit(String middleInit) {
		MiddleInit = middleInit;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public State getSt() {
		return St;
	}

	public void setSt(State st) {
		St = st;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}
	
	
	
	}
	
	

