package thread;

public class Display {
	
	public void wish(String name)
	{
		;;;;;;;;;;; // 1 lakh lines of code
		
		synchronized (Display.class) {
			
			for(int i = 0; i < 10; i++)
			{
				System.out.print("Good Morning :");
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
		
		;;;;;;;;;; // 1 lakh lines of code
	}

}
