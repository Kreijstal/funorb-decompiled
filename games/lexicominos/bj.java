/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    int field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = (String) null;
        }
    }

    bj(int param0) {
        this.field_b = param0;
    }

    static {
        field_a = "EGG";
    }
}
