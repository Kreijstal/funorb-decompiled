/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fn {
    static String field_b;
    static gk field_a;
    private static String field_z;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -5) {
            fn.a((byte) -34);
            field_b = null;
            return;
        }
        field_b = null;
    }

    abstract void a(rb param0, boolean param1);

    abstract eo a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "fn.C(";
        field_b = "Waiting for instruments";
    }
}
