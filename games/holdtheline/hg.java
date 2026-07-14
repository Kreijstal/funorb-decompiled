/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends rm {
    int field_G;
    static uf field_Q;
    static ng field_H;
    int field_O;
    static String field_M;
    int field_K;
    static String field_N;
    int field_J;
    int field_P;
    int field_L;
    static int field_I;

    public static void a(boolean param0) {
        field_N = null;
        field_M = null;
        field_Q = null;
        if (param0) {
            field_Q = null;
            field_H = null;
            return;
        }
        field_H = null;
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param5 - (param0 + (((hg) this).field_k + ((hg) this).field_G));
          var9 = param1 + -((hg) this).field_o + (-param2 + -((hg) this).field_J);
          if (((hg) this).field_P * ((hg) this).field_P > var9 * var9 + var8 * var8) {
            var10 = Math.atan2((double)var9, (double)var8) - sj.field_L;
            if (var10 >= 0.0) {
              L0: {
                if (var10 <= 0.0) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((hg) this).field_O;
                  break L0;
                }
              }
              ((hg) this).field_K = (int)((double)((hg) this).field_O * var10 / 6.283185307179586);
              L1: while (true) {
                if (((hg) this).field_O <= ((hg) this).field_K) {
                  ((hg) this).field_K = ((hg) this).field_K - ((hg) this).field_O;
                  continue L1;
                } else {
                  L2: while (true) {
                    if (((hg) this).field_K >= 0) {
                      return true;
                    } else {
                      ((hg) this).field_K = ((hg) this).field_K + ((hg) this).field_O;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((hg) this).field_O;
              ((hg) this).field_K = (int)((double)((hg) this).field_O * var10 / 6.283185307179586);
              L3: while (true) {
                if (((hg) this).field_O <= ((hg) this).field_K) {
                  ((hg) this).field_K = ((hg) this).field_K - ((hg) this).field_O;
                  continue L3;
                } else {
                  L4: while (true) {
                    if (((hg) this).field_K >= 0) {
                      return true;
                    } else {
                      ((hg) this).field_K = ((hg) this).field_K + ((hg) this).field_O;
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

    private hg() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0) {
        if (param0 <= 36) {
            field_H = null;
            return -mk.field_d + vf.field_t;
        }
        return -mk.field_d + vf.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Checking";
    }
}
