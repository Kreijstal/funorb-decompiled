/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends li {
    int field_p;
    String[][] field_t;
    int field_s;
    int field_w;
    int field_y;
    int[][] field_q;
    int field_n;
    static String field_z;
    static String field_x;
    static dd field_r;
    int field_u;
    static String field_o;
    boolean field_v;

    public static void a(int param0) {
        field_r = null;
        field_z = null;
        if (param0 != 7139) {
            return;
        }
        field_o = null;
        field_x = null;
    }

    final static void b(boolean param0, int param1) {
        L0: {
          if (null == nj.field_b) {
            break L0;
          } else {
            if (nj.field_b.a((byte) -51, param0)) {
              nj.field_b = null;
              break L0;
            } else {
              if (param1 == 30834) {
                return;
              } else {
                field_z = null;
                return;
              }
            }
          }
        }
        if (param1 != 30834) {
          field_z = null;
          return;
        } else {
          return;
        }
    }

    ri() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Draw!";
        field_x = "Quick Chat lobby";
        field_o = "Connection lost. <%0>";
    }
}
