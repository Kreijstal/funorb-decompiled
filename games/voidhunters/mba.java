/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mba {
    static ae field_a;
    static int field_b;

    final static void a(int param0) {
        if (param0 > -107) {
            field_b = 31;
            ls.field_q = false;
            return;
        }
        ls.field_q = false;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 26) {
            field_a = (ae) null;
        }
    }

    static {
        field_a = new ae(1);
        field_b = 0;
    }
}
