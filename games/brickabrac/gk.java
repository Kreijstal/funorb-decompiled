/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gk {
    static int field_a;
    static String field_d;
    static String field_b;
    static mh field_c;

    abstract void a(java.awt.Component param0, int param1);

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 < 72) {
            field_a = 14;
        }
    }

    abstract int b(int param0);

    final static void a(int param0, byte param1) {
        int discarded$3 = vi.c((byte) -109);
        if (param1 <= 111) {
            gk.a(-66, (byte) -49);
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    static {
        field_a = 500;
        field_b = "Please select an option in the '<%0>' row.";
        field_d = "Name is available";
    }
}
