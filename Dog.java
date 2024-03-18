package test1;

public class Dog extends Animal implements Land {
	private int numberOfLength;
	
	public Dog(boolean mammals, boolean carnivorous, int mood ) {
		super(mammals, carnivorous, mood);
		this.numberOfLength = 4;
	}
	
	@Override
	public void sayHello() {
		System.out.println("wagging his tail");
	}

	@Override
	public void sayHello(int m) {
		if(m == MOOD_HAPPY)
		{
			System.out.println("will bark loudly");
		}
		else if(m == MOOD_SCARE)
		{
			System.out.println("will make a 'whooping' sound");
		}
	}
	
	@Override
	public int getNumberOfLegs(){
		return this.numberOfLength;
	}
	
	
	

}
