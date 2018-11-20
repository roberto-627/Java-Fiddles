import java.io.*;

class RAF {
    public static void main(String[] args) {
        double data[] = {18.2, 32.7, 36.98, 67.09, 78.9};
        double d;

        try(RandomAccessFile RAF1 = new RandomAccessFile("Test.dat", "rw")){
            for (int i = 0; i < data.length; i++) {
                RAF1.writeDouble(data[i]);
            }

            for (int i = 0; i < (data.length * 8); i += 8) {
                RAF1.seek(i);
                d = RAF1.readDouble();
                System.out.println("Data [" + i + "] : " + d);
            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}