package 策略模式;

public class MainTest {


    public static void main(String[] args) {

        AdvanceMemberStrategy advanceMemberStrategy = new AdvanceMemberStrategy();
        IntermediateMemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();
        PrimaryMemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy();

        Content content1 = new Content(advanceMemberStrategy);
        Content content2 = new Content(intermediateMemberStrategy);
        Content content3 = new Content(primaryMemberStrategy);


        System.out.println(content1.getPrice(10, 2));
        System.out.println(content2.getPrice(10, 2));
        System.out.println(content3.getPrice(10, 2));


    }
}
