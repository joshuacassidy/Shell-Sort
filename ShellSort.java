public class ShellSort<T extends Comparable<T>> {

    public T[] sort(T[] arr) {
        for(int gap = arr.length; gap > 0; gap/=2) {
            System.out.println(gap);
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j >= gap && (arr[j-gap].compareTo(arr[j]) > 0)) {
                    T temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j-gap] = temp;
                    j-=gap;
                }
            }
        }
        return arr;
    }

    public T[] recursiveSort(T[] arr,int gap) {
        if (gap > 0) {
            arr = recursiveSort2(arr,gap,gap);
            return recursiveSort(arr, gap/2);
        }
        return arr;
    }

    public T[] recursiveSort2(T[] arr,int gap, int i) {
        if (i < arr.length) {
            arr = recursiveSort3(arr,gap,i);
            return recursiveSort2(arr, gap, i+1);
        }
        return arr;
    }

    public T[] recursiveSort3(T[] arr,int gap, int j) {
        if (j >= gap && (arr[j-gap].compareTo(arr[j]) > 0)) {
            T temp = arr[j];
            arr[j] = arr[j - gap];
            arr[j-gap] = temp;
            return recursiveSort3(arr, gap , j-gap);
        }
        return arr;
    }

    public void traverse(T [] arr) {
        for (T i: arr) {
            System.out.printf("%s ",i);
        }
    }

}
