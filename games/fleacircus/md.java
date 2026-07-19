/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends bb {
    static String[] field_P;
    int field_K;
    int field_N;
    static int field_L;
    int field_R;
    int field_Q;
    static boolean field_T;
    static String field_M;
    int field_O;
    int field_U;
    static boolean field_S;

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -param6 - this.field_y + (-this.field_U + param4);
              var9 = -this.field_R - this.field_z - param0 + param2;
              if (this.field_O * this.field_O > var8_int * var8_int + var9 * var9) {
                L1: {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - ik.field_G;
                    if (0.0 <= var10) {
                      break L2;
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)this.field_N;
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var10 <= 0.0) {
                    break L1;
                  } else {
                    var10 = var10 + 3.141592653589793 / (double)this.field_N;
                    break L1;
                  }
                }
                this.field_Q = (int)((double)this.field_N * var10 / 6.283185307179586);
                L3: while (true) {
                  L4: {
                    L5: {
                      if (this.field_N > this.field_Q) {
                        break L5;
                      } else {
                        this.field_Q = this.field_Q - this.field_N;
                        if (var12 != 0) {
                          break L4;
                        } else {
                          if (var12 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (-1 >= (this.field_Q ^ -1)) {
                        break L4;
                      } else {
                        this.field_Q = this.field_Q + this.field_N;
                        if (var12 == 0) {
                          continue L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
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
          L7: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var8);
            stackOut_18_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static void i(int param0) {
        j.field_o = null;
        d.field_L = false;
        int var1 = 28 / ((79 - param0) / 39);
        uk.field_a = null;
        oe.field_c = null;
        rc.field_g = null;
    }

    public static void a(byte param0) {
        field_M = null;
        field_P = null;
        if (param0 == -101) {
            return;
        }
        field_L = -125;
    }

    private md() throws Throwable {
        throw new Error();
    }

    static {
        field_P = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_L = 1;
        field_M = "Members";
    }
}
