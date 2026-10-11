/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static boolean[] field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 29021) {
          return;
        }
        field_b = null;
    }

    final static jua a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        jua stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gsa.field_y == wt.field_d) {
            return null;
          }
          if (param0 <= 114) {
            field_b = (int[]) null;
          }
          if (mua.field_a == wt.field_d &&
            param1.equals(uaa.field_a)) {
            wt.field_d = fta.field_c;
            stackIn_11_0 = oo.field_t;
            return stackIn_11_0;
          }
          oo.field_t = null;
          wt.field_d = gsa.field_y;
          uaa.field_a = param1;
          stackIn_9_0 = null;
          return (jua) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        mga.field_i = 1000000000L / (long)param0;
        if (param1 <= 97) {
          field_a = (boolean[]) null;
        }
    }

    static {
        field_a = new boolean[64];
        field_b = new int[]{28, 0};
    }
}
