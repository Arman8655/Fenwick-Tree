class RangeSumQuery {
    private FenwickTreeBase fenwick;

    public RangeSumQuery(FenwickTreeBase fenwick) {
        this.fenwick = fenwick;
    }

    public void update(int index, int val) {
        fenwick.update(index, val);
    }

    public int rangeSum(int l, int r) {
        if (l == 0) {
            return fenwick.prefixSum(r);
        }
        else {
            return fenwick.prefixSum(r) - fenwick.prefixSum(l - 1);
        }
    }
}