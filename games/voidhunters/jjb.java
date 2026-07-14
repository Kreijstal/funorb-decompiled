/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jjb {
    ob field_a;
    ob field_g;
    boolean field_d;
    static String field_f;
    aia[] field_e;
    aia[] field_c;
    ob field_b;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_f = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!li.field_i) {
          dma.d(param4, param3, param5, param1, param0);
          if (param2 == 17634) {
            return;
          } else {
            field_f = null;
            return;
          }
        } else {
          if (!ne.field_v) {
            if (param2 != 17634) {
              field_f = null;
              return;
            } else {
              return;
            }
          } else {
            og.field_r.aa(param4, param3, param5, param1, param0, 0);
            if (param2 == 17634) {
              return;
            } else {
              field_f = null;
              return;
            }
          }
        }
    }

    jjb(qfa param0) {
        int var2 = 0;
        ob var4 = null;
        nk var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        ((jjb) this).field_a = null;
        ((jjb) this).field_g = null;
        ((jjb) this).field_e = null;
        ((jjb) this).field_c = null;
        ((jjb) this).field_b = null;
        ((jjb) this).field_d = param0.field_tc;
        lna.a(param0, 16);
        if (!((jjb) this).field_d) {
          ((jjb) this).field_e = new aia[16];
          var2 = 0;
          L0: while (true) {
            if (-17 >= (var2 ^ -1)) {
              ((jjb) this).field_c = new aia[16];
              var2 = 0;
              L1: while (true) {
                if (16 > var2) {
                  var24 = ppb.a(pjb.field_vb, var2 * 32768, true, 32768);
                  ((jjb) this).field_c[var2] = new aia(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                  var2++;
                  continue L1;
                } else {
                }
              }
            } else {
              var23 = ppb.a(pra.field_p, 32768 * var2, true, 32768);
              ((jjb) this).field_e[var2] = new aia(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
              var2++;
              continue L0;
            }
          }
        } else {
          var20 = ffb.a(false, pra.field_p, true);
          ((jjb) this).field_b = new ob(param0, 6410, 128, 128, 16, var20, 6410);
          var21 = ffb.a(false, pjb.field_vb, true);
          ((jjb) this).field_g = new ob(param0, 6410, 128, 128, 16, var21, 6410);
          var10 = param0.field_yb;
          if (var10.a(92)) {
            var22 = ffb.a(false, lda.field_o, true);
            ((jjb) this).field_a = new ob(param0, 6408, 128, 128, 16);
            var4 = new ob(param0, 6409, 128, 128, 16, var22, 6409);
            if (!var10.a(2.0f, -28279, var4, ((jjb) this).field_a)) {
              ((jjb) this).field_a.e(0);
              ((jjb) this).field_a = null;
              var4.e(0);
            } else {
              boolean discarded$1 = ((jjb) this).field_a.c(9729);
              var4.e(0);
            }
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Provides a burst of acceleration";
    }
}
