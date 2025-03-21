package vidéo18.heritage;
public class Horse {
	
	private String mName;
	private int mPosX;
	private int mPosY;

	public Horse(String name) {
		this.mName = name;
		this.mPosX =50;
		this.mPosY =50;
		
	}
	public void move(int x, int y) {
		this.mPosX =x;
		this.mPosY =y;
		System.out.println("Le chevale  nomé "+this.mName+" se deplace (X =" +this.mPosX+", Y ="+this.mPosY+") ");	
	}
	


}
