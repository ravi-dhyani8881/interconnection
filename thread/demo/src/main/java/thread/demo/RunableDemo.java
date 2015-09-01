package thread.demo;

public class RunableDemo implements Runnable{

	private Thread t;
	private String threadName;
  
	RunableDemo(String name) {
		threadName = name;
	       System.out.println("Constructor :Creating " +  threadName );
	}
	
	public void run() {
		System.out.println("Run() Method: Running " +  threadName );
		try{
			for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	
	public void start(){
		System.out.println("Start() Method:Starting " +  threadName );
		if(t==null){
			t=new Thread(this , threadName);
			t.start();
		}
		
	}
	
	public static void main(String[] args) {
		// System.out.println("Hello World I am Ravi");
		RunableDemo R1 = new 	RunableDemo( "Thread-1");
	      R1.start();
	      
	 	RunableDemo R2 = new 	RunableDemo( "Thread-2");
	      R2.start();
	
	}

}
