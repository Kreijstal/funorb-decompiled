/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends bh {
    int field_t;
    int field_n;
    int field_r;
    static mm field_o;
    int field_p;
    int field_s;
    int field_q;

    public static void a() {
        field_o = null;
    }

    final static void a(boolean param0) {
        if (null != kb.field_i) {
            if (!kb.field_i.b(-1, param0)) {
                return;
            }
            kb.field_i = null;
        }
    }

    ff(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ff) this).field_r = param1;
        ((ff) this).field_n = param3;
        ((ff) this).field_s = param4;
        ((ff) this).field_p = param2;
        ((ff) this).field_t = param5;
        ((ff) this).field_q = param0;
    }

    static {
    }
}
