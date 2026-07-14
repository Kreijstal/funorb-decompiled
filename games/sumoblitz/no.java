/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no {
    static ri field_c;
    static jn field_d;
    static cv field_a;
    static String[] field_b;

    public static void a(int param0) {
        if (param0 != 10) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static int a(byte param0, CharSequence param1) {
        if (param0 > -126) {
            no.a(-92);
            return uv.a(10, param1, true, (byte) -84);
        }
        return uv.a(10, param1, true, (byte) -84);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new jn();
    }
}
