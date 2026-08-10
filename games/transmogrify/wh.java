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

    final static vd a(byte param0) {
        int var1;
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
          var1 = 40 / ((param0 - 72) / 54);
          return fa.field_i;
        } else {
          var1 = 40 / ((param0 - 72) / 54);
          return fa.field_i;
        }
    }

    public static void h(int param0) {
        if (param0 != 43) {
            return;
        }
        field_F = null;
        field_I = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (super.b(param0, param1, param2, param3, param4 ^ 0, param5, param6)) {
              var8_int = -this.field_H - param3 - (this.field_p - param0);
              var9 = param5 + (-this.field_G + -param6 + -this.field_n);
              if (var8_int * var8_int - -(var9 * var9) < this.field_A * this.field_A) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - ih.field_d;
                  if (0.0 <= var10) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)this.field_C;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)this.field_C;
                    break L1;
                  }
                }
                this.field_B = (int)((double)this.field_C * var10 / 6.283185307179586);
                L2: while (true) {
                  if (this.field_B < this.field_C) {
                    L3: while (true) {
                      if (this.field_B >= 0) {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_B = this.field_B + this.field_C;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_B = this.field_B - this.field_C;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              if (param4 == -30386) {
                stackIn_21_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_19_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var8);

            stackIn_24_1 = new StringBuilder().append("wh.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static void e(byte param0) {
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
        int var1 = 17 / ((param0 - 2) / 42);
        tj.field_w[92] = 74;
        tj.field_w[93] = 43;
    }

    final static void f(byte param0) {
        sj dupTemp$1 = null;
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              if (param0 == 104) {
                break L1;
              } else {
                wh.h(86);
                break L1;
              }
            }
            var2 = 11;
            L2: while (true) {
              L3: {
                if ((var2 ^ -1) > -1) {
                  break L3;
                } else {
                  dupTemp$1 = od.field_g.field_e[var2];
                  var1 = dupTemp$1;
                  if (dupTemp$1 != null) {
                    break L3;
                  } else {
                    var2--;
                    continue L2;
                  }
                }
              }
              eh.a((sj) (var1), 67);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (var1), "wh.C(" + param0 + ')');
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        field_I = new nk(3);
    }
}
