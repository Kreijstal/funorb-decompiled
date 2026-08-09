/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends rk {
    int[][] field_q;
    int field_o;
    int field_w;
    boolean field_t;
    long[][] field_p;
    int field_s;
    static int field_n;
    static int field_r;
    static hn field_v;
    String[][] field_u;
    static String field_x;
    static String field_m;

    public static void b(int param0) {
        if (param0 != -1362) {
            return;
        }
        field_x = null;
        field_m = null;
        field_v = null;
    }

    final static boolean a(mi param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              stackIn_4_0 = param0.a(25057);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("qn.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1) {
        ij.field_u = 1000000000L / (long)param1;
        if (param0 <= 41) {
            qn.a(-4, -31);
        }
    }

    qn() {
    }

    static {
        field_n = -1;
        field_x = "D";
        field_m = "Go Back";
    }
}
