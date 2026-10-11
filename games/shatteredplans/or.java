/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    static String[] field_d;
    static boolean field_a;
    static int[] field_b;
    static String field_c;

    public static void b(int param0) {
        field_d = null;
        if (param0 <= 124) {
          or.a(-80);
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_d = (String[]) null;
          }
          if (!param0) {
            stackIn_6_0 = lq.field_k.c(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = kc.field_g.c(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("or.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 250) {
          return false;
        }
        return 250 < js.field_j ? true : false;
    }

    static {
        field_d = new String[]{"Defensive Net", "Terraforming", "Stellar Bomb", "Tannhäuser Project"};
        field_b = new int[]{2031616, 7936, 31, 2031647, 2039552, 7967, 2035471, 990991, 986911};
        field_c = "<%0> is already on your ignore list.";
    }
}
