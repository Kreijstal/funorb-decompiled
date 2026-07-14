/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf {
    static kg field_c;
    static boolean field_g;
    static volatile int field_f;
    static boolean field_e;
    static String field_d;
    static int[] field_a;
    static String field_b;

    abstract void a(byte param0, byte[] param1);

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    abstract byte[] a(int param0);

    final static boolean a(int param0, String param1, boolean param2, ke param3, String param4, String param5, int param6) {
        if (!(ml.field_a == oe.field_Q)) {
            return false;
        }
        if (param0 != 30692) {
            return true;
        }
        v var8 = new v(vg.field_Z, param3);
        vg.field_Z.c((fj) (Object) var8, 0);
        if (mf.c(109)) {
            var8.o(param0 + -30583);
        } else {
            hd.field_d = param2;
            ji.field_d = null;
            oe.field_Q = wh.field_fb;
            wc.field_Ob = param6;
            kc.field_n = param4;
            rd.field_Jb = param1;
            jb.field_o = param5;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_c = new kg(256);
        field_a = new int[8192];
        field_d = "Loading fonts";
        field_b = "You already have the charge cannon";
    }
}
