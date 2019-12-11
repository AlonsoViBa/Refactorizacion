package edu.ncsu.monopoly;

public abstract class Cell {
	private String name;
	protected Player propietario;
	private boolean available = true;

	public String getName() {
		return name;
	}

	public Player getPropietario() {
		return propietario;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	public void setPropietario(Player owner) {
		this.propietario = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
