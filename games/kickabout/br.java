/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br {
    static String field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        String var2 = null;
        String var3 = null;
        String var3_ref = null;
        String var4 = null;
        var2 = pb.field_G[35];
        var4 = var2;
        var4 = var2;
        var3 = lw.field_a[param1];
        if (param0 != -98) {
          L0: {
            field_b = null;
            if (th.field_a[param1]) {
              var3_ref = ma.field_w;
              var4 = var3_ref;
              var4 = var3_ref;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var4 = vo.a((byte) -18, gd.field_e[35], new String[2]);
            if (!hv.field_a[param1]) {
              break L1;
            } else {
              if (c.a(param1, 0, bh.field_f)) {
                break L1;
              } else {
                var4 = vu.field_Gb;
                break L1;
              }
            }
          }
          np.field_Jb.a((gn) (Object) new i(35, (lv) null, var2, var4), 3);
          return;
        } else {
          L2: {
            if (th.field_a[param1]) {
              var3_ref = ma.field_w;
              var4 = var3_ref;
              var4 = var3_ref;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var4 = vo.a((byte) -18, gd.field_e[35], new String[2]);
            if (!hv.field_a[param1]) {
              break L3;
            } else {
              if (c.a(param1, 0, bh.field_f)) {
                break L3;
              } else {
                var4 = vu.field_Gb;
                break L3;
              }
            }
          }
          np.field_Jb.a((gn) (Object) new i(35, (lv) null, var2, var4), 3);
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 > 39) {
          if (null != k.field_m) {
            if (!k.field_m.h((byte) 16)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          br.a((byte) 2, -21);
          if (null != k.field_m) {
            if (!k.field_m.h((byte) 16)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The team captain is choosing a formation.";
        field_a = "Show players in <%0>'s game";
    }
}
