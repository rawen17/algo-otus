public class SelectionSort implements ITask{
    @Override
    public boolean run(TestData testData) {
        long startTime = System.currentTimeMillis();
        Sort.selectionSort(testData.getInputArray());
        System.out.println("SELECTION SORT Array Size: " + testData.getSize() + " Time: " + (System.currentTimeMillis() - startTime) + "millis");
        for (int i = 0; i < testData.getSize(); i++) {
            if (testData.getInputArray()[i] != testData.getOutputArray()[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "SelectionSort";
    }
}
