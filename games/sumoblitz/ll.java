/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static long[] field_b;
    static long[][] field_a;
    static String field_c;

    public static void b(int param0) {
        field_a = (long[][]) null;
        field_b = null;
        if (param0 >= -107) {
            field_b = (long[]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void c(int param0) {
        iv.field_i = 1;
        hc.field_f = 1;
        if (param0 < 40) {
          field_a = (long[][]) null;
          ki.field_f = 1;
          la.a(ql.field_A, 0, 25, -1);
          return;
        } else {
          ki.field_f = 1;
          la.a(ql.field_A, 0, 25, -1);
          return;
        }
    }

    final static void a(int param0) {
        ql.field_z = new int[25];
        if (param0 != 17534) {
          field_a = (long[][]) null;
          hc.field_f = 1;
          ql.field_A = new int[25];
          go.field_j = new int[25];
          bl.field_e = -1;
          wm.field_f = new boolean[25];
          ki.field_f = 1;
          up.field_g = new boolean[25];
          iv.field_i = 1;
          qn.field_d = new boolean[25];
          la.a(ql.field_z, 0, 25, 2147483647);
          la.a(ql.field_A, 0, 25, -1);
          return;
        } else {
          hc.field_f = 1;
          ql.field_A = new int[25];
          go.field_j = new int[25];
          bl.field_e = -1;
          wm.field_f = new boolean[25];
          ki.field_f = 1;
          up.field_g = new boolean[25];
          iv.field_i = 1;
          qn.field_d = new boolean[25];
          la.a(ql.field_z, 0, 25, 2147483647);
          la.a(ql.field_A, 0, 25, -1);
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
        field_b = new long[11];
        field_a = new long[8][256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (var0 & 1) ? (long)(255 & var1) : (long)(var1 >>> 34662408);
            var4 = var2 << 1202721729;
            if (-257L >= (var4 ^ -1L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << -830248831;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << -536216831;
            if (-257L >= (var10 ^ -1L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_a[0][var0] = fi.a(var12, fi.a(var4 << 149771912, fi.a(fi.a(fi.a(fi.a(var6 << 1633414312, fi.a(var2 << 1163483312, var2 << 493026936)), var2 << -1821450912), var10 << 1857500632), var8 << 28350928)));
            for (var14 = 1; 8 > var14; var14++) {
                field_a[var14][var0] = fi.a(field_a[var14 - 1][var0] >>> 1210724488, field_a[var14 + -1][var0] << 504528696);
            }
        }
        field_b[0] = 0L;
        for (var0 = 1; -11 <= (var0 ^ -1); var0++) {
            var1 = 8 * (-1 + var0);
            field_b[var0] = bi.a(bi.a(bi.a(bi.a(sd.a(4278190080L, field_a[4][4 + var1]), bi.a(sd.a(1095216660480L, field_a[3][var1 - -3]), bi.a(sd.a(280375465082880L, field_a[2][var1 - -2]), bi.a(sd.a(field_a[1][var1 - -1], 71776119061217280L), sd.a(field_a[0][var1], -72057594037927936L))))), sd.a(16711680L, field_a[5][var1 - -5])), sd.a(field_a[6][6 + var1], 65280L)), sd.a(field_a[7][7 + var1], 255L));
        }
        field_c = "Resume Game";
    }
}
