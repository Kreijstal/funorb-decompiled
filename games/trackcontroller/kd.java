/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd {
    static ja field_b;
    static ja field_a;

    final static void a(String param0, byte param1) {
        if (param1 <= 30) {
            field_a = null;
        }
    }

    abstract void a(byte param0, be param1);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 23) {
            field_b = null;
        }
    }

    abstract nh a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ja();
        field_a = new ja();
    }
}
