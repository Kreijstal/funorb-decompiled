/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ckb extends le {
    private int[][] field_j;
    private int[] field_i;

    final int[][] a(int param0, int param1) {
        int[] var19 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = VoidHunters.field_G;
        int[][] var18 = ((ckb) this).field_d.a(param1, (byte) -115);
        int[][] var16 = var18;
        int[][] var14 = var16;
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (param0 != 255) {
            return null;
        }
        if (((ckb) this).field_d.field_g) {
            var19 = ((ckb) this).a(0, param1, 255);
            var6 = var18[0];
            var7 = var18[1];
            var8 = var18[2];
            for (var9 = 0; var9 < hob.field_d; var9++) {
                var4 = var19[var9] >> 4;
                if (var4 < 0) {
                    var4 = 0;
                }
                if (var4 > 256) {
                    var4 = 256;
                }
                var4 = ((ckb) this).field_i[var4];
                var6[var9] = dla.a(4080, var4 >> 12);
                var7[var9] = dla.a(4080, var4 >> 4);
                var8[var9] = dla.a(var4 << 4, 4080);
            }
        }
        return var11;
    }

    final void c(byte param0) {
        if (!(null != ((ckb) this).field_j)) {
            this.a(true, 1);
        }
        int discarded$0 = 100;
        this.e();
        if (param0 >= -35) {
            ((ckb) this).field_j = null;
        }
    }

    private final void e() {
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
          var5 = ((ckb) this).field_j.length;
          if (var5 <= 0) {
            break L0;
          } else {
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
                    if (~var5 >= ~var9) {
                      break L3;
                    } else {
                      if (~var8 <= ~((ckb) this).field_j[var9][0]) {
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
                      var15 = ((ckb) this).field_j[var5 - 1];
                      var2 = var15[1];
                      var3 = var15[2];
                      var4 = var15[3];
                      break L4;
                    } else {
                      var17 = ((ckb) this).field_j[var7];
                      if (var7 <= 0) {
                        var4 = var17[3];
                        var3 = var17[2];
                        var2 = var17[1];
                        break L4;
                      } else {
                        var10 = ((ckb) this).field_j[var7 - 1];
                        var11 = (var8 + -var10[0] << 12) / (-var10[0] + var17[0]);
                        var12 = 4096 - var11;
                        var4 = var10[3] * var12 + var11 * var17[3] >> 12;
                        var2 = var12 * var10[1] + var17[1] * var11 >> 12;
                        var3 = var17[2] * var11 + var10[2] * var12 >> 12;
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
                    if (var2 < 0) {
                      var2 = 0;
                      break L6;
                    } else {
                      if (var2 <= 255) {
                        break L6;
                      } else {
                        var2 = 255;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var4 < 0) {
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
                  ((ckb) this).field_i[var6] = knb.a(var4, knb.a(var3 << 8, var2 << 16));
                  var6++;
                  continue L1;
                }
              }
            }
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
              if (param0 == 0) {
                var4_int = param2.e((byte) -115);
                if (var4_int != 0) {
                  this.a(true, var4_int);
                  break L1;
                } else {
                  ((ckb) this).field_j = new int[param2.e((byte) -124)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (((ckb) this).field_j.length <= var5) {
                      break L1;
                    } else {
                      ((ckb) this).field_j[var5][0] = param2.e(1869);
                      ((ckb) this).field_j[var5][1] = param2.e((byte) -118) << 4;
                      ((ckb) this).field_j[var5][2] = param2.e((byte) -101) << 4;
                      ((ckb) this).field_j[var5][3] = param2.e((byte) -90) << 4;
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
                ((ckb) this).field_j = null;
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
            stackOut_11_1 = new StringBuilder().append("ckb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public ckb() {
        super(1, false);
        ((ckb) this).field_i = new int[257];
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param1 == 0) {
            break L0;
          } else {
            var3 = param1;
            if (var3 != 1) {
              if (2 != var3) {
                if (var3 == 3) {
                  ((ckb) this).field_j = new int[7][4];
                  ((ckb) this).field_j[0][2] = 0;
                  ((ckb) this).field_j[0][0] = 0;
                  ((ckb) this).field_j[0][3] = 4096;
                  ((ckb) this).field_j[0][1] = 0;
                  ((ckb) this).field_j[1][1] = 0;
                  ((ckb) this).field_j[1][3] = 4096;
                  ((ckb) this).field_j[1][0] = 663;
                  ((ckb) this).field_j[1][2] = 4096;
                  ((ckb) this).field_j[2][3] = 0;
                  ((ckb) this).field_j[2][1] = 0;
                  ((ckb) this).field_j[2][2] = 4096;
                  ((ckb) this).field_j[2][0] = 1363;
                  ((ckb) this).field_j[3][2] = 4096;
                  ((ckb) this).field_j[3][0] = 2048;
                  ((ckb) this).field_j[3][3] = 0;
                  ((ckb) this).field_j[3][1] = 4096;
                  ((ckb) this).field_j[4][0] = 2727;
                  ((ckb) this).field_j[4][2] = 0;
                  ((ckb) this).field_j[4][1] = 4096;
                  ((ckb) this).field_j[4][3] = 0;
                  ((ckb) this).field_j[5][1] = 4096;
                  ((ckb) this).field_j[5][3] = 4096;
                  ((ckb) this).field_j[5][0] = 3411;
                  ((ckb) this).field_j[5][2] = 0;
                  ((ckb) this).field_j[6][2] = 0;
                  ((ckb) this).field_j[6][1] = 0;
                  ((ckb) this).field_j[6][3] = 4096;
                  ((ckb) this).field_j[6][0] = 4096;
                  break L0;
                } else {
                  if (var3 != 4) {
                    if (var3 == 5) {
                      ((ckb) this).field_j = new int[16][4];
                      ((ckb) this).field_j[0][3] = 321;
                      ((ckb) this).field_j[0][0] = 0;
                      ((ckb) this).field_j[0][1] = 80;
                      ((ckb) this).field_j[0][2] = 192;
                      ((ckb) this).field_j[1][2] = 449;
                      ((ckb) this).field_j[1][3] = 562;
                      ((ckb) this).field_j[1][0] = 155;
                      ((ckb) this).field_j[1][1] = 321;
                      ((ckb) this).field_j[2][2] = 690;
                      ((ckb) this).field_j[2][0] = 389;
                      ((ckb) this).field_j[2][1] = 578;
                      ((ckb) this).field_j[2][3] = 803;
                      ((ckb) this).field_j[3][1] = 947;
                      ((ckb) this).field_j[3][0] = 671;
                      ((ckb) this).field_j[3][2] = 995;
                      ((ckb) this).field_j[3][3] = 1140;
                      ((ckb) this).field_j[4][0] = 897;
                      ((ckb) this).field_j[4][2] = 1397;
                      ((ckb) this).field_j[4][3] = 1509;
                      ((ckb) this).field_j[4][1] = 1285;
                      ((ckb) this).field_j[5][1] = 1525;
                      ((ckb) this).field_j[5][3] = 1413;
                      ((ckb) this).field_j[5][2] = 1429;
                      ((ckb) this).field_j[5][0] = 1175;
                      ((ckb) this).field_j[6][1] = 1734;
                      ((ckb) this).field_j[6][0] = 1368;
                      ((ckb) this).field_j[6][3] = 1333;
                      ((ckb) this).field_j[6][2] = 1461;
                      ((ckb) this).field_j[7][0] = 1507;
                      ((ckb) this).field_j[7][2] = 1525;
                      ((ckb) this).field_j[7][3] = 1702;
                      ((ckb) this).field_j[7][1] = 1413;
                      ((ckb) this).field_j[8][1] = 1108;
                      ((ckb) this).field_j[8][0] = 1736;
                      ((ckb) this).field_j[8][2] = 1590;
                      ((ckb) this).field_j[8][3] = 2056;
                      ((ckb) this).field_j[9][0] = 2088;
                      ((ckb) this).field_j[9][2] = 2056;
                      ((ckb) this).field_j[9][1] = 1766;
                      ((ckb) this).field_j[9][3] = 2666;
                      ((ckb) this).field_j[10][2] = 2586;
                      ((ckb) this).field_j[10][0] = 2355;
                      ((ckb) this).field_j[10][1] = 2409;
                      ((ckb) this).field_j[10][3] = 3276;
                      ((ckb) this).field_j[11][2] = 3148;
                      ((ckb) this).field_j[11][1] = 3116;
                      ((ckb) this).field_j[11][0] = 2691;
                      ((ckb) this).field_j[11][3] = 3228;
                      ((ckb) this).field_j[12][0] = 3031;
                      ((ckb) this).field_j[12][3] = 3196;
                      ((ckb) this).field_j[12][2] = 3710;
                      ((ckb) this).field_j[12][1] = 3806;
                      ((ckb) this).field_j[13][0] = 3522;
                      ((ckb) this).field_j[13][2] = 3421;
                      ((ckb) this).field_j[13][3] = 3019;
                      ((ckb) this).field_j[13][1] = 3437;
                      ((ckb) this).field_j[14][0] = 3727;
                      ((ckb) this).field_j[14][1] = 3116;
                      ((ckb) this).field_j[14][3] = 3228;
                      ((ckb) this).field_j[14][2] = 3148;
                      ((ckb) this).field_j[15][2] = 2505;
                      ((ckb) this).field_j[15][3] = 2746;
                      ((ckb) this).field_j[15][1] = 2377;
                      ((ckb) this).field_j[15][0] = 4096;
                      break L0;
                    } else {
                      if (6 == var3) {
                        ((ckb) this).field_j = new int[4][4];
                        ((ckb) this).field_j[0][2] = 4096;
                        ((ckb) this).field_j[0][0] = 2048;
                        ((ckb) this).field_j[0][1] = 0;
                        ((ckb) this).field_j[0][3] = 0;
                        ((ckb) this).field_j[1][0] = 2867;
                        ((ckb) this).field_j[1][3] = 0;
                        ((ckb) this).field_j[1][2] = 4096;
                        ((ckb) this).field_j[1][1] = 4096;
                        ((ckb) this).field_j[2][0] = 3276;
                        ((ckb) this).field_j[2][1] = 4096;
                        ((ckb) this).field_j[2][2] = 4096;
                        ((ckb) this).field_j[2][3] = 0;
                        ((ckb) this).field_j[3][2] = 0;
                        ((ckb) this).field_j[3][1] = 4096;
                        ((ckb) this).field_j[3][3] = 0;
                        ((ckb) this).field_j[3][0] = 4096;
                        break L0;
                      } else {
                        throw new RuntimeException("Invalid gradient preset");
                      }
                    }
                  } else {
                    ((ckb) this).field_j = new int[6][4];
                    ((ckb) this).field_j[0][0] = 0;
                    ((ckb) this).field_j[0][1] = 0;
                    ((ckb) this).field_j[0][2] = 0;
                    ((ckb) this).field_j[0][3] = 0;
                    ((ckb) this).field_j[1][0] = 1843;
                    ((ckb) this).field_j[1][2] = 0;
                    ((ckb) this).field_j[1][1] = 0;
                    ((ckb) this).field_j[1][3] = 1493;
                    ((ckb) this).field_j[2][2] = 0;
                    ((ckb) this).field_j[2][0] = 2457;
                    ((ckb) this).field_j[2][3] = 2939;
                    ((ckb) this).field_j[2][1] = 0;
                    ((ckb) this).field_j[3][3] = 3565;
                    ((ckb) this).field_j[3][2] = 1124;
                    ((ckb) this).field_j[3][0] = 2781;
                    ((ckb) this).field_j[3][1] = 0;
                    ((ckb) this).field_j[4][3] = 4031;
                    ((ckb) this).field_j[4][1] = 546;
                    ((ckb) this).field_j[4][2] = 3084;
                    ((ckb) this).field_j[4][0] = 3481;
                    ((ckb) this).field_j[5][1] = 4096;
                    ((ckb) this).field_j[5][2] = 4096;
                    ((ckb) this).field_j[5][3] = 4096;
                    ((ckb) this).field_j[5][0] = 4096;
                    break L0;
                  }
                }
              } else {
                ((ckb) this).field_j = new int[8][4];
                ((ckb) this).field_j[0][2] = 2602;
                ((ckb) this).field_j[0][0] = 0;
                ((ckb) this).field_j[0][1] = 2650;
                ((ckb) this).field_j[0][3] = 2361;
                ((ckb) this).field_j[1][1] = 2313;
                ((ckb) this).field_j[1][3] = 1558;
                ((ckb) this).field_j[1][0] = 2867;
                ((ckb) this).field_j[1][2] = 1799;
                ((ckb) this).field_j[2][3] = 1413;
                ((ckb) this).field_j[2][0] = 3072;
                ((ckb) this).field_j[2][2] = 1734;
                ((ckb) this).field_j[2][1] = 2618;
                ((ckb) this).field_j[3][3] = 947;
                ((ckb) this).field_j[3][2] = 1220;
                ((ckb) this).field_j[3][0] = 3276;
                ((ckb) this).field_j[3][1] = 2296;
                ((ckb) this).field_j[4][3] = 722;
                ((ckb) this).field_j[4][0] = 3481;
                ((ckb) this).field_j[4][1] = 2072;
                ((ckb) this).field_j[4][2] = 963;
                ((ckb) this).field_j[5][1] = 2730;
                ((ckb) this).field_j[5][2] = 2152;
                ((ckb) this).field_j[5][3] = 1766;
                ((ckb) this).field_j[5][0] = 3686;
                ((ckb) this).field_j[6][3] = 915;
                ((ckb) this).field_j[6][0] = 3891;
                ((ckb) this).field_j[6][2] = 1060;
                ((ckb) this).field_j[6][1] = 2232;
                ((ckb) this).field_j[7][0] = 4096;
                ((ckb) this).field_j[7][1] = 1686;
                ((ckb) this).field_j[7][3] = 1140;
                ((ckb) this).field_j[7][2] = 1413;
                break L0;
              }
            } else {
              ((ckb) this).field_j = new int[2][4];
              ((ckb) this).field_j[0][2] = 0;
              ((ckb) this).field_j[0][1] = 0;
              ((ckb) this).field_j[0][3] = 0;
              ((ckb) this).field_j[0][0] = 0;
              ((ckb) this).field_j[1][0] = 4096;
              ((ckb) this).field_j[1][1] = 4096;
              ((ckb) this).field_j[1][2] = 4096;
              ((ckb) this).field_j[1][3] = 4096;
              break L0;
            }
          }
        }
    }

    static {
    }
}
