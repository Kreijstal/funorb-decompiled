/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_a;
    static we field_b;

    final static ob a(byte[] param0, int param1) {
        ob var2 = null;
        RuntimeException var2_ref = null;
        ob stackIn_5_0 = null;
        ob stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new ob(param0, fa.field_b, e.field_b, gf.field_g, ge.field_c, fl.field_g, wo.field_f);
              re.b(param1 ^ -28512);
              if (param1 == -28628) {
                stackIn_7_0 = (ob) (var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (ob) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("ed.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 61 % ((-1 - param0) / 61);
        field_b = null;
    }

    static {
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
