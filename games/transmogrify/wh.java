/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends lj {
    int field_B;
    int field_H;
    int field_A;
    int field_G;
    static nk field_I;
    int field_C;
    static String[] field_F;
    int field_D;

    final static vd a() {
        int var1 = 0;
        if (null == fa.field_i) {
          fa.field_i = new vd();
          fa.field_i.a(-71, vd.field_h);
          fa.field_i.field_n = 2763306;
          fa.field_i.field_c = 6;
          fa.field_i.field_e = 4;
          fa.field_i.field_l = 0;
          fa.field_i.field_j = 14;
          fa.field_i.field_m = al.field_i;
          fa.field_i.field_g = 7697781;
          fa.field_i.field_i = 5;
          var1 = -13;
          return fa.field_i;
        } else {
          var1 = -13;
          return fa.field_i;
        }
    }

    public static void h() {
        field_F = null;
        field_I = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (super.b(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -((wh) this).field_H - param3 - (((wh) this).field_p - param0);
              var9 = param5 + (-((wh) this).field_G + -param6 + -((wh) this).field_n);
              if (var8_int * var8_int - -(var9 * var9) < ((wh) this).field_A * ((wh) this).field_A) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - ih.field_d;
                  if (0.0 <= var10) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)((wh) this).field_C;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((wh) this).field_C;
                    break L1;
                  }
                }
                ((wh) this).field_B = (int)((double)((wh) this).field_C * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((wh) this).field_B < ((wh) this).field_C) {
                    L3: while (true) {
                      if (((wh) this).field_B >= 0) {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        ((wh) this).field_B = ((wh) this).field_B + ((wh) this).field_C;
                        continue L3;
                      }
                    }
                  } else {
                    ((wh) this).field_B = ((wh) this).field_B - ((wh) this).field_C;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              if (param4 == -30386) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("wh.O(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void e() {
        tj.field_w[46] = 72;
        tj.field_w[61] = 27;
        tj.field_w[91] = 42;
        tj.field_w[59] = 57;
        tj.field_w[44] = 71;
        tj.field_w[47] = 73;
        tj.field_w[45] = 26;
        tj.field_w[192] = 28;
        tj.field_w[520] = 59;
        tj.field_w[222] = 58;
        int var1 = -17;
        tj.field_w[92] = 74;
        tj.field_w[93] = 43;
    }

    final static void f() {
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var1 = null;
            var2 = 11;
            L1: while (true) {
              L2: {
                if (var2 < 0) {
                  break L2;
                } else {
                  var1 = (Object) (Object) od.field_g.field_e[var2];
                  if (od.field_g.field_e[var2] != null) {
                    break L2;
                  } else {
                    var2--;
                    continue L1;
                  }
                }
              }
              eh.a((sj) var1, 67);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw ch.a((Throwable) var1, "wh.C(" + 104 + 41);
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new nk(3);
    }
}
