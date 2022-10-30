public class RunCatProgram {
    public static void main(String[] args) {
        RunCatProgram runCat = new RunCatProgram();

    }

    public RunCatProgram(){
        Cat judy;
        judy = new Cat("siamese", true, 13);
        judy.printInfo();

        Cat barry;
        barry = new Cat("tabby", false, 5);
        barry.printInfo();
    }

}
