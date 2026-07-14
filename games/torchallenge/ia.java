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
        field_p = null;
        field_l = null;
        if (param0 != 79) {
            ia.b((byte) 52);
            field_i = null;
            return;
        }
        field_i = null;
    }

    ia(int param0, int param1, int param2, int param3, int param4) {
        ((ia) this).field_n = param3;
        ((ia) this).field_o = param2;
        ((ia) this).field_s = param0;
        ((ia) this).field_m = param4;
        ((ia) this).field_r = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new fe[8][9][3];
        field_p = new int[][]{new int[9], new int[6], new int[2], new int[3], new int[2], new int[2], new int[2], new int[1], new int[3], new int[2], new int[6], new int[2], new int[1], new int[1], new int[3], new int[1]};
    }
}
