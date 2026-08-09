/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static p[] field_b;
    static int field_a;
    static String field_e;
    static String field_c;
    static float field_d;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 4) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static oh[] a(oh param0, byte param1) {
        oh[] var2 = null;
        RuntimeException var2_ref = null;
        oh[] var3 = null;
        oh[] stackIn_2_0 = null;
        oh[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 21) {
              var3 = new oh[9];
              var2 = var3;
              var3[4] = param0;
              stackIn_4_0 = (oh[]) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (oh[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("ok.A(");

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
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_a = 200;
        field_e = "Real-life threats";
        field_c = "Invite players";
    }
}
