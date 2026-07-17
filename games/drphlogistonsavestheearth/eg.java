/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_i;
    static bb field_h;
    static ag field_a;
    static int field_e;
    static vd field_c;
    static String field_b;
    static String field_g;
    static nh field_d;
    static he[] field_f;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if ((param1 & 7) == 0) {
            break L0;
          } else {
            var2 = -(param1 & 7) + 8;
            break L0;
          }
        }
        var3 = param1 - -var2;
        if (param0 != -17077) {
          field_f = null;
          return var3;
        } else {
          return var3;
        }
    }

    final static sd[] b(byte param0) {
        if (param0 >= -103) {
          int discarded$2 = eg.a(99, 71);
          return new sd[]{p.field_d, ka.field_q, mf.field_A};
        } else {
          return new sd[]{p.field_d, ka.field_q, mf.field_A};
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 69) {
              int discarded$2 = 1;
              stackOut_3_0 = fj.a(16, param2, 84);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 87;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("eg.E(").append(16).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_h = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_g = null;
    }

    final static void a() {
        if (!(uj.field_j == null)) {
            uj.field_j.b(50);
            uj.field_j = null;
        }
    }

    final static nh[] a(byte param0, int param1, int param2, int param3) {
        if (param0 < 66) {
          sd[] discarded$2 = eg.b((byte) 0);
          return af.a(param1, 1, param2, (byte) 32, param3);
        } else {
          return af.a(param1, 1, param2, (byte) 32, param3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_h = new bb();
        field_e = 4;
        field_c = new vd();
        field_b = "Please try again in a few minutes.";
        field_g = "Change display name";
    }
}
