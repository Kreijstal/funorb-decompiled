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
        try {
            if (param1 > -25) {
                dc.a(false, false);
            }
            param0.removeMouseListener(lf.field_q);
            param0.removeMouseMotionListener(lf.field_q);
            param0.removeFocusListener(lf.field_q);
            ob.field_J = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static wd a(boolean param0, boolean param1) {
        wd var2;
        wd stackIn_3_0 = null;
        wd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wd stackIn_7_0 = null;
        wd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1) {
          L0: {
            dc.a(false, false);
            var2 = new wd(true);
            stackIn_7_0 = (wd) (var2);

            if (!param0) {
              stackIn_8_0 = (wd) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (wd) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_h = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new wd(true);
            stackIn_3_0 = (wd) (var2);

            if (!param0) {
              stackIn_4_0 = (wd) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (wd) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_h = stackIn_4_1 != 0;
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
        field_l = "Chat is currently disabled.";
        field_n = new wk(540, 140);
        field_s = "High";
    }
}
