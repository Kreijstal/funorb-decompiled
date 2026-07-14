/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends lj {
    static ib field_F;
    private int field_I;
    static int field_E;
    int field_G;
    static String field_D;
    private te field_H;
    int field_B;

    final int b(byte param0, int param1) {
        if ((param1 ^ -1) <= -1) {
            // if_icmpge L22
        } else {
            return -1;
        }
        if (param0 < 114) {
            ((fk) this).field_G = -20;
        }
        return ((fk) this).field_H.b(param1, -14927);
    }

    public static void a(byte param0) {
        int var1 = 19 % ((param0 - 2) / 44);
        field_F = null;
        field_D = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Transmogrify.field_A ? 1 : 0;
        if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = -param3 + param0 + -((fk) this).field_B;
            var9 = ((fk) this).field_l - ((fk) this).field_B * 2;
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var8 < 0) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = ((fk) this).field_I * var8 / var9;
            if (1 == param1) {
              ((fk) this).field_H.b(var8, (byte) 118);
              break L2;
            } else {
              if (-3 == (param1 ^ -1)) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((fk) this).field_H.a(1)) {
                    if ((var11 ^ -1) <= -1) {
                      ((fk) this).field_H.a(var11, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var13 = ((fk) this).field_H.b(var12, -14927) + -var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
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
              } else {
                return true;
              }
            }
          }
          return true;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param0 = hd.a('_', (byte) -81, "", param0);
          var3 = vl.b(-1, param2);
          if (param1 == 34) {
            break L0;
          } else {
            fk.a((byte) -127);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param0.indexOf(param2) ^ -1) != 0) {
              break L2;
            } else {
              if (-1 == param0.indexOf(var3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int h(int param0) {
        if (param0 != -1) {
            return 21;
        }
        return ((fk) this).field_H.a(param0 + 2);
    }

    final int i(int param0) {
        if (param0 != -24733) {
            int discarded$0 = ((fk) this).b((byte) -6, -77);
        }
        return ((fk) this).field_I;
    }

    private fk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Cancel";
    }
}
