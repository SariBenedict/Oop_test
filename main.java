package test1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal [] animals = new Animal [5];
		animals[0]= new Cat(true, true, 0);
		animals[1]= new Dog(true, true, 1);
		animals[2]= new Dog(true, true, 0);
		animals[3]= new Frog(false, false, 0);
		animals[4]= new Frog(false, false, 1);
		
		for(Animal a: animals){
			if(a instanceof Cat){
				System.out.println("I hava " + (((Cat) a).getNumberOfLegs()) + " legs");
				System.out.println("usully: ");
				((Cat)a).sayHello();
			}
			if(a instanceof Dog)
			{
				System.out.println("I hava " + (((Dog) a).getNumberOfLegs()) + " legs");
				System.out.println("usully: ");
				((Dog)a).sayHello();
			}
				
			if(a instanceof Frog)
			{
				System.out.println("I hava " + (((Frog) a).getNumberOfLegs()) + " legs");
				System.out.println("usully: ");
				((Frog)a).sayHello();
			}
				
			
			System.out.println("When I'm happy , I: " );
			a.sayHello(0);
			
			
			
			
		}
		
		
	}

}
