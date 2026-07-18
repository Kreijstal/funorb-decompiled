/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = rh.a(var4, param1, (byte) -87).getFile();
                    Object discarded$6 = u.a(param1, true, new Object[2], "updatelinks");
                    Object discarded$7 = u.a(param1, true, new Object[2], "updatelinks");
                    Object discarded$8 = u.a(param1, true, new Object[2], "updatelinks");
                    Object discarded$9 = u.a(param1, true, new Object[2], "updatelinks");
                    Object discarded$10 = u.a(param1, true, new Object[2], "updatelinks");
                    Object discarded$11 = u.a(param1, true, new Object[2], "updatelinks");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("od.A(").append(false).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = Chess.field_G;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              var8_int = -((od) this).field_Q + (-param6 + (-((od) this).field_u + param1));
              var9 = -param5 - (((od) this).field_r + ((od) this).field_M) + param2;
              if (((od) this).field_T * ((od) this).field_T > var8_int * var8_int + var9 * var9) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - e.field_L;
                  if (var10 < 0.0) {
                    var10 = var10 - 3.141592653589793 / (double)((od) this).field_P;
                    break L1;
                  } else {
                    if (0.0 >= var10) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((od) this).field_P;
                      break L1;
                    }
                  }
                }
                ((od) this).field_R = (int)(var10 * (double)((od) this).field_P / 6.283185307179586);
                L2: while (true) {
                  if (((od) this).field_P > ((od) this).field_R) {
                    L3: while (true) {
                      if (0 <= ((od) this).field_R) {
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        ((od) this).field_R = ((od) this).field_R + ((od) this).field_P;
                        continue L3;
                      }
                    }
                  } else {
                    ((od) this).field_R = ((od) this).field_R - ((od) this).field_P;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("od.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static boolean a(int param0) {
        return wc.field_E;
    }

    public static void b(boolean param0) {
        field_O = null;
        field_X = null;
        field_N = null;
        field_V = null;
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
              if (var15 > 10) {
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
                stackOut_3_0 = (long)(var1 >>> 8);
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
            field_O[0][var0] = ak.a(ak.a(ak.a(var8 << 16, ak.a(var10 << 24, ak.a(ak.a(ak.a(var2 << 48, var2 << 56), var6 << 40), var2 << 32))), var4 << 8), var12);
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_O[var14][var0] = ak.a(field_O[var14 - 1][var0] >>> 8, field_O[-1 + var14][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
