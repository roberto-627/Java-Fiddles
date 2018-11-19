import java.io.IOException;

class Help {
    public static void main(String[] args) 
        throws java.io.IOException {
            boolean run = true;

            while(run){
                System.out.println("Help on:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while");
                System.out.println("6. continue");
                System.out.println("7. break");
                System.out.println("8. Quit");
                System.out.println("Choose one: ");
                char choice = (char) System.in.read();
                char ignore = (char) System.in.read();

                switch(choice){
                    case '1':
                        System.out.println("The if:\n");
                        System.out.println("if (condition) {\n\tstatement\n} else {\n\tstatement\n}\n");
                        break;
                    case '2':
                        System.out.println("The switch:\n");
                        System.out.println("switch (expression) {");
                        System.out.println("\tcase constant:");
                        System.out.println("\t\tstatement sequence");
                        System.out.println("\t\tbreak;");
                        System.out.println("\t//...");
                        System.out.println("}\n");
                        break;
                    case '3':
                        System.out.println("The for:\n");
                        System.out.println("for (init; condition; iteration) {");
                        System.out.println("\tstatement");
                        System.out.println("}\n");
                        break;
                    case '4':
                        System.out.println("The while:\n");
                        System.out.println("while (condition) {");
                        System.out.println("\tstatement");
                        System.out.println("}\n");
                        break;
                    case '5':
                        System.out.println("The do-while:\n");
                        System.out.println("do {");
                        System.out.println("\t statement");
                        System.out.println("} while (condition)\n");
                        break;
                    case '6':
                        System.out.println("The continue:\n");
                        System.out.println("continue or continue label\n");
                        break;
                    case '7':
                    System.out.println("The break:\n");
                    System.out.println("break or break label\n");
                        break;
                    case '8':
                        run = false;
                        System.out.println();
                        break;
                    default:
                        System.out.println("Option not found.\n");
                }
            }

    }
}