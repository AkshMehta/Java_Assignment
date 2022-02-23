
class FetchData extends Thread{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(5000);  //Thread sleeps for 5 sec
            System.out.println("Data is being Fetched......" + Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

class ProcessData implements Runnable{
    public void run(){
        for(int i=1; i<=4; i++){
        try {
            Thread.sleep(1000); //Thread sleeps for 1 sec
            System.out.println("ProcessData thread is running...... "+ Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

}

public class Question3 {
    public static void main(String[] args) throws InterruptedException{
        FetchData fd = new FetchData(); //Fetch Data
        Thread t1 = new Thread(new ProcessData(), "Thread-1");

        fd.start();
        fd.join();
        t1.start();
        t1.join();
        
    }
}