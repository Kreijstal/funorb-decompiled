/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_a;
    static int field_d;
    int field_f;
    static int field_e;
    static int field_c;
    static ja[] field_b;
    int field_g;
    static ja[] field_h;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 > -21) {
            field_e = -25;
        }
        field_b = null;
        field_a = null;
    }

    final static int[] a(int[] param0, int param1, int[] param2) {
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0.length >= 1 + param2.length) {
          var3 = 0;
          var4_int = 0;
          L0: while (true) {
            if (var4_int >= param2.length) {
              var4 = new int[var3];
              var5 = (16715550 & param0[0]) >> -242715856;
              var6 = 255 & param0[0] >> -837539512;
              var7 = 255 & param0[0];
              var8 = param0[1] >> 1541241936 & 255;
              var9 = 255 & param0[1] >> -130271544;
              var10 = 255 & param0[1];
              var11 = 0;
              var12 = 0;
              var13 = 0;
              L1: while (true) {
                if (var3 <= var11) {
                  L2: {
                    if (param1 == -837539512) {
                      break L2;
                    } else {
                      field_c = -59;
                      break L2;
                    }
                  }
                  return var4;
                } else {
                  var14 = param2[var12];
                  var15 = -var13 + var14;
                  var4[var11] = (var6 * var15 / var14 - -(var9 * var13 / var14) << -1311961496) + ((var8 * var13 / var14 + var15 * var5 / var14 << 1001175184) + var7 * var15 / var14) - -(var13 * var10 / var14);
                  var13++;
                  if (var13 >= var14) {
                    var13 = 0;
                    var5 = var8;
                    var7 = var10;
                    var12++;
                    var6 = var9;
                    if (param0.length > 1 + var12) {
                      var9 = 255 & param0[var12 - -1] >> 140511336;
                      var10 = param0[var12 + 1] & 255;
                      var8 = (16729410 & param0[1 + var12]) >> -1214704272;
                      var11++;
                      continue L1;
                    } else {
                      var11++;
                      continue L1;
                    }
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            } else {
              var3 = var3 + param2[var4_int];
              var4_int++;
              continue L0;
            }
          }
        } else {
          throw new IllegalArgumentException("The colours array must have at least one more element than the gaps array!");
        }
    }

    ao(int param0, int param1, int param2, int param3) {
        ((ao) this).field_f = param3;
        ((ao) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
        field_a = "Show all private chat";
    }
}
