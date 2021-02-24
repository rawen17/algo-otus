public class Program {

    public static void main(String[] args) {
        System.out.println("String");
        Tester testerString = new Tester(new StringLength(), "./0.String/");
        testerString.RunTests();

        System.out.println("\nTickets");
        Tester testerTickets = new Tester(new Tickets(), "./1.Tickets/");
        testerTickets.RunTests();

        System.out.println("\nRectangle");
        Rectangle rect = new Rectangle();
        rect.Paint1();
        rect.Paint2();
        rect.Paint3();
        rect.Paint4();
        rect.Paint5();
        rect.Paint6();
        rect.Paint7();
        rect.Paint8();
        rect.Paint9();

    }

}
