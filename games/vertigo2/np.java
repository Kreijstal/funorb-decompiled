/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends cr {
    private cr field_Hb;
    static cr field_Ib;
    static float field_Nb;
    static r field_Kb;
    static int field_Lb;
    static int field_Ob;
    static String field_Mb;
    static String field_Jb;

    final boolean a(byte param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        ((np) this).a(param0 ^ -51, true);
        if (param0 == -51) {
          if (-1 == kf.field_c) {
            if (((np) this).field_Hb.field_tb != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            if (((np) this).field_tb != 0) {
              L0: {
                if (((np) this).field_Hb.field_tb == 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          field_Ob = 28;
          if (-1 != (kf.field_c ^ -1)) {
            if (((np) this).field_tb == -1) {
              return true;
            } else {
              L1: {
                if (((np) this).field_Hb.field_tb == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (((np) this).field_Hb.field_tb == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_Mb = null;
        field_Kb = null;
        field_Ib = null;
        field_Jb = null;
        int var1 = 87 / ((-67 - param0) / 34);
    }

    np(cr param0, cr param1, cr param2, cr param3, cr param4, cr param5) {
        int var12 = 0;
        cr var13 = null;
        cr var14 = null;
        int var15 = 0;
        cr var17 = new cr(0L, param1, br.field_W.toUpperCase());
        var17.field_O = 1;
        ((np) this).field_Hb = new cr(0L, param2);
        cr var8 = new cr(0L, param3);
        cr var9 = new cr(0L, param3, ac.field_N);
        var9.field_O = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; sd.field_M.length > var12; var12++) {
            var13 = new cr(0L, param3, qr.field_k[var12]);
            var14 = new cr(0L, param3, sd.field_M[var12]);
            var15 = param3.field_z.c(sd.field_M[var12]);
            var13.a(115, 65, 15, var10, 20);
            if (var11 < var15) {
                var11 = var15;
            }
            var14.a(85, 640, 15, var10, 90);
            var8.b(var13, 121);
            var8.b(var14, 125);
            var10 += 30;
        }
        var10 += 15;
        var17.a(126, 90 + (var11 - -20), 24, 0, 0);
        ((np) this).a(95, var17.field_Fb, var17.field_db + var10, 100, 100);
        ((np) this).field_Hb.a(84, 15, 15, 5, var17.field_Fb - 20);
        var8.a(87, ((np) this).field_Fb, ((np) this).field_db + -var17.field_db, var17.field_db, 0);
        var9.a(83, ((np) this).field_Fb, 15, 20, 0);
        var8.field_Bb = vl.a(var8.field_db, 3, 0, 2105376, 11579568, 8421504);
        var17.b(((np) this).field_Hb, 124);
        var8.b(var9, 127);
        ((np) this).b(var17, 121);
        ((np) this).b(var8, 118);
        var10 = -(((np) this).field_db >> 297713889) + 240;
        ((np) this).field_wb = -(((np) this).field_Fb >> -1337576255) + 320;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "Concluded";
        field_Jb = "End Game";
        field_Ob = -1;
    }
}
