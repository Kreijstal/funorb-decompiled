/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_b;
    static int field_c;
    static int field_a;

    final static void a(int param0, int param1, byte param2) {
        nh.field_Nb = 320;
        fk.field_S = 240;
    }

    final static boolean a(int param0) {
        if (lf.field_b == null) {
            return false;
        }
        if (!lf.field_b.h(0)) {
            return false;
        }
        return true;
    }

    public static void a() {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Players are <%0> and <%1>.";
    }
}
