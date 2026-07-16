/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends java.awt.Canvas {
    static String field_a;
    static uh[] field_d;
    private java.awt.Component field_f;
    static String field_g;
    static int field_e;
    static long field_b;
    static da field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        int var1 = -56 / ((param0 - 69) / 43);
        field_d = null;
    }

    final static wg a(byte param0, String[] param1) {
        wg var2 = null;
        if (param0 != 17) {
          field_e = 88;
          var2 = new wg(false);
          var2.field_a = param1;
          return var2;
        } else {
          var2 = new wg(false);
          var2.field_a = param1;
          return var2;
        }
    }

    wk(java.awt.Component param0) {
        ((wk) this).field_f = param0;
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        Object var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) i.field_J;
        synchronized (var1_ref) {
          L0: {
            if (si.field_B != pf.field_a) {
              L1: {
                el.field_n = lb.field_V[pf.field_a];
                if (param0 == -56) {
                  break L1;
                } else {
                  var3 = null;
                  wg discarded$3 = wk.a((byte) -108, (String[]) null);
                  break L1;
                }
              }
              ta.field_d = r.field_g[pf.field_a];
              pf.field_a = pf.field_a + 1 & 127;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final static int b(int param0) {
        if (param0 != 0) {
            return 31;
        }
        return lf.field_c;
    }

    public final void paint(java.awt.Graphics param0) {
        ((wk) this).field_f.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((wk) this).field_f.update(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Destroyed: <%0>%";
        field_g = "Create a free Account";
        field_e = 0;
    }
}
