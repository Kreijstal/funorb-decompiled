/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends rc {
    private o field_A;
    private o[] field_S;
    private int field_O;
    static rl[] field_M;
    int field_R;
    private int field_I;
    private int field_F;
    private int field_K;
    static String field_E;
    private o field_G;
    private int field_N;
    private o field_P;
    static volatile int field_J;
    boolean field_B;
    static int field_H;
    private int field_D;
    static String field_L;

    private final o b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        o var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        var14 = new o(2 * this.field_N, this.field_x);
        cl.a(-112, var14);
        var5 = this.field_x >> 985941857;
        var6 = 0;
        L0: while (true) {
          L1: {
            if (this.field_x <= var6) {
              break L1;
            } else {
              var7 = (var6 >> -168292607) * (-1 + 2 * this.field_N) % (2 * this.field_N);
              var8 = param0 & 16711935;
              var9 = param0 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              var16 = 256;
              var15 = var11;
              if (var13 != 0) {
                if (var15 != var16) {
                  this.field_O = 56;
                  mf.e(4096);
                  return var14;
                } else {
                  mf.e(4096);
                  return var14;
                }
              } else {
                L2: {
                  if (var15 < var16) {
                    stackOut_10_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 206831848;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = var8 | var9;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var12 = stackIn_11_0;
                  mi.b(var7, var6, this.field_N, var12);
                  var9 = param2 & 65280;
                  var8 = param2 & 16711935;
                  mi.b(var7 + -(2 * this.field_N), var6, this.field_N, var12);
                  if ((var11 ^ -1) <= -257) {
                    stackOut_13_0 = var9 | var8;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> 2133927368;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                var12 = stackIn_14_0;
                mi.b(this.field_N + var7, var6, this.field_N, var12);
                mi.b(var7 - this.field_N, var6, this.field_N, var12);
                var6++;
                if (var13 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param1 != 16711935) {
            this.field_O = 56;
            mf.e(4096);
            return var14;
          } else {
            mf.e(4096);
            return var14;
          }
        }
    }

    c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 571924641 & 8355711, param6 >> 209702273 & 8355711);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(-277997311);
    }

    private final void a(int param0) {
        if (param0 != -277997311) {
          field_H = -117;
          this.field_S = new o[]{this.b(this.field_O, param0 + 294709246, this.field_K), this.b(this.field_I, param0 ^ -275703298, this.field_F)};
          this.field_P = this.a((byte) -119);
          this.field_A = this.field_P.b();
          this.field_G = new o(this.field_x >> -277997311, this.field_x);
          return;
        } else {
          this.field_S = new o[]{this.b(this.field_O, param0 + 294709246, this.field_K), this.b(this.field_I, param0 ^ -275703298, this.field_F)};
          this.field_P = this.a((byte) -119);
          this.field_A = this.field_P.b();
          this.field_G = new o(this.field_x >> -277997311, this.field_x);
          return;
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
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
              if (param1 == 18874) {
                break L1;
              } else {
                this.a((byte) -66, -124, 9);
                break L1;
              }
            }
            L2: {
              if (!this.field_B) {
                break L2;
              } else {
                this.field_D = this.field_D + 1;
                if (this.field_N * 2 >= this.field_D) {
                  break L2;
                } else {
                  this.field_D = this.field_D - this.field_N * 2;
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
            stackOut_6_1 = new StringBuilder().append("c.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (0 != param1) {
          return;
        } else {
          var5 = this.field_m + param2;
          var6 = param0 - -this.field_j;
          this.a(param3, var6, this.field_S[0], var5);
          if ((this.field_R ^ -1) > -65537) {
            kf.a((byte) 97, var5 - -(this.field_t * this.field_R >> 451556400), var6, var5 - -this.field_t, this.field_x + var6);
            this.a(0, var6, this.field_S[1], var5);
            mf.e(4096);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, o param2, int param3) {
        o discarded$1 = null;
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
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_t + param3;
            kf.a((byte) 97, param3 + this.field_P.field_p, param1, -this.field_P.field_p + var5_int, this.field_x + param1);
            var6 = -this.field_D + param3;
            L1: while (true) {
              L2: {
                if (var5_int <= var6) {
                  L3: {
                    if (param0 == 0) {
                      break L3;
                    } else {
                      discarded$1 = this.a((byte) 120);
                      break L3;
                    }
                  }
                  mf.e(4096);
                  break L2;
                } else {
                  param2.d(var6, param1);
                  var6 = var6 + param2.field_p;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L4: {
                if (mi.field_b > this.field_P.field_p + param3) {
                  break L4;
                } else {
                  cl.a(param0 ^ -100, this.field_G);
                  param2.d(-this.field_D, 0);
                  param2.d(-this.field_D + 2 * this.field_N, 0);
                  this.field_A.g(0, 0);
                  mf.e(param0 ^ 4096);
                  this.field_G.d(param3, param1);
                  break L4;
                }
              }
              L5: {
                if (mi.field_k < -this.field_P.field_p + var5_int) {
                  break L5;
                } else {
                  cl.a(param0 + -119, this.field_G);
                  var7 = this.field_D + (-this.field_P.field_p + this.field_t);
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var7 <= 2 * this.field_N) {
                          break L8;
                        } else {
                          var7 = var7 - this.field_N * 2;
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
                      param2.d(-var7, 0);
                      param2.d(-var7 + 2 * this.field_N, 0);
                      this.field_P.g(0, 0);
                      mf.e(param0 ^ 4096);
                      break L7;
                    }
                    this.field_G.d(-this.field_P.field_p + var5_int, param1);
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
            stackOut_20_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_F = (param1 & 16711422) >> 32005889;
        this.field_I = 8355711 & param2 >> 797935009;
        this.field_K = param1;
        int var4 = 99 / ((-54 - param0) / 58);
        this.field_O = param2;
        this.a(-277997311);
    }

    public static void d(byte param0) {
        field_E = null;
        field_M = null;
        int var1 = -97 % ((param0 - -47) / 39);
        field_L = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!gb.a(param1, 126)) {
                var6 = hh.field_N;
                var2 = var6;
                var3 = param0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var6.length <= var3) {
                            break L5;
                          } else {
                            var4 = var6[var3];
                            var8 = var4;
                            var7 = param1;
                            if (var5 != 0) {
                              if (var7 >= var8) {
                                break L3;
                              } else {
                                L6: while (true) {
                                  var4 = var2[var3];
                                  stackOut_19_0 = var4 ^ -1;
                                  stackIn_26_0 = stackOut_19_0;
                                  stackIn_20_0 = stackOut_19_0;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_20_0 == (param1 ^ -1)) {
                                      break L4;
                                    } else {
                                      var3++;
                                      if (var5 == 0) {
                                        if (var2.length <= var3) {
                                          break L3;
                                        } else {
                                          continue L6;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var7 == var8) {
                                stackOut_14_0 = 1;
                                stackIn_15_0 = stackOut_14_0;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var2 = qk.field_k;
                        var3 = 0;
                        L7: while (true) {
                          if (var2.length <= var3) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackOut_19_0 = var4 ^ -1;
                            stackIn_26_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var5 != 0) {
                              break L2;
                            } else {
                              if (stackIn_20_0 == (param1 ^ -1)) {
                                break L4;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "c.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    private c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_I = param7;
        this.field_K = param6;
        this.field_F = param8;
        this.field_O = param5;
        this.field_N = param4;
        this.b(param3, param2, param0, 0, param1);
    }

    private final o a(byte param0) {
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        var2 = this.field_x >> 148199553;
        if (param0 != -119) {
          return (o) null;
        } else {
          var3 = new o(var2, this.field_x);
          cl.a(-98, var3);
          var4 = 0;
          L0: while (true) {
            stackOut_2_0 = this.field_x ^ -1;
            stackIn_3_0 = stackOut_2_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_3_0 >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_16_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_5_0;
                      L4: while (true) {
                        if (var5 >= var2) {
                          var4++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        } else {
                          var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_x));
                          var8 = 1;
                          stackOut_7_0 = (1.0 < var6 ? -1 : (1.0 == var6 ? 0 : 1));
                          stackIn_3_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var9 != 0) {
                            continue L1;
                          } else {
                            L5: {
                              if (stackIn_8_0 <= 0) {
                                break L5;
                              } else {
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
                              }
                            }
                            mi.a(var5, var4, var8 << 1261525928 | var8 | var8 << -874209264);
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 4096;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              mf.e(stackIn_16_0);
              return var3;
            }
          }
        }
    }

    static {
        field_M = new rl[6];
        field_E = "A large asteroid field is heading for earth and the only hope are the eight Sol-Knights.  Earth must survive!  Each Sol-Knight is equipped with a different weapon to combat the threat.<br><br>Your planet's shields can only withstand 2 hits before they fall,<br>so stay vigilant.<br><br>Combos are the key to victory. They are gained by destroying asteroids accurately. If you miss a shot you will lose your combo, and any upgrades you collected will be removed unless you quickly restore the combo.<br><br>Maintaining accuracy will unlock weapon upgrades, such as rapid fire or multiple shots, at x10 and x25 combos.";
        field_J = -1;
        field_L = "Log in / Create account";
    }
}
