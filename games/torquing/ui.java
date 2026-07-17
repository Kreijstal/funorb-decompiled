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

    public static void a() {
        field_l = null;
    }

    final static byte[] a(boolean param0, Object param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dp var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          if (param1 != null) {
            if (!(param1 instanceof byte[])) {
              if (!(param1 instanceof dp)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (dp) param1;
                stackOut_11_0 = var4.a(-21056);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              var3 = (byte[]) param1;
              if (param0) {
                int discarded$2 = 115;
                stackOut_7_0 = ch.a(var3);
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
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ui.C(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L0;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L0;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 37 + 41);
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
