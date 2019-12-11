package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player propietario;
	private boolean available = true;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Player getPropietario() {
		return propietario;
	}
	
	@Override
	public int getPrice() {
		return 0;
	}

	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	@Override
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
