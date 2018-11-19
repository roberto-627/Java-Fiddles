class Queue {
    private char queue[];
    private int putloc, getloc;

    Queue (int size) {
        queue = new char[size];
        putloc = getloc = 0;
    }

    Queue (Queue obj) {
        putloc = obj.putloc;
        getloc = obj.getloc;

        queue = new char[obj.queue.length];

        for (int i = getloc; i < putloc; i++) {
            queue[i] = obj.queue[i];
        }
    }

    Queue (char array[]) {
        putloc = 0;
        getloc = 0;

        queue = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            put(array[i]);
        }
    }

    void put(char ch){
        if(putloc == queue.length){
            System.out.println("Queue is full.");
            return;
        }

        System.out.println("Before: " + putloc);
        System.out.println("--: " + queue[0]);
        queue[putloc ++] = ch;
        System.out.println("++: " + queue[0]);
        System.out.println("After: " + putloc);
    }

    char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty.");
            return (char) 0;
        }

        return queue[getloc ++];
    }

    public static void main(String[] args) {
        Queue Test = new Queue(5);
        
        Test.put('a');
        System.out.println("Correr get: " + Test.get());
        System.out.println("Correr get: " + Test.get());

    }
}