/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static int[] field_c;
    static int[][] field_a;
    static ru[] field_b;

    final static int a(String param0, boolean param1, boolean param2) {
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
              if (!param2) {
                break L1;
              } else {
                field_b = (ru[]) null;
                break L1;
              }
            }
            if (param1) {
              stackIn_6_0 = uk.field_s.a(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = ej.field_G.a(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lp.A(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        if (param0 != 13094936) {
            return;
        }
        field_b = null;
        field_c = null;
        field_a = (int[][]) null;
    }

    final static je b(int param0) {
        if (param0 > -122) {
            field_a = (int[][]) null;
            return sc.field_g.field_Nb;
        }
        return sc.field_g.field_Nb;
    }

    static {
        field_c = new int[]{2718708, 13182994, 7325724, 13094936, 16351443, 39065, 11545598, 14322432};
        field_a = new int[][]{new int[]{0, 1, 2, 3}, new int[]{}};
    }
}
