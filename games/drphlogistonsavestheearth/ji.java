/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_e;
    static fe field_c;
    static nh field_b;
    static int field_f;
    static int[] field_a;
    static jb field_d;

    public static void a() {
        field_e = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static double a(int param0, double param1) {
        if (param0 != 65535) {
          field_c = null;
          return oj.field_a[(int)(param1 * 32768.0 / 3.141592653589793) & 65535];
        } else {
          return oj.field_a[(int)(param1 * 32768.0 / 3.141592653589793) & 65535];
        }
    }

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        bh var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
              if (param1 instanceof bh) {
                var4 = (bh) param1;
                stackOut_11_0 = var4.c(19707);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                L0: {
                  if (param0 == 23436) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) param1;
              if (!param2) {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = qd.a((byte) 111, var3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ji.B(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_c = new fe();
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
