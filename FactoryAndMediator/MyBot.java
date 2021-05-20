package FactoryAndMediator;

public class MyBot {
	public void showMessage() {
		System.out.println("MyBot: You can not write the word //cat//");
	}
	public void deleteUserFromChat(User User) {
		Chat.DeleteUserFromChat(User);
	}
}
