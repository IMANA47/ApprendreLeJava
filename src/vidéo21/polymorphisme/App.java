package vidéo21.polymorphisme;

public class App /*extends object */{
public static void main(String[] args)
	{
	
	Flyable[] elements = {new Ship(), new Ship(), new Cottage(), new Cottage(), new Moto()};
	
	for(Flyable e: elements)
		e.fly();
	}
}