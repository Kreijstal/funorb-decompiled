/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_c;
    static long[][] field_d;
    static long[] field_g;
    static int field_f;
    static int field_e;
    static int[] field_b;
    static String field_a;

    public static void b() {
        field_a = null;
        field_c = null;
        field_d = null;
        field_g = null;
        field_b = null;
        int var1 = -36;
    }

    final static void a() {
        Object var2 = null;
        vh.a(v.field_b, (String) null, (byte) -53);
    }

    final static void a(ad param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        hb var9 = null;
        int var10 = 0;
        hb var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = new hb(param0.a("", "logo.fo3d", -127));
              var11 = var9;
              var3 = var11.a((byte) 114);
              var11.p(8);
              ri.field_c = ni.a(12, var11);
              nl.field_a = new int[var3][];
              ua.field_x = new sj[var3];
              if (param1 == 2) {
                break L1;
              } else {
                var8 = null;
                nc.a((ad) null, -50);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3) {
                var11.q(param1 ^ -110);
                var10 = 0;
                var4 = var10;
                L3: while (true) {
                  if (var10 >= var3) {
                    break L0;
                  } else {
                    var5 = ua.field_x[var10];
                    var5.a(6, 6, 6, 1, false);
                    var5.c(74);
                    var6 = new int[]{var5.field_G + var5.field_q >> 1, var5.field_b + var5.field_j >> 1, var5.field_t + var5.field_x >> 1};
                    nl.field_a[var10] = var6;
                    var5.a(-var6[2], (byte) 70, -var6[0], -var6[1]);
                    var10++;
                    continue L3;
                  }
                }
              } else {
                ua.field_x[var4] = gi.a(param1 + -114, var9);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("nc.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
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
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_c = "Friends can be added in multiplayer<nbsp>games";
        field_d = new long[8][256];
        field_g = new long[11];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_g[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (10 < var15) {
                field_a = "Resume Game";
                return;
              } else {
                var1 = (-1 + var15) * 8;
                field_g[var15] = hd.a(hd.a(sk.a(field_d[6][6 + var1], 65280L), hd.a(sk.a(field_d[5][5 + var1], 16711680L), hd.a(hd.a(hd.a(sk.a(280375465082880L, field_d[2][var1 + 2]), hd.a(sk.a(71776119061217280L, field_d[1][1 + var1]), sk.a(-72057594037927936L, field_d[0][var1]))), sk.a(1095216660480L, field_d[3][var1 - -3])), sk.a(field_d[4][4 + var1], 4278190080L)))), sk.a(field_d[7][var1 - -7], 255L));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((1 & var0) != 0) {
                stackOut_4_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 8);
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
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_d[0][var0] = gb.a(var12, gb.a(gb.a(gb.a(var10 << 24, gb.a(var2 << 32, gb.a(var6 << 40, gb.a(var2 << 56, var2 << 48)))), var8 << 16), var4 << 8));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_d[var14][var0] = gb.a(field_d[var14 + -1][var0] << 56, field_d[var14 - 1][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
