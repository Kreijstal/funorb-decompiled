/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    int field_d;
    int field_e;
    static eg field_a;
    int field_c;
    int field_b;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        int var1 = 18 % ((param0 - 57) / 62);
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        gk var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -8759) {
          L0: {
            var3 = (gk) null;
            ll[] discarded$12 = vc.a((gk) null, -26, (byte) 6, 3);
            if (kg.a(param1, (byte) 61) == null) {
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
            if (kg.a(param1, (byte) 61) == null) {
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

    final static ll[] a(gk param0, int param1, byte param2, int param3) {
        if (param2 < -7) {
          if (!tn.a(param0, (byte) -127, param3, param1)) {
            return null;
          } else {
            return bl.b(-95);
          }
        } else {
          vc.a((byte) -14);
          if (!tn.a(param0, (byte) -127, param3, param1)) {
            return null;
          } else {
            return bl.b(-95);
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        ((vc) this).field_e = param0;
        ((vc) this).field_d = param2;
        ((vc) this).field_b = param1;
        ((vc) this).field_c = qq.a(20, co.field_i.length);
        if (param3 <= 103) {
            String var6 = (String) null;
            boolean discarded$0 = vc.a(24, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new eg();
    }
}
