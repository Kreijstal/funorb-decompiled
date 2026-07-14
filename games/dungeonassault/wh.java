/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static String field_c;
    static ph field_g;
    static boolean field_d;
    static long field_e;
    static int field_a;
    vh field_b;
    int field_f;

    final static void a(int param0) {
        if (param0 == 96) {
          if (null == ub.field_n) {
            if (null != hm.field_n) {
              hm.field_n.c();
              return;
            } else {
              return;
            }
          } else {
            ub.field_n.c();
            if (null == hm.field_n) {
              return;
            } else {
              hm.field_n.c();
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 96) {
            return;
        }
        field_c = null;
        field_g = null;
    }

    wh(vh param0, int param1) {
        ((wh) this).field_f = param1;
        ((wh) this).field_b = param0;
    }

    final static gp a(byte[] param0, byte param1) {
        gp var2 = null;
        if (param1 == -122) {
          if (param0 == null) {
            return null;
          } else {
            var2 = new gp(param0, hg.field_t, fe.field_g, jc.field_f, jn.field_k, ub.field_q);
            sb.a(500);
            return var2;
          }
        } else {
          wh.b(-53);
          if (param0 == null) {
            return null;
          } else {
            var2 = new gp(param0, hg.field_t, fe.field_g, jc.field_f, jn.field_k, ub.field_q);
            sb.a(500);
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 96;
        field_c = "Select rooms to place from the panel on the left";
    }
}
