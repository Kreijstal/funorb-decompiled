/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static ap[] field_a;

    final static vs a(gk param0, int param1, String param2, String param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param0.a(param2, (byte) -71, param3);
        var4 = var5;
        if (param1 == 8191) {
          if (var5 == null) {
            return null;
          } else {
            return new vs(var5);
          }
        } else {
          int discarded$6 = tg.a(-91, 82);
          if (var5 == null) {
            return null;
          } else {
            return new vs(var5);
          }
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if ((param0 ^ -1) <= param1) {
          L0: {
            if (param0 < 6144) {
              stackOut_7_0 = -lp.field_c[-4096 + param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -lp.field_c[-param0 + 8192];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (2048 > param0) {
              stackOut_3_0 = lp.field_c[param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = lp.field_c[-param0 + 4096];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0) {
        if (param0 < -87) {
          if (ft.field_l != null) {
            if (ca.field_f != wq.field_e) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          int discarded$6 = tg.a(120, -95);
          if (ft.field_l != null) {
            if (ca.field_f != wq.field_e) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 61) {
            field_a = (ap[]) null;
        }
    }

    static {
    }
}
