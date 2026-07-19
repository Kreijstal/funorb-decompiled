/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends rj {
    int field_E;
    int field_z;
    int field_C;
    int field_B;
    int field_F;
    int field_A;
    static String field_G;

    public static void b(int param0) {
        field_G = null;
        if (param0 == 0) {
            return;
        }
        field_G = (String) null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
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
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a(112, param1, param2, param3, param4, param5, param6)) {
              L1: {
                if (param0 > 70) {
                  break L1;
                } else {
                  rr.b(-11);
                  break L1;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = param6 - this.field_i - param1 - this.field_E;
                var9 = -param2 - (this.field_n - (-this.field_C + param3));
                if (this.field_F * this.field_F <= var8_int * var8_int + var9 * var9) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var10 = Math.atan2((double)var9, (double)var8_int) - uca.field_b;
                      if (0.0 > var10) {
                        break L4;
                      } else {
                        if (var10 <= 0.0) {
                          break L3;
                        } else {
                          var10 = var10 + 3.141592653589793 / (double)this.field_B;
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var10 = var10 - 3.141592653589793 / (double)this.field_B;
                    break L3;
                  }
                  this.field_A = (int)(var10 * (double)this.field_B / 6.283185307179586);
                  L5: while (true) {
                    L6: {
                      if (this.field_B > this.field_A) {
                        break L6;
                      } else {
                        this.field_A = this.field_A - this.field_B;
                        if (var12 != 0) {
                          break L2;
                        } else {
                          if (var12 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: while (true) {
                      if ((this.field_A ^ -1) <= -1) {
                        break L2;
                      } else {
                        this.field_A = this.field_A + this.field_B;
                        if (var12 == 0) {
                          continue L7;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("rr.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private rr() throws Throwable {
        throw new Error();
    }

    static {
        field_G = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
