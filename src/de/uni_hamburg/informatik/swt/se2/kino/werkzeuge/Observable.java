package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.HashSet;
import java.util.Set;

/**
 * Stellt Methoden zur Verfügung, mit denen Eine Liste von Beobachtern verwaltet wird
 * und die Beobachter über Änderungen informiert werden.
 *
 */

public abstract class Observable {
	
	//Die Liste der Beobachter
	private Set<Observer> _observer;
	
	/**
	 * Der Konstruktor der Klasse, 
	 * der ein neues leeres Beobachterset initialisiert. 
	 */
	public Observable()
	{
		_observer = new HashSet<Observer>();
	};
	
	/**
	 * Fügt einen neuen Beobachter zur Liste hinzu
	 * @param observer Der hinzu zufügende Beobachter
	 */
	public void addObserver(Observer observer)
	{
		_observer.add(observer);
	};
	
	/**
	 * Entfernt einen Beobachter von der Liste
	 * @param observer Der zu entfernende Beobachter
	 */
	public void removeObserver(Observer observer)
	{
		if(isObserver(observer))
		{
			_observer.remove(observer);
		}
	};
	
	/**
	 * Prüft ob ein Beobachter schon in die Liste eingetragen ist
	 * @param observer Der zu prüfende Beobachter 
	 * @return True wenn der Beobachter auf der Liste ist
	 */
	public boolean isObserver(Observer observer)
	{
		return _observer.contains(observer);
	};
	
	/**
	 * Informiert alle Beobachter über eine Änderung
	 */
	public void update() 
	{
		for (Observer observer : _observer) {
			observer.reagiereaufAenderungen(this);
		}
	};
}
