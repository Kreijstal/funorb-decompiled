/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_m;
    int field_e;
    static String[] field_h;
    int[][] field_g;
    int field_a;
    static int[] field_c;
    dl[][] field_f;
    private int[][] field_d;
    mk field_l;
    int field_b;
    e field_i;
    static int[] field_j;
    private int field_k;

    private final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int stackIn_92_0 = 0;
        int stackIn_159_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        dl var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        dl var18Lifetime1;
        dl var18Lifetime1Lifetime1;
        dl var18Lifetime1Lifetime2;
        dl var18Lifetime1Lifetime3;
        int var14Lifetime1;
        int var14Lifetime1Lifetime1;
        var21 = Terraphoenix.field_V;
        try {
          if (param5 <= 92) {
            this.field_m = 80;
          }
          if (param3 >= 1 &&
            param3 < -1 + this.field_b &&
            param6 >= 1 &&
            param6 < (this.field_e - 1)) {
            var8_int = -param1 + param3;
            var9 = -param0 + param6;
            var10 = -param2 + param4;
            var11 = Math.abs(var8_int);
            if (var11 < Math.abs(var9)) {
              var11 = Math.abs(var9);
            }
            if (Math.abs(var10) > var11) {
              var11 = Math.abs(var10);
            }
            if (var11 == 0) {
              return true;
            }
            if (var11 > 32) {
              return false;
            }
            var15 = param1;
            var16 = param0;
            var17 = param2;
            var19 = 1;
            L5: while (true) {
              if (var19 <= var11) {
                var12 = param1 + var8_int * var19 / var11;
                var13 = var19 * var9 / var11 + param0;
                var14 = (var19 * 10 * var10 + var11 * (param2 * 10 + 9)) / (var11 * 10);
                var18 = this.a(122, var13, var14, var12);
                stackIn_159_0 = ~var19;
                if (var21 != 0) {
                  break L5;
                }
                if (stackIn_159_0 != ~var11 &&
                  null != var18 &&
                  3 == var18.field_v) {
                  return false;
                }
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var12 < this.field_b &&
                  var13 < this.field_e) {
                  var12 = var15;
                  var13 = var16;
                  var20 = 0;
                  var14Lifetime1 = (var10 * (10 * var19) + (param2 * 10 + 9) * var11) / (10 * var11);
                  var18Lifetime1 = this.a(-48, var13, var14Lifetime1, var12);
                  if (var18Lifetime1 != null) {
                    if (var17 < var14Lifetime1 &&
                      -1 != var18Lifetime1.field_v &&
                      -1 != var18Lifetime1.field_b) {
                      var20 = 1;
                    }
                    if (var14Lifetime1 < var17 &&
                      null != var18Lifetime1.field_C &&
                      var18Lifetime1.field_C.field_v != -1 &&
                      var18Lifetime1.field_C.field_b != -1) {
                      var20 = 1;
                    }
                  }
                  stackIn_92_0 = (var20 != 0) ? 0 : 1;
                  if (stackIn_92_0 == 1) {
                    var17 = var14Lifetime1;
                  }
                  var13 = var16;
                  var14Lifetime1Lifetime1 = var17;
                  var12 = param1 + var8_int * var19 / var11;
                  var18Lifetime1Lifetime1 = this.a(-66, var13, var14Lifetime1Lifetime1, var12);
                  if (var18Lifetime1Lifetime1 != null) {
                    if (var15 < var12 &&
                      (var18Lifetime1Lifetime1.field_e & 1) == 1) {
                      return false;
                    }
                    if (var15 > var12 &&
                      (var18Lifetime1Lifetime1.field_e & 4) == 4) {
                      return false;
                    }
                  }
                  var15 = var12;
                  var13 = param0 + var19 * var9 / var11;
                  var18Lifetime1Lifetime2 = this.a(97, var13, var14Lifetime1Lifetime1, var12);
                  if (null != var18Lifetime1Lifetime2) {
                    if (var13 > var16 &&
                      (2 & var18Lifetime1Lifetime2.field_e) == 2) {
                      return false;
                    }
                    if (var16 > var13 &&
                      (var18Lifetime1Lifetime2.field_e & 8) == 8) {
                      return false;
                    }
                  }
                  var16 = var13;
                  if (var20 != 0) {
                    var14Lifetime1Lifetime1 = ((param2 * 10 + 9) * var11 + var10 * (10 * var19)) / (var11 * 10);
                    var18Lifetime1Lifetime3 = this.a(-33, var13, var14Lifetime1Lifetime1, var12);
                    if (null != var18Lifetime1Lifetime3) {
                      if (var17 < var14Lifetime1Lifetime1 &&
                        var18Lifetime1Lifetime3.field_v != -1 &&
                        var18Lifetime1Lifetime3.field_b != -1) {
                        return false;
                      }
                      if (var14Lifetime1Lifetime1 < var17 &&
                        var18Lifetime1Lifetime3.field_C != null &&
                        var18Lifetime1Lifetime3.field_C.field_v != -1 &&
                        var18Lifetime1Lifetime3.field_C.field_b != -1) {
                        return false;
                      }
                    }
                  }
                  var16 = var13;
                  var15 = var12;
                  var17 = var14Lifetime1Lifetime1;
                  var19++;
                  continue;
                } else {
                  return false;
                }
              }
              stackIn_159_0 = 1;
              break;
            }
            return stackIn_159_0 != 0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var8), "dk.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Terraphoenix.field_V;
        try {
          var7_int = -param4 + param1;
          var8 = -param3 + param5;
          var9 = Math.abs(var7_int);
          if (var9 < Math.abs(var8)) {
            var9 = Math.abs(var8);
          }
          if (var9 == 0) {
            return;
          }
          var12 = param4;
          if (param0) {
            this.field_g = (int[][]) null;
          }
          var13 = param3;
          var14 = 0;
          while (var14 <= var9) {
            var11 = param3 + var8 * var14 / var9;
            var10 = var7_int * var14 / var9 + param4;
            if (var15 != 0) {
              return;
            }
            if (var10 >= 0 &&
              var11 >= 0 &&
              var10 < this.field_b &&
              this.field_e > var11) {
              var11 = var13;
              if (var12 < var10 &&
                (this.field_f[var10][var11].field_e & 1) == 1) {
                return;
              }
              if (var12 > var10 &&
                4 == (this.field_f[var10][var11].field_e & 4)) {
                return;
              }
              var11 = var8 * var14 / var9 + param3;
              if (var13 < var11 &&
                2 == (this.field_f[var10][var11].field_e & 2)) {
                return;
              }
              if (var11 < var13 &&
                (this.field_f[var10][var11].field_e & 8) == 8) {
                return;
              }
              if (var14 - jh.field_n < this.field_g[var10][var11] &&
                jh.field_n < var14) {
                this.field_g[var10][var11] = var14 - jh.field_n;
              }
              if (var14 != var9) {
                if (2 == this.field_f[var10][var11].field_v) {
                  return;
                }
                if (this.field_f[var10][var11].field_v == 3) {
                  return;
                }
              }
              var13 = var11;
              var12 = var10;
              var14++;
              continue;
            } else {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var7), "dk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        try {
          this.a(50, (byte) -122, 50);
          if (param0 != 5) {
            discarded$0 = this.a(-21, -19, -77, -123, -123, (byte) 64, 48);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dk.S(" + param0 + ')');
        }
    }

    final ue a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7) {
        RuntimeException var9 = null;
        ue stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param7) {
            dk.b(51);
          }
          stackIn_4_0 = this.a(param4, param0, param1, -93, false, param3, param6, param5, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var9), "dk.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final ue a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_13_0 = 0;
        Object stackIn_24_0 = null;
        ue stackIn_27_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_144_0 = 0;
        Object stackIn_146_0 = null;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_185_0 = 0;
        Object stackIn_189_0 = null;
        Object stackIn_191_0 = null;
        Object stackIn_193_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = Terraphoenix.field_V;
        try {
          var8_int = 0;
          L0: while (true) {
            if (var8_int < this.field_b) {
              stackIn_13_0 = 0;
              if (var21 != 0) {
                break L0;
              }
              var9 = stackIn_13_0;
              while (this.field_e > var9) {
                this.field_d[var8_int][var9] = 1000;
                var9++;
              }
              var8_int++;
              continue L0;
            }
            var8_int = param1;
            stackIn_13_0 = param1;
            break;
          }
          var9 = stackIn_13_0;
          var10 = param4;
          var11 = param4;
          if (param1 >= 1 &&
            1 <= param4 &&
            (-2 + this.field_b) > param1 &&
            (-2 + this.field_e) > param4) {
            if (param6 < 28) {
              stackIn_27_0 = (ue) null;
              return stackIn_27_0;
            }
            this.field_d[param1][param4] = 0;
            if (null == this.a(82, param4, param2, param1)) {
              stackIn_32_0 = null;
              return (ue) (stackIn_32_0);
            }
            var15_int = 0;
            while (true) {
              stackIn_35_0 = ~var15_int;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_35_0 > -1001) {
                stackIn_144_0 = var8_int;
                decompiledFrameRemainder0 = (var21 == 0);
                if (decompiledFrameRemainder0) {
                  var16 = stackIn_144_0;
                  L11: while (true) {
                    stackIn_39_0 = ~var9;
                    stackIn_39_1 = ~var16;
                    if (stackIn_39_0 <= stackIn_39_1) {
                      stackIn_35_0 = var10;
                      var17 = stackIn_35_0;
                      while (var17 <= var11) {
                        stackIn_39_0 = var15_int;
                        stackIn_39_1 = this.field_d[var16][var17];
                        if (stackIn_39_0 == stackIn_39_1) {
                          if (var8_int == var16 &&
                            1 < var16) {
                            var8_int--;
                          }
                          if (var17 == var11 &&
                            var17 < (-2 + this.field_b)) {
                            var11++;
                          }
                          if (var10 == var17 &&
                            var17 > 1) {
                            var10--;
                          }
                          if (param3 == var16 &&
                            var17 == param5) {
                            var15_int = 1000;
                          }
                          if (~var16 == ~var9 &&
                            var16 < (this.field_b - 2)) {
                            var9++;
                          }
                          var14 = this.a(-41, var17, param2, var16);
                          if (var14 != null) {
                            if (param0 &&
                              !var14.field_a &&
                              var14.field_d) {
                              this.field_d[var16][var17] = 1000;
                            }
                            if (var16 > 1) {
                              var12 = -1;
                              var13 = 0;
                              if (this.field_d[var12 + var16][var13 + var17] > var14.a(var13, var12, -114) + var15_int) {
                                this.field_d[var12 + var16][var13 + var17] = var14.a(var13, var12, -124) + var15_int;
                              }
                            }
                            if (var16 > 1 &&
                              var17 > 1) {
                              var12 = -1;
                              var13 = -1;
                              if (this.field_d[var16 + var12][var13 + var17] > (var15_int + var14.a(var13, var12, -116))) {
                                this.field_d[var16 + var12][var13 + var17] = var15_int + var14.a(var13, var12, -128);
                              }
                            }
                            if (1 < var16 &&
                              var17 < this.field_e - 2) {
                              var12 = -1;
                              var13 = 1;
                              if (this.field_d[var12 + var16][var17 + var13] > var14.a(var13, var12, -116) + var15_int) {
                                this.field_d[var16 + var12][var17 + var13] = var14.a(var13, var12, -109) + var15_int;
                              }
                            }
                            if (var16 < (this.field_b - 2)) {
                              var12 = 1;
                              var13 = 0;
                              if (this.field_d[var12 + var16][var17 + var13] > (var14.a(var13, var12, -123) + var15_int)) {
                                this.field_d[var12 + var16][var13 + var17] = var15_int + var14.a(var13, var12, -120);
                              }
                            }
                            if ((this.field_b - 2) > var16 &&
                              var17 > 1) {
                              var12 = 1;
                              var13 = -1;
                              if (this.field_d[var12 + var16][var13 + var17] > var14.a(var13, var12, -115) + var15_int) {
                                this.field_d[var16 + var12][var13 + var17] = var15_int + var14.a(var13, var12, -114);
                              }
                            }
                            if (-2 + this.field_b > var16 &&
                              var17 < (this.field_e - 2)) {
                              var13 = 1;
                              var12 = 1;
                              if (this.field_d[var12 + var16][var17 + var13] > var15_int + var14.a(var13, var12, -120)) {
                                this.field_d[var12 + var16][var13 + var17] = var14.a(var13, var12, -118) + var15_int;
                              }
                            }
                            if (1 < var17) {
                              var13 = -1;
                              var12 = 0;
                              if (this.field_d[var16 + var12][var13 + var17] > (var14.a(var13, var12, -108) + var15_int)) {
                                this.field_d[var12 + var16][var13 + var17] = var15_int + var14.a(var13, var12, -123);
                              }
                            }
                            if ((-2 + this.field_e) > var17) {
                              var13 = 1;
                              var12 = 0;
                              if (this.field_d[var12 + var16][var13 + var17] > (var14.a(var13, var12, -124) + var15_int)) {
                                this.field_d[var12 + var16][var13 + var17] = var15_int + var14.a(var13, var12, -118);
                              }
                            }
                          }
                        }
                        var17++;
                      }
                      var16++;
                      continue L11;
                    }
                    break;
                  }
                  var15_int++;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_144_0 = this.a(false, param1, param4, (byte) 88, param2) ? 1 : 0;
              }
              if (stackIn_144_0 != 0) {
                this.field_d[param1][param4] = 1000;
                stackIn_146_0 = null;
                return (ue) (stackIn_146_0);
              }
              if (this.field_d[param3][param5] >= 1000) {
                stackIn_193_0 = null;
                return (ue) (stackIn_193_0);
              }
              var15 = null;
              var19 = param3;
              var20 = param5;
              L30: while (true) {
                if (~param1 == ~var19 &&
                  var20 == param4) {
                  stackIn_191_0 = var15;
                  return (ue) (stackIn_191_0);
                }
                var17 = 0;
                var18 = this.field_d[var19][var20];
                var16 = 0;
                var12 = -1;
                L32: while (true) {
                  stackIn_153_0 = ~var12;
                  stackIn_153_1 = -2;
                  do {
                    if (stackIn_153_0 >= stackIn_153_1) {
                      stackIn_185_0 = -1;
                      if (var21 == 0) {
                        var13 = stackIn_185_0;
                        while (var13 <= 1) {
                          stackIn_153_0 = ~(var19 + var12);
                          stackIn_153_1 = -1;
                          if (stackIn_153_0 < stackIn_153_1 &&
                            var13 + var20 > 0 &&
                            var19 + var12 < -1 + this.field_b &&
                            -1 + this.field_e > var20 + var13) {
                            var14 = this.a(81, var13 + var20, param2, var19 + var12);
                            if (this.field_d[var19 + var12][var20 + var13] < var18 &&
                              1000 > var14.a(-var13, -var12, -127)) {
                              var16 = var12;
                              var18 = this.field_d[var19 + var12][var20 + var13];
                              var17 = var13;
                            }
                          }
                          var13++;
                        }
                        var12++;
                        continue L32;
                      }
                    } else {
                      if (null != var15) {
                        ((ue) (var15)).a(this.field_d[var19][var20] - var18, var17, var16, (byte) -48);
                        if (var21 != 0) {
                          var15 = new ue(var16, var17, -var18 + this.field_d[var19][var20]);
                        }
                      } else {
                        var15 = new ue(var16, var17, -var18 + this.field_d[var19][var20]);
                      }
                      var20 = var20 + var17;
                      var19 = var19 + var16;
                      stackIn_185_0 = ~var16;
                    }
                    if (stackIn_185_0 != -1) {
                      continue L30;
                    }
                    stackIn_153_0 = ~var17;
                    stackIn_153_1 = -1;
                  } while (var21 != 0);
                  break;
                }
                if (stackIn_153_0 != stackIn_153_1) {
                  continue L30;
                }
                break;
              }
              stackIn_189_0 = null;
              return (ue) (stackIn_189_0);
            }
          }
          stackIn_24_0 = null;
          return (ue) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var8), "dk.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void c(byte param0) {
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_33_0Lifetime1;
        int stackIn_33_1Lifetime1;
        var6 = Terraphoenix.field_V;
        try {
          var2_int = aa.field_m;
          var3 = -(eg.field_p * 2) + pd.field_h;
          if (param0 != -96) {
            this.a(29, 74, -97, 18, 98, 87, true);
          }
          var4 = 1;
          while (var4 < -1 + this.field_b) {
            if (var6 != 0) {
              return;
            }
            var5 = 1;
            while (-1 + this.field_e > var5) {
              stackIn_33_0 = var2_int;
              stackIn_33_1 = this.field_i.field_y;
              if (stackIn_33_0 <= stackIn_33_1 &&
                var3 <= this.field_i.field_j &&
                this.field_i.field_y <= 1 + var2_int &&
                this.field_i.field_j <= (1 + var3)) {
                if (this.field_i.field_N == 1 &&
                  le.field_q == null) {
                  sj.field_b = -(var5 * 32) + 32 * var4;
                  vf.field_a = -1;
                  uf.field_c = -1;
                  lg.field_c = var4 * 16 + var5 * 16;
                }
                hl.field_a = true;
              }
              var2_int -= 2;
              var3++;
              var5++;
            }
            var3 = var3 - (this.field_e - 2);
            stackIn_33_0Lifetime1 = var2_int;
            stackIn_33_1Lifetime1 = -4 + 2 * this.field_e;
            var2_int = stackIn_33_0Lifetime1 + stackIn_33_1Lifetime1;
            var3++;
            var2_int += 2;
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "dk.BA(" + param0 + ')');
        }
    }

    final boolean a(int param0, r param1, r param2, boolean param3) {
        int stackIn_366_0 = 0;
        int stackIn_446_0 = 0;
        RuntimeException stackIn_466_0 = null;
        StringBuilder stackIn_466_1 = null;
        String stackIn_467_2 = null;
        StringBuilder stackIn_470_1 = null;
        String stackIn_471_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        dl var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        dl var38Lifetime1;
        dl var38Lifetime1Lifetime1;
        var41 = Terraphoenix.field_V;
        try {
          if (param2 == param1) {
            return true;
          }
          if (param2 != null &&
            param1 != null) {
            var5 = param1.field_c;
            if (param3) {
              var5 = this.a(114, param1.field_gb, param1.field_R, param1.field_i);
            }
            if (null != param2.field_c &&
              null != var5) {
              if (null != param2.field_Z &&
                !var5.field_a &&
                !param3) {
                return false;
              }
              var6 = param2.field_U;
              var7 = (double)(100 * (-param2.field_F + param1.field_F));
              var9 = (double)(100 * (param1.field_H - param2.field_H));
              var11 = param1.field_E;
              if (param3) {
                var7 = (double)(100 * (param1.field_i - param2.field_F));
                var9 = (double)((param1.field_gb - param2.field_H) * 100);
                var11 = param1.field_R;
              }
              if (!param1.field_k) {
                if (0 == param2.field_U &&
                  var7 < 0.0) {
                  return false;
                }
                if (param2.field_U == 1 &&
                  0.0 > var7 + var9) {
                  return false;
                }
                if (param2.field_U == 2 &&
                  var9 < 0.0) {
                  return false;
                }
                if (3 == param2.field_U &&
                  var7 - var9 > 0.0) {
                  return false;
                }
                if (4 == param2.field_U &&
                  0.0 < var7) {
                  return false;
                }
                if (param2.field_U == 5 &&
                  0.0 < var9 + var7) {
                  return false;
                }
                if (param2.field_U == 6 &&
                  0.0 < var9) {
                  return false;
                }
                if (param2.field_U == 7 &&
                  -var9 + var7 < 0.0) {
                  return false;
                }
              }
              param2.a(true, (int)(var7 / 100.0 + (double)param2.field_F), (int)((double)param2.field_H + var9 / 100.0));
              var12 = 87 + 100 * param2.field_E;
              var13 = param2.field_nb.field_g;
              if (param2.field_B == 1 &&
                param2.f((byte) 91) &&
                param2.field_N == param2.field_E) {
                var12 = 100 * var11 + 66;
              }
              if (var13 == 0 ||
                var13 == 8 ||
                var13 == 12 ||
                var13 == 3) {
                var12 = 75 + var11 * 100;
                if (param2.field_B == 1 &&
                  param2.f((byte) 120) &&
                  ~param2.field_N == ~param2.field_E) {
                  var12 = 100 * var11 + 52;
                }
              }
              if (var13 == 6 ||
                var13 == 14 ||
                var13 == 15) {
                var12 = 54 + 100 * var11;
              }
              if (param2.field_c.field_C != null &&
                param2.field_c.field_C.field_v == 5) {
                var12 += 25;
              }
              if (var11 < param2.field_E) {
                var12 = 87 + param2.field_E * 100;
              }
              var14 = 0;
              var15 = 1;
              var16 = 20;
              if (0 == var13) {
                var16 = 20;
              }
              if (var13 == 1) {
                var16 = 32;
              }
              if (var13 == 2) {
                var16 = 40;
              }
              if (var13 == 3) {
                var16 = 28;
              }
              if (var13 == 4) {
                var16 = 36;
              }
              if (6 == var13) {
                var16 = 34;
              }
              if (var13 == 7) {
                var16 = 40;
              }
              if (var13 == 8) {
                var16 = 20;
              }
              if (var13 == 9) {
                var16 = 33;
              }
              if (var13 == 10) {
                var16 = 35;
              }
              if (12 == var13) {
                var16 = 24;
              }
              if (var13 == 13) {
                var16 = 40;
              }
              if (14 == var13) {
                var16 = 51;
              }
              if (var13 == 15) {
                var16 = 46;
              }
              if (var13 == 16) {
                var16 = 39;
              }
              if (18 == var13) {
                var16 = 45;
              }
              var16 += 12;
              var16 = (int)((double)(var16 * 100) / Math.sqrt(2048.0));
              if (param2.field_U == 0) {
                var14 = 1;
                var15 = 0;
              }
              if (1 == param2.field_U) {
                var15 = 1;
                var14 = 1;
              }
              if (param2.field_U == 2) {
                var14 = 0;
                var15 = 1;
              }
              if (param2.field_U == 3) {
                var14 = -1;
                var15 = 1;
              }
              if (param2.field_U == 4) {
                var15 = 0;
                var14 = -1;
              }
              if (5 == param2.field_U) {
                var14 = -1;
                var15 = -1;
              }
              if (6 == param2.field_U) {
                var14 = 0;
                var15 = -1;
              }
              if (param2.field_U == 7) {
                var15 = -1;
                var14 = 1;
              }
              var17 = (double)var16 * ((double)var14 / Math.sqrt((double)(var14 * var14 + var15 * var15)));
              if (var17 < -50.0) {
                var17 = -50.0;
              }
              var19 = (double)var15 / Math.sqrt((double)(var14 * var14 + var15 * var15)) * (double)var16;
              if (var19 < -50.0) {
                var19 = -50.0;
              }
              if (var17 > 50.0) {
                var17 = 50.0;
              }
              var7 = var7 - var17;
              if (var19 > 50.0) {
                var19 = 50.0;
              }
              if (param0 != 10056) {
                return false;
              }
              var9 = var9 - var19;
              var21 = 100 * param1.field_E + 70;
              if (param2.field_E > param1.field_E) {
                var21 = param1.field_E * 100 + 55;
              }
              if (param1.field_E > param2.field_E) {
                var21 = 85 + 100 * param1.field_E;
              }
              var22 = (double)(var21 - var12);
              if (param1.field_B == 1 &&
                !param1.field_db &&
                160000.0 < var7 * var7 + var9 * var9) {
                var21 -= 12;
              }
              var24 = Math.sqrt(var9 * var9 + var7 * var7 + var22 * var22) / 25.0;
              if (var24 < 1.0) {
                param2.field_U = var6;
                return true;
              }
              var22 = var22 / var24;
              var7 = var7 / var24;
              var9 = var9 / var24;
              var26 = param2.field_F;
              var27 = param2.field_H;
              var28 = param2.field_E;
              var29 = var7;
              var31 = var9;
              var33 = var22;
              param2.field_U = var6;
              var35 = (double)(var12 - 100 * var28);
              var37 = 0;
              L51: while (true) {
                var37++;
                if (var37 < 10000) {
                  var38 = this.a(param0 - 9965, var27, var28, var26);
                  L54: while (true) {
                    if (null == var38) {
                      var28--;
                      var35 = var35 + 100.0;
                      var38 = this.a(-75, var27, var28, var26);
                      if (var41 != 0) {
                        break L54;
                      }
                      if (var41 == 0) {
                        continue;
                      }
                    }
                    var35 = var35 + var33;
                    break;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  if (var35 < (double)(-(100 * var38.field_r) + var38.field_l)) {
                    if (var38.field_v == -1 ||
                      var38.field_b == -1) {
                      var28--;
                      var35 = var35 + 100.0;
                      var38 = this.a(122, var27, var28, var26);
                      decompiledFrameRemainder0 = (var41 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      return false;
                    }
                  }
                  if (var35 > 100.0) {
                    if (var38.field_C != null) {
                      if (-1 != var38.field_C.field_v &&
                        var38.field_C.field_b != -1) {
                        return false;
                      }
                      var28++;
                      var38 = var38.field_C;
                      var35 = var35 - 100.0;
                    }
                    if (var35 > 1000.0) {
                      return false;
                    }
                  }
                  if (1 == var38.field_v &&
                    (double)(50 + var38.field_l) > var35) {
                    return false;
                  }
                  if (var38.field_v == 2 &&
                    (double)(50 + var38.field_l) > var35) {
                    return false;
                  }
                  if (3 == var38.field_v &&
                    var35 <= (double)(100 + var38.field_l)) {
                    return false;
                  }
                  var17 = var17 + var29;
                  if (var17 < -50.0) {
                    if ((var38.field_e & 1) == 1) {
                      return false;
                    }
                    if (16 == (var38.field_e & 16) &&
                      50.0 > var35 &&
                      param2.field_E <= param1.field_E) {
                      return false;
                    }
                    var17 = var17 + 100.0;
                    var26--;
                  }
                  if (50.0 < var17) {
                    if ((4 & var38.field_e) == 4) {
                      return false;
                    }
                    if ((64 & var38.field_e) == 64 &&
                      var35 < 50.0 &&
                      param2.field_E <= param1.field_E) {
                      return false;
                    }
                    var17 = var17 - 100.0;
                    var26++;
                  }
                  if (var26 > 0 &&
                    var26 < (this.field_b - 1)) {
                    var38Lifetime1 = this.a(102, var27, var28, var26);
                    L71: while (true) {
                      if (null == var38Lifetime1) {
                        var28--;
                        var35 = var35 + 100.0;
                        var38Lifetime1 = this.a(param0 ^ 10011, var27, var28, var26);
                        if (var41 != 0) {
                          break L71;
                        }
                        if (var41 == 0) {
                          continue;
                        }
                      }
                      var19 = var19 + var31;
                      break;
                    }
                    L74: while (true) {
                      if (null != var38Lifetime1.field_C) {
                        stackIn_366_0 = $cfr$dcmpg(100.0, var35);
                        if (var41 != 0) {
                          break L74;
                        }
                        if (stackIn_366_0 < 0) {
                          var35 = var35 - 100.0;
                          var38Lifetime1 = var38Lifetime1.field_C;
                          var28++;
                          if (var41 == 0) {
                            continue;
                          }
                        }
                      }
                      stackIn_366_0 = $cfr$dcmpl(var19, 50.0);
                      break;
                    }
                    if (stackIn_366_0 > 0) {
                      if (100.0 >= var35) {
                        if ((var38Lifetime1.field_e & 8) == 8) {
                          return false;
                        }
                        if ((128 & var38Lifetime1.field_e) == 128 &&
                          50.0 > var35) {
                          return false;
                        }
                      }
                      var19 = var19 - 100.0;
                      var27++;
                    }
                    if (-50.0 > var19) {
                      if (var35 <= 100.0) {
                        if (2 == (2 & var38Lifetime1.field_e)) {
                          return false;
                        }
                        if ((var38Lifetime1.field_e & 32) == 32 &&
                          var35 < 50.0) {
                          return false;
                        }
                      }
                      var19 = var19 + 100.0;
                      var27--;
                    }
                    if (var27 > 0 &&
                      var27 < -1 + this.field_e) {
                      var38Lifetime1Lifetime1 = this.a(-56, var27, var28, var26);
                      L82: while (true) {
                        boolean decompiledFrameRemainder1 = true;
                        if (var38Lifetime1Lifetime1 == null) {
                          var35 = var35 + 100.0;
                          var28--;
                          var38Lifetime1Lifetime1 = this.a(-123, var27, var28, var26);
                          decompiledFrameRemainder1 = (var41 == 0);
                          if ((decompiledFrameRemainder1) &&
                            (var41 == 0)) {
                            continue;
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          while (null != var38Lifetime1Lifetime1.field_C) {
                            stackIn_446_0 = $cfr$dcmpl(var35, 100.0);
                            if (var41 != 0) {
                              break L82;
                            }
                            if (stackIn_446_0 <= 0) {
                              break;
                            }
                            var28++;
                            var35 = var35 - 100.0;
                            var38Lifetime1Lifetime1 = this.a(111, var27, var28, var26);
                            if (var41 == 0) {
                              continue;
                            }
                            break;
                          }
                        }
                        if (var38Lifetime1Lifetime1.field_h != null) {
                          var39 = var38Lifetime1Lifetime1.field_h.c(-127);
                          var40 = var38Lifetime1Lifetime1.field_h.h(13);
                          if ((double)var40 > var19 &&
                            (double)(-var39) < var17 &&
                            var17 < (double)var39 &&
                            (double)(-var39) < var19 &&
                            var19 < (double)var39) {
                            if (var38Lifetime1Lifetime1.field_h == param1 &&
                              !param3) {
                              return true;
                            }
                            if (var38Lifetime1Lifetime1.field_h != param2) {
                              return false;
                            }
                          }
                        }
                        stackIn_446_0 = param3 ? 1 : 0;
                        break;
                      }
                      if (stackIn_446_0 != 0 &&
                        ~param1.field_i == ~var38Lifetime1Lifetime1.field_A &&
                        ~var38Lifetime1Lifetime1.field_n == ~param1.field_gb &&
                        param1.field_R == var38Lifetime1Lifetime1.field_r) {
                        return true;
                      }
                      if (var41 == 0) {
                        continue L51;
                      }
                      break L51;
                    }
                    return false;
                  }
                  return false;
                }
                break;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_466_0 = var5_ref;
          stackIn_466_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_467_2 = "null";
          } else {
            stackIn_467_2 = "{...}";
          }
          stackIn_470_1 = ((StringBuilder) (Object) stackIn_466_1).append(stackIn_467_2).append(',');
          if (param2 == null) {
            stackIn_471_2 = "null";
          } else {
            stackIn_471_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_466_0), ((StringBuilder) (Object) stackIn_470_1).append(stackIn_471_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -17402) {
            this.field_b = -75;
          }
          stackIn_10_0 = (this.a(param1, param5, param0, param3, param2, (byte) 94, param6)) || (this.a(param6, param3, param2, param5, param0, (byte) 118, param1));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var8), "dk.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_346_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_416_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_358_0Lifetime1;
        int stackIn_358_1Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        var16 = Terraphoenix.field_V;
        try {
          L0: while (true) {
            var2_int = 1;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackIn_3_0 = this.field_b;
              stackIn_3_1 = var5;
              do {
                if (stackIn_3_0 > stackIn_3_1) {
                  stackIn_43_0 = 0;
                  if (var16 == 0) {
                    var6 = stackIn_43_0;
                    while (this.field_b > var6) {
                      stackIn_3_0 = -2;
                      stackIn_3_1 = ~var5;
                      if (stackIn_3_0 > stackIn_3_1 &&
                        1 < var6 &&
                        (-1 + this.field_b) > var5 &&
                        -1 + this.field_b > var6) {
                        var7 = 64;
                        if (var7 > this.field_f[var5 - 1][var6].field_x) {
                          var7 = this.field_f[-1 + var5][var6].field_x;
                        }
                        if (this.field_f[var5][-1 + var6].field_x < var7) {
                          var7 = this.field_f[var5][-1 + var6].field_x;
                        }
                        if (this.field_f[-1 + var5][-1 + var6].field_x < var7) {
                          var7 = this.field_f[var5 - 1][var6 - 1].field_x;
                        }
                        this.field_f[var5][var6].field_x = 1 + var7;
                      } else {
                        this.field_f[var5][var6].field_x = 1;
                      }
                      if (this.field_f[var5][var6].field_B) {
                        this.field_f[var5][var6].field_x = 0;
                      }
                      if (this.field_f[var5][var6].field_x > 4) {
                        var3 = var5;
                        var2_int = 0;
                        var4 = var6;
                      }
                      var6++;
                    }
                    var5++;
                    continue L1;
                  }
                } else {
                  stackIn_43_0 = var2_int;
                }
                boolean decompiledFrameCompleted0 = true;
                if (stackIn_43_0 == 0) {
                  var5 = this.field_f[var3][var4].field_x;
                  if (var5 > 24) {
                    var5 = (int)(-24.0 + Math.random() * (double)var5 + 24.0);
                  }
                  if (75.0 > 100.0 * Math.random() &&
                    16 < var5) {
                    var5 = 16;
                  }
                  if (100.0 * Math.random() < 75.0 &&
                    8 < var5) {
                    var5 = 8;
                  }
                  if (50.0 > 100.0 * Math.random() &&
                    var5 > 4) {
                    var5 = 4;
                  }
                  var4 = var4 - (-1 + var5);
                  var3 = var3 - (-1 + var5);
                  var6Lifetime1 = 1 + (int)(2.0 * Math.random());
                  if (var5 <= 8) {
                    var6Lifetime1 = (int)(2.0 * Math.random());
                  }
                  if (1 == var5) {
                    this.field_f[var3][var4].field_b = 0;
                    this.field_f[var3][var4].field_B = true;
                    var6Lifetime1 = 0;
                  }
                  if (0 == var6Lifetime1) {
                    var7Lifetime1 = var3;
                    while (true) {
                      stackIn_74_0 = ~(var5 + var3);
                      if (stackIn_74_0 < ~var7Lifetime1) {
                        stackIn_167_0 = var4;
                        if (var16 == 0) {
                          var8 = stackIn_167_0;
                          while (var5 + var4 > var8) {
                            this.field_f[var7Lifetime1][var8].field_b = 0;
                            this.field_f[var7Lifetime1][var8].field_B = true;
                            stackIn_74_0 = $cfr$dcmpg(Math.random() * 100.0, 20.0);
                            if (stackIn_74_0 < 0) {
                              this.field_f[var7Lifetime1][var8].field_j = 0;
                            }
                            if (var3 < var7Lifetime1 &&
                              var4 < var8 && (this.field_f[-1 + var7Lifetime1][var8].field_j != 1 &&
                              this.field_f[var7Lifetime1][var8 - 1].field_j != 1 &&
                              this.field_f[1 + var7Lifetime1][var8].field_j != 1 &&
                              this.field_f[-1 + var7Lifetime1][var8].field_j != 7 &&
                              7 != this.field_f[var7Lifetime1][var8 - 1].field_j &&
                              this.field_f[var7Lifetime1 + 1][var8].field_j != 7 ||
                              this.field_f[var7Lifetime1 - 1][var8].field_j != 1 &&
                              1 != this.field_f[var7Lifetime1][1 + var8].field_j &&
                              this.field_f[var7Lifetime1 + 1][var8].field_j != 1 &&
                              7 != this.field_f[var7Lifetime1 - 1][var8].field_j &&
                              7 != this.field_f[var7Lifetime1][var8 + 1].field_j &&
                              7 != this.field_f[var7Lifetime1 + 1][var8].field_j ||
                              this.field_f[var7Lifetime1 - 1][var8].field_j != 1 &&
                              this.field_f[var7Lifetime1][var8 - 1].field_j != 1 &&
                              1 != this.field_f[1 + var8][var8].field_j &&
                              7 != this.field_f[-1 + var7Lifetime1][var8].field_j &&
                              this.field_f[var7Lifetime1][var8 - 1].field_j != 7 &&
                              this.field_f[var7Lifetime1][-1 + var8].field_j != 7 ||
                              this.field_f[1 + var7Lifetime1][var8].field_j != 1 &&
                              this.field_f[var7Lifetime1][var8 - 1].field_j != 1 &&
                              this.field_f[var8 + 1][var8].field_j != 1 &&
                              this.field_f[var7Lifetime1 + 1][var8].field_j != 7 &&
                              this.field_f[var7Lifetime1][var8 - 1].field_j != 7 &&
                              this.field_f[var7Lifetime1][var8 + 1].field_j != 7) && 100.0 * Math.random() < 10.0) {
                              this.field_f[var7Lifetime1][var8].field_j = 1;
                            }
                            var8++;
                          }
                          var7Lifetime1++;
                          continue;
                        }
                      } else {
                        stackIn_167_0 = 0;
                      }
                      var6Lifetime1 = stackIn_167_0;
                      break;
                    }
                  }
                  if (var6Lifetime1 == 1) {
                    var7Lifetime1Lifetime1 = var3;
                    while (true) {
                      stackIn_173_0 = ~(var5 + var3);
                      if (stackIn_173_0 < ~var7Lifetime1Lifetime1) {
                        stackIn_346_0 = var4;
                        if (var16 == 0) {
                          var8Lifetime1 = stackIn_346_0;
                          while (var8Lifetime1 < var5 + var4) {
                            this.field_f[var7Lifetime1Lifetime1][var8Lifetime1].field_b = 0;
                            this.field_f[var7Lifetime1Lifetime1][var8Lifetime1].field_B = true;
                            stackIn_173_0 = $cfr$dcmpl(30.0, Math.random() * 100.0);
                            if (stackIn_173_0 > 0) {
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1].field_j = 0;
                            }
                            if (var7Lifetime1Lifetime1 > var3 &&
                              var4 < var8Lifetime1 && (1 != this.field_f[-1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1 + 1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 7 &&
                              7 != this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j &&
                              this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 7 ||
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 1 &&
                              1 != this.field_f[var7Lifetime1Lifetime1][1 + var8Lifetime1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1 + 1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 7 &&
                              7 != this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 + 1].field_j &&
                              7 != this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j ||
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 1 &&
                              1 != this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j &&
                              this.field_f[1 + var8Lifetime1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 7 &&
                              7 != this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j != 7 ||
                              1 != this.field_f[var7Lifetime1Lifetime1 + 1][var8Lifetime1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j != 1 &&
                              this.field_f[1 + var8Lifetime1][var8Lifetime1].field_j != 1 &&
                              this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 7 &&
                              7 != this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j &&
                              7 != this.field_f[var7Lifetime1Lifetime1][1 + var8Lifetime1].field_j) && 100.0 * Math.random() < 40.0) {
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1].field_j = 1;
                            }
                            if (var7Lifetime1Lifetime1 > var3 &&
                              var4 < var8Lifetime1 && (this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j != 1 &&
                              this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 1 &&
                              this.field_f[-1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 7 &&
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j != 7 &&
                              this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 7 ||
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 + 1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1 + 1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j != 7 &&
                              this.field_f[var7Lifetime1Lifetime1][1 + var8Lifetime1].field_j != 7 &&
                              this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 7 ||
                              1 != this.field_f[var7Lifetime1Lifetime1 - 1][var8Lifetime1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j != 1 &&
                              1 != this.field_f[var8Lifetime1 + 1][var8Lifetime1].field_j &&
                              7 != this.field_f[-1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j != 7 &&
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 - 1].field_j != 7 ||
                              this.field_f[var7Lifetime1Lifetime1 + 1][var8Lifetime1].field_j != 1 &&
                              this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j != 1 &&
                              this.field_f[1 + var8Lifetime1][var8Lifetime1].field_j != 1 &&
                              this.field_f[1 + var7Lifetime1Lifetime1][var8Lifetime1].field_j != 7 &&
                              7 != this.field_f[var7Lifetime1Lifetime1][-1 + var8Lifetime1].field_j &&
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1 + 1].field_j != 7) && 20.0 > 100.0 * Math.random()) {
                              this.field_f[var7Lifetime1Lifetime1][var8Lifetime1].field_j = 7;
                            }
                            var8Lifetime1++;
                          }
                          var7Lifetime1Lifetime1++;
                          continue;
                        }
                      } else {
                        stackIn_346_0 = 0;
                      }
                      var6Lifetime1 = stackIn_346_0;
                      break;
                    }
                  }
                  if (2 == var6Lifetime1) {
                    var7Lifetime1Lifetime2 = 2 + ((int)((double)(-3 + var5) * Math.random()) + var3);
                    var8Lifetime2 = 2 + (int)((double)(-3 + var5) * Math.random()) + var4;
                    var9 = 1;
                    var10 = 2;
                    var11 = -1;
                    var12 = 60;
                    var13 = (int)(3.0 * Math.random());
                    if (1 == var13) {
                      var9 = 0;
                      var10 = 0;
                      var11 = 6;
                    }
                    if (Math.random() * 100.0 < 50.0) {
                      var12 = 64;
                    }
                    if (var13 == 2) {
                      var10 = 1;
                      var9 = 1;
                      var11 = 4;
                    }
                    var14 = var3;
                    while (true) {
                      stackIn_358_0 = ~(var5 + var3);
                      stackIn_358_1 = ~var14;
                      if (stackIn_358_0 >= stackIn_358_1) {
                        break;
                      }
                      stackIn_416_0 = var4;
                      if (var16 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      var15 = stackIn_416_0;
                      while (var15 < var4 + var5) {
                        this.field_f[var14][var15].field_b = 0;
                        stackIn_358_0Lifetime1 = var3;
                        stackIn_358_1Lifetime1 = var14;
                        if (stackIn_358_0Lifetime1 < stackIn_358_1Lifetime1 &&
                          var15 > var4) {
                          this.field_f[var14][var15].field_b = var9;
                          if ((var15 + var14 + (int)(Math.random() * 3.0)) % 2 == 0) {
                            this.field_f[var14][var15].field_b = var10;
                          }
                        }
                        this.field_f[var14][var15].field_B = true;
                        if (var7Lifetime1Lifetime2 != var14 &&
                          var14 != 1 + var7Lifetime1Lifetime2 &&
                          ~var8Lifetime2 != ~var15 &&
                          var15 != 1 + var8Lifetime2) {
                          if (1 + var3 >= var14 ||
                            1 + var4 >= var15) {
                            if (100.0 * Math.random() < 30.0) {
                              this.field_f[var14][var15].field_j = 0;
                            }
                          } else {
                            if (Math.random() * 100.0 < 65.0) {
                              this.field_f[var14][var15].field_j = var11;
                            }
                          }
                          if (~(1 + var3) == ~var14 &&
                            var15 != var4) {
                            this.field_f[var14][var15].field_g = var12;
                          }
                          if (var15 == var4 + 1 &&
                            ~var14 != ~var3) {
                            this.field_f[var14][var15].field_k = var12;
                          }
                        }
                        var15++;
                      }
                      var14++;
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_416_0 = var2_int;
                }
                if (stackIn_416_0 == 0) {
                  continue L0;
                }
                stackIn_3_0 = param0;
                stackIn_3_1 = 1;
              } while (var16 != 0);
              break;
            }
            break;
          }
          if (stackIn_3_0 != stackIn_3_1) {
            this.field_i = (e) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "dk.C(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        dl var6 = null;
        RuntimeException var6_ref = null;
        try {
          if (param1 > 0 &&
            param2 > 0 &&
            -1 + this.field_b > param1 &&
            (-1 + this.field_e) > param2) {
            var6 = this.a(-30, param2, param4, param1);
            if (var6 == null) {
              return false;
            }
            if (2 == var6.field_v) {
              return true;
            }
            if (var6.field_v == 3) {
              return true;
            }
            if (var6.field_h != null && (param0 ||
              var6.field_h.field_k)) {
              return true;
            }
            if (var6.field_v == 4 &&
              null != var6.field_C.field_h) {
              return true;
            }
            if (5 == var6.field_v &&
              null != var6.field_c.field_h) {
              return true;
            }
            if (param3 <= 75) {
              this.field_b = 66;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var6_ref), "dk.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_g = (int[][]) null;
          }
          stackIn_4_0 = this.a(true, param0, param3, (byte) 87, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5), "dk.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final byte[] a(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_31_0 = 0;
        byte[] stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        int var5Lifetime1;
        var9 = Terraphoenix.field_V;
        try {
          var2 = new byte[2 + 24 * this.field_e * this.field_b];
          var3 = 0;
          if (!param0) {
            this.field_b = -81;
          }
          incrementValue$0 = var3;
          var3++;
          var2[incrementValue$0] = (byte)this.field_b;
          incrementValue$1 = var3;
          var3++;
          var2[incrementValue$1] = (byte)this.field_e;
          var4_int = 0;
          while (true) {
            if (this.field_b > var4_int) {
              stackIn_31_0 = 0;
              if (var9 == 0) {
                var5 = stackIn_31_0;
                while (this.field_e > var5) {
                  if (this.field_f[var4_int][var5] == null) {
                    var6 = -50;
                  } else {
                    var6 = this.field_f[var4_int][var5].field_r;
                  }
                  incrementValue$2 = var3;
                  var3++;
                  var2[incrementValue$2] = (byte)(50 + var6);
                  var7 = 0;
                  if (var6 != -50) {
                    var8 = this.field_f[var4_int][var5];
                    while (var7 == 0) {
                      incrementValue$3 = var3;
                      var3++;
                      var2[incrementValue$3] = (byte)(1 + var8.field_b);
                      incrementValue$4 = var3;
                      var3++;
                      var2[incrementValue$4] = (byte)(1 + var8.field_j);
                      incrementValue$5 = var3;
                      var3++;
                      var2[incrementValue$5] = (byte)(var8.field_g + 1);
                      incrementValue$6 = var3;
                      var3++;
                      var2[incrementValue$6] = (byte)(1 + var8.field_k);
                      incrementValue$7 = var3;
                      var3++;
                      var2[incrementValue$7] = (byte)(var8.field_l - 100 * var8.field_r);
                      var7 = 1;
                      if (null == var8.field_C) {
                        incrementValue$8 = var3;
                        var3++;
                        var2[incrementValue$8] = (byte) 0;
                        continue;
                      }
                      incrementValue$9 = var3;
                      var3++;
                      var2[incrementValue$9] = (byte) 1;
                      var7 = 0;
                      var8 = var8.field_C;
                    }
                  } else {
                    var7 = 1;
                  }
                  var5++;
                }
                var4_int++;
                continue;
              }
            } else {
              stackIn_31_0 = var3;
            }
            var4 = new byte[stackIn_31_0];
            var5Lifetime1 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var3 <= var5Lifetime1))) {
              stackIn_38_0 = var4;
              if (var9 == 0) {
                stackIn_38_0[var5Lifetime1] = var2[var5Lifetime1];
                var5Lifetime1++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_38_0 = var4;
            }
            return stackIn_38_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2_ref), "dk.G(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_43_0 = 0;
        byte stackIn_55_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        dl stackIn_86_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_54_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        dl stackIn_86_0Lifetime1;
        int stackIn_78_0Lifetime1;
        int stackIn_81_0Lifetime1;
        int stackIn_81_1Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = Terraphoenix.field_V;
        try {
          L0: while (true) {
            var2_int = 1;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackIn_3_0 = this.field_b;
              stackIn_3_1 = var5;
              do {
                if (stackIn_3_0 > stackIn_3_1) {
                  stackIn_43_0 = 0;
                  if (var9 == 0) {
                    var6 = stackIn_43_0;
                    while (this.field_b > var6) {
                      stackIn_3_0 = -1;
                      stackIn_3_1 = ~var5;
                      if (stackIn_3_0 > stackIn_3_1 &&
                        var6 > 0 &&
                        var5 < this.field_b &&
                        this.field_b > var6) {
                        var7 = 64;
                        if (this.field_f[-1 + var5][var6].field_x < var7) {
                          var7 = this.field_f[-1 + var5][var6].field_x;
                        }
                        if (this.field_f[var5][-1 + var6].field_x < var7) {
                          var7 = this.field_f[var5][var6 - 1].field_x;
                        }
                        if (var7 > this.field_f[-1 + var5][var6 - 1].field_x) {
                          var7 = this.field_f[var5 - 1][-1 + var6].field_x;
                        }
                        this.field_f[var5][var6].field_x = var7 + 1;
                      } else {
                        this.field_f[var5][var6].field_x = 1;
                      }
                      if (this.field_f[var5][var6].field_B) {
                        this.field_f[var5][var6].field_x = 0;
                      }
                      if (16 <= this.field_f[var5][var6].field_x &&
                        var5 % 16 == 15 &&
                        var6 % 16 == 15) {
                        var2_int = 0;
                      }
                      var6++;
                    }
                    var5++;
                    continue L1;
                  }
                } else {
                  stackIn_43_0 = var2_int;
                }
                if (stackIn_43_0 == 0) {
                  var3 = (int)(Math.random() * (double)(this.field_b / 16)) * 16;
                  var4 = (int)(Math.random() * (double)(this.field_b / 16)) * 16;
                  var5 = this.field_f[var3 + 15][15 + var4].field_x;
                  if (var5 >= 16) {
                    var6Lifetime1 = 5;
                    var7Lifetime1 = 8;
                    var8 = of.field_k[wf.a("City" + ((int)((double)var6Lifetime1 * Math.random()) + 1), true)];
                    if (var5 >= 32) {
                      var8 = of.field_k[wf.a("City" + (1 + (int)((double)var7Lifetime1 * Math.random())), true)];
                      if (100.0 * Math.random() < 90.0) {
                        var8 = of.field_k[wf.a("City" + (6 + (int)(3.0 * Math.random())), true)];
                      }
                    }
                    if (null != var8) {
                      this.a(var3, (byte) 104, var4, var8);
                    }
                  }
                }
                if (var2_int == 0) {
                  continue L0;
                }
                stackOut_54_0 = param0;
                stackIn_3_0 = stackOut_54_0;
                stackIn_55_0 = stackOut_54_0;
                stackIn_3_1 = -106;
              } while (var9 != 0);
              break;
            }
            break;
          }
          if (stackIn_55_0 != stackIn_3_1) {
            return;
          }
          var3 = 0;
          while (var3 < this.field_b) {
            stackIn_78_0 = 0;
            var4 = stackIn_78_0;
            while (var4 < this.field_e) {
              stackIn_86_0 = this.field_f[var3][var4];
              if (stackIn_86_0 == null) {
                this.field_f[var3][var4] = new dl(var3, var4, 0, this);
              }
              if (this.field_f[var3][var4].field_b == -1 ||
                -1 == this.field_f[var3][var4].field_v) {
                this.field_f[var3][var4].field_b = 1;
                this.field_f[var3][var4].field_v = 0;
              }
              var4++;
            }
            var3++;
          }
          stackIn_78_0Lifetime1 = mb.b(0, param0 + 187) ? 1 : 0;
          if (stackIn_78_0Lifetime1 != 0) {
            var3 = 0;
            while (true) {
              stackIn_81_0 = ~this.field_b;
              stackIn_81_1 = ~var3;
              if (stackIn_81_0 >= stackIn_81_1) {
                return;
              }
              var4 = 0;
              while (var4 < this.field_e) {
                stackIn_86_0Lifetime1 = this.field_f[var3][var4];
                stackIn_81_0Lifetime1 = ~stackIn_86_0Lifetime1.field_j;
                stackIn_81_1Lifetime1 = -44;
                if (stackIn_81_0Lifetime1 == stackIn_81_1Lifetime1 ||
                  this.field_f[var3][var4].field_j == 44) {
                  this.field_f[var3][var4].field_j = -1;
                  this.field_f[var3][var4].field_v = 0;
                  this.field_f[var3][var4].field_C.field_v = 0;
                }
                var4++;
              }
              var3++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "dk.K(" + param0 + ')');
        }
    }

    final ue a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8) {
        ue stackIn_3_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_101_1 = 0;
        int stackIn_179_0 = 0;
        ue stackIn_182_0 = null;
        ue stackIn_187_0 = null;
        Object stackIn_190_0 = null;
        ue stackIn_199_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        dl var12 = null;
        int var13 = 0;
        int var14_int = 0;
        ue var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_43_0Lifetime1;
        int var15Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var18Lifetime6;
        int var18Lifetime7;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var19Lifetime7;
        int var15Lifetime2;
        var23 = Terraphoenix.field_V;
        try {
          var10_int = param7;
          var11 = param1;
          var12 = this.a(113, param1, param5, param7);
          if (param3 > -78) {
            stackIn_3_0 = (ue) null;
            return stackIn_3_0;
          }
          var13 = 0;
          if (var12 != null && (!param4 ||
            var12.field_a ||
            !var12.field_d)) {
            if (var12 != null) {
              if (var12.field_v == 4) {
                param5++;
              }
              var13 = var12.field_d ? 1 : 0;
              if (var12.field_v == 5) {
                param5--;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (~param6 != ~param5) {
              var14_int = 0;
              L6: while (true) {
                if (this.field_b > var14_int) {
                  stackIn_41_0 = 0;
                  if (var23 != 0) {
                    break L6;
                  }
                  var15 = stackIn_41_0;
                  while (var15 < this.field_e) {
                    this.field_d[var14_int][var15] = 1000;
                    var15++;
                  }
                  var14_int++;
                  continue L6;
                }
                var14_int = param8;
                stackIn_41_0 = param8;
                break;
              }
              var15Lifetime2 = stackIn_41_0;
              var16 = param2;
              var17 = param2;
              this.field_d[param8][param2] = 0;
              var20 = 0;
              while (true) {
                stackIn_43_0 = -1001;
                if (stackIn_43_0 >= ~var20) {
                  break;
                }
                stackIn_179_0 = var14_int;
                if (var23 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var21 = stackIn_179_0;
                L14: while (true) {
                  stackIn_47_0 = ~var15Lifetime2;
                  stackIn_47_1 = ~var21;
                  if (stackIn_47_0 <= stackIn_47_1) {
                    stackIn_43_0Lifetime1 = var16;
                    var22 = stackIn_43_0Lifetime1;
                    while (var17 >= var22) {
                      stackIn_47_0 = var20;
                      stackIn_47_1 = this.field_d[var21][var22];
                      boolean decompiledFrameRemainder0 = true;
                      if (stackIn_47_0 == stackIn_47_1) {
                        if (~var22 == ~var16 &&
                          1 < var22) {
                          var16--;
                        }
                        if (~var22 == ~var17 &&
                          var22 < (this.field_e - 2)) {
                          var17++;
                        }
                        if (var21 == var15Lifetime2 &&
                          var21 < (this.field_b - 2)) {
                          var15Lifetime2++;
                        }
                        if (var14_int == var21 &&
                          var21 > 1) {
                          var14_int--;
                        }
                        var12 = this.a(-120, var22, param6, var21);
                        if (var12 != null) {
                          if (!param4 ||
                            var12.field_a ||
                            !var12.field_d) {
                            if (var12.field_v == 4 &&
                              param5 > param6) {
                              stackIn_100_0 = var12.field_d;
                              if (var13 != 0) {
                                stackIn_101_1 = 0;
                              } else {
                                stackIn_101_1 = 1;
                              }
                              if ((stackIn_100_0 ? 1 : 0) != stackIn_101_1) {
                                var11 = var22;
                                var20 = 1000;
                                var10_int = var21;
                              }
                            }
                            if (var12.field_v == 5 &&
                              param5 < param6) {
                              var11 = var22;
                              var20 = 1000;
                              var10_int = var21;
                            }
                            if (1 < var21) {
                              var18 = -1;
                              var19 = 0;
                              if (this.field_d[var18 + var21][var19 + var22] > (var20 + var12.a(var19, var18, -108))) {
                                this.field_d[var21 + var18][var22 + var19] = var20 + var12.a(var19, var18, -110);
                              }
                            }
                            if (var21 > 1 &&
                              var22 > 1) {
                              var18Lifetime1 = -1;
                              var19Lifetime1 = -1;
                              if (this.field_d[var21 + var18Lifetime1][var22 + var19Lifetime1] > (var12.a(var19Lifetime1, var18Lifetime1, -122) + var20)) {
                                this.field_d[var18Lifetime1 + var21][var22 + var19Lifetime1] = var12.a(var19Lifetime1, var18Lifetime1, -128) + var20;
                              }
                            }
                            if (var21 > 1 &&
                              (-2 + this.field_e) > var22) {
                              var18Lifetime2 = -1;
                              var19Lifetime2 = 1;
                              if (this.field_d[var21 + var18Lifetime2][var19Lifetime2 + var22] > var20 + var12.a(var19Lifetime2, var18Lifetime2, -122)) {
                                this.field_d[var18Lifetime2 + var21][var19Lifetime2 + var22] = var12.a(var19Lifetime2, var18Lifetime2, -128) + var20;
                              }
                            }
                            if (-2 + this.field_b > var21) {
                              var19Lifetime3 = 0;
                              var18Lifetime3 = 1;
                              if (this.field_d[var21 + var18Lifetime3][var22 + var19Lifetime3] > (var20 + var12.a(var19Lifetime3, var18Lifetime3, -113))) {
                                this.field_d[var21 + var18Lifetime3][var22 + var19Lifetime3] = var20 + var12.a(var19Lifetime3, var18Lifetime3, -118);
                              }
                            }
                            if (var21 < this.field_b - 2 &&
                              var22 > 1) {
                              var19Lifetime4 = -1;
                              var18Lifetime4 = 1;
                              if (this.field_d[var21 + var18Lifetime4][var22 + var19Lifetime4] > (var20 + var12.a(var19Lifetime4, var18Lifetime4, -110))) {
                                this.field_d[var21 + var18Lifetime4][var22 + var19Lifetime4] = var20 + var12.a(var19Lifetime4, var18Lifetime4, -124);
                              }
                            }
                            if (this.field_b - 2 > var21 &&
                              (-2 + this.field_e) > var22) {
                              var18Lifetime5 = 1;
                              var19Lifetime5 = 1;
                              if (this.field_d[var21 + var18Lifetime5][var22 + var19Lifetime5] > (var20 + var12.a(var19Lifetime5, var18Lifetime5, -125))) {
                                this.field_d[var21 + var18Lifetime5][var22 + var19Lifetime5] = var12.a(var19Lifetime5, var18Lifetime5, -118) + var20;
                              }
                            }
                            if (var22 > 1) {
                              var18Lifetime6 = 0;
                              var19Lifetime6 = -1;
                              if (this.field_d[var18Lifetime6 + var21][var22 + var19Lifetime6] > var12.a(var19Lifetime6, var18Lifetime6, -119) + var20) {
                                this.field_d[var18Lifetime6 + var21][var22 + var19Lifetime6] = var20 + var12.a(var19Lifetime6, var18Lifetime6, -113);
                              }
                            }
                            if (!(var22 >= -2 + this.field_e)) {
                              var19Lifetime7 = 1;
                              var18Lifetime7 = 0;
                              if (!(this.field_d[var21 + var18Lifetime7][var19Lifetime7 + var22] <= var12.a(var19Lifetime7, var18Lifetime7, -113) + var20)) {
                                this.field_d[var18Lifetime7 + var21][var22 + var19Lifetime7] = var12.a(var19Lifetime7, var18Lifetime7, -106) + var20;
                              }
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            this.field_d[var21][var22] = 1000;
                          }
                        }
                      }
                      if (var20 == 1000) {
                        var22 = var17;
                        var21 = var15Lifetime2;
                      }
                      var22++;
                    }
                    var21++;
                    continue L14;
                  }
                  break;
                }
                var20++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_179_0 = param0 ? 1 : 0;
            }
            if (stackIn_179_0 != 0) {
              stackIn_182_0 = this.a(var11, param6, var10_int, param6, param2, param8, true);
              return stackIn_182_0;
            }
            if (param6 == param5) {
              stackIn_187_0 = this.a(param4, var10_int, param6, param8, var11, param2, 36);
              return stackIn_187_0;
            }
            var14 = this.a(param4, var10_int, param6, param8, var11, param2, 72);
            if (null == var14) {
              stackIn_190_0 = null;
              return (ue) (stackIn_190_0);
            }
            var15Lifetime1 = param6;
            if (var15Lifetime1 < param5) {
              var15Lifetime1++;
            }
            if (var15Lifetime1 > param5) {
              var15Lifetime1--;
            }
            var14.a(-19020, this.a(param0, param1, var11, -128, param4, param5, var15Lifetime1, param7, var10_int));
            stackIn_199_0 = var14;
            return stackIn_199_0;
          }
          stackIn_15_0 = null;
          return (ue) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var10), "dk.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        r var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = Terraphoenix.field_V;
        try {
          var2_int = 0;
          L0: while (true) {
            if (this.field_b > var2_int) {
              stackIn_13_0 = 0;
              if (var4 != 0) {
                break L0;
              }
              var3 = stackIn_13_0;
              while (this.field_e > var3) {
                this.field_g[var2_int][var3] = 1000;
                var3++;
              }
              var2_int++;
              continue L0;
            }
            stackIn_13_0 = -7 / ((param0 - 28) / 46);
            break;
          }
          var3Lifetime1 = stackIn_13_0;
          var3Lifetime2 = 0;
          while (var3Lifetime2 < 12) {
            var2 = this.field_i.field_C[var3Lifetime2];
            if (var4 != 0) {
              return;
            }
            if (null != var2 &&
              var2.field_P > 0) {
              var2.b((byte) -27);
            }
            var3Lifetime2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "dk.O(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          og.field_f.c(param4, param2 - 1, param0, 0, -1);
          og.field_f.c(param4, 1 + param2, param0, 0, -1);
          og.field_f.c(param4, param2, param0 - 1, 0, -1);
          og.field_f.c(param4, param2, param0 + 1, 0, -1);
          if (param3 != -2) {
            this.field_m = 65;
          }
          og.field_f.c(param4, param2, param0, param1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("dk.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void d(int param0) {
        try {
          this.a(false, true);
          if (param0 > -52) {
            this.field_k = -63;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dk.M(" + param0 + ')');
        }
    }

    final dl a(int param0, int param1, int param2, int param3) {
        dl var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_26_0 = null;
        dl stackIn_29_0 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Terraphoenix.field_V;
        try {
          if (param3 >= 0 &&
            param1 >= 0 &&
            this.field_b > param3 &&
            this.field_e > param1) {
            var5 = this.field_f[param3][param1];
            if (null == var5) {
              stackIn_19_0 = null;
              return (dl) (stackIn_19_0);
            }
            var6 = -24 / ((27 - param0) / 52);
            while (param2 > var5.field_r) {
              if (null == var5.field_C) {
                stackIn_26_0 = null;
                return (dl) (stackIn_26_0);
              }
              var5 = var5.field_C;
              if (var7 == 0) {
                continue;
              }
              break;
            }
            stackIn_29_0 = var5;
            return stackIn_29_0;
          }
          stackIn_14_0 = null;
          return (dl) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5_ref), "dk.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        byte stackIn_35_0 = 0;
        boolean stackIn_49_0 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_34_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var12 = null;
        int var13 = 0;
        var13 = Terraphoenix.field_V;
        try {
          if (param1 != 104) {
            return;
          }
          var5_int = 0;
          var6 = param3[var5_int++];
          var7 = param3[var5_int++];
          var8 = param0;
          L0: while (true) {
            stackIn_5_0 = ~var8;
            stackIn_5_1 = ~(param0 + var6);
            if (stackIn_5_0 > stackIn_5_1) {
              if (var13 != 0) {
                return;
              }
              var9 = param2;
              L4: while (true) {
                stackIn_9_0 = ~var9;
                stackIn_9_1 = ~(var7 + param2);
                if (stackIn_9_0 > stackIn_9_1) {
                  incrementValue$2 = var5_int;
                  var5_int++;
                  var10 = param3[incrementValue$2] - 50;
                  var11 = 0;
                  stackIn_5_0 = ~var10;
                  stackIn_5_1 = 49;
                  boolean decompiledFrameRemainder0 = true;
                  if (stackIn_5_0 == stackIn_5_1) {
                    var11 = 1;
                  } else {
                    if (var8 < 0 ||
                      var9 < 0 ||
                      this.field_b <= var8 ||
                      var9 >= this.field_e) {
                      while (1 != var11) {
                        var5_int += 5;
                        var11 = 1;
                        incrementValue$3 = var5_int;
                        var5_int++;
                        stackIn_9_0 = -2;
                        stackIn_9_1 = ~param3[incrementValue$3];
                        if (stackIn_9_0 != stackIn_9_1) {
                          continue;
                        }
                        var11 = 0;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      this.field_f[var8][var9] = new dl(var8, var9, var10, this);
                      this.field_f[var8][var9].field_B = true;
                      var12 = this.field_f[var8][var9];
                      while (var11 != 1) {
                        incrementValue$4 = var5_int;
                        var5_int++;
                        var12.field_b = -1 + param3[incrementValue$4];
                        incrementValue$5 = var5_int;
                        var5_int++;
                        var12.field_j = param3[incrementValue$5] - 1;
                        incrementValue$6 = var5_int;
                        var5_int++;
                        var12.field_g = param3[incrementValue$6] - 1;
                        incrementValue$7 = var5_int;
                        var5_int++;
                        var12.field_k = param3[incrementValue$7] - 1;
                        var11 = 1;
                        incrementValue$8 = var5_int;
                        var5_int++;
                        var12.field_l = var12.field_l + param3[incrementValue$8];
                        incrementValue$9 = var5_int;
                        var5_int++;
                        stackOut_34_0 = param3[incrementValue$9];
                        stackIn_9_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_9_1 = 1;
                        if (stackIn_35_0 != stackIn_9_1) {
                          var12.field_z = true;
                          continue;
                        }
                        if (var12.field_b == 4) {
                          var12.field_a = false;
                        }
                        if ((null != var12.field_c) &&
                          (stackIn_49_0 = !(var12.field_c.field_a))) {
                          var12.field_a = false;
                        }
                        var12.field_C = new dl(var8, var9, var12.field_r + 1, this);
                        var12.field_C.field_c = var12;
                        var12 = var12.field_C;
                        var11 = 0;
                      }
                    }
                  }
                  var9++;
                  continue L4;
                }
                break;
              }
              var8++;
              continue L0;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("dk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        try {
          field_h = null;
          field_j = null;
          field_c = null;
          if (param0 != 22120) {
            field_c = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dk.W(" + param0 + ')');
        }
    }

    final boolean a(byte param0, r param1, r param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -93) {
            discarded$1 = this.a(-66, 2, 104, 35, -6, (byte) -56, 26);
          }
          stackIn_4_0 = this.a(10056, param2, param1, false);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final ue a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        ue stackIn_3_0 = null;
        Object stackIn_21_0 = null;
        boolean stackIn_28_0 = false;
        int stackIn_29_1 = 0;
        ue stackIn_34_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_165_1 = 0;
        boolean stackIn_166_2 = false;
        int stackIn_167_0 = 0;
        int stackIn_176_1 = 0;
        boolean stackIn_177_2 = false;
        Object stackIn_181_0 = null;
        int stackIn_189_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_222_0 = 0;
        Object stackIn_226_0 = null;
        Object stackIn_228_0 = null;
        Object stackIn_230_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        dl var8 = null;
        RuntimeException var8_ref = null;
        int var9_int = 0;
        dl var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        Object var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var14Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var14Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var15Lifetime5;
        int var15Lifetime6;
        int var15Lifetime7;
        int var15Lifetime8;
        var22 = Terraphoenix.field_V;
        try {
          if (~param3 != ~param1) {
            stackIn_3_0 = this.a(param0, param4, param5, param1, true, param2, param3, true);
            return stackIn_3_0;
          }
          var8_int = 0;
          L0: while (this.field_b > var8_int) {
            var9_int = 0;
            while (true) {
              if (this.field_e > var9_int) {
                this.field_d[var8_int][var9_int] = 1000;
                var9_int++;
                if (var22 == 0) {
                  continue;
                }
              } else {
                var8_int++;
              }
              break;
            }
            if (var22 == 0) {
              continue L0;
            }
            break;
          }
          var8 = this.a(89, param4, param3, param5);
          var9 = this.a(-88, param0, param1, param2);
          if (null != var8 &&
            var9 != null) {
            if (param3 > 0) {
              stackIn_28_0 = var9.field_d;
              if (var8.field_d) {
                stackIn_29_1 = 0;
              } else {
                stackIn_29_1 = 1;
              }
              if ((stackIn_28_0 ? 1 : 0) == stackIn_29_1 &&
                ~param3 != ~param1) {
                stackIn_34_0 = this.a(param4, param4, param5, 0, true, param5, param3, true);
                return stackIn_34_0;
              }
            }
            var10 = param2;
            var11 = param2;
            var12 = param0;
            var13 = param0;
            if (param2 >= 1 &&
              param0 >= 1 &&
              (-2 + this.field_b) > param2 &&
              param0 < this.field_e - 2) {
              this.field_d[param2][param0] = 0;
              var16_int = 0;
              while (true) {
                stackIn_51_0 = 1000;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_51_0 > var16_int) {
                  stackIn_167_0 = var10;
                  decompiledFrameRemainder0 = (var22 == 0);
                  if (decompiledFrameRemainder0) {
                    var17 = stackIn_167_0;
                    L13: while (true) {
                      stackIn_55_0 = var17;
                      stackIn_55_1 = var11;
                      if (stackIn_55_0 <= stackIn_55_1) {
                        stackIn_51_0 = var12;
                        var18 = stackIn_51_0;
                        while (var13 >= var18) {
                          stackIn_55_0 = ~this.field_d[var17][var18];
                          stackIn_55_1 = ~var16_int;
                          if (stackIn_55_0 == stackIn_55_1) {
                            if (var17 == param5 &&
                              ~var18 == ~param4) {
                              var16_int = 1000;
                            }
                            if (var10 == var17 &&
                              var17 > 1) {
                              var10--;
                            }
                            if (~var13 == ~var18 &&
                              var18 < (-2 + this.field_e)) {
                              var13++;
                            }
                            if (~var12 == ~var18 &&
                              var18 > 1) {
                              var12--;
                            }
                            if (~var11 == ~var17 &&
                              this.field_b - 2 > var17) {
                              var11++;
                            }
                            var19 = 0;
                            if (100 > this.field_g[var17][var18]) {
                              var19 = 200 - this.field_g[var17][var18];
                            }
                            if (var19 < 0) {
                              var19 = 0;
                            }
                            if (var17 > 1) {
                              var15 = 0;
                              var14 = -1;
                              if (this.field_d[var17 + var14][var15 + var18] > var16_int - (-this.field_f[var17][var18].a(var15, 1000, param3, var14) - var19)) {
                                this.field_d[var14 + var17][var15 + var18] = var19 + this.field_f[var17][var18].a(var15, 1000, param3, var14) + var16_int;
                              }
                            }
                            if (var17 > 1 &&
                              var18 > 1) {
                              var15Lifetime2 = -1;
                              var14Lifetime2 = -1;
                              if (this.field_d[var14Lifetime2 + var17][var15Lifetime2 + var18] > (var16_int + this.field_f[var17][var18].a(var15Lifetime2, 1000, param3, var14Lifetime2) + var19)) {
                                this.field_d[var17 + var14Lifetime2][var18 + var15Lifetime2] = var19 + (this.field_f[var17][var18].a(var15Lifetime2, 1000, param3, var14Lifetime2) + var16_int);
                              }
                            }
                            if (var17 > 1 &&
                              var18 < (-2 + this.field_e)) {
                              var14Lifetime3 = -1;
                              var15Lifetime3 = 1;
                              if (this.field_d[var17 + var14Lifetime3][var18 + var15Lifetime3] > (this.field_f[var17][var18].a(var15Lifetime3, 1000, param3, var14Lifetime3) + var16_int + var19)) {
                                this.field_d[var17 + var14Lifetime3][var15Lifetime3 + var18] = var19 + (var16_int + this.field_f[var17][var18].a(var15Lifetime3, 1000, param3, var14Lifetime3));
                              }
                            }
                            if (-2 + this.field_b > var17) {
                              var14Lifetime4 = 1;
                              var15Lifetime4 = 0;
                              if (this.field_d[var17 + var14Lifetime4][var18 + var15Lifetime4] > this.field_f[var17][var18].a(var15Lifetime4, 1000, param3, var14Lifetime4) + var16_int + var19) {
                                this.field_d[var17 + var14Lifetime4][var15Lifetime4 + var18] = var16_int + (this.field_f[var17][var18].a(var15Lifetime4, 1000, param3, var14Lifetime4) + var19);
                              }
                            }
                            if ((-2 + this.field_b) > var17 &&
                              1 < var18) {
                              var14Lifetime5 = 1;
                              var15Lifetime5 = -1;
                              if (this.field_d[var14Lifetime5 + var17][var18 + var15Lifetime5] > (this.field_f[var17][var18].a(var15Lifetime5, 1000, param3, var14Lifetime5) + var16_int + var19)) {
                                this.field_d[var14Lifetime5 + var17][var15Lifetime5 + var18] = var19 + var16_int + this.field_f[var17][var18].a(var15Lifetime5, 1000, param3, var14Lifetime5);
                              }
                            }
                            if (var17 < (-2 + this.field_b) &&
                              this.field_e - 2 > var18) {
                              var14Lifetime6 = 1;
                              var15Lifetime6 = 1;
                              if (this.field_d[var17 + var14Lifetime6][var18 + var15Lifetime6] > (var19 + (this.field_f[var17][var18].a(var15Lifetime6, 1000, param3, var14Lifetime6) + var16_int))) {
                                this.field_d[var17 + var14Lifetime6][var18 + var15Lifetime6] = this.field_f[var17][var18].a(var15Lifetime6, 1000, param3, var14Lifetime6) + var16_int + var19;
                              }
                            }
                            if (var18 > 1) {
                              var14Lifetime7 = 0;
                              var15Lifetime7 = -1;
                              if (this.field_d[var17 + var14Lifetime7][var18 + var15Lifetime7] > var19 + (this.field_f[var17][var18].a(var15Lifetime7, 1000, param3, var14Lifetime7) + var16_int)) {
                                this.field_d[var14Lifetime7 + var17][var15Lifetime7 + var18] = var16_int + this.field_f[var17][var18].a(var15Lifetime7, 1000, param3, var14Lifetime7) + var19;
                              }
                            }
                            if (this.field_e - 2 > var18) {
                              var15Lifetime8 = 1;
                              var14Lifetime8 = 0;
                              if (this.field_d[var17 + var14Lifetime8][var15Lifetime8 + var18] > var19 + (var16_int + this.field_f[var17][var18].a(var15Lifetime8, 1000, param3, var14Lifetime8))) {
                                this.field_d[var14Lifetime8 + var17][var18 + var15Lifetime8] = this.field_f[var17][var18].a(var15Lifetime8, 1000, param3, var14Lifetime8) + var16_int + var19;
                              }
                            }
                          }
                          var18++;
                        }
                        var17++;
                        continue L13;
                      }
                      break;
                    }
                    var16_int++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_165_1 = param2;
                  stackIn_166_2 = !(param6);
                  stackIn_167_0 = this.a(stackIn_165_1, stackIn_166_2, param1, param0) ? 1 : 0;
                }
                if (stackIn_167_0 != 0) {
                  this.field_d[param2][param0] = 1000;
                }
                if (!param6) {
                  this.a(58, (byte) 54, -86);
                }
                stackIn_176_1 = param2;
                stackIn_177_2 = !(param6);
                if (this.a(stackIn_176_1, stackIn_177_2, param1, param0)) {
                  stackIn_181_0 = null;
                  return (ue) (stackIn_181_0);
                }
                if (this.field_d[param5][param4] >= 1000) {
                  stackIn_230_0 = null;
                  return (ue) (stackIn_230_0);
                }
                var16 = null;
                var20 = param5;
                var21 = param4;
                L37: while (true) {
                  if (var20 == param2 &&
                    var21 == param0) {
                    stackIn_228_0 = var16;
                    return (ue) (stackIn_228_0);
                  }
                  var19Lifetime1 = this.field_d[var20][var21];
                  var18Lifetime1 = 0;
                  var17Lifetime1 = 0;
                  stackIn_189_0 = -1;
                  L39: while (true) {
                    var14Lifetime1 = stackIn_189_0;
                    while (true) {
                      stackIn_191_0 = -2;
                      if (stackIn_191_0 <= ~var14Lifetime1) {
                        stackIn_222_0 = -1;
                        if (var22 == 0) {
                          var15Lifetime1 = stackIn_222_0;
                          while (var15Lifetime1 <= 1) {
                            stackIn_191_0 = var14Lifetime1 + var20;
                            if (stackIn_191_0 > 0 &&
                              var21 + var15Lifetime1 > 0 &&
                              (var20 + var14Lifetime1) < (this.field_b - 1) &&
                              (-1 + this.field_e) > (var21 + var15Lifetime1) &&
                              var19Lifetime1 > this.field_d[var20 + var14Lifetime1][var21 + var15Lifetime1] &&
                              1000 > this.field_f[var20 + var14Lifetime1][var15Lifetime1 + var21].a(-var15Lifetime1, 1000, param3, -var14Lifetime1)) {
                              var19Lifetime1 = this.field_d[var20 + var14Lifetime1][var15Lifetime1 + var21];
                              var17Lifetime1 = var14Lifetime1;
                              var18Lifetime1 = var15Lifetime1;
                            }
                            var15Lifetime1++;
                          }
                          var14Lifetime1++;
                          continue;
                        }
                      } else {
                        if (var16 == null) {
                          var16 = new ue(var17Lifetime1, var18Lifetime1, this.field_f[var20][var21].a(var18Lifetime1, 1000, param3, var17Lifetime1));
                          if (var22 != 0) {
                            ((ue) (var16)).a(-var19Lifetime1 + this.field_d[var20][var21], var18Lifetime1, var17Lifetime1, (byte) -91);
                          }
                        } else {
                          ((ue) (var16)).a(-var19Lifetime1 + this.field_d[var20][var21], var18Lifetime1, var17Lifetime1, (byte) -91);
                        }
                        var20 = var20 + var17Lifetime1;
                        var21 = var21 + var18Lifetime1;
                        stackIn_222_0 = ~var17Lifetime1;
                      }
                      if (stackIn_222_0 != -1) {
                        continue L37;
                      }
                      stackIn_189_0 = var18Lifetime1;
                      if (var22 != 0) {
                        continue L39;
                      }
                      if (stackIn_189_0 != 0) {
                        continue L37;
                      }
                      stackIn_226_0 = null;
                      return (ue) (stackIn_226_0);
                    }
                  }
                }
              }
            }
            stackIn_48_0 = null;
            return (ue) (stackIn_48_0);
          }
          stackIn_21_0 = null;
          return (ue) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var8_ref), "dk.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        dl var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -95) {
            discarded$1 = this.a(true, 68, -74, (byte) 21, -78);
          }
          var5 = this.a(-97, param1, param3, param0);
          if (null == var5) {
            return false;
          }
          if (var5.field_b > -1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var5_ref), "dk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    dk(int param0, int param1) {
        this.field_k = 0;
        try {
          this.field_e = param1;
          this.field_b = param0;
          this.field_f = new dl[this.field_b][this.field_e];
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        dl stackIn_89_0 = null;
        dl stackIn_104_0;
        int stackIn_104_1;
        int stackIn_104_2;
        Object stackIn_104_3;
        int stackIn_104_4;
        int stackIn_104_5;
        boolean stackIn_105_6 = false;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_189_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        Object var15 = null;
        Object var16 = null;
        int var17 = 0;
        dl stackIn_89_0Lifetime1;
        dl var14Lifetime1;
        Object var15Lifetime1;
        Object var16Lifetime1;
        dl stackIn_89_0Lifetime2;
        dl var14Lifetime2;
        Object var15Lifetime2;
        Object var16Lifetime2;
        int stackIn_184_0Lifetime1;
        int stackIn_184_1Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var17 = Terraphoenix.field_V;
        try {
          var3_int = 0;
          var4 = null;
          if (null != this.field_i) {
            var4 = this.field_i.field_F;
          }
          var5 = 320 - sj.field_b;
          var6 = -lg.field_c + 240;
          var7 = 0;
          var8 = 1 + this.field_b - 2;
          var9 = 0;
          var10 = 1 + (-2 + this.field_e);
          if (this.field_l != null) {
            var10 = -1 + this.field_e;
            var7 = 0;
            var8 = this.field_b - 1;
            var9 = 0;
            if (var17 != 0) {
              var6 -= 32;
            }
          } else {
            var6 -= 32;
          }
          if (null != u.field_a) {
            u.field_a.a();
            l.f(0, 0, 128, 160, 0);
            k.field_f.a(0);
          }
          uf.field_c = -1;
          vf.field_a = -1;
          var11 = var7;
          L4: while (true) {
            if (var8 >= var11) {
              var5 += 32;
              var6 += 16;
              stackIn_189_0 = var9;
              if (var17 != 0) {
                break L4;
              }
              var12 = stackIn_189_0;
              while (var10 >= var12) {
                var5 -= 32;
                var6 += 16;
                stackIn_184_0 = var5;
                stackIn_184_1 = -32;
                L10: {
                  boolean decompiledFrameCompleted7 = true;
                  boolean decompiledFrameCompleted6 = true;
                  boolean decompiledFrameCompleted4 = true;
                  boolean decompiledFrameCompleted3 = true;
                  boolean decompiledFrameCompleted2 = true;
                  boolean decompiledFrameCompleted0 = true;
                  boolean decompiledFrameCompleted5 = true;
                  boolean decompiledFrameCompleted1 = true;
                  if (stackIn_184_0 > stackIn_184_1 &&
                    682 > var5 &&
                    -32 < var6 &&
                    var6 < 624) {
                    if (null != this.field_i && (0 == var11 ||
                      var12 == 0 ||
                      ~var11 == ~(-1 + this.field_b) ||
                      var12 == this.field_e - 1)) {
                      while (true) {
                        if (var11 != 0 &&
                          var12 != 0) {
                          pf.a(this.field_i, (byte) 71, var5, var6);
                        } else {
                          wi.a((byte) -80, this.field_i, var5, var6);
                        }
                        if (uf.field_c != var11) {
                          decompiledFrameCompleted7 = false;
                          break;
                        }
                        if (~vf.field_a != ~var12) {
                          decompiledFrameCompleted6 = false;
                          break;
                        }
                        if (!param1) {
                          decompiledFrameCompleted5 = false;
                          break;
                        }
                        var13 = 0;
                        while (!(eg.field_p < var13)) {
                          var14 = this.a(-124, vf.field_a, var13, uf.field_c);
                          stackIn_89_0 = var14;
                          if (stackIn_89_0 != null) {
                            var15 = hb.field_p[0];
                            if (null != var14.field_h &&
                              ~var13 == ~eg.field_p) {
                              if (null != var14.field_h.field_Z) {
                                var15 = hb.field_p[2];
                              } else {
                                if (var14.field_h.field_C == 1) {
                                  if (var14.field_h.field_k) {
                                    var15 = hb.field_p[1];
                                  }
                                } else {
                                  var15 = null;
                                }
                              }
                            }
                            if (this.field_i != null &&
                              this.field_i.field_L != 0 &&
                              eg.field_p == var13) {
                              var15 = hb.field_p[1];
                            }
                            if (hb.field_p[1] == var15) {
                              ve.a((ci) (var15), -5353, var6 + 144 * var13, var6 - var13 * 48, -24 + var5);
                            }
                          } else {
                            var15 = hb.field_p[0];
                            if (null != this.field_i &&
                              this.field_i.field_L != 0 &&
                              var13 == eg.field_p) {
                              var15 = hb.field_p[1];
                            }
                            if (hb.field_p[1] == var15) {
                              ve.a((ci) (var15), -5353, var6 + 144 * var13, var6 - 48 * var13, var5 - 24);
                            }
                            var16 = null;
                            if (!param1) {
                              u.field_a.a();
                              l.f(0, 0, 128, 160, 0);
                              k.field_f.a(0);
                            } else {
                              var16 = oi.field_J;
                              ((ci) (var16)).a();
                              l.f(0, 0, 128, 160, 0);
                            }
                            if (null != var16) {
                              ((ci) (var16)).a();
                              l.a(32, 124, 16777215);
                              l.a(64, 108, 16777215);
                              l.a(64, 139, 16777215);
                              l.a(95, 124, 16777215);
                              k.field_f.a(0);
                              u.field_a.a();
                              ((ci) (var16)).d(0, 0);
                              if (this.field_i != null &&
                                0 < this.field_i.field_L) {
                                c.a((byte) -86, u.field_a, 16777215);
                                c.a((byte) -86, u.field_a, 16744576);
                                c.a((byte) -86, u.field_a, 16728128);
                                c.a((byte) -86, u.field_a, 8388608);
                                c.a((byte) -86, u.field_a, 4194304);
                              } else {
                                c.a((byte) -86, u.field_a, 16777215);
                                c.a((byte) -86, u.field_a, 8454016);
                                c.a((byte) -86, u.field_a, 4259648);
                                c.a((byte) -86, u.field_a, 32768);
                                c.a((byte) -86, u.field_a, 16384);
                              }
                              ((ci) (var16)).b(0, 0, 0);
                              k.field_f.a(0);
                              ug.field_b = -64 + var5;
                              hb.field_n = -(48 * eg.field_p) + (-124 + var6);
                              ((ci) (var16)).b(-64 + var5, -124 + var6);
                            }
                          }
                          var13++;
                        }
                        decompiledFrameCompleted4 = false;
                        break;
                      }
                    }
                    if ((decompiledFrameCompleted7) &&
                      (decompiledFrameCompleted6) &&
                      (decompiledFrameCompleted5) &&
                      (decompiledFrameCompleted4)) {
                      if (this.field_i != null) {
                        var13Lifetime2 = 48 * -eg.field_p;
                        if (Math.abs(this.field_i.field_y - var5) + Math.abs(-var13Lifetime2 + (-var6 + this.field_i.field_j)) * 2 < 32 &&
                          param1 &&
                          !this.field_i.field_w) {
                          vf.field_a = var12;
                          uf.field_c = var11;
                          cm.field_d = eg.field_p;
                        }
                      }
                      if (null != this.field_l) {
                        var13Lifetime2 = 0;
                        if (0 < tg.field_l) {
                          var13Lifetime2 = var13Lifetime2 - tg.field_l * 48;
                        }
                        if (this.field_l.field_k >= var5 - 16 &&
                          16 + var5 >= this.field_l.field_k &&
                          var13Lifetime2 + (var6 - 8) <= this.field_l.field_d &&
                          var13Lifetime2 + (var6 + 8) >= this.field_l.field_d) {
                          cm.field_d = 0;
                          vf.field_a = var12;
                          uf.field_c = var11;
                          if (~var11 == ~uf.field_c &&
                            ~vf.field_a == ~var12 &&
                            param1) {
                            l.a(var5 << 4, var6 << 4, 384, 255, bj.field_d);
                          }
                        }
                      }
                      stackIn_89_0Lifetime2 = this.field_f[var11][var12];
                      while (true) {
                        if (stackIn_89_0Lifetime2 == null) {
                          bm.a(var6, var5, (byte) 127);
                        } else {
                          stackIn_104_0 = this.field_f[var11][var12];
                          stackIn_104_1 = var5;
                          stackIn_104_2 = var3_int;
                          stackIn_104_3 = var4;
                          stackIn_104_4 = var6;
                          stackIn_104_5 = 125;
                          stackIn_105_6 = (var11 == uf.field_c) && (~vf.field_a == ~var12) && (param1);
                          var3_int = ((dl) (Object) stackIn_104_0).a(stackIn_104_1, stackIn_104_2, (gi[]) (stackIn_104_3), stackIn_104_4, (byte) stackIn_104_5, stackIn_105_6);
                        }
                        if (uf.field_c != var11) {
                          decompiledFrameCompleted3 = false;
                          break;
                        }
                        if (~vf.field_a != ~var12) {
                          decompiledFrameCompleted2 = false;
                          break;
                        }
                        if (!param1) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        var13Lifetime2 = 0;
                        while (!(eg.field_p < var13Lifetime2)) {
                          var14Lifetime2 = this.a(-124, vf.field_a, var13Lifetime2, uf.field_c);
                          stackIn_89_0Lifetime2 = var14Lifetime2;
                          if (stackIn_89_0Lifetime2 != null) {
                            var15Lifetime2 = hb.field_p[0];
                            if (null != var14Lifetime2.field_h &&
                              ~var13Lifetime2 == ~eg.field_p) {
                              if (null != var14Lifetime2.field_h.field_Z) {
                                var15Lifetime2 = hb.field_p[2];
                              } else {
                                if (var14Lifetime2.field_h.field_C == 1) {
                                  if (var14Lifetime2.field_h.field_k) {
                                    var15Lifetime2 = hb.field_p[1];
                                  }
                                } else {
                                  var15Lifetime2 = null;
                                }
                              }
                            }
                            if (this.field_i != null &&
                              this.field_i.field_L != 0 &&
                              eg.field_p == var13Lifetime2) {
                              var15Lifetime2 = hb.field_p[1];
                            }
                            if (hb.field_p[1] == var15Lifetime2) {
                              ve.a((ci) (var15Lifetime2), -5353, var6 + 144 * var13Lifetime2, var6 - var13Lifetime2 * 48, -24 + var5);
                            }
                          } else {
                            var15Lifetime2 = hb.field_p[0];
                            if (null != this.field_i &&
                              this.field_i.field_L != 0 &&
                              var13Lifetime2 == eg.field_p) {
                              var15Lifetime2 = hb.field_p[1];
                            }
                            if (hb.field_p[1] == var15Lifetime2) {
                              ve.a((ci) (var15Lifetime2), -5353, var6 + 144 * var13Lifetime2, var6 - 48 * var13Lifetime2, var5 - 24);
                            }
                            var16Lifetime2 = null;
                            if (!param1) {
                              u.field_a.a();
                              l.f(0, 0, 128, 160, 0);
                              k.field_f.a(0);
                            } else {
                              var16Lifetime2 = oi.field_J;
                              ((ci) (var16Lifetime2)).a();
                              l.f(0, 0, 128, 160, 0);
                            }
                            if (null != var16Lifetime2) {
                              ((ci) (var16Lifetime2)).a();
                              l.a(32, 124, 16777215);
                              l.a(64, 108, 16777215);
                              l.a(64, 139, 16777215);
                              l.a(95, 124, 16777215);
                              k.field_f.a(0);
                              u.field_a.a();
                              ((ci) (var16Lifetime2)).d(0, 0);
                              if (this.field_i != null &&
                                0 < this.field_i.field_L) {
                                c.a((byte) -86, u.field_a, 16777215);
                                c.a((byte) -86, u.field_a, 16744576);
                                c.a((byte) -86, u.field_a, 16728128);
                                c.a((byte) -86, u.field_a, 8388608);
                                c.a((byte) -86, u.field_a, 4194304);
                              } else {
                                c.a((byte) -86, u.field_a, 16777215);
                                c.a((byte) -86, u.field_a, 8454016);
                                c.a((byte) -86, u.field_a, 4259648);
                                c.a((byte) -86, u.field_a, 32768);
                                c.a((byte) -86, u.field_a, 16384);
                              }
                              ((ci) (var16Lifetime2)).b(0, 0, 0);
                              k.field_f.a(0);
                              ug.field_b = -64 + var5;
                              hb.field_n = -(48 * eg.field_p) + (-124 + var6);
                              ((ci) (var16Lifetime2)).b(-64 + var5, -124 + var6);
                            }
                          }
                          var13Lifetime2++;
                        }
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                  if ((decompiledFrameCompleted7) &&
                    (decompiledFrameCompleted6) &&
                    (decompiledFrameCompleted5) &&
                    (decompiledFrameCompleted4) &&
                    (decompiledFrameCompleted3) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0)) {
                    while (uf.field_c == var11) {
                      if (~vf.field_a != ~var12) {
                        break;
                      }
                      if (!param1) {
                        break;
                      }
                      var13Lifetime1 = 0;
                      while (!(eg.field_p < var13Lifetime1)) {
                        var14Lifetime1 = this.a(-124, vf.field_a, var13Lifetime1, uf.field_c);
                        stackIn_89_0Lifetime1 = var14Lifetime1;
                        if (stackIn_89_0Lifetime1 != null) {
                          var15Lifetime1 = hb.field_p[0];
                          if (null != var14Lifetime1.field_h &&
                            ~var13Lifetime1 == ~eg.field_p) {
                            if (null != var14Lifetime1.field_h.field_Z) {
                              var15Lifetime1 = hb.field_p[2];
                            } else {
                              if (var14Lifetime1.field_h.field_C == 1) {
                                if (var14Lifetime1.field_h.field_k) {
                                  var15Lifetime1 = hb.field_p[1];
                                }
                              } else {
                                var15Lifetime1 = null;
                              }
                            }
                          }
                          if (this.field_i != null &&
                            this.field_i.field_L != 0 &&
                            eg.field_p == var13Lifetime1) {
                            var15Lifetime1 = hb.field_p[1];
                          }
                          if (hb.field_p[1] == var15Lifetime1) {
                            ve.a((ci) (var15Lifetime1), -5353, var6 + 144 * var13Lifetime1, var6 - var13Lifetime1 * 48, -24 + var5);
                          }
                        } else {
                          var15Lifetime1 = hb.field_p[0];
                          if (null != this.field_i &&
                            this.field_i.field_L != 0 &&
                            var13Lifetime1 == eg.field_p) {
                            var15Lifetime1 = hb.field_p[1];
                          }
                          if (hb.field_p[1] == var15Lifetime1) {
                            ve.a((ci) (var15Lifetime1), -5353, var6 + 144 * var13Lifetime1, var6 - 48 * var13Lifetime1, var5 - 24);
                          }
                          var16Lifetime1 = null;
                          if (!param1) {
                            u.field_a.a();
                            l.f(0, 0, 128, 160, 0);
                            k.field_f.a(0);
                          } else {
                            var16Lifetime1 = oi.field_J;
                            ((ci) (var16Lifetime1)).a();
                            l.f(0, 0, 128, 160, 0);
                          }
                          if (null != var16Lifetime1) {
                            ((ci) (var16Lifetime1)).a();
                            l.a(32, 124, 16777215);
                            l.a(64, 108, 16777215);
                            l.a(64, 139, 16777215);
                            l.a(95, 124, 16777215);
                            k.field_f.a(0);
                            u.field_a.a();
                            ((ci) (var16Lifetime1)).d(0, 0);
                            if (this.field_i != null &&
                              0 < this.field_i.field_L) {
                              c.a((byte) -86, u.field_a, 16777215);
                              c.a((byte) -86, u.field_a, 16744576);
                              c.a((byte) -86, u.field_a, 16728128);
                              c.a((byte) -86, u.field_a, 8388608);
                              c.a((byte) -86, u.field_a, 4194304);
                            } else {
                              c.a((byte) -86, u.field_a, 16777215);
                              c.a((byte) -86, u.field_a, 8454016);
                              c.a((byte) -86, u.field_a, 4259648);
                              c.a((byte) -86, u.field_a, 32768);
                              c.a((byte) -86, u.field_a, 16384);
                            }
                            ((ci) (var16Lifetime1)).b(0, 0, 0);
                            k.field_f.a(0);
                            ug.field_b = -64 + var5;
                            hb.field_n = -(48 * eg.field_p) + (-124 + var6);
                            ((ci) (var16Lifetime1)).b(-64 + var5, -124 + var6);
                          }
                        }
                        var13Lifetime1++;
                      }
                      break;
                    }
                  }
                }
                var12++;
              }
              var5 = var5 + (1 - var9 + var10 << 5);
              stackIn_184_0Lifetime1 = var6;
              stackIn_184_1Lifetime1 = 1 + (-var9 + var10) << 4;
              var6 = stackIn_184_0Lifetime1 - stackIn_184_1Lifetime1;
              var11++;
              continue L4;
            }
            if (null != u.field_a) {
              u.field_a.b(ug.field_b, hb.field_n);
            }
            stackIn_189_0 = param0 ? 1 : 0;
            break;
          }
          if (stackIn_189_0 != 0) {
            this.a(true, 75, 67, -64, 52, 26, 57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "dk.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_265_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        r var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dl var20 = null;
        int var21 = 0;
        int var22 = 0;
        dl var22_ref_dl = null;
        int var23 = 0;
        int var24 = 0;
        r var16Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var16_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var22Lifetime1;
        int var23Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var7Lifetime1Lifetime3;
        var24 = Terraphoenix.field_V;
        try {
          var4_int = param0 - 5 * (this.field_b - 64) / 2;
          var5 = param2 - 5 * (this.field_e - 64) / 2;
          l.e(-3 + var4_int, -3 + var5, 6 + this.field_b * 5, 5 * this.field_e + 6, 10066329);
          l.e(-2 + var4_int, -2 + var5, 4 + 5 * this.field_b, 5 * this.field_e + 4, 0);
          l.e(-1 + var4_int, var5 - 1, 2 + this.field_b * 5, 2 + 5 * this.field_e, 6645093);
          l.f(var4_int, var5, this.field_b * 5, this.field_e * 5, 0);
          vf.field_a = -1;
          uf.field_c = -1;
          var8 = 5597743;
          var9 = 6473014;
          var10 = 11067278;
          var11 = 6698029;
          var12 = 8742972;
          var13 = 12030304;
          var14 = 10066329;
          var15 = 6645093;
          if (param2 == 50) {
            var7 = 70;
            var6 = 400;
            l.e(var6 - 13, 47, 176, 326, 10066329);
            l.e(var6 - 12, 48, 174, 324, 0);
            l.e(-11 + var6, 49, 172, 322, 6645093);
            l.f(-10 + var6, 50, 170, 320, 0);
            var16_int = 20;
            og.field_f.b(vb.field_e, var6, var7, 16777215, -1);
            og.field_f.b(vb.field_e, 1 + var6, var7, 16777215, -1);
            var7 = var7 + (6 + var16_int);
            og.field_f.b(kj.field_a, var6, var7, 16777215, -1);
            var7 = var7 + (var16_int + 6);
            l.f(var6, var7 - 11, 12, 12, var8);
            og.field_f.b(cm.field_e, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, var7 - 11, 12, 12, var9);
            og.field_f.b(gh.field_L, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, var7 - 11, 12, 12, var10);
            og.field_f.b(ab.field_c, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            var7 += 6;
            og.field_f.b(mm.field_g, var6, var7, 16777215, -1);
            var7 = var7 + (var16_int + 6);
            l.f(var6, var7 - 11, 12, 12, var11);
            og.field_f.b(bm.field_c, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, var7 - 11, 12, 12, var12);
            og.field_f.b(am.field_H, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, -11 + var7, 12, 12, var13);
            og.field_f.b(cg.field_I, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, var7 - 11, 12, 12, var15);
            og.field_f.b(vh.field_h, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, -11 + var7, 12, 12, var14);
            og.field_f.b(gh.field_O, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            l.f(var6, -11 + var7, 12, 12, 16777215);
            og.field_f.b(rj.field_b, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            rh.field_b[0].f(-2 + var6, -13 + var7);
            og.field_f.b(hm.field_H, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
            rh.field_b[6].f(-2 + var6, -13 + var7);
            og.field_f.b(f.field_h, var6, var7, 16777215, -1);
            var7 = var7 + var16_int;
          }
          if (param2 != 50) {
            eg.field_p = 5;
          }
          if (param1 != -122) {
            this.a(1, -41, -108, 47, (String) null);
          }
          var16_intLifetime1 = 0;
          while (true) {
            stackIn_13_0 = ~eg.field_p;
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_13_0 <= ~var16_intLifetime1) {
              var6Lifetime1 = 5 + var4_int;
              var7Lifetime1 = var5;
              stackIn_265_0 = 1;
              decompiledFrameRemainder2 = (var24 == 0);
              if (decompiledFrameRemainder2) {
                var17 = stackIn_265_0;
                while (-1 + this.field_b > var17) {
                  stackIn_13_0 = 1;
                  var18 = stackIn_13_0;
                  while (var18 < (this.field_e - 1)) {
                    var7Lifetime1 += 5;
                    var20 = this.a(120, var18, var16_intLifetime1, var17);
                    if (var20 != null) {
                      var19 = 0;
                      var21 = 0;
                      if (var20.field_b > -1) {
                        var19 = var8;
                        if (1 == var16_intLifetime1) {
                          var19 = ((16711422 & var8) + (var9 & 16711422)) / 2;
                        }
                        if (var16_intLifetime1 == 2) {
                          var19 = var9;
                        }
                        if (var16_intLifetime1 == 3) {
                          var19 = ((var9 & 16711422) + (16711422 & var10)) / 2;
                        }
                        if (var16_intLifetime1 >= 4) {
                          var19 = var10;
                        }
                        if (param2 != 50) {
                          if (var20.field_b != -1) {
                            if (this.field_a == 2) {
                              var22 = this.field_b / 4;
                              if (this.field_i.field_G.field_Bb == 11) {
                                var22 = 1 + this.field_b / 8;
                              }
                              if (var17 < -var22 + this.field_b / 2 ||
                                this.field_b / 2 + var22 < var17 ||
                                -var22 + this.field_e / 2 > var18 ||
                                var18 > (var22 + this.field_e / 2)) {
                                var21 = 1;
                              }
                              if (var18 < 3 + this.field_e / 2 - var22 &&
                                this.field_b / 2 - 1 <= var17 &&
                                var17 <= 1 + this.field_b / 2) {
                                var21 = 1;
                              }
                            }
                            if (this.field_a == 3 &&
                              this.field_b / 8 < var17 &&
                              var17 < this.field_b * 7 / 8 &&
                              var18 > this.field_e / 8 &&
                              (7 * this.field_e / 8) > var18) {
                              var21 = 1;
                            }
                            if ((this.field_a == 4 ||
                              this.field_a == 1) &&
                              (var20.field_b == 4 ||
                              5 == var20.field_b)) {
                              var21 = 1;
                            }
                          }
                          if (this.field_i.field_h.field_f[var17][var18].field_v >= 3) {
                            var21 = 1;
                          }
                          var22_ref_dl = var20;
                          while (true) {
                            if (null != var22_ref_dl.field_c) {
                              var22_ref_dl = var22_ref_dl.field_c;
                              continue;
                            }
                            if (!var22_ref_dl.field_d) {
                              break;
                            }
                            var21 = 1;
                            break;
                          }
                        }
                      }
                      if (var20.field_v == 1) {
                        var19 = var13;
                      }
                      if (var20.field_v == 2) {
                        var19 = var12;
                      }
                      if (var20.field_v == 3) {
                        var19 = var11;
                      }
                      if (var20.field_d ||
                        var20.field_j >= 18 &&
                        34 >= var20.field_j ||
                        5 == var20.field_b) {
                        var19 = var19 & 16711935;
                      }
                      if (eg.field_p == var16_intLifetime1) {
                        if (var20.field_v == 4) {
                          var19 = 16777215;
                        }
                        if (var20.field_v == 5) {
                          var19 = 16777214;
                        }
                        if (null != var20.field_C &&
                          var20.field_C.field_v == 5) {
                          var19 = 16777215;
                        }
                        if (null != var20.field_c &&
                          var20.field_c.field_v == 4) {
                          var19 = 16777214;
                        }
                      }
                      if (!var20.field_a &&
                        var20.field_d) {
                        var19 = 65793;
                      }
                      if (var20.field_p > 0) {
                        var19 = 4 * var20.field_p;
                      }
                      var22Lifetime1 = var20.field_w ? 1 : 0;
                      if (1 == this.field_m &&
                        var16_intLifetime1 == 0 &&
                        !var20.field_d && (!(Math.abs(-(this.field_b / 2) + var17) < -5 + this.field_b / 2) ||
                        !(Math.abs(-(this.field_e / 2) + var18) < (-5 + this.field_e / 2)))) {
                        var22Lifetime1 = 1;
                      }
                      if (this.field_m == 2 &&
                        var16_intLifetime1 == 0 && (!(Math.abs(-(this.field_b / 2) + var17) < -5 + this.field_b / 2) ||
                        !(Math.abs(-(this.field_e / 2) + var18) < this.field_e / 2 - 5))) {
                        var22Lifetime1 = 1;
                      }
                      if (this.field_m == 3 &&
                        1 == var16_intLifetime1 &&
                        12 > var17 &&
                        var18 < 12) {
                        var22Lifetime1 = 1;
                      }
                      if (this.field_m == 4 &&
                        var16_intLifetime1 == 2 &&
                        var20.field_b != 5) {
                        var22Lifetime1 = 1;
                      }
                      if (var22Lifetime1 != 0) {
                        var19 = (int)(128.0 + 64.0 * Math.sin((double)(-var18) + (mm.field_f * 2.0 + (double)var17))) * 65793;
                      }
                      if (var19 != 0) {
                        l.f(var6Lifetime1, var7Lifetime1, 5, 5, var19);
                        if (var19 == 16777215) {
                          l.c(var6Lifetime1, var7Lifetime1 + 2, var6Lifetime1 + 2, var7Lifetime1, 0);
                          l.c(var6Lifetime1, 3 + var7Lifetime1, var6Lifetime1 + 2, var7Lifetime1 + 1, 0);
                          l.c(4 + var6Lifetime1, 2 + var7Lifetime1, var6Lifetime1 + 2, var7Lifetime1, 0);
                          l.c(4 + var6Lifetime1, var7Lifetime1 + 3, var6Lifetime1 + 2, var7Lifetime1 + 1, 0);
                        }
                        if (var19 == 16777214) {
                          l.c(var6Lifetime1, var7Lifetime1 + 1, var6Lifetime1 + 2, var7Lifetime1 + 3, 0);
                          l.c(var6Lifetime1, var7Lifetime1, var6Lifetime1 + 2, 2 + var7Lifetime1, 0);
                          l.c(var6Lifetime1 + 4, 1 + var7Lifetime1, var6Lifetime1 + 2, var7Lifetime1 + 3, 0);
                          l.c(var6Lifetime1 + 4, var7Lifetime1, var6Lifetime1 + 2, var7Lifetime1 + 2, 0);
                        }
                        l.f(var6Lifetime1 + 4, var7Lifetime1, 5, 2236962);
                        l.b(var6Lifetime1, 4 + var7Lifetime1, 4, 2236962);
                      }
                      if (var21 != 0) {
                        l.c(var6Lifetime1, var7Lifetime1, -1 + (5 + var6Lifetime1), -1 + (var7Lifetime1 + 5), 16711680);
                        l.c(var6Lifetime1, 1 + var7Lifetime1, 5 + var6Lifetime1 - 2, 5 + var7Lifetime1 - 1, 16711680);
                        l.c(5 + (var6Lifetime1 - 1), var7Lifetime1, -1 + (var6Lifetime1 + 5), var7Lifetime1, 16711680);
                      }
                      if (var6Lifetime1 <= this.field_i.field_y &&
                        this.field_i.field_y < (5 + var6Lifetime1) &&
                        var7Lifetime1 <= this.field_i.field_j &&
                        5 + var7Lifetime1 > this.field_i.field_j) {
                        uf.field_c = var17;
                        vf.field_a = var18;
                      }
                      if (var20.field_a ||
                        !var20.field_d) {
                        if (4 == (var20.field_i & 4)) {
                          l.g(var6Lifetime1 + 4, var7Lifetime1, 5, 16776960);
                        }
                        if ((var20.field_i & 8) == 8) {
                          l.d(var6Lifetime1, 4 + var7Lifetime1, 5, 16776960);
                        }
                        if (-1 != var20.field_g) {
                          var23 = var15;
                          if ((var20.field_e & 1) == 1) {
                            var23 = var14;
                          }
                          if ((var20.field_i & 1) == 1) {
                            var23 = 16776960;
                          }
                          l.g(var6Lifetime1, var7Lifetime1, 5, var23);
                          l.g(-1 + var6Lifetime1, var7Lifetime1, 5, var23);
                        }
                        if (-1 != var20.field_k) {
                          var23Lifetime1 = var15;
                          if ((var20.field_e & 2) == 2) {
                            var23Lifetime1 = var14;
                          }
                          if ((2 & var20.field_i) == 2) {
                            var23Lifetime1 = 16776960;
                          }
                          l.d(var6Lifetime1, var7Lifetime1 - 1, 5, var23Lifetime1);
                          l.d(var6Lifetime1, var7Lifetime1, 5, var23Lifetime1);
                        }
                      }
                    }
                    var18++;
                  }
                  var6Lifetime1 += 5;
                  var7Lifetime1 = var7Lifetime1 - 5 * (this.field_e - 2);
                  var17++;
                }
                var16_intLifetime1++;
                continue;
              }
            }
            if (decompiledFrameRemainder2) {
              stackIn_265_0 = 50;
            }
            if (stackIn_265_0 != param2) {
              eg.field_p = 0;
            }
            if (param2 == 50) {
              var7Lifetime1Lifetime1 = -(sj.field_b * 5 / 64) + var5 + 5 * lg.field_c / 32;
              var6Lifetime1Lifetime1 = sj.field_b * 5 / 64 + (var4_int + 5 * lg.field_c / 32);
              var16_intLifetime1 = 48;
              l.c(var4_int, var5, var4_int + 5 * this.field_b, this.field_e * 5 + var5);
              l.c(-var16_intLifetime1 + (2 + var6Lifetime1Lifetime1), 2 + var7Lifetime1Lifetime1, 2 + var6Lifetime1Lifetime1, -var16_intLifetime1 + var7Lifetime1Lifetime1 + 2, 16777215);
              l.c(var6Lifetime1Lifetime1 + 2, 2 + (var7Lifetime1Lifetime1 - var16_intLifetime1), var16_intLifetime1 + (var6Lifetime1Lifetime1 + 2), 2 + var7Lifetime1Lifetime1, 16777215);
              l.c(var6Lifetime1Lifetime1 + (2 + var16_intLifetime1), var7Lifetime1Lifetime1 + 2, var6Lifetime1Lifetime1 + 2, 2 + var7Lifetime1Lifetime1 + var16_intLifetime1, 16777215);
              l.c(2 + var6Lifetime1Lifetime1, var16_intLifetime1 + var7Lifetime1Lifetime1 + 2, var6Lifetime1Lifetime1 + 2 - var16_intLifetime1, var7Lifetime1Lifetime1 + 2, 16777215);
              l.c();
            }
            var16_intLifetime1 = 0;
            while (true) {
              if (this.field_i.field_F.length > var16_intLifetime1) {
                if (var24 == 0) {
                  if (null != this.field_i.field_F[var16_intLifetime1]) {
                    var7Lifetime1Lifetime2 = (int)(2.0 + (this.field_i.field_F[var16_intLifetime1].field_p / 10.0 + (double)(var5 + 5 * this.field_i.field_F[var16_intLifetime1].field_m)));
                    var6Lifetime1Lifetime2 = (int)(2.0 + (this.field_i.field_F[var16_intLifetime1].field_y / 10.0 + (double)(5 * this.field_i.field_F[var16_intLifetime1].field_c + var4_int)));
                    var17Lifetime1 = 16776960;
                    if (~eg.field_p != ~this.field_i.field_F[var16_intLifetime1].field_x) {
                      var17Lifetime1 = 14540032;
                    }
                    l.f(-1 + var6Lifetime1Lifetime2, -1 + var7Lifetime1Lifetime2, 2, 2, var17Lifetime1);
                  }
                  var16_intLifetime1++;
                  continue;
                }
              } else {
                if (50 != param2) {
                  var17Lifetime1 = 0;
                  while (100 > var17Lifetime1) {
                    var16 = this.field_i.field_C[var17Lifetime1];
                    if (var24 != 0) {
                      return;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (null != var16 &&
                      var16.field_P > 0 &&
                      eg.field_p >= var16.field_E) {
                      var6Lifetime1Lifetime2 = var4_int + var16.field_F * 5;
                      var7Lifetime1Lifetime2 = var5 + var16.field_H * 5;
                      if (var16.field_Z != null ||
                        var16.field_k ||
                        var16.field_s) {
                        if (var16.field_C == 0 &&
                          null == var16.field_Z) {
                          rh.field_b[6].c(-2 + var6Lifetime1Lifetime2, -2 + var7Lifetime1Lifetime2);
                        }
                        if (var16.field_Z != null &&
                          var16.field_c != null &&
                          var16 == var16.field_c.field_h) {
                          rh.field_b[0].c(-2 + var6Lifetime1Lifetime2, -2 + var7Lifetime1Lifetime2);
                          if (var16 == this.field_i.field_q) {
                            rh.field_b[0].f(var6Lifetime1Lifetime2 - 6, var7Lifetime1Lifetime2 - 6);
                          }
                        }
                        if ((var16.field_C == 1)) {
                          if (var16.field_t != 0) {
                            if (var16.field_t != 9) {
                              rh.field_b[2].c(var6Lifetime1Lifetime2 - 2, -2 + var7Lifetime1Lifetime2);
                            } else {
                              rh.field_b[12].c(var6Lifetime1Lifetime2 - 2, -2 + var7Lifetime1Lifetime2);
                            }
                          } else {
                            rh.field_b[1].c(var6Lifetime1Lifetime2 - 2, -2 + var7Lifetime1Lifetime2);
                          }
                          if (((null != this.field_i.field_q)) &&
                            (!(!this.field_i.field_h.a((byte) -93, this.field_i.field_q, var16)))) {
                            l.a(2 + var6Lifetime1Lifetime2, var7Lifetime1Lifetime2 + 2, 4, 16711680);
                            l.a(var6Lifetime1Lifetime2 + 2, 2 + var7Lifetime1Lifetime2, 5, 8388608);
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var16.field_h) {
                          var7Lifetime1Lifetime2 = var5 + 5 * var16.field_gb;
                          var6Lifetime1Lifetime2 = 5 * var16.field_i + var4_int;
                          if (var16.field_C == 0) {
                            rh.field_b[6].c(-2 + var6Lifetime1Lifetime2, var7Lifetime1Lifetime2 - 2);
                          }
                          if (1 == var16.field_C) {
                            rh.field_b[3].c(var6Lifetime1Lifetime2 - 2, var7Lifetime1Lifetime2 - 2);
                          }
                        }
                      }
                    }
                    var17Lifetime1++;
                  }
                  return;
                }
              }
              break;
            }
            var17Lifetime2 = 0;
            while (var17Lifetime2 < 100) {
              var16Lifetime1 = this.field_i.field_C[var17Lifetime2];
              if (var24 != 0) {
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              if (null != var16Lifetime1 &&
                var16Lifetime1.field_P > 0 &&
                eg.field_p >= var16Lifetime1.field_E) {
                var7Lifetime1Lifetime3 = var16Lifetime1.field_H * 5 + var5;
                var6Lifetime1Lifetime3 = var4_int + var16Lifetime1.field_F * 5;
                if (null != var16Lifetime1.field_Z ||
                  var16Lifetime1.field_k ||
                  var16Lifetime1.field_s) {
                  if (var16Lifetime1.field_C == 0 &&
                    var16Lifetime1.field_Z == null) {
                    rh.field_b[6].c(-2 + var6Lifetime1Lifetime3, var7Lifetime1Lifetime3 - 2);
                  }
                  if (null != var16Lifetime1.field_Z) {
                    rh.field_b[0].c(-2 + var6Lifetime1Lifetime3, var7Lifetime1Lifetime3 - 2);
                    if (this.field_i.field_q == var16Lifetime1) {
                      rh.field_b[0].f(var6Lifetime1Lifetime3 - 6, -6 + var7Lifetime1Lifetime3);
                    }
                  }
                  if ((var16Lifetime1.field_C == 1)) {
                    if (var16Lifetime1.field_t != 0) {
                      if (var16Lifetime1.field_t == 9) {
                        rh.field_b[12].c(-2 + var6Lifetime1Lifetime3, var7Lifetime1Lifetime3 - 2);
                      } else {
                        rh.field_b[2].c(var6Lifetime1Lifetime3 - 2, var7Lifetime1Lifetime3 - 2);
                      }
                    } else {
                      rh.field_b[1].c(-2 + var6Lifetime1Lifetime3, -2 + var7Lifetime1Lifetime3);
                    }
                    if (((null != this.field_i.field_q)) &&
                      (!(!this.field_i.field_h.a((byte) -93, this.field_i.field_q, var16Lifetime1)))) {
                      l.a(2 + var6Lifetime1Lifetime3, 2 + var7Lifetime1Lifetime3, 4, 16711680);
                      l.a(2 + var6Lifetime1Lifetime3, var7Lifetime1Lifetime3 + 2, 5, 8388608);
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (var16Lifetime1.field_h) {
                    var6Lifetime1Lifetime3 = var4_int + 5 * var16Lifetime1.field_i;
                    var7Lifetime1Lifetime3 = var16Lifetime1.field_gb * 5 + var5;
                    if (var16Lifetime1.field_C == 0) {
                      rh.field_b[6].c(-2 + var6Lifetime1Lifetime3, var7Lifetime1Lifetime3 - 2);
                    }
                    if (1 == var16Lifetime1.field_C) {
                      rh.field_b[3].c(var6Lifetime1Lifetime3 - 2, -2 + var7Lifetime1Lifetime3);
                    }
                  }
                }
              }
              var17Lifetime2++;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var4), "dk.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    dk(byte[] param0) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_k = 0;
        try {
          var2_int = 0;
          incrementValue$4 = var2_int;
          var2_int++;
          this.field_b = param0[incrementValue$4];
          incrementValue$5 = var2_int;
          var2_int++;
          this.field_e = param0[incrementValue$5];
          this.field_f = new dl[this.field_b][this.field_e];
          this.a(0, (byte) 104, 0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("dk.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    dk(e param0) {
        int stackIn_74_1 = 0;
        int stackIn_82_1 = 0;
        int stackIn_96_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_279_0 = 0;
        int stackIn_279_1 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_328_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_357_0 = 0;
        int stackIn_357_1 = 0;
        int stackIn_368_0 = 0;
        int stackIn_376_0 = 0;
        int stackIn_376_1 = 0;
        int stackIn_387_0 = 0;
        int stackIn_405_0 = 0;
        int stackIn_434_0 = 0;
        int stackIn_478_0 = 0;
        int stackIn_478_1 = 0;
        int stackIn_539_0 = 0;
        int stackIn_548_0 = 0;
        int stackIn_548_1 = 0;
        int stackIn_563_0 = 0;
        int stackIn_563_1 = 0;
        int stackIn_571_0 = 0;
        int stackIn_571_1 = 0;
        RuntimeException stackIn_585_0 = null;
        StringBuilder stackIn_585_1 = null;
        String stackIn_586_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10_ref_byte__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = Terraphoenix.field_V;
        this.field_k = 0;
        try {
          L0: {
            this.field_m = 0;
            this.field_i = param0;
            sj.field_b = 0;
            lg.field_c = 0;
            eh.field_m = false;
            jh.field_n = 0;
            var2_int = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            if (param0.field_G.field_db) {
              this.field_b = 64;
              this.field_e = 64;
              this.field_a = 3;
              var2_int = 4;
              var5 = 1;
              if (!mb.b(0, 77)) {
                break L0;
              }
              this.field_a = 2;
              if (var22 == 0) {
                break L0;
              }
            }
            var6 = param0.field_G.field_Bb;
            switch ((var22 == 0
              || var6 == 1
              || var6 == 3
              || var6 == 5
              || var6 == 7
              || var6 == 9
              || var6 == 10
              || var6 == 11
              || var6 == 12
              || var6 == 13
              ) ? var6 : -1) {
              case 0:
                this.field_k = 1;
                this.field_a = 0;
                this.field_b = 40;
                this.field_e = 40;
                if (var22 == 0) {
                  break L0;
                }
              case 1:
                this.field_k = 2;
                this.field_e = 64;
                this.field_b = 64;
                this.field_a = 2;
                if (var22 == 0) {
                  break L0;
                }
              case 2:
                var2_int = 4;
                this.field_k = 3;
                this.field_a = 3;
                this.field_e = 64;
                this.field_b = 64;
                if (var22 == 0) {
                  break L0;
                }
              case 3:
                this.field_b = 64;
                this.field_a = 3;
                this.field_e = 64;
                if (param0.field_G.field_ub == 1) {
                  stackIn_74_1 = 4;
                } else {
                  stackIn_74_1 = 5;
                }
                this.field_k = stackIn_74_1;
                var2_int = 4;
                if (var22 == 0) {
                  break L0;
                }
              case 4:
                var3 = 10;
                this.field_a = 3;
                var4 = 1;
                this.field_e = 64;
                this.field_b = 64;
                if (var22 == 0) {
                  break L0;
                }
              case 5:
                if (param0.field_G.field_ub != 1) {
                  stackIn_82_1 = 4;
                } else {
                  stackIn_82_1 = 5;
                }
                this.field_k = stackIn_82_1;
                this.field_a = 2;
                var4 = 1;
                this.field_b = 64;
                this.field_e = 64;
                if (var22 == 0) {
                  break L0;
                }
              case 6:
                var4 = 2;
                this.field_a = 1;
                var3 = 15;
                this.field_b = 64;
                this.field_e = 64;
                if (var22 == 0) {
                  break L0;
                }
              case 7:
                this.field_a = 2;
                this.field_k = 3;
                this.field_e = 64;
                this.field_b = 64;
                var4 = 2;
                if (var22 == 0) {
                  break L0;
                }
              case 8:
                this.field_b = 64;
                this.field_e = 64;
                if (param0.field_G.field_vb != 1) {
                  this.field_a = 1;
                  var4 = 3;
                  if (var22 == 0) {
                    break L0;
                  }
                }
                this.field_k = 6;
                this.field_b = 62;
                this.field_e = 62;
                this.field_a = 4;
                if (var22 == 0) {
                  break L0;
                }
              case 9:
                var4 = 4;
                this.field_b = 64;
                this.field_a = 2;
                if (1 == param0.field_G.field_ub) {
                  stackIn_96_1 = 4;
                } else {
                  stackIn_96_1 = 5;
                }
                this.field_k = stackIn_96_1;
                this.field_e = 64;
                if (var22 == 0) {
                  break L0;
                }
              case 10:
                this.field_b = 64;
                this.field_e = 64;
                if (param0.field_G.field_vb != 1) {
                  this.field_k = 6;
                  this.field_e = 62;
                  this.field_a = 1;
                  this.field_b = 62;
                  if (var22 == 0) {
                    break L0;
                  }
                }
                this.field_a = 4;
                var4 = 3;
                if (var22 == 0) {
                  break L0;
                }
              case 11:
                this.field_e = 64;
                this.field_k = 7;
                this.field_b = 64;
                this.field_a = 2;
                if (var22 == 0) {
                  break L0;
                }
              case 12:
                this.field_b = 38;
                this.field_e = 38;
                this.field_k = 8;
                this.field_a = 4;
                if (var22 == 0) {
                  break L0;
                }
              case 13:
                break;
              default:
                break L0;
            }
            this.field_k = 9;
            this.field_e = 62;
            this.field_a = 0;
            this.field_b = 62;
          }
          this.field_d = new int[this.field_b][this.field_e];
          this.field_g = new int[this.field_b][this.field_e];
          this.field_f = new dl[this.field_b][this.field_e];
          var6 = 0;
          L26: while (true) {
            if (var6 < this.field_b) {
              stackIn_124_0 = 0;
              if (var22 != 0) {
                break L26;
              }
              var7 = stackIn_124_0;
              while (var7 < this.field_e) {
                this.field_f[var6][var7] = new dl(var6, var7, 0, this);
                var7++;
              }
              var6++;
              continue;
            }
            stackIn_124_0 = 0;
            break;
          }
          if (stackIn_124_0 != this.field_k ||
            var4 != 0) {
            L33: {
              if (this.field_k == 6 ||
                9 == this.field_k) {
                var6 = (int)(Math.random() * 3.0) - 1;
                var7 = -1 + (int)(3.0 * Math.random());
                var8 = (int)(Math.random() * 5.0) - 2;
                var9 = -2 + (int)(Math.random() * 5.0);
                if (var6 == var8 &&
                  var7 == var9) {
                  var9--;
                }
                if (Math.abs(var8) == 2 &&
                  Math.abs(var9) == 2) {
                  if (100.0 * Math.random() < 50.0) {
                    var8 = 0;
                    if (var22 != 0) {
                      var9 = 0;
                    }
                  } else {
                    var9 = 0;
                  }
                }
                if (this.field_k == 9) {
                  var6 = -1;
                  var9 = 1;
                  var8 = 1;
                  var7 = -1;
                }
                if (Math.abs(var6) == 2 &&
                  Math.abs(var7) == 2) {
                  var6 = 0;
                }
                var13 = -2;
                L34: while (true) {
                  stackIn_161_0 = var13;
                  stackIn_161_1 = 2;
                  if (stackIn_161_0 <= stackIn_161_1) {
                    stackIn_257_0 = -2;
                    if (var22 == 0) {
                      var14 = stackIn_257_0;
                      while (var14 <= 2) {
                        var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                        var15 = (int)(6.0 * Math.random());
                        stackIn_161_0 = -2;
                        stackIn_161_1 = ~var15;
                        if (stackIn_161_0 == stackIn_161_1) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                        }
                        if (var15 == 2) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                        }
                        if (var15 == 3) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                        }
                        if (var15 == 4) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                        }
                        if (var15 == 5) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                        }
                        if (~var6 == ~var13 &&
                          ~var14 == ~var7 &&
                          6 == this.field_k) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-CommandCenter", true)];
                        }
                        if (~var13 == ~var8 &&
                          ~var14 == ~var9) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                        }
                        if (~var13 == ~var6 &&
                          ~var14 == ~var7 &&
                          this.field_k == 9) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Reactor", true)];
                        }
                        if (var13 == 2 &&
                          var14 == 2 &&
                          this.field_k == 9) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Hangerdoor", true)];
                        }
                        if (var13 == 2 &&
                          var14 == 2 &&
                          this.field_k == 6) {
                          var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                        }
                        var11 = this.field_b / 2 + 12 * var13;
                        var12 = this.field_b / 2 + var14 * 12;
                        if (9 != this.field_k ||
                          (var13 != 0 ||
                          var14 != 0) &&
                          (var13 != 0 ||
                          -1 != var14) &&
                          (var13 != -1 ||
                          var14 != 0)) {
                          if (9 == this.field_k &&
                            var6 == var13 &&
                            var7 == var14) {
                            var11 = var11 + var10_ref_byte__[0] / 4;
                            var12 = var12 + var10_ref_byte__[1] / 4;
                          }
                          this.a(-(var10_ref_byte__[0] / 2) + var11, (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                        }
                        var14++;
                      }
                      var13++;
                      continue;
                    }
                  } else {
                    stackIn_257_0 = 0;
                  }
                  var13 = stackIn_257_0;
                  while (var13 < this.field_b) {
                    stackIn_268_0 = 34;
                    stackIn_268_1 = this.field_f[var13][1].field_j;
                    if (var22 != 0) {
                      if (stackIn_268_0 < stackIn_268_1) {
                        stackIn_279_0 = -35;
                        stackIn_279_1 = ~this.field_f[1][var13].field_j;
                        break L33;
                      }
                      break L34;
                    }
                    if (stackIn_268_0 != stackIn_268_1) {
                      this.field_f[var13][2].field_k = -1;
                    }
                    var13++;
                  }
                  var13 = 0;
                  while (true) {
                    stackIn_268_0 = var13;
                    stackIn_268_1 = this.field_e;
                    if (stackIn_268_0 >= stackIn_268_1) {
                      break L34;
                    }
                    stackIn_279_0 = -35;
                    stackIn_279_1 = ~this.field_f[1][var13].field_j;
                    if (var22 != 0) {
                      break L33;
                    }
                    if (stackIn_279_0 != stackIn_279_1) {
                      this.field_f[2][var13].field_g = -1;
                    }
                    var13++;
                  }
                }
              }
              stackIn_279_0 = 8;
              stackIn_279_1 = this.field_k;
            }
            boolean decompiledFrameCompleted3 = true;
            if (stackIn_279_0 == stackIn_279_1) {
              var6 = (int)(Math.random() * 3.0) - 1;
              var7 = -var6;
              var8 = -1;
              var9 = -1;
              var13 = -1;
              while (true) {
                stackIn_282_0 = var13;
                stackIn_282_1 = 1;
                if (stackIn_282_0 > stackIn_282_1) {
                  break;
                }
                stackIn_328_0 = -1;
                if (var22 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
                var14 = stackIn_328_0;
                while (var14 <= 1) {
                  var10_ref_byte__ = of.field_k[wf.a("AB-Corridors", true)];
                  var15 = (int)(6.0 * Math.random());
                  stackIn_282_0 = ~var15;
                  stackIn_282_1 = -2;
                  if (stackIn_282_0 == stackIn_282_1) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room0", true)];
                  }
                  if (var15 == 2) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room1", true)];
                  }
                  if (3 == var15) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room2", true)];
                  }
                  if (4 == var15) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room3", true)];
                  }
                  if (var15 == 5) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Room4", true)];
                  }
                  if (var13 == var8 &&
                    ~var9 == ~var14) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Hanger", true)];
                  }
                  if (var13 == var6 &&
                    var7 == var14) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Entrance", true)];
                  }
                  if (var13 == 1 &&
                    var14 == 1) {
                    var10_ref_byte__ = of.field_k[wf.a("AB-Maindoor", true)];
                  }
                  if (8 == this.field_k &&
                    ~var13 == ~var8 &&
                    var9 == var14) {
                  }
                  var12 = var14 * 12 + this.field_b / 2;
                  var11 = var13 * 12 + this.field_b / 2;
                  this.a(var11 - var10_ref_byte__[0] / 2, (byte) 104, -(var10_ref_byte__[1] / 2) + var12, var10_ref_byte__);
                  var14++;
                }
                var13++;
              }
            }
            if (decompiledFrameCompleted3) {
              stackIn_328_0 = this.field_k;
            }
            if (stackIn_328_0 == 7) {
              var6_ref_byte__ = of.field_k[wf.a("MissileBase", true)];
              var7 = this.field_b / 2;
              var8 = this.field_e / 2;
              this.a(var7 - var6_ref_byte__[0] / 2, (byte) 104, -(var6_ref_byte__[1] / 2) + var8, var6_ref_byte__);
            }
            boolean decompiledFrameCompleted2 = true;
            if (var4 == 1 &&
              this.field_k == 0) {
              var6 = 0;
              while (true) {
                stackIn_340_0 = ~this.field_b;
                stackIn_340_1 = ~var6;
                if (stackIn_340_0 >= stackIn_340_1) {
                  break;
                }
                stackIn_351_0 = 0;
                if (var22 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                var7 = stackIn_351_0;
                while (this.field_e > var7) {
                  var8 = var6 - this.field_b / 2;
                  var9 = var7 - this.field_b / 2;
                  var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                  stackIn_340_0 = -5;
                  stackIn_340_1 = ~var10;
                  if (stackIn_340_0 < stackIn_340_1) {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                  }
                  var7++;
                }
                var6++;
              }
            }
            if (decompiledFrameCompleted2) {
              stackIn_351_0 = ~var4;
            }
            boolean decompiledFrameCompleted1 = true;
            if (stackIn_351_0 == -3 &&
              this.field_k == 0) {
              var6 = 0;
              while (true) {
                stackIn_357_0 = ~var6;
                stackIn_357_1 = ~this.field_b;
                if (stackIn_357_0 <= stackIn_357_1) {
                  break;
                }
                stackIn_368_0 = 0;
                if (var22 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                var7 = stackIn_368_0;
                while (var7 < this.field_e) {
                  var8 = var6 - this.field_b / 2;
                  var9 = -(this.field_b / 2) + var7;
                  var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
                  stackIn_357_0 = ~var10;
                  stackIn_357_1 = -8;
                  if (stackIn_357_0 > stackIn_357_1) {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                  }
                  var7++;
                }
                var6++;
              }
            }
            if (decompiledFrameCompleted1) {
              stackIn_368_0 = var4;
            }
            boolean decompiledFrameCompleted0 = true;
            if (stackIn_368_0 == 3 &&
              this.field_k == 0) {
              var6 = 0;
              while (true) {
                stackIn_376_0 = ~var6;
                stackIn_376_1 = ~this.field_b;
                if (stackIn_376_0 <= stackIn_376_1) {
                  break;
                }
                stackIn_387_0 = 0;
                if (var22 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var7 = stackIn_387_0;
                while (this.field_e > var7) {
                  var8 = var6 - this.field_b / 2;
                  var9 = var7 - this.field_b / 2;
                  var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
                  stackIn_376_0 = ~var10;
                  stackIn_376_1 = -9;
                  if (stackIn_376_0 > stackIn_376_1) {
                    this.field_f[var6][var7].field_B = true;
                    this.field_f[var6][var7].field_b = 1;
                  }
                  var7++;
                }
                var6++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_387_0 = -2;
            }
            if (stackIn_387_0 == ~this.field_k) {
              var6_ref_byte__ = of.field_k[wf.a("Tutorial", true)];
              this.a(0, (byte) 104, 0, var6_ref_byte__);
            }
          }
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          if (this.field_k == 2) {
            var10 = 1;
          }
          if (this.field_k == 3) {
            var7 = 1;
            var11 = 2;
            var8 = 1;
          }
          if (4 == this.field_k) {
            var6 = 1;
            var7 = 1;
            var11 = 5;
          }
          if (this.field_k == 5) {
            var7 = 1;
            var9 = 1;
            var11 = 3;
          }
          L110: while (true) {
            var13 = 0;
            while (true) {
              stackIn_405_0 = this.field_b;
              if (stackIn_405_0 > var13) {
                stackIn_434_0 = 0;
                if (var22 == 0) {
                  var14 = stackIn_434_0;
                  while (this.field_e > var14) {
                    stackIn_405_0 = var13;
                    if (stackIn_405_0 != 0 &&
                      var14 != 0) {
                      var15 = 32;
                      if (var15 > this.field_f[var13 - 1][var14].field_x) {
                        var15 = this.field_f[var13 - 1][var14].field_x;
                      }
                      if (var15 > this.field_f[var13][-1 + var14].field_x) {
                        var15 = this.field_f[var13][-1 + var14].field_x;
                      }
                      if (this.field_f[var13 - 1][-1 + var14].field_x < var15) {
                        var15 = this.field_f[-1 + var13][var14 - 1].field_x;
                      }
                      this.field_f[var13][var14].field_x = 1 + var15;
                    } else {
                      this.field_f[var13][var14].field_x = 1;
                    }
                    if (this.field_f[var13][var14].field_B) {
                      this.field_f[var13][var14].field_x = 0;
                    }
                    var14++;
                  }
                  var13++;
                  continue;
                }
              } else {
                stackIn_434_0 = 1;
              }
              var12 = stackIn_434_0;
              var13_ref = null;
              if (var12 != 0 &&
                var6 != 0) {
                var12 = 0;
                var13_ref = of.field_k[wf.a("Hanger", true)];
                var6 = 0;
                if (param0.field_G.field_Bb == 3) {
                  var13_ref = of.field_k[wf.a("AlienHanger", true)];
                }
              }
              if (var12 != 0 &&
                var8 != 0) {
                var8 = 0;
                var13_ref = of.field_k[wf.a("ResearchBase", true)];
                var12 = 0;
              }
              if (var12 != 0 &&
                var9 != 0) {
                var13_ref = of.field_k[wf.a("FactoryBase", true)];
                var9 = 0;
                var12 = 0;
                if (param0.field_G.field_Bb == 3) {
                  var13_ref = of.field_k[wf.a("AlienFactoryBase", true)];
                }
              }
              if (var12 != 0 &&
                var7 != 0) {
                var12 = 0;
                var13_ref = of.field_k[wf.a("Helepad", true)];
                var7 = 0;
              }
              if (var12 != 0 &&
                var10 > 0) {
                var12 = 0;
                var10--;
                var13_ref = of.field_k[wf.a("Barracks", true)];
              }
              if (var12 != 0 &&
                var11 > 0) {
                var11--;
                var12 = 0;
                var13_ref = of.field_k[wf.a("FuelDump", true)];
              }
              boolean decompiledFrameRemainder1 = true;
              var14 = 0;
              if (var12 != 0 &&
                var4 != 0) {
                stackIn_478_0 = 0;
                stackIn_478_1 = this.field_k;
                do {
                  if (stackIn_478_0 != stackIn_478_1) {
                    var14 = 1;
                    var12 = 0;
                    if (var4 == 1) {
                      var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    }
                    if (var4 == 2) {
                      var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                    }
                    if (var4 == 3) {
                      var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                    }
                    if (3 >= var4) {
                      var4 = 0;
                    }
                    if (5 == var4) {
                      var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                      var4 = 1;
                    }
                    if (4 == var4) {
                      var4 = 5;
                      var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    }
                  }
                  if (var13_ref != null) {
                    var17 = 0;
                    var18 = 0;
                    L139: while (true) {
                      var18++;
                      if (var18 > 10) {
                        var17++;
                        var18 = 0;
                      }
                      if (var17 <= this.field_b / 2) {
                        while (true) {
                          var15 = (int)(2.0 * (Math.random() * (double)var17)) - var17 + this.field_b / 2;
                          var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 - this.field_e / 2);
                          if (var4 != 0 &&
                            var14 == 0) {
                            var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                            var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) - var17 / 2 + this.field_b / 4);
                            if (var15 < 1 + ((byte[]) (var13_ref))[0] / 2) {
                              var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                            }
                            if (1 + ((byte[]) (var13_ref))[1] / 2 > var16) {
                              var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                            }
                          }
                          if ((((byte[]) (var13_ref))[0] + 1) > this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x) {
                            continue L139;
                          }
                          if (var22 == 0) {
                            break L139;
                          }
                          var17 = this.field_b / 2;
                        }
                      }
                      do {
                        var17 = this.field_b / 2;
                        var15 = (int)(2.0 * (Math.random() * (double)var17)) - var17 + this.field_b / 2;
                        var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 - this.field_e / 2);
                        if (var4 != 0 &&
                          var14 == 0) {
                          var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                          var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) - var17 / 2 + this.field_b / 4);
                          if (var15 < 1 + ((byte[]) (var13_ref))[0] / 2) {
                            var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                          }
                          if (1 + ((byte[]) (var13_ref))[1] / 2 > var16) {
                            var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                          }
                        }
                        if ((((byte[]) (var13_ref))[0] + 1) > this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x) {
                          continue L139;
                        }
                      } while (var22 != 0);
                      break;
                    }
                    this.a(-(((byte[]) (var13_ref))[0] / 2) + var15, (byte) 104, -(((byte[]) (var13_ref))[1] / 2) + var16, (byte[]) (var13_ref));
                  }
                  if (var12 == 0) {
                    continue L110;
                  }
                  stackIn_478_0 = 1;
                  stackIn_478_1 = this.field_k;
                } while (var22 != 0);
                decompiledFrameRemainder1 = false;
              }
              else {
                while (true) {
                  if (var13_ref != null) {
                    var17 = 0;
                    var18 = 0;
                    L150: while (true) {
                      var18++;
                      if (var18 > 10) {
                        var17++;
                        var18 = 0;
                      }
                      if (var17 <= this.field_b / 2) {
                        while (true) {
                          var15 = (int)(2.0 * (Math.random() * (double)var17)) - var17 + this.field_b / 2;
                          var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 - this.field_e / 2);
                          if (var4 != 0 &&
                            var14 == 0) {
                            var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                            var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) - var17 / 2 + this.field_b / 4);
                            if (var15 < 1 + ((byte[]) (var13_ref))[0] / 2) {
                              var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                            }
                            if (1 + ((byte[]) (var13_ref))[1] / 2 > var16) {
                              var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                            }
                          }
                          if ((((byte[]) (var13_ref))[0] + 1) > this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x) {
                            continue L150;
                          }
                          if (var22 == 0) {
                            break L150;
                          }
                          var17 = this.field_b / 2;
                        }
                      }
                      do {
                        var17 = this.field_b / 2;
                        var15 = (int)(2.0 * (Math.random() * (double)var17)) - var17 + this.field_b / 2;
                        var16 = (int)(2.0 * ((double)var17 * Math.random())) - (var17 - this.field_e / 2);
                        if (var4 != 0 &&
                          var14 == 0) {
                          var15 = var15 - (-(((byte[]) (var13_ref))[0] / 2) + (this.field_b / 4 - var17 / 2));
                          var16 = var16 - (-(((byte[]) (var13_ref))[1] / 2) - var17 / 2 + this.field_b / 4);
                          if (var15 < 1 + ((byte[]) (var13_ref))[0] / 2) {
                            var15 = 1 + ((byte[]) (var13_ref))[0] / 2;
                          }
                          if (1 + ((byte[]) (var13_ref))[1] / 2 > var16) {
                            var16 = ((byte[]) (var13_ref))[1] / 2 + 1;
                          }
                        }
                        if ((((byte[]) (var13_ref))[0] + 1) > this.field_f[((byte[]) (var13_ref))[0] / 2 + var15][var16 + ((byte[]) (var13_ref))[1] / 2].field_x) {
                          continue L150;
                        }
                      } while (var22 != 0);
                      break;
                    }
                    this.a(-(((byte[]) (var13_ref))[0] / 2) + var15, (byte) 104, -(((byte[]) (var13_ref))[1] / 2) + var16, (byte[]) (var13_ref));
                  }
                  if (var12 == 0) {
                    continue L110;
                  }
                  stackIn_478_0 = 1;
                  stackIn_478_1 = this.field_k;
                  if (var22 == 0) {
                    break;
                  }
                  if (stackIn_478_0 == stackIn_478_1) {
                    continue;
                  }
                  var14 = 1;
                  var12 = 0;
                  if (var4 == 1) {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                  }
                  if (var4 == 2) {
                    var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                  }
                  if (var4 == 3) {
                    var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                  }
                  if (3 >= var4) {
                    var4 = 0;
                  }
                  if (5 == var4) {
                    var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                    var4 = 1;
                  }
                  if (4 != var4) {
                    continue;
                  }
                  var4 = 5;
                  var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                }
              }
              if (stackIn_478_0 != stackIn_478_1) {
                if (var5 != 0) {
                  this.a((byte) -106);
                  if (var22 != 0) {
                    this.a(1);
                    this.a(1);
                  }
                } else {
                  this.a(1);
                  if (var22 != 0) {
                    this.a(1);
                  }
                }
              } else {
                this.a(1);
              }
              var13 = 0;
              while (true) {
                stackIn_539_0 = var3 + var2_int;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_539_0 > var13) {
                  var14 = 4 + (int)(6.0 * Math.random());
                  var14 = var14 * var14;
                  var15 = (int)(Math.random() * (double)this.field_b);
                  var16 = (int)(Math.random() * (double)this.field_e);
                  stackIn_563_0 = ~var2_int;
                  stackIn_563_1 = ~var13;
                  decompiledFrameRemainder0 = (var22 == 0);
                  if (decompiledFrameRemainder0) {
                    if (stackIn_563_0 >= stackIn_563_1) {
                      var15 = (int)(Math.random() * (double)this.field_b / 2.0) + this.field_b / 4;
                      var16 = (int)(Math.random() * (double)this.field_e / 2.0) + this.field_e / 4;
                    }
                    var20 = 0;
                    while (true) {
                      stackIn_548_0 = ~var20;
                      stackIn_548_1 = ~this.field_b;
                      if (stackIn_548_0 > stackIn_548_1) {
                        stackIn_539_0 = 0;
                        var21 = stackIn_539_0;
                        while (var21 < this.field_e) {
                          var18 = -var21 + var16;
                          var17 = -var20 + var15;
                          var19 = var17 * var17 + var18 * var18;
                          stackIn_548_0 = ~var19;
                          stackIn_548_1 = ~var14;
                          if (stackIn_548_0 >= stackIn_548_1 &&
                            (double)var14 * Math.random() > (double)var19) {
                            this.field_f[var20][var21].a(false);
                          }
                          var21++;
                        }
                        var20++;
                        continue;
                      }
                      break;
                    }
                    var13++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_563_0 = var4;
                  stackIn_563_1 = 1;
                }
                if (stackIn_563_0 == stackIn_563_1) {
                  var13_ref = of.field_k[wf.a("UFO-Transport", true)];
                  this.a(this.field_b / 2 - ((byte[]) (var13_ref))[0] / 2, (byte) 104, this.field_e / 2 - ((byte[]) (var13_ref))[1] / 2, (byte[]) (var13_ref));
                }
                if (var4 == 2) {
                  var13_ref = of.field_k[wf.a("UFO-Invader", true)];
                  this.a(this.field_b / 2 - ((byte[]) (var13_ref))[0] / 2, (byte) 104, this.field_e / 2 - ((byte[]) (var13_ref))[1] / 2, (byte[]) (var13_ref));
                }
                if (3 == var4) {
                  var13_ref = of.field_k[wf.a("UFO-Dominator", true)];
                  this.a(this.field_b / 2 - ((byte[]) (var13_ref))[0] / 2, (byte) 104, this.field_e / 2 - ((byte[]) (var13_ref))[1] / 2, (byte[]) (var13_ref));
                }
                var13 = 0;
                while (true) {
                  stackIn_571_0 = var13;
                  stackIn_571_1 = this.field_b;
                  if (stackIn_571_0 < stackIn_571_1) {
                    if (var22 != 0) {
                      return;
                    }
                    var14 = 0;
                    while (var14 < this.field_e) {
                      this.field_f[var13][var14].a(0);
                      stackIn_571_0 = param0.field_G.field_Bb;
                      stackIn_571_1 = 1;
                      if (stackIn_571_0 == stackIn_571_1) {
                        this.field_f[var13][var14].field_z = true;
                      }
                      var14++;
                    }
                    var13++;
                    continue;
                  }
                  break;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_585_0 = var2;
          stackIn_585_1 = new StringBuilder().append("dk.<init>(");
          if (param0 == null) {
            stackIn_586_2 = "null";
          } else {
            stackIn_586_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_585_0), ((StringBuilder) (Object) stackIn_585_1).append(stackIn_586_2).append(')').toString());
        }
    }

    static {
        field_h = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_j = new int[256];
        field_c = new int[128];
    }

    private static int $cfr$dcmpg(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
