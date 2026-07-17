/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends pc {
    int field_K;
    int field_B;
    static int field_E;
    int field_D;
    int field_I;
    static dl field_H;
    int field_C;
    int field_J;
    static int field_F;

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
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
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                field_E = -37;
                break L1;
              }
            }
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = param6 + -((pa) this).field_J + -((pa) this).field_r + -param0;
              var9 = param1 - (((pa) this).field_K + (param4 + ((pa) this).field_j));
              if (((pa) this).field_I * ((pa) this).field_I > var8_int * var8_int - -(var9 * var9)) {
                L2: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - lk.field_a;
                  if (0.0 <= var10) {
                    if (var10 <= 0.0) {
                      break L2;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((pa) this).field_D;
                      break L2;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((pa) this).field_D;
                    break L2;
                  }
                }
                ((pa) this).field_B = (int)((double)((pa) this).field_D * var10 / 6.283185307179586);
                L3: while (true) {
                  if (((pa) this).field_B < ((pa) this).field_D) {
                    L4: while (true) {
                      if (((pa) this).field_B >= 0) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        ((pa) this).field_B = ((pa) this).field_B + ((pa) this).field_D;
                        continue L4;
                      }
                    }
                  } else {
                    ((pa) this).field_B = ((pa) this).field_B - ((pa) this).field_D;
                    continue L3;
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
          L5: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("pa.KA(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final static void a(f[][] param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 <= -21) {
                break L1;
              } else {
                pa.e((byte) 22);
                break L1;
              }
            }
            var4_int = -param2 + (param0.length + -2);
            L2: while (true) {
              if (var4_int < param2 + 1) {
                break L0;
              } else {
                var5 = 1 + param1;
                L3: while (true) {
                  if (var5 >= -1 + (-param1 + param0[0].length)) {
                    var4_int--;
                    continue L2;
                  } else {
                    param0[var4_int][var5].b(105, var4_int, param0, var5);
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("pa.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private pa() throws Throwable {
        throw new Error();
    }

    public static void e(byte param0) {
        if (param0 >= -90) {
            field_F = -63;
        }
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 56;
    }
}
