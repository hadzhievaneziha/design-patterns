package FactoryAndMediator;

public class User {
	 private String name;

	   public String getingName() {
	      return name;
	   }

	   public void setingName(String name) {
	      this.name = name;
	   }

	   public User(String name){
	      this.name  = name;
	   }

	   public void newMessage(String message){
	      Chat.newMessage(this,message);
	   }
}
