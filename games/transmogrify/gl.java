/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends fi {
    static pg field_B;
    static String field_C;
    static String field_z;
    static int field_D;
    static int field_y;
    int field_A;

    public gl() {
        super(0, 0, 0, 0, (ui) null, (ma) null);
        ((gl) this).field_A = 256;
    }

    gl(qg param0) {
        super(param0.field_p, param0.field_n, param0.field_l, param0.field_h, (ui) null, (ma) null);
        param0.a(-128, 0, 0, ((gl) this).field_l, ((gl) this).field_h);
        ((gl) this).field_v = param0;
        ((gl) this).field_A = 256;
    }

    public static void i(int param0) {
        field_C = null;
        field_z = null;
        field_B = null;
        if (param0 != 2483) {
            gl.j(-39);
        }
    }

    final static void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2, byte[] param3, oa param4, int param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Transmogrify.field_A ? 1 : 0;
          var7 = ta.a(0, param5);
          if (null == i.field_a) {
            i.field_a = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if ((var9 ^ -1) <= -5) {
            L2: {
              L3: {
                if (pg.field_b == null) {
                  break L3;
                } else {
                  if (var7 <= pg.field_b.field_g.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              pg.field_b = new oa(var7);
              break L2;
            }
            L4: {
              L5: {
                pg.field_b.field_h = 0;
                pg.field_b.a((byte) -10, param3, param5, param6);
                pg.field_b.h(-30190, var7);
                pg.field_b.a(var15, 111);
                if (kd.field_c == null) {
                  break L5;
                } else {
                  if ((kd.field_c.field_g.length ^ -1) > -101) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              kd.field_c = new oa(100);
              break L4;
            }
            kd.field_c.field_h = 0;
            kd.field_c.f(6389, 10);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (4 <= var11) {
                L7: {
                  kd.field_c.c(param5, -159688920);
                  kd.field_c.a(param2, -119, param1);
                  param4.a((byte) -29, kd.field_c.field_g, kd.field_c.field_h, 0);
                  param4.a((byte) -108, pg.field_b.field_g, pg.field_b.field_h, 0);
                  if (param0 < -116) {
                    break L7;
                  } else {
                    field_B = null;
                    break L7;
                  }
                }
                return;
              } else {
                kd.field_c.a(-119, var15[var11]);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = i.field_a.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 != param2) {
            return;
        }
        if (!(((gl) this).field_v != null)) {
            return;
        }
        if (!(((gl) this).field_A != 0)) {
            return;
        }
        if (256 == ((gl) this).field_A) {
            ((gl) this).field_v.a(param0 - -((gl) this).field_p, ((gl) this).field_n + param1, param2, (byte) -12);
            return;
        }
        int var6 = -59 / ((77 - param3) / 34);
        ti var7 = new ti(((gl) this).field_v.field_l, ((gl) this).field_v.field_h);
        oj.a(var7, 256);
        ((gl) this).field_v.a(0, 0, param2, (byte) -117);
        fi.c(true);
        var7.e(((gl) this).field_p + param0, ((gl) this).field_n + param1, ((gl) this).field_A);
    }

    final static void j(int param0) {
        if (param0 != 31107) {
            field_B = null;
        }
        if (!(null == re.field_h)) {
            re.field_h.d();
        }
        if (u.field_a != null) {
            u.field_a.d();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Just play";
        field_C = "This entry doesn't match";
        field_D = 0;
    }
}
