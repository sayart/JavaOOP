package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PC pc = new PC("i5", 16, "gtx1060");
		
		USBFlash usbFlashOne = new USBFlash(16, "Samsung", "Travel");
		USBFlash usbFlashTwo = new USBFlash(6, "Samsung", "Travel");
		
		pc.connectUSB(usbFlashOne);
		USBFlash[] flashArray = new USBFlash[]{
			usbFlashOne
		};
	}

}
