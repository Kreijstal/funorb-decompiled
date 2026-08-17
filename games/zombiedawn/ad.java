/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vg {
    private rb field_d;
    static String field_o;
    private int field_p;
    private boolean field_m;
    static vn[] field_f;
    private int field_k;
    private String field_l;
    static vo field_h;
    private int field_j;
    private int field_i;
    static vn[][] field_g;
    static int field_e;
    private int field_n;

    private final oe a(rb param0, boolean param1, String param2, int param3) {
        oe discarded$1 = null;
        oe var5 = null;
        RuntimeException var5_ref = null;
        oe stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                discarded$1 = this.a((rb) null, false, (String) null, -57);
                break L1;
              }
            }
            var5 = new oe(param3 - param0.field_I, param3 + param0.field_x, param2.length());
            this.field_b = new oe[]{var5};
            stackIn_4_0 = (oe) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("ad.P(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void a(String param0, int param1, rb param2, byte param3, int param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oe var6 = null;
        RuntimeException var6_ref = null;
        try {
          L0: {
            if (null != param0) {
              L1: {
                if (param2 != this.field_d) {
                  break L1;
                } else {
                  if (!this.field_m) {
                    break L1;
                  } else {
                    if (2 != this.field_p) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (this.field_l.equals(param0)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_d = param2;
                this.field_p = 2;
                this.field_m = true;
                this.field_l = param0;
                var6 = this.a(param2, false, param0, param1);
                var6.field_e[0] = param4 - param2.b(param0);
                var6.field_e[param0.length()] = param4;
                ma.a(var6, 0, param0, param2, false);
                if (param3 == 83) {
                  break L2;
                } else {
                  this.a((String) null, (byte) 105, 37, (rb) null, 104, 15, -99, 98);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var6_ref);

            stackIn_26_1 = new StringBuilder().append("ad.N(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static short[] a(short[] param0, boolean param1, int param2, am param3) {
        Object stackIn_3_0 = null;
        short[] stackIn_25_0 = null;
        short[] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param3.k(90, param2);
                        if (-1 != (var4_int ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (short[]) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0.length != var4_int) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0 = new short[var4_int];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ad.b(105);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = param3.k(67, 4);
                        var6 = (short)param3.k(13, 16);
                        if ((var5 ^ -1) >= -1) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param0[var7] = (short)(param3.k(60, var5) + var6);
                        var7++;
                        if (var8 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_29_0 = (short[]) (param0);
                        stackIn_25_0 = stackIn_29_0;
                        if (var8 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_25_0[var7] = (short) var6;
                        var7++;
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (short[]) (param0);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_33_0 = (RuntimeException) (var4);
                    stackIn_31_0 = stackIn_33_0;
                    stackIn_33_1 = new StringBuilder().append("ad.H(");
                    stackIn_31_1 = stackIn_33_1;
                    if (param0 == null) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_34_2 = "{...}";
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_34_2 = "null";
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_0 = stackIn_37_0;
                    stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_35_1 = stackIn_37_1;
                    if (param3 == null) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw sh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_g = (vn[][]) null;
        field_h = null;
        if (param0 != -1819016370) {
            return;
        }
        try {
            field_o = null;
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ad.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, rb param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        oe var7 = null;
        int var8 = 0;
        try {
          L0: {
            var6_int = -41 % ((-86 - param1) / 36);
            if (param3 == null) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_d != param4) {
                  break L1;
                } else {
                  if (!this.field_m) {
                    break L1;
                  } else {
                    if (1 != this.field_p) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (this.field_l.equals(param3)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              this.field_m = true;
              this.field_d = param4;
              this.field_p = 1;
              var7 = this.a(param4, false, param3, param2);
              var8 = param4.b(param3);
              var7.field_e[0] = param0 + -(var8 >> 2144149825);
              var7.field_e[param3.length()] = param0 + (var8 >> -2049959999);
              ma.a(var7, 0, param3, param4, false);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var6);

            stackIn_26_1 = new StringBuilder().append("ad.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(String param0, byte param1, int param2, rb param3, int param4, int param5, int param6, int param7) {
        oe discarded$0 = null;
        oe stackIn_65_0;
        oe stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        oe stackIn_66_0 = null;
        oe stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        oe stackIn_72_0 = null;
        oe stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        oe var14 = null;
        int var15 = 0;
        var15 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                param4 = param3.field_C;
                break L1;
              } else {
                break L1;
              }
            }
            if (null == param0) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_d != param3) {
                  break L2;
                } else {
                  if (this.field_m) {
                    break L2;
                  } else {
                    if ((this.field_p ^ -1) != (param6 ^ -1)) {
                      break L2;
                    } else {
                      if (param5 != this.field_n) {
                        break L2;
                      } else {
                        if (param4 != this.field_j) {
                          break L2;
                        } else {
                          if (param2 != this.field_i) {
                            break L2;
                          } else {
                            if (this.field_k != param7) {
                              break L2;
                            } else {
                              if (this.field_l == null) {
                                break L2;
                              } else {
                                if (!this.field_l.equals(param0)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_m = false;
                this.field_j = param4;
                this.field_d = param3;
                this.field_l = param0;
                if (param1 == -106) {
                  break L3;
                } else {
                  discarded$0 = this.a((rb) null, false, (String) null, 35);
                  break L3;
                }
              }
              L4: {
                this.field_p = param6;
                this.field_k = param7;
                this.field_i = param2;
                this.field_n = param5;
                var9 = new String[1 + param3.b(param0, param7)];
                var10 = Math.max(1, param3.a(param0, new int[]{param7}, var9));
                if (this.field_n != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    this.field_n = 1;
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if ((this.field_n ^ -1) == -1) {
                    break L6;
                  } else {
                    L7: {
                      if (-2 == (this.field_n ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          if ((this.field_n ^ -1) == -3) {
                            break L8;
                          } else {
                            L9: {
                              var12 = (this.field_i + -(this.field_j * var10)) / (1 + var10);
                              if ((var12 ^ -1) <= -1) {
                                break L9;
                              } else {
                                var12 = 0;
                                break L9;
                              }
                            }
                            var11 = param3.field_I - -var12;
                            this.field_j = this.field_j + var12;
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var11 = -param3.field_x + (this.field_i + -(var10 * this.field_j));
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = param3.field_I - -(-(var10 * this.field_j) + this.field_i >> 399672609);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = param3.field_I;
                break L5;
              }
              this.field_b = new oe[var10];
              var12 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    if (var10 <= var12) {
                      break L12;
                    } else {
                      var13 = var9[var12];
                      if (var15 != 0) {
                        break L11;
                      } else {
                        L13: {
                          stackIn_65_0 = null;

                          stackIn_65_1 = null;

                          stackIn_65_2 = -param3.field_I + var11;

                          stackIn_65_3 = param3.field_x + var11;

                          if (null == var13) {
                            stackIn_66_0 = null;
                            stackIn_66_1 = null;
                            stackIn_66_2 = stackIn_65_2;
                            stackIn_66_3 = stackIn_65_3;
                            stackIn_66_4 = 0;
                            break L13;
                          } else {




                            stackIn_66_0 = null;
                            stackIn_66_1 = null;
                            stackIn_66_2 = stackIn_65_2;
                            stackIn_66_3 = stackIn_65_3;
                            stackIn_66_4 = var13.length();
                            break L13;
                          }
                        }
                        L14: {
                          var14 = new oe(stackIn_66_2, stackIn_66_3, stackIn_66_4);
                          var14.field_e[0] = 0;
                          if (null == var13) {
                            break L14;
                          } else {
                            L15: {
                              var14.field_e[var13.length()] = param3.b(var13);
                              stackIn_72_0 = (oe) (var14);

                              if (3 == param6) {
                                stackIn_73_0 = (oe) ((Object) stackIn_72_0);
                                stackIn_73_1 = this.a(param3.b(var13), var13, param7, 25);
                                break L15;
                              } else {

                                stackIn_73_0 = (oe) ((Object) stackIn_72_0);
                                stackIn_73_1 = 0;
                                break L15;
                              }
                            }
                            ma.a(stackIn_73_0, stackIn_73_1, var13, param3, false);
                            break L14;
                          }
                        }
                        var11 = var11 + param4;
                        this.field_b[var12] = var14;
                        var12++;
                        if (var15 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  break L11;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var9_ref = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var9_ref);

            stackIn_79_1 = new StringBuilder().append("ad.O(");

            if (param0 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L16;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L17;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L17;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_80_0), stackIn_84_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, int[] param1, gd param2, byte param3, boolean param4, boolean param5, int[] param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        if (param3 == 50) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_g = (vn[][]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var21 = param6[3] >> 1948409378;
                        var22 = param6[4] >> 274605346;
                        var23 = param6[5] >> 28522626;
                        var24 = param6[6] >> 1957538914;
                        var25 = param6[7] >> 215295106;
                        var26 = param6[8] >> -1957638942;
                        var27 = param6[9] >> -1768749374;
                        var28 = param6[10] >> 9571170;
                        var12 = param1[4] * var22 + (param1[3] * var21 - -(var23 * param1[5])) >> 959748782;
                        var29 = param6[11] >> -959668030;
                        var13 = param1[4] * var25 + (var24 * param1[3] - -(param1[5] * var26)) >> -1365705874;
                        var16 = var25 * param1[7] + (var24 * param1[6] - -(param1[8] * var26)) >> 230704526;
                        var18 = param1[11] * var23 + var22 * param1[10] + param1[9] * var21 >> 866197614;
                        var17 = var28 * param1[7] + (var27 * param1[6] - -(param1[8] * var29)) >> -1942211218;
                        var20 = param1[11] * var29 + (param1[9] * var27 - -(param1[10] * var28)) >> -1819016370;
                        var14 = var29 * param1[5] + var27 * param1[3] - -(var28 * param1[4]) >> 290614222;
                        var15 = var23 * param1[8] + var22 * param1[7] + param1[6] * var21 >> 257579406;
                        var19 = var25 * param1[10] + param1[9] * var24 - -(var26 * param1[11]) >> 1659714062;
                        var21 = -param6[0] + param1[0];
                        var22 = -param6[1] + param1[1];
                        var23 = param1[2] + -param6[2];
                        var9 = param6[5] * var23 + (var21 * param6[3] + var22 * param6[4]) >> 16 + -f.field_a;
                        var10 = var22 * param6[7] + var21 * param6[6] - -(param6[8] * var23) >> -f.field_a + 16;
                        var11 = var22 * param6[10] + param6[9] * var21 - -(param6[11] * var23) >> -1928809104;
                        var21 = en.field_a;
                        var22 = en.field_i;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2.field_k <= var23) {
                            statePc = 27;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var24 = param2.field_G[var23];
                        var25 = param2.field_B[var23];
                        var26 = param2.field_m[var23];
                        var27 = var9 - -(var25 * var15 + (var24 * var12 + var26 * var18) >> -f.field_a + 16);
                        var28 = var10 - -(var19 * var26 + var25 * var16 + var24 * var13 >> -f.field_a + 16);
                        var29 = var11 - -(var26 * var20 + (var24 * var14 + var25 * var17) >> 356062800);
                        stackIn_67_0 = var29;
                        stackIn_7_0 = stackIn_67_0;
                        stackIn_67_1 = 50;
                        stackIn_7_1 = stackIn_67_1;
                        if (var30 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pj.field_s[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        to.field_a[var23] = var21 - -(var27 / var29);
                        wc.field_Nb[var23] = var28 / var29 + var22;
                        if (var29 < var7_int) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_int = var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var8 ^ -1) <= (var29 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = var29;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        pj.field_s[var23] = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param4) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ip.field_r[var23] = var27 >> f.field_a;
                        fm.field_G[var23] = var28 >> f.field_a;
                        g.field_P[var23] = var29;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == param2.field_e) {
                            statePc = 58;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == param2.field_j) {
                            statePc = 58;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param2.field_A == null) {
                            statePc = 58;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null == param2.field_N) {
                            statePc = 58;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param2.field_i) {
                            statePc = 58;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param2.field_I == null) {
                            statePc = 58;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == param2.field_D) {
                            statePc = 58;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param2.field_t == null) {
                            statePc = 58;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null == param2.field_z) {
                            statePc = 58;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var23 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((param2.field_c ^ -1) >= (var23 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var24 = param2.field_e[var23];
                        var25 = param2.field_j[var23];
                        var26 = param2.field_A[var23];
                        qk.field_Cb[var23] = var9 - -(var26 * var18 + (var24 * var12 - -(var25 * var15)) >> -1111902768);
                        kj.field_b[var23] = var10 - -(var19 * var26 + (var13 * var24 - -(var25 * var16)) >> -1721624112);
                        po.field_zb[var23] = (var26 * var20 + (var24 * var14 - -(var17 * var25)) >> 1722537168) + var11;
                        var24 = param2.field_N[var23];
                        var25 = param2.field_i[var23];
                        var26 = param2.field_I[var23];
                        rm.field_c[var23] = var9 - -(var18 * var26 + (var25 * var15 + var12 * var24) >> 959848400);
                        lb.field_db[var23] = (var13 * var24 + (var16 * var25 - -(var26 * var19)) >> -2133258512) + var10;
                        ce.field_v[var23] = var11 - -(var24 * var14 + var17 * var25 - -(var26 * var20) >> -1361914288);
                        var24 = param2.field_D[var23];
                        var25 = param2.field_t[var23];
                        var26 = param2.field_z[var23];
                        d.field_d[var23] = (var26 * var18 + var24 * var12 + var25 * var15 >> 785467088) + var9;
                        f.field_g[var23] = (var19 * var26 + var25 * var16 + var13 * var24 >> -1128488112) + var10;
                        wo.field_zb[var23] = (var24 * var14 - (-(var17 * var25) - var26 * var20) >> -422103632) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var30 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!param0) {
                            statePc = 66;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9 = param1[3];
                        var10 = param1[4];
                        var11 = param1[5];
                        var12 = param1[6];
                        var13 = param1[7];
                        var14 = param1[8];
                        var15 = param1[9];
                        var16 = param1[10];
                        var17 = param1[11];
                        var18 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((param2.field_f ^ -1) >= (var18 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_67_0 = og.field_y.length;
                        stackIn_62_0 = stackIn_67_0;
                        stackIn_67_1 = var18;
                        stackIn_62_1 = stackIn_67_1;
                        if (var30 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 <= stackIn_62_1) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19 = param2.field_M[var18];
                        var20 = param2.field_q[var18];
                        var21 = param2.field_y[var18];
                        og.field_y[var18] = var15 * var21 + var19 * var9 - -(var20 * var12) >> 1162075376;
                        jl.field_s[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> -1124428720;
                        qb.field_c[var18] = var11 * var19 - (-(var14 * var20) + -(var21 * var17)) >> -883768432;
                        var18++;
                        if (var30 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = 0;
                        stackIn_67_1 = var7_int;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        po.a(stackIn_67_0, stackIn_67_1, param5, var8, param2);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_72_0 = (RuntimeException) (var7);
                    stackIn_70_0 = stackIn_72_0;
                    stackIn_72_1 = new StringBuilder().append("ad.K(").append(param0).append(',');
                    stackIn_70_1 = stackIn_72_1;
                    if (param1 == null) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_73_2 = "{...}";
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_73_2 = "null";
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_0 = stackIn_76_0;
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
                    stackIn_74_1 = stackIn_76_1;
                    if (param2 == null) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_80_0;
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_78_1 = stackIn_80_1;
                    if (param6 == null) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_81_2 = "{...}";
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_81_2 = "null";
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    throw sh.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
                }
                case 82: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, rb param1, String param2, int param3, int param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oe var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            if (null == param2) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 != this.field_d) {
                  break L1;
                } else {
                  if (!this.field_m) {
                    break L1;
                  } else {
                    if (this.field_p != 0) {
                      break L1;
                    } else {
                      if (this.field_l == null) {
                        break L1;
                      } else {
                        if (this.field_l.equals(param2)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              this.field_l = param2;
              this.field_d = param1;
              this.field_m = true;
              this.field_p = 0;
              var6 = this.a(param1, false, param2, param4);
              var6.field_e[0] = param3;
              var6.field_e[param2.length()] = param1.b(param2) + param3;
              var7 = 91 % ((19 - param0) / 59);
              ma.a(var6, 0, param2, param1, false);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var6_ref);

            stackIn_26_1 = new StringBuilder().append("ad.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void c(byte param0) {
        try {
            wo.field_xb.j(param0 ^ -636330917);
            wo.field_xb.a(new lb(wo.field_xb), true);
            if (param0 != 122) {
                ad.b(-91);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ad.I(" + param0 + ')');
        }
    }

    public ad() {
    }

    static {
        field_o = "Waiting for extra data";
        field_h = new vo();
        field_g = new vn[2][];
    }
}
