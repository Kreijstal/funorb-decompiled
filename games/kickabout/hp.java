/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static String field_a;
    static boolean field_b;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_b = true;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void b(int param0) {
        ov.field_b = param0;
        la.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = bn.a(' ', (byte) -83);
        field_c = "Press F10 to open Quick Chat.";
    }
}
