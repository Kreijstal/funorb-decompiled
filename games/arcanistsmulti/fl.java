/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_d;
    static String field_c;
    static boolean field_a;
    static String[] field_b;

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        String[] var15 = null;
        String[] var16 = null;
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
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        hb.field_Gb = pa.field_g;
        if (param0 == 20657) {
          if (param3 != 255) {
            if (100 <= param3) {
              if ((param3 ^ -1) < -106) {
                fh.field_i = ab.a(param0 + -20657, param3, param1);
                return;
              } else {
                var16 = param2;
                ao.a(var16, param0 ^ -20688);
                fh.field_i = ho.a((byte) 120, param2);
                return;
              }
            } else {
              fh.field_i = ab.a(param0 + -20657, param3, param1);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = param0 ^ 12212;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (13 <= qm.field_u) {
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
            fh.field_i = oj.a(stackIn_16_0, stackIn_16_1 != 0);
            var7 = null;
            ao.a((String[]) null, -127);
            return;
          }
        } else {
          var6 = null;
          fl.a(49, (String) null, (String[]) null, 7);
          if (param3 != 255) {
            if (100 <= param3) {
              if ((param3 ^ -1) < -106) {
                fh.field_i = ab.a(param0 + -20657, param3, param1);
                return;
              } else {
                var15 = param2;
                ao.a(var15, param0 ^ -20688);
                fh.field_i = ho.a((byte) 120, param2);
                return;
              }
            } else {
              fh.field_i = ab.a(param0 + -20657, param3, param1);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = param0 ^ 12212;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (13 <= qm.field_u) {
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
            fh.field_i = oj.a(stackIn_5_0, stackIn_5_1 != 0);
            var7 = null;
            ao.a((String[]) null, -127);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          fl.a(false);
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, eg param1) {
        int var3 = 0;
        int var4 = 0;
        qb var5 = null;
        qb var6 = null;
        if (param0 != -2389) {
          field_a = true;
          var5 = new qb(param1.a("", "final_frame.jpg", -1), (java.awt.Component) (Object) on.field_c);
          var3 = var5.field_q;
          var4 = var5.field_y;
          ec.a(65280);
          mi.field_E = new qb(var3, 3 * var4 / 4);
          mi.field_E.a();
          var5.h(0, 0);
          gm.field_l = new qb(var3, -mi.field_E.field_y + var4);
          gm.field_l.a();
          var5.h(0, -mi.field_E.field_y);
          gm.field_l.field_o = mi.field_E.field_y;
          oo.c(-15405);
          return;
        } else {
          var6 = new qb(param1.a("", "final_frame.jpg", -1), (java.awt.Component) (Object) on.field_c);
          var3 = var6.field_q;
          var4 = var6.field_y;
          ec.a(65280);
          mi.field_E = new qb(var3, 3 * var4 / 4);
          mi.field_E.a();
          var6.h(0, 0);
          gm.field_l = new qb(var3, -mi.field_E.field_y + var4);
          gm.field_l.a();
          var6.h(0, -mi.field_E.field_y);
          gm.field_l.field_o = mi.field_E.field_y;
          oo.c(-15405);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_c = "Reading Book of Overlight";
    }
}
