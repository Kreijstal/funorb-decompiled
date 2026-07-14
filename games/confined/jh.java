/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends rg {
    int field_P;
    int field_S;
    static int field_R;
    static String field_U;
    int field_Q;
    int field_W;
    int field_V;
    int field_T;

    public static void b(boolean param0) {
        field_U = null;
        if (param0) {
            return;
        }
        jh.b(false);
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Confined.field_J ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param1 + -((jh) this).field_q + (-param0 + -((jh) this).field_P);
          var9 = param5 + (-((jh) this).field_S + (-((jh) this).field_m + -param3));
          if (((jh) this).field_W * ((jh) this).field_W > var9 * var9 + var8 * var8) {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - ne.field_c;
              if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((jh) this).field_Q;
                break L0;
              } else {
                if (var10 <= 0.0) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((jh) this).field_Q;
                  ((jh) this).field_V = (int)((double)((jh) this).field_Q * var10 / 6.283185307179586);
                  L1: while (true) {
                    if (((jh) this).field_Q <= ((jh) this).field_V) {
                      ((jh) this).field_V = ((jh) this).field_V - ((jh) this).field_Q;
                      continue L1;
                    } else {
                      L2: while (true) {
                        if (-1 >= (((jh) this).field_V ^ -1)) {
                          return true;
                        } else {
                          ((jh) this).field_V = ((jh) this).field_V + ((jh) this).field_Q;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((jh) this).field_V = (int)((double)((jh) this).field_Q * var10 / 6.283185307179586);
            L3: while (true) {
              if (((jh) this).field_Q <= ((jh) this).field_V) {
                ((jh) this).field_V = ((jh) this).field_V - ((jh) this).field_Q;
                continue L3;
              } else {
                L4: while (true) {
                  if (-1 >= (((jh) this).field_V ^ -1)) {
                    return true;
                  } else {
                    ((jh) this).field_V = ((jh) this).field_V + ((jh) this).field_Q;
                    continue L4;
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

    private jh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = 0;
        field_U = "Press <%0> to fire cluster missiles";
    }
}
