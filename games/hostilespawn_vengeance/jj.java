/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    boolean field_c;
    static dg field_d;
    static String field_h;
    static String field_f;
    static int field_g;
    static bd[] field_j;
    int field_a;
    static String field_i;
    boolean field_b;
    String field_l;
    static fd field_k;
    String[] field_e;

    final static void a(byte param0, String[] param1) {
        if (param0 == -112) {
          L0: {
            if (ik.field_d != null) {
              ik.field_d.field_J.a(param1, (byte) -118);
              break L0;
            } else {
              break L0;
            }
          }
          if (null != te.field_M) {
            te.field_M.field_I.a(param1, (byte) 127);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static double a(p param0, int param1, p param2) {
        double var3 = 0.0;
        double var5 = 0.0;
        var3 = (double)(-param2.field_j.field_e) + ((double)param0.field_j.field_e + param0.field_l.field_f) - param2.field_l.field_f;
        var5 = (double)(-param2.field_j.field_g) + ((double)param0.field_j.field_g + param0.field_l.field_a) - param2.field_l.field_a;
        if (param1 != 1) {
          field_d = null;
          return var5 * var5 + var3 * var3;
        } else {
          return var5 * var5 + var3 * var3;
        }
    }

    final static void a(int param0, oj param1) {
        if (uj.field_l == 1) {
          if (!ej.d((byte) 90)) {
            jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
            jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 1;
            jn.field_F[ib.field_c].field_i = 12;
            ib.field_c = ib.field_c + 1;
            hg.a((byte) 64, (p) (Object) param1);
            u.a(-1, param1.field_j, true, param0, param1.field_l, 31);
            param1.field_i = -1;
            return;
          } else {
            eh.field_c.a(lm.field_A[17], 100, uh.field_i / 2);
            jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
            jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 1;
            jn.field_F[ib.field_c].field_i = 12;
            ib.field_c = ib.field_c + 1;
            hg.a((byte) 64, (p) (Object) param1);
            u.a(-1, param1.field_j, true, param0, param1.field_l, 31);
            param1.field_i = -1;
            return;
          }
        } else {
          jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
          jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
          jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
          jn.field_F[ib.field_c].field_e = 0;
          jn.field_F[ib.field_c].field_h = 1;
          jn.field_F[ib.field_c].field_i = 12;
          ib.field_c = ib.field_c + 1;
          hg.a((byte) 64, (p) (Object) param1);
          u.a(-1, param1.field_j, true, param0, param1.field_l, 31);
          param1.field_i = -1;
          return;
        }
    }

    public static void a(int param0) {
        int var1 = -8 % ((86 - param0) / 32);
        field_j = null;
        field_h = null;
        field_i = null;
        field_f = null;
        field_k = null;
        field_d = null;
    }

    jj(boolean param0) {
        ((jj) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_f = "Weapons will have no effect against that monster. I might be able to find another way to kill it...";
        field_i = "Logging in...";
        field_h = "The lift should be active now.";
    }
}
