/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends lh {
    byte[] field_l;
    static ie field_i;
    static int field_k;
    static String field_j;

    final static void a(int param0, int param1, int param2, int param3) {
        gb.a(si.field_R);
        int var4 = param2;
        int var5 = param0;
        gb.a(var4, var5, 16 + var4, var5 - -16);
        se.field_a[param3].f(0, 0);
        gb.b(si.field_R);
    }

    oj(byte[] param0) {
        try {
            ((oj) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "oj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 < 49) {
            return;
        }
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 2;
        field_j = "Once you have saved enough fleas, a button will appear allowing you to go on to the next level. If you want to, you can stay on your current level and try to save more fleas for bonus points!";
    }
}
