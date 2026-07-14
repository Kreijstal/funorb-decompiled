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
        if (null == cg.field_b) {
          if (param0 <= 33) {
            return;
          } else {
            L0: {
              if (vf.field_l == null) {
                break L0;
              } else {
                vf.field_l.field_H.a(param1, (byte) 43);
                break L0;
              }
            }
            return;
          }
        } else {
          cg.field_b.field_R.a(param1, (byte) 43);
          if (param0 <= 33) {
            return;
          } else {
            L1: {
              if (vf.field_l == null) {
                break L1;
              } else {
                vf.field_l.field_H.a(param1, (byte) 43);
                break L1;
              }
            }
            return;
          }
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
          field_g = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_g = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_g = new long[8][256];
        field_f = new long[11];
        var0 = 0;
        L0: while (true) {
          if (-257 >= (var0 ^ -1)) {
            field_f[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
                field_c = (rd) (Object) new le(7, 30.0f, new int[2]);
                field_d = "Service unavailable";
                field_b = new String[]{"Showing by rating", "Showing by win percentage"};
              } else {
                var1 = -8 + var0 * 8;
                field_f[var0] = en.a(en.a(gh.a(65280L, field_g[6][var1 + 6]), en.a(gh.a(16711680L, field_g[5][var1 - -5]), en.a(gh.a(field_g[4][4 + var1], 4278190080L), en.a(en.a(en.a(gh.a(field_g[1][1 + var1], 71776119061217280L), gh.a(field_g[0][var1], -72057594037927936L)), gh.a(field_g[2][2 + var1], 280375465082880L)), gh.a(1095216660480L, field_g[3][3 + var1]))))), gh.a(255L, field_g[7][7 + var1]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> 1003075272);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -1424770047;
              if (256L > var4) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1371341761;
              if (-257L < (var6 ^ -1L)) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << -1125597695;
              if (-257L < (var10 ^ -1L)) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_g[0][var0] = ba.a(var12, ba.a(var4 << 886194120, ba.a(ba.a(ba.a(var2 << -471499168, ba.a(ba.a(var2 << 167116208, var2 << -1472782920), var6 << -6117720)), var10 << -180254760), var8 << -1238624752)));
            var14 = 1;
            L6: while (true) {
              if (-9 >= (var14 ^ -1)) {
                var0++;
                continue L0;
              } else {
                field_g[var14][var0] = ba.a(field_g[-1 + var14][var0] << 2067241976, field_g[-1 + var14][var0] >>> -2072694392);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
