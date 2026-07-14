/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends kf {
    static int[] field_M;
    int field_L;
    int field_H;
    static dg field_E;
    int field_I;
    int field_K;
    int field_G;
    int field_F;
    static pk[] field_J;

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          lf.a(param4, param2, param1 - -1, 10000536);
          lf.a(param4, param2 + param3, param1 - -1, 12105912);
          var5 = 1;
          if (lf.field_c <= var5 + param2) {
            break L0;
          } else {
            var5 = lf.field_c - param2;
            break L0;
          }
        }
        L1: {
          var6 = param3;
          if (param2 - -var6 > lf.field_h) {
            var6 = lf.field_h + -param2;
            break L1;
          } else {
            break L1;
          }
        }
        var7 = var5;
        L2: while (true) {
          if (var6 <= var7) {
            if (!param0) {
              field_J = null;
              return;
            } else {
              return;
            }
          } else {
            var8 = 48 * var7 / param3 + 152;
            var9 = var8 | (var8 << -740277136 | var8 << 329265768);
            lf.field_b[param4 + lf.field_f * (var7 + param2)] = var9;
            lf.field_b[param4 + lf.field_f * (param2 + var7) + param1] = var9;
            var7++;
            continue L2;
          }
        }
    }

    final static boolean i(int param0) {
        if (param0 != 0) {
            return true;
        }
        return pb.c(true);
    }

    public static void j(int param0) {
        field_J = null;
        field_E = null;
        field_M = null;
        if (param0 < -125) {
            return;
        }
        field_E = null;
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -((ae) this).field_t - (param5 + ((ae) this).field_L - param6);
          var9 = param3 - ((ae) this).field_F - (param4 + ((ae) this).field_o);
          if (var8 * var8 + var9 * var9 < ((ae) this).field_I * ((ae) this).field_I) {
            var10 = Math.atan2((double)var9, (double)var8) - wl.field_n;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)((ae) this).field_K;
              ((ae) this).field_G = (int)((double)((ae) this).field_K * var10 / 6.283185307179586);
              L0: while (true) {
                if (((ae) this).field_G >= ((ae) this).field_K) {
                  ((ae) this).field_G = ((ae) this).field_G - ((ae) this).field_K;
                  continue L0;
                } else {
                  L1: while (true) {
                    if (0 <= ((ae) this).field_G) {
                      return true;
                    } else {
                      ((ae) this).field_G = ((ae) this).field_G + ((ae) this).field_K;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)((ae) this).field_K;
                ((ae) this).field_G = (int)((double)((ae) this).field_K * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((ae) this).field_G >= ((ae) this).field_K) {
                    ((ae) this).field_G = ((ae) this).field_G - ((ae) this).field_K;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (0 <= ((ae) this).field_G) {
                        return true;
                      } else {
                        ((ae) this).field_G = ((ae) this).field_G + ((ae) this).field_K;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((ae) this).field_G = (int)((double)((ae) this).field_K * var10 / 6.283185307179586);
                L4: while (true) {
                  if (((ae) this).field_G >= ((ae) this).field_K) {
                    ((ae) this).field_G = ((ae) this).field_G - ((ae) this).field_K;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if (0 <= ((ae) this).field_G) {
                        return true;
                      } else {
                        ((ae) this).field_G = ((ae) this).field_G + ((ae) this).field_K;
                        continue L5;
                      }
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[12];
        field_E = new dg();
    }
}
