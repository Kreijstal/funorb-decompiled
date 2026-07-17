/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends i {
    static gf[] field_H;
    static boolean field_G;
    static ut[] field_F;

    final static boolean b() {
        int var3 = null != ow.field_b ? 1 : 0;
        if (cc.field_e == 9) {
            if (!(!cb.a(ol.field_z, mv.field_a, (byte) -64, qs.field_S, nr.field_r))) {
                if (ol.field_z != 2) {
                    if (!(var3 == 0)) {
                        return false;
                    }
                }
                return mi.a(nr.field_r, mv.field_a, (byte) 124, ol.field_z, qs.field_S);
            }
        }
        int var4 = 0;
        if (!(10 != cc.field_e)) {
            if (var3 != 0) {
                return false;
            }
            int discarded$0 = 0;
            hp.b();
            return true;
        }
        if (11 == cc.field_e) {
            if (nu.field_j) {
                if (qs.field_K == 2) {
                    if (!nq.a(false, oc.field_f, qh.field_c)) {
                        return false;
                    }
                }
                if (2 != qs.field_K) {
                    if (var3 != 0) {
                        return false;
                    }
                }
                if (!jk.b(0)) {
                    return true;
                }
                Object var5 = null;
                gp.a(vb.field_h, 101, qs.field_K, 15, oc.field_f, (String) null);
                return true;
            }
        }
        return false;
    }

    sq() {
        super(1);
    }

    final void a(int param0, int param1) {
        int var4 = Kickabout.field_G;
        super.a(127, param1);
        if (0 == param1) {
            int discarded$1 = -56;
            nk.c();
            jm.a(13, true, -2);
        } else {
            if (param1 == 1) {
                wb.f(-120);
                jm.a(13, true, -2);
            } else {
                if (param1 != 2) {
                }
            }
        }
        if (param0 <= 60) {
            field_H = null;
        }
    }

    public static void g() {
        field_H = null;
        field_F = null;
    }

    static {
    }
}
