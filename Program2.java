package lab5;

import java.util.Random;

class RandomThread implements Runnable
{
	int s;
	public RandomThread(int s)
	{
		this.s=s;
	}
	public void run()
	{
		sum();
	}
	public void sum()
	{
		Random r=new Random();
		int n=r.nextInt(10)+1;
		System.out.println("random number is"+n);
		synchronized(this){
			s=s+n;
		}
	}
}
public class Program2 {
	public static void main(String[] args) {
		int count=0;
		RandomThread rt=new RandomThread(count);
		
		Thread t1=new Thread(rt);
		Thread t2=new Thread(rt);
		Thread t3=new Thread(rt);
		Thread t4=new Thread(rt);
		Thread t5=new Thread(rt);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("total:"+rt.s);
		
	}
}
