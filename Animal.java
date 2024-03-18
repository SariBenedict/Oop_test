package test1;

public abstract class Animal {
	protected boolean mammals;
	protected boolean carnivorous;
	public static int MOOD_HAPPY = 0;
	public static int MOOD_SCARE = 1;
	protected int mood;
		
	public Animal(boolean mammals, boolean carnivorous, int mood) {
		this.mammals = mammals;
		this.carnivorous = carnivorous;
		this.mood = mood;
	}
	
	public void sayHello(){
		System.out.println("There is no information");
	}
	
	public abstract void sayHello(int mood);
	
	public boolean isMammals() {
		return mammals;
	}
	
	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}
	
	public boolean isCarnivorous() {
		return carnivorous;
	}
	
	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}
	
	
	
}
