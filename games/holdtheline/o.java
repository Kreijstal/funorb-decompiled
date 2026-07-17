/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static float field_c;
    static String field_d;
    static String field_b;
    static String field_a;

    public static void b() {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static hj a(int param0) {
        if (param0 != 2) {
          if (param0 != 3) {
            if (param0 >= 4) {
              if (param0 >= 8) {
                throw new RuntimeException();
              } else {
                return nj.field_c[param0 - 4].a(8192);
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return sm.field_a.a(8192);
          }
        } else {
          return ol.field_i.a(8192);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        RuntimeException decompiledCaughtException = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (0 <= param2) {
                break L1;
              } else {
                param1 = param1 + param2;
                param2 = 0;
                break L1;
              }
            }
            L2: {
              if (param6 < 0) {
                param4 = param4 + param6;
                param6 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (tc.field_c < param1 + param2) {
                param1 = tc.field_c + -param2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param5 == -4441) {
                break L4;
              } else {
                uh discarded$1 = o.a((byte) -27);
                break L4;
              }
            }
            L5: {
              if (param6 + param4 <= tc.field_j) {
                break L5;
              } else {
                param4 = -param6 + tc.field_j;
                break L5;
              }
            }
            var7_int = param0 * param3 >> 8;
            var8 = param3 - var7_int;
            var9 = param2 + param1;
            var10 = param2;
            L6: while (true) {
              if (var9 <= var10) {
                break L0;
              } else {
                var11 = param6 + var10 * tc.field_j;
                var12 = param4;
                L7: while (true) {
                  if (0 >= var12) {
                    var10++;
                    var10++;
                    continue L6;
                  } else {
                    var13 = tc.field_b[var11];
                    var14 = var13 >> 16 & 255;
                    var15 = 255 & var13 >> 8;
                    var16 = 255 & var13;
                    var17 = var15 * 6 + 5 * var14 + 5 * var16;
                    var18 = (var17 * var8 >> 12) + (var7_int * var14 >> 8);
                    var19 = (var7_int * var15 >> 8) + (var8 * var17 >> 12);
                    var20 = (var8 * var17 >> 12) + (var16 * var7_int >> 8);
                    var21 = var19 << 8 | var18 << 16 | var20;
                    tc.field_b[var11] = var21;
                    var11++;
                    var12--;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var7, "o.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static uh a(byte param0) {
        int var1 = 48 / ((param0 - -52) / 57);
        int discarded$0 = 111;
        int discarded$1 = 1;
        return ub.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = (float)Math.pow(0.949999988079071, 1.0);
        field_b = "Best Each";
        field_a = "Player 2";
    }
}
