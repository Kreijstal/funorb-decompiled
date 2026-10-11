/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends uf {
    static long field_i;
    int field_q;
    int field_l;
    static long[][] field_n;
    static long[] field_m;
    long field_p;
    int field_s;
    int field_o;
    int field_h;
    int[] field_r;
    int field_k;
    int field_j;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int b(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 <= 0) {
          var2 = param0;
          if (-65536 > param1) {
            var2 += 16;
            param1 = param1 >> 16;
          }
          if (param1 < -256) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 < -16) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (param1 < -4) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 < -2) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 1;
        if (param1 > 65535) {
          param1 = param1 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 > 255) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 > 15) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (3 < param1) {
          var2Lifetime1 += 2;
          param1 = param1 >> 2;
        }
        if (1 < param1) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    final static void a(int param0, dh param1) {
        hb.field_j = param1.i(-25578) << 5;
        int var2_int = param1.a(-16384);
        lb.field_d = var2_int << 18 & 1835008;
        hb.field_j = hb.field_j + (var2_int >> 3);
        lb.field_d = lb.field_d + (param1.i(param0 - 4642) << 2);
        var2_int = param1.a(param0 + 4552);
        jc.field_D = (63 & var2_int) << 15;
        lb.field_d = lb.field_d + (var2_int >> 6);
        jc.field_D = jc.field_D + (param1.a(-16384) << 7);
        var2_int = param1.a(-16384);
        jc.field_D = jc.field_D + (var2_int >> 1);
        if (param0 != -20936) {
          return;
        }
        try {
          dc.field_a = (var2_int & 1) << 16;
          dc.field_a = dc.field_a + param1.i(-25578);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "fb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_n = (long[][]) null;
        if (param0 != 6) {
          field_n = (long[][]) null;
        }
    }

    fb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_o = param5;
          fieldTemp$0 = pl.field_L;
          pl.field_L = pl.field_L + 1;
          this.field_s = fieldTemp$0 & 65535;
          this.field_r = param6;
          this.field_q = param1;
          this.field_j = param4;
          this.field_k = param2;
          this.field_h = param0;
          this.field_l = param3;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_m = new long[11];
        field_n = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 == (1 & var0) ? (long)(var1 >>> 8) : (long)(255 & var1);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_n[0][var0] = ad.a(ad.a(ad.a(var8 << 16, ad.a(var10 << 24, ad.a(ad.a(ad.a(var2 << 56, var2 << 48), var6 << 40), var2 << 32))), var4 << 8), var12);
            for (var14 = 1; 8 > var14; var14++) {
                field_n[var14][var0] = ad.a(field_n[-1 + var14][var0] >>> 8, field_n[var14 - 1][var0] << 56);
            }
            var0++;
        }
        field_m[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = 8 * var15 - 8;
            field_m[var15] = fb.a(fb.a(wj.a(field_n[6][6 + var1], 65280L), fb.a(wj.a(16711680L, field_n[5][5 + var1]), fb.a(wj.a(4278190080L, field_n[4][4 + var1]), fb.a(fb.a(fb.a(wj.a(field_n[1][1 + var1], 71776119061217280L), wj.a(-72057594037927936L, field_n[0][var1])), wj.a(280375465082880L, field_n[2][var1 + 2])), wj.a(field_n[3][var1 + 3], 1095216660480L))))), wj.a(field_n[7][var1 + 7], 255L));
            var15++;
        }
    }
}
