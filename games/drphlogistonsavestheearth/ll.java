/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lk {
    static db field_p;
    static byte[][] field_o;

    final db b(byte param0) {
        if (param0 != -98) {
            db discarded$0 = ((ll) this).b((byte) -62);
            return j.field_V;
        }
        return j.field_V;
    }

    public static void d() {
        field_p = null;
        field_o = null;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + qb.a("%0a", (byte) 127, "\n", param1));
    }

    ll(long param0, String param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new db(3);
    }
}
