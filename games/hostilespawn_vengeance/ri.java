/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends am {
    static String field_i;
    static bd field_p;
    static int field_h;
    static boolean field_m;
    static int field_n;
    int[] field_j;
    boolean field_l;
    static bd field_k;
    static boolean field_o;

    final static void a(byte param0, boolean param1, String param2, String param3) {
        fc.field_y = param2;
        if (param0 <= 109) {
            return;
        }
        try {
            rf.field_e = param3;
            qa.a(param1, (byte) -24, jj.field_i);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ri.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        try {
            dn.a(param2.field_e, uf.field_f, uf.field_d, param3, -1, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ri.C(" + 91 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ri() {
        ((ri) this).field_l = false;
    }

    public static void c(int param0) {
        field_p = null;
        field_i = null;
        if (param0 != -1) {
            ri.c(-71);
            field_k = null;
            return;
        }
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_i = "Create";
    }
}
