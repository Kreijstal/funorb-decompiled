/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static char[] field_a;
    static String field_b;
    static volatile int field_d;
    static o[] field_c;

    final static void a(String param0, String[] param1, byte param2, int param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = wizardrun.field_H;
        fi.field_y = mi.field_z;
        if (param2 < -96) {
          if (255 == param3) {
            L0: {
              stackOut_18_0 = -29309;
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if ((ac.field_t ^ -1) <= -14) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L0;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L0;
              }
            }
            ki.field_F = ii.a(stackIn_21_0, stackIn_21_1 != 0);
            return;
          } else {
            if (-101 < (param3 ^ -1)) {
              ki.field_F = hf.a(-105, param0, param3);
              return;
            } else {
              if (105 >= param3) {
                ki.field_F = rc.a(param1, (byte) -77);
                return;
              } else {
                ki.field_F = hf.a(-105, param0, param3);
                return;
              }
            }
          }
        } else {
          field_d = -13;
          if (255 != param3) {
            if (-101 < (param3 ^ -1)) {
              ki.field_F = hf.a(-105, param0, param3);
              return;
            } else {
              if (105 < param3) {
                ki.field_F = hf.a(-105, param0, param3);
                return;
              } else {
                ki.field_F = rc.a(param1, (byte) -77);
                return;
              }
            }
          } else {
            L1: {
              stackOut_2_0 = -29309;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if ((ac.field_t ^ -1) <= -14) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ki.field_F = ii.a(stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + md.a("%0a", param1, 28834, "\n"));
        if (param0 < 74) {
            field_c = null;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_d = -120;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 <= 12) {
            boolean discarded$9 = ve.a((byte) -115, 46);
            if (!((param1 ^ -1) != 0)) {
                return true;
            }
            return (1 << param1 & uh.field_a) != 0 ? true : false;
        }
        if (!((param1 ^ -1) != 0)) {
            return true;
        }
        return (1 << param1 & uh.field_a) != 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[128];
        field_d = 0;
        field_b = "Confirm Email:";
    }
}
