/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static long[][] field_c;
    static long[] field_d;
    static String field_f;
    static im field_b;
    static int[] field_a;
    static ba field_e;

    final static df[] a(int param0) {
        if (param0 != -1) {
            nd.b(91);
        }
        return new df[]{mj.field_l, vh.field_s, jc.field_a};
    }

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        field_c = (long[][]) null;
        field_f = null;
        field_d = null;
        if (param0 != -16996) {
            nd.b(-46);
        }
        field_b = null;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((vh.field_n ^ -1) > -11) {
                L2: {
                  var3_int = 0;
                  if (hh.field_c) {
                    var3_int = 1;
                    hh.field_c = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                hc.a((byte) -96, var3_int != 0, tj.a(-112), ca.a(false), sk.field_H);
                break L1;
              } else {
                if (rf.l(-28)) {
                  if (-1 == (hi.field_k ^ -1)) {
                    t.a(param2, true, false);
                    kg.a(0, (byte) -83, 0, param1);
                    break L1;
                  } else {
                    em.a(0, param1);
                    break L1;
                  }
                } else {
                  ul.d();
                  cd.a(320, false, 240);
                  kg.a(0, (byte) -83, 0, param1);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 <= -43) {
                break L3;
              } else {
                nd.b(-113);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("nd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
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
        field_c = new long[8][256];
        field_d = new long[11];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = -1 != (1 & var0 ^ -1) ? (long)(255 & var1) : (long)(var1 >>> 2008428360);
            var4 = var2 << 85931393;
            if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1942916993;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << -126708991;
            if (!(-257L < (var10 ^ -1L))) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_c[0][var0] = ml.a(ml.a(var4 << -1896259320, ml.a(var8 << -880550832, ml.a(ml.a(var2 << -1389029728, ml.a(var6 << 720891432, ml.a(var2 << -1216589520, var2 << 781183992))), var10 << -1633634152))), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_c[var14][var0] = ml.a(field_c[var14 - 1][var0] >>> 1519913672, field_c[-1 + var14][var0] << 2121176632);
            }
        }
        field_d[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while ((var15 ^ -1) >= -11) {
            var1 = (var15 + -1) * 8;
            field_d[var15] = j.a(j.a(bm.a(field_c[6][6 + var1], 65280L), j.a(bm.a(field_c[5][var1 + 5], 16711680L), j.a(bm.a(field_c[4][4 + var1], 4278190080L), j.a(bm.a(1095216660480L, field_c[3][var1 - -3]), j.a(bm.a(field_c[2][var1 + 2], 280375465082880L), j.a(bm.a(field_c[0][var1], -72057594037927936L), bm.a(field_c[1][1 + var1], 71776119061217280L))))))), bm.a(field_c[7][var1 + 7], 255L));
            var15++;
        }
        field_f = "TURBO BLAST";
        field_b = new im();
        field_a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_e = new ba(14, 0, 4, 1);
    }
}
