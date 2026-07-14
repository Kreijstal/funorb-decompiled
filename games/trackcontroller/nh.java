/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_b;
    static na field_c;
    static int field_a;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -103) {
            return;
        }
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        nf.a(true, bf.field_f, fi.field_l, (byte) -105);
        pc.field_h = true;
        int var1 = -113 % ((param0 - 15) / 60);
    }

    nh(int param0) {
        ((nh) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Menu";
    }
}
