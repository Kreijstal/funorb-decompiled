/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_f;
    static vh field_b;
    static dd field_a;
    static String field_d;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -23334) {
            Object var2 = null;
            int discarded$0 = pl.a((CharSequence) null, -41, ';');
        }
        field_d = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var3 = 0;
          var4 = param0.length();
          var5 = 0;
          if (param1 <= -69) {
            break L0;
          } else {
            var6 = null;
            int discarded$2 = pl.a((CharSequence) null, 35, 'ﾢ');
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param0.charAt(var5) == param2) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(int[] param0, int param1, int param2, int[] param3, int param4, int[] param5, int[] param6, int[] param7, int param8, int[] param9, int param10, int[] param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = Pool.field_O;
        if (param10 == -26182) {
          var12 = param2;
          var13 = param4;
          L0: while (true) {
            L1: {
              if (param8 <= var12) {
                break L1;
              } else {
                if (var13 >= param1) {
                  break L1;
                } else {
                  L2: {
                    var14 = param11[var12] + -param3[0];
                    var15 = -param3[1] + param6[var12];
                    var16 = -param3[2] + param7[var12];
                    var17 = var14 * param3[3] - -(param3[4] * var15) + param3[5] * var16 >> 2057094887;
                    var18 = param3[8] * var16 + var14 * param3[6] + param3[7] * var15 >> 1167586311;
                    var16 = var15 * param3[10] + var14 * param3[9] - -(param3[11] * var16) >> 1730672848;
                    if (0 != var16) {
                      break L2;
                    } else {
                      var16 = -1;
                      break L2;
                    }
                  }
                  param5[var12] = fb.field_q + (qh.field_b + var17 / var16);
                  param0[var12] = var18 / var16 + fb.field_d + qh.field_c;
                  param9[var12] = var16;
                  var12++;
                  var13++;
                  continue L0;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You may pot (hit into a pocket) any ball on the table to continue your visit, save for the cue ball, as long as you have first hit the lowest numbered ball!";
        field_e = "Without Guides";
        field_d = "Please log in to access this feature.";
    }
}
