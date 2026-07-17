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
                var4 = var19[var9] >> 4;
                if (0 > var4) {
                    var4 = 0;
                }
                if (!(256 >= var4)) {
                    var4 = 256;
                }
                var4 = ((hm) this).field_x[var4];
                var6[var9] = ie.a(4080, var4 >> 12);
                var7[var9] = ie.a(var4, 65280) >> 4;
                var8[var9] = ie.a(var4, 255) << 4;
            }
        }
        return var11;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Torquing.field_u;
          if (param0 == 0) {
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
              if (var3 == 2) {
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
                    if (var3 == 5) {
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
        field_u = null;
        field_t = null;
        field_v = null;
    }

    final static int c(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            fj var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_30_0 = 0;
            if (nn.field_c.field_g < 4) {
              try {
                L0: {
                  L1: {
                    if (pd.field_c == 0) {
                      rd.field_x = hq.field_a.a(cl.field_d, tl.field_u, -59);
                      pd.field_c = pd.field_c + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (pd.field_c == 1) {
                      if (rd.field_x.field_a != 2) {
                        if (rd.field_x.field_a != 1) {
                          break L2;
                        } else {
                          pd.field_c = pd.field_c + 1;
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = pg.a(-1, (byte) -56);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (pd.field_c != 2) {
                      break L3;
                    } else {
                      up.field_a = new no((java.net.Socket) rd.field_x.field_d, hq.field_a);
                      var2 = new fj(13);
                      q.a(um.field_r, 123, qg.field_A, var2, eg.field_x);
                      var2.b(90, 15);
                      var2.b((byte) 60, gf.field_g);
                      up.field_a.a(0, var2.field_j, (byte) 64, 13);
                      pd.field_c = pd.field_c + 1;
                      ro.field_v = 30000L + km.b(-1);
                      break L3;
                    }
                  }
                  L4: {
                    if (pd.field_c != 3) {
                      break L4;
                    } else {
                      if (0 < up.field_a.a(-126)) {
                        var1_int = up.field_a.d(0);
                        if (0 != var1_int) {
                          stackOut_26_0 = pg.a(var1_int, (byte) -56);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        } else {
                          pd.field_c = pd.field_c + 1;
                          break L4;
                        }
                      } else {
                        if (~km.b(-1) < ~ro.field_v) {
                          stackOut_22_0 = pg.a(-2, (byte) -64);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (pd.field_c != 4) {
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    nn.field_c.a((Object) (Object) up.field_a, am.field_n, (byte) 124);
                    pd.field_c = 0;
                    up.field_a = null;
                    rd.field_x = null;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return pg.a(-3, (byte) -116);
              }
              return stackIn_33_0;
            } else {
              if (nn.field_c.field_k != -1) {
                if (nn.field_c.field_k != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2, t param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            param2 = param2 + param3.field_v;
            param1 = param1 + param3.field_r;
            var4_int = 0;
            var5 = param3.field_t;
            if (param0 >= 54) {
              L1: {
                var6 = param3.field_s;
                if (ph.field_c <= param1) {
                  break L1;
                } else {
                  var7 = ph.field_c - param1;
                  param1 = ph.field_c;
                  var4_int = var4_int + var6 * var7;
                  var5 = var5 - var7;
                  break L1;
                }
              }
              L2: {
                if (param2 >= ph.field_k) {
                  break L2;
                } else {
                  var7 = -param2 + ph.field_k;
                  param2 = ph.field_k;
                  var6 = var6 - var7;
                  var4_int = var4_int + var7;
                  break L2;
                }
              }
              L3: {
                if (ph.field_h < var5 + param1) {
                  var5 = var5 - (-ph.field_h + var5 + param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (ph.field_a < var6 + param2) {
                  var7 = -ph.field_a + (var6 + param2);
                  var6 = var6 - var7;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (0 >= var6) {
                  break L5;
                } else {
                  if (var5 > 0) {
                    var7 = param2 + param1 * ph.field_j;
                    la.a(0, var4_int, param3.field_y, -var6 + ph.field_j, ph.field_e, var6, var5, var7, 65280, param3.field_s + -var6);
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("hm.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final static void a(boolean param0, int param1, t[] param2, int param3, uc param4, int param5, t[] param6, int param7, int param8, int param9, int param10, int param11) {
        try {
            if (param7 != 3) {
                field_s = null;
            }
            wk.a(param3, param2, param6, param9, param1, param8, param10, param0, 112, 240, param5, param4, param1, param10, param4);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "hm.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + 240 + 41);
        }
    }

    public hm() {
        super(1, false);
        ((hm) this).field_x = new int[257];
    }

    final static int a(boolean param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (param0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              stackOut_6_0 = ga.a(stackIn_6_0 != 0, param1, true, 16);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -116;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hm.E(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 16 + 41);
        }
        return stackIn_7_0;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                var4_int = param0.i((byte) -101);
                if (var4_int != 0) {
                  this.a(var4_int, false);
                  break L1;
                } else {
                  ((hm) this).field_w = new int[param0.i((byte) -101)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (((hm) this).field_w.length <= var5) {
                      break L1;
                    } else {
                      ((hm) this).field_w[var5][0] = param0.i(7088);
                      ((hm) this).field_w[var5][1] = param0.i((byte) -101) << 4;
                      ((hm) this).field_w[var5][2] = param0.i((byte) -101) << 4;
                      ((hm) this).field_w[var5][3] = param0.i((byte) -101) << 4;
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                ((hm) this).field_x = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("hm.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
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
          var5 = ((hm) this).field_w.length;
          if (var5 > 0) {
            var6 = 0;
            L1: while (true) {
              if (var6 >= 257) {
                break L0;
              } else {
                var7 = 0;
                var8 = var6 << 4;
                var9 = 0;
                L2: while (true) {
                  L3: {
                    if (var9 >= var5) {
                      break L3;
                    } else {
                      if (((hm) this).field_w[var9][0] > var8) {
                        break L3;
                      } else {
                        var7++;
                        var9++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    if (var5 <= var7) {
                      var15 = ((hm) this).field_w[var5 - 1];
                      var2 = var15[1];
                      var4 = var15[3];
                      var3 = var15[2];
                      break L4;
                    } else {
                      var17 = ((hm) this).field_w[var7];
                      if (var7 <= 0) {
                        var4 = var17[3];
                        var2 = var17[1];
                        var3 = var17[2];
                        break L4;
                      } else {
                        var10 = ((hm) this).field_w[-1 + var7];
                        var11 = (-var10[0] + var8 << 12) / (-var10[0] + var17[0]);
                        var12 = 4096 + -var11;
                        var2 = var11 * var17[1] + var10[1] * var12 >> 12;
                        var3 = var17[2] * var11 - -(var10[2] * var12) >> 12;
                        var4 = var12 * var10[3] + var17[3] * var11 >> 12;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var4 = var4 >> 4;
                    var2 = var2 >> 4;
                    var3 = var3 >> 4;
                    if (0 > var4) {
                      var4 = 0;
                      break L5;
                    } else {
                      if (var4 <= 255) {
                        break L5;
                      } else {
                        var4 = 255;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 <= var2) {
                      if (var2 <= 255) {
                        break L6;
                      } else {
                        var2 = 255;
                        break L6;
                      }
                    } else {
                      var2 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    if (var3 < 0) {
                      var3 = 0;
                      break L7;
                    } else {
                      if (var3 > 255) {
                        var3 = 255;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((hm) this).field_x[var6] = gm.a(var4, gm.a(var3 << 8, var2 << 16));
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
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
