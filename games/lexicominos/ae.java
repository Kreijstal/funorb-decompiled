/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends kf {
    static int[] field_M;
    int field_L;
    int field_H;
    static dg field_E;
    int field_I;
    int field_K;
    int field_G;
    int field_F;
    static pk[] field_J;

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              lf.a(param4, param2, param1 - -1, 10000536);
              lf.a(param4, param2 + param3, param1 - -1, 12105912);
              var5_int = 1;
              if (lf.field_c <= var5_int + param2) {
                break L1;
              } else {
                var5_int = lf.field_c - param2;
                break L1;
              }
            }
            L2: {
              var6 = param3;
              if (param2 - -var6 > lf.field_h) {
                var6 = lf.field_h + -param2;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                if (param0) {
                  break L0;
                } else {
                  field_J = null;
                  return;
                }
              } else {
                var8 = 48 * var7 / param3 + 152;
                var9 = var8 | (var8 << 16 | var8 << 8);
                lf.field_b[param4 + lf.field_f * (var7 + param2)] = var9;
                lf.field_b[param4 + lf.field_f * (param2 + var7) + param1] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var5, "ae.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean i(int param0) {
        if (param0 != 0) {
            return true;
        }
        return pb.c(true);
    }

    public static void j(int param0) {
        field_J = null;
        field_E = null;
        field_M = null;
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -((ae) this).field_t - (param5 + ((ae) this).field_L - param6);
              var9 = param3 - ((ae) this).field_F - (param4 + ((ae) this).field_o);
              if (var8_int * var8_int + var9 * var9 < ((ae) this).field_I * ((ae) this).field_I) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - wl.field_n;
                  if (var10 < 0.0) {
                    var10 = var10 - 3.141592653589793 / (double)((ae) this).field_K;
                    break L1;
                  } else {
                    if (var10 > 0.0) {
                      var10 = var10 + 3.141592653589793 / (double)((ae) this).field_K;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                ((ae) this).field_G = (int)((double)((ae) this).field_K * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((ae) this).field_G < ((ae) this).field_K) {
                    L3: while (true) {
                      if (0 <= ((ae) this).field_G) {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        ((ae) this).field_G = ((ae) this).field_G + ((ae) this).field_K;
                        continue L3;
                      }
                    }
                  } else {
                    ((ae) this).field_G = ((ae) this).field_G - ((ae) this).field_K;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("ae.VA(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_16_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[12];
        field_E = new dg();
    }
}
