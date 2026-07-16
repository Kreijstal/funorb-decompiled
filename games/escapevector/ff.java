/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    private mf field_d;
    private fa field_c;
    static int field_h;
    private mf field_j;
    static ka field_b;
    static int field_e;
    static boolean field_g;
    static String field_f;
    static String field_a;
    static hh field_i;

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        if (param2 != 64) {
          field_i = null;
          fc.a(3161);
          bo.field_F.l(param2 ^ 17479);
          dd.field_d = new h(vk.field_v, (String) null, eb.field_H, param3, param1);
          rd.field_c = new ng(bo.field_F, (hm) (Object) dd.field_d);
          bo.field_F.b((hm) (Object) rd.field_c, 40);
          return;
        } else {
          fc.a(3161);
          bo.field_F.l(param2 ^ 17479);
          dd.field_d = new h(vk.field_v, (String) null, eb.field_H, param3, param1);
          rd.field_c = new ng(bo.field_F, (hm) (Object) dd.field_d);
          bo.field_F.b((hm) (Object) rd.field_c, 40);
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_b = null;
        field_f = null;
        if (param0 != 100) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final si a(int param0, byte param1) {
        si var3 = null;
        byte[] var4 = null;
        var3 = (si) ((ff) this).field_c.a((long)param0, (byte) -54);
        if (var3 == null) {
          L0: {
            if (-32769 < (param0 ^ -1)) {
              var4 = ((ff) this).field_d.a(1, (byte) -97, param0);
              break L0;
            } else {
              var4 = ((ff) this).field_j.a(1, (byte) -97, 32767 & param0);
              break L0;
            }
          }
          L1: {
            var3 = new si();
            if (var4 != null) {
              var3.a(new n(var4), 0);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-32769 >= (param0 ^ -1)) {
              var3.d((byte) 88);
              break L2;
            } else {
              break L2;
            }
          }
          if (param1 > -118) {
            field_e = -127;
            ((ff) this).field_c.a((Object) (Object) var3, (long)param0, (byte) 100);
            return var3;
          } else {
            ((ff) this).field_c.a((Object) (Object) var3, (long)param0, (byte) 100);
            return var3;
          }
        } else {
          return var3;
        }
    }

    final static void a(byte param0) {
        if (param0 > 50) {
          jg.a((byte) 123);
          if ((mj.field_d ^ -1) == -1) {
            if (dj.field_c == null) {
              dj.field_c = hl.c(nn.field_g, 100, 3072 * qm.field_c / 64, 8192);
              rk.field_e.a((wg) (Object) dj.field_c);
              sj.a(8192, (byte) 51);
              if (-1001 >= (mj.field_d ^ -1)) {
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              } else {
                mj.field_d = mj.field_d + 1;
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              }
            } else {
              dj.field_c.g(2048);
              dj.field_c = hl.c(nn.field_g, 100, 3072 * qm.field_c / 64, 8192);
              rk.field_e.a((wg) (Object) dj.field_c);
              sj.a(8192, (byte) 51);
              if (-1001 >= (mj.field_d ^ -1)) {
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              } else {
                mj.field_d = mj.field_d + 1;
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              }
            }
          } else {
            if (-1001 < (mj.field_d ^ -1)) {
              mj.field_d = mj.field_d + 1;
              pl.field_q.a(400);
              r.field_y = true;
              de.field_j = true;
              return;
            } else {
              pl.field_q.a(400);
              r.field_y = true;
              de.field_j = true;
              return;
            }
          }
        } else {
          ff.a((byte) -15);
          jg.a((byte) 123);
          if ((mj.field_d ^ -1) == -1) {
            if (dj.field_c == null) {
              dj.field_c = hl.c(nn.field_g, 100, 3072 * qm.field_c / 64, 8192);
              rk.field_e.a((wg) (Object) dj.field_c);
              sj.a(8192, (byte) 51);
              if (-1001 < (mj.field_d ^ -1)) {
                mj.field_d = mj.field_d + 1;
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              } else {
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              }
            } else {
              dj.field_c.g(2048);
              dj.field_c = hl.c(nn.field_g, 100, 3072 * qm.field_c / 64, 8192);
              rk.field_e.a((wg) (Object) dj.field_c);
              sj.a(8192, (byte) 51);
              if (-1001 < (mj.field_d ^ -1)) {
                mj.field_d = mj.field_d + 1;
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              } else {
                pl.field_q.a(400);
                r.field_y = true;
                de.field_j = true;
                return;
              }
            }
          } else {
            if (-1001 < (mj.field_d ^ -1)) {
              mj.field_d = mj.field_d + 1;
              pl.field_q.a(400);
              r.field_y = true;
              de.field_j = true;
              return;
            } else {
              pl.field_q.a(400);
              r.field_y = true;
              de.field_j = true;
              return;
            }
          }
        }
    }

    private ff() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ka();
        field_a = "Waiting for extra data";
        field_f = "Container is on hill - please land closer";
    }
}
