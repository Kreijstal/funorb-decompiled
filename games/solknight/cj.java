/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static long field_c;
    static String field_b;
    static nc field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -26497) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        var1 = 75 / ((param0 - 8) / 49);
        boolean discarded$12 = u.field_b.a(-1, th.field_K, true, ee.field_l);
        u.field_b.c(false);
        L0: while (true) {
          if (!wk.a((byte) -56)) {
            if (he.field_b != -1) {
              var2 = he.field_b;
              h.a(-1, true);
              return var2;
            } else {
              if (!ce.field_b) {
                if (gf.field_Z != gb.field_i) {
                  if (!td.field_h.a(false)) {
                    return 1;
                  } else {
                    if (ma.field_o == gf.field_Z) {
                      return 2;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            }
          } else {
            boolean discarded$13 = u.field_b.a(el.field_n, ta.field_d, (byte) -48);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept";
        field_a = new nc();
    }
}
