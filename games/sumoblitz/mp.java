/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    static int[] field_b;
    static int field_a;

    final static void a(int param0, int param1) {
        if (param1 <= 114) {
            return;
        }
        mf var2 = fh.field_n[param0];
        io.a(125, var2);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -37) {
            field_a = 52;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new int[8192];
    }
}
