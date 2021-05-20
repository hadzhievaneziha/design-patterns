package FactoryAndMediator;
import java.util.ArrayList;
public class Chat {
	private static ArrayList<user> users = new ArrayList<User>();
	private static MyBot myBot;
	private static MainFactory myFactory = new MainFactory();
	
	public static void previewMessage(User user, String message){
		if(!users.contains(user)){
			System.out.println("System: "+ user.getingName()+ " is joining in the chat");
			return;
		}	
		
		System.out.println("[" + user.getingName()+"] "+ ": " + message);
		
		if(myBot != null && message.contains("cat")){
			myBot.deleteUserFromChat(user);
			myBot.showMessage();			
		}		
		else if(message.equalsIgnoreCase("addBot")){
			myBot = myFactory.newBot();		
		}
	}
	public static void NewUserInChat( user) {
		if(user!= null) {
			users.add(user);
		}
	}
	public static void DeleteuserFromChat(user user) {
		if(user!= null && users.contains(user)) {
			users.remove(user);
			System.out.println(user.getingName() + " was deleting from the chat");
		}
	}
	public static void newMessage(user user, String message) {
		if(!users.contains(user)){
			System.out.println("System: "+ user.getingName()+ " is joining in the chat");
			return;
		
	}
}
}
