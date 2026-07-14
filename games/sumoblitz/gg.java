/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg extends pj {
    byte[] field_s;
    static ki field_r;
    static qr field_t;

    final static boolean a(String param0, String param1, int param2) {
        if (!(!me.a(false, param0))) {
            return false;
        }
        if (hp.a(param0, true)) {
            return false;
        }
        if (!(!ao.a(param0, 30996))) {
            return false;
        }
        int var3 = 11 / ((param2 - 63) / 59);
        if (!(param1.length() != 0)) {
            return true;
        }
        if (gt.a(param0, param1, 106)) {
            return false;
        }
        if (!(!jd.a(param0, (byte) 111, param1))) {
            return false;
        }
        if (wv.a(false, param0, param1)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_r = null;
        }
        field_t = null;
        field_r = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        ig.field_b.e(122);
        aa.field_a = new ah[100];
        ds.a(85);
        if (param0 <= 81) {
            field_t = null;
        }
        bj.field_b = new jn();
        is.field_c = new jn();
        if (oh.field_e != -1) {
            is.field_c = dr.field_S[oh.field_e].field_d;
        }
        he.field_o = new Random();
        db.field_l = 1;
        nd.field_F = 3;
        an.field_a = 0;
        ku.field_J = new wc[6];
        int var1 = 0;
        if (-1 == oh.field_e) {
        } else {
            if (rh.field_r[oh.field_e]) {
                ku.field_J = ((om) (Object) ab.field_a.a(107, (long)oh.field_e)).a(-120);
            } else {
                for (var2 = cj.field_e[oh.field_e]; var2 < 6 + cj.field_e[oh.field_e]; var2++) {
                    ku.field_J[var1] = cb.field_a[var2];
                    var1++;
                }
            }
        }
        in.field_z = 0;
        if (5 < gj.a((byte) -84, 10)) {
            ha.field_f = ha.field_f + iw.field_b;
        } else {
            fb.field_a = fb.field_a + iw.field_b;
        }
        iw.field_b = 0;
        td.field_m = false;
        ke.a(false);
        oc.field_e = 1000;
        ag.a(0, oh.field_e % 5 + 1);
    }

    gg(byte[] param0) {
        ((gg) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new qr();
    }
}
