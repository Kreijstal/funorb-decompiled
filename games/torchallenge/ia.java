/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends da {
    static int[][] field_p;
    static int field_q;
    int field_n;
    int field_r;
    static fe[][][] field_i;
    static String field_l;
    int field_s;
    int field_m;
    static int field_j;
    int field_o;
    ia field_k;

    public static void b(byte param0) {
        field_p = (int[][]) null;
        field_l = null;
        if (param0 != 79) {
            ia.b((byte) 52);
            field_i = (fe[][][]) null;
            return;
        }
        field_i = (fe[][][]) null;
    }

    ia(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param3;
        this.field_o = param2;
        this.field_s = param0;
        this.field_m = param4;
        this.field_r = param1;
    }

    static {
        field_i = new fe[8][9][3];
        field_p = new int[][]{new int[]{20, 3, 12, 13, 4, 31, 2, 14, 11}, new int[]{1, 12, 13, 31, 3, 7}, new int[]{15, 5}, new int[]{17, 6, 18}, new int[]{15, 5}, new int[]{2, 5}, new int[]{15, 16}, new int[]{-1}, new int[]{28, 29, 30}, new int[]{31, 5}, new int[]{22, 23, 24, 25, 26, 27}, new int[]{31, 20}, new int[]{19}, new int[]{32}, new int[]{33, 34, 35}, new int[]{36}};
    }
}
