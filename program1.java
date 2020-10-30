package lab5;
class Multithread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++)
		{
			System.out.println("thread name"+Thread.currentThread().getName()+ "number"+i);
		}
	}
 
}
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithread multi=new Multithread();
		Thread t1=new Thread(multi,"thread1");
		Thread t2=new Thread(multi,"thread2");
		Thread t3=new Thread(multi,"thread3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
