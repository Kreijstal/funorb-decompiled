/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_a;
    static String field_b;
    static ta field_c;

    final static boolean a(int param0) {
        if (eq.field_g == null) {
            return false;
        }
        if (!rf.field_b.c(-26774)) {
            return false;
        }
        return true;
    }

    final static void a(int param0, boolean param1, int param2) {
        pi var3 = k.field_h;
        var3.e(-13413, param2);
        var3.a(-29, 3);
        var3.a(-127, 9);
        var3.b((byte) 121, param0);
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Well done!";
        field_b = "You have declined the invitation.";
    }
}
