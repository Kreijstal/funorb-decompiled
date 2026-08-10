/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends rg {
    static int field_F;
    static String field_E;
    static int[][] field_G;

    final static int b(int param0, int param1, int param2) {
        int var3 = -g.b((param1 - 240) * (param1 + -240) + (-320 + param2) * (-320 + param2)) + 1024;
        int var4 = 88 % ((param0 - 83) / 41);
        var3 = var3 < 0 ? 0 : var3 >> 1834559458;
        return db.field_c * var3 / 224;
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (!nh.field_m) {
          if (!ee.field_b) {
            if (eo.a(param3, true, param2)) {
              return true;
            } else {
              if (!sh.field_L) {
                if (param1 <= 67) {
                  sd.a((byte) 79, 66, 86);
                  return wl.a(param0, 59, param2);
                } else {
                  return wl.a(param0, 59, param2);
                }
              } else {
                return false;
              }
            }
          } else {
            return ai.a(false, param2, param3);
          }
        } else {
          return ra.field_f.a(0, pn.field_d, sj.field_p);
        }
    }

    final static boolean h(int param0) {
        if (param0 != 3853) {
            sd.h(-41);
            return ho.a(jl.b(0), 61);
        }
        return ho.a(jl.b(0), 61);
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = param1 >> -1829295792;
        int var5 = -61 % ((73 - param0) / 44);
        int var4 = param1 & 65535;
        int var6 = param2 >> 1675141520;
        int var7 = param2 & 65535;
        return param2 * var3 + var6 * var4 - -(var7 * var4 >> 88643536);
    }

    public static void g(byte param0) {
        if (param0 != -81) {
            field_F = -88;
            field_E = null;
            field_G = (int[][]) null;
            return;
        }
        field_E = null;
        field_G = (int[][]) null;
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        ua var7 = null;
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            var7 = qi.field_a;
            if (var7 != null && this.a(81, param5, param0, param3, param2)) {
                if (this.field_A instanceof vq) {
                    ((vq) ((Object) this.field_A)).a(var7, (byte) 5, (sd) (this));
                    qi.field_a = null;
                    return;
                }
                if (!(var7.field_A instanceof vq)) {
                    return;
                }
                ((vq) ((Object) var7.field_A)).a(var7, (byte) 5, (sd) (this));
                qi.field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sd.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private sd(int param0, int param1, int param2, int param3, nl param4, bj param5, cf param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_B = param6;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = "Offensive account name";
    }
}
