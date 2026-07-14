/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends rj {
    int field_E;
    int field_z;
    int field_C;
    int field_B;
    int field_F;
    int field_A;
    static String field_G;

    public static void b(int param0) {
        field_G = null;
        if (param0 == 0) {
            return;
        }
        field_G = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (!super.a(112, param1, param2, param3, param4, param5, param6)) {
          if (param0 <= 70) {
            rr.b(-11);
            return false;
          } else {
            return false;
          }
        } else {
          var8 = param6 - ((rr) this).field_i - param1 - ((rr) this).field_E;
          var9 = -param2 - (((rr) this).field_n - (-((rr) this).field_C + param3));
          if (((rr) this).field_F * ((rr) this).field_F > var8 * var8 + var9 * var9) {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - uca.field_b;
              if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((rr) this).field_B;
                break L0;
              } else {
                if (var10 <= 0.0) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((rr) this).field_B;
                  ((rr) this).field_A = (int)(var10 * (double)((rr) this).field_B / 6.283185307179586);
                  L1: while (true) {
                    if (((rr) this).field_B <= ((rr) this).field_A) {
                      ((rr) this).field_A = ((rr) this).field_A - ((rr) this).field_B;
                      continue L1;
                    } else {
                      L2: while (true) {
                        if ((((rr) this).field_A ^ -1) <= -1) {
                          return true;
                        } else {
                          ((rr) this).field_A = ((rr) this).field_A + ((rr) this).field_B;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((rr) this).field_A = (int)(var10 * (double)((rr) this).field_B / 6.283185307179586);
            L3: while (true) {
              if (((rr) this).field_B <= ((rr) this).field_A) {
                ((rr) this).field_A = ((rr) this).field_A - ((rr) this).field_B;
                continue L3;
              } else {
                L4: while (true) {
                  if ((((rr) this).field_A ^ -1) <= -1) {
                    return true;
                  } else {
                    ((rr) this).field_A = ((rr) this).field_A + ((rr) this).field_B;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    private rr() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
