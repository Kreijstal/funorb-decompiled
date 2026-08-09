/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static int field_a;
    static int field_b;
    static pa[] field_c;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= 49) {
            return;
        }
        field_c = (pa[]) null;
    }

    final static void a(int param0, int param1) {
        ph.field_B = 1000000000L / (long)param0;
        if (param1 == 11236) {
            return;
        }
        aj.a((byte) -89);
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_b = -114;
                break L1;
              }
            }
            L2: while (true) {
              param2--;
              if (0 > param2) {
                break L0;
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param4;
                var7 = param3;
                var9[var6] = var7 - -(sa.a(var9[var6], 16711422) >> 5820737);
                param4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("aj.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = 0;
    }
}
