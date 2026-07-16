/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.Applet;

final class od extends fb {
    int field_S;
    static long[] field_N;
    static long[][] field_O;
    int field_P;
    int field_T;
    int field_Q;
    int field_M;
    static ci field_V;
    static String field_X;
    static volatile boolean field_W;
    int field_R;
    static String field_U;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            java.applet.Applet stackIn_1_0 = null;
            java.applet.Applet stackIn_2_0 = null;
            java.applet.Applet stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            Throwable decompiledCaughtException = null;
            java.applet.Applet stackOut_0_0 = null;
            java.applet.Applet stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            java.applet.Applet stackOut_1_0 = null;
            int stackOut_1_1 = 0;
            try {
              L0: {
                L1: {
                  var4 = param1.getCodeBase();
                  var3 = rh.a(var4, param1, (byte) -87).getFile();
                  Object discarded$6 = u.a(param1, true, new Object[2], "updatelinks");
                  Object discarded$7 = u.a(param1, true, new Object[2], "updatelinks");
                  stackOut_0_0 = (java.applet.Applet) param1;
                  stackIn_2_0 = stackOut_0_0;
                  stackIn_1_0 = stackOut_0_0;
                  if (param0) {
                    stackOut_2_0 = (java.applet.Applet) (Object) stackIn_2_0;
                    stackOut_2_1 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    break L1;
                  } else {
                    stackOut_1_0 = (java.applet.Applet) (Object) stackIn_1_0;
                    stackOut_1_1 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_3_1 = stackOut_1_1;
                    break L1;
                  }
                }
                L2: {
                  Object discarded$8 = u.a(stackIn_3_0, stackIn_3_1 != 0, new Object[2], "updatelinks");
                  if (!param0) {
                    break L2;
                  } else {
                    od.b(false);
                    break L2;
                  }
                }
                Object discarded$9 = u.a(param1, true, new Object[2], "updatelinks");
                Object discarded$10 = u.a(param1, true, new Object[2], "updatelinks");
                Object discarded$11 = u.a(param1, true, new Object[2], "updatelinks");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Chess.field_G;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          var8 = -((od) this).field_Q + (-param6 + (-((od) this).field_u + param1));
          var9 = -param5 - (((od) this).field_r + ((od) this).field_M) + param2;
          if (((od) this).field_T * ((od) this).field_T > var8 * var8 + var9 * var9) {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - e.field_L;
              if (var10 < 0.0) {
                var10 = var10 - 3.141592653589793 / (double)((od) this).field_P;
                break L0;
              } else {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((od) this).field_P;
                  break L0;
                }
              }
            }
            ((od) this).field_R = (int)(var10 * (double)((od) this).field_P / 6.283185307179586);
            L1: while (true) {
              if (((od) this).field_P > ((od) this).field_R) {
                L2: while (true) {
                  if (0 <= ((od) this).field_R) {
                    return true;
                  } else {
                    ((od) this).field_R = ((od) this).field_R + ((od) this).field_P;
                    continue L2;
                  }
                }
              } else {
                ((od) this).field_R = ((od) this).field_R - ((od) this).field_P;
                continue L1;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -5) {
            return false;
        }
        return wc.field_E;
    }

    public static void b(boolean param0) {
        field_O = null;
        field_X = null;
        field_N = null;
        field_V = null;
        if (param0) {
            return;
        }
        field_U = null;
    }

    private od() throws Throwable {
        throw new Error();
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
        field_N = new long[11];
        field_O = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_N[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (-11 > (var15 ^ -1)) {
                field_X = "Please enter a year between <%0> and <%1>";
                field_W = true;
                field_U = "Offer rematch";
                return;
              } else {
                var1 = 8 * (-1 + var15);
                field_N[var15] = la.a(cd.a(field_O[7][var1 - -7], 255L), la.a(cd.a(65280L, field_O[6][6 + var1]), la.a(la.a(cd.a(field_O[4][4 + var1], 4278190080L), la.a(cd.a(1095216660480L, field_O[3][3 + var1]), la.a(la.a(cd.a(-72057594037927936L, field_O[0][var1]), cd.a(71776119061217280L, field_O[1][1 + var1])), cd.a(280375465082880L, field_O[2][var1 + 2])))), cd.a(16711680L, field_O[5][var1 - -5]))));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 != (1 & var0)) {
                stackOut_4_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> -27332216);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -710980351;
              if (-257L < (var4 ^ -1L)) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << -443597823;
              if (-257L < (var6 ^ -1L)) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1375326657;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_O[0][var0] = ak.a(ak.a(ak.a(var8 << -1359653168, ak.a(var10 << 513334232, ak.a(ak.a(ak.a(var2 << 1386473712, var2 << -1183038920), var6 << 1264957544), var2 << -900905888))), var4 << 1320529864), var12);
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_O[var14][var0] = ak.a(field_O[var14 - 1][var0] >>> 2027981000, field_O[-1 + var14][var0] << -1251195144);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
