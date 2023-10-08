package week1.day1;

public class Mobile {
	public void makecall()
	{
		String mobileModel="Samsung";
		float mobileWeight=200f;
		System.out.println("My mobile is"+mobileModel);
		System.out.println("My mobile weigt is"+mobileWeight);
		}
	public void  sengmsg()
	{
		boolean fullCharged= true;
		int mobileCost=32000;
		System.out.println("My mobile is fully charged" + fullCharged);
		System.out.println("My mobile cost is"+mobileCost);
		}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makecall();
		m.sengmsg();
		System.out.println("This is my mobile");
	
	}

}
