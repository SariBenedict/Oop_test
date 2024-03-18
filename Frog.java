package test1;

public class Frog extends Animal implements Land, Water {

	private int nuberOfLength;
	
	public Frog(boolean mammals, boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
		this.nuberOfLength = 4;
	}
	
	@Override
	public void sayHello(int m) {
		if(m == MOOD_HAPPY)
		{
			System.out.println("will sing 'quack quack quack'");
		}
		else if(m == MOOD_SCARE)
		{
			System.out.println("will 'plop into the water'");
		}
		
	}
	
	@Override
	public int getNumberOfLegs(){
		return this.nuberOfLength;
	}
	
	@Override
	public boolean hasGills(){
		return false;
	}
	
	@Override
	public boolean hasLaysEggs(){
		return true;
	}
	

}
