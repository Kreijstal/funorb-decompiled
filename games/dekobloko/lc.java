/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc {
    static String[][] field_e;
    int field_a;
    int field_g;
    static volatile int field_f;
    int field_b;
    int field_i;
    int field_d;
    static long field_j;
    int field_c;
    static ji field_h;

    abstract void a(int param0, int param1);

    final static rf b(int param0, int param1, int param2) {
        rf var3 = new rf(param0);
        var3.field_c = new byte[2];
        var3.field_b = 2;
        var3.field_n = 1;
        var3.field_c[param1] = (byte)((lb.a(8, param2) != 0 ? 24 : 16) + lb.a(param2, 7));
        param2 = param2 >> 4;
        var3.field_c[1] = (byte)(lb.a(7, param2) + (lb.a(8, param2) == 0 ? 16 : 24));
        return var3;
    }

    final static void a(int param0, boolean param1) {
        if (!param1) {
            return;
        }
        ef.field_U = sg.field_j[param0];
        fe.field_a = mn.field_d[param0];
        eb.field_n = qc.field_C[param0];
    }

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_h = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
    }
}
