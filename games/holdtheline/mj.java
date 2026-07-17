/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = 51 % ((param0 - 19) / 52);
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
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
        RuntimeException decompiledCaughtException = null;
        var20 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 >= 0) {
                break L1;
              } else {
                param0 = param0 + param2;
                param2 = 0;
                break L1;
              }
            }
            L2: {
              if (param4 < 0) {
                param1 = param1 + param4;
                param4 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~(param4 + param1) >= ~tc.field_c) {
                break L3;
              } else {
                param1 = -param4 + tc.field_c;
                break L3;
              }
            }
            L4: {
              if (~tc.field_j <= ~(param0 + param2)) {
                break L4;
              } else {
                param0 = -param2 + tc.field_j;
                break L4;
              }
            }
            var6_int = 128;
            var7 = param4 - -param1;
            var8 = param4;
            L5: while (true) {
              if (~var7 >= ~var8) {
                if (param3 == 0) {
                  break L0;
                } else {
                  mj.a(-35);
                  return;
                }
              } else {
                var9 = var8 * tc.field_j + param2;
                var10 = param0;
                L6: while (true) {
                  if (var10 <= 0) {
                    var8++;
                    var8++;
                    continue L5;
                  } else {
                    var11 = tc.field_b[var9];
                    var12 = (var11 & 16711680) >> 16;
                    var13 = 255 & var11 >> 8;
                    var14 = var11 & 255;
                    var15 = var14 * 5 + (6 * var13 + var12 * 5);
                    var16 = (var6_int * var15 >> 12) + (128 * var12 >> 8);
                    var17 = (var6_int * var15 >> 12) + (var13 * 128 >> 8);
                    var18 = (var15 * var6_int >> 12) + (var14 * 128 >> 8);
                    var19 = var16 << 16 | var17 << 8 | var18;
                    tc.field_b[var9] = var19;
                    var9++;
                    var10--;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var6, "mj.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 128 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names cannot start or end with space or underscore";
    }
}
