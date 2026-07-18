/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ug {
    bl field_e;
    static ch[] field_o;
    int field_n;
    int field_i;
    int field_j;
    static int field_m;
    static byte[][] field_k;
    static int field_f;
    static lg field_g;
    int field_l;
    int field_h;

    public static void a() {
        field_k = null;
        field_o = null;
        field_g = null;
    }

    final static void a(int param0, lg param1) {
        try {
            ve.a(82, 0, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "bl.B(" + 50 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bl(int param0, int param1, int param2, int param3, int param4) {
        ((bl) this).field_n = param2;
        ((bl) this).field_h = param0;
        ((bl) this).field_j = param4;
        ((bl) this).field_l = param1;
        ((bl) this).field_i = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new byte[50][];
    }
}
