/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sbb extends rqa {
    static int field_p;
    static int[][] field_o;

    sbb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = (int[][]) null;
        if (param0 >= -65) {
          sbb.a(106);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = (int[][]) null;
          }
          stackIn_3_0 = new nc(frb.a(128, 113));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sbb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = 10;
        field_o = new int[][]{new int[]{-1, 8, 0, 1}, new int[]{-1, 7, 0, 1}, new int[]{-1, 8, 0, 2}, new int[]{-1, 7, 0, 2}, new int[]{-1, 6, 0, 2}, new int[]{-1, 5, 0, 2}};
    }
}
