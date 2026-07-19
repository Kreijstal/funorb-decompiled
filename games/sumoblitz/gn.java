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
        byte[] discarded$6 = null;
        dj discarded$7 = null;
        dj discarded$8 = null;
        byte[] var3 = null;
        if (!param1) {
          var3 = (byte[]) null;
          discarded$6 = gn.a((byte[]) null, (byte) -29, -53, 2);
          discarded$7 = fe.a(-125, rc.field_l[param0]);
          return;
        } else {
          discarded$8 = fe.a(-125, rc.field_l[param0]);
          return;
        }
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
              L3: {
                if ((param2 ^ -1) < -1) {
                  break L3;
                } else {
                  var4 = param0;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var8 = new byte[param3];
              var4 = var8;
              var5_int = 0;
              L4: while (true) {
                if (var5_int >= param3) {
                  break L2;
                } else {
                  var8[var5_int] = param0[var5_int + param2];
                  var5_int++;
                  if (var7 == 0) {
                    continue L4;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var5 = new np();
            var5.b(-9);
            var5.a(var4, 7, (long)(param3 * 8));
            var6 = new byte[64];
            var5.a(0, var6, -25);
            stackOut_8_0 = (byte[]) (var6);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4_ref);
            stackOut_10_1 = new StringBuilder().append("gn.B(");
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(boolean param0) {
        byte[] discarded$0 = null;
        field_g = null;
        if (!param0) {
            byte[] var2 = (byte[]) null;
            discarded$0 = gn.a((byte[]) null, (byte) -96, -56, 90);
        }
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "Please enter your age in years";
    }
}
