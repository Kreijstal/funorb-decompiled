/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends fk {
    static int[] field_k;
    static String field_l;
    static boolean field_m;
    static int field_o;
    static he field_n;

    public static void c(boolean param0) {
        if (param0) {
            pf.c(false);
            field_l = null;
            field_n = null;
            field_k = null;
            return;
        }
        field_l = null;
        field_n = null;
        field_k = null;
    }

    pf(long param0, String param1) {
        super(param0, param1);
    }

    final bj a(byte param0) {
        if (param0 != 45) {
            pf.c(true);
            return jf.field_L;
        }
        return jf.field_L;
    }

    static {
        field_k = new int[8192];
        field_l = "Accept";
    }
}
