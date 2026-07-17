/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static int field_b;
    static vn field_a;
    private int[] field_c;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = '*';
        }
        var4 = -98 % ((param0 - 11) / 59);
        return new String(var3);
    }

    public static void a(int param0) {
        if (param0 > -74) {
            mo.a(-60);
        }
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = (((mo) this).field_c.length >> 1) - param0;
        var4 = var3 & param1;
        L0: while (true) {
          var5 = ((mo) this).field_c[1 + (var4 - -var4)];
          if (var5 == -1) {
            return -1;
          } else {
            if (param1 != ((mo) this).field_c[var4 + var4]) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    mo(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> 1)) {
                ((mo) this).field_c = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = var2_int - 1 & param0[var3];
                        L4: while (true) {
                          if (((mo) this).field_c[var4 - -var4 + 1] == -1) {
                            ((mo) this).field_c[var4 - -var4] = param0[var3];
                            ((mo) this).field_c[var4 - (-var4 - 1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((mo) this).field_c[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("mo.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static StringBuilder a(int param0, int param1, char param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param0 == 0) {
                break L1;
              } else {
                var7 = null;
                StringBuilder discarded$2 = mo.a(19, -61, 'ￊ', (StringBuilder) null);
                break L1;
              }
            }
            param3.setLength(param1);
            var5 = var4_int;
            L2: while (true) {
              if (var5 >= param1) {
                stackOut_6_0 = (StringBuilder) param3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param3.setCharAt(var5, param2);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("mo.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    static {
    }
}
