
import java.util.Arrays;

public class DynamicArray<T> {

    private static Object[] array = new Object[10];
    private static int load = array.length;
    private static int size = 0;

    public DynamicArray(){}

    public void add(T el) {
        array[size] = el;
        size++;
    }

    public void remove(int index) {
        int count = 0;
        array = Arrays.copyOf(array, (int) (load * 1.5));
        Object[] half = Arrays.copyOfRange(array, 0,index);
        Object[] secondHalf = Arrays.copyOfRange(array, index+1, array.length);
        Object[] result = new Object[array.length];
        for(int i = 0; i < half.length; i++) {
            result[i] = half[i];
            count++;
        }
        for(int j = 0; j < secondHalf.length; j++) {
            result[count] = secondHalf[j];
            count++;
        }
        size--;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int size() {
        return size;
    }
}
