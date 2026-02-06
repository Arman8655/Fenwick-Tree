public class FenwickTest {
    public static void main(String[] args) {

        System.out.println("1D Fenwick Tree Tests");

        int[] arr = {1, 2, 3, 4, 5};
        FenwickTreeOptimal ft1D = new FenwickTreeOptimal(arr);
        RangeSumQuery rsq = new RangeSumQuery(ft1D);

        System.out.println("PrefixSum(0) = " + ft1D.prefixSum(0));
        System.out.println("PrefixSum(2) = " + ft1D.prefixSum(2));
        System.out.println("PrefixSum(4) = " + ft1D.prefixSum(4));

        System.out.println("RangeSum(1,3) = " + rsq.rangeSum(1, 3));
        System.out.println("RangeSum(0,4) = " + rsq.rangeSum(0, 4));

        System.out.println("Update index 2 by +5");
        ft1D.update(2, 5);

        System.out.println("PrefixSum(2) after update = " + ft1D.prefixSum(2));
        System.out.println("RangeSum(1,3) after update = " + rsq.rangeSum(1, 3));

        System.out.println("RangeSum(3,3) = " + rsq.rangeSum(3, 3));


        System.out.println("\n2D Fenwick Tree Tests");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        FenwickTree2D ft2D = new FenwickTree2D(3, 3);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                ft2D.update(i, j, matrix[i][j]);


        System.out.println("PrefixSum(0,0) = " + ft2D.prefixSum(0, 0));
        System.out.println("PrefixSum(1,1) = " + ft2D.prefixSum(1, 1));
        System.out.println("PrefixSum(2,2) = " + ft2D.prefixSum(2, 2));

        System.out.println("RangeSum((1,1),(2,2)) = "
                + ft2D.rangeSum(1, 1, 2, 2));

        System.out.println("RangeSum((0,1),(1,2)) = "
                + ft2D.rangeSum(0, 1, 1, 2));


        System.out.println("Update cell (1,1) by +5");
        ft2D.update(1, 1, 5);

        System.out.println("PrefixSum(1,1) after update = "
                + ft2D.prefixSum(1, 1));

        System.out.println("RangeSum((1,1),(2,2)) after update = "
                + ft2D.rangeSum(1, 1, 2, 2));

        System.out.println("\nAll Tests Finished Successfully");
    }
}