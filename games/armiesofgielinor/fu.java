/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu {
    static int field_d;
    String field_i;
    private static long[] field_f;
    static String field_b;
    wk field_h;
    String field_c;
    static String field_a;
    static wk field_e;
    static af field_g;

    final static void a(int param0, jd param1, vh param2) {
        bu.a(0, param1, 2, param2);
        if (param0 != 29712) {
            field_f = null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 < 124) {
            field_a = null;
        }
        field_e = null;
    }

    final static void a(String param0, int param1, long param2, int param3, boolean param4, int param5) {
        vl.field_n.h(param3 ^ 3982, param5);
        vl.field_n.field_q = vl.field_n.field_q + 1;
        if (param3 != 29231) {
            return;
        }
        int var7 = vl.field_n.field_q;
        vl.field_n.a(param2, param3 ^ 38346879);
        vl.field_n.b(param0, param3 ^ 17460);
        vl.field_n.b(1, param1);
        vl.field_n.b(param3 + -29230, param4 ? 1 : 0);
        vl.field_n.e(-var7 + vl.field_n.field_q, 5930);
    }

    fu(int[] param0, int param1, int param2) {
        L0: {
          if (param0 != null) {
            ((fu) this).field_h = pl.field_x[param0[0]];
            break L0;
          } else {
            if (param1 == 0) {
              if (-1 < param2) {
                ((fu) this).field_h = lf.field_h[161];
                break L0;
              } else {
                ((fu) this).field_h = null;
                break L0;
              }
            } else {
              ((fu) this).field_h = lf.field_h[uc.field_d[param1][2]];
              break L0;
            }
          }
        }
        L1: {
          if (param0 != null) {
            ((fu) this).field_c = dn.field_Pb[param0[0]];
            ((fu) this).field_i = ut.field_cb[param0[0]];
            break L1;
          } else {
            if (-1 == param1) {
              if ((param2 ^ -1) < -1) {
                ((fu) this).field_c = dj.a(6609, hf.field_b, "<MANA>", Integer.toString(param2));
                ((fu) this).field_i = hw.field_D;
                break L1;
              } else {
                ((fu) this).field_c = null;
                ((fu) this).field_i = null;
                break L1;
              }
            } else {
              ((fu) this).field_c = fq.field_f[param1];
              ((fu) this).field_i = mn.field_l[param1];
              break L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_f = new long[256];
        field_b = "Stock";
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_a = "Email is valid";
            field_g = null;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_f[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> 500927041;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
