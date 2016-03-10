
public class Animal {

	public String eat;
	public String sleep;
	public Animal()
	{
		
	}
	
	public Animal(String eat1 , String sleep1) {
		eat =eat1;
		sleep=sleep1;
	}
	
	public void setSleep(String sleep1)
	{
		sleep =sleep1;
	}
	public String getSleep()
	{
		return sleep;
	}
	public void setEat(String eat1)
	{
		eat =eat1;
	}
	public String getEat()
	{
		return eat;
	}

}
