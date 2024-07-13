class Person{
    String name;
    double weight;
    int age;
    void outPut(){
        System.out.println(name + ": weight +"+"age = "+ age);
    }
}
public class PersonDemo {
    public static void main(String args[]){

        Person a = new Person();
        a.name = "yamada kota";
        a.weight = 62;
        a.age = 18;
        a.outPut();   
    }
}