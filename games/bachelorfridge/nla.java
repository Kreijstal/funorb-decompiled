/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nla {
    static boolean field_f;
    static sna field_b;
    static String field_e;
    static double field_d;
    static int[] field_a;
    gfa[] field_g;
    static String field_c;

    final void a(cda param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (!param1) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (-12 >= (var3 ^ -1)) {
              return;
            } else {
              ((nla) this).field_g[var3].field_h = param0.field_b[var3].field_h;
              ((nla) this).field_g[var3].field_l = param0.field_b[var3].field_l;
              ((nla) this).field_g[var3].field_d = param0.field_b[var3].field_d;
              ((nla) this).field_g[var3].field_e = param0.field_b[var3].field_e;
              ((nla) this).field_g[var3].field_j = param0.field_b[var3].field_j;
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_e = null;
        field_b = null;
        field_a = null;
    }

    nla() {
        int var1 = 0;
        ((nla) this).field_g = new gfa[11];
        for (var1 = 0; ((nla) this).field_g.length > var1; var1++) {
            ((nla) this).field_g[var1] = new gfa(0, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_d = 0.0;
        field_e = "You have withdrawn your request to join.";
        field_c = "Discard";
        field_a = new int[]{16777215, 15515761, 16101691, 15175695, 12219915, 9982214, 6040836, 2954769};
    }
}
