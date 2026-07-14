/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static h field_b;
    static int[] field_d;
    static int[] field_c;
    static int field_a;

    public static void b(int param0) {
        field_b = null;
        if (param0 > -22) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0, boolean param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
            u.b(58);
            if (2 == (vr.field_c ^ -1)) {
                ts.a(6493);
            } else {
                if (null != ce.field_x) {
                    on.a(1, param0);
                    return;
                }
                if (null == in.field_g) {
                    fr.f((byte) -99);
                    return;
                }
                on.a(1, param0);
                return;
            }
            return;
        }
        if (2 == (vr.field_c ^ -1)) {
            ts.a(6493);
        } else {
            if (null != ce.field_x) {
                on.a(1, param0);
                return;
            }
            if (null == in.field_g) {
                fr.f((byte) -99);
                return;
            }
            on.a(1, param0);
            return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        param0 = param0 >> 4;
        param3 = param3 >> 4;
        param2 = param2 >> 4;
        param4 = param4 >> 4;
        if (param3 > param2) {
            var6 = param3;
            param3 = param2;
            param2 = var6;
            var6 = param0;
            param0 = param4;
            param4 = var6;
        }
        if (param2 < gf.field_i) {
            return;
        }
        if (param3 > gf.field_l) {
            return;
        }
        if (param4 < param0) {
            var6 = param3;
            param3 = param2;
            param2 = var6;
            var6 = param0;
            param0 = param4;
            param4 = var6;
        }
        if (param1 > -7) {
            return;
        }
        if (param4 < gf.field_a) {
            return;
        }
        if (!(gf.field_f >= param0)) {
            return;
        }
        gf.g(param3, param0, param2, param4, param5);
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        oe.field_d.b(-1432175600);
        var1 = 0;
        L0: while (true) {
          if (-33 >= (var1 ^ -1)) {
            var1 = 0;
            L1: while (true) {
              if (32 <= var1) {
                if (param0 <= 120) {
                  return;
                } else {
                  hp.field_p = 0;
                  return;
                }
              } else {
                fb.field_Cb[var1] = 0L;
                var1++;
                continue L1;
              }
            }
          } else {
            nm.field_b[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    final static int a(int param0) {
        lg.field_c.c(123);
        if (vp.field_o.d(0)) {
          if (param0 >= -28) {
            field_a = -120;
            return 0;
          } else {
            return 0;
          }
        } else {
          return mh.b((byte) 115);
        }
    }

    static {
    }
}
