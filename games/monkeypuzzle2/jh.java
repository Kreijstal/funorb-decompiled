/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends we {
    static int[] field_y;
    boolean field_G;
    private int field_x;
    private int field_H;
    private int field_E;
    static ra field_C;
    private int field_u;
    private le field_w;
    private le[] field_z;
    private le field_B;
    private int field_v;
    private int field_F;
    private le field_A;
    int field_D;

    final void a(byte param0, int param1, int param2) {
        this.field_H = (16711422 & param1) >> 1644892769;
        this.field_x = param2;
        this.field_F = param1;
        this.field_E = 8355711 & param2 >> -1127695039;
        this.j(param0 ^ -115);
        if (param0 != -115) {
            this.field_G = false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (-1 == (param1 ^ -1)) {
          var5 = this.field_r + param3;
          if (param0 != 30) {
            L0: {
              field_y = (int[]) null;
              var6 = this.field_e + param2;
              this.a(-82, this.field_z[0], var5, var6);
              if (this.field_D < 65536) {
                qi.a(var5 + this.field_l, true, this.field_p + var6, var5 + (this.field_D * this.field_l >> -1080957648), var6);
                this.a(-52, this.field_z[1], var5, var6);
                tj.b(653);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              var6 = this.field_e + param2;
              this.a(-82, this.field_z[0], var5, var6);
              if (this.field_D < 65536) {
                qi.a(var5 + this.field_l, true, this.field_p + var6, var5 + (this.field_D * this.field_l >> -1080957648), var6);
                this.a(-52, this.field_z[1], var5, var6);
                tj.b(653);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void j(int param0) {
        this.field_z = new le[]{this.b((byte) 86, this.field_x, this.field_F), this.b((byte) 86, this.field_E, this.field_H)};
        this.field_w = this.i(param0 ^ -40982079);
        this.field_A = this.field_w.a();
        if (param0 != 0) {
          this.field_F = 23;
          this.field_B = new le(this.field_p >> 1940438849, this.field_p);
          return;
        } else {
          this.field_B = new le(this.field_p >> 1940438849, this.field_p);
          return;
        }
    }

    private final le b(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        le var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        var14 = new le(this.field_v * 2, this.field_p);
        mc.a(param0 ^ -8551, var14);
        var5 = this.field_p >> 2141461473;
        var6 = 0;
        L0: while (true) {
          L1: {
            if (this.field_p <= var6) {
              break L1;
            } else {
              var7 = (var6 >> -998348415) * (2 * this.field_v - 1) % (this.field_v * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              var16 = var11;
              var15 = 256;
              if (var13 != 0) {
                if (var15 != var16) {
                  this.field_x = -11;
                  tj.b(param0 + 567);
                  return var14;
                } else {
                  tj.b(param0 + 567);
                  return var14;
                }
              } else {
                L2: {
                  if (var15 > var16) {
                    stackOut_10_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 1348263720;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = var9 | var8;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var12 = stackIn_11_0;
                  ge.a(var7, var6, this.field_v, var12);
                  var9 = 65280 & param1;
                  ge.a(-(2 * this.field_v) + var7, var6, this.field_v, var12);
                  var8 = param1 & 16711935;
                  if (256 > var11) {
                    stackOut_13_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -673414552;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = var9 | var8;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                var12 = stackIn_14_0;
                ge.a(var7 + this.field_v, var6, this.field_v, var12);
                ge.a(var7 - this.field_v, var6, this.field_v, var12);
                var6++;
                if (var13 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param0 != 86) {
            this.field_x = -11;
            tj.b(param0 + 567);
            return var14;
          } else {
            tj.b(param0 + 567);
            return var14;
          }
        }
    }

    jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -40982079, (16711422 & param6) >> 498563969);
    }

    private final void a(int param0, le param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_l + param2;
              if (param0 < -37) {
                break L1;
              } else {
                var9 = (le) null;
                this.a(118, (le) null, -87, 86);
                break L1;
              }
            }
            qi.a(var5_int + -this.field_w.field_k, true, this.field_p + param3, param2 - -this.field_w.field_k, param3);
            var6 = param2 + -this.field_u;
            L2: while (true) {
              L3: {
                if (var5_int <= var6) {
                  tj.b(653);
                  break L3;
                } else {
                  param1.c(var6, param3);
                  var6 = var6 + param1.field_k;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              L4: {
                if (ge.field_a > param2 + this.field_w.field_k) {
                  break L4;
                } else {
                  mc.a(-8497, this.field_B);
                  param1.c(-this.field_u, 0);
                  param1.c(this.field_v * 2 + -this.field_u, 0);
                  this.field_A.d(0, 0);
                  tj.b(653);
                  this.field_B.c(param2, param3);
                  break L4;
                }
              }
              L5: {
                if (-this.field_w.field_k + var5_int > ge.field_j) {
                  break L5;
                } else {
                  mc.a(-8497, this.field_B);
                  var7 = this.field_u + (this.field_l + -this.field_w.field_k);
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var7 <= 2 * this.field_v) {
                          break L8;
                        } else {
                          var7 = var7 - this.field_v * 2;
                          if (var8 != 0) {
                            break L7;
                          } else {
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      param1.c(-var7, 0);
                      param1.c(2 * this.field_v + -var7, 0);
                      this.field_w.d(0, 0);
                      tj.b(653);
                      break L7;
                    }
                    this.field_B.c(-this.field_w.field_k + var5_int, param3);
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
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
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param3 < -13) {
              L1: {
                if (!this.field_G) {
                  break L1;
                } else {
                  this.field_u = this.field_u + 1;
                  if (this.field_v * 2 >= this.field_u) {
                    break L1;
                  } else {
                    this.field_u = this.field_u - 2 * this.field_v;
                    return;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("jh.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final le i(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        le var10 = null;
        le var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -40982079) {
          this.field_B = (le) null;
          var2 = this.field_p >> -392079999;
          var10 = new le(var2, this.field_p);
          mc.a(-8497, var10);
          var4 = 0;
          L0: while (true) {
            stackOut_12_0 = var4 ^ -1;
            stackIn_13_0 = stackOut_12_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_13_0 <= (this.field_p ^ -1)) {
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_20_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_15_0;
                      if (var2 <= var5) {
                        var4++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_p + -var4));
                        var8 = 1;
                        stackOut_16_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_13_0 = stackOut_16_0;
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_19_0 = 653;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              tj.b(stackIn_20_0);
              return var10;
            }
          }
        } else {
          var2 = this.field_p >> -392079999;
          var11 = new le(var2, this.field_p);
          mc.a(-8497, var11);
          var4 = 0;
          L4: while (true) {
            stackOut_2_0 = var4 ^ -1;
            stackIn_3_0 = stackOut_2_0;
            L5: while (true) {
              L6: {
                L7: {
                  if (stackIn_3_0 <= (this.field_p ^ -1)) {
                    break L7;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_10_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L6;
                    } else {
                      var5 = stackIn_5_0;
                      if (var2 <= var5) {
                        var4++;
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_p + -var4));
                        var8 = 1;
                        stackOut_6_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_3_0 = stackOut_6_0;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_9_0 = 653;
                stackIn_10_0 = stackOut_9_0;
                break L6;
              }
              tj.b(stackIn_10_0);
              return var11;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 7434) {
            jh.a(-65);
            field_C = null;
            field_y = null;
            return;
        }
        field_C = null;
        field_y = null;
    }

    private jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_F = param5;
        this.field_E = param8;
        this.field_x = param6;
        this.field_v = param4;
        this.field_H = param7;
        this.a(param3, 13361, param0, param2, param1);
    }

    static {
        field_y = new int[8192];
    }
}
