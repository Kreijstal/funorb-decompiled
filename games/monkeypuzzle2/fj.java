/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends t {
    static java.math.BigInteger field_F;
    static k field_E;
    int field_C;
    static boolean field_J;
    int field_H;
    int field_I;
    static ad field_B;
    int field_K;
    int field_G;
    int field_D;

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = param1 - this.field_I - (this.field_r + param6);
                var9 = -param0 + (-this.field_e - this.field_C) + param5;
                if (this.field_G * this.field_G <= var9 * var9 + var8_int * var8_int) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - rl.field_b;
                    if (var10 < 0.0) {
                      var10 = var10 - 3.141592653589793 / (double)this.field_K;
                      break L2;
                    } else {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)this.field_K;
                        break L2;
                      }
                    }
                  }
                  this.field_D = (int)(var10 * (double)this.field_K / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_K > this.field_D) {
                      L4: while (true) {
                        if (this.field_D >= 0) {
                          break L1;
                        } else {
                          this.field_D = this.field_D + this.field_K;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_D = this.field_D - this.field_K;
                      continue L3;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("fj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ch.field_d = f.field_i;
              if (255 != param3) {
                if (100 > param3) {
                  cg.field_a = lh.a(true, param1, param3);
                  break L1;
                } else {
                  if (-106 > (param3 ^ -1)) {
                    cg.field_a = lh.a(true, param1, param3);
                    break L1;
                  } else {
                    cg.field_a = jj.a(args, true);
                    break L1;
                  }
                }
              } else {
                L2: {
                  stackIn_4_0 = -89;

                  if ((dd.field_d ^ -1) <= -14) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                cg.field_a = hj.a((byte) stackIn_5_0, stackIn_5_1 != 0);
                break L1;
              }
            }
            if (param2 == -27967) {
              break L0;
            } else {
              field_F = (java.math.BigInteger) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("fj.A(");

            if (args == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    public static void c(byte param0) {
        String var2;
        field_E = null;
        if (param0 != 62) {
          var2 = (String) null;
          fj.a((String[]) null, (String) null, -117, 1);
          field_B = null;
          field_F = null;
          return;
        } else {
          field_B = null;
          field_F = null;
          return;
        }
    }

    static {
        field_F = new java.math.BigInteger("65537");
    }
}
