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

    final static boolean c(boolean param0) {
        if (!ei.a("jaclib", (byte) -16)) {
          return false;
        } else {
          if (!param0) {
            field_d = (kp) null;
            return ei.a("hw3d", (byte) -16);
          } else {
            return ei.a("hw3d", (byte) -16);
          }
        }
    }

    public static void b(int param0) {
        field_f = (byte[][]) null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_i = null;
        if (param0 != 400) {
            field_f = (byte[][]) (byte[][]) null;
        }
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
            if (cn.a(pt.field_b, (byte) 75)) {
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
            if ((ln.field_d ^ -1) > -3) {
              return;
            } else {
              si.c(true);
              return;
            }
          } else {
            si.c(true);
            return;
          }
        } else {
          co.field_b = 0;
          if ((64 & hg.field_D) == 0) {
            if ((ln.field_d ^ -1) <= -3) {
              si.c(true);
              return;
            } else {
              return;
            }
          } else {
            si.c(true);
            return;
          }
        }
    }

    tq(pl[] param0) {
        ((tq) this).field_g = (pl[]) param0;
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
