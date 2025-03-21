package vidéo21.polymorphisme;

public  class Moto extends Vehicle implements Flyable{
public Moto()
	{
	this.mMovementSpeed = 250;
	}

	public void moveXY(int x, int y)
	{
	System.out.println("Je vais super vite !!");
	}

	public void fly()
	{
	System.out.println("Plein gaz, la moto decolle et s'en va dans les nuages ");
	}
}

