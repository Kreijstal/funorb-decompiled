/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends cf {
    static String field_I;
    int field_B;
    private int field_N;
    private int field_D;
    private int field_J;
    private int field_H;
    private ja field_C;
    private int field_K;
    private int field_E;
    private ja field_O;
    boolean field_L;
    static String[] field_P;
    static String field_G;
    private ja field_M;
    private ja[] field_F;

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          var2 = 81 / ((-3 - param1) / 39);
          if (0 <= param0) {
            if ((param0 ^ -1) > -32769) {
              if (-129 < (param0 ^ -1)) {
                if (-9 >= (param0 ^ -1)) {
                  if ((param0 ^ -1) > -33) {
                    var3 = 6;
                    if (var4 != 0) {
                      var3 = 5;
                      if (var4 != 0) {
                        if ((param0 ^ -1) <= -3) {
                          var3 = 7;
                          if (var4 != 0) {
                            return 256;
                          } else {
                            param0 = param0 << (var3 << -465331295);
                            return pk.field_a[-32768 + param0] >> var3;
                          }
                        } else {
                          return 256;
                        }
                      } else {
                        param0 = param0 << (var3 << -465331295);
                        return pk.field_a[-32768 + param0] >> var3;
                      }
                    } else {
                      param0 = param0 << (var3 << -465331295);
                      return pk.field_a[-32768 + param0] >> var3;
                    }
                  } else {
                    var3 = 5;
                    if (var4 != 0) {
                      if ((param0 ^ -1) <= -3) {
                        var3 = 7;
                        if (var4 == 0) {
                          param0 = param0 << (var3 << -465331295);
                          return pk.field_a[-32768 + param0] >> var3;
                        } else {
                          return 256;
                        }
                      } else {
                        return 256;
                      }
                    } else {
                      param0 = param0 << (var3 << -465331295);
                      return pk.field_a[-32768 + param0] >> var3;
                    }
                  }
                } else {
                  if ((param0 ^ -1) <= -3) {
                    var3 = 7;
                    if (var4 != 0) {
                      return 256;
                    } else {
                      param0 = param0 << (var3 << -465331295);
                      return pk.field_a[-32768 + param0] >> var3;
                    }
                  } else {
                    return 256;
                  }
                }
              } else {
                L0: {
                  L1: {
                    if ((param0 ^ -1) > -2049) {
                      break L1;
                    } else {
                      L2: {
                        if (8192 <= param0) {
                          break L2;
                        } else {
                          var3 = 2;
                          if (var4 == 0) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = 1;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if ((param0 ^ -1) > -513) {
                      break L3;
                    } else {
                      var3 = 3;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3 = 4;
                  break L0;
                }
                param0 = param0 << (var3 << -465331295);
                return pk.field_a[-32768 + param0] >> var3;
              }
            } else {
              if ((param0 ^ -1) <= -131073) {
                L4: {
                  L5: {
                    if (param0 < 33554432) {
                      break L5;
                    } else {
                      L6: {
                        if (-536870913 < (param0 ^ -1)) {
                          break L6;
                        } else {
                          var3 = 7;
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param0 < 134217728) {
                          break L7;
                        } else {
                          var3 = 6;
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3 = 5;
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (param0 >= 2097152) {
                      break L8;
                    } else {
                      L9: {
                        if (param0 >= 524288) {
                          break L9;
                        } else {
                          var3 = 1;
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var3 = 2;
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if ((param0 ^ -1) > -8388609) {
                      break L10;
                    } else {
                      var3 = 4;
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var3 = 3;
                  break L4;
                }
                param0 = param0 >> (var3 << 1609769889);
                return pk.field_a[-32768 + param0] << var3;
              } else {
                return pk.field_a[param0 + -32768];
              }
            }
          } else {
            throw new IllegalArgumentException("");
          }
        } else {
          return 0;
        }
    }

    final static boolean b(int param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        if (-1 == param0) {
          return true;
        } else {
          if (param1 != -70) {
            L0: {
              field_I = (String) null;
              if (-1 == (1 << param0 & pb.field_d ^ -1)) {
                stackIn_11_0 = 0;
                break L0;
              } else {
                stackIn_11_0 = 1;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if (-1 == (1 << param0 & pb.field_d ^ -1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    private final ja b(int param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ja var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var14 = new ja(2 * this.field_D, this.field_w);
        if (param0 != -16711936) {
          return (ja) null;
        } else {
          r.a(0, var14);
          var5 = this.field_w >> 639813409;
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_w) {
                  break L2;
                } else {
                  var7 = (var6 >> 1565101665) * (2 * this.field_D - 1) % (2 * this.field_D);
                  var8 = 16711935 & param2;
                  var9 = param2 & 65280;
                  var10 = var6 + -var5;
                  var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
                  stackIn_12_0 = 256;

                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_12_0 <= var11) {
                        stackIn_7_0 = var9 | var8;
                        break L3;
                      } else {
                        stackIn_7_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 408378376;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_7_0;
                      oo.b(var7, var6, this.field_D, var12);
                      var8 = param1 & 16711935;
                      var9 = 65280 & param1;
                      oo.b(var7 + -(this.field_D * 2), var6, this.field_D, var12);
                      if (var11 < 256) {
                        stackIn_10_0 = (var11 * var8 & -16711936 | var9 * var11 & 16711680) >>> -947853752;
                        break L4;
                      } else {
                        stackIn_10_0 = var8 | var9;
                        break L4;
                      }
                    }
                    var12 = stackIn_10_0;
                    oo.b(var7 - -this.field_D, var6, this.field_D, var12);
                    oo.b(var7 - this.field_D, var6, this.field_D, var12);
                    var6++;
                    if (var13 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_12_0 = 1;
              break L1;
            }
            ql.a(stackIn_12_0 != 0);
            return var14;
          }
        }
    }

    private final ja g(int param0) {
        int var2 = 0;
        ja var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = this.field_w >> -1128159583;
                    var3 = new ja(var2, this.field_w);
                    r.a(0, var3);
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = var4;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 >= this.field_w) {
                        statePc = 14;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_15_0 = 0;
                    stackIn_4_0 = stackIn_15_0;
                    if (var9 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var2 <= var5) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_w + -var4));
                    var8 = 1;
                    stackIn_2_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_7_0 = stackIn_2_0;
                    if (var9 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 >= 0) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6 = Math.sqrt(1.0 - var6);
                    if (var6 >= 1.0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (int)(255.0 * var6);
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 255;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var8 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    oo.a(var5, var4, var8 << -136884464 | (var8 << -2145973016 | var8));
                    var5++;
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 121 % ((45 - param0) / 54);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var5 = stackIn_15_0;
                    ql.a(true);
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_G = null;
        field_I = null;
        if (param0 != 0) {
            le.b(67, (byte) 68);
            field_P = null;
            return;
        }
        field_P = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(-506198655);
    }

    final void a(int param0, cf param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_L) {
                this.field_J = this.field_J + 1;
                if (this.field_D * 2 < this.field_J) {
                  this.field_J = this.field_J - this.field_D * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0 == -5407) {
              break L0;
            } else {
              this.b(-97, -4, 31, 91, 52);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("le.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        if (param2 != 0) {
          return;
        } else {
          var5 = this.field_y + param3;
          if (param0 == -2) {
            var6 = this.field_i + param1;
            this.a((byte) 116, this.field_F[0], var5, var6);
            if (-65537 < (this.field_B ^ -1)) {
              nm.a(var5 + (this.field_n * this.field_B >> -1947480464), this.field_w + var6, (byte) 105, this.field_n + var5, var6);
              this.a((byte) 116, this.field_F[1], var5, var6);
              ql.a(true);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    le(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -158222623, 8355711 & param6 >> 947786721);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 17 / ((55 - param2) / 61);
        this.field_H = (param1 & 16711422) >> -2031915327;
        this.field_E = param1;
        this.field_N = param0;
        this.field_K = param0 >> -146639327 & 8355711;
        this.f(-506198655);
    }

    private final void a(byte param0, ja param1, int param2, int param3) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param2 + this.field_n;
                        if (param0 == 116) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_N = -99;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        nm.a(param2 + this.field_M.field_x, this.field_w + param3, (byte) 105, -this.field_M.field_x + var5_int, param3);
                        var6 = param2 - this.field_J;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 >= var5_int) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param1.g(var6, param3);
                        var6 = var6 + param1.field_x;
                        if (var8 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ql.a(true);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (oo.field_f > this.field_M.field_x + param2) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        r.a(0, this.field_C);
                        param1.g(-this.field_J, 0);
                        param1.g(this.field_D * 2 + -this.field_J, 0);
                        this.field_O.e(0, 0);
                        ql.a(true);
                        this.field_C.g(param2, param3);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (oo.field_g >= -this.field_M.field_x + var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        r.a(0, this.field_C);
                        var7 = -this.field_M.field_x + this.field_n + this.field_J;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (this.field_D * 2 >= var7) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = var7 - 2 * this.field_D;
                        if (var8 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param1.g(-var7, 0);
                        param1.g(2 * this.field_D - var7, 0);
                        this.field_M.e(0, 0);
                        ql.a(true);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_C.g(var5_int + -this.field_M.field_x, param3);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var5);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("le.A(").append(param0).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param1 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private le(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_E = param5;
        this.field_N = param6;
        this.field_H = param7;
        this.field_D = param4;
        this.field_K = param8;
        this.b(param0, param1, 28972, param2, param3);
    }

    private final void f(int param0) {
        this.field_F = new ja[]{this.b(param0 + 489486719, this.field_N, this.field_E), this.b(-16711936, this.field_K, this.field_H)};
        this.field_M = this.g(param0 ^ -506198544);
        this.field_O = this.field_M.f();
        this.field_C = new ja(this.field_w >> -506198655, this.field_w);
        if (param0 != -506198655) {
            this.b(-93, 112, 105, 48, -63);
        }
    }

    static {
        field_I = "Quick Chat Help";
        field_G = "Unable to add friend - system busy";
        field_P = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
