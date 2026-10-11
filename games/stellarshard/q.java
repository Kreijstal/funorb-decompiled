/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_a;
    static pb field_b;
    static v field_d;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 84) {
          pb[] var2 = (pb[]) null;
          q.a(-104, (pb[]) null);
        }
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        var13 = stellarshard.field_B;
        try {
          if (param4 > param1) {
            var5_int = (param4 + param1) / 2;
            var6 = param1;
            var7 = param2[var5_int];
            param2[var5_int] = param2[param4];
            param2[param4] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var8;
            stackIn_5_0 = (var7 != 2147483647) ? 1 : 0;
            var9 = stackIn_5_0;
            for (var10 = param1; var10 < param4; var10++) {
              if ((var7 - (var9 & var10)) < param2[var10]) {
                var11 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param2[param4] = param2[var6];
            param2[var6] = var7;
            param3[param4] = param3[var6];
            param3[var6] = var8;
            q.a(1, param1, param2, param3, var6 - 1);
            q.a(param0 + 0, var6 + 1, param2, param3, param4);
          }
          if (param0 != 1) {
            var14 = (int[]) null;
            q.a(-111, -13, (int[]) null, (int[]) null, 22);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("q.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, pb[] param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ed.field_a = param1;
          if (param0 <= 58) {
            var3 = (int[]) null;
            q.a(84, -14, (int[]) null, (int[]) null, 119);
          }
          if (ed.field_a != null &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("q.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_c = 0;
    }
}
