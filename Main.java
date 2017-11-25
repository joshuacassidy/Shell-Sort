public class Main {
    public static void main(String[] args) {
        ShellSort<Integer> shellSort = new ShellSort();
        shellSort.traverse(shellSort.recursiveSort(new Integer[] {3,2,5,67,464,2,75,7,567,5},10));
    }
}
