/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends ud {
    private lr field_X;
    static ia field_W;
    private boolean field_V;
    private String field_U;
    private int field_P;
    private int field_O;
    private int field_ab;
    static String field_Q;
    static String field_T;
    static long[][] field_N;
    static long[] field_Z;
    static String field_Y;
    static vh field_R;
    static String field_S;

    final static void a(int param0, String param1, int param2, boolean param3, int param4) {
        if (param0 != 8) {
            n.g((byte) 74);
        }
        lk var5 = new lk();
        var5.field_s = param2;
        var5.field_v = param3 ? true : false;
        var5.field_x = param1;
        var5.field_l = param4;
        ne.field_r.b((byte) 116, (ma) (Object) var5);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = ((n) this).field_C + param2;
        int var6 = ((n) this).field_D - -param3;
        super.a(param0, (byte) 13, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = 126 / ((param1 - -42) / 53);
        int var8 = ((n) this).field_V ? -(((n) this).field_P * 2) + (((n) this).field_l - ((n) this).field_ab) : 0;
        int discarded$0 = ((n) this).field_X.a(((n) this).field_U, ((n) this).field_P + var8 + var5, ((n) this).field_P + var6, -((n) this).field_P + ((n) this).field_ab, ((n) this).field_y + -(2 * ((n) this).field_P), ((n) this).field_O, -1, ((n) this).field_V ? 0 : 2, 1, ((n) this).field_X.field_C);
    }

    final static boolean h(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) wn.field_a;
                    // monitorenter wn.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ja.field_c == bl.field_s) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        qi.field_a = ee.field_b[bl.field_s];
                        ml.field_b = ek.field_c[bl.field_s];
                        bl.field_s = param0 & bl.field_s + 1;
                        // monitorexit var1
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static double[] a(int param0, double[] param1) {
        double var2 = param1[0];
        if (param0 > -121) {
            return null;
        }
        double var4 = param1[1];
        double var6 = param1[2];
        double var8 = var6 * var6 + (var4 * var4 + var2 * var2);
        if (Math.abs(-1.0 + var8) < 1e-16) {
            return param1;
        }
        var8 = Math.sqrt(var8);
        param1[1] = var4 / var8;
        param1[2] = var6 / var8;
        param1[0] = var2 / var8;
        return param1;
    }

    final String e(int param0) {
        if (param0 >= -10) {
            field_Z = null;
        }
        int var2 = ((n) this).field_L.field_s ? 1 : 0;
        ((n) this).field_L.field_s = ((n) this).field_s;
        String var3 = ((n) this).field_L.e(-54);
        ((n) this).field_L.field_s = var2 != 0 ? true : false;
        return var3;
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        if (param3 != 39) {
            return null;
        }
        int var4 = 0;
        if (param0) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        if (!(!param2)) {
            var4++;
        }
        return ml.field_c[var4];
    }

    n(int param0, int param1, int param2, int param3, ei param4, boolean param5, int param6, int param7, lr param8, int param9, String param10) {
        super(param0, param1, param2, param3, (fp) null, (cc) null);
        ((n) this).field_U = param10;
        ((n) this).field_P = param7;
        ((n) this).field_L = param4;
        ((n) this).field_X = param8;
        ((n) this).field_ab = param6;
        ((n) this).field_V = param5 ? true : false;
        ((n) this).field_O = param9;
        int var12 = ((n) this).field_ab + -((n) this).field_P;
        int var13 = ((n) this).field_X.b(param10, var12, ((n) this).field_X.field_C) + 2 * ((n) this).field_P;
        if (var13 > param3) {
            ((n) this).a(param2, param0, var13, false, param1);
        } else {
            var13 = param3;
        }
        int var14 = !((n) this).field_V ? ((n) this).field_P * 2 + ((n) this).field_ab : 0;
        ((n) this).field_L.a(-((n) this).field_ab + param2 + -(3 * ((n) this).field_P), var14, -(((n) this).field_P * 2) + param3, false, (-param3 + var13 >> -8124223) + ((n) this).field_P);
    }

    public static void g(byte param0) {
        field_Z = null;
        field_Y = null;
        field_Q = null;
        field_T = null;
        if (param0 > -48) {
            field_Z = null;
        }
        field_W = null;
        field_N = null;
        field_R = null;
        field_S = null;
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
        field_W = new ia(1);
        field_Q = "Resigned.";
        field_T = "Options";
        field_N = new long[8][256];
        field_Y = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_Z = new long[11];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -257) {
            field_Z[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
              } else {
                var1 = (-1 + var0) * 8;
                field_Z[var0] = im.a(im.a(im.a(mj.a(16711680L, field_N[5][5 + var1]), im.a(im.a(im.a(im.a(mj.a(field_N[0][var1], -72057594037927936L), mj.a(field_N[1][1 + var1], 71776119061217280L)), mj.a(280375465082880L, field_N[2][var1 - -2])), mj.a(field_N[3][var1 - -3], 1095216660480L)), mj.a(4278190080L, field_N[4][4 + var1]))), mj.a(field_N[6][var1 - -6], 65280L)), mj.a(255L, field_N[7][var1 - -7]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 != (1 & var0)) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> -742532632);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1261715073;
              if (256L <= var4) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 201409601;
              if ((var6 ^ -1L) <= -257L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 155031425;
              if (256L > var10) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_N[0][var0] = k.a(var12, k.a(k.a(k.a(var10 << 2121854936, k.a(var2 << -1317818592, k.a(var6 << 1944671016, k.a(var2 << -543305552, var2 << -407030408)))), var8 << 1750101392), var4 << 1597631304));
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_N[var14][var0] = k.a(field_N[-1 + var14][var0] << -1769291848, field_N[-1 + var14][var0] >>> 1208608328);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
