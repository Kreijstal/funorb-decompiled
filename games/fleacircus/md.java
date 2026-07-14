/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends bb {
    static String[] field_P;
    int field_K;
    int field_N;
    static int field_L;
    int field_R;
    int field_Q;
    static boolean field_T;
    static String field_M;
    int field_O;
    int field_U;
    static boolean field_S;

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = fleas.field_A ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -param6 - ((md) this).field_y + (-((md) this).field_U + param4);
          var9 = -((md) this).field_R - ((md) this).field_z - param0 + param2;
          if (((md) this).field_O * ((md) this).field_O > var8 * var8 + var9 * var9) {
            var10 = Math.atan2((double)var9, (double)var8) - ik.field_G;
            if (0.0 <= var10) {
              L0: {
                if (var10 <= 0.0) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((md) this).field_N;
                  break L0;
                }
              }
              ((md) this).field_Q = (int)((double)((md) this).field_N * var10 / 6.283185307179586);
              L1: while (true) {
                if (((md) this).field_N <= ((md) this).field_Q) {
                  ((md) this).field_Q = ((md) this).field_Q - ((md) this).field_N;
                  continue L1;
                } else {
                  L2: while (true) {
                    if (-1 >= (((md) this).field_Q ^ -1)) {
                      return true;
                    } else {
                      ((md) this).field_Q = ((md) this).field_Q + ((md) this).field_N;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((md) this).field_N;
              ((md) this).field_Q = (int)((double)((md) this).field_N * var10 / 6.283185307179586);
              L3: while (true) {
                if (((md) this).field_N <= ((md) this).field_Q) {
                  ((md) this).field_Q = ((md) this).field_Q - ((md) this).field_N;
                  continue L3;
                } else {
                  L4: while (true) {
                    if (-1 >= (((md) this).field_Q ^ -1)) {
                      return true;
                    } else {
                      ((md) this).field_Q = ((md) this).field_Q + ((md) this).field_N;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void i(int param0) {
        j.field_o = null;
        d.field_L = false;
        int var1 = 28 / ((79 - param0) / 39);
        uk.field_a = null;
        oe.field_c = null;
        rc.field_g = null;
    }

    public static void a(byte param0) {
        field_M = null;
        field_P = null;
        if (param0 == -101) {
            return;
        }
        field_L = -125;
    }

    private md() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_L = 1;
        field_M = "Members";
    }
}
