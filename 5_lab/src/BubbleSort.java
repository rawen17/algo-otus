import java.awt.*;

public class BubbleSort implements ITask{
    @Override
    public boolean run(TestData testData) {
        long startTime = System.currentTimeMillis();
        Sort.bubbleSort(testData.getInputArray());
        System.out.println("BUBBLE SORT Array Size: " + testData.getSize() + " Time: " + (System.currentTimeMillis() - startTime)/1000 + " millis");
        for (int i = 0; i < testData.getSize(); i++) {
            if (testData.getInputArray()[i] != testData.getOutputArray()[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }
}
