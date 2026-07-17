/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends nr {
    private int[] field_g;
    private int field_i;
    private int field_l;
    static String field_k;
    private boolean field_j;
    static boolean[] field_n;
    static int field_m;
    static int field_h;

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        fe.a(param2, param4, param3, param1, ((pn) this).field_b, ((pn) this).field_g, ((pn) this).field_i, ((pn) this).field_l, ((pn) this).field_j);
        if (param0 != -111) {
            ((pn) this).field_l = -40;
        }
    }

    pn(wk[] param0, int[] param1, int param2, int param3, boolean param4) {
        super(param0);
        try {
            ((pn) this).field_j = param4 ? true : false;
            ((pn) this).field_g = param1;
            ((pn) this).field_l = param3;
            ((pn) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Replay Mission";
        field_n = new boolean[]{false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true};
        field_h = 0;
    }
}
