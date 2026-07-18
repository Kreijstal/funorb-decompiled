/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    int field_g;
    int field_f;
    static long field_d;
    static td field_l;
    int field_h;
    static String field_i;
    static rk field_c;
    int field_b;
    int field_k;
    int field_e;
    static String field_a;
    static long field_j;

    final static void a(boolean param0, String param1, String param2, int param3) {
        try {
            lc.field_hb = param2;
            sd.field_b = param1;
            sc.a(param0, (byte) 93, bl.field_c);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ne.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 150 + ')');
        }
    }

    abstract void c(int param0, int param1);

    final static void b(int param0, int param1) {
        int discarded$0 = mg.a((byte) -78);
    }

    public static void a(int param0) {
        field_l = null;
        field_c = null;
        field_i = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        if (param1 < 6) {
          field_l = null;
          kk.field_a = 33;
          kk.field_c = 133;
          kk.field_e = 21845;
          return;
        } else {
          kk.field_a = 33;
          kk.field_c = 133;
          kk.field_e = 21845;
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static int a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            if (!param0) {
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackOut_7_0 = var3;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var3 = ma.a(-128, param1.charAt(var4)) + -var3 + (var3 << 5);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -84;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ne.I(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Game over";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = new rk();
    }
}
