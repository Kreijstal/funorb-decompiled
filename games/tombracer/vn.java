/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static vna field_a;
    static String field_c;
    static jw field_b;

    final static void a(int param0, String param1, boolean param2) {
        try {
            bga.field_d = param2;
            nfa.field_p = true;
            ci.field_l = new ij(ej.field_a, ft.field_c, param1, jf.field_r, bga.field_d);
            int var3_int = -94 / ((43 - param0) / 34);
            ej.field_a.c(ci.field_l, 104);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            vn.a((byte) 63);
        }
    }

    static {
        field_c = "You need to play <%0> more rated games to unlock this option.";
    }
}
