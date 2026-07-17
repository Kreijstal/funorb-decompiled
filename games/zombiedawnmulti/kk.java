/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk extends qa {
    int field_t;
    static boolean field_u;
    static ja field_r;
    static int field_x;
    static String[] field_v;
    static h field_w;
    static int field_q;
    static go field_y;
    static String field_s;

    final static void a(int param0, boolean param1, int param2, byte param3, java.awt.Component param4, go param5, int param6, gd param7) {
        try {
            gp.a(22050, true, 10);
            rm.field_b = gp.a(param5, param4, 0, 22050);
            ga.field_u = gp.a(param5, param4, 1, 1024);
            bh.field_a = new vp();
            lq.field_d = 46;
            ga.field_u.a((gq) (Object) bh.field_a);
            wd.field_L = param7;
            wd.field_L.a(uk.field_S, (byte) 116);
            int var8_int = 37;
            rm.field_b.a((gq) (Object) wd.field_L);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "kk.M(" + 22050 + 44 + 1 + 44 + 22050 + 44 + 119 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + 1024 + 44 + (param7 != null ? "{...}" : "null") + 41);
        }
    }

    abstract boolean f(int param0);

    kk(int param0) {
        ((kk) this).field_t = param0;
    }

    public static void b() {
        field_v = null;
        field_r = null;
        field_y = null;
        field_w = null;
        field_s = null;
    }

    abstract Object e(int param0);

    final static void a(int param0, int param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param2);
        var3.a(109, 3);
        var3.a(-59, 10);
        var3.a(param1, (byte) -110);
        int var4 = -18 / ((-55 - param0) / 40);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = false;
        field_r = new ja(270, 70);
        field_v = new String[255];
    }
}
