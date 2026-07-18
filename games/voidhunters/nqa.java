/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nqa {
    static boolean field_c;
    static boolean[][] field_b;
    static volatile boolean field_a;

    final static Object a(ij param0) {
        ksa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ksa stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ksa stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var3 = VoidHunters.field_G;
        try {
          if (ls.field_q) {
            if (param0 != null) {
              var2 = param0.d(0);
              L0: while (true) {
                if (var2 != null) {
                  if (!VoidHunters.a(true, (Object) (Object) var2)) {
                    var2 = param0.a((byte) 98);
                    continue L0;
                  } else {
                    stackOut_10_0 = (ksa) var2;
                    stackIn_11_0 = stackOut_10_0;
                    return (Object) (Object) stackIn_11_0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("nqa.B(");
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
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 12642 + ')');
        }
    }

    public static void a() {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = true;
    }
}
