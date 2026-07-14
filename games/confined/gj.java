/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_f;
    static mn field_b;
    java.awt.Frame field_e;
    static mi field_a;
    static String field_c;
    static bi field_d;
    static String field_g;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((gj) this).field_f = true;
    }

    final void a(int param0, df param1) {
        if (param0 > -76) {
            return;
        }
        si.a(((gj) this).field_e, param1, true);
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        if (param0 > -40) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    gj() {
    }

    final static void a(String param0, boolean param1, String[] param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var5 = Confined.field_J ? 1 : 0;
        na.field_S = b.field_a;
        if (param3 == 255) {
          L0: {
            stackOut_15_0 = -108;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (wc.field_Ob >= 13) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L0;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L0;
            }
          }
          lm.field_e = jj.a((byte) stackIn_18_0, stackIn_18_1 != 0);
          var7 = null;
          fc.a(-7212, (String[]) null);
          if (!param1) {
            var6 = null;
            gj.a((String) null, false, (String[]) null, -96);
            return;
          } else {
            return;
          }
        } else {
          if (param3 < 100) {
            lm.field_e = gd.a(4, param0, param3);
            if (param1) {
              return;
            } else {
              var6 = null;
              gj.a((String) null, false, (String[]) null, -96);
              return;
            }
          } else {
            if (105 < param3) {
              lm.field_e = gd.a(4, param0, param3);
              if (!param1) {
                var6 = null;
                gj.a((String) null, false, (String[]) null, -96);
                return;
              } else {
                return;
              }
            } else {
              var4 = param2;
              fc.a(-7212, var4);
              lm.field_e = p.a(26663, param2);
              if (param1) {
                return;
              } else {
                var6 = null;
                gj.a((String) null, false, (String[]) null, -96);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mn();
        field_c = "Please try again in a few minutes.";
        field_g = "You have <%0> unread messages!";
    }
}
