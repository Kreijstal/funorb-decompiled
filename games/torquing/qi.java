/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static ce field_a;
    static String[] field_e;
    static boolean field_c;
    static volatile int field_b;
    static dn field_d;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0 < 35) {
            field_d = (dn) null;
        }
    }

    final static short[] a(int param0, short[] param1, byte param2) {
        short[] var3 = null;
        RuntimeException var3_ref = null;
        short[] var4 = null;
        short[] stackIn_2_0 = null;
        short[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 60) {
              var4 = new short[param0];
              var3 = var4;
              dk.a(param1, 0, var4, 0, param0);
              stackIn_4_0 = (short[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (short[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("qi.A(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_c = true;
        field_b = -1;
        field_a = new ce();
    }
}
