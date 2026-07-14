/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends pl {
    static rc field_F;
    static String field_I;
    private lb field_H;
    int field_G;
    int field_J;
    private int field_K;

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = wizardrun.field_H;
        var8 = 49 / ((param1 - 12) / 36);
        if (!super.a(param0, (byte) -103, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var9 = -((vb) this).field_G + -param0 + param2;
            var10 = -(2 * ((vb) this).field_G) + ((vb) this).field_r;
            if (var9 > var10) {
              var9 = var10;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((var9 ^ -1) <= -1) {
              break L1;
            } else {
              var9 = 0;
              break L1;
            }
          }
          L2: {
            var9 = ((vb) this).field_K * var9 / var10;
            if (param4 != 1) {
              if ((param4 ^ -1) == -3) {
                var11 = 2147483647;
                var12 = -1;
                var13 = 0;
                L3: while (true) {
                  if (var13 >= ((vb) this).field_H.a(31)) {
                    if ((var12 ^ -1) <= -1) {
                      ((vb) this).field_H.d(-1, var12);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var14 = -var9 + ((vb) this).field_H.a(-112, var13);
                    var14 = var14 * var14;
                    if (var11 > var14) {
                      var12 = var13;
                      var11 = var14;
                      var13++;
                      continue L3;
                    } else {
                      var13++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((vb) this).field_H.e(16711838, var9);
              break L2;
            }
          }
          return true;
        }
    }

    final int b(int param0, int param1) {
        L0: {
          if (param0 == -10455) {
            break L0;
          } else {
            ((vb) this).field_J = 63;
            break L0;
          }
        }
        L1: {
          if (-1 < (param1 ^ -1)) {
            break L1;
          } else {
            if (((vb) this).field_H.a(param0 + 10327) > param1) {
              return ((vb) this).field_H.a(-126, param1);
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    final int d(int param0) {
        if (param0 != 0) {
            return 84;
        }
        return ((vb) this).field_H.a(-5);
    }

    final static o[] c(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -3) {
            return null;
        }
        return cb.a(param4, param2, 1, true, 1, param3, 3, param1, 1);
    }

    final int e(int param0) {
        if (param0 != 1) {
            ((vb) this).field_G = -37;
        }
        return ((vb) this).field_K;
    }

    public static void a(byte param0) {
        if (param0 <= 125) {
            field_F = null;
        }
        field_I = null;
        field_F = null;
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = null;
        field_F = new rc();
    }
}
