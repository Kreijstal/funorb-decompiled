/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_b;
    static int field_a;

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        rl var5 = null;
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
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 > (param3 ^ -1)) {
                  break L2;
                } else {
                  var4 = param0;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = new byte[param1];
              var4 = var8;
              var5_int = 0;
              L3: while (true) {
                if (var5_int >= param1) {
                  break L1;
                } else {
                  var8[var5_int] = param0[param3 + var5_int];
                  var5_int++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L4: {
              var5 = new rl();
              if (param2 == -5705) {
                break L4;
              } else {
                n.a(true);
                break L4;
              }
            }
            var5.a(param2 + 21003);
            var5.a(14027, (long)(param1 * 8), var4);
            var10 = new byte[64];
            var9 = var10;
            var6 = var9;
            var5.a(var10, param2 + 5821, 0);
            stackOut_8_0 = (byte[]) (var6);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4_ref);
            stackOut_10_1 = new StringBuilder().append("n.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(boolean param0) {
        if (param0) {
            n.a(true);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1) {
        wl.a(param1, param0, 170);
    }

    static {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
