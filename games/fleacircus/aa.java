/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aa extends e {
    static va field_r;
    static String field_s;
    static boolean field_q;
    static int field_t;

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        try {
            if (param0 >= -36) {
                field_s = null;
            }
            if (!(!param2)) {
                pj.a((byte) 127, param3.field_u, param3.field_z + param4, param3.field_y + param1, param3.field_j);
            }
            super.a(-59, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "aa.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    aa(fa param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    aa(int param0) {
        this(ug.field_e, param0);
    }

    final static void c(byte param0) {
        dd var1 = null;
        dd var2 = null;
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        try {
            var1 = new dd(540, 140);
            r.a(var1, 45);
            bl.b();
            gb.c();
            vg.field_z = 0;
            mj.a(-515966495);
            var2 = var1.c();
            for (var3 = 0; var3 < 15; var3++) {
                var2.b(-2, -2, 16777215);
                gb.h(4, 4, 0, 0, 540, 140);
            }
            uc.field_d.f();
            var1.e(0, 0);
            ia.a(-106);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "aa.L(" + -65 + 41);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = null;
        field_t = -1;
    }
}
