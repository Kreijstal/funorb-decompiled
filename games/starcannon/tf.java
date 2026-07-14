/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf implements de {
    static ue field_a;

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        hl var9 = null;
        var7 = 87 % ((param2 - 2) / 54);
        var6 = param0 - -param4.field_s;
        var8 = param4.field_j + param3;
        sk.a(var6, param4.field_i, param4.field_f, true, var8);
        var9 = fi.field_g[1];
        if (param4 instanceof dk) {
          if (((dk) (Object) param4).field_z) {
            var9.f((-var9.field_x + param4.field_i >> 869056769) + (var6 - -1), (param4.field_f - var9.field_q >> -1631256607) + 1 + var8, 256);
            if (param4.d(true)) {
              ji.a(-4 + param4.field_i, -4 + param4.field_f, -140110815, 2 + var8, 2 + var6);
              return;
            } else {
              return;
            }
          } else {
            if (param4.d(true)) {
              ji.a(-4 + param4.field_i, -4 + param4.field_f, -140110815, 2 + var8, 2 + var6);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param4.d(true)) {
            ji.a(-4 + param4.field_i, -4 + param4.field_f, -140110815, 2 + var8, 2 + var6);
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 18172) {
            tf.a(-88);
        }
    }

    static {
    }
}
