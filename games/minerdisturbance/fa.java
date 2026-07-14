/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static boolean field_e;
    static boolean field_b;
    static bj field_d;
    static volatile boolean field_a;
    static String field_c;

    final static void c(int param0) {
        if (null != mb.field_b) {
            mb.field_b.a(true);
            if (!(null == bd.field_e)) {
                bd.field_e.r(4595);
            }
            tc.a(param0 ^ -9351);
            if (param0 == -9) {
                return;
            }
            field_c = null;
            return;
        }
        if (!(null == bd.field_e)) {
            bd.field_e.r(4595);
        }
        tc.a(param0 ^ -9351);
        if (param0 != -9) {
            field_c = null;
            return;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_c = null;
            return g.field_o;
        }
        return g.field_o;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 26686) {
            return;
        }
        field_d = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (null == di.field_x) {
            return;
        }
        int[] var4 = di.field_x;
        int[] var1 = var4;
        if (param0 != 15257) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            var4[var2] = 0;
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 < 44) {
            return true;
        }
        return nd.a(1, param0) != null ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_a = false;
        field_c = null;
    }
}
