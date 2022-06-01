public class Animal {
    String name;
    public void eat(){
        System.out.println("Saya bisa makan");
    }
}

class Dog extends Animal{

    public void display(){
        System.out.println("Nama saya adalah " + name);
    }
}

class Main{
    public static void main(String[] args) {

        Dog labrador = new Dog();

        labrador.name = "Dokky";
        labrador.display();

        labrador.eat();
    }
}
