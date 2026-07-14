/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static di field_c;
    static km field_b;
    static String field_d;
    static String field_a;

    final static void a(int param0, boolean param1, long param2, int param3, String param4, int param5) {
        int var7 = 0;
        nk stackIn_2_0 = null;
        nk stackIn_3_0 = null;
        nk stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        nk stackIn_6_0 = null;
        nk stackIn_7_0 = null;
        nk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        nk stackOut_5_0 = null;
        nk stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        nk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        nk stackOut_1_0 = null;
        nk stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        nk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        qn.field_U.f(param0, -60);
        if (param5 < 23) {
          L0: {
            field_d = null;
            qn.field_U.field_l = qn.field_U.field_l + 1;
            var7 = qn.field_U.field_l;
            qn.field_U.a(-107, param2);
            qn.field_U.a(-110, param4);
            qn.field_U.c(param3, (byte) -126);
            stackOut_5_0 = qn.field_U;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (nk) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (nk) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((nk) (Object) stackIn_8_0).c(stackIn_8_1, (byte) -95);
          qn.field_U.a(qn.field_U.field_l - var7, -1);
          return;
        } else {
          L1: {
            qn.field_U.field_l = qn.field_U.field_l + 1;
            var7 = qn.field_U.field_l;
            qn.field_U.a(-107, param2);
            qn.field_U.a(-110, param4);
            qn.field_U.c(param3, (byte) -126);
            stackOut_1_0 = qn.field_U;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (nk) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (nk) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((nk) (Object) stackIn_4_0).c(stackIn_4_1, (byte) -95);
          qn.field_U.a(qn.field_U.field_l - var7, -1);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 24 / ((param0 - -36) / 45);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Player names can be up to 12 letters, numbers and underscores";
        field_a = "<%0> has entered another game.";
    }
}
