/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    int field_a;
    int field_b;
    static int field_d;
    int field_e;
    static ri[] field_c;
    static int[] field_f;
    int field_g;

    final static boolean a(boolean param0) {
        if (fq.field_f.a((byte) 91)) {
            fq.field_f.b(0);
            return true;
        }
        if (param0) {
            field_c = (ri[]) null;
            return false;
        }
        return false;
    }

    public static void a(byte param0) {
        if (param0 >= -82) {
            field_d = -61;
            field_c = null;
            field_f = null;
            return;
        }
        field_c = null;
        field_f = null;
    }

    static {
        field_f = new int[4];
    }
}
