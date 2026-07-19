/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ce {
    private int field_N;
    boolean field_L;
    private ck field_O;
    private int field_J;
    private int field_M;
    private ck[] field_P;
    private int field_S;
    private ck field_K;
    private int field_H;
    private ck field_G;
    private int field_R;
    int field_Q;

    r(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -1519559391, (param6 & 16711422) >> -1248347583);
    }

    final static void a(boolean param0, int param1) {
        if (vh.field_h == null) {
          if (param1 != 4028) {
            r.a(false, 20);
            return;
          } else {
            return;
          }
        } else {
          vh.field_h.a(1141039778, param0);
          if (param1 == 4028) {
            return;
          } else {
            r.a(false, 20);
            return;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.b(true);
    }

    private final void b(boolean param0) {
        ck discarded$1 = null;
        if (!param0) {
          discarded$1 = this.e((byte) 116);
          this.field_P = new ck[]{this.b(-81, this.field_M, this.field_H), this.b(-107, this.field_S, this.field_N)};
          this.field_O = this.e((byte) -125);
          this.field_K = this.field_O.e();
          this.field_G = new ck(this.field_y >> 1564443297, this.field_y);
          return;
        } else {
          this.field_P = new ck[]{this.b(-81, this.field_M, this.field_H), this.b(-107, this.field_S, this.field_N)};
          this.field_O = this.e((byte) -125);
          this.field_K = this.field_O.e();
          this.field_G = new ck(this.field_y >> 1564443297, this.field_y);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (-1 != (param2 ^ -1)) {
          return;
        } else {
          var5 = this.field_u + param0;
          if (param1 > -103) {
            L0: {
              this.a(-17, 35, 5);
              var6 = param3 - -this.field_D;
              this.a(-2044, var6, var5, this.field_P[0]);
              if (65536 > this.field_Q) {
                gg.a(var6, 20763, var5 - -this.field_t, var5 + (this.field_Q * this.field_t >> -172186704), this.field_y + var6);
                this.a(-2044, var6, var5, this.field_P[1]);
                mk.a((byte) -5);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              var6 = param3 - -this.field_D;
              this.a(-2044, var6, var5, this.field_P[0]);
              if (65536 > this.field_Q) {
                gg.a(var6, 20763, var5 - -this.field_t, var5 + (this.field_Q * this.field_t >> -172186704), this.field_y + var6);
                this.a(-2044, var6, var5, this.field_P[1]);
                mk.a((byte) -5);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    private final ck e(byte param0) {
        int var2 = 0;
        ck var3 = null;
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
        byte stackOut_15_0 = 0;
        var9 = client.field_A ? 1 : 0;
        var2 = this.field_y >> -760619487;
        var3 = new ck(var2, this.field_y);
        tb.a(true, var3);
        var4 = 0;
        L0: while (true) {
          stackOut_1_0 = var4;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= this.field_y) {
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
                        var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_y));
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
                                if (1.0 > var6) {
                                  stackOut_11_0 = (int)(255.0 * var6);
                                  stackIn_12_0 = stackOut_11_0;
                                  break L6;
                                } else {
                                  stackOut_10_0 = 255;
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
                          hk.a(var5, var4, var8 << 23521128 | var8 | var8 << -98736656);
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              mk.a((byte) -5);
              stackOut_15_0 = param0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            if (stackIn_16_0 > -73) {
              this.field_M = -48;
              return var3;
            } else {
              return var3;
            }
          }
        }
    }

    private final ck b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ck var15 = null;
        ck var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var13 = client.field_A ? 1 : 0;
        if (param0 >= -78) {
          this.field_K = (ck) null;
          var15 = new ck(2 * this.field_J, this.field_y);
          tb.a(true, var15);
          var5 = this.field_y >> 1326292865;
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_y) {
                  break L2;
                } else {
                  var7 = (-1 + this.field_J * 2) * (var6 >> 221156193) % (this.field_J * 2);
                  var8 = param2 & 16711935;
                  var9 = 65280 & param2;
                  var10 = -var5 + var6;
                  var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
                  stackOut_15_0 = var11 ^ -1;
                  stackIn_24_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_16_0 > -257) {
                        stackOut_18_0 = (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> -464832536;
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        stackOut_17_0 = var8 | var9;
                        stackIn_19_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_19_0;
                      hk.a(var7, var6, this.field_J, var12);
                      var9 = param1 & 65280;
                      hk.a(-(this.field_J * 2) + var7, var6, this.field_J, var12);
                      var8 = 16711935 & param1;
                      if ((var11 ^ -1) > -257) {
                        stackOut_21_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -721839096;
                        stackIn_22_0 = stackOut_21_0;
                        break L4;
                      } else {
                        stackOut_20_0 = var8 | var9;
                        stackIn_22_0 = stackOut_20_0;
                        break L4;
                      }
                    }
                    var12 = stackIn_22_0;
                    hk.a(var7 - -this.field_J, var6, this.field_J, var12);
                    hk.a(-this.field_J + var7, var6, this.field_J, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_23_0 = -5;
              stackIn_24_0 = stackOut_23_0;
              break L1;
            }
            mk.a((byte) stackIn_24_0);
            return var15;
          }
        } else {
          var16 = new ck(2 * this.field_J, this.field_y);
          tb.a(true, var16);
          var5 = this.field_y >> 1326292865;
          var6 = 0;
          L5: while (true) {
            L6: {
              L7: {
                if (var6 >= this.field_y) {
                  break L7;
                } else {
                  var7 = (-1 + this.field_J * 2) * (var6 >> 221156193) % (this.field_J * 2);
                  var8 = param2 & 16711935;
                  var9 = 65280 & param2;
                  var10 = -var5 + var6;
                  var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
                  stackOut_3_0 = var11 ^ -1;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var13 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (stackIn_4_0 > -257) {
                        stackOut_6_0 = (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> -464832536;
                        stackIn_7_0 = stackOut_6_0;
                        break L8;
                      } else {
                        stackOut_5_0 = var8 | var9;
                        stackIn_7_0 = stackOut_5_0;
                        break L8;
                      }
                    }
                    L9: {
                      var12 = stackIn_7_0;
                      hk.a(var7, var6, this.field_J, var12);
                      var9 = param1 & 65280;
                      hk.a(-(this.field_J * 2) + var7, var6, this.field_J, var12);
                      var8 = 16711935 & param1;
                      if ((var11 ^ -1) > -257) {
                        stackOut_9_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -721839096;
                        stackIn_10_0 = stackOut_9_0;
                        break L9;
                      } else {
                        stackOut_8_0 = var8 | var9;
                        stackIn_10_0 = stackOut_8_0;
                        break L9;
                      }
                    }
                    var12 = stackIn_10_0;
                    hk.a(var7 - -this.field_J, var6, this.field_J, var12);
                    hk.a(-this.field_J + var7, var6, this.field_J, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              stackOut_11_0 = -5;
              stackIn_12_0 = stackOut_11_0;
              break L6;
            }
            mk.a((byte) stackIn_12_0);
            return var16;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ck discarded$1 = null;
        if (param1 != 4088) {
          discarded$1 = this.e((byte) 42);
          this.field_N = 8355711 & param2 >> -111273055;
          this.field_H = param2;
          this.field_M = param0;
          this.field_S = (param0 & 16711422) >> -329332639;
          this.b(true);
          return;
        } else {
          this.field_N = 8355711 & param2 >> -111273055;
          this.field_H = param2;
          this.field_M = param0;
          this.field_S = (param0 & 16711422) >> -329332639;
          this.b(true);
          return;
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
            L1: {
              if (param1 > 38) {
                break L1;
              } else {
                this.field_Q = -76;
                break L1;
              }
            }
            L2: {
              if (!this.field_L) {
                break L2;
              } else {
                this.field_R = this.field_R + 1;
                if (2 * this.field_J >= this.field_R) {
                  break L2;
                } else {
                  this.field_R = this.field_R - 2 * this.field_J;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("r.A(");
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, ck param3) {
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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + this.field_t;
              if (param0 == -2044) {
                break L1;
              } else {
                r.a(true, 38);
                break L1;
              }
            }
            gg.a(param1, 20763, var5_int + -this.field_O.field_I, this.field_O.field_I + param2, this.field_y + param1);
            var6 = param2 + -this.field_R;
            L2: while (true) {
              L3: {
                if (var5_int <= var6) {
                  mk.a((byte) -5);
                  break L3;
                } else {
                  param3.c(var6, param1);
                  var6 = var6 + param3.field_I;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              L4: {
                if (param2 + this.field_O.field_I < hk.field_c) {
                  break L4;
                } else {
                  tb.a(true, this.field_G);
                  param3.c(-this.field_R, 0);
                  param3.c(-this.field_R + this.field_J * 2, 0);
                  this.field_K.f(0, 0);
                  mk.a((byte) -5);
                  this.field_G.c(param2, param1);
                  break L4;
                }
              }
              L5: {
                if (-this.field_O.field_I + var5_int > hk.field_g) {
                  break L5;
                } else {
                  tb.a(true, this.field_G);
                  var7 = -this.field_O.field_I + (this.field_t - -this.field_R);
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (this.field_J * 2 >= var7) {
                          break L8;
                        } else {
                          var7 = var7 - 2 * this.field_J;
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
                      param3.c(-var7, 0);
                      param3.c(2 * this.field_J - var7, 0);
                      this.field_O.f(0, 0);
                      mk.a((byte) -5);
                      break L7;
                    }
                    this.field_G.c(var5_int - this.field_O.field_I, param1);
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
            stackOut_20_1 = new StringBuilder().append("r.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    private r(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param5;
        this.field_S = param8;
        this.field_J = param4;
        this.field_M = param6;
        this.field_N = param7;
        this.b(param3, param2, param0, param1, -16555);
    }

    static {
    }
}
