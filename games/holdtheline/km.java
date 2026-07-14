/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends rm {
    static int field_G;
    int field_H;
    private uh field_K;
    private int field_J;
    int field_I;

    final int a(byte param0) {
        if (param0 != 104) {
            return 115;
        }
        return ((km) this).field_K.b(-123);
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HoldTheLine.field_D;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = -((km) this).field_I + -param0 + param5;
            var9 = ((km) this).field_x + -(2 * ((km) this).field_I);
            if (var8 > var9) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var8 >= 0) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          L2: {
            var8 = var8 * ((km) this).field_J / var9;
            if (param6 == 1) {
              ((km) this).field_K.a(var8, (byte) 123);
              break L2;
            } else {
              if (2 == param6) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((km) this).field_K.b(-113)) {
                    if (var11 < 0) {
                      break L2;
                    } else {
                      ((km) this).field_K.b(var11, (byte) 12);
                      break L2;
                    }
                  } else {
                    var13 = ((km) this).field_K.a((byte) 35, var12) - var8;
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
            }
          }
          return true;
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_G = 127;
        }
        return ((km) this).field_J;
    }

    private km() throws Throwable {
        throw new Error();
    }

    final int a(boolean param0, int param1) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((km) this).field_I = -11;
            break L0;
          }
        }
        L1: {
          if (-1 < (param1 ^ -1)) {
            break L1;
          } else {
            if (param1 < ((km) this).field_K.b(-115)) {
              return ((km) this).field_K.a((byte) 100, param1);
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 66;
    }
}
