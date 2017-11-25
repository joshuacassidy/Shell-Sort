public class ShellSort {

    public int[] sort(int[] arr) {
        for(int gap = arr.length; gap > 0; gap/=2) {
            System.out.println(gap);
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j >= gap && (arr[j-gap] > arr[j])) {
                    int temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j-gap] = temp;
                    j-=gap;
                }
            }
        }
        return arr;
    }

    public int[] recursiveSort(int[] arr,int gap) {
        if (gap > 0) {
            arr = recursiveSort2(arr,gap,gap);
            return recursiveSort(arr, gap/2);
        }
        return arr;
    }

    public int[] recursiveSort2(int[] arr,int gap, int i) {
        if (i < arr.length) {
            arr = recursiveSort3(arr,gap,i);
            return recursiveSort2(arr, gap, i+1);
        }
        return arr;
    }

    public int[] recursiveSort3(int[] arr,int gap, int j) {
        if (j >= gap && (arr[j-gap] > arr[j])) {
            int temp = arr[j];
            arr[j] = arr[j - gap];
            arr[j-gap] = temp;
            return recursiveSort3(arr, gap , j-gap);
        }
        return arr;
    }

    public void traverse(int [] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

}
