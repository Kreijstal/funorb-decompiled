/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static int field_c;
    static String field_e;
    static ff field_f;
    static byte[][] field_g;
    static int[] field_b;
    static int field_d;
    static ml field_a;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_g = (byte[][]) null;
        if (param0 != 0) {
            ng.a(-31);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_g = new byte[1000][];
        field_e = "Start Game";
        field_b = new int[8192];
        field_d = 2;
        field_f = new ff(2, 4, 4, 0);
    }
}
