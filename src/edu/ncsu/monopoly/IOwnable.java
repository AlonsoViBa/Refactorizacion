package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getPropietario();

	int getPrice();

	void setPropietario(Player owner);

}