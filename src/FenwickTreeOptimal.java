class FenwickTreeOptimal extends FenwickTreeBase {
    public FenwickTreeOptimal(int[] arr) {
        super(arr.length);
        for (int i = 0; i < n; i++) {
            tree[i + 1] = arr[i];
        }
        for (int i = 1; i <= n; i++) {
            int parent = i + (i & -i);
            if (parent <= n) {
                tree[parent] += tree[i];
            }
        }
    }
}