/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kn {
    java.awt.Image field_c;
    int field_g;
    static String field_b;
    static int field_h;
    static t field_f;
    int field_a;
    int[] field_d;
    static int field_e;

    public static void a() {
        field_b = null;
        field_f = null;
    }

    final void a(int param0) {
        ph.a(((kn) this).field_d, ((kn) this).field_g, ((kn) this).field_a);
        if (param0 > -82) {
            ((kn) this).field_d = null;
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    abstract void a(java.awt.Component param0, byte param1, int param2, int param3);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param5 != param4) {
                break L1;
              } else {
                if (param7 != param1) {
                  break L1;
                } else {
                  if (param6 != param8) {
                    break L1;
                  } else {
                    if (param0 != param2) {
                      break L1;
                    } else {
                      um.a(param4, param3, param7, param8, param2, false);
                      return;
                    }
                  }
                }
              }
            }
            var10_int = param4;
            var11 = param7;
            var12 = param4 * 3;
            var13 = 3 * param7;
            var14 = param5 * 3;
            var15 = 3 * param1;
            var16 = 3 * param6;
            var17 = 3 * param0;
            var18 = var14 + -var16 + (param8 - param4);
            var19 = -param7 + var15 + param2 - var17;
            var20 = -var14 + var16 + (-var14 + var12);
            var21 = var13 + (-var15 + (var17 + -var15));
            var22 = var14 + -var12;
            var23 = var15 + -var13;
            var24 = 128;
            L2: while (true) {
              if (4096 < var24) {
                break L0;
              } else {
                var25 = var24 * var24 >> 12;
                var26 = var25 * var24 >> 12;
                var27 = var18 * var26;
                var28 = var19 * var26;
                var29 = var25 * var20;
                var30 = var25 * var21;
                var31 = var22 * var24;
                var32 = var24 * var23;
                var33 = (var29 + (var27 - -var31) >> 12) + param4;
                var34 = param7 - -(var32 + (var30 + var28) >> 12);
                um.a(var10_int, param3, var11, var33, var34, false);
                var10_int = var33;
                var11 = var34;
                var24 += 128;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var10, "kn.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + -83 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Menu";
        field_h = 480;
        field_e = 0;
    }
}
