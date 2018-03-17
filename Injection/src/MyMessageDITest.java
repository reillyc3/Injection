


public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hello Connor!";
		String email = "creilly1@hawk.iit.edu";
		String phone = "6084364544";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}