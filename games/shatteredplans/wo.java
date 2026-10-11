/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static int field_a;
    static bi field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -103) {
          wo.a((byte) 30);
        }
    }

    final static void a(int param0, byte param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -88) {
            var6 = (String) null;
            wo.a(10, (byte) 112, (String[]) null, (String) null);
          }
          fj.field_s = rh.field_g;
          if (param0 != 255) {
            if (100 <= param0 &&
              param0 <= 105) {
              var8 = param2;
              jp.a(var8, false);
              ij.field_a = tc.a(param2, (byte) -89);
              return;
            }
            ij.field_a = ck.a(param3, param0, param1 - 35);
            return;
          }
          stackIn_6_0 = 93;
          stackIn_7_1 = !(jm.field_t >= 13);
          ij.field_a = ub.$cfr$intArgs$a$be17d4c2d3e3(stackIn_6_0, stackIn_7_1);
          var7 = (String[]) null;
          jp.a((String[]) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("wo.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
