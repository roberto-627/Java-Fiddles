import java.io.*;

class CompareFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if(args.length != 2){
            System.out.println("Usage: CompareFiles file1 file2");
            return;
        }

        try(FileInputStream F1 = new FileInputStream(args[0]); FileInputStream F2 = new FileInputStream(args[1])){
            do {
                i = F1.read();
                j = F2.read();

                if(i != j){
                    break;
                }
            } while (i != -1 && j != -1);

            if(i != j){
                System.out.println("Files differ.");
            }else{
                System.out.println("Files are the same.");
            }
        }catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}