/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_f;
    static String field_d;
    static String field_a;
    static um field_e;
    static String field_b;
    static boolean field_g;
    static ci[] field_c;

    final static tg a(int param0) {
        if (param0 > -54) {
          return (tg) null;
        } else {
          L0: {
            if (wn.field_b == null) {
              wn.field_b = new tg();
              wn.field_b.a(rb.field_b, 7829367);
              wn.field_b.field_n = 6;
              wn.field_b.field_h = rc.field_a;
              wn.field_b.field_l = 0;
              wn.field_b.field_v = 4;
              wn.field_b.field_s = 14;
              wn.field_b.field_q = 5;
              wn.field_b.field_m = 2763306;
              wn.field_b.field_j = 7697781;
              break L0;
            } else {
              break L0;
            }
          }
          return wn.field_b;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 != 76) {
            field_b = (String) null;
        }
    }

    static {
        field_f = "End game (resign)";
        field_d = "Not yet achieved";
        field_b = "Location";
        field_a = "You need to play 1 more rated game to unlock this option.";
    }
}
