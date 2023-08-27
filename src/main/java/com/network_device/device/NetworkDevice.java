package com.network_device.device;
import jakarta.persistence.*;

@Entity 
@Table(name="device")
public class NetworkDevice {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(name="Device_Type")
private String deviceType ;
@Column(name="Device_Name")
private String name;
@Column(name="Price")
private float price;
@Column(name="Version")
private float version;
@Column(name="Brand_Name")
private String brand;

public NetworkDevice() {
	
}

public NetworkDevice(String deviceType,String name, float price, float version, String brand ) {
	super();
	this.deviceType = deviceType;
	this.name = name;
	this.price = price;
	this.version = version;
	this.brand = brand;
}

public String getDeviceType() {
	return deviceType;
}

public void setDeviceType(String deviceType) {
	this.deviceType = deviceType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getVersion() {
	return version;
}
public void setVersion(float version) {
	this.version = version;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}


}

