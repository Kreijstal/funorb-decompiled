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

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static double a(int param0, double param1) {
        if (param0 == 65535) {
          return oj.field_a[(int)(param1 * 32768.0 / 3.141592653589793) & 65535];
        }
        field_c = (fe) null;
        return oj.field_a[(int)(param1 * 32768.0 / 3.141592653589793) & 65535];
    }

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        bh var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (!param2) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            stackIn_6_0 = qd.a((byte) 111, var3);
            return stackIn_6_0;
          }
          if (param1 instanceof bh) {
            var4 = (bh) (param1);
            stackIn_12_0 = var4.c(19707);
            return stackIn_12_0;
          }
          if (param0 != 23436) {
            ji.a(52, 1.1461485280701165);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ji.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = new int[8192];
        field_c = new fe();
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
