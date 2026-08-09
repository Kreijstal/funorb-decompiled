/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -20441) {
            ua.a(-73);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static tj a(byte param0, byte[] param1) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        tj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new tj(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, j.field_a, vj.field_m);
                no.f((byte) -54);
                if (param0 < -126) {
                  break L1;
                } else {
                  ua.a(18);
                  break L1;
                }
              }
              stackIn_6_0 = (tj) (var2);
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
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ua.A(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tj) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_b = "Menu";
        field_a = new int[]{19, 7};
    }
}
