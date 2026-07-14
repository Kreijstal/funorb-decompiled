/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static th field_a;
    static int field_e;
    static re field_b;
    static int field_c;
    static String field_d;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 8) {
            field_a = null;
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(go param0, int param1, java.awt.Component param2, gd param3, int param4, boolean param5) {
        kk.a(param1, param5, param1, (byte) 119, param2, param0, param4, param3);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new th();
        field_b = new re();
        field_d = "Sceptic";
        field_c = 256;
    }
}
