/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    int field_b;
    static fk field_a;
    int field_c;

    final static byte[] a(String param0, int param1) {
        if (param1 >= -10) {
            return null;
        }
        return ve.field_z.a(param0, "", 97);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 >= -40) {
            te.a((byte) -57);
            field_a = null;
            return;
        }
        field_a = null;
    }

    te(int param0, int param1, int param2, int param3) {
        ((te) this).field_b = param3;
        ((te) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fk(3);
    }
}
