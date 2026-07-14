/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es {
    static kc field_b;
    static String field_a;

    public static void a(boolean param0) {
        if (param0) {
            es.a(false);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, sw param2, int param3, da param4, int param5, ha param6, int param7, int param8, no param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        var11 = -47 / ((param8 - -59) / 50);
        if (null != pja.field_o) {
          hg.field_c = 0;
          rua.field_o = rua.field_o + 1;
          if (jua.field_a < rua.field_o) {
            if (param9 != null) {
              usb.a(param3, param9, pja.field_o, param7, 1, param0, param5);
              pja.field_o = null;
              return;
            } else {
              if (param4 != null) {
                jqb.a(param0, param1, pja.field_o, (byte) 100, param3, param10, param4, param6, param2, param5, param7);
                pja.field_o = null;
                return;
              } else {
                pja.field_o = null;
                return;
              }
            }
          } else {
            pja.field_o = null;
            return;
          }
        } else {
          hg.field_c = hg.field_c + 1;
          if (hg.field_c > mna.field_b) {
            rua.field_o = 0;
            pja.field_o = null;
            return;
          } else {
            pja.field_o = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
