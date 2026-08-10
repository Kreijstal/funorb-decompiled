/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static hg field_b;
    static boolean field_c;
    static bl field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 106 / ((param0 - 42) / 57);
        field_b = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, boolean param4) {
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                field_b = (hg) null;
                break L1;
              }
            }
            L2: while (true) {
              param0--;
              if (-1 < (param0 ^ -1)) {
                break L0;
              } else {
                var9 = param2;
                var5 = var9;
                var6 = param1;
                var7 = param3;
                var9[var6] = (vi.a(16711422, var9[var6]) >> 1079794145) + var7;
                param1++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("mb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
