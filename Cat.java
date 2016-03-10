
public class Cat extends Animal {

	public String purr;
	public Cat()
	{
		
	}
	public Cat(String eat1 ,String sleep1 ,String purr1) {
		super(eat1,sleep1);
		purr=purr1;
	}
	public void setPurr(String purr1)
	{
		purr=purr1;
	}
	public String getPurr()

	{
		return purr;
	}
}
