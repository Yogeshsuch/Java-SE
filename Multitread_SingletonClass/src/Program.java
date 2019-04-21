
class CThread implements Runnable
{
	private static Singleton instance = Singleton.getInstance();
	private Thread thread;
	public CThread(String threadName) 
	{
		this.thread = new Thread(this);
		thread.setName(threadName);
		thread.start();
	}
	
	@Override
	public void run()
	{
		instance.test();
	}
}

public class Program 
{

	public static void main(String[] args) 
	{
		CThread Th1 = new CThread("Th1");
		CThread Th2 = new CThread("Th2");
		CThread Th3 = new CThread("Th3");
		CThread Th4 = new CThread("Th4");
		
	}

}
