/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends wl {
    static String field_i;
    static int field_n;
    long field_p;
    static int field_m;
    static int[] field_o;
    static jh field_k;
    byte[] field_l;
    int field_j;

    public static void a(int param0) {
        if (param0 != 24944) {
          field_n = -61;
          field_k = null;
          field_i = null;
          field_o = null;
          return;
        } else {
          field_k = null;
          field_i = null;
          field_o = null;
          return;
        }
    }

    final static ui a(int param0, int param1, int param2, int param3, int param4, vh param5) {
        java.awt.Frame var6 = null;
        ui var7 = null;
        java.awt.Frame var8 = null;
        var8 = da.a(param3, param1, param0, param5, param2, param4);
        var6 = var8;
        if (var8 == null) {
          return null;
        } else {
          var7 = new ui();
          var7.field_c = var8;
          java.awt.Component discarded$2 = var7.field_c.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param1, param3);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          return var7;
        }
    }

    hb(long param0, int param1, byte[] param2) {
        ((hb) this).field_p = param0;
        ((hb) this).field_l = param2;
        ((hb) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_m = 20;
        field_i = "Create your own free Jagex account";
        field_o = new int[8192];
    }
}
