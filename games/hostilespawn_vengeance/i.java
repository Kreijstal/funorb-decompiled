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

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_e = null;
        }
        field_b = null;
        field_g = null;
        field_h = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, vi param1, fd param2, int param3) {
        try {
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
            ng var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = HostileSpawn.field_I ? 1 : 0;
            var18 = new ng();
            var18.field_t = param1.l(32270);
            if (param0 == 29821) {
              var18.field_h = param1.d(param0 + -21626);
              var18.field_n = new int[var18.field_t];
              var18.field_q = new int[var18.field_t];
              var18.field_m = new int[var18.field_t];
              var18.field_o = new byte[var18.field_t][][];
              var18.field_j = new kk[var18.field_t];
              var18.field_r = new kk[var18.field_t];
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_t) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_m[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param1.l(param0 ^ 2675);
                        if (var6_int == -1) {
                          break L2;
                        } else {
                          if (var6_int == 1) {
                            break L2;
                          } else {
                            if (-3 != var6_int) {
                              L3: {
                                if ((var6_int ^ -1) == -4) {
                                  break L3;
                                } else {
                                  if (4 == var6_int) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param1.o(32);
                              var21 = param1.o(32);
                              var9 = param1.l(param0 ^ 2675);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var11_int >= var9) {
                                  L5: {
                                    var24 = new byte[var9][];
                                    var23 = var24;
                                    var22 = var23;
                                    var19 = var22;
                                    var11 = var19;
                                    if (-4 != (var6_int ^ -1)) {
                                      break L5;
                                    } else {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var9 <= var12_int) {
                                          break L5;
                                        } else {
                                          var13 = param1.d(8195);
                                          var11[var12_int] = new byte[var13];
                                          param1.a(var13, 0, var24[var12_int], -18181);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                  var18.field_q[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_j[var5] = param2.a(var12, ue.a(0, var20), var21, 115);
                                      var18.field_o[var5] = var24;
                                      break L1;
                                    } else {
                                      var12[var17] = ue.a(0, var10[var17]);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param1.o(32);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param1.o(32);
                        var7 = var15;
                        var16 = param1.o(param0 + -29789);
                        var8 = var16;
                        var9 = 0;
                        if ((var6_int ^ -1) == -2) {
                          var9 = param1.d(8195);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var18.field_q[var5] = var6_int;
                      var18.field_n[var5] = var9;
                      var18.field_r[var5] = param2.a((byte) 104, ue.a(0, var15), var16);
                      var5++;
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_m[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_m[var5] = -4;
                    var5++;
                  }
                  continue L0;
                }
              }
            } else {
              return;
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
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(var1 & 255) : (long)(var1 >>> 959962472);
            var4 = var2 << -456267007;
            if (!(-257L < (var4 ^ -1L))) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 66431745;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 483019201;
            if (-257L >= (var10 ^ -1L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_a[0][var0] = qg.a(var12, qg.a(var4 << 242729096, qg.a(qg.a(qg.a(qg.a(var6 << 1391761000, qg.a(var2 << 536449144, var2 << 1115320176)), var2 << -167967520), var10 << 286896088), var8 << 789791504)));
            for (var14 = 1; 8 > var14; var14++) {
                field_a[var14][var0] = qg.a(field_a[var14 - 1][var0] >>> -1580773304, field_a[var14 - 1][var0] << -1268063240);
            }
        }
        field_c[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = (-1 + var0) * 8;
            field_c[var0] = ga.a(ga.a(dk.a(65280L, field_a[6][6 + var1]), ga.a(dk.a(16711680L, field_a[5][5 + var1]), ga.a(ga.a(ga.a(ga.a(dk.a(-72057594037927936L, field_a[0][var1]), dk.a(field_a[1][1 + var1], 71776119061217280L)), dk.a(280375465082880L, field_a[2][var1 - -2])), dk.a(field_a[3][3 + var1], 1095216660480L)), dk.a(4278190080L, field_a[4][var1 + 4])))), dk.a(field_a[7][7 + var1], 255L));
        }
        field_e = "MISSION FAILED";
        field_i = true;
        field_g = new char[]{(char)91, (char)93, (char)35};
        field_h = new wi[255];
        for (var0 = 0; field_h.length > var0; var0++) {
            field_h[var0] = new wi();
        }
    }
}
