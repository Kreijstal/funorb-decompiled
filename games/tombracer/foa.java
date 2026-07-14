/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class foa implements bo {
    static String field_a;
    private int field_c;
    static boolean field_b;

    final void a(qh param0, int param1, v param2) {
        if (param0.f(0)) {
          if (param1 != -1) {
            field_b = true;
            param0.field_r = ((foa) this).field_c;
            return;
          } else {
            param0.field_r = ((foa) this).field_c;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 < 86) {
            return false;
        }
        return jf.field_r;
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 0) {
          L0: {
            field_a = null;
            if (0 == (2048 & param0)) {
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
            if (0 == (2048 & param0)) {
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

    public final void a(int param0, kh param1) {
        param1.i(8);
        param1.a((byte) -128, 1 + ((foa) this).field_c, 32);
        if (param0 != 200) {
          return;
        } else {
          param1.k(-1826190686);
          return;
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) -62);
        ((foa) this).field_c = param0.b((byte) 44, 32) + -1;
        param0.i((byte) 98);
        if (param1 != -19) {
            foa.a(false);
        }
    }

    foa() {
        ((foa) this).field_c = -1;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9) {
        if (param5 == 75) {
          if (!io.a(param4, param3, (byte) -122, param7, param1, param2, param0, param6, param9)) {
            return 0;
          } else {
            return jqa.a(-(param7 / 2) + param2, 1, -(param0 / 2) + param3, param3 + (1 + param0) / 2, param2 + (param7 + 1) / 2, param8, param1 - param6 / 2, (param4 - -1) / 2 + param9, (1 + param6) / 2 + param1, param9 + -(param4 / 2));
          }
        } else {
          return 73;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create a free Account";
        field_b = true;
    }
}
