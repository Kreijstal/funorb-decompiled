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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = stellarshard.field_B;
        try {
          if (!param1) {
            field_b = -114;
          }
          while (true) {
            param2--;
            if (0 > param2) {
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param3;
            var9[var6] = var7 + (sa.a(var9[var6], 16711422) >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("aj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = 0;
    }
}
