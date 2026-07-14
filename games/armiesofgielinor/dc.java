/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends tc {
    static String field_l;
    int field_p;
    int[] field_m;
    int[] field_v;
    wo[] field_k;
    wo[] field_r;
    static wk field_n;
    byte[][][] field_u;
    static String field_s;
    static long field_o;
    int[] field_t;
    int field_q;

    final static void a(java.awt.Component param0, int param1) {
        if (param1 > -25) {
          wd discarded$2 = dc.a(false, false);
          param0.removeMouseListener((java.awt.event.MouseListener) (Object) lf.field_q);
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lf.field_q);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) lf.field_q);
          ob.field_J = 0;
          return;
        } else {
          param0.removeMouseListener((java.awt.event.MouseListener) (Object) lf.field_q);
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lf.field_q);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) lf.field_q);
          ob.field_J = 0;
          return;
        }
    }

    final static wd a(boolean param0, boolean param1) {
        wd var2 = null;
        wd stackIn_2_0 = null;
        wd stackIn_3_0 = null;
        wd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wd stackIn_6_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        wd stackOut_5_0 = null;
        wd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        wd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        wd stackOut_1_0 = null;
        wd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1) {
          L0: {
            wd discarded$2 = dc.a(false, false);
            var2 = new wd(true);
            stackOut_5_0 = (wd) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (wd) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (wd) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((wd) (Object) stackIn_8_0).field_h = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new wd(true);
            stackOut_1_0 = (wd) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (wd) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (wd) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((wd) (Object) stackIn_4_0).field_h = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(int param0) {
        if (param0 != 540) {
          field_o = 127L;
          field_s = null;
          field_l = null;
          field_n = null;
          return;
        } else {
          field_s = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    dc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Chat is currently disabled.";
        field_n = new wk(540, 140);
        field_s = "High";
    }
}
