package FactoryAndMediator;

public class Main {
	public static void main(String[] args) {
		MyFactory myFactory = new MainFactory();
		User User1 = myFactory.newUser("Nezi");
		User User2 = myFactory.newUser("Mertin");
		User User3 = myFactory.newUser("Ivana");
		User User4 = myFactory.newUser("Niko");

		Chat.NewUserInChat(User1);
		Chat.NewUserInChat(User2);
		Chat.NewUserInChat(User3);
		Chat.NewUserInChat(User4);
		
		///////////////////////////////////////////////
		
		User1.newMessage("Hi");
		User2.newMessage("Hi,Nezi!");
		User3.newMessage("Good afternoon!");
		
		
		User1.newMessage("addBot");
		User2.newMessage("How friends' vacation went\n"
				+ "?");
		User3.newMessage("So good, you?");
		
		
		
	}

}
