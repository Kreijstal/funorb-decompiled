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
        int var5;
        int var6;
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    var2 = this.field_y >> -760619487;
                    var3 = new ck(var2, this.field_y);
                    tb.a(true, var3);
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
                    if (stackIn_2_0 >= this.field_y) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_16_0 = 0;
                    stackIn_4_0 = stackIn_16_0;
                    if (var9 != 0) {
                        statePc = 16;
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
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_y));
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
                    if (stackIn_7_0 < 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = Math.sqrt(-var6 + 1.0);
                    if (1.0 > var6) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (int)(255.0 * var6);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    hk.a(var5, var4, var8 << 23521128 | var8 | var8 << -98736656);
                    var5++;
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    mk.a((byte) -5);
                    stackIn_16_0 = param0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 > -73) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return var3;
                }
                case 18: {
                    this.field_M = -48;
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ck b(int param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ck var15;
        ck var16;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
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
                  stackIn_24_0 = var11 ^ -1;

                  if (var13 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_24_0 > -257) {
                        stackIn_19_0 = (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> -464832536;
                        break L3;
                      } else {
                        stackIn_19_0 = var8 | var9;
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
                        stackIn_22_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -721839096;
                        break L4;
                      } else {
                        stackIn_22_0 = var8 | var9;
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
              stackIn_24_0 = -5;
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
                  stackIn_12_0 = var11 ^ -1;

                  if (var13 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (stackIn_12_0 > -257) {
                        stackIn_7_0 = (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> -464832536;
                        break L8;
                      } else {
                        stackIn_7_0 = var8 | var9;
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
                        stackIn_10_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -721839096;
                        break L9;
                      } else {
                        stackIn_10_0 = var8 | var9;
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
              stackIn_12_0 = -5;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("r.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, ck param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param2 + this.field_t;
                        if (param0 == -2044) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        r.a(true, 38);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        gg.a(param1, 20763, var5_int + -this.field_O.field_I, this.field_O.field_I + param2, this.field_y + param1);
                        var6 = param2 + -this.field_R;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param3.c(var6, param1);
                        var6 = var6 + param3.field_I;
                        if (var8 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        mk.a((byte) -5);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param2 + this.field_O.field_I < hk.field_c) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        tb.a(true, this.field_G);
                        param3.c(-this.field_R, 0);
                        param3.c(-this.field_R + this.field_J * 2, 0);
                        this.field_K.f(0, 0);
                        mk.a((byte) -5);
                        this.field_G.c(param2, param1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-this.field_O.field_I + var5_int > hk.field_g) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        tb.a(true, this.field_G);
                        var7 = -this.field_O.field_I + (this.field_t - -this.field_R);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_J * 2 >= var7) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = var7 - 2 * this.field_J;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param3.c(-var7, 0);
                        param3.c(2 * this.field_J - var7, 0);
                        this.field_O.f(0, 0);
                        mk.a((byte) -5);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_G.c(var5_int - this.field_O.field_I, param1);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var5);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("r.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param3 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
