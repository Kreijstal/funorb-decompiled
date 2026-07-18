/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    int field_d;
    static nh field_e;
    static String field_g;
    static nh field_c;
    static int field_f;
    static String field_b;
    int field_a;

    final static og a(byte param0, String[] param1) {
        og var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        og stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        og stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                var3 = null;
                og discarded$2 = sa.a((byte) -13, (String[]) null);
                break L1;
              }
            }
            var2 = new og(false);
            var2.field_h = param1;
            stackOut_2_0 = (og) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        if (vb.field_n != -wk.field_i) {
          if (vb.field_n == -wk.field_i + 250) {
            vb.field_n = vb.field_n + 1;
            return;
          } else {
            vb.field_n = vb.field_n + 1;
            return;
          }
        } else {
          vb.field_n = vb.field_n + 1;
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_g = null;
    }

    sa(int param0, int param1, int param2, int param3) {
        ((sa) this).field_d = param0;
        ((sa) this).field_a = param3;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Total score: ";
        field_b = "Loading graphics";
    }
}
