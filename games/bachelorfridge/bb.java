/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends hf {
    private int field_E;
    private mb field_G;
    static int field_F;
    int field_D;
    int field_A;

    final int a(int param0) {
        if (param0 != 2) {
            return 30;
        }
        return ((bb) this).field_G.a((byte) -127);
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        if (this.b(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((bb) this).field_A + param0 + -param2;
            var9 = -(2 * ((bb) this).field_A) + ((bb) this).field_p;
            if (var9 >= var8) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (0 > var8) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = ((bb) this).field_E * var8 / var9;
          if (param3 != 1) {
            if ((param3 ^ -1) == -3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((bb) this).field_G.a((byte) -125) <= var12) {
                  if (-1 >= (var11 ^ -1)) {
                    ((bb) this).field_G.a(var11, true);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  var13 = -var8 + ((bb) this).field_G.a((byte) -24, var12);
                  var13 = var13 * var13;
                  if (var10 > var13) {
                    var11 = var12;
                    var10 = var13;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((bb) this).field_G.c(var8, param1 ^ 7359);
            return true;
          }
        } else {
          return false;
        }
    }

    final static void h(int param0) {
        lga.a(sc.field_m, true);
        if (param0 != 0) {
            bb.h(-125);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= (param0 ^ -1)) {
          if (((bb) this).field_G.a((byte) -126) <= param0) {
            return -1;
          } else {
            return ((bb) this).field_G.a((byte) -24, param0);
          }
        } else {
          return -1;
        }
    }

    private bb() throws Throwable {
        throw new Error();
    }

    final int g(int param0) {
        if (param0 != 0) {
            return -15;
        }
        return ((bb) this).field_E;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 15;
    }
}
