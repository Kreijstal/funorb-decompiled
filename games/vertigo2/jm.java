/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends ji {
    private int[][] field_A;
    static java.math.BigInteger field_H;
    private int[] field_z;
    static long field_y;
    static wo[] field_E;
    static String field_D;
    static String field_C;
    static ei field_B;
    static int field_G;

    final static void d(int param0, int param1) {
        mi var2 = uh.field_Wb;
        var2.j(param1, 119);
        var2.f(2, 109);
        var2.f(4, 101);
        var2.f(hr.i(104), -97);
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
        var10 = Vertigo2.field_L ? 1 : 0;
        var18 = ((jm) this).field_v.a(param1, -2);
        var16 = var18;
        var14 = var16;
        var12 = var14;
        var11 = var12;
        var3 = var11;
        if (((jm) this).field_v.field_c) {
          var19 = ((jm) this).a(0, -1, param1);
          var6 = var18[0];
          var7 = var18[1];
          var8 = var18[2];
          var9 = 0;
          L0: while (true) {
            if (we.field_M <= var9) {
              if (param0 != -3780) {
                field_B = null;
                return var11;
              } else {
                return var11;
              }
            } else {
              L1: {
                var4 = var19[var9] >> 4;
                if (0 > var4) {
                  var4 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 <= 256) {
                  break L2;
                } else {
                  var4 = 256;
                  break L2;
                }
              }
              var4 = ((jm) this).field_z[var4];
              var6[var9] = b.a(16711680, var4) >> 12;
              var7[var9] = b.a(var4 >> 4, 4080);
              var8[var9] = b.a(255, var4) << 4;
              var9++;
              continue L0;
            }
          }
        } else {
          if (param0 == -3780) {
            return var11;
          } else {
            field_B = null;
            return var11;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 0) {
          var3 = param0;
          if (var3 != 1) {
            if (var3 != 2) {
              if (3 != var3) {
                if (var3 != 4) {
                  if (5 != var3) {
                    if (var3 != 6) {
                      throw new RuntimeException("Invalid gradient preset");
                    } else {
                      ((jm) this).field_A = new int[4][4];
                      ((jm) this).field_A[0][0] = 2048;
                      ((jm) this).field_A[0][3] = 0;
                      ((jm) this).field_A[0][2] = 4096;
                      ((jm) this).field_A[0][1] = 0;
                      ((jm) this).field_A[1][3] = 0;
                      ((jm) this).field_A[1][1] = 4096;
                      ((jm) this).field_A[1][2] = 4096;
                      ((jm) this).field_A[1][0] = 2867;
                      ((jm) this).field_A[2][2] = 4096;
                      ((jm) this).field_A[2][3] = 0;
                      ((jm) this).field_A[2][0] = 3276;
                      ((jm) this).field_A[2][1] = 4096;
                      ((jm) this).field_A[3][0] = 4096;
                      ((jm) this).field_A[3][1] = 4096;
                      ((jm) this).field_A[3][2] = 0;
                      ((jm) this).field_A[3][3] = 0;
                      return;
                    }
                  } else {
                    ((jm) this).field_A = new int[16][4];
                    ((jm) this).field_A[0][2] = 192;
                    ((jm) this).field_A[0][1] = 80;
                    ((jm) this).field_A[0][3] = 321;
                    ((jm) this).field_A[0][0] = 0;
                    ((jm) this).field_A[1][0] = 155;
                    ((jm) this).field_A[1][2] = 449;
                    ((jm) this).field_A[1][1] = 321;
                    ((jm) this).field_A[1][3] = 562;
                    ((jm) this).field_A[2][0] = 389;
                    ((jm) this).field_A[2][2] = 690;
                    ((jm) this).field_A[2][1] = 578;
                    ((jm) this).field_A[2][3] = 803;
                    ((jm) this).field_A[3][1] = 947;
                    ((jm) this).field_A[3][3] = 1140;
                    ((jm) this).field_A[3][2] = 995;
                    ((jm) this).field_A[3][0] = 671;
                    ((jm) this).field_A[4][3] = 1509;
                    ((jm) this).field_A[4][1] = 1285;
                    ((jm) this).field_A[4][0] = 897;
                    ((jm) this).field_A[4][2] = 1397;
                    ((jm) this).field_A[5][1] = 1525;
                    ((jm) this).field_A[5][0] = 1175;
                    ((jm) this).field_A[5][2] = 1429;
                    ((jm) this).field_A[5][3] = 1413;
                    ((jm) this).field_A[6][1] = 1734;
                    ((jm) this).field_A[6][2] = 1461;
                    ((jm) this).field_A[6][3] = 1333;
                    ((jm) this).field_A[6][0] = 1368;
                    ((jm) this).field_A[7][1] = 1413;
                    ((jm) this).field_A[7][3] = 1702;
                    ((jm) this).field_A[7][0] = 1507;
                    ((jm) this).field_A[7][2] = 1525;
                    ((jm) this).field_A[8][0] = 1736;
                    ((jm) this).field_A[8][3] = 2056;
                    ((jm) this).field_A[8][1] = 1108;
                    ((jm) this).field_A[8][2] = 1590;
                    ((jm) this).field_A[9][1] = 1766;
                    ((jm) this).field_A[9][3] = 2666;
                    ((jm) this).field_A[9][0] = 2088;
                    ((jm) this).field_A[9][2] = 2056;
                    ((jm) this).field_A[10][2] = 2586;
                    ((jm) this).field_A[10][3] = 3276;
                    ((jm) this).field_A[10][0] = 2355;
                    ((jm) this).field_A[10][1] = 2409;
                    ((jm) this).field_A[11][3] = 3228;
                    ((jm) this).field_A[11][0] = 2691;
                    ((jm) this).field_A[11][2] = 3148;
                    ((jm) this).field_A[11][1] = 3116;
                    ((jm) this).field_A[12][1] = 3806;
                    ((jm) this).field_A[12][3] = 3196;
                    ((jm) this).field_A[12][2] = 3710;
                    ((jm) this).field_A[12][0] = 3031;
                    ((jm) this).field_A[13][3] = 3019;
                    ((jm) this).field_A[13][1] = 3437;
                    ((jm) this).field_A[13][0] = 3522;
                    ((jm) this).field_A[13][2] = 3421;
                    ((jm) this).field_A[14][0] = 3727;
                    ((jm) this).field_A[14][3] = 3228;
                    ((jm) this).field_A[14][2] = 3148;
                    ((jm) this).field_A[14][1] = 3116;
                    ((jm) this).field_A[15][1] = 2377;
                    ((jm) this).field_A[15][0] = 4096;
                    ((jm) this).field_A[15][3] = 2746;
                    ((jm) this).field_A[15][2] = 2505;
                    return;
                  }
                } else {
                  ((jm) this).field_A = new int[6][4];
                  ((jm) this).field_A[0][2] = 0;
                  ((jm) this).field_A[0][3] = 0;
                  ((jm) this).field_A[0][0] = 0;
                  ((jm) this).field_A[0][1] = 0;
                  ((jm) this).field_A[1][0] = 1843;
                  ((jm) this).field_A[1][1] = 0;
                  ((jm) this).field_A[1][3] = 1493;
                  ((jm) this).field_A[1][2] = 0;
                  ((jm) this).field_A[2][0] = 2457;
                  ((jm) this).field_A[2][1] = 0;
                  ((jm) this).field_A[2][2] = 0;
                  ((jm) this).field_A[2][3] = 2939;
                  ((jm) this).field_A[3][3] = 3565;
                  ((jm) this).field_A[3][0] = 2781;
                  ((jm) this).field_A[3][2] = 1124;
                  ((jm) this).field_A[3][1] = 0;
                  ((jm) this).field_A[4][2] = 3084;
                  ((jm) this).field_A[4][3] = 4031;
                  ((jm) this).field_A[4][0] = 3481;
                  ((jm) this).field_A[4][1] = 546;
                  ((jm) this).field_A[5][1] = 4096;
                  ((jm) this).field_A[5][2] = 4096;
                  ((jm) this).field_A[5][3] = 4096;
                  ((jm) this).field_A[5][0] = 4096;
                  return;
                }
              } else {
                ((jm) this).field_A = new int[7][4];
                ((jm) this).field_A[0][3] = 4096;
                ((jm) this).field_A[0][1] = 0;
                ((jm) this).field_A[0][2] = 0;
                ((jm) this).field_A[0][0] = 0;
                ((jm) this).field_A[1][2] = 4096;
                ((jm) this).field_A[1][3] = 4096;
                ((jm) this).field_A[1][0] = 663;
                ((jm) this).field_A[1][1] = 0;
                ((jm) this).field_A[2][3] = 0;
                ((jm) this).field_A[2][2] = 4096;
                ((jm) this).field_A[2][0] = 1363;
                ((jm) this).field_A[2][1] = 0;
                ((jm) this).field_A[3][3] = 0;
                ((jm) this).field_A[3][0] = 2048;
                ((jm) this).field_A[3][1] = 4096;
                ((jm) this).field_A[3][2] = 4096;
                ((jm) this).field_A[4][3] = 0;
                ((jm) this).field_A[4][2] = 0;
                ((jm) this).field_A[4][1] = 4096;
                ((jm) this).field_A[4][0] = 2727;
                ((jm) this).field_A[5][2] = 0;
                ((jm) this).field_A[5][0] = 3411;
                ((jm) this).field_A[5][3] = 4096;
                ((jm) this).field_A[5][1] = 4096;
                ((jm) this).field_A[6][0] = 4096;
                ((jm) this).field_A[6][2] = 0;
                ((jm) this).field_A[6][1] = 0;
                ((jm) this).field_A[6][3] = 4096;
                return;
              }
            } else {
              ((jm) this).field_A = new int[8][4];
              ((jm) this).field_A[0][3] = 2361;
              ((jm) this).field_A[0][2] = 2602;
              ((jm) this).field_A[0][1] = 2650;
              ((jm) this).field_A[0][0] = 0;
              ((jm) this).field_A[1][1] = 2313;
              ((jm) this).field_A[1][0] = 2867;
              ((jm) this).field_A[1][2] = 1799;
              ((jm) this).field_A[1][3] = 1558;
              ((jm) this).field_A[2][1] = 2618;
              ((jm) this).field_A[2][0] = 3072;
              ((jm) this).field_A[2][2] = 1734;
              ((jm) this).field_A[2][3] = 1413;
              ((jm) this).field_A[3][2] = 1220;
              ((jm) this).field_A[3][3] = 947;
              ((jm) this).field_A[3][1] = 2296;
              ((jm) this).field_A[3][0] = 3276;
              ((jm) this).field_A[4][3] = 722;
              ((jm) this).field_A[4][1] = 2072;
              ((jm) this).field_A[4][0] = 3481;
              ((jm) this).field_A[4][2] = 963;
              ((jm) this).field_A[5][3] = 1766;
              ((jm) this).field_A[5][1] = 2730;
              ((jm) this).field_A[5][0] = 3686;
              ((jm) this).field_A[5][2] = 2152;
              ((jm) this).field_A[6][3] = 915;
              ((jm) this).field_A[6][2] = 1060;
              ((jm) this).field_A[6][0] = 3891;
              ((jm) this).field_A[6][1] = 2232;
              ((jm) this).field_A[7][3] = 1140;
              ((jm) this).field_A[7][0] = 4096;
              ((jm) this).field_A[7][1] = 1686;
              ((jm) this).field_A[7][2] = 1413;
              return;
            }
          } else {
            ((jm) this).field_A = new int[2][4];
            ((jm) this).field_A[0][1] = 0;
            ((jm) this).field_A[0][3] = 0;
            ((jm) this).field_A[0][0] = 0;
            ((jm) this).field_A[0][2] = 0;
            ((jm) this).field_A[1][2] = 4096;
            ((jm) this).field_A[1][1] = 4096;
            ((jm) this).field_A[1][3] = 4096;
            ((jm) this).field_A[1][0] = 4096;
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (((jm) this).field_A != null) {
          if (param0 > -98) {
            field_E = null;
            this.g(2);
            return;
          } else {
            this.g(2);
            return;
          }
        } else {
          this.a(1, (byte) 59);
          if (param0 <= -98) {
            this.g(2);
            return;
          } else {
            field_E = null;
            this.g(2);
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_C = null;
        field_H = null;
        field_E = null;
        int var1 = 0;
        field_D = null;
        field_B = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        return ch.a(13, (byte) 63, 15, 12);
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                var4_int = param2.h(-11);
                if (var4_int != 0) {
                  this.a(var4_int, (byte) 59);
                  break L1;
                } else {
                  ((jm) this).field_A = new int[param2.h(param0 ^ -101)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (((jm) this).field_A.length <= var5) {
                      break L1;
                    } else {
                      ((jm) this).field_A[var5][0] = param2.a((byte) -11);
                      ((jm) this).field_A[var5][1] = param2.h(-11) << 4;
                      ((jm) this).field_A[var5][2] = param2.h(-11) << 4;
                      ((jm) this).field_A[var5][3] = param2.h(-11) << 4;
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
            if (param0 == 110) {
              break L0;
            } else {
              field_E = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("jm.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void g(int param0) {
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
        var13 = Vertigo2.field_L ? 1 : 0;
        var5 = ((jm) this).field_A.length;
        if (var5 > 0) {
          var6 = 0;
          L0: while (true) {
            if (var6 < 257) {
              var7 = 0;
              var8 = var6 << 4;
              var9 = 0;
              L1: while (true) {
                L2: {
                  if (~var5 >= ~var9) {
                    break L2;
                  } else {
                    if (((jm) this).field_A[var9][0] > var8) {
                      break L2;
                    } else {
                      var7++;
                      var9++;
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (var5 <= var7) {
                    var15 = ((jm) this).field_A[-1 + var5];
                    var4 = var15[3];
                    var2 = var15[1];
                    var3 = var15[2];
                    break L3;
                  } else {
                    var17 = ((jm) this).field_A[var7];
                    if (0 < var7) {
                      var10 = ((jm) this).field_A[var7 - 1];
                      var11 = (-var10[0] + var8 << 12) / (-var10[0] + var17[0]);
                      var12 = -var11 + 4096;
                      var4 = var11 * var17[3] + var10[3] * var12 >> 12;
                      var3 = var10[2] * var12 + var17[2] * var11 >> 12;
                      var2 = var17[1] * var11 + var10[1] * var12 >> 12;
                      break L3;
                    } else {
                      var4 = var17[3];
                      var3 = var17[2];
                      var2 = var17[1];
                      break L3;
                    }
                  }
                }
                L4: {
                  var3 = var3 >> 4;
                  var4 = var4 >> 4;
                  var2 = var2 >> 4;
                  if (var4 >= 0) {
                    if (var4 > 255) {
                      var4 = 255;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var4 = 0;
                    break L4;
                  }
                }
                L5: {
                  if (var3 < 0) {
                    var3 = 0;
                    break L5;
                  } else {
                    if (var3 > 255) {
                      var3 = 255;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (0 > var2) {
                    var2 = 0;
                    break L6;
                  } else {
                    if (255 >= var2) {
                      break L6;
                    } else {
                      var2 = 255;
                      break L6;
                    }
                  }
                }
                ((jm) this).field_z[var6] = om.a(var4, om.a(var2 << 16, var3 << 8));
                var6++;
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

    public jm() {
        super(1, false);
        ((jm) this).field_z = new int[257];
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = param0.length();
              if (1 > var3_int) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = rc.a(param0, 320);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (jq.a(var4.charAt(0), -96)) {
                            break L2;
                          } else {
                            if (jq.a(var4.charAt(-1 + var4.length()), -96)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param0.length() <= var6) {
                                  if (var5 > 0) {
                                    stackOut_33_0 = 0;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!jq.a((char) var7, -96)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 < 2) {
                                      break L5;
                                    } else {
                                      if (!param2) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        return stackIn_29_0 != 0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("jm.B(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + 0 + ',' + param2 + ')');
        }
        return stackIn_34_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = null;
        field_C = "New Game";
        field_D = "You need to play 1 more rated game to unlock this option.";
        field_H = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
