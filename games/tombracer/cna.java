/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cna {
    static boolean field_a;
    static String field_d;
    static int[] field_c;
    static String[] field_b;

    final static bna a(int param0, int param1) {
        bna var2 = new bna();
        tca.field_N.b((byte) -109, (vg) (Object) var2);
        rh.b(4, -100);
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 > -75) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_c = new int[128];
        field_d = "This option cannot be combined with the current '<%0>' setting.";
    }
}
