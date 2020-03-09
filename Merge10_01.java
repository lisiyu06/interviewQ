import java.util.Arrays;

/**
 * Author: lisiyu
 * Created: 2020/3/9
 */

// 面试题 10.01 ----- 合并排序的数组
    // 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。
    // 编写一个方法，将 B 合并入 A 并排序。
    // 初始化 A 和 B 的元素数量分别为 m 和 n。

public class Merge10_01 {

    // 1. 合并后排序
    public void merge1(int[] A, int m, int[] B, int n) {
        System.arraycopy(B, 0, A, m, n);
        Arrays.sort(A);
    }

    // 2. 双指针，从前往后
    public void merge2(int[] A, int m, int[] B, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n -1;
        while (p1 >= 0 && p2 >= 0) {
            A[p--] = (A[p1] > B[p2]) ? A[p1--] : B[p2--];
        }
        System.arraycopy(B, 0, A, 0, p2+1);
    }
}
