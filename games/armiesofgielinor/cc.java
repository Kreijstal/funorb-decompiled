/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static int field_b;
    static int field_a;

    final static int a(int param0, int param1, int[] param2, int param3, int param4, boolean param5, int param6, String param7, int[] param8, int param9) {
        if (param4 != -1) {
          field_b = -105;
          return dm.a(param3, -1, param2, param1, false, param8, param6, param5, param9, false, param0, param7);
        } else {
          return dm.a(param3, -1, param2, param1, false, param8, param6, param5, param9, false, param0, param7);
        }
    }

    final static tu a(kl param0, int param1, kl param2, boolean param3, int param4) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param3) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (kp.a(stackIn_3_0 != 0, param1, param0, param4)) {
          if (!param3) {
            field_a = 104;
            return ArmiesOfGielinor.a(param2.a((byte) 107, param4, param1), true);
          } else {
            return ArmiesOfGielinor.a(param2.a((byte) 107, param4, param1), true);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = 0;
    }
}
