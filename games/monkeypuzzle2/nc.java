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
        field_d = (long[][]) null;
        field_g = null;
        field_b = null;
        int var1 = 36 / ((76 - param0) / 34);
    }

    final static void a(int param0) {
        String var2 = (String) null;
        vh.a(v.field_b, (String) null, (byte) -53);
        if (param0 != 1) {
            field_c = (String) null;
        }
    }

    final static void a(ad param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ad var8 = null;
        hb var9 = null;
        hb var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = new hb(param0.a("", "logo.fo3d", -127));
                        var10 = var9;
                        var3 = var10.a((byte) 114);
                        var10.p(8);
                        ri.field_c = ni.a(12, var10);
                        nl.field_a = new int[var3][];
                        ua.field_x = new sj[var3];
                        if (param1 == 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var8 = (ad) null;
                        nc.a((ad) null, -50);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var3) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ua.field_x[var4] = gi.a(param1 + -114, var9);
                        var4++;
                        if (var7 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10.q(param1 ^ -110);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 >= var3) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = ua.field_x[var4];
                        var5.a(6, 6, 6, 1, false);
                        var5.c(74);
                        var6 = new int[]{var5.field_G + var5.field_q >> 1688834145, var5.field_b + var5.field_j >> -297364095, var5.field_t + var5.field_x >> 1156700769};
                        nl.field_a[var4] = var6;
                        var5.a(-var6[2], (byte) 70, -var6[0], -var6[1]);
                        var4++;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var2);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("nc.B(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit: {
            long stackIn_5_0 = 0L;
            int var0;
            int var1;
            long var2;
            long var4;
            long var6;
            long var8;
            long var10;
            long var12;
            int var14;
            int var15;
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
                    break $cfr$clinit;
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
                    stackIn_5_0 = (long)(var1 & 255);
                    break L2;
                  } else {
                    stackIn_5_0 = (long)(var1 >>> 138899656);
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
}
