/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends mc {
    int field_y;
    int field_o;
    int field_u;
    static hl field_q;
    static int field_w;
    int field_r;
    static int field_n;
    static a field_v;
    int field_x;
    int field_t;
    static int field_s;
    static u field_p;

    final static void b(byte param0) {
        int var1 = 0;
        if (th.field_g > 0) {
            th.field_g = th.field_g - 1;
            if (~te.field_P == ~pk.field_O.field_j) {
                if (!(th.field_g <= 0)) {
                    lc.a((byte) -61);
                }
                return;
            }
            ja.field_f = ja.field_f + (pk.field_O.field_j + -te.field_P);
            te.field_P = pk.field_O.field_j;
            if (!(th.field_g <= 0)) {
                lc.a((byte) -61);
            }
            return;
        }
        if (~te.field_P != ~pk.field_O.field_j) {
            ja.field_f = ja.field_f + (pk.field_O.field_j + -te.field_P);
            te.field_P = pk.field_O.field_j;
            if (!(th.field_g <= 0)) {
                lc.a((byte) -61);
            }
            return;
        }
        if (!(th.field_g <= 0)) {
            lc.a((byte) -61);
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_p = null;
        if (param0 != 0) {
            field_w = 3;
            field_v = null;
            return;
        }
        field_v = null;
    }

    private eh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_v = new a();
    }
}
