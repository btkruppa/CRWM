package com.rev.Singleton;

public class Single {

	private static Single _instance;
	
	public static Single instance()
	{
		if(_instance == null)
		{
			_instance = new Single();
		}
		return _instance;
	}
	public void Dummy()
	{
		System.out.println("Test");
	}
}
