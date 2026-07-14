/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends rf {
    private int field_h;
    private int field_j;
    private int field_k;
    private int field_l;
    private int field_i;
    private int field_f;
    static String field_g;

    final static void a(int param0, int param1, hb param2) {
        ia var6 = d.field_b;
        var6.d((byte) 52, param1);
        var6.field_g = var6.field_g + 1;
        int var4 = var6.field_g;
        var6.a(1, -84);
        var6.a(param2.field_f, -60);
        var6.a(param2.field_l, -114);
        var6.c((byte) -114, param2.field_i);
        int var5 = 122 % ((40 - param0) / 43);
        var6.c((byte) -107, param2.field_h);
        var6.c((byte) -93, param2.field_k);
        var6.c((byte) -118, param2.field_j);
        int discarded$0 = var6.b((byte) -101, var4);
        var6.b(var6.field_g - var4, 31700);
    }

    final static hl[] a(int param0, String param1, ue param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != -990) {
          field_g = null;
          var4 = param2.a(param1, false);
          var5 = param2.a(param3, true, var4);
          return ge.a(9, var4, param2, var5);
        } else {
          var4 = param2.a(param1, false);
          var5 = param2.a(param3, true, var4);
          return ge.a(9, var4, param2, var5);
        }
    }

    hb(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hb) this).field_i = param2;
        ((hb) this).field_h = param3;
        ((hb) this).field_j = param5;
        ((hb) this).field_k = param4;
        ((hb) this).field_l = param1;
        ((hb) this).field_f = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = StarCannon.field_A;
        while (true) {
            param6--;
            if (param6 < 0) {
                break;
            }
            var17 = param7;
            var10_ref_int__ = var17;
            var11 = param1;
            var12 = param8;
            var13 = param4;
            var14 = param3;
            var15 = 8355711 & var17[var11] >> -463938783;
            var10_ref_int__[var11] = var15 + w.a(var12 >> -470949535, 16711680) + ((w.a(var13, 33423790) >> -667642711) + (w.a(var14, 33500947) >> -1761525007));
            param3 = param3 + param0;
            param1++;
            param8 = param8 + param2;
            param4 = param4 + param9;
        }
        int var10 = -101 % ((param5 - 31) / 36);
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 9681) {
            Object var2 = null;
            hb.a(6, 30, (hb) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "ENGINES - Power up these to increase the Nova Ray's dodging ability.";
    }
}
