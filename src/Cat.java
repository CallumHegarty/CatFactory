public class Cat{

    //variable declarations
    public String breed;
    public boolean claws;
    public int age;

    //constructor method
    public Cat(String pBreed, boolean pClaws, int pAge){
        breed = pBreed;
        claws = pClaws;
        age = pAge;

    }

    //printInfo method
    public void printInfo(){
        System.out.println("This is a "+breed+" cat");
        if(claws == true){
            System.out.println("The cat has claws");
        }
        if(claws == false){
            System.out.println("The cat is declawed");
        }
        System.out.println("The cat is "+age+" years old");
    }

}
