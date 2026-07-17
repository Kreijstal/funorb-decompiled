/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oaa extends mnb implements uq {
    static phb field_j;
    static ij field_k;
    static lla field_h;
    static int field_i;

    public final int a(boolean param0) {
        if (!param0) {
            return 121;
        }
        return ((oaa) this).field_f;
    }

    public static void c() {
        field_k = null;
        field_j = null;
        field_h = null;
    }

    oaa(qfa param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34962, param2, param3, param4);
    }

    final void a(int param0) {
        ((oaa) this).field_c.a(param0, (uq) this);
    }

    final static boolean a() {
        return ola.field_p != null;
    }

    final static double b(byte param0) {
        return npa.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ij();
        field_h = new lla();
        field_i = 100;
    }
}
