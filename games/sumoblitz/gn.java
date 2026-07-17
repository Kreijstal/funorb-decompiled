/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    int field_e;
    static String field_g;
    static boolean field_b;
    String field_f;
    ki field_a;
    static boolean field_d;
    String field_h;
    String field_c;

    final static void a(int param0, boolean param1) {
        if (!param1) {
            Object var3 = null;
            byte[] discarded$0 = gn.a((byte[]) null, (byte) -29, -53, 2);
        }
        dj discarded$1 = fe.a(-125, rc.field_l[param0]);
    }

    final static byte[] a(byte[] param0, byte param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        np var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -98) {
                break L1;
              } else {
                gn.a(-28, false);
                break L1;
              }
            }
            L2: {
              if (param2 > 0) {
                var8 = new byte[param3];
                var4 = var8;
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= param3) {
                    break L2;
                  } else {
                    var8[var5_int] = param0[var5_int + param2];
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                var4 = param0;
                break L2;
              }
            }
            var5 = new np();
            var5.b(-9);
            var5.a(var4, 7, (long)(param3 * 8));
            var6 = new byte[64];
            var5.a(0, var6, -25);
            stackOut_8_0 = (byte[]) var6;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("gn.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    public static void a(boolean param0) {
        field_g = null;
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Please enter your age in years";
    }
}
