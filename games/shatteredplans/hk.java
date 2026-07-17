/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends il {
    static int[] field_ob;
    static gh field_nb;
    static String field_pb;

    final void b(vg param0, int param1) {
        try {
            int var3_int = 113 / ((51 - param1) / 57);
            super.b(param0, 125);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hk.AB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void p(int param0) {
        field_nb = null;
        if (param0 != 20) {
            return;
        }
        field_ob = null;
        field_pb = null;
    }

    hk(tc param0, vg param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, byte param1) {
        vg.field_i = 1000000000L / (long)param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = new int[8192];
        field_pb = "Show all game chat";
    }
}
