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
              if ((param3 ^ -1) > -1) {
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
              if (param5 == 24074) {
                break L4;
              } else {
                field_d = (String) null;
                break L4;
              }
            }
            L5: {
              if (param3 + param4 > gf.field_b) {
                param4 = -param3 + gf.field_b;
                break L5;
              } else {
                break L5;
              }
            }
            var6_int = -param1 + 256;
            var7 = param0 - -param2;
            var8 = param0;
            L6: while (true) {
              if (var8 >= var7) {
                break L0;
              } else {
                var9 = param3 + var8 * gf.field_b;
                var10 = param4;
                L7: while (true) {
                  if (-1 <= (var10 ^ -1)) {
                    var8++;
                    continue L6;
                  } else {
                    var11 = gf.field_h[var9];
                    var12 = (var11 & 16711680) >> 1316848656;
                    var13 = (var11 & 65280) >> -253573112;
                    var14 = var11 & 255;
                    var15 = 5 * var12 - (-(var13 * 6) + -(5 * var14));
                    var16 = (param1 * var12 >> -1920208216) - -(var15 * var6_int >> -1202636692);
                    var17 = (var6_int * var15 >> -1694004020) + (param1 * var13 >> -1038161432);
                    var18 = (param1 * var14 >> 1598247144) - -(var15 * var6_int >> -1069223028);
                    var19 = var16 << -503157520 | var17 << 1165323560 | var18;
                    gf.field_h[var9] = var19;
                    var9++;
                    var10--;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "ib.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        field_c = "Projects";
        field_e = "Friends";
        field_d = "Change display name";
        field_f = new int[8192];
        field_b = "Showing combat results.";
    }
}
