
public class Penguin extends Bird{
	public String walk;

	public Penguin() {
		// TODO Auto-generated constructor stub
	}

	public Penguin(String eat1 ,String sleep1 ,String chirp1 ,String walk1) {
		super(eat1,sleep1,chirp1);
		walk =walk1;
	}
	public void setWalk(String walk1)
	{
		walk=walk1;
	}
	public String getWalk()

	{
		return walk;
	}
}
