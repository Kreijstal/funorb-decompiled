/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static ij field_b;
    private phb[] field_c;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -22113) {
            bc.a(70);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 48 / ((param0 - -8) / 58);
        abb.a(3, param4, param2, param3, ((bc) this).field_c, param1);
    }

    bc(phb[] param0) {
        ((bc) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ij();
        field_a = "Plasma ball";
    }
}
