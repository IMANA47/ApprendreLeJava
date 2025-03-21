package vidéo21.polymorphisme;


public class Cottage extends Building implements Flyable{
	public Cottage()
	{
	}
	public void build(String material)
	{
	System.out.println("Construction du batiment en " + material);
	}

	public void fly()
	{
	System.out.println("Je me propulse dans les airs avec du ");
	}
}