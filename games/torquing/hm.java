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
        int[] var17 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = Torquing.field_u;
        if (param0 != -29116) {
            this.field_w = (int[][]) null;
        }
        int[][] var14 = this.field_r.a(param0 + 44258, param1);
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (!(!this.field_r.field_b)) {
            var17 = this.b(param0 + 29116, 0, param1);
            var6 = var14[0];
            var7 = var14[1];
            var8 = var14[2];
            for (var9 = 0; var9 < ci.field_c; var9++) {
                var4 = var17[var9] >> 346979780;
                if (0 > var4) {
                    var4 = 0;
                }
                if (!(256 >= var4)) {
                    var4 = 256;
                }
                var4 = this.field_x[var4];
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
            if (-1 == (param0 ^ -1)) {
              break L0;
            } else {
              var3 = param0;
              if (var3 == 1) {
                this.field_w = new int[2][4];
                this.field_w[0][3] = 0;
                this.field_w[0][1] = 0;
                this.field_w[0][0] = 0;
                this.field_w[0][2] = 0;
                this.field_w[1][0] = 4096;
                this.field_w[1][1] = 4096;
                this.field_w[1][2] = 4096;
                this.field_w[1][3] = 4096;
                break L0;
              } else {
                if (-3 == (var3 ^ -1)) {
                  this.field_w = new int[8][4];
                  this.field_w[0][0] = 0;
                  this.field_w[0][2] = 2602;
                  this.field_w[0][1] = 2650;
                  this.field_w[0][3] = 2361;
                  this.field_w[1][0] = 2867;
                  this.field_w[1][3] = 1558;
                  this.field_w[1][1] = 2313;
                  this.field_w[1][2] = 1799;
                  this.field_w[2][3] = 1413;
                  this.field_w[2][1] = 2618;
                  this.field_w[2][2] = 1734;
                  this.field_w[2][0] = 3072;
                  this.field_w[3][1] = 2296;
                  this.field_w[3][0] = 3276;
                  this.field_w[3][2] = 1220;
                  this.field_w[3][3] = 947;
                  this.field_w[4][1] = 2072;
                  this.field_w[4][0] = 3481;
                  this.field_w[4][2] = 963;
                  this.field_w[4][3] = 722;
                  this.field_w[5][2] = 2152;
                  this.field_w[5][0] = 3686;
                  this.field_w[5][3] = 1766;
                  this.field_w[5][1] = 2730;
                  this.field_w[6][3] = 915;
                  this.field_w[6][2] = 1060;
                  this.field_w[6][1] = 2232;
                  this.field_w[6][0] = 3891;
                  this.field_w[7][2] = 1413;
                  this.field_w[7][1] = 1686;
                  this.field_w[7][3] = 1140;
                  this.field_w[7][0] = 4096;
                  break L0;
                } else {
                  if (var3 == 3) {
                    this.field_w = new int[7][4];
                    this.field_w[0][2] = 0;
                    this.field_w[0][1] = 0;
                    this.field_w[0][0] = 0;
                    this.field_w[0][3] = 4096;
                    this.field_w[1][2] = 4096;
                    this.field_w[1][0] = 663;
                    this.field_w[1][1] = 0;
                    this.field_w[1][3] = 4096;
                    this.field_w[2][3] = 0;
                    this.field_w[2][0] = 1363;
                    this.field_w[2][2] = 4096;
                    this.field_w[2][1] = 0;
                    this.field_w[3][1] = 4096;
                    this.field_w[3][0] = 2048;
                    this.field_w[3][2] = 4096;
                    this.field_w[3][3] = 0;
                    this.field_w[4][2] = 0;
                    this.field_w[4][3] = 0;
                    this.field_w[4][0] = 2727;
                    this.field_w[4][1] = 4096;
                    this.field_w[5][2] = 0;
                    this.field_w[5][3] = 4096;
                    this.field_w[5][1] = 4096;
                    this.field_w[5][0] = 3411;
                    this.field_w[6][2] = 0;
                    this.field_w[6][0] = 4096;
                    this.field_w[6][1] = 0;
                    this.field_w[6][3] = 4096;
                    break L0;
                  } else {
                    if (4 == var3) {
                      this.field_w = new int[6][4];
                      this.field_w[0][2] = 0;
                      this.field_w[0][3] = 0;
                      this.field_w[0][0] = 0;
                      this.field_w[0][1] = 0;
                      this.field_w[1][2] = 0;
                      this.field_w[1][3] = 1493;
                      this.field_w[1][1] = 0;
                      this.field_w[1][0] = 1843;
                      this.field_w[2][3] = 2939;
                      this.field_w[2][1] = 0;
                      this.field_w[2][0] = 2457;
                      this.field_w[2][2] = 0;
                      this.field_w[3][3] = 3565;
                      this.field_w[3][0] = 2781;
                      this.field_w[3][2] = 1124;
                      this.field_w[3][1] = 0;
                      this.field_w[4][1] = 546;
                      this.field_w[4][3] = 4031;
                      this.field_w[4][0] = 3481;
                      this.field_w[4][2] = 3084;
                      this.field_w[5][2] = 4096;
                      this.field_w[5][0] = 4096;
                      this.field_w[5][1] = 4096;
                      this.field_w[5][3] = 4096;
                      break L0;
                    } else {
                      if ((var3 ^ -1) == -6) {
                        this.field_w = new int[16][4];
                        this.field_w[0][2] = 192;
                        this.field_w[0][3] = 321;
                        this.field_w[0][0] = 0;
                        this.field_w[0][1] = 80;
                        this.field_w[1][2] = 449;
                        this.field_w[1][3] = 562;
                        this.field_w[1][1] = 321;
                        this.field_w[1][0] = 155;
                        this.field_w[2][0] = 389;
                        this.field_w[2][2] = 690;
                        this.field_w[2][1] = 578;
                        this.field_w[2][3] = 803;
                        this.field_w[3][2] = 995;
                        this.field_w[3][3] = 1140;
                        this.field_w[3][0] = 671;
                        this.field_w[3][1] = 947;
                        this.field_w[4][0] = 897;
                        this.field_w[4][1] = 1285;
                        this.field_w[4][3] = 1509;
                        this.field_w[4][2] = 1397;
                        this.field_w[5][2] = 1429;
                        this.field_w[5][1] = 1525;
                        this.field_w[5][3] = 1413;
                        this.field_w[5][0] = 1175;
                        this.field_w[6][1] = 1734;
                        this.field_w[6][3] = 1333;
                        this.field_w[6][2] = 1461;
                        this.field_w[6][0] = 1368;
                        this.field_w[7][1] = 1413;
                        this.field_w[7][3] = 1702;
                        this.field_w[7][2] = 1525;
                        this.field_w[7][0] = 1507;
                        this.field_w[8][1] = 1108;
                        this.field_w[8][0] = 1736;
                        this.field_w[8][3] = 2056;
                        this.field_w[8][2] = 1590;
                        this.field_w[9][1] = 1766;
                        this.field_w[9][0] = 2088;
                        this.field_w[9][2] = 2056;
                        this.field_w[9][3] = 2666;
                        this.field_w[10][3] = 3276;
                        this.field_w[10][2] = 2586;
                        this.field_w[10][1] = 2409;
                        this.field_w[10][0] = 2355;
                        this.field_w[11][3] = 3228;
                        this.field_w[11][1] = 3116;
                        this.field_w[11][0] = 2691;
                        this.field_w[11][2] = 3148;
                        this.field_w[12][0] = 3031;
                        this.field_w[12][3] = 3196;
                        this.field_w[12][2] = 3710;
                        this.field_w[12][1] = 3806;
                        this.field_w[13][3] = 3019;
                        this.field_w[13][0] = 3522;
                        this.field_w[13][1] = 3437;
                        this.field_w[13][2] = 3421;
                        this.field_w[14][2] = 3148;
                        this.field_w[14][0] = 3727;
                        this.field_w[14][1] = 3116;
                        this.field_w[14][3] = 3228;
                        this.field_w[15][1] = 2377;
                        this.field_w[15][2] = 2505;
                        this.field_w[15][0] = 4096;
                        this.field_w[15][3] = 2746;
                        break L0;
                      } else {
                        if (var3 == 6) {
                          this.field_w = new int[4][4];
                          this.field_w[0][0] = 2048;
                          this.field_w[0][3] = 0;
                          this.field_w[0][2] = 4096;
                          this.field_w[0][1] = 0;
                          this.field_w[1][2] = 4096;
                          this.field_w[1][3] = 0;
                          this.field_w[1][1] = 4096;
                          this.field_w[1][0] = 2867;
                          this.field_w[2][1] = 4096;
                          this.field_w[2][3] = 0;
                          this.field_w[2][0] = 3276;
                          this.field_w[2][2] = 4096;
                          this.field_w[3][1] = 4096;
                          this.field_w[3][2] = 0;
                          this.field_w[3][3] = 0;
                          this.field_w[3][0] = 4096;
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
        if (!(null != this.field_w)) {
            this.a(1, false);
        }
        if (param0 <= 123) {
            fj var3 = (fj) null;
            this.a((fj) null, 19, 48);
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_32_0 = 0;
            if ((nn.field_c.field_g ^ -1) > -5) {
              if (param0 == 3) {
                try {
                  L0: {
                    L1: {
                      if (-1 == (pd.field_c ^ -1)) {
                        rd.field_x = hq.field_a.a(cl.field_d, tl.field_u, -59);
                        pd.field_c = pd.field_c + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (pd.field_c == 1) {
                        if (-3 != (rd.field_x.field_a ^ -1)) {
                          if (rd.field_x.field_a != 1) {
                            break L2;
                          } else {
                            pd.field_c = pd.field_c + 1;
                            break L2;
                          }
                        } else {
                          stackOut_14_0 = pg.a(-1, (byte) -56);
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if ((pd.field_c ^ -1) != -3) {
                        break L3;
                      } else {
                        up.field_a = new no((java.net.Socket) (rd.field_x.field_d), hq.field_a);
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
                      if (-4 != (pd.field_c ^ -1)) {
                        break L4;
                      } else {
                        if (0 < up.field_a.a(-126)) {
                          var1_int = up.field_a.d(0);
                          if (0 != var1_int) {
                            stackOut_28_0 = pg.a(var1_int, (byte) -56);
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            pd.field_c = pd.field_c + 1;
                            break L4;
                          }
                        } else {
                          if ((km.b(-1) ^ -1L) < (ro.field_v ^ -1L)) {
                            stackOut_24_0 = pg.a(-2, (byte) -64);
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if ((pd.field_c ^ -1) != -5) {
                      stackOut_34_0 = -1;
                      stackIn_35_0 = stackOut_34_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      nn.field_c.a(up.field_a, am.field_n, (byte) 124);
                      pd.field_c = 0;
                      up.field_a = null;
                      rd.field_x = null;
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  return pg.a(-3, (byte) -116);
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return stackIn_29_0;
                    } else {
                      if (decompiledRegionSelector0 == 3) {
                        return stackIn_33_0;
                      } else {
                        return stackIn_35_0;
                      }
                    }
                  }
                }
              } else {
                return 110;
              }
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
        int decompiledRegionSelector0 = 0;
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
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("hm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, t[] param2, int param3, uc param4, int param5, t[] param6, int param7, int param8, int param9, int param10, int param11) {
        try {
            if (param7 != 3) {
                field_s = (int[]) null;
            }
            wk.a(param3, param2, param6, param9, param1, param8, param10, param0, 112, param11, param5, param4, param1, param10, param4);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "hm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    public hm() {
        super(1, false);
        this.field_x = new int[257];
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
        int decompiledRegionSelector0 = 0;
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
              stackOut_6_0 = ga.a(stackIn_6_0 != 0, param1, true, param2);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -116;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("hm.E(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
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
                if (-1 != (var4_int ^ -1)) {
                  this.a(var4_int, false);
                  break L1;
                } else {
                  this.field_w = new int[param0.i((byte) -101)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (this.field_w.length <= var5) {
                      break L1;
                    } else {
                      this.field_w[var5][0] = param0.i(7088);
                      this.field_w[var5][1] = param0.i((byte) -101) << -845659708;
                      this.field_w[var5][2] = param0.i((byte) -101) << 1732235268;
                      this.field_w[var5][3] = param0.i((byte) -101) << 1013334372;
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
                this.field_x = (int[]) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("hm.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
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
            this.field_w = (int[][]) null;
            break L0;
          }
        }
        L1: {
          var5 = this.field_w.length;
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
                      if (this.field_w[var9][0] > var8) {
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
                      var15 = this.field_w[var5 - 1];
                      var2 = var15[1];
                      var4 = var15[3];
                      var3 = var15[2];
                      break L5;
                    } else {
                      var17 = this.field_w[var7];
                      if (-1 <= (var7 ^ -1)) {
                        var4 = var17[3];
                        var2 = var17[1];
                        var3 = var17[2];
                        break L5;
                      } else {
                        var10 = this.field_w[-1 + var7];
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
                  this.field_x[var6] = gm.a(var4, gm.a(var3 << -673918616, var2 << -673741456));
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
        field_v = "Password: ";
        field_u = "This entry doesn't match";
        field_t = "30 more levels";
        field_s = new int[8192];
    }
}
