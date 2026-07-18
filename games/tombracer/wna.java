/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wna extends ci {
    static hua field_n;
    private int[][] field_o;
    private int[] field_m;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var18 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        var3 = -88 % ((param0 - 19) / 43);
        var6 = ((wna) this).field_o.length;
        if (var6 > 0) {
          var7 = 0;
          L0: while (true) {
            if (var7 < 257) {
              var8 = 0;
              var9 = var7 << 4;
              var10 = 0;
              L1: while (true) {
                L2: {
                  if (var6 <= var10) {
                    break L2;
                  } else {
                    if (~((wna) this).field_o[var10][0] < ~var9) {
                      break L2;
                    } else {
                      var8++;
                      var10++;
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (~var6 < ~var8) {
                    var18 = ((wna) this).field_o[var8];
                    if (var8 > 0) {
                      var11 = ((wna) this).field_o[var8 - 1];
                      var12 = (var9 - var11[0] << 12) / (-var11[0] + var18[0]);
                      var13 = -var12 + 4096;
                      var4 = var13 * var11[2] + var12 * var18[2] >> 12;
                      var5 = var13 * var11[3] + var18[3] * var12 >> 12;
                      var2 = var12 * var18[1] - -(var11[1] * var13) >> 12;
                      break L3;
                    } else {
                      var5 = var18[3];
                      var2 = var18[1];
                      var4 = var18[2];
                      break L3;
                    }
                  } else {
                    var15 = ((wna) this).field_o[var6 + -1];
                    var5 = var15[3];
                    var4 = var15[2];
                    var2 = var15[1];
                    break L3;
                  }
                }
                L4: {
                  var5 = var5 >> 4;
                  var4 = var4 >> 4;
                  var2 = var2 >> 4;
                  if (0 > var4) {
                    var4 = 0;
                    break L4;
                  } else {
                    if (255 < var4) {
                      var4 = 255;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (0 <= var5) {
                    if (var5 <= 255) {
                      break L5;
                    } else {
                      var5 = 255;
                      break L5;
                    }
                  } else {
                    var5 = 0;
                    break L5;
                  }
                }
                L6: {
                  if (0 > var2) {
                    var2 = 0;
                    break L6;
                  } else {
                    if (var2 > 255) {
                      var2 = 255;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                ((wna) this).field_m[var7] = fh.a(var5, fh.a(var2 << 16, var4 << 8));
                var7++;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, uia param1, int param2) {
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                var4_int = param1.h(param0 + 148);
                if (var4_int == 0) {
                  ((wna) this).field_o = new int[param1.h(255)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (~((wna) this).field_o.length >= ~var5) {
                      break L1;
                    } else {
                      ((wna) this).field_o[var5][0] = param1.d(127);
                      ((wna) this).field_o[var5][1] = param1.h(kha.b((int) param0, 148)) << 4;
                      ((wna) this).field_o[var5][2] = param1.h(255) << 4;
                      ((wna) this).field_o[var5][3] = param1.h(255) << 4;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  this.d(var4_int, -6333);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0 == 107) {
              break L0;
            } else {
              wna.d((byte) 91);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("wna.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != -109) {
            boolean discarded$0 = wna.c(103);
            field_n = null;
            return;
        }
        field_n = null;
    }

    public wna() {
        super(1, false);
        ((wna) this).field_m = new int[257];
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (0 == param0) {
          return;
        } else {
          var3 = param0;
          if (var3 != 1) {
            if (var3 == 2) {
              ((wna) this).field_o = new int[8][4];
              ((wna) this).field_o[0][0] = 0;
              ((wna) this).field_o[0][2] = 2602;
              ((wna) this).field_o[0][1] = 2650;
              ((wna) this).field_o[0][3] = 2361;
              ((wna) this).field_o[1][1] = 2313;
              ((wna) this).field_o[1][3] = 1558;
              ((wna) this).field_o[1][2] = 1799;
              ((wna) this).field_o[1][0] = 2867;
              ((wna) this).field_o[2][0] = 3072;
              ((wna) this).field_o[2][2] = 1734;
              ((wna) this).field_o[2][3] = 1413;
              ((wna) this).field_o[2][1] = 2618;
              ((wna) this).field_o[3][2] = 1220;
              ((wna) this).field_o[3][0] = 3276;
              ((wna) this).field_o[3][3] = 947;
              ((wna) this).field_o[3][1] = 2296;
              ((wna) this).field_o[4][2] = 963;
              ((wna) this).field_o[4][0] = 3481;
              ((wna) this).field_o[4][1] = 2072;
              ((wna) this).field_o[4][3] = 722;
              ((wna) this).field_o[5][2] = 2152;
              ((wna) this).field_o[5][0] = 3686;
              ((wna) this).field_o[5][3] = 1766;
              ((wna) this).field_o[5][1] = 2730;
              ((wna) this).field_o[6][2] = 1060;
              ((wna) this).field_o[6][3] = 915;
              ((wna) this).field_o[6][1] = 2232;
              ((wna) this).field_o[6][0] = 3891;
              ((wna) this).field_o[7][2] = 1413;
              ((wna) this).field_o[7][0] = 4096;
              ((wna) this).field_o[7][3] = 1140;
              ((wna) this).field_o[7][1] = 1686;
              return;
            } else {
              if (var3 == 3) {
                ((wna) this).field_o = new int[7][4];
                ((wna) this).field_o[0][0] = 0;
                ((wna) this).field_o[0][1] = 0;
                ((wna) this).field_o[0][2] = 0;
                ((wna) this).field_o[0][3] = 4096;
                ((wna) this).field_o[1][2] = 4096;
                ((wna) this).field_o[1][0] = 663;
                ((wna) this).field_o[1][1] = 0;
                ((wna) this).field_o[1][3] = 4096;
                ((wna) this).field_o[2][1] = 0;
                ((wna) this).field_o[2][2] = 4096;
                ((wna) this).field_o[2][0] = 1363;
                ((wna) this).field_o[2][3] = 0;
                ((wna) this).field_o[3][1] = 4096;
                ((wna) this).field_o[3][0] = 2048;
                ((wna) this).field_o[3][2] = 4096;
                ((wna) this).field_o[3][3] = 0;
                ((wna) this).field_o[4][0] = 2727;
                ((wna) this).field_o[4][2] = 0;
                ((wna) this).field_o[4][1] = 4096;
                ((wna) this).field_o[4][3] = 0;
                ((wna) this).field_o[5][1] = 4096;
                ((wna) this).field_o[5][0] = 3411;
                ((wna) this).field_o[5][2] = 0;
                ((wna) this).field_o[5][3] = 4096;
                ((wna) this).field_o[6][3] = 4096;
                ((wna) this).field_o[6][1] = 0;
                ((wna) this).field_o[6][2] = 0;
                ((wna) this).field_o[6][0] = 4096;
                return;
              } else {
                if (4 != var3) {
                  if (var3 == 5) {
                    ((wna) this).field_o = new int[16][4];
                    ((wna) this).field_o[0][0] = 0;
                    ((wna) this).field_o[0][3] = 321;
                    ((wna) this).field_o[0][2] = 192;
                    ((wna) this).field_o[0][1] = 80;
                    ((wna) this).field_o[1][3] = 562;
                    ((wna) this).field_o[1][2] = 449;
                    ((wna) this).field_o[1][0] = 155;
                    ((wna) this).field_o[1][1] = 321;
                    ((wna) this).field_o[2][2] = 690;
                    ((wna) this).field_o[2][3] = 803;
                    ((wna) this).field_o[2][0] = 389;
                    ((wna) this).field_o[2][1] = 578;
                    ((wna) this).field_o[3][3] = 1140;
                    ((wna) this).field_o[3][0] = 671;
                    ((wna) this).field_o[3][2] = 995;
                    ((wna) this).field_o[3][1] = 947;
                    ((wna) this).field_o[4][3] = 1509;
                    ((wna) this).field_o[4][1] = 1285;
                    ((wna) this).field_o[4][0] = 897;
                    ((wna) this).field_o[4][2] = 1397;
                    ((wna) this).field_o[5][0] = 1175;
                    ((wna) this).field_o[5][1] = 1525;
                    ((wna) this).field_o[5][2] = 1429;
                    ((wna) this).field_o[5][3] = 1413;
                    ((wna) this).field_o[6][3] = 1333;
                    ((wna) this).field_o[6][2] = 1461;
                    ((wna) this).field_o[6][1] = 1734;
                    ((wna) this).field_o[6][0] = 1368;
                    ((wna) this).field_o[7][2] = 1525;
                    ((wna) this).field_o[7][1] = 1413;
                    ((wna) this).field_o[7][0] = 1507;
                    ((wna) this).field_o[7][3] = 1702;
                    ((wna) this).field_o[8][1] = 1108;
                    ((wna) this).field_o[8][2] = 1590;
                    ((wna) this).field_o[8][3] = 2056;
                    ((wna) this).field_o[8][0] = 1736;
                    ((wna) this).field_o[9][3] = 2666;
                    ((wna) this).field_o[9][2] = 2056;
                    ((wna) this).field_o[9][1] = 1766;
                    ((wna) this).field_o[9][0] = 2088;
                    ((wna) this).field_o[10][1] = 2409;
                    ((wna) this).field_o[10][3] = 3276;
                    ((wna) this).field_o[10][0] = 2355;
                    ((wna) this).field_o[10][2] = 2586;
                    ((wna) this).field_o[11][2] = 3148;
                    ((wna) this).field_o[11][3] = 3228;
                    ((wna) this).field_o[11][1] = 3116;
                    ((wna) this).field_o[11][0] = 2691;
                    ((wna) this).field_o[12][3] = 3196;
                    ((wna) this).field_o[12][0] = 3031;
                    ((wna) this).field_o[12][1] = 3806;
                    ((wna) this).field_o[12][2] = 3710;
                    ((wna) this).field_o[13][3] = 3019;
                    ((wna) this).field_o[13][2] = 3421;
                    ((wna) this).field_o[13][0] = 3522;
                    ((wna) this).field_o[13][1] = 3437;
                    ((wna) this).field_o[14][1] = 3116;
                    ((wna) this).field_o[14][2] = 3148;
                    ((wna) this).field_o[14][0] = 3727;
                    ((wna) this).field_o[14][3] = 3228;
                    ((wna) this).field_o[15][1] = 2377;
                    ((wna) this).field_o[15][3] = 2746;
                    ((wna) this).field_o[15][0] = 4096;
                    ((wna) this).field_o[15][2] = 2505;
                    return;
                  } else {
                    if (var3 == 6) {
                      ((wna) this).field_o = new int[4][4];
                      ((wna) this).field_o[0][2] = 4096;
                      ((wna) this).field_o[0][0] = 2048;
                      ((wna) this).field_o[0][1] = 0;
                      ((wna) this).field_o[0][3] = 0;
                      ((wna) this).field_o[1][1] = 4096;
                      ((wna) this).field_o[1][2] = 4096;
                      ((wna) this).field_o[1][0] = 2867;
                      ((wna) this).field_o[1][3] = 0;
                      ((wna) this).field_o[2][2] = 4096;
                      ((wna) this).field_o[2][0] = 3276;
                      ((wna) this).field_o[2][1] = 4096;
                      ((wna) this).field_o[2][3] = 0;
                      ((wna) this).field_o[3][3] = 0;
                      ((wna) this).field_o[3][2] = 0;
                      ((wna) this).field_o[3][1] = 4096;
                      ((wna) this).field_o[3][0] = 4096;
                      return;
                    } else {
                      throw new RuntimeException("Invalid gradient preset");
                    }
                  }
                } else {
                  ((wna) this).field_o = new int[6][4];
                  ((wna) this).field_o[0][1] = 0;
                  ((wna) this).field_o[0][0] = 0;
                  ((wna) this).field_o[0][3] = 0;
                  ((wna) this).field_o[0][2] = 0;
                  ((wna) this).field_o[1][0] = 1843;
                  ((wna) this).field_o[1][2] = 0;
                  ((wna) this).field_o[1][1] = 0;
                  ((wna) this).field_o[1][3] = 1493;
                  ((wna) this).field_o[2][3] = 2939;
                  ((wna) this).field_o[2][1] = 0;
                  ((wna) this).field_o[2][2] = 0;
                  ((wna) this).field_o[2][0] = 2457;
                  ((wna) this).field_o[3][2] = 1124;
                  ((wna) this).field_o[3][3] = 3565;
                  ((wna) this).field_o[3][0] = 2781;
                  ((wna) this).field_o[3][1] = 0;
                  ((wna) this).field_o[4][2] = 3084;
                  ((wna) this).field_o[4][0] = 3481;
                  ((wna) this).field_o[4][3] = 4031;
                  ((wna) this).field_o[4][1] = 546;
                  ((wna) this).field_o[5][0] = 4096;
                  ((wna) this).field_o[5][1] = 4096;
                  ((wna) this).field_o[5][3] = 4096;
                  ((wna) this).field_o[5][2] = 4096;
                  return;
                }
              }
            }
          } else {
            ((wna) this).field_o = new int[2][4];
            ((wna) this).field_o[0][3] = 0;
            ((wna) this).field_o[0][2] = 0;
            ((wna) this).field_o[0][0] = 0;
            ((wna) this).field_o[0][1] = 0;
            ((wna) this).field_o[1][1] = 4096;
            ((wna) this).field_o[1][3] = 4096;
            ((wna) this).field_o[1][0] = 4096;
            ((wna) this).field_o[1][2] = 4096;
            return;
          }
        }
    }

    final static boolean c(int param0) {
        if (param0 > -111) {
            wna.d((byte) -62);
            if (cga.field_f < 20) {
                return true;
            }
            if (!wua.c((byte) 49)) {
                return true;
            }
            if (lsa.field_a <= 0) {
                return false;
            }
            if (dg.b(-1)) {
                return false;
            }
            return true;
        }
        if (cga.field_f < 20) {
            return true;
        }
        if (!wua.c((byte) 49)) {
            return true;
        }
        if (lsa.field_a <= 0) {
            return false;
        }
        if (dg.b(-1)) {
            return false;
        }
        return true;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var14 = null;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var19 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var18 = ((wna) this).field_h.a(param0, (byte) 108);
        var16 = var18;
        var14 = var16;
        var12 = var14;
        var11 = var12;
        var3 = var11;
        if (param1 == -1) {
          if (((wna) this).field_h.field_f) {
            var19 = ((wna) this).c(0, -15, param0);
            var6 = var18[0];
            var7 = var18[1];
            var8 = var18[2];
            var9 = 0;
            L0: while (true) {
              if (ns.field_g > var9) {
                L1: {
                  var4 = var19[var9] >> 4;
                  if (var4 >= 0) {
                    break L1;
                  } else {
                    var4 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (var4 > 256) {
                    var4 = 256;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = ((wna) this).field_m[var4];
                var6[var9] = sea.c(var4, 16711680) >> 12;
                var7[var9] = sea.c(var4 >> 4, 4080);
                var8[var9] = sea.c(var4, 255) << 4;
                var9++;
                continue L0;
              } else {
                return var11;
              }
            }
          } else {
            return var11;
          }
        } else {
          ((wna) this).field_o = null;
          if (((wna) this).field_h.field_f) {
            var19 = ((wna) this).c(0, -15, param0);
            var6 = var18[0];
            var7 = var18[1];
            var8 = var18[2];
            var9 = 0;
            L3: while (true) {
              if (ns.field_g > var9) {
                L4: {
                  var4 = var19[var9] >> 4;
                  if (var4 >= 0) {
                    break L4;
                  } else {
                    var4 = 0;
                    break L4;
                  }
                }
                L5: {
                  if (var4 > 256) {
                    var4 = 256;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var4 = ((wna) this).field_m[var4];
                var6[var9] = sea.c(var4, 16711680) >> 12;
                var7[var9] = sea.c(var4 >> 4, 4080);
                var8[var9] = sea.c(var4, 255) << 4;
                var9++;
                continue L3;
              } else {
                return var11;
              }
            }
          } else {
            return var11;
          }
        }
    }

    final void b(byte param0) {
        L0: {
          if (((wna) this).field_o == null) {
            this.d(1, -6333);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 116) {
          this.d(-31);
          this.d(112);
          return;
        } else {
          this.d(112);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new hua();
    }
}
