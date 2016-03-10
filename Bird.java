
public class Bird extends Animal {
	public String chirp;
	
	public Bird()
	{
		
	}

	public Bird(String eat1 ,String sleep1 ,String chirp1) {
		super(eat1,sleep1);
		chirp =chirp1;
	}
	public void setChirp(String chirp1)
	{
		chirp=chirp1;
	}
	public String getChirp()

	{
		return chirp;
	}

}
