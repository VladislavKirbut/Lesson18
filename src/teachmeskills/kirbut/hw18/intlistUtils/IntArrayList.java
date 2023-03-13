package teachmeskills.kirbut.hw18.intlistUtils;
import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arrayList;

    public IntArrayList() {
        arrayList = new int[0];
    }

    public IntArrayList(int[] arrayList) {
        this.arrayList = Arrays.copyOf(arrayList, arrayList.length);
    }

    public int[] getArrayList() {
        return Arrays.copyOf(arrayList, arrayList.length);
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= arrayList.length)
            throw new IllegalArgumentException("Array doesn't have this index.");

        return arrayList[index];
    }

    @Override
    public int set(int index, int element) {
        if (index < 0 || index >= arrayList.length)
            throw new IllegalArgumentException("Array doesn't have this index.");

        int previousValue = arrayList[index];
        arrayList[index] = element;

        return previousValue;
    }

    @Override
    public int size() {
        return arrayList.length;
    }

    @Override
    public void add(int element) {
        arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);

        arrayList[arrayList.length - 1] = element;
    }

    @Override
    public int remove(int index) {
        if (index < 0 || index >= arrayList.length)
            throw new IllegalArgumentException("Array doesn't have this index.");

        int deletedElement = arrayList[index];
        int[] newArrayList = new int[arrayList.length - 1];

        System.arraycopy(arrayList, 0, newArrayList, 0, index);
        System.arraycopy(arrayList, index + 1, newArrayList, index, newArrayList.length - index);
        arrayList = newArrayList;

        return deletedElement;
    }

    @Override
    public IntArrayList subList(int startIndexInclusive, int endIndexExclusive) {
        if (startIndexInclusive < 0 || endIndexExclusive > arrayList.length || startIndexInclusive > endIndexExclusive)
            throw new IllegalArgumentException("Enter correct parameters.");

        int[] newArr = Arrays.copyOfRange(arrayList, startIndexInclusive, endIndexExclusive);

        return new IntArrayList(newArr);
    }

    @Override
    public IntArrayList subList(int startIndexInclusive) {
        return subList(startIndexInclusive, arrayList.length);
    }

    @Override
    public int lastIndexOf(int element) {
        for (int i = arrayList.length - 1; i >= 0; i--)
            if (arrayList[i] == element)
                return i;

        return -1;
    }

    public void sort() {
        for (int i = 0; i < arrayList.length - 1; i++) {
            for (int j = 0; j < arrayList.length - 1 - i; j++) {
                if (arrayList[j] > arrayList[j + 1]) {
                    int t = arrayList[j];
                    arrayList[j] = arrayList[j + 1];
                    arrayList[j + 1] = t;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayList);
    }
}
