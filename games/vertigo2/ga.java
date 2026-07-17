/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends rl {
    static int[] field_jb;
    static int field_fb;
    static String field_ib;
    static int field_gb;
    static int[] field_hb;

    ga(sd param0, iq param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
            oj.field_O[param1] = param0;
            if (param2 <= 40) {
                Object var4 = null;
                ga.a((int[]) null, -31, 97);
            }
            fh.field_y[param1] = new fo(param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ga.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void m() {
        field_ib = null;
        field_jb = null;
        field_hb = null;
    }

    final void a(boolean param0, iq param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ga.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = 12;
        field_ib = "Waiting for models";
        field_gb = 50;
    }
}
