class FenwickTreeBase {
    protected int[] tree;
    protected int n;

    public FenwickTreeBase(int size) {
        this.n = size;
        this.tree = new int[n + 1];
    }

    public void update(int index, int val) {
        index += 1;
        while (index <= n) {
            tree[index] += val;
            index += index & -index;
        }
    }

    public int prefixSum(int index) {
        index += 1;
        int result = 0;
        while (index > 0) {
            result += tree[index];
            index -= index & -index;
        }
        return result;
    }
}
