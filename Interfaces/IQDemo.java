class FixedQueue implements ICharQ {
    private char queue[];
    private int putloc, getloc;

    public FixedQueue(int size){
        queue = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if(putloc == queue.length){
            System.out.println("Queue is full.");
            return;
        }

        queue[putloc ++] = ch;
    }

    public char get(){
        if(getloc == putloc) {
            System.out.println("Queue is empty.");
            return (char) 0;
        }

        return queue[getloc ++];
    }
}

class CircularQueue implements ICharQ {
    private char queue[];
    private int putloc, getloc;

    public CircularQueue (int size) {
        queue = new char[size +1];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if(((putloc + 1) == getloc) | (putloc == queue.length - 1) & (getloc == 0)){
            System.out.println("Queue is full.");
        }

        queue[putloc ++] = ch;

        if(putloc == queue.length){
            putloc = 0;
        }
    }

    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty.");
            return (char) 0;
        }

        char ch = queue[getloc ++];

        if(getloc == queue.length) {
            getloc = 0;
        }
        
        return ch;
        
    }
}

class DynamicQueue implements ICharQ {
    private char queue[];
    private int putloc, getloc;

    public DynamicQueue (int size){
        queue = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if(putloc == queue.length){
            char temp[] = new char[queue.length * 2];

            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[i];
            }

            queue = temp;
        }

        queue[putloc ++] = ch;
    }

    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty.");
            return (char) 0;
        }

        return queue[getloc ++];
    }

}

class IQDemo {
    public static void main(String[] args) {
        FixedQueue Q1 = new FixedQueue(10);
        CircularQueue Q2 = new CircularQueue(10);
        DynamicQueue Q3 = new DynamicQueue(10);

        ICharQ IQ;

        char ch;

        //Fixed Queue.
        IQ = Q1;
        
        for (int i = 0; i < 10; i++) {
            IQ.put((char) ('A' + i));
        }

        System.out.print("Contents of Fixed Queue: ");
        for (int i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();

        //Circular Queue.
        IQ = Q2;

        for (int i = 0; i < 10; i++) {
            IQ.put((char) ('A' + i));
        }

        System.out.print("Contents of Circular Queue: ");
        for (int i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();

        for (int i = 10; i < 20; i++) {
            IQ.put((char) ('A' + i));
        }

        System.out.print("New contents of Circular Queue: ");
        for (int i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Store and consume from Circular Queue.");
        for (int i = 0; i < 20; i++) {
            IQ.put((char) ('A' + i));
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();

        //Dynamic Queue.
        IQ = Q3;
        
        for (int i = 0; i < 10; i++) {
            IQ.put((char) ('A' + i));
        }

        System.out.print("Contents of Dynamic Queue: ");
        for (int i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();


    }
}