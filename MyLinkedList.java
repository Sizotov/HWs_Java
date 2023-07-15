public class MyLinkedList {
    String[] arr = new String[10];
    int size;

    int size() {
        return size;
    }
    void enqueue(String item) {
        if (size >= arr.length) ;{
            String[] arr2 = new String[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++]= item;
    }

    String dequeue() {
        size--;
        return arr[size];
    }

    String first() {
        return arr[size - 1];
    }
}







