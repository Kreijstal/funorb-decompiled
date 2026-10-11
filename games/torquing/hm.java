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
        if (this.field_r.field_b) {
          var17 = this.b(param0 + 29116, 0, param1);
          var6 = var14[0];
          var7 = var14[1];
          var8 = var14[2];
          for (var9 = 0; var9 < ci.field_c; var9++) {
            var4 = var17[var9] >> 4;
            if (0 > var4) {
              var4 = 0;
            }
            if (256 < var4) {
              var4 = 256;
            }
            var4 = this.field_x[var4];
            var6[var9] = ie.a(4080, var4 >> 12);
            var7[var9] = ie.a(var4, 65280) >> 4;
            var8[var9] = ie.a(var4, 255) << 4;
          }
        }
        return var11;
    }

    private final void a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = Torquing.field_u;
        if (param1) {
          return;
        }
        if (param0 != 0) {
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
          } else {
            if (var3 == 2) {
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
                } else {
                  if (var3 == 5) {
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
                  } else {
                    if (var3 != 6) {
                      throw new RuntimeException("Invalid gradient preset");
                    }
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
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0) {
        if (null == this.field_w) {
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
          int stackIn_15_0 = 0;
          int stackIn_25_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          fj var2 = null;
          if (nn.field_c.field_g >= 4) {
            if (nn.field_c.field_k == -1) {
              return 3;
            }
            if (nn.field_c.field_k != -2) {
              return 1;
            }
            return 4;
          }
          if (param0 != 3) {
            return 110;
          }
          try {
            if (pd.field_c == 0) {
              rd.field_x = hq.field_a.a(cl.field_d, tl.field_u, -59);
              pd.field_c = pd.field_c + 1;
            }
            if (pd.field_c == 1) {
              if (rd.field_x.field_a == 2) {
                stackIn_15_0 = pg.a(-1, (byte) -56);
                return stackIn_15_0;
              }
              if (rd.field_x.field_a == 1) {
                pd.field_c = pd.field_c + 1;
              }
            }
            if (pd.field_c == 2) {
              up.field_a = new no((java.net.Socket) (rd.field_x.field_d), hq.field_a);
              var2 = new fj(13);
              q.a(um.field_r, 123, qg.field_A, var2, eg.field_x);
              var2.b(90, 15);
              var2.b((byte) 60, gf.field_g);
              up.field_a.a(0, var2.field_j, (byte) 64, 13);
              pd.field_c = pd.field_c + 1;
              ro.field_v = 30000L + km.b(-1);
            }
            if (pd.field_c == 3) {
              if (0 < up.field_a.a(-126)) {
                var1_int = up.field_a.d(0);
                if (0 != var1_int) {
                  stackIn_29_0 = pg.a(var1_int, (byte) -56);
                  return stackIn_29_0;
                }
                pd.field_c = pd.field_c + 1;
              } else {
                if (km.b(-1) > ro.field_v) {
                  stackIn_25_0 = pg.a(-2, (byte) -64);
                  return stackIn_25_0;
                }
              }
            }
            if (pd.field_c != 4) {
              stackIn_35_0 = -1;
              return stackIn_35_0;
            }
            nn.field_c.a(up.field_a, am.field_n, (byte) 124);
            pd.field_c = 0;
            up.field_a = null;
            rd.field_x = null;
            stackIn_33_0 = 0;
            return stackIn_33_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return pg.a(-3, (byte) -116);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2, t param3) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        try {
          param2 = param2 + param3.field_v;
          param1 = param1 + param3.field_r;
          var4_int = 0;
          var5 = param3.field_t;
          if (param0 < 54) {
            return;
          }
          var6 = param3.field_s;
          if (ph.field_c > param1) {
            var7 = ph.field_c - param1;
            param1 = ph.field_c;
            var4_int = var4_int + var6 * var7;
            var5 = var5 - var7;
          }
          if (param2 < ph.field_k) {
            var7Lifetime1 = -param2 + ph.field_k;
            param2 = ph.field_k;
            var6 = var6 - var7Lifetime1;
            var4_int = var4_int + var7Lifetime1;
          }
          if (ph.field_h < var5 + param1) {
            var5 = var5 - (-ph.field_h + var5 + param1);
          }
          if (ph.field_a < var6 + param2) {
            var7Lifetime2 = -ph.field_a + (var6 + param2);
            var6 = var6 - var7Lifetime2;
          }
          if (0 < var6 &&
            var5 > 0) {
            var7Lifetime3 = param2 + param1 * ph.field_j;
            la.a(0, var4_int, param3.field_y, -var6 + ph.field_j, ph.field_e, var6, var5, var7Lifetime3, 65280, param3.field_s - var6);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("hm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = -116;
            return stackIn_2_0;
          }
          stackIn_7_0 = ga.a(!param0, param1, true, param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var5 = 0;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = Torquing.field_u;
        try {
          if (param2 == 0) {
            var4_int = param0.i((byte) -101);
            if (var4_int == 0) {
              this.field_w = new int[param0.i((byte) -101)][4];
              for (var5 = 0; this.field_w.length > var5; var5++) {
                this.field_w[var5][0] = param0.i(7088);
                this.field_w[var5][1] = param0.i((byte) -101) << 4;
                this.field_w[var5][2] = param0.i((byte) -101) << 4;
                this.field_w[var5][3] = param0.i((byte) -101) << 4;
              }
            } else {
              this.a(var4_int, false);
            }
          }
          if (param1 != 35) {
            this.field_x = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("hm.H(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var6 = 0;
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int[] var15;
        int[] var17;
        var13 = Torquing.field_u;
        if (param0 != 255) {
          this.field_w = (int[][]) null;
        }
        var5 = this.field_w.length;
        if (var5 > 0) {
          for (var6 = 0; var6 < 257; var6++) {
            var7 = 0;
            var8 = var6 << 4;
            for (var9 = 0; var9 < var5; var9++) {
              if (this.field_w[var9][0] <= var8) {
                var7++;
                continue;
              }
              break;
            }
            if (var5 <= var7) {
              var15 = this.field_w[var5 - 1];
              var2 = var15[1];
              var4 = var15[3];
              var3 = var15[2];
            } else {
              var17 = this.field_w[var7];
              if (var7 <= 0) {
                var4 = var17[3];
                var2 = var17[1];
                var3 = var17[2];
              } else {
                var10 = this.field_w[-1 + var7];
                var11 = (-var10[0] + var8 << 12) / (-var10[0] + var17[0]);
                var12 = 4096 - var11;
                var2 = var11 * var17[1] + var10[1] * var12 >> 12;
                var3 = var17[2] * var11 + var10[2] * var12 >> 12;
                var4 = var12 * var10[3] + var17[3] * var11 >> 12;
              }
            }
            var4 = var4 >> 4;
            var2 = var2 >> 4;
            var3 = var3 >> 4;
            if (0 > var4) {
              var4 = 0;
            } else {
              if (var4 > 255) {
                var4 = 255;
              }
            }
            if (0 <= var2) {
              if (var2 > 255) {
                var2 = 255;
              }
            } else {
              var2 = 0;
            }
            if (var3 < 0) {
              var3 = 0;
            } else {
              if (var3 > 255) {
                var3 = 255;
              }
            }
            this.field_x[var6] = gm.a(var4, gm.a(var3 << 8, var2 << 16));
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
