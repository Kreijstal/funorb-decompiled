/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends gi {
    ag field_i;
    static String field_n;
    static String field_h;
    static ok field_l;
    static String field_m;
    int field_k;
    gi field_o;
    static String field_j;

    final static int a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -86) {
          return -23;
        } else {
          var2 = param1.length();
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = oj.a((byte) 124, param1.charAt(var4)) + ((var3 << -636876187) - var3);
              var4++;
              continue L0;
            }
          }
        }
    }

    final static String b(byte param0, CharSequence param1) {
        String var2 = null;
        L0: {
          var2 = lf.a(ub.a(122, param1), (byte) -98);
          if (var2 == null) {
            var2 = "";
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 22) {
          return null;
        } else {
          return var2;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, byte param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (true) {
            param2--;
            if (0 > param2) {
                break;
            }
            var17 = param4;
            var10_ref_int__ = var17;
            var11 = param1;
            var12 = param8;
            var13 = param3;
            var14 = param7;
            var15 = (16711422 & var17[var11]) >> -1049392415;
            var10_ref_int__[var11] = (rk.a(33423494, var13) >> -897546711) + (rk.a(33423360, var12) >> -494343359) - (-rk.a(255, var14 >> -1435990607) - var15);
            param1++;
            param8 = param8 + param0;
            param3 = param3 + param5;
            param7 = param7 + param9;
        }
        int var10 = -41 / ((param6 - -36) / 63);
    }

    public static void a(boolean param0) {
        field_l = null;
        field_m = null;
        field_h = null;
        if (!param0) {
          field_n = null;
          field_n = null;
          field_j = null;
          return;
        } else {
          field_n = null;
          field_j = null;
          return;
        }
    }

    ml(ag param0, gi param1) {
        ((ml) this).field_i = param0;
        ((ml) this).field_k = param0.e();
        ((ml) this).field_o = param1;
        ((ml) this).field_i.e(dg.field_e * ((ml) this).field_k / 80);
    }

    final static int a(byte[] param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = -1;
        var5 = param1;
        L0: while (true) {
          if (param2 <= var5) {
            if (param3) {
              field_m = null;
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 ^ -1;
              return var4;
            }
          } else {
            var4 = gg.field_f[255 & (var4 ^ param0[var5])] ^ var4 >>> -319082040;
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Just play";
        field_j = "Dr Phlogiston Saves the Earth";
    }
}
