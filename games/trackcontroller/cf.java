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
        if (param0 != 41) {
            field_p = (int[]) null;
        }
        return oe.field_b == rk.field_X ? true : false;
    }

    public static void d(int param0) {
        if (param0 != 29211) {
            return;
        }
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
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) >= -1) {
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
            L3: {
              if (param3 == -6196) {
                break L3;
              } else {
                field_m = (String) null;
                break L3;
              }
            }
            var5 = new bf();
            var5.a(param3 + 6185);
            var5.a(var4, (long)(param2 * 8), 30654);
            var10 = new byte[64];
            var9 = var10;
            var6 = var9;
            var5.a(var10, 0, -513);
            stackOut_8_0 = (byte[]) (var6);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4_ref);
            stackOut_10_1 = new StringBuilder().append("cf.C(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    cf(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param3;
        this.field_j = param0;
        this.field_o = param5;
        this.field_l = param4;
        this.field_k = param1;
        this.field_i = param2;
    }

    static {
        field_m = "Error connecting to server. Please try using a different server.";
    }
}
