/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static oe field_a;
    static int[] field_c;
    static int field_b;
    static le field_d;

    final static void a(int param0) {
        int var1_int = 0;
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            ge.h(80, 0, 560, 480);
            for (var1_int = 0; var1_int < 16; var1_int++) {
                var2 = -pe.field_d[1 + var1_int].field_e[0] + pe.field_d[var1_int].field_e[0];
                var3 = -pe.field_d[1 + var1_int].field_e[1] + pe.field_d[var1_int].field_e[1];
                var4 = (int)(65535.0 * (be.field_b - Math.atan2((double)var3, (double)var2) - 1.5707963267948966) / 6.283185307179586);
                dj.field_a[0].a(dj.field_a[0].field_m << 3, 0, (int)pe.field_d[var1_int].field_e[0] << 4, (int)pe.field_d[var1_int].field_e[1] << 4, var4, 4096);
            }
            ge.h(0, 0, 640, 480);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ci.C(" + -2865 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6) {
        try {
            b.field_j[param4] = param5;
            fl.field_a[param4] = param1;
            tj.field_c[param4] = param2;
            i.field_r[param4] = param6;
            mc.field_b[param4] = param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ci.A(" + 30380 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    public static void b() {
        field_d = null;
        int var1 = 0;
        field_a = null;
        field_c = null;
    }

    final static boolean a() {
        return v.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_a = null;
    }
}
