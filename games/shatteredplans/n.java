/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends oh {
    int field_i;
    static wh field_h;
    static double field_p;
    static String field_q;
    static String field_m;
    static String field_l;
    static bi field_k;
    static qr field_o;
    static String field_j;
    static qr[] field_n;

    public static void a(int param0) {
        field_n = null;
        field_k = null;
        field_m = null;
        if (param0 != 11209) {
            Object var2 = null;
            sq discarded$0 = n.a((String) null, -73);
        }
        field_l = null;
        field_o = null;
        field_h = null;
        field_q = null;
        field_j = null;
    }

    n(fs param0, fs param1, String param2) {
        ((n) this).field_i = 0;
    }

    final static sq a(String param0, int param1) {
        sq[] var2 = null;
        int var3 = 0;
        sq var4 = null;
        int var5 = 0;
        sq[] var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = mf.field_q;
        var2 = var6;
        if (param1 == -21502) {
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (param0.equalsIgnoreCase(var4.field_g)) {
                return var4;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = Math.atan2(1.0, 0.0);
        field_m = "Your game";
        field_l = "Colonies were founded on a hundred worlds. Poorly equipped and without support, many failed. System after system was lost to the gathering night.";
        field_q = "This option cannot be combined with the current '<%0>' setting.";
        field_j = "Click to show the Projects window.";
    }
}
