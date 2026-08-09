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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            if (!param0) {
              stackIn_6_0 = lq.field_k.c(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = kc.field_g.c(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("or.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
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
