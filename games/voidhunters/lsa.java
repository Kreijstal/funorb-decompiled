/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lsa extends ksa {
    static long field_f;
    int field_g;
    int field_d;
    static llb field_e;

    public static void c(byte param0) {
        if (param0 != -92) {
            field_f = 37L;
            field_e = null;
            return;
        }
        field_e = null;
    }

    private lsa() throws Throwable {
        throw new Error();
    }

    final static int a(String param0, int param1, boolean param2) {
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
              if (param1 <= -2) {
                break L1;
              } else {
                lsa.c((byte) -36);
                break L1;
              }
            }
            if (param2) {
              stackIn_6_0 = bl.field_x.b(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = oja.field_p.b(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lsa.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
    }
}
