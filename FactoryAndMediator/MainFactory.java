package FactoryAndMediator;

public class MainFactory extends MyFactory{
	public MainFactory() {
		factoryBots = new FactoryBots();
		factoryPersons = new FactoryPersons();
	}
}
