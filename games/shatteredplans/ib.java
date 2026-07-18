/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib {
    static String field_b;
    static String field_c;
    static String field_d;
    static int[] field_a;
    static int[] field_f;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        var20 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                param4 = param4 + param3;
                param3 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 <= param0) {
                break L2;
              } else {
                param2 = param2 + param0;
                param0 = 0;
                break L2;
              }
            }
            L3: {
              if (param0 - -param2 > gf.field_k) {
                param2 = gf.field_k - param0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              field_d = null;
              if (param3 + param4 > gf.field_b) {
                param4 = -param3 + gf.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            var6_int = 256;
            var7 = param0 - -param2;
            var8 = param0;
            L5: while (true) {
              if (var8 >= var7) {
                break L0;
              } else {
                var9 = param3 + var8 * gf.field_b;
                var10 = param4;
                L6: while (true) {
                  if (var10 <= 0) {
                    var8++;
                    continue L5;
                  } else {
                    var11 = gf.field_h[var9];
                    var12 = (var11 & 16711680) >> 16;
                    var13 = (var11 & 65280) >> 8;
                    var14 = var11 & 255;
                    var15 = 5 * var12 - (-(var13 * 6) + -(5 * var14));
                    var16 = (0 * var12 >> 8) - -(var15 * var6_int >> 12);
                    var17 = (var6_int * var15 >> 12) + (0 * var13 >> 8);
                    var18 = (0 * var14 >> 8) - -(var15 * var6_int >> 12);
                    var19 = var16 << 16 | var17 << 8 | var18;
                    gf.field_h[var9] = var19;
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
          throw r.a((Throwable) (Object) var6, "ib.E(" + param0 + ',' + 0 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + 23962 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 104 % ((-36 - param0) / 56);
        field_b = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int b(int param0);

    abstract void a(java.awt.Component param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Projects";
        field_e = "Friends";
        field_d = "Change display name";
        field_f = new int[8192];
        field_b = "Showing combat results.";
    }
}
