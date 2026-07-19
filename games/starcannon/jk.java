/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    int field_e;
    int field_h;
    static hl[] field_f;
    static hl field_g;
    int field_d;
    static vi field_k;
    static int field_l;
    static int[] field_c;
    int field_i;
    static String field_b;
    static int field_j;
    static String field_a;

    final static void a(boolean param0, java.awt.Component param1) {
        param1.removeKeyListener(hj.field_c);
        if (param0) {
            return;
        }
        try {
            param1.removeFocusListener(hj.field_c);
            ah.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_c = null;
        field_k = null;
        field_f = null;
        field_b = null;
        int var1 = -40 % ((param0 - -67) / 47);
    }

    static {
        field_b = null;
        field_a = "Mouse over an icon for details";
    }
}
