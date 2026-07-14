/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg implements Iterable {
    lm field_a;
    static long[] field_c;
    static int field_e;
    static long[][] field_b;
    static String field_d;
    static sp[] field_f;

    final lm a(int param0) {
        if (param0 < 57) {
            return null;
        }
        lm var2 = ((pg) this).field_a.field_p;
        if (((pg) this).field_a == var2) {
            return null;
        }
        var2.e(17);
        return var2;
    }

    final static void a(java.math.BigInteger param0, boolean param1, int param2, int param3, java.math.BigInteger param4, we param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var7 = un.a(param3, 108);
          if (qo.field_y == null) {
            qo.field_y = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              L3: {
                if (ed.field_b == null) {
                  break L3;
                } else {
                  if (var7 <= ed.field_b.field_k.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ed.field_b = new we(var7);
              break L2;
            }
            L4: {
              L5: {
                ed.field_b.field_m = 0;
                ed.field_b.a(param3, param2, -3493, param6);
                ed.field_b.c(var7, param1);
                ed.field_b.a(true, var15);
                if (null == bi.field_d) {
                  break L5;
                } else {
                  if (100 <= bi.field_d.field_k.length) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              bi.field_d = new we(100);
              break L4;
            }
            bi.field_d.field_m = 0;
            bi.field_d.e(160, 10);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (-5 >= (var11 ^ -1)) {
                bi.field_d.b(1276387944, param3);
                bi.field_d.a(param4, param0, 0);
                param5.a(bi.field_d.field_m, 0, -3493, bi.field_d.field_k);
                param5.a(ed.field_b.field_m, 0, -3493, ed.field_b.field_k);
                return;
              } else {
                bi.field_d.d(var15[var11], -127);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = qo.field_y.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new nb((pg) this);
    }

    final static tf[] a(int param0, byte param1) {
        tf[] var4 = new tf[9];
        tf[] var2 = var4;
        int var3 = -118 % ((param1 - 67) / 55);
        var4[4] = cl.a(64, param0, (byte) -61);
        return var2;
    }

    final void a(byte param0, lm param1) {
        if (param1.field_r != null) {
            param1.e(17);
        }
        param1.field_p = ((pg) this).field_a;
        if (param0 <= 0) {
            return;
        }
        param1.field_r = ((pg) this).field_a.field_r;
        param1.field_r.field_p = param1;
        param1.field_p.field_r = param1;
    }

    final static boolean b(int param0) {
        if (param0 != 916440577) {
            Object var2 = null;
            pg.a((java.math.BigInteger) null, false, 32, -117, (java.math.BigInteger) null, (we) null, (byte[]) null);
        }
        return ck.field_j.c(32059);
    }

    pg() {
        ((pg) this).field_a = new lm();
        ((pg) this).field_a.field_p = ((pg) this).field_a;
        ((pg) this).field_a.field_r = ((pg) this).field_a;
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
        field_c = new long[11];
        field_b = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (-257 >= (var0 ^ -1)) {
            field_c[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                field_f = new sp[132];
                field_d = "Achievements";
              } else {
                var1 = (var0 + -1) * 8;
                field_c[var0] = fp.a(fp.a(fp.a(fp.a(mk.a(4278190080L, field_b[4][4 + var1]), fp.a(mk.a(1095216660480L, field_b[3][var1 - -3]), fp.a(mk.a(field_b[2][var1 - -2], 280375465082880L), fp.a(mk.a(-72057594037927936L, field_b[0][var1]), mk.a(field_b[1][var1 + 1], 71776119061217280L))))), mk.a(field_b[5][5 + var1], 16711680L)), mk.a(65280L, field_b[6][var1 - -6])), mk.a(field_b[7][var1 - -7], 255L));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> -2128318232);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1714142977;
              if (256L <= var4) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 916440577;
              if (-257L < (var6 ^ -1L)) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1471703617;
              if ((var10 ^ -1L) <= -257L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_b[0][var0] = tg.a(tg.a(tg.a(tg.a(var10 << 1515110104, tg.a(tg.a(tg.a(var2 << 971576376, var2 << 1400283952), var6 << 1246654504), var2 << -296156768)), var8 << 69644432), var4 << -1628354808), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_b[var14][var0] = tg.a(field_b[-1 + var14][var0] << 406638584, field_b[-1 + var14][var0] >>> 632845256);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
