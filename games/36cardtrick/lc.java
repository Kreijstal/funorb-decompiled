/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static uf[] field_a;
    static long field_b;

    public static void b(int param0) {
        if (param0 <= 75) {
            lc.a((byte) -52);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        e.a((byte) 112);
        gh.a(param0, 31888);
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -73) {
          L0: {
            lc.b(-42);
            if ((h.field_F ^ -1) >= -251) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((h.field_F ^ -1) >= -251) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            var2_int = param1.charAt(0);
            if (param0 == -33) {
              var3 = 1;
              L1: while (true) {
                if (param1.length() <= var3) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var2_int != param1.charAt(var3)) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("lc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, vg param2, int param3, vg param4, int param5) {
        e.field_i = param5;
        a.field_o = param3;
        if (param1 != 4) {
            return;
        }
        try {
            tc.field_b = param0;
            ie.field_m = param2;
            wd.field_b = param4;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "lc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_a = new uf[3];
    }
}
