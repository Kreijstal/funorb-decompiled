/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ig {
    int field_N;
    int field_F;
    int field_I;
    int field_J;
    static oj field_G;
    int field_L;
    int field_H;
    static pb[] field_P;
    static int field_O;
    static int field_M;
    static float field_K;

    public static void g(int param0) {
        field_P = null;
        if (param0 != 0) {
            return;
        }
        field_G = null;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param5 >= 24) {
                break L1;
              } else {
                this.field_J = -18;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, param3, param4, (byte) 67, param6)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var8_int = param1 - (this.field_L + this.field_w + param4);
              var9 = param3 + (-this.field_k + (-param6 + -this.field_F));
              if (this.field_I * this.field_I > var8_int * var8_int - -(var9 * var9)) {
                L2: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - sj.field_I;
                  if (var10 < 0.0) {
                    var10 = var10 - 3.141592653589793 / (double)this.field_N;
                    break L2;
                  } else {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)this.field_N;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_J = (int)(var10 * (double)this.field_N / 6.283185307179586);
                L3: while (true) {
                  if (this.field_N > this.field_J) {
                    L4: while (true) {
                      if ((this.field_J ^ -1) <= -1) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_J = this.field_J + this.field_N;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_J = this.field_J - this.field_N;
                    continue L3;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("fg.P(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private fg() throws Throwable {
        throw new Error();
    }

    static {
        field_G = new oj();
    }
}
