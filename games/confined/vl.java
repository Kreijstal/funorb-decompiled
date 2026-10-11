/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_a;
    static double[][] field_c;
    static int[] field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = (double[][]) null;
        if (param0 != -14578) {
          field_c = (double[][]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -182) {
            field_c = (double[][]) null;
          }
          stackIn_3_0 = sm.a(param0, false, 10, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vl.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = new double[][]{new double[]{-4.0, 0.0, -138.0}, new double[]{-182.0, 0.0, -136.0, 182.0, 0.0, -136.0}, new double[]{0.0, -41.0, -93.0}, new double[]{-24.0, -94.0, -392.0}};
        field_b = false;
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
