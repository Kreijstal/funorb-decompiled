/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kb extends ri {
    static java.math.BigInteger field_p;
    static volatile boolean field_l;
    static String field_o;
    static tf field_q;
    static int[] field_m;
    static oh field_n;

    final static tf a(int param0, boolean param1) {
        tf[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        tf[] var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        int discarded$2 = -26481;
        var5 = rh.d();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_c != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param1 > 104) {
                break L1;
              } else {
                kb.b(true);
                break L1;
              }
            }
            stackOut_2_0 = pi.field_g.a(param0, (byte) 118, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("kb.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_n = null;
        field_m = null;
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0) {
            field_o = null;
        }
    }

    kb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
        field_p = new java.math.BigInteger("65537");
        field_m = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_q = new tf(13, 0, 1, 0);
        field_n = null;
    }
}
