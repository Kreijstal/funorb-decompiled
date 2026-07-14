/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends pj {
    static da field_Q;
    static int field_O;
    private oe field_J;
    static wh field_I;
    private int field_N;
    static String field_L;
    static hf[] field_K;
    static long field_P;
    static String field_M;

    final void a(int param0, int param1, int param2, rc param3) {
        ((kc) this).field_N = ((kc) this).field_N + 1;
        super.a(param0, param1, param2, param3);
    }

    final boolean a(int param0, rc param1) {
        if (param0 != -1463) {
            return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_K = null;
        field_Q = null;
        int var1 = -101 % ((param0 - 35) / 57);
        field_I = null;
        field_L = null;
        field_M = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        qf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        o var12 = null;
        o var13 = null;
        o var15 = null;
        o var16 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        super.a(param0, param1, param2, 0);
        if (param1 == param3) {
          var5 = ((kc) this).field_m + param2 - -(((kc) this).field_t >> -1175521663);
          var6 = (((kc) this).field_x >> 2147301121) + param0 - -((kc) this).field_j;
          var8 = ((kc) this).field_J.b(param3 ^ -9362);
          if (hg.field_E != var8) {
            if (db.field_u != var8) {
              if (var8 != rg.field_f) {
                if (var8 != ph.field_g) {
                  return;
                } else {
                  var12 = gb.field_k[1];
                  var12.a(-(var12.field_p >> 1223456929) + var5, -(var12.field_t >> -1670607551) + var6, 256);
                  return;
                }
              } else {
                var13 = gb.field_k[2];
                var13.a(var5 - (var13.field_p >> 129803233), -(var13.field_t >> -757397119) + var6, 256);
                return;
              }
            } else {
              var16 = gb.field_k[0];
              var9 = var16.field_q << -951560671;
              var10 = var16.field_r << -71652927;
              if (null != pk.field_Y) {
                if (var9 <= pk.field_Y.field_p) {
                  if (pk.field_Y.field_t < var10) {
                    pk.field_Y = new o(var9, var10);
                    cl.a(-116, pk.field_Y);
                    var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                    mf.e(param3 + 4096);
                    pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                    return;
                  } else {
                    cl.a(-97, pk.field_Y);
                    mi.a();
                    var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                    mf.e(param3 + 4096);
                    pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                    return;
                  }
                } else {
                  pk.field_Y = new o(var9, var10);
                  cl.a(-116, pk.field_Y);
                  var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                  mf.e(param3 + 4096);
                  pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                  return;
                }
              } else {
                pk.field_Y = new o(var9, var10);
                cl.a(-116, pk.field_Y);
                var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                mf.e(param3 + 4096);
                pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                return;
              }
            }
          } else {
            var15 = gb.field_k[0];
            var9 = var15.field_q << -951560671;
            var10 = var15.field_r << -71652927;
            if (null != pk.field_Y) {
              if (var9 <= pk.field_Y.field_p) {
                if (pk.field_Y.field_t < var10) {
                  pk.field_Y = new o(var9, var10);
                  cl.a(-116, pk.field_Y);
                  var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                  mf.e(param3 + 4096);
                  pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
                  return;
                } else {
                  cl.a(-97, pk.field_Y);
                  mi.a();
                  var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                  mf.e(param3 + 4096);
                  pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
                  return;
                }
              } else {
                pk.field_Y = new o(var9, var10);
                cl.a(-116, pk.field_Y);
                var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
                mf.e(param3 + 4096);
                pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
                return;
              }
            } else {
              pk.field_Y = new o(var9, var10);
              cl.a(-116, pk.field_Y);
              var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -((kc) this).field_N << -1580442358, 4096);
              mf.e(param3 + 4096);
              pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final String c(byte param0) {
        if (((kc) this).field_v) {
            return ((kc) this).field_J.c(-96);
        }
        if (param0 > 14) {
            return null;
        }
        field_M = null;
        return null;
    }

    kc(oe param0) {
        ((kc) this).field_J = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new wh();
        field_L = "Please try again in a few minutes.";
        field_M = "Combo Power";
    }
}
