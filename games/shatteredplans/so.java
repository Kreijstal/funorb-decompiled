/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends qe {
    static qr field_v;
    static qd field_q;
    int field_u;
    static int field_m;
    static byte[] field_r;
    static qr field_t;
    int field_p;
    static String field_s;
    static int field_o;
    int field_n;

    final static void a(int param0, int param1, int param2, bi param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var4 = param1 + gf.field_b * param2;
          var5 = param0;
          var6 = param3.field_w;
          var7 = param3.field_z;
          var8 = -var7 + gf.field_b;
          var9 = 0;
          if (gf.field_a <= param2) {
            break L0;
          } else {
            var10 = gf.field_a + -param2;
            var6 = var6 - var10;
            param2 = gf.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + gf.field_b * var10;
            break L0;
          }
        }
        L1: {
          if (param1 >= gf.field_i) {
            break L1;
          } else {
            var10 = -param1 + gf.field_i;
            var5 = var5 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            var4 = var4 + var10;
            var7 = var7 - var10;
            param1 = gf.field_i;
            break L1;
          }
        }
        L2: {
          if (var6 + param2 <= gf.field_f) {
            break L2;
          } else {
            var6 = var6 - (param2 - (-var6 - -gf.field_f));
            break L2;
          }
        }
        L3: {
          if (gf.field_l >= param1 - -var7) {
            break L3;
          } else {
            var10 = -gf.field_l + (param1 + var7);
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (0 < var7) {
          if (var6 <= 0) {
            return;
          } else {
            ge.a(param3.field_B, var5, gf.field_h, 0, param0 + -28646, var7, var4, var9, var6, var8);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, int param8, int param9, int param10, boolean param11, int param12, boolean param13) {
        dn.field_k = null;
        wf.a(-15887);
        param13 = ak.a(true, param7, param5, param13, param8, param10, param9);
        fb.a(param13, param11, param10, param2, param12, param6, param4, param3, param1, param0 + param0);
        pf.a(param12, param11, -1043);
        cc.a(-115, param7, param12, param13);
    }

    public static void d(int param0) {
        field_t = null;
        field_s = null;
        field_q = null;
        field_v = null;
        field_r = null;
        if (param0 != 2) {
            field_o = -40;
        }
    }

    final static String[] a(String param0, char param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ShatteredPlansClient.field_F ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param0;
        int var3 = ak.a(-116, var10, param1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var3 > var7; var7++) {
            for (var8 = var6; param1 != param0.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param0.substring(var6, var8);
            var6 = var8 - -1;
        }
        var7 = -81 % ((param2 - -33) / 57);
        var4[var3] = param0.substring(var6);
        return var4;
    }

    so(ln param0) {
        ((so) this).field_h = param0;
        ((so) this).field_i = rp.a(96, pd.field_m, 0);
        double var2 = Math.random() * 3.141592653589793 * 2.0;
        int var4 = 16384 + vc.a((byte) -39, 16384);
        ((so) this).field_p = (int)((double)var4 * Math.sin(var2));
        ((so) this).field_n = (int)(Math.cos(var2) * (double)var4);
        ((so) this).field_u = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Show game chat from my friends";
        field_m = 0;
    }
}
