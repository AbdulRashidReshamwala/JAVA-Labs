abstract class Animal {

    String food;
    String location;
    String image;
    int hunger;
    int boundry;
    public void sleep() {
        System.out.println("zz");
    }
    public void roam() {
        System.out.println("walk");
    }
    abstract void makenoise();
    abstract void eat();
}