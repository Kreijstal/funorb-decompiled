/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends fa {
    pl[] field_g;
    static byte[][] field_f;
    static kp field_d;
    static kq field_i;
    static vd[] field_h;
    static String[] field_e;

    final static boolean c() {
        int discarded$8 = -16;
        if (!(ei.a("jaclib"))) {
            return false;
        }
        int discarded$9 = -16;
        return ei.a("hw3d");
    }

    public static void b() {
        field_f = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_i = null;
    }

    final static void b(boolean param0) {
        L0: {
          ua.field_l[4] = new int[1];
          if (param0) {
            break L0;
          } else {
            tq.b(false);
            break L0;
          }
        }
        aa.field_b[4] = new nk(4);
        za.a(32, new int[6], 400, 30, 2, 468, (byte) 120);
        aa.field_b[2] = new nk(2);
        if (qr.field_a > 0) {
          L1: {
            int discarded$5 = 75;
            if (cn.a(pt.field_b)) {
              za.a(32, new int[6], 180, 170, 1, 470, (byte) 121);
              aa.field_b[1] = new nk(1);
              za.a(32, new int[4], 180, 170, 7, 470, (byte) 87);
              aa.field_b[7] = new nk(7);
              break L1;
            } else {
              break L1;
            }
          }
          co.field_b = 0;
          if ((64 & hg.field_D) == 0) {
            if (ln.field_d < 2) {
              return;
            } else {
              int discarded$6 = 1;
              si.c();
              return;
            }
          } else {
            int discarded$7 = 1;
            si.c();
            return;
          }
        } else {
          co.field_b = 0;
          if ((64 & hg.field_D) == 0) {
            if (ln.field_d >= 2) {
              int discarded$8 = 1;
              si.c();
              return;
            } else {
              return;
            }
          } else {
            int discarded$9 = 1;
            si.c();
            return;
          }
        }
    }

    tq(pl[] param0) {
        try {
            ((tq) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "tq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new byte[250][];
        field_d = new kp();
        field_e = new String[]{"All scores", "My scores", "Best each"};
    }
}
