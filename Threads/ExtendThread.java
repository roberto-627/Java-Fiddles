class ExtendThread extends Thread {
    ExtendThread (String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminated.");
    }
}

class TestExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        ExtendThread ET1 = new ExtendThread("Child #1.");
        ExtendThread ET2 = new ExtendThread("Child #2.");
        ExtendThread ET3 = new ExtendThread("Child #3.");
        
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (ET1.isAlive() || ET2.isAlive() || ET3.isAlive());

        System.out.println("Main thread terminated.");
    }
}

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        ExtendThread ET1 = new ExtendThread("Child #1.");
        ExtendThread ET2 = new ExtendThread("Child #2.");
        ExtendThread ET3 = new ExtendThread("Child #3.");
        
        try {
            ET1.join();
            System.out.println(ET1.getName() + " joined.");
            ET2.join();
            System.out.println(ET2.getName() + " joined.");
            ET3.join();
            System.out.println(ET3.getName() + " joined.");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        };

        System.out.println("Main thread terminated.");
    }
}

