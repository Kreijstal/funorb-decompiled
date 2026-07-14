/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static String field_d;
    static boolean field_a;
    static int field_b;
    static String field_e;
    int field_g;
    static String field_f;
    static int field_c;

    final static void a(byte param0, boolean param1) {
        L0: {
          if (!lk.a((byte) 114)) {
            break L0;
          } else {
            param1 = false;
            break L0;
          }
        }
        if (param0 != -119) {
          fn.a(108);
          lf.a(-1, param1);
          kb.f((byte) 100);
          return;
        } else {
          lf.a(-1, param1);
          kb.f((byte) 100);
          return;
        }
    }

    final static a a(int param0, int param1, int param2, int param3, int param4, jk param5) {
        java.awt.Frame var6 = null;
        a var7 = null;
        Object var8 = null;
        java.awt.Frame var9 = null;
        if (param3 > 12) {
          var9 = in.a(param0, param4, param5, param2, 3160, param1);
          var6 = var9;
          if (var9 == null) {
            return null;
          } else {
            var7 = new a();
            var7.field_g = var9;
            java.awt.Component discarded$3 = var7.field_g.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param4, param1);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          var8 = null;
          int discarded$4 = fn.a((CharSequence) null, -47);
          var9 = in.a(param0, param4, param5, param2, 3160, param1);
          var6 = var9;
          if (var9 == null) {
            return null;
          } else {
            var7 = new a();
            var7.field_g = var9;
            java.awt.Component discarded$5 = var7.field_g.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param4, param1);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        }
    }

    final static int a(CharSequence param0, int param1) {
        if (param1 != 0) {
            return -92;
        }
        return hd.a(10, (byte) 127, true, param0);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 >= -3) {
            field_c = 55;
            field_e = null;
            field_d = null;
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (qf.field_b) {
          return ol.field_O.a(d.field_Ib, 73, vg.field_a);
        } else {
          if (!an.field_c) {
            if (pd.a(-26057, param3, param2)) {
              return true;
            } else {
              if (param1 == 23012) {
                if (kh.field_o) {
                  return false;
                } else {
                  return ba.b(param0, param2, -101);
                }
              } else {
                field_f = null;
                if (kh.field_o) {
                  return false;
                } else {
                  return ba.b(param0, param2, -101);
                }
              }
            }
          } else {
            return vh.a(83, param3, param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Confirm Password: ";
        field_d = "Playing";
        field_a = false;
        field_f = "Day";
    }
}
