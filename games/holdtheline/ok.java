/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_f;
    private int field_c;
    int field_d;
    hb[] field_a;
    static int field_e;
    String field_b;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_f = null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != -6126) {
            return null;
        }
        String var2 = kk.a(true, ko.a(param0, -13820));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    final void a(hb param0, int param1) {
        int var3 = 0;
        hb[] var4 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (!(((ok) this).field_c >= ((ok) this).field_d - -1)) {
            var3 = 1 + ((ok) this).field_c;
            var4 = new hb[var3];
            for (var5 = 0; var5 < ((ok) this).field_d; var5++) {
                var4[var5] = ((ok) this).field_a[var5];
            }
            ((ok) this).field_c = var3;
            ((ok) this).field_a = var4;
        }
        ((ok) this).field_d = ((ok) this).field_d + 1;
        ((ok) this).field_a[((ok) this).field_d] = param0;
        var3 = -24 % ((param1 - -5) / 37);
    }

    ok() {
        ((ok) this).field_a = null;
        ((ok) this).field_d = 0;
        ((ok) this).field_b = null;
        ((ok) this).field_c = 0;
    }

    final static void a(int param0) {
        tn.field_h[kf.field_F] = tc.field_b;
        ce.field_q[kf.field_F] = tc.field_d;
        dm.field_b[kf.field_F] = tc.field_e;
        m.field_c[kf.field_F] = tc.field_a;
        mk.field_n[kf.field_F] = tc.field_i;
        gd.field_c[kf.field_F] = tc.field_j;
        bd.field_V[kf.field_F] = tc.field_c;
        kf.field_F = kf.field_F + 1;
        if (param0 != 32381) {
            field_e = 50;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 55) {
            boolean discarded$0 = ok.a((byte) 60);
        }
        if ((ad.field_c ^ -1) == 0) {
            if (!(hi.b(1, (byte) 40))) {
                return false;
            }
            ad.field_c = rd.field_e.f((byte) -72);
            rd.field_e.field_l = 0;
        }
        if (!(ad.field_c != -2)) {
            if (!(hi.b(2, (byte) 40))) {
                return false;
            }
            ad.field_c = rd.field_e.k(62);
            rd.field_e.field_l = 0;
        }
        return hi.b(ad.field_c, (byte) 40);
    }

    static {
    }
}
