package Dogs;

public class App {
    public static void main(String[] args) throws Exception {

        
        Corgi myPet = new Corgi();

        myPet.bark();
        System.out.println(myPet.name);
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
        System.out.println("and I'm Kole's pet!");

       
    }
}