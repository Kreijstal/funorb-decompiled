/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends rm {
    static int field_G;
    static sa field_M;
    static tk field_H;
    private ia field_I;
    private int field_K;
    static af field_N;
    static boolean field_L;
    static int field_J;

    public static void a(byte param0) {
        field_N = null;
        field_H = null;
        field_M = null;
        if (param0 <= 33) {
            gg.a((byte) -35);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        fd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hj var13 = null;
        hj var14 = null;
        hj var15 = null;
        hj var16 = null;
        var11 = HoldTheLine.field_D;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = (((gg) this).field_x >> 1) + (param2 + ((gg) this).field_k);
          var6 = param1 - -((gg) this).field_o - -(((gg) this).field_u >> 1);
          var8 = ((gg) this).field_I.b(-7447);
          if (hh.field_d == var8) {
            var16 = ef.field_i[0];
            var9 = var16.field_o << 1;
            var10 = var16.field_v << 1;
            if (le.field_m != null) {
              if (var9 <= le.field_m.field_s) {
                if (le.field_m.field_y >= var10) {
                  hf.a(le.field_m, -1);
                  tc.c();
                  var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -((gg) this).field_K << 10, 4096);
                  int discarded$8 = -10;
                  dm.b();
                  le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
                  return;
                } else {
                  le.field_m = new hj(var9, var10);
                  hf.a(le.field_m, -1);
                  var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -((gg) this).field_K << 10, 4096);
                  int discarded$9 = -10;
                  dm.b();
                  le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
                  return;
                }
              } else {
                le.field_m = new hj(var9, var10);
                hf.a(le.field_m, -1);
                var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -((gg) this).field_K << 10, 4096);
                int discarded$10 = -10;
                dm.b();
                le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
                return;
              }
            } else {
              le.field_m = new hj(var9, var10);
              hf.a(le.field_m, -1);
              var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -((gg) this).field_K << 10, 4096);
              int discarded$11 = -10;
              dm.b();
              le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
              return;
            }
          } else {
            if (var8 != um.field_a) {
              if (g.field_k == var8) {
                var13 = ef.field_i[2];
                var13.b(-(var13.field_s >> 1) + var5, -(var13.field_y >> 1) + var6, 256);
                return;
              } else {
                L0: {
                  if (tg.field_d != var8) {
                    break L0;
                  } else {
                    var14 = ef.field_i[1];
                    var14.b(-(var14.field_s >> 1) + var5, var6 - (var14.field_y >> 1), 256);
                    break L0;
                  }
                }
                return;
              }
            } else {
              var15 = ef.field_i[0];
              var9 = var15.field_o << 1;
              var10 = var15.field_v << 1;
              if (le.field_m != null) {
                if (var9 <= le.field_m.field_s) {
                  if (le.field_m.field_y >= var10) {
                    hf.a(le.field_m, -1);
                    tc.c();
                    var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -((gg) this).field_K << 10, 4096);
                    int discarded$12 = -10;
                    dm.b();
                    le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                    return;
                  } else {
                    le.field_m = new hj(var9, var10);
                    hf.a(le.field_m, -1);
                    var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -((gg) this).field_K << 10, 4096);
                    int discarded$13 = -10;
                    dm.b();
                    le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                    return;
                  }
                } else {
                  le.field_m = new hj(var9, var10);
                  hf.a(le.field_m, -1);
                  var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -((gg) this).field_K << 10, 4096);
                  int discarded$14 = -10;
                  dm.b();
                  le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                  return;
                }
              } else {
                le.field_m = new hj(var9, var10);
                hf.a(le.field_m, -1);
                var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -((gg) this).field_K << 10, 4096);
                int discarded$15 = -10;
                dm.b();
                le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final String f(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (!((gg) this).field_p) {
            return null;
          } else {
            return ((gg) this).field_I.b((byte) -59);
          }
        } else {
          var3 = null;
          ((gg) this).a(103, (n) null, 21, (byte) -77);
          if (!((gg) this).field_p) {
            return null;
          } else {
            return ((gg) this).field_I.b((byte) -59);
          }
        }
    }

    final boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == -25823) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              String discarded$2 = ((gg) this).f(84);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gg.NB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, n param1, int param2, byte param3) {
        try {
            ((gg) this).field_K = ((gg) this).field_K + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "gg.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    gg(ia param0) {
        try {
            ((gg) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 200;
        field_M = new sa();
        field_J = 0;
    }
}
