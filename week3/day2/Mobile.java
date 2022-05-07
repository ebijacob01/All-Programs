package week3.day2;

public class Mobile {
   public void makeCall() {
	   System.out.println("make call");	
}
   private void videoCall() {
	System.out.println("Video call");
}
   void sendMessage() {
	   System.out.println("Send message");
   }
   protected void whatsappMessage() {
	System.out.println("Whatsapp Message");
}
   public static void main(String[] args) {
	Mobile type=new Mobile();
	type.makeCall();
	type.videoCall();
	type.sendMessage();
	type.whatsappMessage();
}
}
