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
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            java.applet.Applet stackIn_1_0 = null;
            java.applet.Applet stackIn_2_0 = null;
            java.applet.Applet stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            java.applet.Applet stackOut_0_0 = null;
            java.applet.Applet stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            java.applet.Applet stackOut_1_0 = null;
            int stackOut_1_1 = 0;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = rh.a(var4, param1, (byte) -87).getFile();
                      discarded$6 = u.a(param1, true, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
                      discarded$7 = u.a(param1, true, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
                      stackOut_0_0 = (java.applet.Applet) (param1);
                      stackIn_2_0 = stackOut_0_0;
                      stackIn_1_0 = stackOut_0_0;
                      if (param0) {
                        stackOut_2_0 = (java.applet.Applet) ((Object) stackIn_2_0);
                        stackOut_2_1 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        stackIn_3_1 = stackOut_2_1;
                        break L2;
                      } else {
                        stackOut_1_0 = (java.applet.Applet) ((Object) stackIn_1_0);
                        stackOut_1_1 = 1;
                        stackIn_3_0 = stackOut_1_0;
                        stackIn_3_1 = stackOut_1_1;
                        break L2;
                      }
                    }
                    L3: {
                      discarded$8 = u.a(stackIn_3_0, stackIn_3_1 != 0, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
                      if (!param0) {
                        break L3;
                      } else {
                        od.b(false);
                        break L3;
                      }
                    }
                    discarded$9 = u.a(param1, true, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
                    discarded$10 = u.a(param1, true, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
                    discarded$11 = u.a(param1, true, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref);
                stackOut_9_1 = new StringBuilder().append("od.A(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var8_int = -this.field_Q + (-param6 + (-this.field_u + param1));
              var9 = -param5 - (this.field_r + this.field_M) + param2;
              if (this.field_T * this.field_T > var8_int * var8_int + var9 * var9) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - e.field_L;
                  if (var10 < 0.0) {
                    var10 = var10 - 3.141592653589793 / (double)this.field_P;
                    break L1;
                  } else {
                    if (0.0 >= var10) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)this.field_P;
                      break L1;
                    }
                  }
                }
                this.field_R = (int)(var10 * (double)this.field_P / 6.283185307179586);
                L2: while (true) {
                  if (this.field_P > this.field_R) {
                    L3: while (true) {
                      if (0 <= this.field_R) {
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_R = this.field_R + this.field_P;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_R = this.field_R - this.field_P;
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
            stackOut_17_0 = (RuntimeException) (var8);
            stackOut_17_1 = new StringBuilder().append("od.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final static boolean a(int param0) {
        if (param0 != -5) {
            return false;
        }
        return wc.field_E;
    }

    public static void b(boolean param0) {
        field_O = (long[][]) null;
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
        $cfr$clinit: {
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
                    break $cfr$clinit;
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
}
