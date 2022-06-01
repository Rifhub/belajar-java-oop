public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.name = "Rifky";
        person1.address ="Bekasi";
        //Person1.country tidak bisa diubah karena di set di final.

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");


        Person person2 = new Person();
        Person person3;
        person3 = new Person();
        person3.name = "Joni";
        person3.sayHello("Budi");


    }
}
