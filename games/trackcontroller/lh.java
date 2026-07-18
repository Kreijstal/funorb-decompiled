/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends tk {
    int field_y;
    hf field_A;
    byte[] field_z;
    static ud field_x;
    static long[][] field_B;
    static long[] field_D;
    static kk field_C;

    final byte[] g(int param0) {
        if (((lh) this).field_w) {
            throw new RuntimeException();
        }
        if (param0 != 512) {
            return null;
        }
        return ((lh) this).field_z;
    }

    public static void c(byte param0) {
        field_C = null;
        field_D = null;
        field_x = null;
        field_B = null;
    }

    final int a(byte param0) {
        if (((lh) this).field_w) {
            return 0;
        }
        if (param0 != 43) {
            byte[] discarded$0 = ((lh) this).g(126);
        }
        return 100;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 89 / ((param1 - 11) / 33);
        gl.field_E.a(0, 0, 0);
    }

    lh() {
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
        field_x = new ud();
        field_B = new long[8][256];
        field_D = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_D[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                return;
              } else {
                var1 = -8 + var0 * 8;
                field_D[var0] = ib.a(al.a(255L, field_B[7][var1 + 7]), ib.a(al.a(field_B[6][6 + var1], 65280L), ib.a(ib.a(ib.a(al.a(field_B[3][var1 - -3], 1095216660480L), ib.a(al.a(field_B[2][2 + var1], 280375465082880L), ib.a(al.a(field_B[0][var1], -72057594037927936L), al.a(71776119061217280L, field_B[1][var1 + 1])))), al.a(field_B[4][4 + var1], 4278190080L)), al.a(field_B[5][var1 - -5], 16711680L))));
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
              if (var4 < 256L) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
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
              if (256L <= var10) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_B[0][var0] = ib.b(var12, ib.b(ib.b(var8 << 16, ib.b(var10 << 24, ib.b(var2 << 32, ib.b(var6 << 40, ib.b(var2 << 48, var2 << 56))))), var4 << 8));
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_B[var14][var0] = ib.b(field_B[var14 + -1][var0] << 56, field_B[var14 + -1][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
