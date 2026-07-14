/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends od {
    static ica field_m;
    static String field_l;
    static String field_k;

    final static void a(int param0, boolean param1) {
        if (param0 == 0) {
          if (!param1) {
            L0: {
              if (uu.field_a != null) {
                et.a(11, 30, uu.field_a.f(param0 ^ 0));
                break L0;
              } else {
                break L0;
              }
            }
            vda.field_q = true;
            return;
          } else {
            kw.a(11, false, 0);
            return;
          }
        } else {
          field_l = null;
          if (!param1) {
            L1: {
              if (uu.field_a != null) {
                et.a(11, 30, uu.field_a.f(param0 ^ 0));
                break L1;
              } else {
                break L1;
              }
            }
            vda.field_q = true;
            return;
          } else {
            kw.a(11, false, 0);
            return;
          }
        }
    }

    final static via a(int param0, int param1, int param2, fia param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        via var7 = null;
        java.awt.Frame var8 = null;
        var8 = kha.a(param3, param1, param0, 10, param5, param4);
        var6 = var8;
        if (var8 != null) {
          var7 = new via();
          var7.field_d = var8;
          java.awt.Component discarded$10 = var7.field_d.add((java.awt.Component) (Object) var7);
          if (param2 != 19293) {
            int discarded$11 = r.f(32);
            var7.setBounds(0, 0, param4, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          } else {
            var7.setBounds(0, 0, param4, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 11) {
            r.a(-85);
            field_l = null;
            field_m = null;
            return;
        }
        field_l = null;
        field_m = null;
    }

    final static int f(int param0) {
        if (param0 != 11) {
          r.a(87, false);
          return caa.field_i + (k.field_A << -1589041404) - -(nba.field_b << 638698306);
        } else {
          return caa.field_i + (k.field_A << -1589041404) - -(nba.field_b << 638698306);
        }
    }

    protected r() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "You unlocked a Tomb!";
        field_l = "Accept";
        field_m = new ica();
    }
}
