/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static long[][] field_a;
    static long[] field_c;
    static int field_f;
    static String field_e;
    static gb field_b;
    static volatile boolean field_i;
    static wi[] field_h;
    static char[] field_g;
    static boolean field_d;

    public static void a() {
        field_c = null;
        field_b = null;
        field_g = null;
        field_h = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, vi param1, fd param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new ng();
                ((ng) var18).field_t = param1.l(32270);
                ((ng) var18).field_h = param1.d(8195);
                ((ng) var18).field_n = new int[((ng) var18).field_t];
                ((ng) var18).field_q = new int[((ng) var18).field_t];
                ((ng) var18).field_m = new int[((ng) var18).field_t];
                ((ng) var18).field_o = new byte[((ng) var18).field_t][][];
                ((ng) var18).field_j = new kk[((ng) var18).field_t];
                ((ng) var18).field_r = new kk[((ng) var18).field_t];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= ((ng) var18).field_t) {
                    td.field_o.a((am) var18, 92);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param1.l(32270);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int != 2) {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (4 == var6_int) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param1.o(32);
                                  var21 = param1.o(32);
                                  var9 = param1.l(32270);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var11_int >= var9) {
                                      L7: {
                                        var24 = new byte[var9][];
                                        var23 = var24;
                                        var22 = var23;
                                        var19 = var22;
                                        var11 = var19;
                                        if (var6_int != 3) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (~var9 >= ~var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param1.d(8195);
                                              var11[var12_int] = new byte[var13];
                                              param1.a(var13, 0, var24[var12_int], -18181);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      ((ng) var18).field_q[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          ((ng) var18).field_j[var5] = param2.a(var12, ue.a(0, var20), var21, 115);
                                          ((ng) var18).field_o[var5] = var24;
                                          break L3;
                                        } else {
                                          var12[var17] = ue.a(0, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.o(32);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var15 = param1.o(32);
                            var7 = var15;
                            var16 = param1.o(32);
                            var8 = var16;
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param1.d(8195);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((ng) var18).field_q[var5] = var6_int;
                          ((ng) var18).field_n[var5] = var9;
                          ((ng) var18).field_r[var5] = param2.a((byte) 104, ue.a(0, var15), var16);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((ng) var18).field_m[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((ng) var18).field_m[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((ng) var18).field_m[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) var4;
                stackOut_36_1 = new StringBuilder().append("i.A(").append(29821).append(',');
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param1 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param2 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        field_c = new long[11];
        field_a = new long[8][256];
        for (var0 = 0; 256 > var0; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(var1 & 255) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_a[0][var0] = qg.a(var12, qg.a(var4 << 8, qg.a(qg.a(qg.a(qg.a(var6 << 40, qg.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24), var8 << 16)));
            for (var14 = 1; 8 > var14; var14++) {
                field_a[var14][var0] = qg.a(field_a[var14 - 1][var0] >>> 8, field_a[var14 - 1][var0] << 56);
            }
        }
        field_c[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = (-1 + var0) * 8;
            field_c[var0] = ga.a(ga.a(dk.a(65280L, field_a[6][6 + var1]), ga.a(dk.a(16711680L, field_a[5][5 + var1]), ga.a(ga.a(ga.a(ga.a(dk.a(-72057594037927936L, field_a[0][var1]), dk.a(field_a[1][1 + var1], 71776119061217280L)), dk.a(280375465082880L, field_a[2][var1 - -2])), dk.a(field_a[3][3 + var1], 1095216660480L)), dk.a(4278190080L, field_a[4][var1 + 4])))), dk.a(field_a[7][7 + var1], 255L));
        }
        field_e = "MISSION FAILED";
        field_i = true;
        field_g = new char[]{'[', ']', '#'};
        field_h = new wi[255];
        for (var0 = 0; field_h.length > var0; var0++) {
            field_h[var0] = new wi();
        }
    }
}
