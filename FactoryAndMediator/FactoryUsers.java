package FactoryAndMediator;

public class FactoryUsers {
	public User newUser(String name)
	{
		return new User(name);
	}
}
