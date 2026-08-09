/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static long[][] field_g;
    static long[] field_f;
    static uf field_a;
    static rd field_c;
    static String field_d;
    static String[] field_b;
    static ac field_e;

    final static void a(byte param0, String[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == cg.field_b) {
                break L1;
              } else {
                cg.field_b.field_R.a(param1, (byte) 43);
                break L1;
              }
            }
            if (param0 > 33) {
              L2: {
                if (vf.field_l == null) {
                  break L2;
                } else {
                  vf.field_l.field_H.a(param1, (byte) 43);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("ri.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_a = null;
        if (param0 != 1003075272) {
          ri.a(120);
          field_b = null;
          field_e = null;
          field_g = (long[][]) null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_g = (long[][]) null;
          field_c = null;
          return;
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_g = new long[8][256];
        field_f = new long[11];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(255 & var1) : (long)(var1 >>> 1003075272);
            var4 = var2 << -1424770047;
            if (256L <= var4) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1371341761;
            if (-257L >= (var6 ^ -1L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << -1125597695;
            if (-257L >= (var10 ^ -1L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_g[0][var0] = ba.a(var12, ba.a(var4 << 886194120, ba.a(ba.a(ba.a(var2 << -471499168, ba.a(ba.a(var2 << 167116208, var2 << -1472782920), var6 << -6117720)), var10 << -180254760), var8 << -1238624752)));
            for (var14 = 1; -9 < (var14 ^ -1); var14++) {
                field_g[var14][var0] = ba.a(field_g[-1 + var14][var0] << 2067241976, field_g[-1 + var14][var0] >>> -2072694392);
            }
        }
        field_f[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = -8 + var0 * 8;
            field_f[var0] = en.a(en.a(gh.a(65280L, field_g[6][var1 + 6]), en.a(gh.a(16711680L, field_g[5][var1 - -5]), en.a(gh.a(field_g[4][4 + var1], 4278190080L), en.a(en.a(en.a(gh.a(field_g[1][1 + var1], 71776119061217280L), gh.a(field_g[0][var1], -72057594037927936L)), gh.a(field_g[2][2 + var1], 280375465082880L)), gh.a(1095216660480L, field_g[3][3 + var1]))))), gh.a(255L, field_g[7][7 + var1]));
        }
        field_c = (rd) ((Object) new le(7, 30.0f, new int[]{16711680, 16777215}));
        field_d = "Service unavailable";
        field_b = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
