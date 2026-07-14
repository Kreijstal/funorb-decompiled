/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static String field_g;
    static int[] field_f;
    static String field_j;
    static String[][] field_i;
    static w field_c;
    static long field_b;
    static String field_a;
    static int[] field_h;
    static vl field_d;
    static String field_e;

    abstract void a(int param0, wq param1);

    final static wg a(int param0, int param1, int param2, int param3, boolean param4, tg param5) {
        java.awt.Frame var6 = null;
        wg var7 = null;
        java.awt.Frame var8 = null;
        var8 = eh.a(param0, param5, param3, 119, param1, param2);
        var6 = var8;
        if (var8 != null) {
          var7 = new wg();
          var7.field_a = var8;
          java.awt.Component discarded$8 = var7.field_a.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param2, param3);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          if (!param4) {
            ff.a((byte) 7, -111);
            var7.requestFocus();
            return var7;
          } else {
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    abstract cd a(int param0);

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_g = null;
        field_e = null;
        int var1 = -5 % ((param0 - 66) / 48);
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        sp var4 = null;
        eg var5 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        var4 = (sp) (Object) tm.field_f.d(-84);
        L0: while (true) {
          if (var4 == null) {
            if (param0 > -34) {
              return;
            } else {
              var5 = (eg) (Object) qc.field_n.d(-71);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  uo.a(var5, param1, (byte) 68);
                  var5 = (eg) (Object) qc.field_n.a((byte) 116);
                  continue L1;
                }
              }
            }
          } else {
            ke.a(param1, var4, 14989);
            var4 = (sp) (Object) tm.field_f.a((byte) 116);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = new int[8192];
        field_h = new int[]{13, 12};
        field_e = "Invite more players, or alternatively try changing the following settings:  ";
        field_g = "Cancel rematch";
    }
}
