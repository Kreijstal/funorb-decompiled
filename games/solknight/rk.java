/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rk {
    static String field_a;
    static int field_c;
    static String field_b;

    final static int a(boolean param0, byte param1, ab param2) {
        if (param1 != 20) {
            rk.a((byte) -79);
            return param2.b(false, param0);
        }
        return param2.b(false, param0);
    }

    abstract void a(int param0, byte[] param1);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 94) {
            field_a = null;
        }
    }

    abstract byte[] a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = 0;
        field_b = "Names should contain a maximum of 12 characters";
    }
}
