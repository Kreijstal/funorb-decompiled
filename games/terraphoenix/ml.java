/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends hb {
    static String field_t;
    static int field_s;
    static String field_r;

    final static String e(int param0) {
        if (param0 != 19290) {
            ml.a((byte) 51);
            if (uj.field_c) {
                return null;
            }
            if (qd.field_l > ga.field_j) {
                return null;
            }
            if (!(ga.field_j >= qd.field_l + fh.field_h)) {
                return cc.field_j;
            }
            return null;
        }
        if (uj.field_c) {
            return null;
        }
        if (qd.field_l > ga.field_j) {
            return null;
        }
        if (!(ga.field_j >= qd.field_l + fh.field_h)) {
            return cc.field_j;
        }
        return null;
    }

    final cm c(int param0) {
        if (param0 != 0) {
            field_s = -100;
            return si.field_nb;
        }
        return si.field_nb;
    }

    ml(long param0, String param1) {
        super(param0, param1);
    }

    public static void a(byte param0) {
        if (param0 < 50) {
            field_r = (String) null;
            field_t = null;
            field_r = null;
            return;
        }
        field_t = null;
        field_r = null;
    }

    static {
        field_r = "PAS-8";
    }
}
