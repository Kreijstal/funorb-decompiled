/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends wd {
    static eh field_C;
    int field_I;
    int field_H;
    int field_J;
    static mf field_B;
    int field_F;
    int field_D;
    int field_K;

    public static void a(boolean param0) {
        field_B = null;
        field_C = null;
        if (!param0) {
            return;
        }
        CharSequence var2 = (CharSequence) null;
        fh.a((byte) 84, (CharSequence) null);
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 73) {
              stackIn_4_0 = f.a((byte) 108, param1, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("fh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = param3 - (this.field_H + param2 + this.field_r);
                var9 = -param6 - (this.field_i + (this.field_D - param5));
                if (this.field_I * this.field_I <= var8_int * var8_int - -(var9 * var9)) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - q.field_L;
                    if (var10 < 0.0) {
                      var10 = var10 - 3.141592653589793 / (double)this.field_K;
                      break L2;
                    } else {
                      if (0.0 >= var10) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)this.field_K;
                        break L2;
                      }
                    }
                  }
                  this.field_J = (int)((double)this.field_K * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_J < this.field_K) {
                      L4: while (true) {
                        if (this.field_J >= 0) {
                          break L1;
                        } else {
                          this.field_J = this.field_J + this.field_K;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_J = this.field_J - this.field_K;
                      continue L3;
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
          L5: {
            var8 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("fh.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    static {
        field_C = new eh(15, 0, 1, 0);
    }
}
