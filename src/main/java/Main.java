import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(myCoach);

        CricketCoach secondCoach = context.getBean("secondCricketCoach", CricketCoach.class);
        System.out.println(secondCoach);
    }
}
