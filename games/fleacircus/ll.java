/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lh {
    boolean field_l;
    static boolean field_j;
    static jd field_n;
    int[][] field_p;
    int field_k;
    int field_t;
    long[][] field_u;
    static ed field_r;
    static String field_o;
    String[][] field_i;
    int field_q;
    static int field_s;
    static int field_m;

    public static void a(int param0) {
        if (param0 <= 3) {
          field_j = false;
          field_n = null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_n = null;
          field_o = null;
          field_r = null;
          return;
        }
    }

    final static void d(int param0) {
        if (null != fl.field_b) {
          fl.field_b.f();
          oe.a((byte) -118, rh.field_c.field_x, fleas.field_E);
          gi.field_b.a((byte) 71);
          if (param0 != 336) {
            ll.a(-25);
            return;
          } else {
            return;
          }
        } else {
          fl.field_b = new dd(640, 336);
          fl.field_b.f();
          oe.a((byte) -118, rh.field_c.field_x, fleas.field_E);
          gi.field_b.a((byte) 71);
          if (param0 == 336) {
            return;
          } else {
            ll.a(-25);
            return;
          }
        }
    }

    ll() {
    }

    static {
        field_o = "Logging in...";
        field_r = new ed();
        field_m = 640;
    }
}
