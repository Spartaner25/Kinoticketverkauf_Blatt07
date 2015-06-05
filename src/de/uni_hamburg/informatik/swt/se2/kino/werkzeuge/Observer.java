package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

public interface Observer {
	
	/**
	 * Soll aufgerufen werden, wenn eine Änderung passiert.
	 * 
	 * @param sender Der Sender der Änderung
	 */
	void reagiereaufAenderungen(Observable sender);

}
