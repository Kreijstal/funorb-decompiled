/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends hf {
    static tf field_f;
    int field_h;
    static int field_g;

    final static void a(byte param0) {
        if (!hl.field_G) {
            throw new IllegalStateException();
        }
        kf.field_e = true;
        if (param0 > 115) {
            q.a((byte) 107, false);
            hj.field_a = 0;
            return;
        }
        field_f = (tf) null;
        q.a((byte) 107, false);
        hj.field_a = 0;
    }

    public static void c(byte param0) {
        int var1 = -118 / ((-11 - param0) / 40);
        field_f = null;
    }

    nj(int param0) {
        this.field_h = param0;
    }

    static {
        field_g = -1;
        field_f = new tf();
    }
}
