/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static vj field_f;
    static String field_a;
    static pi[] field_c;
    static char field_b;
    static String field_d;
    static ck field_e;

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    final static String a(int param0) {
        if (!(pa.field_V != sh.field_d)) {
            return qb.field_t;
        }
        if (param0 >= -25) {
            field_c = (pi[]) null;
            if (ka.field_P == pa.field_V) {
                return pn.field_fb;
            }
            if (!(jj.field_f.a(92))) {
                return pn.field_fb;
            }
            return hb.field_Ob;
        }
        if (ka.field_P == pa.field_V) {
            return pn.field_fb;
        }
        if (!(jj.field_f.a(92))) {
            return pn.field_fb;
        }
        return hb.field_Ob;
    }

    static {
        field_a = "Type your email address again to make sure it's correct";
        field_f = new vj();
        field_b = '/';
        field_d = "You have 1 unread message!";
    }
}
