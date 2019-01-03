package com.rev.Managers;

import javax.swing.event.EventListenerList;

///Uses Event Handler to catch any incoming events and associate them with other objects
public class EventManager extends EventListenerList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static EventManager _instance;
	
	public static EventManager instance()
	{
		if(_instance == null)
		{
			_instance = new EventManager();
		}
		return _instance;
	}
}