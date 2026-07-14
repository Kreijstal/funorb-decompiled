/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends wl {
    static uf field_j;
    int field_n;
    static o field_p;
    static String field_i;
    static int field_k;
    static String field_l;
    static int field_o;
    static o[] field_m;

    public static void c(int param0) {
        field_j = null;
        int var1 = 7 / ((param0 - 64) / 46);
        field_i = null;
        field_p = null;
        field_m = null;
        field_l = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = wizardrun.field_H;
        il.field_e = true;
        if (param0 != 2) {
          return;
        } else {
          var1 = 0;
          L0: while (true) {
            if (-301 >= (var1 ^ -1)) {
              L1: {
                var1 = od.field_k;
                var2 = 0;
                if (var1 <= var2) {
                  break L1;
                } else {
                  L2: {
                    if (ii.field_e[var2].field_B != 21) {
                      var2++;
                      break L2;
                    } else {
                      ii.field_e[var2].field_e = 20;
                      ii.field_e[var2].field_h = -ii.field_e[var2].field_h;
                      ii.field_e[var2].field_o = ii.field_e[var2].field_o + 2;
                      var2++;
                      break L2;
                    }
                  }
                  var2++;
                  var2++;
                  break L1;
                }
              }
              return;
            } else {
              if (tc.field_l.field_d[var1]) {
                tc.field_l.field_d[var1] = false;
                var1++;
                var1++;
                continue L0;
              } else {
                var1++;
                var1++;
                continue L0;
              }
            }
          }
        }
    }

    ra(int param0) {
        ((ra) this).field_n = param0;
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 >= -94) {
            field_k = -114;
            return qb.field_r.a(92, param0, "");
        }
        return qb.field_r.a(92, param0, "");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new uf("");
        field_k = -1;
        field_l = "The Pirate Ship";
        field_i = "members-only content";
    }
}
