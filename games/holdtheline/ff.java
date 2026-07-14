/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static java.math.BigInteger field_a;
    static boolean field_b;
    static int[] field_c;

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 8192) {
            return false;
        }
        return ne.a(param0, 0, false);
    }

    abstract int a(boolean param0, int param1);

    public static void a(int param0) {
        field_c = null;
        if (param0 != 8192) {
            ff.a(-20);
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract byte[] a(byte param0, int param1);

    abstract kn a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.math.BigInteger("65537");
        field_c = new int[8192];
    }
}
