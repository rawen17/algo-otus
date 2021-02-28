import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Tester {
    private ITask task;
    private String path;

    public Tester(ITask task, String path) {
        this.task = task;
        this.path = path;
    }

    public Tester() {
        this(null, "");
    }

    public void setTask(ITask task) {
        this.task = task;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void runTests() {
        HashMap<String, File> files = getMapFilesFromFolder(new File(path));
        for (int testNum = 0; testNum < 7;testNum++) {
            if (files.containsKey("test."+testNum+".in") && files.containsKey("test."+testNum+".out")) {
                File inFile = files.get("test."+testNum+".in");
                File outFile = files.get("test."+testNum+".out");
                System.out.println("Test №" + testNum + ": " + runTest(inFile, outFile));
            } else {
                break;
            }
        }
    }

    private boolean runTest(File inFile, File outFile) {
        TestData testData = getListTestData(inFile, outFile);
        if (testData == null) {
            return false;
        }
        return task.run(testData);
    }

    private HashMap<String, File> getMapFilesFromFolder(File folder) {
        HashMap<String, File> files = new HashMap<>();
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                files.put(fileEntry.getName(), fileEntry);
            }
        }
        return files;
    }

    private TestData getListTestData(File inFile, File outFile) {
        TestData testData = new TestData();

        List<String> listData = new ArrayList<>();
        scanDataFromFile(inFile, listData);
        if (listData.size() != 2) {
            System.out.println("size of list data not 2");
            return null;
        }
        scanDataFromFile(outFile, listData);
        if (listData.size() != 3) {
            System.out.println("size of list data not 3");
            return null;
        }
        testData.setSize(Integer.parseInt(listData.get(0)));
        testData.setInputArray(getArrayFromString(listData.get(1)));
        testData.setOutputArray(getArrayFromString(listData.get(2)));
        return testData;
    }

    private int[] getArrayFromString(String str) {
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return numArr;
    }

    private void scanDataFromFile(File file, List<String> listData) {
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                listData.add(scan.nextLine());
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }





}
