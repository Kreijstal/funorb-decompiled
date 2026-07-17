/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static int[] field_d;
    static di field_a;
    static ao field_c;
    static String field_b;

    final static boolean a(byte param0) {
        if (param0 > 72) {
          if (fq.m(0)) {
            if ((eo.field_Tb & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (fq.m(0)) {
            if ((eo.field_Tb & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a() {
        db.field_Pb = rl.a((byte) -121);
        up.field_j = 0;
    }

    final static long a(byte[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        long stackIn_3_0 = 0L;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_2_0 = 0L;
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
              if (param1 == -83) {
                break L1;
              } else {
                var4 = null;
                break L1;
              }
            }
            stackOut_2_0 = ii.a(param0, param2, 0, 154302664);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cp.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void b() {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "members-only content";
    }
}
