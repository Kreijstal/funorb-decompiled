/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends fc {
    int field_i;
    int field_j;
    static String field_m;
    int field_k;
    int field_o;
    static int[] field_p;
    int field_l;
    int field_n;

    final static boolean a(byte param0) {
        return oe.field_b == rk.field_X;
    }

    public static void d(int param0) {
        field_m = null;
        field_p = null;
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        bf var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                var4 = param1;
                break L1;
              } else {
                var8 = new byte[param2];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param2) {
                    break L1;
                  } else {
                    var8[var5_int] = param1[var5_int + param0];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new bf();
            var5.a(-11);
            var5.a(var4, (long)(param2 * 8), 30654);
            var6 = new byte[64];
            var5.a(var6, 0, -513);
            stackOut_6_0 = (byte[]) var6;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("cf.C(").append(param0).append(',');
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
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + -6196 + ')');
        }
        return stackIn_7_0;
    }

    cf(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((cf) this).field_n = param3;
        ((cf) this).field_j = param0;
        ((cf) this).field_o = param5;
        ((cf) this).field_l = param4;
        ((cf) this).field_k = param1;
        ((cf) this).field_i = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Error connecting to server. Please try using a different server.";
    }
}
