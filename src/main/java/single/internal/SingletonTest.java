package single.internal;

public class SingletonTest
{
    private SingletonTest(){}
    
    static class MyThread extends Thread {
        @Override
        public void run()
        {
            super.run();
            System.out.println("Thread running_" + Singleton.getInstance());
        }
    }
    
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();

        th1.start();
        th2.start();
        th3.start();


//        Singleton.display();

    }
}