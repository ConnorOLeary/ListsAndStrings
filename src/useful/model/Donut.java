package useful.model;

public class Donut {
	//Declares data members for the Donut constructor
	private boolean hasSprinkles;
	private boolean isGlazed;
	private boolean hasFilling;
	private String shape;
	private String flavor;
	private int holes;
	
	public Donut() {
		this.flavor = "plain";
		this.shape ="round";
		this.holes = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	public Donut(String flavor) {
		this.flavor = flavor;
	}
	public Donut(int holes) {
		this.holes = holes;
	}
	
	public String toString() {
		String message = "this is a " + flavor + " donut";
		return message;
	}
	
	
	public String getShape(){
		return shape;
	}
	public String getFlavor(){
		return flavor;
	}
	public boolean getSprinkles(){
		return hasSprinkles;
	}
	public boolean getFilling(){
		return hasFilling;
	}
	public boolean getGlaze(){
		return isGlazed;
	}
	public int getHoles(){
		return holes;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setHoles(int holes) {
		this.holes = holes;
	}
	
}
