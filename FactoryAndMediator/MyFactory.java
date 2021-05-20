package FactoryAndMediator;

public class MyFactory {
	protected FactoryUsers factoryUsers;
	protected FactoryBots factoryBots;
	
	public User newUser(String name)
	{
		return factoryUsers.newUser(name);		
	}
	public MyBot newBot()
	{
		return factoryBots.newBot();
	}
}
