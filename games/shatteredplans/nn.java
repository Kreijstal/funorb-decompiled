/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static byte[][][] field_c;
    static String field_a;

    public static void a(byte param0) {
        int var1 = 50 / ((param0 - 1) / 38);
        field_c = (byte[][][]) null;
        field_a = null;
    }

    final static int a(ln[] param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = ti.a((byte) 83, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -87;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("nn.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = wp.a((byte) -127, param1, param2);
            var4 = 127 % ((-49 - param0) / 45);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                if (param1.length() > var5) {
                  if (ce.a(param1.charAt(var5), (byte) 101)) {
                    var5++;
                    continue L1;
                  } else {
                    stackIn_10_0 = as.field_i;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("nn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_a = "System defensive strength";
    }
}
