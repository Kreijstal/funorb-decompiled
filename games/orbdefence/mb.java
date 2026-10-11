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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!param4) {
            field_b = (hg) null;
          }
          while (true) {
            param0--;
            if (param0 < 0) {
              return;
            }
            var9 = param2;
            var5 = var9;
            var6 = param1;
            var7 = param3;
            var9[var6] = (vi.a(16711422, var9[var6]) >> 1) + var7;
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("mb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
