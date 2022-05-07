package week3.day21;

import week3.day2.Mobile;

public class Phone extends Mobile{
public static void main(String[] args) {
	//For public only
	Mobile id=new Mobile();
	id.makeCall();
    
	//For Protected
	Phone fg=new Phone();
	fg.whatsappMessage();
	
}
}
