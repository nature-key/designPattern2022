package 建造者模式;

public class Diretor {

    public static void main(String[] args) {
        PersonBulider personBulider = new PersonBulider();

        Person person = personBulider.name("jiepi").age("3").bulid();

        System.out.println(person.toString());
    }
}
