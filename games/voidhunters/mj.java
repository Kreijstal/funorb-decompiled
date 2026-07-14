/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    int field_h;
    static mj field_g;
    static mj field_i;
    static mj field_c;
    static mj field_f;
    static mj field_e;
    static mj field_a;
    static mj field_b;
    static mj field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_f = null;
        field_g = null;
        if (param0 < 5) {
            mj.a(31);
        }
    }

    private mj(int param0) {
        ((mj) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new mj(1);
        field_i = new mj(2);
        field_c = new mj(4);
        field_f = new mj(1);
        field_e = new mj(2);
        field_a = new mj(4);
        field_b = new mj(2);
        field_d = new mj(4);
    }
}
