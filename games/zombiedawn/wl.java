/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int field_b;
    static String[] field_a;

    public static void a(byte param0) {
        if (param0 >= -79) {
            wl.a((byte) -46);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new String[]{"Mode: Normal", "Mode: Hard"};
    }
}
