/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends br {
    static ub field_i;
    static String field_h;
    static boolean field_n;
    static String field_j;
    static boolean[] field_l;
    static String field_k;
    uj field_m;
    static int field_g;
    static String field_f;

    final static dl a(byte param0, int param1, String param2) {
        kf var3 = null;
        if (param0 != 3) {
          field_f = null;
          var3 = new kf();
          ((dl) (Object) var3).field_f = param1;
          ((dl) (Object) var3).field_b = param2;
          return (dl) (Object) var3;
        } else {
          var3 = new kf();
          ((dl) (Object) var3).field_f = param1;
          ((dl) (Object) var3).field_b = param2;
          return (dl) (Object) var3;
        }
    }

    public static void a(int param0) {
        if (param0 != -6298) {
          field_i = null;
          field_h = null;
          field_k = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_k = null;
          field_l = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        }
    }

    final static void b(boolean param0, int param1) {
        nb.field_a.a(39, 0, 0);
        if (param1 >= -109) {
            Object var3 = null;
            dl discarded$0 = wj.a((byte) 68, -37, (String) null);
        }
    }

    wj(int param0) {
        if (df.field_H) {
            ((wj) this).field_m = uj.a(ei.field_a[param0], 100, 256);
            we discarded$0 = tf.a(((wj) this).field_m, (byte) -93);
        }
        if (93 == param0) {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "to return to the normal view.";
        field_k = "Show all lobby chat";
        field_n = false;
        field_j = "Get extra bang for your buck - or, in this case, extra zombie for your brain - with more zombies at the start of each match.";
        field_l = new boolean[64];
        field_f = "Spectate <%0>'s game";
    }
}
