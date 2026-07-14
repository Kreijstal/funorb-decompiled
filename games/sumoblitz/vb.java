/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends wp {
    int field_F;
    static int field_I;
    int field_G;
    int field_K;
    static ki field_J;
    static boolean field_E;
    int field_M;
    int field_L;
    int field_H;

    public static void a(int param0) {
        if (param0 != 0) {
            field_E = false;
            field_J = null;
            return;
        }
        field_J = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 104 / ((param0 - 78) / 36);
        kt.b((byte) 108);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (!super.a(param0, -47, param2, param3, param4, param5, param6)) {
          if (param1 > -42) {
            vb.a((byte) 68, false);
            return false;
          } else {
            return false;
          }
        } else {
          var8 = param5 + (-param4 + (-((vb) this).field_r - ((vb) this).field_G));
          var9 = -((vb) this).field_K + -((vb) this).field_v + (-param6 + param2);
          if (((vb) this).field_F * ((vb) this).field_F > var9 * var9 + var8 * var8) {
            var10 = Math.atan2((double)var9, (double)var8) - s.field_m;
            if (var10 >= 0.0) {
              L0: {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((vb) this).field_L;
                  break L0;
                }
              }
              ((vb) this).field_H = (int)((double)((vb) this).field_L * var10 / 6.283185307179586);
              L1: while (true) {
                if (((vb) this).field_L <= ((vb) this).field_H) {
                  ((vb) this).field_H = ((vb) this).field_H - ((vb) this).field_L;
                  continue L1;
                } else {
                  L2: while (true) {
                    if (((vb) this).field_H >= 0) {
                      return true;
                    } else {
                      ((vb) this).field_H = ((vb) this).field_H + ((vb) this).field_L;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((vb) this).field_L;
              ((vb) this).field_H = (int)((double)((vb) this).field_L * var10 / 6.283185307179586);
              L3: while (true) {
                if (((vb) this).field_L <= ((vb) this).field_H) {
                  ((vb) this).field_H = ((vb) this).field_H - ((vb) this).field_L;
                  continue L3;
                } else {
                  L4: while (true) {
                    if (((vb) this).field_H >= 0) {
                      return true;
                    } else {
                      ((vb) this).field_H = ((vb) this).field_H + ((vb) this).field_L;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = -1;
    }
}
