
public class Singleton 
{
	private Singleton()
	{
		System.out.println("inside ctor");
	}
	
	private static Singleton instance = null;
	public static Singleton getInstance()
	{
		if(instance == null)
			instance = new Singleton();
		
		return instance;
	}
	
	public void test()
	{
		synchronized(this)
		{
			for(int count = 0; count<=10; count++)
			{
				System.out.println(count + " Thread:: "+Thread.currentThread().getName());
			}
		}
		
	}
}
