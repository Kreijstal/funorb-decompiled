/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends qg {
    private ti field_y;
    static String field_H;
    private ti field_C;
    static String field_I;
    static ti[] field_F;
    private ti[] field_D;
    private int field_G;
    boolean field_w;
    int field_J;
    static kh field_x;
    private int field_u;
    private ti field_K;
    private int field_M;
    private int field_L;
    private int field_t;
    private int field_B;
    static String[] field_E;
    static int[] field_z;
    static String field_v;
    static String field_A;

    private final ti h(int param0) {
        int var2 = 0;
        ti var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        var2 = this.field_h >> -2114180767;
        var3 = new ti(var2, this.field_h);
        oj.a(var3, 256);
        var4 = 0;
        L0: while (true) {
          stackOut_1_0 = var4 ^ -1;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 <= (this.field_h ^ -1)) {
                  break L3;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_16_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    var5 = stackIn_4_0;
                    L4: while (true) {
                      if (var2 <= var5) {
                        var4++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_h));
                        var8 = 1;
                        stackOut_6_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_2_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                          continue L1;
                        } else {
                          L5: {
                            if (stackIn_7_0 < 0) {
                              L6: {
                                var6 = Math.sqrt(-var6 + 1.0);
                                if (1.0 <= var6) {
                                  stackOut_11_0 = 255;
                                  stackIn_12_0 = stackOut_11_0;
                                  break L6;
                                } else {
                                  stackOut_10_0 = (int)(var6 * 255.0);
                                  stackIn_12_0 = stackOut_10_0;
                                  break L6;
                                }
                              }
                              var8 = stackIn_12_0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          sb.a(var5, var4, var8 << 408496040 | var8 | var8 << 1557073104);
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = param0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            if (stackIn_16_0 != -29239) {
              field_E = (String[]) null;
              fi.c(true);
              return var3;
            } else {
              fi.c(true);
              return var3;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_u = (param1 & 16711422) >> -1813204703;
        this.field_L = 8355711 & param2 >> -1606387295;
        this.field_B = param1;
        this.field_M = param2;
        this.c(false);
        if (param0) {
          return;
        } else {
          this.a(false, 76, -81);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        int var6 = 118 / ((param0 - -29) / 53);
        this.c(false);
    }

    private final ti a(byte param0, int param1, int param2) {
        ti discarded$1 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ti var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var13 = Transmogrify.field_A ? 1 : 0;
          var14 = new ti(this.field_t * 2, this.field_h);
          oj.a(var14, param0 + 166);
          var5 = this.field_h >> -1790979455;
          if (param0 == 90) {
            break L0;
          } else {
            discarded$1 = this.h(50);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var6 >= this.field_h) {
                break L3;
              } else {
                var7 = (var6 >> -1974548927) * (-1 + this.field_t * 2) % (this.field_t * 2);
                var8 = param2 & 16711935;
                var9 = 65280 & param2;
                var10 = var6 - var5;
                var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
                stackOut_4_0 = -257;
                stackIn_13_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var13 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0 >= (var11 ^ -1)) {
                      stackOut_7_0 = var9 | var8;
                      stackIn_8_0 = stackOut_7_0;
                      break L4;
                    } else {
                      stackOut_6_0 = (16711680 & var11 * var9 | var11 * var8 & -16711936) >>> -1794144536;
                      stackIn_8_0 = stackOut_6_0;
                      break L4;
                    }
                  }
                  L5: {
                    var12 = stackIn_8_0;
                    sb.d(var7, var6, this.field_t, var12);
                    sb.d(var7 - 2 * this.field_t, var6, this.field_t, var12);
                    var9 = param1 & 65280;
                    var8 = 16711935 & param1;
                    if (var11 < 256) {
                      stackOut_10_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> -811925688;
                      stackIn_11_0 = stackOut_10_0;
                      break L5;
                    } else {
                      stackOut_9_0 = var9 | var8;
                      stackIn_11_0 = stackOut_9_0;
                      break L5;
                    }
                  }
                  var12 = stackIn_11_0;
                  sb.d(var7 - -this.field_t, var6, this.field_t, var12);
                  sb.d(-this.field_t + var7, var6, this.field_t, var12);
                  var6++;
                  if (var13 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L2;
          }
          fi.c(stackIn_13_0 != 0);
          return var14;
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (this.field_w) {
                this.field_G = this.field_G + 1;
                if (this.field_G > this.field_t * 2) {
                  this.field_G = this.field_G - this.field_t * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1 == -12) {
              break L0;
            } else {
              field_v = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("qe.B(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    private final void c(boolean param0) {
        if (param0) {
          this.field_u = -108;
          this.field_D = new ti[]{this.a((byte) 90, this.field_B, this.field_M), this.a((byte) 90, this.field_u, this.field_L)};
          this.field_y = this.h(-29239);
          this.field_C = this.field_y.c();
          this.field_K = new ti(this.field_h >> 1507472769, this.field_h);
          return;
        } else {
          this.field_D = new ti[]{this.a((byte) 90, this.field_B, this.field_M), this.a((byte) 90, this.field_u, this.field_L)};
          this.field_y = this.h(-29239);
          this.field_C = this.field_y.c();
          this.field_K = new ti(this.field_h >> 1507472769, this.field_h);
          return;
        }
    }

    private final void a(byte param0, ti param1, int param2, int param3) {
        ti discarded$1 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_l + param3;
              c.a(var5_int + -this.field_y.field_n, this.field_y.field_n + param3, (byte) -50, this.field_h + param2, param2);
              var6 = -this.field_G + param3;
              if (param0 == -57) {
                break L1;
              } else {
                discarded$1 = this.h(-123);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6 >= var5_int) {
                  fi.c(true);
                  break L3;
                } else {
                  param1.c(var6, param2);
                  var6 = var6 + param1.field_n;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              L4: {
                if (param3 - -this.field_y.field_n < sb.field_d) {
                  break L4;
                } else {
                  oj.a(this.field_K, 256);
                  param1.c(-this.field_G, 0);
                  param1.c(this.field_t * 2 - this.field_G, 0);
                  this.field_C.b(0, 0);
                  fi.c(true);
                  this.field_K.c(param3, param2);
                  break L4;
                }
              }
              if (var5_int + -this.field_y.field_n <= sb.field_b) {
                oj.a(this.field_K, 256);
                var7 = this.field_G + this.field_l - this.field_y.field_n;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (2 * this.field_t >= var7) {
                        break L7;
                      } else {
                        var7 = var7 - 2 * this.field_t;
                        if (var8 != 0) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    param1.c(-var7, 0);
                    param1.c(this.field_t * 2 - var7, 0);
                    this.field_y.b(0, 0);
                    fi.c(true);
                    break L6;
                  }
                  this.field_K.c(-this.field_y.field_n + var5_int, param2);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("qe.D(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> -1277422143, param6 >> 342186241 & 8355711);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (0 == param2) {
          var5 = -77 % ((param3 - 77) / 34);
          var6 = this.field_p + param0;
          var7 = this.field_n + param1;
          this.a((byte) -57, this.field_D[0], var7, var6);
          if (65536 <= this.field_J) {
            return;
          } else {
            c.a(this.field_l + var6, (this.field_l * this.field_J >> -156630320) + var6, (byte) -50, this.field_h + var7, var7);
            this.a((byte) -57, this.field_D[1], var7, var6);
            fi.c(true);
            return;
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_E = null;
        field_A = null;
        field_F = null;
        field_z = null;
        field_H = null;
        if (param0 != -156630320) {
          qe.i(-7);
          field_x = null;
          field_v = null;
          field_I = null;
          return;
        } else {
          field_x = null;
          field_v = null;
          field_I = null;
          return;
        }
    }

    private qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param7;
        this.field_t = param4;
        this.field_M = param5;
        this.field_u = param8;
        this.field_B = param6;
        this.a(75, param1, param0, param2, param3);
    }

    static {
        field_H = "Passwords can only contain letters and numbers";
        field_I = "Continue";
        field_x = new kh("");
        field_v = "Instructions";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_z = new int[8192];
        field_A = "Age:";
    }
}
