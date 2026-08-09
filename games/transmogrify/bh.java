/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static int field_c;
    static int[] field_a;
    static String[] field_b;

    final static fc a(int param0, String param1) {
        RuntimeException var2 = null;
        fc stackIn_2_0 = null;
        fc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -64) {
              stackIn_4_0 = new fc(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("bh.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static ti[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 > -109) {
          field_b = (String[]) null;
          return nj.a(1, param4, param2, 3, 1, param3, 103, 1, param0);
        } else {
          return nj.a(1, param4, param2, 3, 1, param3, 103, 1, param0);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 88) {
            field_c = -60;
        }
    }

    static {
        field_c = 0;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
