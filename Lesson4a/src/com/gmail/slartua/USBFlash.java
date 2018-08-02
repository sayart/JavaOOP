package com.gmail.slartua;

public class USBFlash implements USBDevice, Comparable {
	private int size;
	private String vendor;
	private String model;

	public USBFlash() {
		super();
		// TODO Auto-generated constructor stub
	}

	public USBFlash(int size, String vendor, String model) {
		super();
		this.size = size;
		this.vendor = vendor;
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "USBFlash [size=" + size + ", vendor=" + vendor + ", model=" + model + "]";
	}

	@Override
	public int getDeviceID() {
		return hashCode();
	}

	@Override
	public String getDeviceDescription() {
		return toString();
	}

	@Override
	public int compareTo(Object o) {
		USBFLash anotherUsbFlash = (USBFlash) o;
		if (this.size > anotherUSBFlash.size) {
			return 1;
		}
		if(this.size <anotherUSBFlash.size) {
			return -1;
		}
		return 0;
	}

}
