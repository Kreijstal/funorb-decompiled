/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends le {
    int field_h;
    int field_i;
    static vn field_j;

    final static boolean a(int param0) {
        if (param0 != -2887) {
            field_j = (vn) null;
            if (0 == (jd.field_b ^ -1)) {
                if (!ck.a((byte) -128, 1)) {
                    return false;
                }
                jd.field_b = fj.field_g.d((byte) -117);
                fj.field_g.field_j = 0;
            }
            if (!(-2 != jd.field_b)) {
                if (!(ck.a((byte) -110, 2))) {
                    return false;
                }
                jd.field_b = fj.field_g.f(2);
                fj.field_g.field_j = 0;
            }
            return ck.a((byte) 103, jd.field_b);
        }
        if (0 == (jd.field_b ^ -1)) {
            if (!ck.a((byte) -128, 1)) {
                return false;
            }
            jd.field_b = fj.field_g.d((byte) -117);
            fj.field_g.field_j = 0;
        }
        if (!(-2 != jd.field_b)) {
            if (!(ck.a((byte) -110, 2))) {
                return false;
            }
            jd.field_b = fj.field_g.f(2);
            fj.field_g.field_j = 0;
        }
        return ck.a((byte) 103, jd.field_b);
    }

    private nn() throws Throwable {
        throw new Error();
    }

    public static void c(int param0) {
        boolean discarded$0 = false;
        field_j = null;
        if (param0 != 2) {
            discarded$0 = nn.a(52);
        }
    }

    static {
    }
}
