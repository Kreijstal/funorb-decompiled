/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    int field_a;
    int field_f;
    String field_g;
    int field_h;
    static String field_i;
    boolean field_d;
    kh field_c;
    String field_b;
    fq field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        L0: {
          var35 = TombRacer.field_G ? 1 : 0;
          if (param1 != param6) {
            break L0;
          } else {
            if (param7 != param9) {
              break L0;
            } else {
              if (param0 != param2) {
                break L0;
              } else {
                if (param5 == param3) {
                  ara.a(0, param8, param6, param2, param9, param5);
                  if (param4 < -17) {
                    return;
                  } else {
                    g.a(true);
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var10 = param6;
        var11 = param9;
        var12 = 3 * param6;
        var13 = 3 * param9;
        var14 = 3 * param1;
        var15 = param7 * 3;
        var16 = 3 * param0;
        var17 = 3 * param3;
        var18 = var14 + -var16 + (param2 + -param6);
        var19 = -param9 + -var17 + (param5 + var15);
        var20 = -var14 + (-var14 + var16 + var12);
        var21 = var13 + -var15 + (-var15 + var17);
        var22 = -var12 + var14;
        var23 = -var13 + var15;
        var24 = 128;
        L1: while (true) {
          if ((var24 ^ -1) < -4097) {
            if (param4 >= -17) {
              g.a(true);
              return;
            } else {
              return;
            }
          } else {
            var25 = var24 * var24 >> 2043618156;
            var26 = var25 * var24 >> -104346676;
            var27 = var26 * var18;
            var28 = var26 * var19;
            var29 = var20 * var25;
            var30 = var25 * var21;
            var31 = var24 * var22;
            var32 = var23 * var24;
            var33 = (var31 + var27 - -var29 >> -1387134516) + param6;
            var34 = param9 - -(var32 + var30 + var28 >> 1200050796);
            ara.a(0, param8, var10, var33, var11, var34);
            var11 = var34;
            var10 = var33;
            // wide iinc 24 128
            continue L1;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_i = null;
    }

    g(String param0, String param1, int param2, int param3, boolean param4, int param5) {
        if (-1 == param1.indexOf(".trlev")) {
            param1 = param1 + ".trlev";
        }
        ((g) this).field_a = param3;
        ((g) this).field_b = param1;
        ((g) this).field_h = param5;
        ((g) this).field_d = param4 ? true : false;
        ((g) this).field_f = param2;
        ((g) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting";
    }
}
