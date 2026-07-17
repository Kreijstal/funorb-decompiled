/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends tc {
    int field_k;
    static kl field_m;
    static String field_o;
    static String field_l;
    wp field_p;
    static String[][] field_n;

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        if (!param0) {
          int discarded$1 = fd.a(true, 15);
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param1 & ~var2;
        } else {
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param1 & ~var2;
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        field_l = null;
    }

    fd(kl param0, kl param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            ((fd) this).field_k = param2;
            ((fd) this).field_p = new wp(param2);
            tl.a((byte) -121, param1, param0);
            L1: while (true) {
              if (((fd) this).field_p.f((byte) -65)) {
                break L0;
              } else {
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fd.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Potions";
        field_l = "Show game chat from my friends";
        field_n = new String[][]{new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9]};
    }
}
