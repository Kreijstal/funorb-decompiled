/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wt extends wf {
    static ia field_m;
    wt field_f;
    long field_i;
    static String[] field_g;
    wt field_j;
    static rb field_l;
    static jt field_e;
    static String[] field_k;
    static ll[] field_h;

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        field_h = null;
        field_l = null;
        field_m = null;
        field_k = null;
        if (param0 != 14349) {
            wt.a(55);
        }
    }

    final void d(int param0) {
        if (null != ((wt) this).field_f) {
          if (param0 > -113) {
            return;
          } else {
            ((wt) this).field_f.field_j = ((wt) this).field_j;
            ((wt) this).field_j.field_f = ((wt) this).field_f;
            ((wt) this).field_f = null;
            ((wt) this).field_j = null;
            return;
          }
        } else {
          return;
        }
    }

    protected wt() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"lightning1_1", "lightning2_2", "thunder_short1"};
        field_m = new ia();
        field_k = new String[]{"speed_upgrade", "gun_upgrade", "turn_upgrade", "armour_upgrade1", "extralife_upgrade", "wingman_upgrade", "multiplier_upgrade"};
    }
}
