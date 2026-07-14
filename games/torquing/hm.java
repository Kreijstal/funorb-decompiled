/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hm extends am {
    static String field_v;
    static String field_u;
    private int[][] field_w;
    private int[] field_x;
    static String field_t;
    static int[] field_s;

    final int[][] a(int param0, int param1) {
        int[] var19 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = Torquing.field_u;
        if (param0 != -29116) {
            ((hm) this).field_w = null;
        }
        int[][] var18 = ((hm) this).field_r.a(param0 + 44258, param1);
        int[][] var16 = var18;
        int[][] var14 = var16;
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (!(!((hm) this).field_r.field_b)) {
            var19 = ((hm) this).b(param0 + 29116, 0, param1);
            var6 = var18[0];
            var7 = var18[1];
            var8 = var18[2];
            for (var9 = 0; var9 < ci.field_c; var9++) {
                var4 = var19[var9] >> 346979780;
                if (0 > var4) {
                    var4 = 0;
                }
                if (!(256 >= var4)) {
                    var4 = 256;
                }
                var4 = ((hm) this).field_x[var4];
                var6[var9] = ie.a(4080, var4 >> 1176567756);
                var7[var9] = ie.a(var4, 65280) >> -1230098684;
                var8[var9] = ie.a(var4, 255) << 1323914404;
            }
        }
        return var11;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (!param1) {
          L0: {
            if (-1 == param0) {
              break L0;
            } else {
              var3 = param0;
              if (var3 == 1) {
                ((hm) this).field_w = new int[2][4];
                ((hm) this).field_w[0][3] = 0;
                ((hm) this).field_w[0][1] = 0;
                ((hm) this).field_w[0][0] = 0;
                ((hm) this).field_w[0][2] = 0;
                ((hm) this).field_w[1][0] = 4096;
                ((hm) this).field_w[1][1] = 4096;
                ((hm) this).field_w[1][2] = 4096;
                ((hm) this).field_w[1][3] = 4096;
                break L0;
              } else {
                if (-3 == var3) {
                  ((hm) this).field_w = new int[8][4];
                  ((hm) this).field_w[0][0] = 0;
                  ((hm) this).field_w[0][2] = 2602;
                  ((hm) this).field_w[0][1] = 2650;
                  ((hm) this).field_w[0][3] = 2361;
                  ((hm) this).field_w[1][0] = 2867;
                  ((hm) this).field_w[1][3] = 1558;
                  ((hm) this).field_w[1][1] = 2313;
                  ((hm) this).field_w[1][2] = 1799;
                  ((hm) this).field_w[2][3] = 1413;
                  ((hm) this).field_w[2][1] = 2618;
                  ((hm) this).field_w[2][2] = 1734;
                  ((hm) this).field_w[2][0] = 3072;
                  ((hm) this).field_w[3][1] = 2296;
                  ((hm) this).field_w[3][0] = 3276;
                  ((hm) this).field_w[3][2] = 1220;
                  ((hm) this).field_w[3][3] = 947;
                  ((hm) this).field_w[4][1] = 2072;
                  ((hm) this).field_w[4][0] = 3481;
                  ((hm) this).field_w[4][2] = 963;
                  ((hm) this).field_w[4][3] = 722;
                  ((hm) this).field_w[5][2] = 2152;
                  ((hm) this).field_w[5][0] = 3686;
                  ((hm) this).field_w[5][3] = 1766;
                  ((hm) this).field_w[5][1] = 2730;
                  ((hm) this).field_w[6][3] = 915;
                  ((hm) this).field_w[6][2] = 1060;
                  ((hm) this).field_w[6][1] = 2232;
                  ((hm) this).field_w[6][0] = 3891;
                  ((hm) this).field_w[7][2] = 1413;
                  ((hm) this).field_w[7][1] = 1686;
                  ((hm) this).field_w[7][3] = 1140;
                  ((hm) this).field_w[7][0] = 4096;
                  break L0;
                } else {
                  if (var3 == 3) {
                    ((hm) this).field_w = new int[7][4];
                    ((hm) this).field_w[0][2] = 0;
                    ((hm) this).field_w[0][1] = 0;
                    ((hm) this).field_w[0][0] = 0;
                    ((hm) this).field_w[0][3] = 4096;
                    ((hm) this).field_w[1][2] = 4096;
                    ((hm) this).field_w[1][0] = 663;
                    ((hm) this).field_w[1][1] = 0;
                    ((hm) this).field_w[1][3] = 4096;
                    ((hm) this).field_w[2][3] = 0;
                    ((hm) this).field_w[2][0] = 1363;
                    ((hm) this).field_w[2][2] = 4096;
                    ((hm) this).field_w[2][1] = 0;
                    ((hm) this).field_w[3][1] = 4096;
                    ((hm) this).field_w[3][0] = 2048;
                    ((hm) this).field_w[3][2] = 4096;
                    ((hm) this).field_w[3][3] = 0;
                    ((hm) this).field_w[4][2] = 0;
                    ((hm) this).field_w[4][3] = 0;
                    ((hm) this).field_w[4][0] = 2727;
                    ((hm) this).field_w[4][1] = 4096;
                    ((hm) this).field_w[5][2] = 0;
                    ((hm) this).field_w[5][3] = 4096;
                    ((hm) this).field_w[5][1] = 4096;
                    ((hm) this).field_w[5][0] = 3411;
                    ((hm) this).field_w[6][2] = 0;
                    ((hm) this).field_w[6][0] = 4096;
                    ((hm) this).field_w[6][1] = 0;
                    ((hm) this).field_w[6][3] = 4096;
                    break L0;
                  } else {
                    if (4 == var3) {
                      ((hm) this).field_w = new int[6][4];
                      ((hm) this).field_w[0][2] = 0;
                      ((hm) this).field_w[0][3] = 0;
                      ((hm) this).field_w[0][0] = 0;
                      ((hm) this).field_w[0][1] = 0;
                      ((hm) this).field_w[1][2] = 0;
                      ((hm) this).field_w[1][3] = 1493;
                      ((hm) this).field_w[1][1] = 0;
                      ((hm) this).field_w[1][0] = 1843;
                      ((hm) this).field_w[2][3] = 2939;
                      ((hm) this).field_w[2][1] = 0;
                      ((hm) this).field_w[2][0] = 2457;
                      ((hm) this).field_w[2][2] = 0;
                      ((hm) this).field_w[3][3] = 3565;
                      ((hm) this).field_w[3][0] = 2781;
                      ((hm) this).field_w[3][2] = 1124;
                      ((hm) this).field_w[3][1] = 0;
                      ((hm) this).field_w[4][1] = 546;
                      ((hm) this).field_w[4][3] = 4031;
                      ((hm) this).field_w[4][0] = 3481;
                      ((hm) this).field_w[4][2] = 3084;
                      ((hm) this).field_w[5][2] = 4096;
                      ((hm) this).field_w[5][0] = 4096;
                      ((hm) this).field_w[5][1] = 4096;
                      ((hm) this).field_w[5][3] = 4096;
                      break L0;
                    } else {
                      if ((var3 ^ -1) == -6) {
                        ((hm) this).field_w = new int[16][4];
                        ((hm) this).field_w[0][2] = 192;
                        ((hm) this).field_w[0][3] = 321;
                        ((hm) this).field_w[0][0] = 0;
                        ((hm) this).field_w[0][1] = 80;
                        ((hm) this).field_w[1][2] = 449;
                        ((hm) this).field_w[1][3] = 562;
                        ((hm) this).field_w[1][1] = 321;
                        ((hm) this).field_w[1][0] = 155;
                        ((hm) this).field_w[2][0] = 389;
                        ((hm) this).field_w[2][2] = 690;
                        ((hm) this).field_w[2][1] = 578;
                        ((hm) this).field_w[2][3] = 803;
                        ((hm) this).field_w[3][2] = 995;
                        ((hm) this).field_w[3][3] = 1140;
                        ((hm) this).field_w[3][0] = 671;
                        ((hm) this).field_w[3][1] = 947;
                        ((hm) this).field_w[4][0] = 897;
                        ((hm) this).field_w[4][1] = 1285;
                        ((hm) this).field_w[4][3] = 1509;
                        ((hm) this).field_w[4][2] = 1397;
                        ((hm) this).field_w[5][2] = 1429;
                        ((hm) this).field_w[5][1] = 1525;
                        ((hm) this).field_w[5][3] = 1413;
                        ((hm) this).field_w[5][0] = 1175;
                        ((hm) this).field_w[6][1] = 1734;
                        ((hm) this).field_w[6][3] = 1333;
                        ((hm) this).field_w[6][2] = 1461;
                        ((hm) this).field_w[6][0] = 1368;
                        ((hm) this).field_w[7][1] = 1413;
                        ((hm) this).field_w[7][3] = 1702;
                        ((hm) this).field_w[7][2] = 1525;
                        ((hm) this).field_w[7][0] = 1507;
                        ((hm) this).field_w[8][1] = 1108;
                        ((hm) this).field_w[8][0] = 1736;
                        ((hm) this).field_w[8][3] = 2056;
                        ((hm) this).field_w[8][2] = 1590;
                        ((hm) this).field_w[9][1] = 1766;
                        ((hm) this).field_w[9][0] = 2088;
                        ((hm) this).field_w[9][2] = 2056;
                        ((hm) this).field_w[9][3] = 2666;
                        ((hm) this).field_w[10][3] = 3276;
                        ((hm) this).field_w[10][2] = 2586;
                        ((hm) this).field_w[10][1] = 2409;
                        ((hm) this).field_w[10][0] = 2355;
                        ((hm) this).field_w[11][3] = 3228;
                        ((hm) this).field_w[11][1] = 3116;
                        ((hm) this).field_w[11][0] = 2691;
                        ((hm) this).field_w[11][2] = 3148;
                        ((hm) this).field_w[12][0] = 3031;
                        ((hm) this).field_w[12][3] = 3196;
                        ((hm) this).field_w[12][2] = 3710;
                        ((hm) this).field_w[12][1] = 3806;
                        ((hm) this).field_w[13][3] = 3019;
                        ((hm) this).field_w[13][0] = 3522;
                        ((hm) this).field_w[13][1] = 3437;
                        ((hm) this).field_w[13][2] = 3421;
                        ((hm) this).field_w[14][2] = 3148;
                        ((hm) this).field_w[14][0] = 3727;
                        ((hm) this).field_w[14][1] = 3116;
                        ((hm) this).field_w[14][3] = 3228;
                        ((hm) this).field_w[15][1] = 2377;
                        ((hm) this).field_w[15][2] = 2505;
                        ((hm) this).field_w[15][0] = 4096;
                        ((hm) this).field_w[15][3] = 2746;
                        break L0;
                      } else {
                        if (var3 == 6) {
                          ((hm) this).field_w = new int[4][4];
                          ((hm) this).field_w[0][0] = 2048;
                          ((hm) this).field_w[0][3] = 0;
                          ((hm) this).field_w[0][2] = 4096;
                          ((hm) this).field_w[0][1] = 0;
                          ((hm) this).field_w[1][2] = 4096;
                          ((hm) this).field_w[1][3] = 0;
                          ((hm) this).field_w[1][1] = 4096;
                          ((hm) this).field_w[1][0] = 2867;
                          ((hm) this).field_w[2][1] = 4096;
                          ((hm) this).field_w[2][3] = 0;
                          ((hm) this).field_w[2][0] = 3276;
                          ((hm) this).field_w[2][2] = 4096;
                          ((hm) this).field_w[3][1] = 4096;
                          ((hm) this).field_w[3][2] = 0;
                          ((hm) this).field_w[3][3] = 0;
                          ((hm) this).field_w[3][0] = 4096;
                          break L0;
                        } else {
                          throw new RuntimeException("Invalid gradient preset");
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        if (!(null != ((hm) this).field_w)) {
            this.a(1, false);
        }
        if (param0 <= 123) {
            Object var3 = null;
            ((hm) this).a((fj) null, 19, 48);
        }
        this.d(255);
    }

    public static void b(int param0) {
        field_s = null;
        if (param0 != 12) {
            return;
        }
        field_u = null;
        field_t = null;
        field_v = null;
    }

    final static int c(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            fj var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((nn.field_c.field_g ^ -1) > -5) {
                            statePc = 6;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (nn.field_c.field_k != -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return 3;
                    }
                    case 3: {
                        if (nn.field_c.field_k != -2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 4;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        if (param0 == 3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return 110;
                    }
                    case 8: {
                        try {
                            if (-1 == (pd.field_c ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            rd.field_x = hq.field_a.a(cl.field_d, tl.field_u, -59);
                            pd.field_c = pd.field_c + 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (pd.field_c == 1) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (-3 != (rd.field_x.field_a ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = pg.a(-1, (byte) -56);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (rd.field_x.field_a != 1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            pd.field_c = pd.field_c + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((pd.field_c ^ -1) != -3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            up.field_a = new no((java.net.Socket) rd.field_x.field_d, hq.field_a);
                            var2 = new fj(13);
                            q.a(um.field_r, 123, qg.field_A, var2, eg.field_x);
                            var2.b(90, 15);
                            var2.b((byte) 60, gf.field_g);
                            up.field_a.a(0, var2.field_j, (byte) 64, 13);
                            pd.field_c = pd.field_c + 1;
                            ro.field_v = 30000L + km.b(-1);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-4 != (pd.field_c ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (0 < up.field_a.a(-126)) {
                                statePc = 26;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((km.b(-1) ^ -1L) < (ro.field_v ^ -1L)) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = pg.a(-2, (byte) -64);
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0;
                    }
                    case 26: {
                        try {
                            var1_int = up.field_a.d(0);
                            if (0 != var1_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = pg.a(var1_int, (byte) -56);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            pd.field_c = pd.field_c + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((pd.field_c ^ -1) != -5) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            nn.field_c.a((Object) (Object) up.field_a, am.field_n, (byte) 124);
                            pd.field_c = 0;
                            up.field_a = null;
                            rd.field_x = null;
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = -1;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        var1 = (IOException) (Object) caughtException;
                        return pg.a(-3, (byte) -116);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2, t param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        param2 = param2 + param3.field_v;
        param1 = param1 + param3.field_r;
        var4 = 0;
        var5 = param3.field_t;
        if (param0 >= 54) {
          L0: {
            var6 = param3.field_s;
            if (ph.field_c <= param1) {
              break L0;
            } else {
              var7 = ph.field_c - param1;
              param1 = ph.field_c;
              var4 = var4 + var6 * var7;
              var5 = var5 - var7;
              break L0;
            }
          }
          L1: {
            if (param2 >= ph.field_k) {
              break L1;
            } else {
              var7 = -param2 + ph.field_k;
              param2 = ph.field_k;
              var6 = var6 - var7;
              var4 = var4 + var7;
              break L1;
            }
          }
          L2: {
            if (ph.field_h < var5 + param1) {
              var5 = var5 - (-ph.field_h + var5 + param1);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (ph.field_a < var6 + param2) {
              var7 = -ph.field_a + (var6 + param2);
              var6 = var6 - var7;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 >= var6) {
              break L4;
            } else {
              if (var5 > 0) {
                var7 = param2 + param1 * ph.field_j;
                la.a(0, var4, param3.field_y, -var6 + ph.field_j, ph.field_e, var6, var5, var7, 65280, param3.field_s + -var6);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, t[] param2, int param3, uc param4, int param5, t[] param6, int param7, int param8, int param9, int param10, int param11) {
        if (param7 != 3) {
            field_s = null;
        }
        wk.a(param3, param2, param6, param9, param1, param8, param10, param0, 112, param11, param5, param4, param1, param10, param4);
    }

    public hm() {
        super(1, false);
        ((hm) this).field_x = new int[257];
    }

    final static int a(boolean param0, CharSequence param1, int param2) {
        if (!param0) {
            return -116;
        }
        return ga.a(!param0 ? true : false, param1, true, param2);
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Torquing.field_u;
          if (param2 == 0) {
            var4 = param0.i((byte) -101);
            if (-1 != (var4 ^ -1)) {
              this.a(var4, false);
              break L0;
            } else {
              ((hm) this).field_w = new int[param0.i((byte) -101)][4];
              var5 = 0;
              L1: while (true) {
                if (((hm) this).field_w.length <= var5) {
                  break L0;
                } else {
                  ((hm) this).field_w[var5][0] = param0.i(7088);
                  ((hm) this).field_w[var5][1] = param0.i((byte) -101) << -845659708;
                  ((hm) this).field_w[var5][2] = param0.i((byte) -101) << 1732235268;
                  ((hm) this).field_w[var5][3] = param0.i((byte) -101) << 1013334372;
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param1 == 35) {
            break L2;
          } else {
            ((hm) this).field_x = null;
            break L2;
          }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        L0: {
          var13 = Torquing.field_u;
          if (param0 == 255) {
            break L0;
          } else {
            ((hm) this).field_w = null;
            break L0;
          }
        }
        L1: {
          var5 = ((hm) this).field_w.length;
          if (-1 > (var5 ^ -1)) {
            var6 = 0;
            L2: while (true) {
              if ((var6 ^ -1) <= -258) {
                break L1;
              } else {
                var7 = 0;
                var8 = var6 << 1971400452;
                var9 = 0;
                L3: while (true) {
                  L4: {
                    if (var9 >= var5) {
                      break L4;
                    } else {
                      if (((hm) this).field_w[var9][0] > var8) {
                        break L4;
                      } else {
                        var7++;
                        var9++;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    if (var5 <= var7) {
                      var15 = ((hm) this).field_w[var5 - 1];
                      var2 = var15[1];
                      var4 = var15[3];
                      var3 = var15[2];
                      break L5;
                    } else {
                      var17 = ((hm) this).field_w[var7];
                      if (-1 <= (var7 ^ -1)) {
                        var4 = var17[3];
                        var2 = var17[1];
                        var3 = var17[2];
                        break L5;
                      } else {
                        var10 = ((hm) this).field_w[-1 + var7];
                        var11 = (-var10[0] + var8 << 276881932) / (-var10[0] + var17[0]);
                        var12 = 4096 + -var11;
                        var2 = var11 * var17[1] + var10[1] * var12 >> -765484020;
                        var3 = var17[2] * var11 - -(var10[2] * var12) >> 1181514764;
                        var4 = var12 * var10[3] + var17[3] * var11 >> -175310452;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    var4 = var4 >> 4;
                    var2 = var2 >> 4;
                    var3 = var3 >> 4;
                    if (0 > var4) {
                      var4 = 0;
                      break L6;
                    } else {
                      if (var4 <= 255) {
                        break L6;
                      } else {
                        var4 = 255;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (0 <= var2) {
                      if (var2 <= 255) {
                        break L7;
                      } else {
                        var2 = 255;
                        break L7;
                      }
                    } else {
                      var2 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    if (var3 < 0) {
                      var3 = 0;
                      break L8;
                    } else {
                      if (-256 > (var3 ^ -1)) {
                        var3 = 255;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  ((hm) this).field_x[var6] = gm.a(var4, gm.a(var3 << -673918616, var2 << -673741456));
                  var6++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Password: ";
        field_u = "This entry doesn't match";
        field_t = "30 more levels";
        field_s = new int[8192];
    }
}
