/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ppa extends rqa {
    static String field_o;
    static String field_q;
    static int[] field_p;

    final static int a(int param0, int param1, boolean param2) {
        if (!param2) {
          if ((param1 ^ -1) > -3) {
            if (param0 >= 5) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          int discarded$7 = ppa.a(120, -7, true);
          if ((param1 ^ -1) > -3) {
            if (param0 >= 5) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        vv.field_c = param0[0].a(26);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    public static void b(boolean param0) {
        field_p = null;
        field_o = null;
        if (param0) {
            field_o = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    ppa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Add event";
        field_o = "More asteroids";
    }
}
