/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static li field_b;
    static String field_a;
    static String[] field_c;
    static int[][] field_d;

    final static void a(int param0, boolean param1) {
        if (param0 <= 1) {
            qd.a(-55, true);
            wj.a(-100, param1, false);
            return;
        }
        wj.a(-100, param1, false);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        kg.field_j.a(false, (pj) (Object) new hm());
        if (param0 < 116) {
            qd.a((byte) -27);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = 57 % ((param0 - 21) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_b = new li();
        field_c = new String[255];
    }
}
