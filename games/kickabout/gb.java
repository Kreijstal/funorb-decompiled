/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends wi {
    private int field_L;
    static int field_K;
    static String field_I;
    static String field_H;
    static boolean field_F;
    static ut[] field_G;
    private l field_J;

    public static void a(byte param0) {
        int var1 = 84 / ((-83 - param0) / 35);
        field_G = null;
        field_H = null;
        field_I = null;
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        ((gb) this).field_L = ((gb) this).field_L + 1;
        super.a(param0, param1, param2, param3);
    }

    final String f(int param0) {
        if (param0 != -1) {
            field_G = null;
            if (!(!((gb) this).field_m)) {
                return ((gb) this).field_J.b(param0 ^ 79);
            }
            return null;
        }
        if (!(!((gb) this).field_m)) {
            return ((gb) this).field_J.b(param0 ^ 79);
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        rv var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ut var12 = null;
        ut var13 = null;
        ut var15 = null;
        ut var16 = null;
        var11 = Kickabout.field_G;
        super.a(param0, (int) (char)param1, param2, param3);
        if (param0 != 0) {
          return;
        } else {
          var5 = (((gb) this).field_n >> -1201841535) + (param2 - -((gb) this).field_t);
          var6 = (((gb) this).field_i >> -1750487327) + (((gb) this).field_g + param3);
          var8 = ((gb) this).field_J.c(param1 + -24472);
          if (var8 != mn.field_c) {
            if (var8 != en.field_p) {
              if (jt.field_Bb != var8) {
                if (var8 == he.field_yb) {
                  var12 = jc.field_g[1];
                  var12.c(-(var12.field_q >> -1467829823) + var5, var6 - (var12.field_w >> 1137436449), 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = jc.field_g[2];
                var13.c(-(var13.field_q >> -2138336703) + var5, -(var13.field_w >> 1984852993) + var6, 256);
                return;
              }
            } else {
              var16 = jc.field_g[0];
              var9 = var16.field_o << -1735741151;
              var10 = var16.field_v << 1462340225;
              if (null != nq.field_G) {
                if (nq.field_G.field_q >= var9) {
                  if (nq.field_G.field_w >= var10) {
                    iw.a(116, nq.field_G);
                    on.b();
                    var16.b(112, 144, var16.field_o << -1380911644, var16.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                    ta.e(120);
                    nq.field_G.c(var5 - var16.field_o, var6 + -var16.field_v, 256);
                    return;
                  } else {
                    nq.field_G = new ut(var9, var10);
                    iw.a(-54, nq.field_G);
                    var16.b(112, 144, var16.field_o << -1380911644, var16.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                    ta.e(120);
                    nq.field_G.c(var5 - var16.field_o, var6 + -var16.field_v, 256);
                    return;
                  }
                } else {
                  nq.field_G = new ut(var9, var10);
                  iw.a(-54, nq.field_G);
                  var16.b(112, 144, var16.field_o << -1380911644, var16.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                  ta.e(120);
                  nq.field_G.c(var5 - var16.field_o, var6 + -var16.field_v, 256);
                  return;
                }
              } else {
                nq.field_G = new ut(var9, var10);
                iw.a(-54, nq.field_G);
                var16.b(112, 144, var16.field_o << -1380911644, var16.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                ta.e(120);
                nq.field_G.c(var5 - var16.field_o, var6 + -var16.field_v, 256);
                return;
              }
            }
          } else {
            var15 = jc.field_g[0];
            var9 = var15.field_o << -1735741151;
            var10 = var15.field_v << 1462340225;
            if (null != nq.field_G) {
              if (nq.field_G.field_q >= var9) {
                if (nq.field_G.field_w >= var10) {
                  iw.a(116, nq.field_G);
                  on.b();
                  var15.b(112, 144, var15.field_o << -1380911644, var15.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                  ta.e(120);
                  nq.field_G.c(var5 - var15.field_o, var6 + -var15.field_v, 256);
                  return;
                } else {
                  nq.field_G = new ut(var9, var10);
                  iw.a(-54, nq.field_G);
                  var15.b(112, 144, var15.field_o << -1380911644, var15.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                  ta.e(120);
                  nq.field_G.c(var5 - var15.field_o, var6 + -var15.field_v, 256);
                  return;
                }
              } else {
                nq.field_G = new ut(var9, var10);
                iw.a(-54, nq.field_G);
                var15.b(112, 144, var15.field_o << -1380911644, var15.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
                ta.e(120);
                nq.field_G.c(var5 - var15.field_o, var6 + -var15.field_v, 256);
                return;
              }
            } else {
              nq.field_G = new ut(var9, var10);
              iw.a(-54, nq.field_G);
              var15.b(112, 144, var15.field_o << -1380911644, var15.field_v << -1026905852, -((gb) this).field_L << 2044108266, 4096);
              ta.e(120);
              nq.field_G.c(var5 - var15.field_o, var6 + -var15.field_v, 256);
              return;
            }
          }
        }
    }

    final boolean a(fd param0, int param1) {
        if (param1 != 0) {
            ((gb) this).field_L = -79;
            return false;
        }
        return false;
    }

    gb(l param0) {
        ((gb) this).field_J = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Show all private chat";
        field_K = -1;
        field_H = "TEAM SELECTION";
    }
}
