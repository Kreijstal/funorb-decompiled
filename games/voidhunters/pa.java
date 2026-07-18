/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static llb field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0, byte param1, int param2) {
        faa var3 = null;
        Object var4 = null;
        if (param1 >= -82) {
          var4 = null;
          boolean discarded$2 = pa.a(-92, -5, (asb) null, 15);
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        } else {
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + sh.a("\n", "%0a", param0, 0));
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 2) {
            field_a = null;
        }
    }

    final static boolean a(int param0, int param1, asb param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                pa.a(36);
                break L1;
              }
            }
            var5 = param2.a(param0, param3, (byte) 13);
            var4 = var5;
            if (var5 != null) {
              wab.a(0, var5);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        lob discarded$0 = new lob();
        field_c = "Hull piece";
    }
}
