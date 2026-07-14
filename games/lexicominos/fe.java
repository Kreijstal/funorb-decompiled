/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe implements rd {
    final static void a(db[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        if (param0 != null) {
          if ((param2 ^ -1) >= -1) {
            return;
          } else {
            var6 = param0[0].field_r;
            var7 = param0[2].field_r;
            var8 = param0[param3].field_r;
            param0[0].a(param4, param5, param1);
            param0[2].a(-var7 + (param4 - -param2), param5, param1);
            lf.b(uh.field_C);
            lf.f(param4 - -var6, param5, -var7 + (param2 + param4), param0[1].field_x + param5);
            var9 = var6 + param4;
            var10 = -var7 + param2 + param4;
            param4 = var9;
            L0: while (true) {
              if (var10 <= param4) {
                lf.a(uh.field_C);
                return;
              } else {
                param0[1].a(param4, param5, param1);
                param4 = param4 + var8;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        db var8 = null;
        L0: {
          var6 = param1 - -param3.field_t;
          var7 = param3.field_o + param0;
          ae.a(true, param3.field_j, var7, param3.field_v, var6);
          var8 = be.field_b[1];
          if (!(param3 instanceof kf)) {
            break L0;
          } else {
            if (((kf) (Object) param3).field_C) {
              var8.d(var6 - (-1 - (param3.field_j + -var8.field_r >> -1661040447)), (param3.field_v + -var8.field_x >> -104390111) + (var7 - -1), 256);
              break L0;
            } else {
              if (param3.a(18337)) {
                pk.a(param3.field_v + -4, var7 - -2, 2 + var6, 1, param3.field_j + -4);
                if (param4 != -3284) {
                  return;
                } else {
                  return;
                }
              } else {
                if (param4 != -3284) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (!param3.a(18337)) {
          if (param4 != -3284) {
            return;
          } else {
            return;
          }
        } else {
          pk.a(param3.field_v + -4, var7 - -2, 2 + var6, 1, param3.field_j + -4);
          if (param4 != -3284) {
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
