/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends q {
    int field_m;
    int field_j;
    static int field_k;
    static long[] field_l;

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        var2 = 97 / ((param0 - -11) / 33);
        if (param1 >= 48) {
          if (param1 > 57) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_l = null;
    }

    final static byte[] a(boolean param0, Object param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dp var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        Object stackOut_10_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param1 != null) {
            if (!(param1 instanceof byte[])) {
              if (param2 == 37) {
                if (!(param1 instanceof dp)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (dp) param1;
                  stackOut_13_0 = var4.a(-21056);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                return (byte[]) (Object) stackIn_11_0;
              }
            } else {
              var3 = (byte[]) param1;
              if (param0) {
                stackOut_7_0 = ch.a(var3, (byte) 115);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = (byte[]) var3;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ui.C(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L0;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L0;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
    }

    ui(int param0, int param1) {
        ((ui) this).field_j = param1;
        ((ui) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new long[32];
        field_k = 0;
    }
}
