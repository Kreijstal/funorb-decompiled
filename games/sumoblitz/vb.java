/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends wp {
    int field_F;
    static int field_I;
    int field_G;
    int field_K;
    static ki field_J;
    static boolean field_E;
    int field_M;
    int field_L;
    int field_H;

    public static void a(int param0) {
        if (param0 != 0) {
            field_E = false;
            field_J = null;
            return;
        }
        field_J = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 104 / ((param0 - 78) / 36);
        kt.b((byte) 108);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, -47, param2, param3, param4, param5, param6)) {
              L1: {
                if (param1 <= -42) {
                  break L1;
                } else {
                  vb.a((byte) 68, false);
                  break L1;
                }
              }
              stackIn_17_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = param5 + (-param4 + (-this.field_r - this.field_G));
                var9 = -this.field_K + -this.field_v + (-param6 + param2);
                if (this.field_F * this.field_F <= var9 * var9 + var8_int * var8_int) {
                  break L2;
                } else {
                  L3: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - s.field_m;
                    if (var10 >= 0.0) {
                      if (0.0 >= var10) {
                        break L3;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)this.field_L;
                        break L3;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)this.field_L;
                      break L3;
                    }
                  }
                  this.field_H = (int)((double)this.field_L * var10 / 6.283185307179586);
                  L4: while (true) {
                    if (this.field_L > this.field_H) {
                      L5: while (true) {
                        if (this.field_H >= 0) {
                          break L2;
                        } else {
                          this.field_H = this.field_H + this.field_L;
                          continue L5;
                        }
                      }
                    } else {
                      this.field_H = this.field_H - this.field_L;
                      continue L4;
                    }
                  }
                }
              }
              stackIn_13_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("vb.R(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        field_I = -1;
    }
}
