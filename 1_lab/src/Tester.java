import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    private ITask task;
    private String path;

    public Tester(ITask task, String path) {
        this.task = task;
        this.path = path;
    }

    public void RunTests() {
        int testNum = 0;
        while (true) {
            String inFile = new String(path + "test."+testNum+".in");
            String outFile = new String(path + "test."+testNum+".out");
            if ( !(new File(inFile)).exists() || !(new File(outFile)).exists()) {
                break;
            }
            System.out.println("Test №" + testNum + ": " + RunTest(inFile, outFile));
            testNum++;
        }
    }

    private boolean RunTest(String inFile, String outFile) {
        ArrayList<String> listData = new ArrayList<>();
        String expectResult;
        try {
            Scanner scan = new Scanner(new File(inFile));
            while(scan.hasNextLine()){
                listData.add(scan.nextLine());
            }
            expectResult = Files.readString(Paths.get(outFile)).trim();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
        String result = task.Run(listData);
        return result.equals(expectResult);
    }


}