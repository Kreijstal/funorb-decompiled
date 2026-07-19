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
        ch stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new ch(false);
              var3.field_j = param2;
              if (param1) {
                break L1;
              } else {
                fn.g(-82);
                break L1;
              }
            }
            var3.field_h = param0;
            stackOut_2_0 = (ch) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("fn.E(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11) {
        ch discarded$2 = null;
        String var13 = null;
        ok.a(param6, param10, param1, param5, param11, param7, 16777215, 12423, param2, param3, param9, param8, param4, 16777215);
        if (param0 > 84) {
          return;
        } else {
          var13 = (String) null;
          discarded$2 = fn.a(113, true, (String) null);
          return;
        }
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
        int var4 = 0;
        var4 = 57 * param2 + param0;
        if (param1 != 2147483647) {
          fn.a(42, 102, 48, -125, -26, (byte) 110, 39, -15);
          var4 = var4 << 1592357409 ^ var4;
          return -(((15731 * (var4 * var4) + 789221) * var4 - -1376312589 & 2147483647) / 262144) + 4096;
        } else {
          var4 = var4 << 1592357409 ^ var4;
          return -(((15731 * (var4 * var4) + 789221) * var4 - -1376312589 & 2147483647) / 262144) + 4096;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var7 = this.field_x.a(param0, (byte) -108);
          var3 = var7;
          if (this.field_x.field_i) {
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
          return (int[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param5 == -11) {
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
                          decompiledRegionSelector0 = 1;
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var8), "fn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_B = "Resign";
        field_A = "<%0> has been removed.";
    }
}
