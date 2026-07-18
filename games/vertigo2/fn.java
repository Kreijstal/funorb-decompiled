/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends ji {
    static pm field_y;
    static int field_z;
    static String field_B;
    static String field_A;

    final static ch a(int param0, boolean param1, String param2) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        ch stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new ch(false);
            var3.field_j = param2;
            var3.field_h = param0;
            stackOut_0_0 = (ch) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("fn.E(").append(param0).append(',').append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11) {
        ok.a(15, 14, 13, param5, param11, true, 16777215, 12423, param2, 11, param9, param8, 0, 16777215);
    }

    public static void g(int param0) {
        field_B = null;
        field_y = null;
        field_A = null;
        if (param0 == 4096) {
            return;
        }
        fn.g(36);
    }

    public fn() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        int var4 = 57 * param2 + param0;
        var4 = var4 << 1 ^ var4;
        return -(((15731 * (var4 * var4) + 789221) * var4 - -1376312589 & 2147483647) / 262144) + 4096;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var7 = ((fn) this).field_x.a(param0, (byte) -108);
          var3 = var7;
          if (((fn) this).field_x.field_i) {
            var4 = lf.field_y[param0];
            var5 = 0;
            L0: while (true) {
              if (we.field_M > var5) {
                var7[var5] = this.d(rh.field_O[var5], 2147483647, var4) % 4096;
                var5++;
                continue L0;
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var9 = param3 - param4;
            var8_int = param2 - -param4;
            var12 = param2;
            L1: while (true) {
              if (var8_int <= var12) {
                var11 = param0 + -param4;
                var10 = param1 - -param4;
                var12 = param3;
                L2: while (true) {
                  if (var12 <= var9) {
                    var12 = var8_int;
                    L3: while (true) {
                      if (var9 < var12) {
                        break L0;
                      } else {
                        var18 = vl.field_e[var12];
                        ki.a(-87, param1, var18, var10, param7);
                        ki.a(-90, var10, var18, var11, param6);
                        ki.a(-83, var11, var18, param0, param7);
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    ki.a(-83, param1, vl.field_e[var12], param0, param7);
                    var12--;
                    continue L2;
                  }
                }
              } else {
                ki.a(-75, param1, vl.field_e[var12], param0, param7);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var8, "fn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + -11 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Resign";
        field_A = "<%0> has been removed.";
    }
}
