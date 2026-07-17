/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static long[] field_e;
    static long[][] field_c;
    static he[] field_a;
    static he[] field_b;
    static he field_d;

    final static void a(int param0, boolean param1) {
        q.a((byte) -50, param1, false);
        int var2 = -4 / ((-61 - param0) / 60);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var4 = param3.indexOf(param0);
        while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
            var4 = param3.indexOf(param0, var4 - -param2.length());
        }
        return param3;
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var1_int = of.field_w[0];
            var2 = 1;
            L1: while (true) {
              if (of.field_w.length <= var2) {
                break L0;
              } else {
                var3 = of.field_w[var2];
                kg.a(p.field_c, var2 << 4, p.field_c, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "qb.B(" + 0 + 41);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
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
        field_e = new long[11];
        field_c = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_e[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                return;
              } else {
                var1 = (var0 - 1) * 8;
                field_e[var0] = ff.a(ff.a(ff.a(ff.a(hg.a(4278190080L, field_c[4][4 + var1]), ff.a(hg.a(1095216660480L, field_c[3][var1 - -3]), ff.a(ff.a(hg.a(71776119061217280L, field_c[1][1 + var1]), hg.a(field_c[0][var1], -72057594037927936L)), hg.a(280375465082880L, field_c[2][2 + var1])))), hg.a(field_c[5][5 + var1], 16711680L)), hg.a(65280L, field_c[6][6 + var1])), hg.a(field_c[7][var1 - -7], 255L));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> 8);
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
              var4 = var2 << 1;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_c[0][var0] = gb.a(var12, gb.a(var4 << 8, gb.a(var8 << 16, gb.a(gb.a(gb.a(var6 << 40, gb.a(var2 << 48, var2 << 56)), var2 << 32), var10 << 24))));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_c[var14][var0] = gb.a(field_c[var14 + -1][var0] >>> 8, field_c[-1 + var14][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
