
public class Factoryimpl  {

	public Operatingsystem Getphonedetails(String str)
	
	{
		if(str.equals("open"))
		{
			System.out.println("open");
			return new Android();
			
		}
		
		else if(str.equals("Closed"))
		{
			System.out.println("iphone");
		return new Iphone();

		}
		else
		{
			System.out.println("others");
		return null;
		}
		
		
	}
	


}
