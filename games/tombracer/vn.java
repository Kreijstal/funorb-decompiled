/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static vna field_a;
    static String field_c;
    static jw field_b;

    final static void a(int param0, String param1, boolean param2) {
        bga.field_d = param2 ? true : false;
        nfa.field_p = true;
        ci.field_l = new ij(ej.field_a, ft.field_c, param1, jf.field_r, bga.field_d);
        int var3 = -94 / ((43 - param0) / 34);
        ej.field_a.c((ae) (Object) ci.field_l, 104);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You need to play <%0> more rated games to unlock this option.";
    }
}
