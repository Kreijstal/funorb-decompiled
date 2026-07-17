/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static ib field_a;
    static int[] field_d;
    static int field_b;
    static int field_c;

    final static String a(byte param0, gk param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          try {
            L0: {
              var3_int = param1.o(-1);
              if (var3_int > 80) {
                var3_int = 80;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var4 = new byte[var3_int];
              if (param0 == 90) {
                break L1;
              } else {
                ea.a(-85);
                break L1;
              }
            }
            param1.field_h = param1.field_h + jc.field_d.a(-1, 0, param1.field_h, var3_int, var4, param1.field_g);
            var5 = sc.a(var4, var3_int, param0 ^ -106, 0);
            stackOut_5_0 = (String) var5;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_7_0 = "Cabbage";
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ea.B(").append(param0).append(44);
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
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 80 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = 117;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ib();
        field_d = new int[8192];
    }
}
