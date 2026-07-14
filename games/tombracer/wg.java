/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends tu {
    static String[] field_j;
    static qda field_l;
    static String[] field_m;
    static String field_k;
    static int field_i;

    final void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        nba.a(((wg) this).field_f, param3, (byte) 108);
        if (param0 != 15) {
            Object var8 = null;
            ((wg) this).a((hca) null, (la) null, true);
        }
        super.a(param0 + 0, param1, param2, param3, param4, param5);
    }

    final static String a(int param0, int[] param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        StringBuilder var5 = new StringBuilder("[");
        StringBuilder var2 = var5;
        for (var3 = param0; var3 < param1.length; var3++) {
            if (!(var3 == 0)) {
                StringBuilder discarded$0 = var2.append(44);
            }
            StringBuilder discarded$1 = var5.append("0x").append(Integer.toHexString(param1[var3]));
        }
        return String.valueOf(93);
    }

    final void a(int param0, hca param1, la param2) {
        qra.a(param2, 100, ((wg) this).field_f);
        super.a(param0, param1, param2);
    }

    public static void a(boolean param0) {
        field_k = null;
        field_j = null;
        field_m = null;
        if (!param0) {
            return;
        }
        field_l = null;
    }

    wg(ff param0) {
        super(param0);
    }

    final void a(hca param0, la param1, boolean param2) {
        if (param2) {
            Object var5 = null;
            ((wg) this).a((hca) null, (la) null, false);
        }
        caa.a(((wg) this).field_f, param1, 108);
        super.a(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1541709953) {
            break L0;
          } else {
            wg.a(true);
            break L0;
          }
        }
        var3 = 0;
        var4 = jua.field_d;
        L1: while (true) {
          if (mba.field_g.length <= var3) {
            return -1;
          } else {
            var5 = bla.field_H[var3];
            if ((var5 ^ -1) <= -1) {
              var6 = ro.a((byte) -116, mba.field_g[var3], true);
              var4 = var4 + mha.field_C;
              var7 = -(var6 >> -1760797727) + ega.field_c;
              if (!rea.a(param2, var6 - -(nja.field_L << 55236289), -nja.field_L + var7, param1, (pqa.field_p << 1541709953) + nt.field_d, false, var4)) {
                var4 = var4 + ((pqa.field_p << 951014081) + mha.field_C + nt.field_d);
                var3++;
                continue L1;
              } else {
                return var5;
              }
            } else {
              var4 = var4 + f.field_b;
              var3++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
