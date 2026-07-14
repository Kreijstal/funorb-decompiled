/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_c;
    static int[] field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, String param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param0 == 12239) {
          gb.field_i = da.field_d;
          if (param2 != 255) {
            if ((param2 ^ -1) <= -101) {
              if ((param2 ^ -1) < -106) {
                a.field_h = mh.a(param2, true, param3);
                return;
              } else {
                var8 = param1;
                kf.a(1, var8);
                a.field_h = wk.a((byte) 17, param1);
                return;
              }
            } else {
              a.field_h = mh.a(param2, true, param3);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = 0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (13 <= uh.field_d) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            a.field_h = di.a(stackIn_16_0 != 0, stackIn_16_1 != 0);
            var6 = null;
            kf.a(1, (String[]) null);
            return;
          }
        } else {
          field_b = null;
          gb.field_i = da.field_d;
          if (param2 != 255) {
            if ((param2 ^ -1) <= -101) {
              if ((param2 ^ -1) >= -106) {
                var7 = param1;
                kf.a(1, var7);
                a.field_h = wk.a((byte) 17, param1);
                return;
              } else {
                a.field_h = mh.a(param2, true, param3);
                return;
              }
            } else {
              a.field_h = mh.a(param2, true, param3);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (13 <= uh.field_d) {
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
            a.field_h = di.a(stackIn_5_0 != 0, stackIn_5_1 != 0);
            var6 = null;
            kf.a(1, (String[]) null);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            fb.a(-18, (String[]) null, -68, (String) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 != 255) {
          L0: {
            fb.a(true);
            if (null != u.field_b) {
              u.field_b.d(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != pc.field_b) {
              pc.field_b.f((byte) -85);
              break L1;
            } else {
              break L1;
            }
          }
          df.h(-1);
          return;
        } else {
          L2: {
            if (null != u.field_b) {
              u.field_b.d(true);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != pc.field_b) {
              pc.field_b.f((byte) -85);
              break L3;
            } else {
              break L3;
            }
          }
          df.h(-1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = new int[1024];
        field_a = true;
    }
}
