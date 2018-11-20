class TickTock {
    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "tick";
            notify();
            return;
        }

        System.out.println("Tick.");

        state = "tick";

        notify();
        try {
            while(!state.equals("tock")){
                wait();
            }
        } catch (InterruptedException e) {
            System.out.print("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tock";
            notify();
            return;
        }

        System.out.println("Tock.");

        state = "tock";

        notify();
        try {
            while(!state.equals("tick")){
                wait();
            }
        } catch (InterruptedException e) {
            System.out.print("Thread interrupted.");
        }
    }
}

class Clock implements Runnable {
    Thread thread;
    TickTock TT;

    Clock(String name, TickTock tt){
        thread = new Thread(this, name);
        TT = tt;
        thread.start();
    }

    @Override
    public void run() {
        if(thread.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) {
                TT.tick(true);
                TT.tick(false);
            }
        }else{
            for (int i = 0; i < 5; i++) {
                TT.tock(true);
                TT.tock(false);
            }
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        Clock c1 = new Clock("Tick", tt);        
        Clock c2 = new Clock("Tock", tt);

        try {
            c1.thread.join();
            c2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}