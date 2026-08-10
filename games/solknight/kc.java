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
        try {
            this.field_N = this.field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "kc.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, rc param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1463) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kc.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
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
        int var5;
        int var6;
        qf var8;
        int var9;
        int var10;
        int var11;
        o var12;
        o var13;
        o var15;
        o var16;
        var11 = SolKnight.field_L ? 1 : 0;
        super.a(param0, param1, param2, 0);
        if (param1 == param3) {
          var5 = this.field_m + param2 - -(this.field_t >> -1175521663);
          var6 = (this.field_x >> 2147301121) + param0 - -this.field_j;
          var8 = this.field_J.b(param3 ^ -9362);
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
                    var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -this.field_N << -1580442358, 4096);
                    mf.e(param3 + 4096);
                    pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                    return;
                  } else {
                    cl.a(-97, pk.field_Y);
                    mi.a();
                    var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -this.field_N << -1580442358, 4096);
                    mf.e(param3 + 4096);
                    pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                    return;
                  }
                } else {
                  pk.field_Y = new o(var9, var10);
                  cl.a(-116, pk.field_Y);
                  var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -this.field_N << -1580442358, 4096);
                  mf.e(param3 + 4096);
                  pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
                  return;
                }
              } else {
                pk.field_Y = new o(var9, var10);
                cl.a(-116, pk.field_Y);
                var16.b(112, 144, var16.field_q << 158897700, var16.field_r << -1606311388, -this.field_N << -1580442358, 4096);
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
                  var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -this.field_N << -1580442358, 4096);
                  mf.e(param3 + 4096);
                  pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
                  return;
                } else {
                  cl.a(-97, pk.field_Y);
                  mi.a();
                  var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -this.field_N << -1580442358, 4096);
                  mf.e(param3 + 4096);
                  pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
                  return;
                }
              } else {
                pk.field_Y = new o(var9, var10);
                cl.a(-116, pk.field_Y);
                var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -this.field_N << -1580442358, 4096);
                mf.e(param3 + 4096);
                pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
                return;
              }
            } else {
              pk.field_Y = new o(var9, var10);
              cl.a(-116, pk.field_Y);
              var15.b(112, 144, var15.field_q << 158897700, var15.field_r << -1606311388, -this.field_N << -1580442358, 4096);
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
        if (this.field_v) {
            return this.field_J.c(-96);
        }
        if (param0 > 14) {
            return null;
        }
        field_M = (String) null;
        return null;
    }

    kc(oe param0) {
        try {
            this.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = new wh();
        field_L = "Please try again in a few minutes.";
        field_M = "Combo Power";
    }
}
