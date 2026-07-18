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
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0, boolean param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (vr.field_c == -3) {
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
        L0: {
          param0 = param0 >> 4;
          param3 = param3 >> 4;
          param2 = param2 >> 4;
          param4 = param4 >> 4;
          if (param3 <= param2) {
            break L0;
          } else {
            var6 = param3;
            param3 = param2;
            param2 = var6;
            var6 = param0;
            param0 = param4;
            param4 = var6;
            break L0;
          }
        }
        if (param2 >= gf.field_i) {
          if (param3 <= gf.field_l) {
            if (param4 >= param0) {
              if (param4 >= gf.field_a) {
                if (gf.field_f < param0) {
                  return;
                } else {
                  gf.g(param3, param0, param2, param4, param5);
                  return;
                }
              } else {
                return;
              }
            } else {
              var6 = param3;
              param3 = param2;
              param2 = var6;
              var6 = param0;
              param0 = param4;
              param4 = var6;
              if (param4 >= gf.field_a) {
                if (gf.field_f < param0) {
                  return;
                } else {
                  gf.g(param3, param0, param2, param4, param5);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        oe.field_d.b(-1432175600);
        for (var1_int = 0; var1_int < 32; var1_int++) {
            nm.field_b[var1_int] = 0L;
        }
        for (var1_int = 0; 32 > var1_int; var1_int++) {
            fb.field_Cb[var1_int] = 0L;
        }
        if (param0 <= 120) {
            return;
        }
        try {
            hp.field_p = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "u.A(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        lg.field_c.c(123);
        if (!vp.field_o.d(0)) {
            return mh.b((byte) 115);
        }
        return 0;
    }

    static {
    }
}
