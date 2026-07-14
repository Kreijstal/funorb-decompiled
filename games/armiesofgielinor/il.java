/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends bd {
    static wk[] field_s;
    static String[] field_t;

    final static String b(int param0, int param1) {
        String var2 = null;
        if (param0 >= param1) {
          if ((param1 ^ -1) > -1) {
            return "Please use a value from 0 to 256, inclusive.";
          } else {
            var2 = "old volume: " + gi.field_b;
            gi.field_b = param1;
            return var2;
          }
        } else {
          return "Please use a value from 0 to 256, inclusive.";
        }
    }

    public static void e(int param0) {
        field_s = null;
        field_t = null;
        if (param0 != 1223) {
            il.e(41);
        }
    }

    final void a(int param0, ha param1) {
        if (param0 != 64) {
            field_s = null;
        }
    }

    final static wd a(int param0, int param1, String param2) {
        wd var3 = null;
        if (param0 != -1) {
          return null;
        } else {
          var3 = new wd(false);
          var3.field_d = param1;
          var3.field_i = param2;
          return var3;
        }
    }

    il(int param0, int param1, jd param2, ne param3) {
        if (null != param3.field_c) {
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        int var2 = -78 / ((param1 - -46) / 57);
        param0.addMouseListener((java.awt.event.MouseListener) (Object) lf.field_q);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lf.field_q);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) lf.field_q);
    }

    static {
    }
}
