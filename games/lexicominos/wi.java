/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends kf {
    private int field_F;
    int field_G;
    int field_H;
    private gl field_E;

    final int a(int param0, byte param1) {
        if (param1 == -37) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (((wi) this).field_E.a((byte) -110) > param0) {
                return ((wi) this).field_E.a(param0, -116);
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return -43;
        }
    }

    final int i(int param0) {
        if (param0 != -1) {
            return 59;
        }
        return ((wi) this).field_F;
    }

    final int e(boolean param0) {
        if (param0) {
            return -53;
        }
        return ((wi) this).field_E.a((byte) -110);
    }

    final static mb a(int param0, byte param1, String param2) {
        if (param1 >= -47) {
            Object var4 = null;
            mb discarded$0 = wi.a(20, (byte) 18, (String) null);
        }
        mb var3 = new mb(false);
        var3.field_e = param2;
        var3.field_f = param0;
        return var3;
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Lexicominos.field_L ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = -((wi) this).field_G + (param6 - param5);
            var9 = ((wi) this).field_j + -(2 * ((wi) this).field_G);
            if (var9 >= var8) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (-1 >= (var8 ^ -1)) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          L2: {
            var8 = ((wi) this).field_F * var8 / var9;
            if (1 != param1) {
              if (2 == param1) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((wi) this).field_E.a((byte) -110)) {
                    if (-1 >= (var11 ^ -1)) {
                      ((wi) this).field_E.a(var11, (byte) 108);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var13 = ((wi) this).field_E.a(var12, -115) + -var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((wi) this).field_E.c(var8, 1);
              break L2;
            }
          }
          return true;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, byte param2, le param3, int param4, int param5, int param6, int param7, int param8, db[] param9, db[] param10) {
        ia.a((byte) 46);
        int var11 = -27 % ((param2 - -35) / 52);
    }

    static {
    }
}
