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
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -param6 - this.field_y + (-this.field_U + param4);
              var9 = -this.field_R - this.field_z - param0 + param2;
              if (this.field_O * this.field_O > var8_int * var8_int + var9 * var9) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - ik.field_G;
                  if (0.0 <= var10) {
                    if (var10 <= 0.0) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)this.field_N;
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)this.field_N;
                    break L1;
                  }
                }
                this.field_Q = (int)((double)this.field_N * var10 / 6.283185307179586);
                L2: while (true) {
                  if (this.field_N > this.field_Q) {
                    L3: while (true) {
                      if (-1 >= (this.field_Q ^ -1)) {
                        stackIn_15_0 = 1;
                        break L0;
                      } else {
                        this.field_Q = this.field_Q + this.field_N;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_Q = this.field_Q - this.field_N;
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
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
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
