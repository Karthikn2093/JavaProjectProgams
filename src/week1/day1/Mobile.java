package week1.day1;

public class Mobile {
	
	String mobColor = "Black";
	boolean isRefurbished = false;

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMessage();
		mobile.takePhoto();
		
		System.out.println(mobile.mobColor);
		System.out.println(mobile.isRefurbished);

	}
	
	public void makeCall() {
		System.out.println("Making a call");
	}
	public void sendMessage() {
		System.out.println("Sending a message");
	}
	public void takePhoto() {
		System.out.println("Taking a photo");
	}

}
