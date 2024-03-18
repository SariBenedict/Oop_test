package test1;

public class Cat extends Animal implements Land {
	
	private int numberOfLength;
	
	public Cat(boolean mammals, boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
		this.numberOfLength = 4;
	}

	
	
	public void sayHello() {
		System.out.println("meow~");
	}

	@Override
	public void sayHello(int m) {
		if(m == MOOD_HAPPY)
		{
			System.out.println("purr, purr");
		}
		else if(m == MOOD_SCARE)
		{
			System.out.println(" make a 'hiss' sound");
		}
	}
	
	@Override
	public int getNumberOfLegs(){
		return this.numberOfLength;
	}
}
