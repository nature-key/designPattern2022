package 建造者模式;

public class PersonBulider implements Bulider {

    private Person person =new Person();

    public PersonBulider age(String age){
        person.setAge(age);
        return this;
    }

    public PersonBulider name(String name){
        person.setName(name);
        return this;
    }

    @Override
    public Person bulid() {
        return person;
    }
}
