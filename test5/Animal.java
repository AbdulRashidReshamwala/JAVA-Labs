/**
 * Animal
 */
public class Animal {

    String food;
    String image;
    int hunger;
    int boundry;
    String location;
    public void makeNoise() {
        System.out.println("beep beep");
    }
    public void eat() {
        System.out.println("tasty");
    }
    public void sleep() {
        System.out.println("zz");
    }
    public void roam() {
        System.out.println("walk");
    }
}