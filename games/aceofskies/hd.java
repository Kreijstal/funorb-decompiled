/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static String field_a;
    static int[] field_c;
    int field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 30714) {
            hd.a(6);
        }
    }

    hd(int param0) {
        this.field_b = param0;
    }

    static {
        field_a = "Names cannot start or end with space or underscore";
        field_c = new int[1];
    }
}
