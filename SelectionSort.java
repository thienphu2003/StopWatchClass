import java.util.Scanner;
public class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {


            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;


            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng :");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập phần tử thứ "+(i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("Mảng ban đầu:");
        ob.printArray(array);
        StopWatch sw=new StopWatch();
        System.out.println("Thời gian hiện tại của hệ thống là : "+sw.getStartTime());
        sw.start();
        System.out.println("Thời gian bắt đầu thực hiện SelectionSort là : "+ sw.getStartTime());
        ob.sort(array);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(array);
        sw.end();
        System.out.println("Thời gian kết thúc thực hiện SelectionSort là :" +sw.getEndTime());
        System.out.println("Thời gian đã trôi qua là : " +sw.getTimeElapsed());
    }
}