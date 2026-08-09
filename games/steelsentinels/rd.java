/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static gk[] a(boolean param0, cm param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        gk[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wa.a((byte) 30, param3, param2, param1)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_a = (int[]) null;
                  break L1;
                }
              }
              stackIn_6_0 = ij.i(-71);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("rd.A(").append(param0).append(',');

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
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gk[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8192) {
            return;
        }
        field_c = null;
    }

    final static int a(byte param0) {
        if (param0 > -68) {
            return -121;
        }
        return hb.field_b + -hl.field_q;
    }

    static {
        field_a = new int[8192];
        field_c = "Research into <col=00ffff>laser weapons</col> is needed before the <%0> can be engineered.";
    }
}
