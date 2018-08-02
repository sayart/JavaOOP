package com.gmail.slartua;

public class PC {
	private String cpuModel;
	private int ram;
	private String gpuModel;

	public PC(String cpuModel, int ram, String gpuModel) {
		super();
		this.cpuModel = cpuModel;
		this.ram = ram;
		this.gpuModel = gpuModel;
	}

	public PC() {
		super();
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

	@Override
	public String toString() {
		return "PC [cpuModel=" + cpuModel + ", ram=" + ram + ", gpuModel=" + gpuModel + "]";
	}

	public void connectUSB(USBDevice usbDev) {
		System.out.println("Connect " + usbDev.getDeviceDescription());
		System.out.println("Device ID: " + usbDev.getDeviceID());
	}

}
