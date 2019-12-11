package edu.ncsu.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player propietario;

	public String getName() {
		return name;
	}

	public Player getPropietario() {
		return propietario;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setPropietario(Player owner) {
		this.propietario = owner;
	}
    
    public String toString() {
        return name;
    }
}
