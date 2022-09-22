public class HelloWorld {
 
    public static void main(String[] args) {

        Person p = new Person("Pooja", 28, "Kolkata");
        //p.name = "Bhavesh";
        //p.address = "Gurgaon";
        //p.age = 32;

        //p.setName("Bhavesh");
        //p.setAge(134);
        //p.setAddress("Gurgaon");
        p.personInfo();

        Person p2 = new Person("Rohit", 35, "Pune");
        //p2.setName("Harish");
        //p2.setAge(23);
        //p2.setAddress("Mumbai");
        //p2.name = "Harish";
        //p2.age = 20;
        //p2.address = "Mumbai";

        p2.personInfo();

    }
}