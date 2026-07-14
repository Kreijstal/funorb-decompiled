/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements gl {
    static String[] field_g;
    static lm field_a;
    static nk field_b;
    static w field_i;
    static w field_f;
    static int field_c;
    static String[][] field_d;
    static w field_h;
    static int field_e;

    public static void a(boolean param0) {
        field_d = null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_f = null;
        if (param0) {
          return;
        } else {
          field_b = null;
          field_h = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int var6 = 0;
        int var7 = 0;
        ck var8 = null;
        var6 = param1 + param4.field_u;
        var7 = param4.field_D + param2;
        ke.a(var6, var7, param4.field_t, param4.field_y, (byte) 101);
        var8 = tl.field_u[1];
        if (param4 instanceof ek) {
          if (((ek) (Object) param4).field_H) {
            L0: {
              var8.f((param4.field_t + -var8.field_K >> -1290148639) + var6 - -1, 1 + var7 + (param4.field_y + -var8.field_C >> -1784257663), 256);
              if (param4.a(true)) {
                kd.a(-4 + param4.field_t, 2 + var6, (byte) 124, 2 + var7, param4.field_y + -4);
                break L0;
              } else {
                break L0;
              }
            }
            if (param3 >= -60) {
              tg.a(false);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (param4.a(true)) {
                kd.a(-4 + param4.field_t, 2 + var6, (byte) 124, 2 + var7, param4.field_y + -4);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 >= -60) {
              tg.a(false);
              return;
            } else {
              return;
            }
          }
        } else {
          L2: {
            if (param4.a(true)) {
              kd.a(-4 + param4.field_t, 2 + var6, (byte) 124, 2 + var7, param4.field_y + -4);
              break L2;
            } else {
              break L2;
            }
          }
          if (param3 >= -60) {
            tg.a(false);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        md.a(9, 11, cd.field_m.e(102));
        wk.field_i = true;
        if (param0 >= -2) {
            field_i = null;
        }
    }

    final static ck a(boolean param0, int param1) {
        if (!param0) {
            return null;
        }
        return ik.field_b[param1][(12 & uf.field_A) >> -2019195358];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[][]{new String[2], new String[5], new String[5], new String[5], new String[4]};
    }
}
