/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk implements uj {
    static int field_d;
    static int[] field_b;
    static ea field_e;
    static long field_c;
    static long field_a;

    public final String a(byte param0) {
        int var2 = 53 / ((-33 - param0) / 62);
        return "Make Rock Snow";
    }

    public final void a(boolean param0) {
        if (param0) {
            field_a = -64L;
            tb.field_a = 2;
            bc.field_a = 2;
            return;
        }
        tb.field_a = 2;
        bc.field_a = 2;
    }

    public static void b(boolean param0) {
        if (!param0) {
            sk.b(true);
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    static {
        field_b = new int[]{255, 4489372};
    }
}
