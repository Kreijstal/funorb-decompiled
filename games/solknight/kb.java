/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static String[] field_c;
    static String field_e;
    static mg field_f;
    static hi field_d;
    static String[] field_a;
    static int field_b;

    final static ib a(int param0, byte param1) {
        ib var2 = new ib();
        kh.field_a.a(var2, -7044);
        if (param1 >= 66) {
          v.a(2, param0);
          return var2;
        }
        kb.a((byte) 96);
        v.a(2, param0);
        return var2;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        if (param0 >= -5) {
          return;
        }
        dh.field_j.d(param1, param3);
        if (!param2) {
          return;
        }
        var4 = wd.field_a % dh.field_j.field_p * 2;
        if (var4 >= dh.field_j.field_p) {
          var4 = -var4 - (-dh.field_j.field_p - dh.field_j.field_p);
        }
        if (var4 < 10) {
          var4 = 10;
        } else {
          if (var4 > -40 + dh.field_j.field_p) {
            var4 = dh.field_j.field_p - 40;
          }
        }
        gd.a(param1, dh.field_j, 30, (byte) 118, 0, param3, var4, 0, 80);
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 == 15) {
          field_e = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_d = (hi) null;
        field_e = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
          kb.a((byte) -33);
          return hk.field_c[2047 & param0];
        }
        return hk.field_c[2047 & param0];
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        if (te.field_I != null) {
          return;
        }
        te.field_I = new String[20];
        te.field_I[3] = ea.field_q;
        te.field_I[4] = og.field_d;
        te.field_I[5] = h.field_f;
        te.field_I[2] = ti.field_d;
        te.field_I[1] = lb.field_T;
        te.field_I[15] = c.field_L;
        te.field_I[0] = ng.field_e;
        te.field_I[11] = vh.field_a;
        te.field_I[13] = gd.field_a;
        te.field_I[7] = qe.field_F;
        te.field_I[16] = ff.field_b;
        te.field_I[6] = h.field_f;
        te.field_I[12] = vb.field_f;
        te.field_I[14] = k.field_a;
        te.field_I[17] = rc.field_s;
        te.field_I[10] = gf.field_X[2];
        te.field_I[18] = ah.field_g;
        if (param0 < -101) {
          te.field_I[9] = gf.field_X[1];
          te.field_I[8] = gf.field_X[0];
          return;
        }
        field_c = (String[]) null;
        te.field_I[9] = gf.field_X[1];
        te.field_I[8] = gf.field_X[0];
    }

    final boolean a(int param0) {
        if (param0 != 80) {
          return false;
        }
        if (rc.field_o == this) {
          return true;
        }
        if (dk.field_h == this) {
          return true;
        }
        if (this != jj.field_Y) {
          return false;
        }
        return true;
    }

    static {
        field_e = "Passwords can only contain letters and numbers";
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
