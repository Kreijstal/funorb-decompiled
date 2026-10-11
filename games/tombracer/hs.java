/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs {
    private static int[] field_a;
    static String field_b;
    static float field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0, Class param1) {
        int var2_int = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -35 / ((param0 - 32) / 47);
          stackIn_9_0 = (param1 == Integer.TYPE) || (param1 == Short.TYPE) || (Long.TYPE == param1) || (Byte.TYPE == param1) || (Float.TYPE == param1) || (Double.TYPE == param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("hs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 109 / ((-1 - param1) / 54);
        if (era.field_d != null) {
          bea.d(bea.field_b, bea.field_h, -bea.field_b + bea.field_d, -bea.field_h + bea.field_k);
          era.field_d.b(64, param0);
        }
    }

    public static void a(int param0) {
        if (param0 != 32768) {
          hs.a(false, (byte) -65);
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_a = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)(-1 + (var0 << 1));
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          var3 = (int)((var6 * var6 >> 18) - 32768L);
          if (!(var3 < field_a.length)) {
            var3 = -1 + field_a.length;
          }
          for (var1 = var2 < 0 ? 0 : var2; var1 <= var3; var1++) {
            field_a[var1] = var0;
          }
        }
        field_b = "Inviting <%0>";
        field_d = "Quick Chat lobby";
    }
}
