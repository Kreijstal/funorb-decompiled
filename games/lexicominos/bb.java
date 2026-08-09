/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends nb implements jk {
    private String[] field_D;
    private ag field_L;
    private kf[] field_G;
    static m field_J;
    static volatile int field_I;
    static String field_K;
    static String[] field_F;
    static db field_C;

    final void a(byte param0, int param1, int param2, int param3) {
        le var5;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = ql.field_Q;
          if (null != this.field_D) {
            var5.a(ka.field_a, this.field_t + param2, param1 + this.field_o, this.field_j, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_E);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(String[] param0, boolean param1) {
        kf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        boolean stackIn_16_3 = false;
        kf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        kf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        kf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        kf stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        boolean stackIn_21_3 = false;
        kf stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        kf stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        kf stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_A.g(-81);
                        if (param0 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0.length == 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_D = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var3_int = param0.length;
                        this.field_D = new String[var3_int];
                        var4_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3_int <= var4_int) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_D[var4_int] = pj.a((CharSequence) ((Object) param0[var4_int]), (byte) -126).replace(' ', ' ');
                        var4_int++;
                        if (var6 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!param1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_J = (m) null;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = new uj(ql.field_Q, 0, 1);
                        this.field_G = new kf[1 + var3_int];
                        var5 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var3_int <= var5) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_G[var5] = new kf(this.field_D[var5], (vd) (this));
                        this.field_G[var5].field_i = (rd) ((Object) var4);
                        this.field_G[var5].field_q = cb.field_A;
                        stackIn_21_0 = this.field_G[var5];
                        stackIn_16_0 = stackIn_21_0;
                        stackIn_21_1 = 15;
                        stackIn_16_1 = stackIn_21_1;
                        stackIn_21_2 = 80;
                        stackIn_16_2 = stackIn_21_2;
                        stackIn_21_3 = param1;
                        stackIn_16_3 = stackIn_21_3;
                        if (var6 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = (kf) ((Object) stackIn_16_0);
                        stackIn_17_0 = stackIn_18_0;
                        stackIn_18_1 = stackIn_16_1;
                        stackIn_17_1 = stackIn_18_1;
                        stackIn_18_2 = stackIn_16_2;
                        stackIn_17_2 = stackIn_18_2;
                        if (stackIn_16_3) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = (kf) ((Object) stackIn_17_0);
                        stackIn_19_1 = stackIn_17_1;
                        stackIn_19_2 = stackIn_17_2;
                        stackIn_19_3 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = (kf) ((Object) stackIn_18_0);
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = stackIn_18_2;
                        stackIn_19_3 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((kf) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0, 20 + 16 * var5, 0);
                        this.b((byte) 112, this.field_G[var5]);
                        var5++;
                        if (var6 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_G[var3_int] = new kf(bc.field_J, (vd) (this));
                        this.field_G[var3_int].field_i = (rd) ((Object) var4);
                        stackIn_21_0 = this.field_G[var3_int];
                        stackIn_21_1 = 15;
                        stackIn_21_2 = 100;
                        stackIn_21_3 = param1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (kf) ((Object) stackIn_21_0);
                        stackIn_22_0 = stackIn_23_0;
                        stackIn_23_1 = stackIn_21_1;
                        stackIn_22_1 = stackIn_23_1;
                        stackIn_23_2 = stackIn_21_2;
                        stackIn_22_2 = stackIn_23_2;
                        if (stackIn_21_3) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = (kf) ((Object) stackIn_22_0);
                        stackIn_24_1 = stackIn_22_1;
                        stackIn_24_2 = stackIn_22_2;
                        stackIn_24_3 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (kf) ((Object) stackIn_23_0);
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((kf) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3 != 0, (1 + var3_int) * 16 + 20, 0);
                        this.b((byte) -80, this.field_G[var3_int]);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var3);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("bb.C(");
                    stackIn_27_1 = stackIn_28_1;
                    if (param0 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 120 % ((param3 - -13) / 55);
            if (super.a(param0, param1, param2, (byte) 42)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackIn_7_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param1) {
                  stackIn_11_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("bb.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var6_int = 0;
        int var7 = 0;
        kf stackIn_6_0 = null;
        kf stackIn_6_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var6_int >= this.field_D.length) {
                      break L4;
                    } else {
                      stackIn_6_0 = this.field_G[var6_int];

                      stackIn_6_1 = (kf) (param4);

                      if (var7 != 0) {
                        if (stackIn_6_0 == stackIn_6_1) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        L5: {
                          if (stackIn_6_0 != stackIn_6_1) {
                            break L5;
                          } else {
                            this.field_L.a(this.field_D[var6_int], (byte) 110);
                            break L5;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (this.field_G[this.field_D.length] == param4) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                this.field_L.a((byte) -12);
                break L2;
              }
              if (param2 == 215535458) {
                break L0;
              } else {
                field_F = (String[]) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var6);

            stackIn_18_1 = new StringBuilder().append("bb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
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
        boolean stackIn_23_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_22_0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    var4 = ck.a(param0, (byte) -48);
                    if (var4 == null) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (cf.a(var4.charAt(0), (byte) 78)) {
                            break L2;
                          } else {
                            if (cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                L4: {
                                  L5: {
                                    if (var6 >= param0.length()) {
                                      break L5;
                                    } else {
                                      var7 = param0.charAt(var6);
                                      stackOut_22_0 = cf.a((char) var7, (byte) 78);
                                      stackIn_33_0 = stackOut_22_0 ? 1 : 0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (var8 != 0) {
                                        break L4;
                                      } else {
                                        L6: {
                                          L7: {
                                            if (!stackIn_23_0) {
                                              break L7;
                                            } else {
                                              var5++;
                                              if (var8 == 0) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          break L6;
                                        }
                                        L8: {
                                          if (2 > var5) {
                                            break L8;
                                          } else {
                                            if (param1) {
                                              break L8;
                                            } else {
                                              stackIn_30_0 = 0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var8 == 0) {
                                          continue L3;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  stackIn_33_0 = var5 ^ -1;
                                  break L4;
                                }
                                if (stackIn_33_0 < param2) {
                                  stackIn_36_0 = 0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("bb.D(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L9;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  return stackIn_36_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_F = null;
        field_C = null;
        field_K = null;
        if (param0 != -26) {
            field_C = (db) null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    bb(ag param0) {
        super(0, 0, 0, 0, (rd) null);
        try {
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = 0;
        field_J = new m("email");
        field_K = "Create";
        field_F = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new db(311, 450);
    }
}
