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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            field_b = (ru[]) null;
          }
          if (param1) {
            stackIn_6_0 = uk.field_s.a(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = ej.field_G.a(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lp.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
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
