/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br {
    static String field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        String var2 = pb.field_G[35];
        String var4 = var2;
        var4 = var2;
        String var3 = lw.field_a[param1];
        if (param0 == -98) {
          if (th.field_a[param1]) {
            var3 = ma.field_w;
            var4 = var3;
            var4 = var3;
          }
          var4 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[35], new String[]{kw.field_c[param1], var3});
          if (hv.field_a[param1] &&
            !c.a(param1, 0, bh.field_f)) {
            var4 = vu.field_Gb;
          }
          np.field_Jb.a(new i(35, (lv) null, var2, var4), 3);
          return;
        }
        field_b = (String) null;
        if (th.field_a[param1]) {
          var3 = ma.field_w;
          var4 = var3;
          var4 = var3;
        }
        var4 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[35], new String[]{kw.field_c[param1], var3});
        if (hv.field_a[param1] &&
          !c.a(param1, 0, bh.field_f)) {
          var4 = vu.field_Gb;
        }
        np.field_Jb.a(new i(35, (lv) null, var2, var4), 3);
    }

    final static boolean a(int param0) {
        if (param0 <= 39) {
          br.a((byte) 2, -21);
          if (null == k.field_m) {
            return false;
          }
          if (k.field_m.h((byte) 16)) {
            return true;
          }
          return false;
        }
        if (null == k.field_m) {
          return false;
        }
        if (k.field_m.h((byte) 16)) {
          return true;
        }
        return false;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "The team captain is choosing a formation.";
        field_a = "Show players in <%0>'s game";
    }
}
