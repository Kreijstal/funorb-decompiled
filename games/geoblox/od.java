/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static String field_b;
    private String field_a;

    final static boolean a(int param0) {
        if (param0 == -3) {
          if (-3 == gg.field_b) {
            if ((pa.field_g ^ -1) <= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (-3 == (gg.field_b ^ -1)) {
            if (pa.field_g <= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, String param1) {
        if (param0 <= 107) {
            return false;
        }
        return ((od) this).field_a.equals((Object) (Object) param1);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -8) {
            od.b((byte) -78);
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        ea.a((byte) -25, 31536000L, param0, "jagex-last-login-method", ((od) this).field_a);
        if (param1 != 0) {
            Object var4 = null;
            ((od) this).a((java.applet.Applet) null, -71);
        }
    }

    final static he a(int param0, int param1, int param2, int param3, d param4, int param5) {
        java.awt.Frame var6 = null;
        he var7 = null;
        java.awt.Frame var8 = null;
        if (param3 == -3) {
          var8 = qe.a(param2, -1, param0, param5, param4, param1);
          var6 = var8;
          if (var8 == null) {
            return null;
          } else {
            var7 = new he();
            var7.field_b = var8;
            java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param5, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          field_b = null;
          var8 = qe.a(param2, -1, param0, param5, param4, param1);
          var6 = var8;
          if (var8 == null) {
            return null;
          } else {
            var7 = new he();
            var7.field_b = var8;
            java.awt.Component discarded$3 = var7.field_b.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param5, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Geoblox.field_C;
          if (null == te.field_c) {
            break L0;
          } else {
            var1 = 0;
            L1: while (true) {
              if (-8 >= (var1 ^ -1)) {
                kf.field_c = null;
                sl.field_l = null;
                uh.field_y.c((byte) 83);
                te.field_c = null;
                break L0;
              } else {
                if (!ag.field_j[var1]) {
                  return;
                } else {
                  var1++;
                  continue L1;
                }
              }
            }
          }
        }
        if (param0 != -24) {
          od.b((byte) -35);
          return;
        } else {
          return;
        }
    }

    od(String param0) {
        ((od) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Geoblox";
    }
}
