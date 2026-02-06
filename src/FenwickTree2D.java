class FenwickTree2D {
    private int[][] tree;
    private int n, m;

    public FenwickTree2D(int n, int m) {
        this.n = n;
        this.m = m;
        tree = new int[n + 1][m + 1];
    }

    public void update(int x, int y, int val) {
        x += 1;
        int y1;
        while (x <= n) {
            y1 = y + 1;
            while (y1 <= m) {
                tree[x][y1] += val;
                y1 += y1 & -y1;
            }
            x += x & -x;
        }
    }

    public int prefixSum(int x, int y) {
        x += 1;
        int result = 0;
        int y1;
        while (x > 0) {
            y1 = y + 1;
            while (y1 > 0) {
                result += tree[x][y1];
                y1 -= y1 & -y1;
            }
            x -= x & -x;
        }
        return result;
    }

    public int rangeSum(int x1, int y1, int x2, int y2) {
        return prefixSum(x2, y2)
                - prefixSum(x1 - 1, y2)
                - prefixSum(x2, y1 - 1)
                + prefixSum(x1 - 1, y1 - 1);
    }
}