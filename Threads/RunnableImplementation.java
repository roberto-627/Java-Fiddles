class MyThread implements Runnable{
    String threadName;

    MyThread(String name){
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is starting...");
        
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + " count is " + i);
            }
        } catch(InterruptedException exc) {
            System.out.println(threadName + " was interrupted.");    
        }
        System.out.println(threadName + " was terminated.");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread is starting.");

        MyThread MT = new MyThread("Child 1.");

        Thread NewThread = new Thread(MT);

        NewThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println( "Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}