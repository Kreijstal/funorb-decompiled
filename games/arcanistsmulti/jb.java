/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb extends tf {
    int field_w;
    static le field_z;
    static int field_t;
    static boolean field_p;
    static String field_r;
    int field_o;
    static java.awt.Font field_m;
    static int field_v;
    static String[] field_u;
    int field_q;
    int field_n;
    int field_x;
    int field_y;
    static int[] field_s;

    final static void a(wk param0, int param1, int param2, int param3, int param4) {
        param0.f(12, (byte) -120);
        param0.c(17, (byte) -59);
        int var5 = 76 % ((-70 - param4) / 32);
        param0.c(param1, (byte) -119);
        param0.c(param3, (byte) -88);
        param0.f(param2, (byte) -97);
    }

    public static void c(int param0) {
        int var1 = 95 / ((53 - param0) / 55);
        field_z = null;
        field_u = null;
        field_m = null;
        field_s = null;
        field_r = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 116 / ((81 - param2) / 39);
        int var6 = ((jb) this).field_n << 1634213347;
        param3 = (var6 & 15) + (param3 << -589035420);
        int var7 = ((jb) this).field_w << 121130179;
        param1 = (var7 & 15) + (param1 << 1819411940);
        ((jb) this).a(var6, var7, param3, param1, param4, param0);
    }

    jb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Macroing or use of bots";
        field_p = false;
        field_s = new int[128];
    }
}
