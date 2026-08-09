/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends kd {
    int field_O;
    private int field_C;
    private boolean field_Q;
    int field_z;
    private mb[] field_A;
    static String field_J;
    private wk field_P;
    private int field_D;
    static gi field_y;
    int field_S;
    private boolean field_U;
    int field_K;
    boolean field_E;
    static vk field_N;
    int field_F;
    private ee field_B;
    mb field_T;
    int field_I;
    static gk[] field_R;
    private boolean field_L;
    static String field_H;
    static int[] field_G;
    private int field_M;

    final static int[] a(int param0, byte param1) {
        int incrementValue$0 = 0;
        Object stackIn_6_0 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int[] stackIn_40_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = nl.a(param0, (byte) 124);
                        if (null == var2) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 != (var2.length ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (int[]) ((Object) stackIn_6_0);
                }
                case 7: {
                    try {
                        var3 = new int[-9 + var2.length];
                        ii.a(var2, 1, var3, 0, var3.length);
                        var4 = 0;
                        var5_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = var3.length;
                        stackIn_9_1 = var5_int;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 <= stackIn_9_1) {
                            statePc = 27;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_28_0 = 0;
                        stackIn_11_0 = stackIn_28_0;
                        stackIn_28_1 = qg.a((byte) -60, var3[var5_int]);
                        stackIn_11_1 = stackIn_28_1;
                        if (false) {
                            statePc = 28;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 > stackIn_11_1) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3[var5_int] = -1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 <= var3[var5_int]) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4++;
                        var6 = 1 + var5_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var6 ^ -1) <= (var3.length ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_9_0 = var3[var5_int];
                        stackIn_22_0 = stackIn_9_0;
                        stackIn_9_1 = var3[var6];
                        stackIn_22_1 = stackIn_9_1;
                        if (false) {
                            statePc = 9;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3[var6] = -1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_int++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = param1;
                        stackIn_28_1 = 28;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ne.g(61);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5 = new int[var4];
                        var4 = 0;
                        var6 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var3.length ^ -1) >= (var6 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var3[var6] ^ -1) == 0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        incrementValue$0 = var4;
                        var4++;
                        var5[incrementValue$0] = var3[var6];
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6++;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = (int[]) (var5);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var2_ref), "ne.A(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(mb param0, byte param1) {
        RuntimeException stackIn_186_0 = null;
        StringBuilder stackIn_186_1 = null;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        String stackIn_187_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              this.field_T = param0;
              if (this.field_Q) {
                break L1;
              } else {
                if (this.field_T.field_rc != -1) {
                  nh.a(true, this.field_T);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (43 == this.field_O) {
                break L2;
              } else {
                this.field_T.field_tb = this.field_T.field_tb + 1;
                break L2;
              }
            }
            L3: {
              if (!this.field_Q) {
                param0.field_rc = this.field_O;
                param0.field_xb = this.field_E;
                param0.field_v = this.field_F;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              param0.field_F = -Math.abs(param0.field_F);
              var3_int = this.field_O;
              if ((var3_int ^ -1) != -11) {
                if (11 != var3_int) {
                  if (12 == var3_int) {
                    param0.field_Q = param0.field_Q + 300;
                    param0.field_S = param0.field_Q;
                    break L4;
                  } else {
                    if (-14 != (var3_int ^ -1)) {
                      if (14 != var3_int) {
                        if (var3_int != 0) {
                          if (var3_int == 1) {
                            param0.field_wb = param0.field_wb + 2;
                            break L4;
                          } else {
                            if (var3_int != 2) {
                              if (3 == var3_int) {
                                param0.field_wb = param0.field_wb + 4;
                                break L4;
                              } else {
                                if ((var3_int ^ -1) == -5) {
                                  param0.field_wb = param0.field_wb + 5;
                                  break L4;
                                } else {
                                  if ((var3_int ^ -1) == -21) {
                                    param0.field_wb = param0.field_wb + 10;
                                    break L4;
                                  } else {
                                    L5: {
                                      if (5 != var3_int) {
                                        if (6 == var3_int) {
                                          break L5;
                                        } else {
                                          if (7 != var3_int) {
                                            if (var3_int != 8) {
                                              if ((var3_int ^ -1) == -10) {
                                                break L5;
                                              } else {
                                                if (var3_int != 29) {
                                                  if (28 == var3_int) {
                                                    param0.field_Fb = param0.field_Fb * 2;
                                                    break L4;
                                                  } else {
                                                    if ((var3_int ^ -1) != -16) {
                                                      if (-37 != (var3_int ^ -1)) {
                                                        if (var3_int != 43) {
                                                          if ((var3_int ^ -1) == -45) {
                                                            param0.a((byte) -65);
                                                            break L4;
                                                          } else {
                                                            if (-46 != (var3_int ^ -1)) {
                                                              break L4;
                                                            } else {
                                                              this.field_B.field_M = this.field_B.field_M + 1;
                                                              this.field_B.field_N = this.field_B.field_N - 22;
                                                              this.field_B.field_f = this.field_B.field_f + 10;
                                                              break L4;
                                                            }
                                                          }
                                                        } else {
                                                          param0.field_Cb = true;
                                                          break L4;
                                                        }
                                                      } else {
                                                        this.field_B.field_q = this.field_B.field_q + 6000000;
                                                        param0.field_Eb = param0.field_Eb + 100;
                                                        param0.e(-20039);
                                                        break L4;
                                                      }
                                                    } else {
                                                      var3_int = param0.field_Tb;
                                                      param0.field_Tb = 10;
                                                      param0.b((byte) -31, (je) null);
                                                      param0.field_Tb = var3_int;
                                                      break L4;
                                                    }
                                                  }
                                                } else {
                                                  param0.field_cb = param0.field_cb * 2;
                                                  break L4;
                                                }
                                              }
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            break L5;
                                          }
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    param0.field_x = param0.field_x + ag.a(111, this.field_O);
                                    param0.g(5);
                                    break L4;
                                  }
                                }
                              }
                            } else {
                              param0.field_wb = param0.field_wb + 3;
                              break L4;
                            }
                          }
                        } else {
                          param0.field_wb = param0.field_wb + 1;
                          break L4;
                        }
                      } else {
                        param0.field_Q = param0.field_Q + 500;
                        param0.field_S = param0.field_Q;
                        break L4;
                      }
                    } else {
                      param0.field_Q = param0.field_Q + 400;
                      param0.field_S = param0.field_Q;
                      break L4;
                    }
                  }
                } else {
                  param0.field_Q = param0.field_Q + 200;
                  param0.field_S = param0.field_Q;
                  break L4;
                }
              } else {
                param0.field_Q = param0.field_Q + 100;
                param0.field_S = param0.field_Q;
                break L4;
              }
            }
            L6: {
              var3_int = 13 / ((param1 - 5) / 63);
              if (param0.field_Bb == ed.field_j) {
                g.field_h = this.field_O;
                pd.field_X = 0;
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_186_0 = (RuntimeException) (var3);

            stackIn_186_1 = new StringBuilder().append("ne.E(");

            if (param0 == null) {
              stackIn_187_0 = (RuntimeException) ((Object) stackIn_186_0);
              stackIn_187_1 = (StringBuilder) ((Object) stackIn_186_1);
              stackIn_187_2 = "null";
              break L7;
            } else {
              stackIn_187_0 = (RuntimeException) ((Object) stackIn_186_0);
              stackIn_187_1 = (StringBuilder) ((Object) stackIn_186_1);
              stackIn_187_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_187_0), stackIn_187_2 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        boolean stackIn_11_0 = false;
        int stackIn_58_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_83_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        mb[] var7 = null;
        int var8 = 0;
        double var8_double = 0.0;
        int var9 = 0;
        int var10_int = 0;
        double var10_double = 0.0;
        mb var10 = null;
        int var11 = 0;
        qb var12_ref_qb = null;
        int var12 = 0;
        int var13 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            this.field_K = this.field_K - 1;
            if (this.field_K > 0) {
              if (null == this.field_T) {
                L1: {
                  L2: {
                    if (this.field_P != null) {
                      var2_int = this.field_P.field_E.length;
                      var6 = 0;
                      L3: while (true) {
                        L4: {
                          if ((var6 ^ -1) <= (var2_int ^ -1)) {
                            stackIn_58_0 = 0;
                            break L4;
                          } else {
                            var4 = 255 & this.field_P.field_E[var6] >> -1382634104;
                            var5 = this.field_P.field_E[var6] & 255;
                            var3 = (16711680 & this.field_P.field_E[var6]) >> -1003424688;
                            stackOut_10_0 = this.field_Q;
                            stackIn_58_0 = stackOut_10_0 ? 1 : 0;
                            stackIn_11_0 = stackOut_10_0;
                            L5: {
                              if (!stackIn_11_0) {
                                L6: {
                                  if (var5 <= 0) {
                                    break L6;
                                  } else {
                                    if (-1 != (this.field_K & 1 ^ -1)) {
                                      break L6;
                                    } else {
                                      var5--;
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if ((var3 ^ -1) < -1) {
                                    var3--;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var4 <= 0) {
                                  break L5;
                                } else {
                                  var4--;
                                  break L5;
                                }
                              } else {
                                L8: {
                                  if (-1 > (var4 ^ -1)) {
                                    var4--;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (var3 <= 0) {
                                    break L9;
                                  } else {
                                    if ((this.field_K & 3 ^ -1) != -1) {
                                      var3--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (0 >= var5) {
                                  break L5;
                                } else {
                                  if ((this.field_K & 3 ^ -1) != -1) {
                                    var5--;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            L10: {
                              this.field_P.field_E[var6] = var5 + ((var4 << -131247096) + (var3 << 1163931280));
                              if (!this.field_L) {
                                break L10;
                              } else {
                                if (0 != this.field_P.field_E[var6]) {
                                  this.field_P.field_E[var6] = ec.a(this.field_P.field_E[var6] ^ -1, 16777215);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var6++;
                            continue L3;
                          }
                        }
                        var6 = stackIn_58_0;
                        L11: while (true) {
                          if (2 <= var6) {
                            break L2;
                          } else {
                            this.field_C = this.field_C + 1;
                            stackIn_72_0 = var2_int ^ -1;

                            stackIn_72_1 = this.field_C ^ -1;

                            L12: {
                              if (stackIn_72_0 < stackIn_72_1) {
                                break L12;
                              } else {
                                this.field_C = 0;
                                break L12;
                              }
                            }
                            L13: {
                              this.field_P.field_E[this.field_C] = nc.a(this.field_O, (byte) -114).field_o[nc.a(this.field_O, (byte) -113).field_p[this.field_C]];
                              if (-1 == (this.field_P.field_E[this.field_C] ^ -1)) {
                                var6--;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var6++;
                            continue L11;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var2_int = -this.field_B.field_ab.a((byte) -99, this.field_z >> 2055532868) << -597104156;
                  stackIn_72_0 = -this.field_B.field_ab.a(false, this.field_z >> 649575652);
                  stackIn_72_1 = 1285948708;
                  break L1;
                }
                L14: {
                  var3 = stackIn_72_0 << stackIn_72_1;
                  var4 = -this.field_B.field_ab.b((byte) 121, this.field_z >> -1819128860) << -970523324;
                  var5 = var2_int;
                  if ((var3 ^ -1) == (var4 ^ -1)) {
                    break L14;
                  } else {
                    if ((this.field_I ^ -1) > (var4 ^ -1)) {
                      var5 = var3;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                L15: {
                  if ((this.field_I ^ -1) > (var5 ^ -1)) {
                    stackIn_83_0 = 0;
                    break L15;
                  } else {
                    stackIn_83_0 = 1;
                    break L15;
                  }
                }
                L16: {
                  var6 = stackIn_83_0;
                  if (4 != this.field_B.field_ab.b(114)) {
                    break L16;
                  } else {
                    if ((this.field_I ^ -1) <= -1) {
                      this.field_B.field_J.a((byte) 114, (kd) (this));
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L16;
                    }
                  }
                }
                L17: {
                  if (var6 != 0) {
                    break L17;
                  } else {
                    L18: {
                      this.field_S = this.field_S + this.field_B.field_z;
                      if (this.field_U) {
                        this.field_S = this.field_S - 3 * this.field_B.field_z / 4;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    this.field_I = this.field_I + this.field_S;
                    if ((var5 ^ -1) >= (this.field_I ^ -1)) {
                      var6 = 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                L19: {
                  if (var6 != 0) {
                    this.field_S = 0;
                    this.field_U = false;
                    this.field_I = var5;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (-4 != (this.field_B.field_ab.b(106) ^ -1)) {
                    break L20;
                  } else {
                    if (this.field_L) {
                      break L20;
                    } else {
                      var7_int = this.field_B.field_ab.a(-116) >> -833920063;
                      var8 = 600;
                      var9 = 5120;
                      var10_int = -var7_int + (this.field_z >> 1532186628);
                      var11 = (this.field_I >> -1497670012) + -var8;
                      if ((var9 * var9 ^ -1) >= (var11 * var11 + var10_int * var10_int ^ -1)) {
                        break L20;
                      } else {
                        this.field_L = true;
                        break L20;
                      }
                    }
                  }
                }
                L21: {
                  if (this.field_L) {
                    this.field_K = Math.min(500, -1 + this.field_K);
                    this.field_S = Math.min(this.field_S, 50);
                    if (this.field_B.field_h) {
                      break L21;
                    } else {
                      var7_int = 0;
                      L22: while (true) {
                        if (2 <= var7_int) {
                          break L21;
                        } else {
                          var8_double = Math.random() * 6.283185307179586;
                          var10_double = Math.random() * 512.0;
                          var12_ref_qb = nk.a(8, (int)(Math.sin(var8_double) * var10_double), this.field_B, 90, this.field_I, false, 250, (int)((double)(this.field_S - -10) - Math.abs(Math.cos(var8_double)) * var10_double), this.field_z, this.field_z);
                          this.field_B.field_O.a(3, var12_ref_qb);
                          var7_int++;
                          continue L22;
                        }
                      }
                    }
                  } else {
                    break L21;
                  }
                }
                this.field_z = Math.max(0, Math.min(-128 + (this.field_B.field_ab.a(106) << -136332028), this.field_z));
                var8 = 9 % ((param0 - -25) / 39);
                var7 = this.field_A;
                var9 = 0;
                L23: while (true) {
                  L24: {
                    if (var9 >= var7.length) {
                      break L24;
                    } else {
                      var10 = var7[var9];
                      if (var10 != null) {
                        L25: {
                          if (var10.field_V) {
                            break L25;
                          } else {
                            if (var10.field_Hb) {
                              break L25;
                            } else {
                              var11 = var10.field_Ub << 1107491523;
                              var12 = var10.field_Db << -478594812;
                              if (var10.field_hc + var11 < this.field_z - this.field_M / 2) {
                                break L25;
                              } else {
                                if (this.field_z - -(this.field_M / 2) <= var10.field_hc - var11) {
                                  break L25;
                                } else {
                                  if ((this.field_I - this.field_D ^ -1) < (var10.field_Gb ^ -1)) {
                                    break L25;
                                  } else {
                                    if ((var10.field_Gb + -var12 ^ -1) <= (this.field_I ^ -1)) {
                                      break L25;
                                    } else {
                                      this.a(var10, (byte) -86);
                                      fc.a((byte) -73, 102, this.field_z);
                                      break L24;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var9++;
                        continue L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ne.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_R = null;
        field_J = null;
        if (param0 != -23261) {
            return;
        }
        try {
            field_y = null;
            field_H = null;
            field_N = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ne.B(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0;
        RuntimeException var3 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (!f.a(param1, 4, param2)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 113 / ((5 - param0) / 50);
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var4 >= param1.length()) {
                    stackIn_17_0 = 1;
                    break L2;
                  } else {
                    stackOut_8_0 = im.a(param1.charAt(var4), false);
                    stackIn_17_0 = stackOut_8_0 ? 1 : 0;
                    stackIn_9_0 = stackOut_8_0;
                    if (!stackIn_9_0) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ne.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        try {
          L0: {
            var5_int = (this.field_z * param0 >> -540077456) + param3;
            var6 = param1 - -(this.field_I * param0 >> 1683350960);
            var7 = this.field_P.field_z / 2 - -2;
            var8 = 2 + this.field_P.field_B / 2;
            var9 = 3 * (param0 * this.field_M >> -410475216) / 2;
            var10 = (this.field_D * param0 >> -127886512) * 3 / 2;
            if (param2 == -1) {
              L1: {
                var11 = Math.min(256, this.field_K / 2);
                if (null != sl.field_p) {
                  break L1;
                } else {
                  sl.field_p = new wk(var9, var8 + (var10 + 5));
                  break L1;
                }
              }
              L2: {
                sl.field_p.d();
                pb.a(0, 0, sl.field_p.field_z, sl.field_p.field_B, 0);
                var6 = var6 - (var10 + -5);
                var12 = this.field_K / 5 % 3;
                var5_int = var5_int - var9 / 2;
                var13 = 6719624;
                if (this.field_Q) {
                  var13 = 8921736;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var14 = sl.field_p.field_B - var10;
                  if (!this.field_L) {
                    break L4;
                  } else {
                    if (Math.random() < 0.1) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var15 = (var9 + -var7) / 2 - (-(this.field_C % this.field_P.field_A / 2) - (this.field_P.field_D / 2 - -(int)(2.0 * Math.sin((double)this.field_K * 0.2))));
                  var16 = 2 + (this.field_P.field_H / 2 + this.field_C / (this.field_P.field_F * 2) + (int)(Math.cos((double)this.field_K * 0.3) * 2.0));
                  this.field_P.b((var9 + -var7) / 2 - -(int)(2.0 * Math.sin(0.2 * (double)this.field_K)), 2 - -(int)(Math.cos((double)this.field_K * 0.3) * 2.0));
                  stackIn_16_0 = var9 / 2 - -(int)(Math.sin((double)this.field_K * 0.1) * 5.0);

                  stackIn_16_1 = var14;

                  stackIn_16_2 = var15;

                  stackIn_16_3 = var16;

                  if (this.field_Q) {
                    stackIn_17_0 = stackIn_16_0;
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = stackIn_16_2;
                    stackIn_17_3 = stackIn_16_3;
                    stackIn_17_4 = 12264123;
                    break L5;
                  } else {
                    stackIn_17_0 = stackIn_16_0;
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = stackIn_16_2;
                    stackIn_17_3 = stackIn_16_3;
                    stackIn_17_4 = 12303138;
                    break L5;
                  }
                }
                L6: {
                  pb.f(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, 192);
                  pb.a(-1 + var15, var16, var13);
                  pb.a(var15, var16 + -1, var13);
                  pb.a(1 + var15, var16, var13);
                  pb.a(var15, var16 + 1, var13);
                  stackIn_20_0 = var15;

                  stackIn_20_1 = var16;

                  if (this.field_Q) {
                    stackIn_21_0 = stackIn_20_0;
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = 16755455;
                    break L6;
                  } else {
                    stackIn_21_0 = stackIn_20_0;
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = 11206655;
                    break L6;
                  }
                }
                pb.a(stackIn_21_0, stackIn_21_1, stackIn_21_2);
                break L3;
              }
              L7: {
                ml.field_c[var12].b(0, var14, var9, var10);
                if (this.field_L) {
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                var6 = var6 - var10;
                sb.field_bb.b((byte) 123);
                if (-257 < (var11 ^ -1)) {
                  sl.field_p.b(var5_int, var6, var11);
                  break L8;
                } else {
                  sl.field_p.a(var5_int, var6);
                  break L8;
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
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ne.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ne(ee param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        gk var4 = null;
        jc var5 = null;
        mb var6 = null;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        this.field_Q = false;
        this.field_S = 0;
        this.field_K = 3000;
        this.field_F = 1500;
        this.field_D = 4096;
        this.field_E = true;
        this.field_M = 4096;
        this.field_L = false;
        try {
          L0: {
            this.field_O = param1;
            this.field_B = param0;
            var3_int = this.field_B.field_kb + this.field_B.field_Q;
            this.field_A = new mb[var3_int];
            var4_int = 0;
            var5 = new jc(this.field_B.field_K);
            var6 = (mb) ((Object) var5.b(2));
            L1: while (true) {
              L2: {
                if (null == var6) {
                  var4_int = this.field_O;
                  stackIn_14_0 = -25;
                  stackIn_14_1 = var4_int ^ -1;
                  break L2;
                } else {
                  stackIn_14_0 = -1;

                  stackIn_14_1 = var6.field_Bb ^ -1;

                  L3: {
                    if (stackIn_14_0 < stackIn_14_1) {
                      break L3;
                    } else {
                      if ((var3_int ^ -1) >= (var6.field_Bb ^ -1)) {
                        break L3;
                      } else {
                        incrementValue$0 = var4_int;
                        var4_int++;
                        this.field_A[incrementValue$0] = var6;
                        break L3;
                      }
                    }
                  }
                  var6 = (mb) ((Object) var5.d(2));
                  continue L1;
                }
              }
              L4: {
                if (stackIn_14_0 == stackIn_14_1) {
                  this.field_E = false;
                  this.field_F = 2147483647;
                  break L4;
                } else {
                  L5: {
                    if (-37 == (var4_int ^ -1)) {
                      break L5;
                    } else {
                      if (var4_int != 15) {
                        if (var4_int == 44) {
                          break L5;
                        } else {
                          if (-46 == (var4_int ^ -1)) {
                            break L5;
                          } else {
                            if ((var4_int ^ -1) == -44) {
                              this.field_K = 2147483647;
                              this.field_Q = true;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_Q = true;
                  break L4;
                }
              }
              L6: {
                if (!this.field_Q) {
                  break L6;
                } else {
                  this.field_F = 100;
                  this.field_E = false;
                  break L6;
                }
              }
              L7: {
                if (!this.field_B.field_h) {
                  var4 = nc.a(this.field_O, (byte) -97);
                  this.field_P = new wk(var4.field_a, var4.field_i);
                  this.field_P.field_H = var4.field_n / 2;
                  this.field_P.field_D = var4.field_j / 2;
                  break L7;
                } else {
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var3);

            stackIn_52_1 = new StringBuilder().append("ne.<init>(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L8;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
    }

    static {
        field_J = "Progress <col=ffffff><%0>%</col>";
        field_y = new gi(256);
        field_H = "Only show game chat from my friends";
    }
}
