/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static byte[][] field_a;
    static int[][][] field_b;
    private ka[] field_c;

    public static void a(int param0) {
        field_b = (int[][][]) null;
        if (param0 <= 9) {
          h.a(66);
        }
        field_a = (byte[][]) null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var8Lifetime1;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (0 >= param4) {
            return;
          }
          param2[param0] = param3;
          param2[-1 + param4] = param1;
          if (param3 >= param1) {
            var6 = -1;
            var5_int = -param1 + param3;
          } else {
            var6 = 1;
            var5_int = -param3 + param1;
          }
          var7 = param4;
          if (2 == var7) {
            return;
          }
          if (var7 == 1) {
            param2[0] = param1 + param3 >> 1;
          }
          if (0 == var7) {
            return;
          }
          var8 = 0;
          for (var9 = 1; var9 < var7 - 1; var9++) {
            param2[var9] = param2[0];
            var8Lifetime1 = var9 * var5_int;
            param2[var9] = param2[var9] + var6 * var8Lifetime1 / (var7 - 1);
            if ((var7 - 1) / 2 <= var8Lifetime1 * var6 % (var7 - 1)) {
              param2[var9] = param2[var9] + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("h.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 4) {
          return;
        }
        fe var2 = cg.field_a[param0];
        int var3 = hb.field_b[param0];
        ol.a(-127, var2, var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hd.a(this.field_c, param0, param4, (byte) -66, param1, param3);
        if (param2 != -1) {
          this.field_c = (ka[]) null;
        }
    }

    h(ka[] param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[][][]{new int[][]{new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{0, 0, 0}, new int[]{2, 2, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{0, 0, 0}, new int[]{4, 4, 4}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{4, 4, 4}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{4, 4, 4}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}};
    }
}
