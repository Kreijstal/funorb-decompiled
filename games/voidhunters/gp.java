/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends rqa {
    static String[] field_q;
    static long[] field_o;
    static int field_p;
    static long[][] field_r;

    gp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(wda.field_q);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -23822) {
            return;
        }
        field_r = null;
        field_q = null;
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
        field_o = new long[11];
        field_r = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -257) {
            field_o[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (-11 > (var0 ^ -1)) {
              } else {
                var1 = -8 + var0 * 8;
                field_o[var0] = ihb.a(ihb.a(ihb.a(hoa.a(16711680L, field_r[5][var1 + 5]), ihb.a(ihb.a(ihb.a(hoa.a(280375465082880L, field_r[2][var1 + 2]), ihb.a(hoa.a(field_r[1][1 + var1], 71776119061217280L), hoa.a(-72057594037927936L, field_r[0][var1]))), hoa.a(field_r[3][3 + var1], 1095216660480L)), hoa.a(field_r[4][4 + var1], 4278190080L))), hoa.a(65280L, field_r[6][var1 - -6])), hoa.a(255L, field_r[7][var1 - -7]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) != 0) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> -1966732696);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1779729409;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 683027585;
              if (256L <= var6) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 389854849;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_r[0][var0] = nra.a(nra.a(nra.a(var8 << 826130256, nra.a(var10 << 83149912, nra.a(var2 << -713222944, nra.a(nra.a(var2 << 1046967160, var2 << -1779792144), var6 << 1742184936)))), var4 << -1554593912), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_r[var14][var0] = nra.a(field_r[var14 + -1][var0] << -1967985608, field_r[var14 + -1][var0] >>> 195519112);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
