/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ckb extends le {
    private int[][] field_j;
    private int[] field_i;

    final int[][] a(int param0, int param1) {
        int[] var17 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = VoidHunters.field_G;
        int[][] var14 = this.field_d.a(param1, (byte) -115);
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (param0 != 255) {
            return (int[][]) null;
        }
        if (this.field_d.field_g) {
            var17 = this.a(0, param1, 255);
            var6 = var14[0];
            var7 = var14[1];
            var8 = var14[2];
            for (var9 = 0; var9 < hob.field_d; var9++) {
                var4 = var17[var9] >> -584503388;
                if (var4 < 0) {
                    var4 = 0;
                }
                if (-257 > (var4 ^ -1)) {
                    var4 = 256;
                }
                var4 = this.field_i[var4];
                var6[var9] = dla.a(4080, var4 >> -145631348);
                var7[var9] = dla.a(4080, var4 >> 637054628);
                var8[var9] = dla.a(var4 << 1169891716, 4080);
            }
        }
        return var11;
    }

    final void c(byte param0) {
        if (!(null != this.field_j)) {
            this.a(true, 1);
        }
        this.e((byte) 100);
        if (param0 >= -35) {
            this.field_j = (int[][]) null;
        }
    }

    private final void e(byte param0) {
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
          var13 = VoidHunters.field_G;
          var5 = this.field_j.length;
          if (-1 <= (var5 ^ -1)) {
            break L0;
          } else {
            var6 = 0;
            L1: while (true) {
              if (-258 >= (var6 ^ -1)) {
                break L0;
              } else {
                var7 = 0;
                var8 = var6 << 1641464708;
                var9 = 0;
                L2: while (true) {
                  L3: {
                    if (var5 <= var9) {
                      break L3;
                    } else {
                      if (var8 >= this.field_j[var9][0]) {
                        var7++;
                        var9++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 <= var7) {
                      var15 = this.field_j[var5 - 1];
                      var2 = var15[1];
                      var3 = var15[2];
                      var4 = var15[3];
                      break L4;
                    } else {
                      var17 = this.field_j[var7];
                      if (-1 <= (var7 ^ -1)) {
                        var4 = var17[3];
                        var3 = var17[2];
                        var2 = var17[1];
                        break L4;
                      } else {
                        var10 = this.field_j[var7 - 1];
                        var11 = (var8 + -var10[0] << -1349777460) / (-var10[0] + var17[0]);
                        var12 = 4096 - var11;
                        var4 = var10[3] * var12 + var11 * var17[3] >> 646947980;
                        var2 = var12 * var10[1] + var17[1] * var11 >> 473886284;
                        var3 = var17[2] * var11 + var10[2] * var12 >> -1170208116;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var2 = var2 >> 4;
                    var3 = var3 >> 4;
                    var4 = var4 >> 4;
                    if (var3 < 0) {
                      var3 = 0;
                      break L5;
                    } else {
                      if (255 >= var3) {
                        break L5;
                      } else {
                        var3 = 255;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((var2 ^ -1) > -1) {
                      var2 = 0;
                      break L6;
                    } else {
                      if ((var2 ^ -1) >= -256) {
                        break L6;
                      } else {
                        var2 = 255;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((var4 ^ -1) > -1) {
                      var4 = 0;
                      break L7;
                    } else {
                      if (var4 <= 255) {
                        break L7;
                      } else {
                        var4 = 255;
                        break L7;
                      }
                    }
                  }
                  this.field_i[var6] = knb.a(var4, knb.a(var3 << -1859073560, var2 << 149567920));
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
        L8: {
          if (param0 >= 93) {
            break L8;
          } else {
            this.c((byte) -97);
            break L8;
          }
        }
    }

    final void a(int param0, int param1, ds param2) {
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (-1 == (param0 ^ -1)) {
                var4_int = param2.e((byte) -115);
                if (-1 != (var4_int ^ -1)) {
                  this.a(true, var4_int);
                  break L1;
                } else {
                  this.field_j = new int[param2.e((byte) -124)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (this.field_j.length <= var5) {
                      break L1;
                    } else {
                      this.field_j[var5][0] = param2.e(1869);
                      this.field_j[var5][1] = param2.e((byte) -118) << -1423131804;
                      this.field_j[var5][2] = param2.e((byte) -101) << 1017672964;
                      this.field_j[var5][3] = param2.e((byte) -90) << 149704516;
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
              if (param1 <= -60) {
                break L3;
              } else {
                this.field_j = (int[][]) null;
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
            stackOut_11_1 = new StringBuilder().append("ckb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public ckb() {
        super(1, false);
        this.field_i = new int[257];
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0) {
          L0: {
            if (-1 == (param1 ^ -1)) {
              break L0;
            } else {
              var3 = param1;
              if (var3 != 1) {
                if (2 != var3) {
                  if (var3 == 3) {
                    this.field_j = new int[7][4];
                    this.field_j[0][2] = 0;
                    this.field_j[0][0] = 0;
                    this.field_j[0][3] = 4096;
                    this.field_j[0][1] = 0;
                    this.field_j[1][1] = 0;
                    this.field_j[1][3] = 4096;
                    this.field_j[1][0] = 663;
                    this.field_j[1][2] = 4096;
                    this.field_j[2][3] = 0;
                    this.field_j[2][1] = 0;
                    this.field_j[2][2] = 4096;
                    this.field_j[2][0] = 1363;
                    this.field_j[3][2] = 4096;
                    this.field_j[3][0] = 2048;
                    this.field_j[3][3] = 0;
                    this.field_j[3][1] = 4096;
                    this.field_j[4][0] = 2727;
                    this.field_j[4][2] = 0;
                    this.field_j[4][1] = 4096;
                    this.field_j[4][3] = 0;
                    this.field_j[5][1] = 4096;
                    this.field_j[5][3] = 4096;
                    this.field_j[5][0] = 3411;
                    this.field_j[5][2] = 0;
                    this.field_j[6][2] = 0;
                    this.field_j[6][1] = 0;
                    this.field_j[6][3] = 4096;
                    this.field_j[6][0] = 4096;
                    break L0;
                  } else {
                    if ((var3 ^ -1) != -5) {
                      if ((var3 ^ -1) == -6) {
                        this.field_j = new int[16][4];
                        this.field_j[0][3] = 321;
                        this.field_j[0][0] = 0;
                        this.field_j[0][1] = 80;
                        this.field_j[0][2] = 192;
                        this.field_j[1][2] = 449;
                        this.field_j[1][3] = 562;
                        this.field_j[1][0] = 155;
                        this.field_j[1][1] = 321;
                        this.field_j[2][2] = 690;
                        this.field_j[2][0] = 389;
                        this.field_j[2][1] = 578;
                        this.field_j[2][3] = 803;
                        this.field_j[3][1] = 947;
                        this.field_j[3][0] = 671;
                        this.field_j[3][2] = 995;
                        this.field_j[3][3] = 1140;
                        this.field_j[4][0] = 897;
                        this.field_j[4][2] = 1397;
                        this.field_j[4][3] = 1509;
                        this.field_j[4][1] = 1285;
                        this.field_j[5][1] = 1525;
                        this.field_j[5][3] = 1413;
                        this.field_j[5][2] = 1429;
                        this.field_j[5][0] = 1175;
                        this.field_j[6][1] = 1734;
                        this.field_j[6][0] = 1368;
                        this.field_j[6][3] = 1333;
                        this.field_j[6][2] = 1461;
                        this.field_j[7][0] = 1507;
                        this.field_j[7][2] = 1525;
                        this.field_j[7][3] = 1702;
                        this.field_j[7][1] = 1413;
                        this.field_j[8][1] = 1108;
                        this.field_j[8][0] = 1736;
                        this.field_j[8][2] = 1590;
                        this.field_j[8][3] = 2056;
                        this.field_j[9][0] = 2088;
                        this.field_j[9][2] = 2056;
                        this.field_j[9][1] = 1766;
                        this.field_j[9][3] = 2666;
                        this.field_j[10][2] = 2586;
                        this.field_j[10][0] = 2355;
                        this.field_j[10][1] = 2409;
                        this.field_j[10][3] = 3276;
                        this.field_j[11][2] = 3148;
                        this.field_j[11][1] = 3116;
                        this.field_j[11][0] = 2691;
                        this.field_j[11][3] = 3228;
                        this.field_j[12][0] = 3031;
                        this.field_j[12][3] = 3196;
                        this.field_j[12][2] = 3710;
                        this.field_j[12][1] = 3806;
                        this.field_j[13][0] = 3522;
                        this.field_j[13][2] = 3421;
                        this.field_j[13][3] = 3019;
                        this.field_j[13][1] = 3437;
                        this.field_j[14][0] = 3727;
                        this.field_j[14][1] = 3116;
                        this.field_j[14][3] = 3228;
                        this.field_j[14][2] = 3148;
                        this.field_j[15][2] = 2505;
                        this.field_j[15][3] = 2746;
                        this.field_j[15][1] = 2377;
                        this.field_j[15][0] = 4096;
                        break L0;
                      } else {
                        if (6 == var3) {
                          this.field_j = new int[4][4];
                          this.field_j[0][2] = 4096;
                          this.field_j[0][0] = 2048;
                          this.field_j[0][1] = 0;
                          this.field_j[0][3] = 0;
                          this.field_j[1][0] = 2867;
                          this.field_j[1][3] = 0;
                          this.field_j[1][2] = 4096;
                          this.field_j[1][1] = 4096;
                          this.field_j[2][0] = 3276;
                          this.field_j[2][1] = 4096;
                          this.field_j[2][2] = 4096;
                          this.field_j[2][3] = 0;
                          this.field_j[3][2] = 0;
                          this.field_j[3][1] = 4096;
                          this.field_j[3][3] = 0;
                          this.field_j[3][0] = 4096;
                          break L0;
                        } else {
                          throw new RuntimeException("Invalid gradient preset");
                        }
                      }
                    } else {
                      this.field_j = new int[6][4];
                      this.field_j[0][0] = 0;
                      this.field_j[0][1] = 0;
                      this.field_j[0][2] = 0;
                      this.field_j[0][3] = 0;
                      this.field_j[1][0] = 1843;
                      this.field_j[1][2] = 0;
                      this.field_j[1][1] = 0;
                      this.field_j[1][3] = 1493;
                      this.field_j[2][2] = 0;
                      this.field_j[2][0] = 2457;
                      this.field_j[2][3] = 2939;
                      this.field_j[2][1] = 0;
                      this.field_j[3][3] = 3565;
                      this.field_j[3][2] = 1124;
                      this.field_j[3][0] = 2781;
                      this.field_j[3][1] = 0;
                      this.field_j[4][3] = 4031;
                      this.field_j[4][1] = 546;
                      this.field_j[4][2] = 3084;
                      this.field_j[4][0] = 3481;
                      this.field_j[5][1] = 4096;
                      this.field_j[5][2] = 4096;
                      this.field_j[5][3] = 4096;
                      this.field_j[5][0] = 4096;
                      break L0;
                    }
                  }
                } else {
                  this.field_j = new int[8][4];
                  this.field_j[0][2] = 2602;
                  this.field_j[0][0] = 0;
                  this.field_j[0][1] = 2650;
                  this.field_j[0][3] = 2361;
                  this.field_j[1][1] = 2313;
                  this.field_j[1][3] = 1558;
                  this.field_j[1][0] = 2867;
                  this.field_j[1][2] = 1799;
                  this.field_j[2][3] = 1413;
                  this.field_j[2][0] = 3072;
                  this.field_j[2][2] = 1734;
                  this.field_j[2][1] = 2618;
                  this.field_j[3][3] = 947;
                  this.field_j[3][2] = 1220;
                  this.field_j[3][0] = 3276;
                  this.field_j[3][1] = 2296;
                  this.field_j[4][3] = 722;
                  this.field_j[4][0] = 3481;
                  this.field_j[4][1] = 2072;
                  this.field_j[4][2] = 963;
                  this.field_j[5][1] = 2730;
                  this.field_j[5][2] = 2152;
                  this.field_j[5][3] = 1766;
                  this.field_j[5][0] = 3686;
                  this.field_j[6][3] = 915;
                  this.field_j[6][0] = 3891;
                  this.field_j[6][2] = 1060;
                  this.field_j[6][1] = 2232;
                  this.field_j[7][0] = 4096;
                  this.field_j[7][1] = 1686;
                  this.field_j[7][3] = 1140;
                  this.field_j[7][2] = 1413;
                  break L0;
                }
              } else {
                this.field_j = new int[2][4];
                this.field_j[0][2] = 0;
                this.field_j[0][1] = 0;
                this.field_j[0][3] = 0;
                this.field_j[0][0] = 0;
                this.field_j[1][0] = 4096;
                this.field_j[1][1] = 4096;
                this.field_j[1][2] = 4096;
                this.field_j[1][3] = 4096;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
    }
}
