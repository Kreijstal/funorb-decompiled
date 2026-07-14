/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends ak {
    static String field_Fb;
    private ak field_Eb;
    static String[] field_Hb;
    static tf field_Gb;

    final static ak j(int param0) {
        if (param0 != 0) {
            hp.a(41, 47, -28, (byte) -84, 63);
        }
        return kc.e(16);
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -43) {
            break L0;
          } else {
            field_Fb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              ((hp) this).a(-28476, true);
              if (0 == nm.field_c) {
                break L3;
              } else {
                if (((hp) this).field_P == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((hp) this).field_Eb.field_P == 0) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        ti.a(false);
        if (param3 > -83) {
            ak discarded$0 = hp.j(-32);
        }
        t.d(param0, param4, param2, param1);
    }

    hp(ak param0, ak param1, ak param2, ak param3, ak param4, ak param5) {
        int var12 = 0;
        ak var13 = null;
        ak var14 = null;
        int var15 = 0;
        ak var17 = new ak(0L, param1, ui.field_g.toUpperCase());
        var17.field_Bb = 1;
        ((hp) this).field_Eb = new ak(0L, param2);
        ak var8 = new ak(0L, param3);
        ak var9 = new ak(0L, param3, mg.field_g);
        var9.field_Bb = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < kd.field_c.length; var12++) {
            var13 = new ak(0L, param3, cf.field_I[var12]);
            var14 = new ak(0L, param3, kd.field_c[var12]);
            var15 = param3.field_Db.c(kd.field_c[var12]);
            var13.a(var10, 15, 20, 256, 65);
            if (var11 < var15) {
                var11 = var15;
            }
            var14.a(var10, 15, 90, 256, 640);
            var8.a(var13, (byte) 26);
            var10 += 30;
            var8.a(var14, (byte) 26);
        }
        var17.a(0, 24, 0, 256, 20 + (var11 + 90));
        var10 += 15;
        ((hp) this).a(100, var17.field_nb + var10, 100, 256, var17.field_K);
        ((hp) this).field_Eb.a(5, 15, -20 + var17.field_K, 256, 15);
        var8.a(var17.field_nb, ((hp) this).field_nb + -var17.field_nb, 0, 256, ((hp) this).field_K);
        var9.a(20, 15, 0, 256, ((hp) this).field_K);
        var8.field_zb = op.a(8421504, 16, 11579568, var8.field_nb, 2105376, 3);
        var17.a(((hp) this).field_Eb, (byte) 26);
        var8.a(var9, (byte) 26);
        ((hp) this).a(var17, (byte) 26);
        ((hp) this).a(var8, (byte) 26);
        var10 = -(((hp) this).field_nb >> -596341119) + 240;
        ((hp) this).field_D = 320 + -(((hp) this).field_K >> -1068103615);
    }

    public static void b(byte param0) {
        field_Fb = null;
        if (param0 != -15) {
            field_Gb = null;
        }
        field_Gb = null;
        field_Hb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = new String[]{"Difficulty", "Number of Pictures"};
        field_Fb = "Enter name of friend to delete from list";
    }
}
