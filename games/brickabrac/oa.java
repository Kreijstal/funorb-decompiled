/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends mh {
    static long[][] field_Wb;
    private mh field_Yb;
    static long[] field_Xb;
    int field_Vb;
    private mh[] field_Rb;
    private mh[] field_Qb;
    static String field_Pb;
    static int field_Ub;
    static ki field_Sb;
    static String field_Tb;

    final static void a(String[] args, jp[][] param1, int param2, String[][] param3, byte[] param4, mf param5, jp[][] param6, mf param7, boolean param8, int param9, int[] param10, String[][] param11, mf param12, byte[] param13, int param14) {
        if (param14 != 22287) {
            Object var16 = null;
            oa.a(56, 101, -86, 51, -89, 7, -10, 119, -103, (jp[]) null, (dh) null, (jp[]) null, -32, 111, 0, true, -111, (jp[]) null, (dh) null, 2);
        }
        og.a(args, (tp[]) null, param13, param6, param4, param10, param14 + -22286, param1, param12, param9, param5, param3, param7, param2, (int[]) null, param11, param8);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (((oa) this).field_Rb.length <= var4) {
            ((oa) this).field_Yb.a(-param0 + ((oa) this).field_cb, param0, 0, ((oa) this).field_Ib, (byte) 64);
            var4 = 65 / ((param2 - -35) / 58);
            var8 = 0;
            var5 = var8;
            L1: while (true) {
              if (((oa) this).field_Qb.length <= var8) {
                return;
              } else {
                ((oa) this).field_Qb[var8].a(((oa) this).field_Yb.field_cb - param1 * 2, param1, param1, ((oa) this).field_Yb.field_Ib + -(param1 * 2), (byte) 64);
                if (((oa) this).field_Vb != var8) {
                  ((oa) this).field_Qb[var8].field_P = ((oa) this).field_Qb[var8].field_P + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * ((oa) this).field_Ib / ((oa) this).field_Rb.length;
            var6 = ((oa) this).field_Ib * (1 + var4) / ((oa) this).field_Rb.length;
            ((oa) this).field_Rb[var4].field_P = var5;
            ((oa) this).field_Rb[var4].field_zb = 0;
            ((oa) this).field_Rb[var4].field_Ib = var6 - var5;
            ((oa) this).field_Rb[var4].field_cb = param0;
            var4++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((oa) this).field_Ib = param2;
        ((oa) this).field_zb = param5;
        ((oa) this).field_P = param1;
        if (param6 < 44) {
            Object var9 = null;
            oa.a(23, 14, 2, 105, -34, -65, 67, 44, -119, (jp[]) null, (dh) null, (jp[]) null, -66, -50, -90, false, 92, (jp[]) null, (dh) null, -101);
        }
        ((oa) this).field_cb = param4;
        this.a(param3, param0, -117);
    }

    public static void h(int param0) {
        field_Sb = null;
        field_Pb = null;
        field_Tb = null;
        int var1 = 120 / ((-3 - param0) / 47);
        field_Xb = null;
        field_Wb = null;
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (var2 >= ((oa) this).field_Rb.length) {
            return;
          } else {
            if (var2 != ((oa) this).field_Vb) {
              if (((oa) this).field_Rb[var2].field_L != 0) {
                ((oa) this).field_Rb[((oa) this).field_Vb].field_Nb = false;
                ((oa) this).field_Qb[((oa) this).field_Vb].field_P = ((oa) this).field_Qb[((oa) this).field_Vb].field_P + 10000;
                ((oa) this).field_Vb = var2;
                ((oa) this).field_Rb[var2].field_Nb = true;
                ((oa) this).field_Qb[var2].field_P = ((oa) this).field_Qb[var2].field_P - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    oa(long param0, mh param1, String[] param2, mh param3, mh[] param4, int param5) {
        super(param0, (mh) null);
        int var8 = 0;
        mh var9 = null;
        ((oa) this).field_Rb = new mh[param2.length];
        ((oa) this).field_Yb = new mh(0L, param3);
        ((oa) this).field_Qb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new mh(0L, param1);
            var9.field_Mb = param2[var8];
            ((oa) this).field_Rb[var8] = var9;
            ((oa) this).a(var9, 0);
        }
        ((oa) this).a(((oa) this).field_Yb, 0);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((oa) this).field_Yb.a(param4[var11], 0);
            var11++;
        }
        ((oa) this).field_Vb = param5;
        ((oa) this).field_Rb[param5].field_Nb = true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, jp[] param9, dh param10, jp[] param11, int param12, int param13, int param14, boolean param15, int param16, jp[] param17, dh param18, int param19) {
        if (param15) {
            field_Xb = null;
        }
        gh.a(param2, new ta(param11), param3, param0, param14, param7, param18, param10, 12, param6, new ta(param17), new ta(param9), param4, param19, param13, param8, param1, param12, param16, param5);
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
        long stackOut_4_0;
        long stackOut_3_0;
        field_Wb = new long[8][256];
        field_Xb = new long[11];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -257) {
            field_Xb[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if ((var0 ^ -1) < -11) {
                field_Pb = "Set up new unrated game";
                field_Ub = 0;
                field_Tb = "Retry";
              } else {
                var1 = var0 * 8 - 8;
                field_Xb[var0] = qf.a(ch.a(255L, field_Wb[7][7 + var1]), qf.a(ch.a(65280L, field_Wb[6][var1 - -6]), qf.a(ch.a(16711680L, field_Wb[5][var1 + 5]), qf.a(qf.a(ch.a(field_Wb[3][var1 - -3], 1095216660480L), qf.a(qf.a(ch.a(71776119061217280L, field_Wb[1][var1 - -1]), ch.a(field_Wb[0][var1], -72057594037927936L)), ch.a(field_Wb[2][var1 + 2], 280375465082880L))), ch.a(field_Wb[4][4 + var1], 4278190080L)))));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 != (var0 & 1)) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> -439318584);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 491575937;
              if (var4 < 256L) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << -2072574975;
              if (-257L < (var6 ^ -1L)) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1954815489;
              if ((var10 ^ -1L) <= -257L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_Wb[0][var0] = kg.a(var12, kg.a(kg.a(var8 << 489792528, kg.a(var10 << -1006147112, kg.a(kg.a(var6 << 2068120424, kg.a(var2 << 668401648, var2 << -215680712)), var2 << 1512023328))), var4 << -824357304));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_Wb[var14][var0] = kg.a(field_Wb[var14 + -1][var0] << -1690979528, field_Wb[-1 + var14][var0] >>> -645188984);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
