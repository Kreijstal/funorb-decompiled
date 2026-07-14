/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wta extends kna {
    static String field_H;
    static int field_F;
    static boolean field_G;

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = 126;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_H = null;
            return 7;
        }
        return 7;
    }

    final static void a(String param0, byte param1) {
        if (param1 > -23) {
            return;
        }
        ji.field_d = param0;
    }

    final void q(byte param0) {
        super.q(param0);
        ((wta) this).b(param0 ^ 1, 4194304, 4194304);
    }

    final static void A(int param0) {
        aca.field_h = new String[rh.field_n];
        aca.field_h[17] = pq.field_d;
        aca.field_h[20] = afa.field_b;
        aca.field_h[11] = aqa.field_b;
        aca.field_h[9] = cda.field_u;
        aca.field_h[21] = rua.field_jb;
        aca.field_h[19] = tq.field_b;
        aca.field_h[5] = tw.field_g;
        aca.field_h[4] = sma.field_d;
        aca.field_h[6] = nt.field_c;
        aca.field_h[7] = gn.field_A;
        if (param0 != 12) {
          field_G = true;
          aca.field_h[15] = oda.field_h;
          aca.field_h[16] = eka.field_n;
          aca.field_h[18] = se.field_q;
          aca.field_h[13] = wea.field_c;
          return;
        } else {
          aca.field_h[15] = oda.field_h;
          aca.field_h[16] = eka.field_n;
          aca.field_h[18] = se.field_q;
          aca.field_h[13] = wea.field_c;
          return;
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return true;
    }

    wta(la param0, int param1) {
        super(param0, param1);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((wta) this).field_k, ((wta) this).field_l);
        var9.a((byte) -3, 20);
        var9.h(param1, 0);
        var9.b((byte) 17, true);
        var9.a(4, (byte) -12, true);
        bg var5 = new bg(param2, param0);
        var5.c(66, 0);
        var5.a(false, 262144);
        var9.a((wda) (Object) var5, param1 ^ 3);
        rea var6 = new rea(param2, param0);
        var6.a(25, 12, 1, 25, 12);
        var6.b((byte) 127, true);
        var9.a((byte) 83, (nv) (Object) var6);
        mfa var7 = rm.field_a;
        dc var8 = (dc) (Object) var7.a(11, param1 ^ 116);
        var9.a((gr) (Object) var6, (byte) 124, (dg) (Object) var8);
        return var9;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_H = null;
            return false;
        }
        return false;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    public static void r(byte param0) {
        if (param0 != 15) {
            return;
        }
        field_H = null;
    }

    wta(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            field_F = 80;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Short Flamer";
        field_F = 2;
    }
}
