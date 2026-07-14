/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends rj {
    private int field_A;
    int field_E;
    int field_C;
    static String field_z;
    private tq field_D;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        if (param0 >= 70) {
          if (!super.a(98, param1, param2, param3, param4, param5, param6)) {
            return false;
          } else {
            L0: {
              var8 = param6 - (param1 + ((kd) this).field_E);
              var9 = ((kd) this).field_m + -(2 * ((kd) this).field_E);
              if (var9 < var8) {
                var8 = var9;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 >= var8) {
                break L1;
              } else {
                var8 = 0;
                break L1;
              }
            }
            L2: {
              var8 = var8 * ((kd) this).field_A / var9;
              if (1 == param4) {
                ((kd) this).field_D.a(var8, (byte) 84);
                break L2;
              } else {
                if (-3 != param4) {
                  break L2;
                } else {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L3: while (true) {
                    if (var12 >= ((kd) this).field_D.b(-1)) {
                      if (var11 < 0) {
                        return true;
                      } else {
                        ((kd) this).field_D.a(var11, 100);
                        break L2;
                      }
                    } else {
                      var13 = -var8 + ((kd) this).field_D.b(-1, var12);
                      var13 = var13 * var13;
                      if (var13 < var10) {
                        var10 = var13;
                        var11 = var12;
                        var12++;
                        continue L3;
                      } else {
                        var12++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, byte param1) {
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (param0 < ((kd) this).field_D.b(param1 + 13)) {
              L1: {
                if (param1 == -14) {
                  break L1;
                } else {
                  ((kd) this).field_D = null;
                  break L1;
                }
              }
              return ((kd) this).field_D.b(param1 ^ 13, param0);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final int c(int param0) {
        if (param0 != -3) {
            int discarded$0 = ((kd) this).a(-86, (byte) 101);
        }
        return ((kd) this).field_D.b(param0 ^ 2);
    }

    final int b(int param0) {
        if (param0 != 24857) {
            ((kd) this).field_D = null;
        }
        return ((kd) this).field_A;
    }

    public static void a(byte param0) {
        if (param0 != -121) {
            return;
        }
        field_z = null;
    }

    final static boolean c(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 <= -19) {
          L0: {
            if ((param1 & 393216) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (stackIn_5_0 != 0 | pca.b(param2, 94, param1)) {
                break L2;
              } else {
                if (!uu.a(param1, param2, (byte) -96)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L1;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    private kd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Rolling Jones boulders";
    }
}
