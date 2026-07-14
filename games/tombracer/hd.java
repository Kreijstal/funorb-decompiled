/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static boolean[] field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 29021) {
            return;
        }
        field_b = null;
    }

    final static jua a(int param0, String param1) {
        if (gsa.field_y != wt.field_d) {
          if (param0 > 114) {
            if (mua.field_a == wt.field_d) {
              if (!param1.equals((Object) (Object) uaa.field_a)) {
                oo.field_t = null;
                wt.field_d = gsa.field_y;
                uaa.field_a = param1;
                return null;
              } else {
                wt.field_d = fta.field_c;
                return oo.field_t;
              }
            } else {
              oo.field_t = null;
              wt.field_d = gsa.field_y;
              uaa.field_a = param1;
              return null;
            }
          } else {
            field_b = null;
            if (mua.field_a == wt.field_d) {
              if (!param1.equals((Object) (Object) uaa.field_a)) {
                oo.field_t = null;
                wt.field_d = gsa.field_y;
                uaa.field_a = param1;
                return null;
              } else {
                wt.field_d = fta.field_c;
                return oo.field_t;
              }
            } else {
              oo.field_t = null;
              wt.field_d = gsa.field_y;
              uaa.field_a = param1;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        mga.field_i = 1000000000L / (long)param0;
        if (param1 <= 97) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new boolean[64];
        field_b = new int[]{28, 0};
    }
}
