/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends rg {
    static int field_F;
    static String field_E;
    static int[][] field_G;

    final static int b(int param0, int param1, int param2) {
        int var3 = -g.b((param1 - 240) * (param1 + -240) + (-320 + param2) * (-320 + param2)) + 1024;
        int var4 = 88 % ((param0 - 83) / 41);
        var3 = var3 < 0 ? 0 : var3 >> 1834559458;
        return db.field_c * var3 / 224;
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        int discarded$2 = 0;
        if (!nh.field_m) {
          if (!ee.field_b) {
            if (eo.a(param3, true, param2)) {
              return true;
            } else {
              if (!sh.field_L) {
                if (param1 <= 67) {
                  discarded$2 = sd.a((byte) 79, 66, 86);
                  return wl.a(param0, 59, param2);
                } else {
                  return wl.a(param0, 59, param2);
                }
              } else {
                return false;
              }
            }
          } else {
            return ai.a(false, param2, param3);
          }
        } else {
          return ra.field_f.a(0, pn.field_d, sj.field_p);
        }
    }

    final static boolean h(int param0) {
        boolean discarded$0 = false;
        if (param0 != 3853) {
            discarded$0 = sd.h(-41);
            return ho.a(jl.b(0), 61);
        }
        return ho.a(jl.b(0), 61);
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = param1 >> -1829295792;
        int var5 = -61 % ((73 - param0) / 44);
        int var4 = param1 & 65535;
        int var6 = param2 >> 1675141520;
        int var7 = param2 & 65535;
        return param2 * var3 + var6 * var4 - -(var7 * var4 >> 88643536);
    }

    public static void g(byte param0) {
        if (param0 != -81) {
            field_F = -88;
            field_E = null;
            field_G = (int[][]) null;
            return;
        }
        field_E = null;
        field_G = (int[][]) null;
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException runtimeException = null;
        ua var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = qi.field_a;
              if (var7 == null) {
                break L1;
              } else {
                if (!this.a(81, param5, param0, param3, param2)) {
                  break L1;
                } else {
                  L2: {
                    if (!(this.field_A instanceof vq)) {
                      break L2;
                    } else {
                      ((vq) ((Object) this.field_A)).a(var7, (byte) 5, (sd) (this));
                      qi.field_a = null;
                      if (!ZombieDawnMulti.field_E) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var7.field_A instanceof vq) {
                    ((vq) ((Object) var7.field_A)).a(var7, (byte) 5, (sd) (this));
                    qi.field_a = null;
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("sd.NA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private sd(int param0, int param1, int param2, int param3, nl param4, bj param5, cf param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_B = param6;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = "Offensive account name";
    }
}
