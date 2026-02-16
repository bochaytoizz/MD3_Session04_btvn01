import java.util.Scanner;

public class btvn01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập số lượng phần tử
        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        // nhập mảng
        System.out.println("Nhập các phần tử ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // selection giảm dần
        for (int i = 0; i < n - 1; i++){
            int maxIndex = i; // giả sử phần tử đầu tiên là lớn nhất
            for (int j = i+1; j < n; j++){
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j ; // cập nhật vị trí có phần tử lớn nhất
                }
            }

            // Hoán đổi
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;

        }

        // sau khi sắp xếp, phần tử đầu tiên là lớn nhất
         System.out.println("Mảng sau khi đã được sắp xếp theo thứ tự giảm dần:");
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println("Phần tử lớn nhất là: " + arr[0]);
        sc.close();
    }
}

