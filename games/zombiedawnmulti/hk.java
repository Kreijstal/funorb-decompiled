/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int[] field_f;
    int[] field_b;
    int[] field_d;
    static boolean field_a;
    static String field_g;
    int[] field_c;
    static int field_e;

    final void a(int param0, k param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 == 7054) {
                break L1;
              } else {
                ((hk) this).field_d = null;
                break L1;
              }
            }
            L2: while (true) {
              if (((hk) this).field_b.length <= var3_int) {
                break L0;
              } else {
                ((hk) this).field_b[var3_int] = param1.d((byte) 69);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("hk.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    hk() {
        ((hk) this).field_b = new int[5];
        ((hk) this).field_c = new int[3];
        ((hk) this).field_d = new int[5];
        ((hk) this).field_f = new int[5];
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 == 39) {
            return;
        }
        hk.a((byte) -21);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Service unavailable";
    }
}
