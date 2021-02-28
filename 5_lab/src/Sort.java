public class Sort {

    public static void bubbleSort(int[] array) {
        int tmp = 0;
        boolean exchangeFlag;
        for (int barrier = array.length - 1; barrier > 0; barrier--) {
            exchangeFlag = false;
            for (int index = 0; index < barrier; index++) {
                if (array[index] > array[index + 1]) {
                    swap(array, index, index + 1, tmp);
                    exchangeFlag = true;
                }
            }
            if (!exchangeFlag) {
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
        int tmp = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length - 1; i++) {
            indexMin = i;
            for (int index = i + 1; index < array.length; index++) {
                if (array[index] < array[indexMin]) {
                    indexMin = index;
                }
            }
            if (indexMin != i) {
                swap(array, i, indexMin, tmp);
            }
        }
    }
    
    public static void insertionSort(int[] array) {
        int tmp;
        int indexMin;
        for (int i = 1; i < array.length; i++) {
            indexMin = i;
            for (int j = i; j > 0 && (array[i] < array[j - 1]); j--) {
                indexMin = j - 1;
            }
            if (indexMin != i) {
                tmp = array[i];
                for (int k = i - 1; k >= indexMin; k--) {
                    array[k + 1] = array[k];
                }
                array[indexMin] = tmp;
            }
        }
    }

    public static void shellSort(int[] array) {
        int j = 0;
        int tmp = 0;
        for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
            for (int i = 0; i + gap < array.length; i++) {
                j = i + gap;
                tmp = array[j];
                while ((j - gap >= 0) && (array[j - gap] > tmp)) {
                    array[j] = array[j - gap];
                    j = j - gap;
                }
                array[j] = tmp;
            }
        }
    }

    public static void heapSort(int[] array) {
        int tmp = 0;
        for (int rootIndex = (array.length - 2) / 2; rootIndex > 0; rootIndex--) {
            sortElementsInHeap(array, rootIndex, array.length);
        }
        for (int rootIndex = array.length - 1; rootIndex > 0; rootIndex--) {
            swap(array, 0, rootIndex, tmp);
            sortElementsInHeap(array, 0, rootIndex);
        }
    }

    private static void sortElementsInHeap(int[] array, int root, int size) {
        int tmp = 0;
        int rootIndex = root;
        int leftIndex = 2 * rootIndex + 1;
        int rightIndex = leftIndex + 1;
        if (leftIndex < size && array[leftIndex] > array[rootIndex]) {
            rootIndex = leftIndex;
        }
        if (rightIndex < size && array[rightIndex] > array[rootIndex]) {
            rootIndex = rightIndex;
        }
        if (rootIndex == root) {
            return;
        }
        swap(array, rootIndex, root, tmp);
        sortElementsInHeap(array, rootIndex, size);
    }

    private static void swap(int[] array, int index1, int index2, int tmp) {
        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}
