public class Program {

    public static void main(String[] args) {

        Tester tester = new Tester();
        ITask[] listSort = {new BubbleSort(), new SelectionSort(), new InsertionSort(), new HeapSort()};

        for (ITask task: listSort) {
            tester.setTask(task);
            System.out.println(task.toString() + " test random");
            tester.setPath("./sorting-tests/0.random");
            tester.runTests();
            System.out.println(task.toString() + " test digits");
            tester.setPath("./sorting-tests/1.digits");
            tester.runTests();
            System.out.println(task.toString() + " test sorted");
            tester.setPath("./sorting-tests/2.sorted");
            tester.runTests();
            System.out.println(task.toString() + " test revers");
            tester.setPath("./sorting-tests/3.revers");
            tester.runTests();
        }

    }



}
