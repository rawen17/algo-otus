import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        System.out.println("String");
        Tester testerString = new Tester(new StringLength(), "./0.String/");
        testerString.runTests();

        System.out.println("\nTickets");
        Tester testerTickets = new Tester(new Tickets(), "./1.Tickets/");
        testerTickets.runTests();

        System.out.println("\nRectangle");
        Rectangle rect = new Rectangle();
        rect.paint1();
        rect.paint2();
        rect.paint3();
        rect.paint4();
        rect.paint5();
        rect.paint6();
        rect.paint7();
        rect.paint8();
        rect.paint9();
    }

}
