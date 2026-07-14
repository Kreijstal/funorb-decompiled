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

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_g = null;
        field_b = null;
        int var1 = 36 / ((76 - param0) / 34);
    }

    final static void a(int param0) {
        Object var2 = null;
        vh.a(v.field_b, (String) null, (byte) -53);
        if (param0 != 1) {
            field_c = null;
        }
    }

    final static void a(ad param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        hb var9 = null;
        int var10 = 0;
        hb var11 = null;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          var9 = new hb(param0.a("", "logo.fo3d", -127));
          var11 = var9;
          var3 = var11.a((byte) 114);
          var11.p(8);
          ri.field_c = ni.a(12, var11);
          nl.field_a = new int[var3][];
          ua.field_x = new sj[var3];
          if (param1 == 2) {
            break L0;
          } else {
            var8 = null;
            nc.a((ad) null, -50);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3) {
            var11.q(param1 ^ -110);
            var10 = 0;
            var4 = var10;
            L2: while (true) {
              if (var10 >= var3) {
                return;
              } else {
                var5 = ua.field_x[var10];
                var5.a(6, 6, 6, 1, false);
                var5.c(74);
                var6 = new int[]{var5.field_G + var5.field_q >> 1688834145, var5.field_b + var5.field_j >> -297364095, var5.field_t + var5.field_x >> 1156700769};
                nl.field_a[var10] = var6;
                var5.a(-var6[2], (byte) 70, -var6[0], -var6[1]);
                var10++;
                continue L2;
              }
            }
          } else {
            ua.field_x[var4] = gi.a(param1 + -114, var9);
            var4++;
            continue L1;
          }
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
              } else {
                var1 = (-1 + var15) * 8;
                field_g[var15] = hd.a(hd.a(sk.a(field_d[6][6 + var1], 65280L), hd.a(sk.a(field_d[5][5 + var1], 16711680L), hd.a(hd.a(hd.a(sk.a(280375465082880L, field_d[2][var1 + 2]), hd.a(sk.a(71776119061217280L, field_d[1][1 + var1]), sk.a(-72057594037927936L, field_d[0][var1]))), sk.a(1095216660480L, field_d[3][var1 - -3])), sk.a(field_d[4][4 + var1], 4278190080L)))), sk.a(field_d[7][var1 - -7], 255L));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((1 & var0) != 0) {
                stackOut_4_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 138899656);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -178921535;
              if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -607856639;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 2015582017;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_d[0][var0] = gb.a(var12, gb.a(gb.a(gb.a(var10 << -689618664, gb.a(var2 << 558587680, gb.a(var6 << -108175576, gb.a(var2 << 1616706616, var2 << 81550512)))), var8 << -355879664), var4 << -1233855032));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_d[var14][var0] = gb.a(field_d[var14 + -1][var0] << -1070532936, field_d[var14 - 1][var0] >>> 571180424);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
