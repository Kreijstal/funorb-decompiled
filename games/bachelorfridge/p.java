/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends pu {
    static sga field_n;
    static long[] field_l;
    static String field_m;
    static sna field_o;

    final static void c(int param0) {
        int var2 = 3;
        gb var1 = (gb) (Object) ja.field_s.b((byte) 90);
        if (var1 == null) {
            vc.a((byte) -72);
            return;
        }
        pf var3 = ig.field_m;
        int discarded$0 = var3.f(-64);
        int discarded$1 = var3.f(48);
        int discarded$2 = var3.f(-108);
        int discarded$3 = var3.f(111);
        var1.a(false);
    }

    final static void a(int param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 256;
            var4 = new int[256];
            var5 = 0;
            L1: while (true) {
              if (var5 >= 256) {
                var3_int += 256;
                var7 = 0;
                var5 = var7;
                L2: while (true) {
                  if (var7 >= 256) {
                    break L0;
                  } else {
                    param1[var3_int] = (byte)(param1[var3_int] + -2);
                    var3_int = var3_int + var4[var7];
                    var7++;
                    continue L2;
                  }
                }
              } else {
                int incrementValue$2 = var3_int;
                var3_int++;
                var4[var5] = dda.a(255, (int) param1[incrementValue$2]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("p.B(").append(2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 256 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
            p.b(111);
        }
        field_l = null;
        field_n = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new long[1000];
        field_m = "Ask to join <%0>'s game";
    }
}
