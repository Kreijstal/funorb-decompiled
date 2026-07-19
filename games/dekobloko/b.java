/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends ek {
    private int field_O;
    private mb field_N;
    static int[] field_M;
    static String field_Q;
    int field_K;
    int field_L;
    static int[] field_P;

    public static void a(int param0) {
        field_Q = null;
        field_P = null;
        field_M = null;
    }

    final int b(int param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (this.field_N.a(126) > param1) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_P = (int[]) null;
                  break L1;
                }
              }
              return this.field_N.b(param1, 0);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final static int[] h(int param0) {
        int var1 = 110 / ((-90 - param0) / 32);
        return new int[8];
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var2_int = ul.a(d.field_b, te.field_p, -28705);
              if (var2_int != 1) {
                break L1;
              } else {
                param1 = "<img=0>" + param1;
                break L1;
              }
            }
            L2: {
              if (var2_int == 2) {
                param1 = "<img=1>" + param1;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 >= 78) {
              stackOut_8_0 = (String) (param1);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_6_0 = (String) null;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("b.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              L1: {
                var8_int = -param5 + param1 + -this.field_L;
                var9 = this.field_t + -(this.field_L * 2);
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_O / var9;
                if (param3 != 1) {
                  if (2 == param3) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_N.a(114)) {
                        if (var11 >= 0) {
                          this.field_N.c(-91, var11);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var13 = this.field_N.b(var12, 0) + -var8_int;
                        var13 = var13 * var13;
                        if (var13 < var10) {
                          var10 = var13;
                          var11 = var12;
                          var12++;
                          continue L4;
                        } else {
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_N.a(var8_int, false);
                  break L3;
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var8);
            stackOut_23_1 = new StringBuilder().append("b.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final int i(int param0) {
        String discarded$0 = null;
        if (param0 != -15317) {
            String var3 = (String) null;
            discarded$0 = b.a(-69, (String) null);
        }
        return this.field_O;
    }

    final int b(boolean param0) {
        if (!param0) {
            return -57;
        }
        return this.field_N.a(-77);
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        field_M = new int[8192];
        field_Q = "Master Challenge";
    }
}
