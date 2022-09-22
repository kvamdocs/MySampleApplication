public class Person {
 
    private String name;
    private int age;
    private String address;

    /*public Person() {
        System.out.println("Constructing object of Person...");
    }*/

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 100){
            System.out.println("Not possible bhai");
        }else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void personInfo() {
        System.out.println("Name is -"+name);
        System.out.println("Address is -"+address);
        System.out.println("Age is-"+age);
    }
}