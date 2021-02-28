public class HeapSort implements ITask{
    @Override
    public boolean run(TestData testData) {
        long startTime = System.currentTimeMillis();
        Sort.heapSort(testData.getInputArray());
        System.out.println("HEAP SORT Array Size: " + testData.getSize() + " Time: " + (System.currentTimeMillis() - startTime)/1000 + " millis");
        for (int i = 0; i < testData.getSize(); i++) {
            if (testData.getInputArray()[i] != testData.getOutputArray()[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "HeapSort";
    }
}
