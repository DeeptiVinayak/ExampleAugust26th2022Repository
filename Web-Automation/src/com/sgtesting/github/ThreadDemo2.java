package com.sgtesting.github;

class MyThread1 implements Runnable
{
	public void run()
	{
		displayEvenNumber();
	}
	void displayEvenNumber()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"DisplayEven Number:"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread1 job=new MyThread1();

		Thread t1=new Thread(job);
		Thread t2=new Thread(job);

		t1.setName("alpha");
		t2.setName("omega");

		t1.start();
		t2.start();


	}

}
