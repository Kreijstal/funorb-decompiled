/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends mc {
    int[] field_q;
    static String field_y;
    byte[][][] field_t;
    int[] field_z;
    static hl field_n;
    static String field_p;
    static String field_v;
    vl[] field_u;
    int field_r;
    vl[] field_x;
    int field_s;
    static ve field_o;
    static String field_A;
    int[] field_w;

    public static void c() {
        field_y = null;
        field_o = null;
        field_n = null;
        field_A = null;
        field_p = null;
        field_v = null;
    }

    final static void b(byte param0) {
        dl var1 = null;
        if (param0 <= 27) {
          return;
        } else {
          L0: {
            var1 = (dl) (Object) fm.field_a.c((byte) 125);
            if (var1 != null) {
              break L0;
            } else {
              var1 = new dl();
              break L0;
            }
          }
          var1.a(ra.field_g, ra.field_l, ra.field_f, ra.field_j, ra.field_b, true, ra.field_i, ra.field_e);
          oa.field_u.a((mc) (Object) var1, false);
          return;
        }
    }

    nm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Invalid date";
        field_v = "Lobby";
        field_A = "Accept";
        field_p = "Asking for or providing contact information";
    }
}
