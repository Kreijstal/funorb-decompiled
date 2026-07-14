/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static tg field_a;

    final static boolean a(int param0, ii param1) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 24) {
          L0: {
            var3 = null;
            boolean discarded$6 = re.a(-18, (ii) null);
            if (1 != param1.f(7, 1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (1 != param1.f(7, 1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0, ke param1, int param2) {
        if (param0 != 109) {
          field_a = null;
          uk.field_d.a(1, (ai) (Object) param1);
          qh.a(param1, param2, -22762);
          return;
        } else {
          uk.field_d.a(1, (ai) (Object) param1);
          qh.a(param1, param2, -22762);
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
