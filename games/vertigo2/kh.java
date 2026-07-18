/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static String field_a;
    static ed field_b;
    static er[][] field_d;
    static int[] field_c;

    final static boolean a(int param0, int param1) {
        return param1 == 2;
    }

    final static void a(int param0, byte param1) {
        rk.field_A = hn.field_u[param0];
    }

    final static void a(byte param0) {
        tk.field_e = false;
        ed.field_t = false;
        rh.b(-14, -1);
        un.field_Hb = l.field_a;
        um.field_F = l.field_a;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Withdraw invitation to <%0> to join this game";
    }
}
