/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends mh {
    private int field_Xb;
    static int field_Wb;
    private int field_dc;
    private char[] field_fc;
    static String field_ac;
    private rk[] field_Qb;
    static mf field_gc;
    private int field_Rb;
    private int field_Sb;
    private int field_Tb;
    private og[] field_bc;
    private int[] field_Ub;
    private int field_cc;
    static int field_Zb;
    private int field_Pb;
    private og field_Vb;
    private int field_ec;
    static dh field_Yb;

    final static void a(String[] args, tp[] param1, byte[] param2, jp[][] param3, byte[] param4, int[] param5, int param6, jp[][] param7, mf param8, int param9, mf param10, String[][] param11, mf param12, int param13, int[] param14, String[][] param15, boolean param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        try {
          L0: {
            lc.a(param15, param1, (byte) 47, (String[]) null, param6, args, param11, param12, param8, param10, param14, param7, param9, param16, param3, param4, param2, param5, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var17 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var17);

            stackIn_5_1 = new StringBuilder().append("og.J(");

            if (args == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');

            if (param15 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L13;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_54_2 + ',' + param16 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -81) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.i(-108);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_ec = param0;
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var5 ^ -1) <= (this.field_cc ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3_int = var5 * this.field_dc;
                        var4 = this.field_ec * this.field_ec;
                        this.field_Qb[var5].field_zb = (var4 * (-this.field_db + this.field_Sb) + var3_int * (144 - var4)) / 144;
                        var5++;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw qb.a((Throwable) ((Object) var3), "og.E(" + param0 + ',' + param1 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        og var4 = null;
        rk var5 = null;
        int var6 = 0;
        rk stackIn_13_0 = null;
        rk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            if (param0 == 38) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (this.field_Qb.length <= var4_int) {
                      break L3;
                    } else {
                      var5 = this.field_Qb[var4_int];
                      stackIn_17_0 = -2;

                      stackIn_17_1 = var5.field_L ^ -1;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_17_0 != stackIn_17_1) {
                            break L4;
                          } else {
                            L5: {
                              this.a(param2, var4_int, param0 ^ 38, param1);
                              stackIn_13_0 = (rk) (var5);

                              if (this.field_Tb != var4_int) {
                                stackIn_14_0 = (rk) ((Object) stackIn_13_0);
                                stackIn_14_1 = 0;
                                break L5;
                              } else {

                                stackIn_14_0 = (rk) ((Object) stackIn_13_0);
                                stackIn_14_1 = 1;
                                break L5;
                              }
                            }
                            stackIn_14_0.field_Nb = stackIn_14_1 != 0;
                            break L4;
                          }
                        }
                        var4_int++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_17_0 = -1;
                  stackIn_17_1 = this.field_Tb;
                  break L2;
                }
                L6: {
                  if (stackIn_17_0 != stackIn_17_1) {
                    var4 = this.field_bc[this.field_Tb];
                    if (null == var4) {
                      break L6;
                    } else {
                      var4.a(param0 ^ 0, param1, param2);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 > (this.field_ec ^ -1)) {
                    this.a(-1 + this.field_ec, (byte) -81);
                    break L7;
                  } else {
                    break L7;
                  }
                }
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
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "og.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean h(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -26090) {
                break L1;
              } else {
                field_Zb = -8;
                break L1;
              }
            }
            stackIn_4_0 = ol.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "og.JA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void f(byte param0) {
        RuntimeException runtimeException = null;
        rk[] var2 = null;
        int var3 = 0;
        rk var4 = null;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = this.field_Qb;
                        if (param0 == 41) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_Qb = (rk[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 >= var2.length) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = var2[var3];
                        var4.field_L = 0;
                        var4.field_Nb = false;
                        var3++;
                        if (var5 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null != this.field_Vb) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_Vb.f((byte) 41);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_Vb.b((byte) 111);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_Vb = null;
                        this.field_Tb = -1;
                        this.a(12, (byte) -81);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw qb.a((Throwable) ((Object) runtimeException), "og.H(" + param0 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        rk[] var3 = null;
        int var4 = 0;
        rk var5 = null;
        int var6 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 28) {
                break L1;
              } else {
                field_gc = (mf) null;
                break L1;
              }
            }
            var2_int = 0;
            var3 = this.field_Qb;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var4 >= var3.length) {
                      break L5;
                    } else {
                      var5 = var3[var4];
                      stackIn_17_0 = var2_int;

                      stackIn_17_1 = -1;

                      if (var6 != 0) {
                        break L4;
                      } else {
                        L6: {


                          if (stackIn_17_1 == (var5.field_L ^ -1)) {

                            stackIn_13_1 = 0;
                            break L6;
                          } else {

                            stackIn_13_1 = 1;
                            break L6;
                          }
                        }
                        var2_int = stackIn_17_0 | stackIn_13_1;
                        var4++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var2_int != 0) {
                    break L3;
                  } else {
                    stackIn_17_0 = -1;
                    stackIn_17_1 = this.field_Tb;
                    break L4;
                  }
                }
                if (stackIn_17_0 == stackIn_17_1) {
                  break L3;
                } else {
                  if (this.field_bc[this.field_Tb] != null) {
                    var2_int = this.field_bc[this.field_Tb].i(28) ? 1 : 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_25_0 = var2_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "og.A(" + param0 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_Tb == param1) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_bc[param1] != null) {
                      break L3;
                    } else {
                      L4: {
                        if (this.field_Ub[param1] == -1) {
                          break L4;
                        } else {
                          L5: {
                            var5_int = this.field_Ub[param1] | 32768;
                            var6 = ng.field_b;
                            if ((var6 ^ -1) != -1) {
                              break L5;
                            } else {
                              if (o.field_e == null) {
                                break L5;
                              } else {
                                var6 = 1;
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (tm.a(var6, (byte) 18) == 2) {
                              eo.a(0, param0, 1, var6);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          c.a(var5_int, tk.field_p, (byte) -113, ng.field_b, param3, (String) null);
                          km.a(var5_int, 29295, qn.field_n, tk.field_p, ng.field_b);
                          rd.a(-1);
                          bh.m(-69);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      po.a(true);
                      rd.a(-1);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.f((byte) 41);
                  this.a(0, (byte) -81);
                  this.field_Tb = param1;
                  this.field_Vb = this.field_bc[this.field_Tb];
                  of.a(param2 ^ -2, this.field_Vb);
                  this.field_Vb.a(12, (byte) -81);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.f((byte) 41);
              this.a(0, (byte) -81);
              break L1;
            }
            L7: {
              if (param2 == 0) {
                break L7;
              } else {
                this.field_Qb = (rk[]) null;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var5), "og.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    og(long param0, mh param1, mh param2, mh param3, og[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        Object stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        dh var10 = null;
        RuntimeException var10_ref = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = BrickABrac.field_J ? 1 : 0;
        this.field_Tb = -1;
        try {
          L0: {
            this.field_bc = param4;
            this.field_Ub = param5;
            this.field_fc = param7;
            this.field_cc = this.field_Ub.length;
            var10 = param3.field_O;
            this.field_dc = var10.field_P + (var10.field_F + 2);
            this.field_Pb = this.field_dc * this.field_cc;
            this.field_Rb = 0;
            this.field_Qb = new rk[this.field_cc];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var13 ^ -1) <= (this.field_cc ^ -1)) {
                    break L3;
                  } else {
                    stackIn_20_0 = this;

                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((og) (this)).field_fc[var13] <= 0) {
                          break L4;
                        } else {
                          param6[var13] = var11 + jm.a(true, this.field_fc[var13]).toUpperCase() + ": " + var12 + param6[var13];
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var14 = null;
                          if (null != this.field_bc[var13]) {
                            break L6;
                          } else {
                            if ((this.field_Ub[var13] ^ -1) != 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var14 = uf.field_e;
                        break L5;
                      }
                      L7: {
                        this.field_Qb[var13] = new rk(0L, param2, (mh) null, param3, (jp) (var14), param6[var13]);
                        this.a(this.field_Qb[var13], 0);
                        var15 = var10.c(param6[var13]);
                        if (var15 > this.field_Rb) {
                          this.field_Rb = var15;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var13++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_Rb = this.field_Rb + (10 + uf.field_e.field_x);
                stackIn_20_0 = this;
                break L2;
              }
              this.a(12, (byte) -81);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var10_ref);

            stackIn_25_1 = new StringBuilder().append("og.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param4 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L12;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param6 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L13;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param7 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L14;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L14;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), stackIn_50_2 + ')');
        }
    }

    final static void a(boolean param0, mf param1) {
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_265_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_324_0 = 0;
        int stackIn_331_0 = 0;
        int stackIn_338_0 = 0;
        int stackIn_354_0 = 0;
        int stackIn_377_0 = 0;
        int stackIn_385_0 = 0;
        int stackIn_406_0 = 0;
        int stackIn_421_0 = 0;
        int stackIn_449_0 = 0;
        int stackIn_460_0 = 0;
        int stackIn_467_0 = 0;
        int stackIn_481_0 = 0;
        int stackIn_505_0 = 0;
        int stackIn_524_0 = 0;
        int stackIn_535_0 = 0;
        int stackIn_552_0 = 0;
        int stackIn_579_0 = 0;
        int stackIn_587_0 = 0;
        int stackIn_603_0 = 0;
        int stackIn_614_0 = 0;
        int stackIn_626_0 = 0;
        int stackIn_634_0 = 0;
        int stackIn_667_0 = 0;
        int stackIn_686_0 = 0;
        int stackIn_708_0 = 0;
        int stackIn_724_0 = 0;
        int stackIn_759_0 = 0;
        int stackIn_774_0 = 0;
        int stackIn_785_0 = 0;
        RuntimeException stackIn_793_0 = null;
        StringBuilder stackIn_793_1 = null;
        RuntimeException stackIn_794_0 = null;
        StringBuilder stackIn_794_1 = null;
        String stackIn_794_2 = null;
        int stackIn_802_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              hq.field_t = param1;
              var2 = gr.a(true, "text_game_name");
              if (null != var2) {
                q.a(var2, (byte) 71);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = gr.a(true, "expansion_text,0");
              if (var2 == null) {
                break L2;
              } else {
                hq.field_u[0] = q.a(var2, (byte) 116);
                break L2;
              }
            }
            L3: {
              var2 = gr.a(true, "expansion_text,1");
              if (null == var2) {
                break L3;
              } else {
                hq.field_u[1] = q.a(var2, (byte) 118);
                break L3;
              }
            }
            L4: {
              var2 = gr.a(true, "expansion_text,2");
              if (var2 == null) {
                break L4;
              } else {
                hq.field_u[2] = q.a(var2, (byte) 115);
                break L4;
              }
            }
            L5: {
              var2 = gr.a(true, "expansion_text,3");
              if (null != var2) {
                hq.field_u[3] = q.a(var2, (byte) 91);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2 = gr.a(true, "expansion_text,4");
              if (null != var2) {
                hq.field_u[4] = q.a(var2, (byte) 101);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2 = gr.a(true, "expansion_installed");
              if (var2 == null) {
                break L7;
              } else {
                ii.field_s = q.a(var2, (byte) 115);
                break L7;
              }
            }
            L8: {
              var2 = gr.a(true, "achievement_names,0");
              if (var2 == null) {
                break L8;
              } else {
                af.field_s[0] = q.a(var2, (byte) 114);
                break L8;
              }
            }
            L9: {
              var2 = gr.a(true, "achievement_names,1");
              if (null == var2) {
                break L9;
              } else {
                af.field_s[1] = q.a(var2, (byte) 72);
                break L9;
              }
            }
            L10: {
              var2 = gr.a(true, "achievement_names,2");
              if (var2 == null) {
                break L10;
              } else {
                af.field_s[2] = q.a(var2, (byte) 97);
                break L10;
              }
            }
            L11: {
              var2 = gr.a(true, "achievement_names,3");
              if (null == var2) {
                break L11;
              } else {
                af.field_s[3] = q.a(var2, (byte) 108);
                break L11;
              }
            }
            L12: {
              var2 = gr.a(true, "achievement_names,4");
              if (null == var2) {
                break L12;
              } else {
                af.field_s[4] = q.a(var2, (byte) 88);
                break L12;
              }
            }
            L13: {
              var2 = gr.a(true, "achievement_names,5");
              if (null != var2) {
                af.field_s[5] = q.a(var2, (byte) 124);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = gr.a(true, "achievement_names,6");
              if (null != var2) {
                af.field_s[6] = q.a(var2, (byte) 90);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = gr.a(true, "achievement_names,7");
              if (var2 != null) {
                af.field_s[7] = q.a(var2, (byte) 115);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2 = gr.a(true, "achievement_names,8");
              if (null == var2) {
                break L16;
              } else {
                af.field_s[8] = q.a(var2, (byte) 99);
                break L16;
              }
            }
            L17: {
              var2 = gr.a(true, "achievement_names,9");
              if (var2 == null) {
                break L17;
              } else {
                af.field_s[9] = q.a(var2, (byte) 94);
                break L17;
              }
            }
            L18: {
              if (param0) {
                stackIn_62_0 = 0;
                break L18;
              } else {
                stackIn_62_0 = 1;
                break L18;
              }
            }
            L19: {
              var2 = gr.a(stackIn_62_0 != 0, "achievement_names,10");
              if (var2 == null) {
                break L19;
              } else {
                af.field_s[10] = q.a(var2, (byte) 114);
                break L19;
              }
            }
            L20: {
              if (param0) {
                stackIn_69_0 = 0;
                break L20;
              } else {
                stackIn_69_0 = 1;
                break L20;
              }
            }
            L21: {
              var2 = gr.a(stackIn_69_0 != 0, "achievement_names,11");
              if (var2 != null) {
                af.field_s[11] = q.a(var2, (byte) 97);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param0) {
                stackIn_77_0 = 0;
                break L22;
              } else {
                stackIn_77_0 = 1;
                break L22;
              }
            }
            L23: {
              var2 = gr.a(stackIn_77_0 != 0, "achievement_names,12");
              if (null == var2) {
                break L23;
              } else {
                af.field_s[12] = q.a(var2, (byte) 121);
                break L23;
              }
            }
            L24: {
              var2 = gr.a(true, "achievement_names,13");
              if (var2 == null) {
                break L24;
              } else {
                af.field_s[13] = q.a(var2, (byte) 77);
                break L24;
              }
            }
            L25: {
              var2 = gr.a(true, "achievement_names,14");
              if (var2 == null) {
                break L25;
              } else {
                af.field_s[14] = q.a(var2, (byte) 100);
                break L25;
              }
            }
            L26: {
              var2 = gr.a(true, "achievement_names,15");
              if (null != var2) {
                af.field_s[15] = q.a(var2, (byte) 97);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = gr.a(true, "achievement_names,16");
              if (var2 != null) {
                af.field_s[16] = q.a(var2, (byte) 83);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = gr.a(true, "achievement_names,17");
              if (null != var2) {
                af.field_s[17] = q.a(var2, (byte) 85);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              var2 = gr.a(true, "achievement_names,18");
              if (null != var2) {
                af.field_s[18] = q.a(var2, (byte) 79);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              var2 = gr.a(true, "achievement_names,19");
              if (null == var2) {
                break L30;
              } else {
                af.field_s[19] = q.a(var2, (byte) 118);
                break L30;
              }
            }
            L31: {
              var2 = gr.a(true, "achievement_names,20");
              if (var2 == null) {
                break L31;
              } else {
                af.field_s[20] = q.a(var2, (byte) 124);
                break L31;
              }
            }
            L32: {
              var2 = gr.a(true, "achievement_names,21");
              if (null == var2) {
                break L32;
              } else {
                af.field_s[21] = q.a(var2, (byte) 122);
                break L32;
              }
            }
            L33: {
              var2 = gr.a(true, "achievement_names,22");
              if (var2 != null) {
                af.field_s[22] = q.a(var2, (byte) 79);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = gr.a(true, "achievement_names,23");
              if (null == var2) {
                break L34;
              } else {
                af.field_s[23] = q.a(var2, (byte) 105);
                break L34;
              }
            }
            L35: {
              if (param0) {
                stackIn_122_0 = 0;
                break L35;
              } else {
                stackIn_122_0 = 1;
                break L35;
              }
            }
            L36: {
              var2 = gr.a(stackIn_122_0 != 0, "achievement_names,24");
              if (null == var2) {
                break L36;
              } else {
                af.field_s[24] = q.a(var2, (byte) 94);
                break L36;
              }
            }
            L37: {
              if (param0) {
                stackIn_129_0 = 0;
                break L37;
              } else {
                stackIn_129_0 = 1;
                break L37;
              }
            }
            L38: {
              var2 = gr.a(stackIn_129_0 != 0, "achievement_names,25");
              if (var2 != null) {
                af.field_s[25] = q.a(var2, (byte) 76);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2 = gr.a(true, "achievement_names,26");
              if (null == var2) {
                break L39;
              } else {
                af.field_s[26] = q.a(var2, (byte) 115);
                break L39;
              }
            }
            L40: {
              var2 = gr.a(true, "achievement_names,27");
              if (null != var2) {
                af.field_s[27] = q.a(var2, (byte) 118);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2 = gr.a(true, "achievement_names,28");
              if (null == var2) {
                break L41;
              } else {
                af.field_s[28] = q.a(var2, (byte) 86);
                break L41;
              }
            }
            L42: {
              if (param0) {
                stackIn_147_0 = 0;
                break L42;
              } else {
                stackIn_147_0 = 1;
                break L42;
              }
            }
            L43: {
              var2 = gr.a(stackIn_147_0 != 0, "achievement_names,29");
              if (null == var2) {
                break L43;
              } else {
                af.field_s[29] = q.a(var2, (byte) 72);
                break L43;
              }
            }
            L44: {
              var2 = gr.a(true, "achievement_names,30");
              if (var2 != null) {
                af.field_s[30] = q.a(var2, (byte) 118);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              if (!param0) {
                break L45;
              } else {
                og.h(67);
                break L45;
              }
            }
            L46: {
              var2 = gr.a(true, "achievement_names,31");
              if (var2 != null) {
                af.field_s[31] = q.a(var2, (byte) 85);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = gr.a(true, "achievement_names,32");
              if (var2 == null) {
                break L47;
              } else {
                af.field_s[32] = q.a(var2, (byte) 89);
                break L47;
              }
            }
            L48: {
              if (param0) {
                stackIn_168_0 = 0;
                break L48;
              } else {
                stackIn_168_0 = 1;
                break L48;
              }
            }
            L49: {
              var2 = gr.a(stackIn_168_0 != 0, "achievement_names,33");
              if (var2 != null) {
                af.field_s[33] = q.a(var2, (byte) 108);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2 = gr.a(true, "achievement_names,34");
              if (var2 == null) {
                break L50;
              } else {
                af.field_s[34] = q.a(var2, (byte) 111);
                break L50;
              }
            }
            L51: {
              var2 = gr.a(true, "achievement_names,35");
              if (var2 == null) {
                break L51;
              } else {
                af.field_s[35] = q.a(var2, (byte) 78);
                break L51;
              }
            }
            L52: {
              var2 = gr.a(true, "achievement_names,36");
              if (var2 == null) {
                break L52;
              } else {
                af.field_s[36] = q.a(var2, (byte) 75);
                break L52;
              }
            }
            L53: {
              if (param0) {
                stackIn_185_0 = 0;
                break L53;
              } else {
                stackIn_185_0 = 1;
                break L53;
              }
            }
            L54: {
              var2 = gr.a(stackIn_185_0 != 0, "achievement_names,37");
              if (var2 != null) {
                af.field_s[37] = q.a(var2, (byte) 71);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = gr.a(true, "achievement_names,38");
              if (null == var2) {
                break L55;
              } else {
                af.field_s[38] = q.a(var2, (byte) 120);
                break L55;
              }
            }
            L56: {
              var2 = gr.a(true, "achievement_names,39");
              if (var2 != null) {
                af.field_s[39] = q.a(var2, (byte) 117);
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              var2 = gr.a(true, "achievement_names,40");
              if (var2 == null) {
                break L57;
              } else {
                af.field_s[40] = q.a(var2, (byte) 95);
                break L57;
              }
            }
            L58: {
              var2 = gr.a(true, "achievement_names,41");
              if (var2 == null) {
                break L58;
              } else {
                af.field_s[41] = q.a(var2, (byte) 75);
                break L58;
              }
            }
            L59: {
              if (param0) {
                stackIn_206_0 = 0;
                break L59;
              } else {
                stackIn_206_0 = 1;
                break L59;
              }
            }
            L60: {
              var2 = gr.a(stackIn_206_0 != 0, "achievement_criteria,0");
              if (var2 == null) {
                break L60;
              } else {
                mp.field_bc[0] = q.a(var2, (byte) 95);
                break L60;
              }
            }
            L61: {
              var2 = gr.a(true, "achievement_criteria,1");
              if (null == var2) {
                break L61;
              } else {
                mp.field_bc[1] = q.a(var2, (byte) 109);
                break L61;
              }
            }
            L62: {
              if (param0) {
                stackIn_216_0 = 0;
                break L62;
              } else {
                stackIn_216_0 = 1;
                break L62;
              }
            }
            L63: {
              var2 = gr.a(stackIn_216_0 != 0, "achievement_criteria,2");
              if (null == var2) {
                break L63;
              } else {
                mp.field_bc[2] = q.a(var2, (byte) 100);
                break L63;
              }
            }
            L64: {
              var2 = gr.a(true, "achievement_criteria,3");
              if (var2 == null) {
                break L64;
              } else {
                mp.field_bc[3] = q.a(var2, (byte) 92);
                break L64;
              }
            }
            L65: {
              if (param0) {
                stackIn_226_0 = 0;
                break L65;
              } else {
                stackIn_226_0 = 1;
                break L65;
              }
            }
            L66: {
              var2 = gr.a(stackIn_226_0 != 0, "achievement_criteria,4");
              if (null == var2) {
                break L66;
              } else {
                mp.field_bc[4] = q.a(var2, (byte) 106);
                break L66;
              }
            }
            L67: {
              var2 = gr.a(true, "achievement_criteria,5");
              if (null == var2) {
                break L67;
              } else {
                mp.field_bc[5] = q.a(var2, (byte) 127);
                break L67;
              }
            }
            L68: {
              if (param0) {
                stackIn_236_0 = 0;
                break L68;
              } else {
                stackIn_236_0 = 1;
                break L68;
              }
            }
            L69: {
              var2 = gr.a(stackIn_236_0 != 0, "achievement_criteria,6");
              if (var2 == null) {
                break L69;
              } else {
                mp.field_bc[6] = q.a(var2, (byte) 116);
                break L69;
              }
            }
            L70: {
              var2 = gr.a(true, "achievement_criteria,7");
              if (var2 != null) {
                mp.field_bc[7] = q.a(var2, (byte) 70);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2 = gr.a(true, "achievement_criteria,8");
              if (null != var2) {
                mp.field_bc[8] = q.a(var2, (byte) 112);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2 = gr.a(true, "achievement_criteria,9");
              if (var2 != null) {
                mp.field_bc[9] = q.a(var2, (byte) 76);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2 = gr.a(true, "achievement_criteria,10");
              if (var2 != null) {
                mp.field_bc[10] = q.a(var2, (byte) 99);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2 = gr.a(true, "achievement_criteria,11");
              if (null == var2) {
                break L74;
              } else {
                mp.field_bc[11] = q.a(var2, (byte) 78);
                break L74;
              }
            }
            L75: {
              var2 = gr.a(true, "achievement_criteria,12");
              if (null == var2) {
                break L75;
              } else {
                mp.field_bc[12] = q.a(var2, (byte) 91);
                break L75;
              }
            }
            L76: {
              if (param0) {
                stackIn_265_0 = 0;
                break L76;
              } else {
                stackIn_265_0 = 1;
                break L76;
              }
            }
            L77: {
              var2 = gr.a(stackIn_265_0 != 0, "achievement_criteria,13");
              if (var2 == null) {
                break L77;
              } else {
                mp.field_bc[13] = q.a(var2, (byte) 92);
                break L77;
              }
            }
            L78: {
              if (param0) {
                stackIn_272_0 = 0;
                break L78;
              } else {
                stackIn_272_0 = 1;
                break L78;
              }
            }
            L79: {
              var2 = gr.a(stackIn_272_0 != 0, "achievement_criteria,14");
              if (var2 == null) {
                break L79;
              } else {
                mp.field_bc[14] = q.a(var2, (byte) 107);
                break L79;
              }
            }
            L80: {
              var2 = gr.a(true, "achievement_criteria,15");
              if (null != var2) {
                mp.field_bc[15] = q.a(var2, (byte) 125);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              var2 = gr.a(true, "achievement_criteria,16");
              if (null != var2) {
                mp.field_bc[16] = q.a(var2, (byte) 101);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2 = gr.a(true, "achievement_criteria,17");
              if (null == var2) {
                break L82;
              } else {
                mp.field_bc[17] = q.a(var2, (byte) 92);
                break L82;
              }
            }
            L83: {
              var2 = gr.a(true, "achievement_criteria,18");
              if (null != var2) {
                mp.field_bc[18] = q.a(var2, (byte) 74);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2 = gr.a(true, "achievement_criteria,19");
              if (var2 == null) {
                break L84;
              } else {
                mp.field_bc[19] = q.a(var2, (byte) 121);
                break L84;
              }
            }
            L85: {
              if (param0) {
                stackIn_297_0 = 0;
                break L85;
              } else {
                stackIn_297_0 = 1;
                break L85;
              }
            }
            L86: {
              var2 = gr.a(stackIn_297_0 != 0, "achievement_criteria,20");
              if (var2 != null) {
                mp.field_bc[20] = q.a(var2, (byte) 89);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              var2 = gr.a(true, "achievement_criteria,21");
              if (null != var2) {
                mp.field_bc[21] = q.a(var2, (byte) 106);
                break L87;
              } else {
                break L87;
              }
            }
            L88: {
              var2 = gr.a(true, "achievement_criteria,22");
              if (var2 != null) {
                mp.field_bc[22] = q.a(var2, (byte) 81);
                break L88;
              } else {
                break L88;
              }
            }
            L89: {
              var2 = gr.a(true, "achievement_criteria,23");
              if (var2 == null) {
                break L89;
              } else {
                mp.field_bc[23] = q.a(var2, (byte) 122);
                break L89;
              }
            }
            L90: {
              var2 = gr.a(true, "achievement_criteria,24");
              if (null != var2) {
                mp.field_bc[24] = q.a(var2, (byte) 77);
                break L90;
              } else {
                break L90;
              }
            }
            L91: {
              var2 = gr.a(true, "achievement_criteria,25");
              if (null != var2) {
                mp.field_bc[25] = q.a(var2, (byte) 102);
                break L91;
              } else {
                break L91;
              }
            }
            L92: {
              if (param0) {
                stackIn_324_0 = 0;
                break L92;
              } else {
                stackIn_324_0 = 1;
                break L92;
              }
            }
            L93: {
              var2 = gr.a(stackIn_324_0 != 0, "achievement_criteria,26");
              if (null == var2) {
                break L93;
              } else {
                mp.field_bc[26] = q.a(var2, (byte) 124);
                break L93;
              }
            }
            L94: {
              if (param0) {
                stackIn_331_0 = 0;
                break L94;
              } else {
                stackIn_331_0 = 1;
                break L94;
              }
            }
            L95: {
              var2 = gr.a(stackIn_331_0 != 0, "achievement_criteria,27");
              if (var2 == null) {
                break L95;
              } else {
                mp.field_bc[27] = q.a(var2, (byte) 79);
                break L95;
              }
            }
            L96: {
              if (param0) {
                stackIn_338_0 = 0;
                break L96;
              } else {
                stackIn_338_0 = 1;
                break L96;
              }
            }
            L97: {
              var2 = gr.a(stackIn_338_0 != 0, "achievement_criteria,28");
              if (var2 == null) {
                break L97;
              } else {
                mp.field_bc[28] = q.a(var2, (byte) 81);
                break L97;
              }
            }
            L98: {
              var2 = gr.a(true, "achievement_criteria,29");
              if (null == var2) {
                break L98;
              } else {
                mp.field_bc[29] = q.a(var2, (byte) 72);
                break L98;
              }
            }
            L99: {
              var2 = gr.a(true, "achievement_criteria,30");
              if (var2 == null) {
                break L99;
              } else {
                mp.field_bc[30] = q.a(var2, (byte) 115);
                break L99;
              }
            }
            L100: {
              var2 = gr.a(true, "achievement_criteria,31");
              if (var2 == null) {
                break L100;
              } else {
                mp.field_bc[31] = q.a(var2, (byte) 110);
                break L100;
              }
            }
            L101: {
              if (param0) {
                stackIn_354_0 = 0;
                break L101;
              } else {
                stackIn_354_0 = 1;
                break L101;
              }
            }
            L102: {
              var2 = gr.a(stackIn_354_0 != 0, "achievement_criteria,32");
              if (var2 == null) {
                break L102;
              } else {
                mp.field_bc[32] = q.a(var2, (byte) 124);
                break L102;
              }
            }
            L103: {
              var2 = gr.a(true, "achievement_criteria,33");
              if (null == var2) {
                break L103;
              } else {
                mp.field_bc[33] = q.a(var2, (byte) 85);
                break L103;
              }
            }
            L104: {
              var2 = gr.a(true, "achievement_criteria,34");
              if (var2 != null) {
                mp.field_bc[34] = q.a(var2, (byte) 72);
                break L104;
              } else {
                break L104;
              }
            }
            L105: {
              var2 = gr.a(true, "achievement_criteria,35");
              if (null == var2) {
                break L105;
              } else {
                mp.field_bc[35] = q.a(var2, (byte) 72);
                break L105;
              }
            }
            L106: {
              var2 = gr.a(true, "achievement_criteria,36");
              if (var2 == null) {
                break L106;
              } else {
                mp.field_bc[36] = q.a(var2, (byte) 126);
                break L106;
              }
            }
            L107: {
              var2 = gr.a(true, "achievement_criteria,37");
              if (null == var2) {
                break L107;
              } else {
                mp.field_bc[37] = q.a(var2, (byte) 94);
                break L107;
              }
            }
            L108: {
              if (param0) {
                stackIn_377_0 = 0;
                break L108;
              } else {
                stackIn_377_0 = 1;
                break L108;
              }
            }
            L109: {
              var2 = gr.a(stackIn_377_0 != 0, "achievement_criteria,38");
              if (var2 != null) {
                mp.field_bc[38] = q.a(var2, (byte) 114);
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              if (param0) {
                stackIn_385_0 = 0;
                break L110;
              } else {
                stackIn_385_0 = 1;
                break L110;
              }
            }
            L111: {
              var2 = gr.a(stackIn_385_0 != 0, "achievement_criteria,39");
              if (var2 != null) {
                mp.field_bc[39] = q.a(var2, (byte) 98);
                break L111;
              } else {
                break L111;
              }
            }
            L112: {
              var2 = gr.a(true, "achievement_criteria,40");
              if (null == var2) {
                break L112;
              } else {
                mp.field_bc[40] = q.a(var2, (byte) 125);
                break L112;
              }
            }
            L113: {
              var2 = gr.a(true, "achievement_criteria,41");
              if (var2 != null) {
                mp.field_bc[41] = q.a(var2, (byte) 86);
                break L113;
              } else {
                break L113;
              }
            }
            L114: {
              var2 = gr.a(true, "achievement_obtained");
              if (var2 == null) {
                break L114;
              } else {
                q.a(var2, (byte) 89);
                break L114;
              }
            }
            L115: {
              var2 = gr.a(true, "gameoptlabels,0");
              if (var2 == null) {
                break L115;
              } else {
                jf.field_d[0] = q.a(var2, (byte) 111);
                break L115;
              }
            }
            L116: {
              if (param0) {
                stackIn_406_0 = 0;
                break L116;
              } else {
                stackIn_406_0 = 1;
                break L116;
              }
            }
            L117: {
              var2 = gr.a(stackIn_406_0 != 0, "gameoptnames,0,0");
              if (null != var2) {
                j.field_jb[0][0] = q.a(var2, (byte) 87);
                break L117;
              } else {
                break L117;
              }
            }
            L118: {
              var2 = gr.a(true, "gameoptnames,0,1");
              if (var2 == null) {
                break L118;
              } else {
                j.field_jb[0][1] = q.a(var2, (byte) 101);
                break L118;
              }
            }
            L119: {
              var2 = gr.a(true, "gameoptnames,0,2");
              if (null != var2) {
                j.field_jb[0][2] = q.a(var2, (byte) 120);
                break L119;
              } else {
                break L119;
              }
            }
            L120: {
              if (param0) {
                stackIn_421_0 = 0;
                break L120;
              } else {
                stackIn_421_0 = 1;
                break L120;
              }
            }
            L121: {
              var2 = gr.a(stackIn_421_0 != 0, "gameoptnames,0,3");
              if (null != var2) {
                j.field_jb[0][3] = q.a(var2, (byte) 112);
                break L121;
              } else {
                break L121;
              }
            }
            L122: {
              var2 = gr.a(true, "player_one");
              if (null != var2) {
                we.field_c = q.a(var2, (byte) 74);
                break L122;
              } else {
                break L122;
              }
            }
            L123: {
              var2 = gr.a(true, "player_two");
              if (null == var2) {
                break L123;
              } else {
                pg.field_q = q.a(var2, (byte) 76);
                break L123;
              }
            }
            L124: {
              var2 = gr.a(true, "end_of_free");
              if (null == var2) {
                break L124;
              } else {
                q.a(var2, (byte) 114);
                break L124;
              }
            }
            L125: {
              var2 = gr.a(true, "end_of_paid");
              if (null != var2) {
                mo.field_N = q.a(var2, (byte) 125);
                break L125;
              } else {
                break L125;
              }
            }
            L126: {
              var2 = gr.a(true, "game_drawn");
              if (var2 == null) {
                break L126;
              } else {
                q.a(var2, (byte) 99);
                break L126;
              }
            }
            L127: {
              var2 = gr.a(true, "resigned");
              if (var2 == null) {
                break L127;
              } else {
                t.field_h = q.a(var2, (byte) 107);
                break L127;
              }
            }
            L128: {
              if (param0) {
                stackIn_449_0 = 0;
                break L128;
              } else {
                stackIn_449_0 = 1;
                break L128;
              }
            }
            L129: {
              var2 = gr.a(stackIn_449_0 != 0, "blank_colon_blank");
              if (null == var2) {
                break L129;
              } else {
                BrickABrac.field_H = q.a(var2, (byte) 112);
                break L129;
              }
            }
            L130: {
              var2 = gr.a(true, "n_of_m");
              if (null != var2) {
                rm.field_e = q.a(var2, (byte) 85);
                break L130;
              } else {
                break L130;
              }
            }
            L131: {
              if (param0) {
                stackIn_460_0 = 0;
                break L131;
              } else {
                stackIn_460_0 = 1;
                break L131;
              }
            }
            L132: {
              var2 = gr.a(stackIn_460_0 != 0, "n_of_unlimited");
              if (null == var2) {
                break L132;
              } else {
                dm.field_a = q.a(var2, (byte) 112);
                break L132;
              }
            }
            L133: {
              if (param0) {
                stackIn_467_0 = 0;
                break L133;
              } else {
                stackIn_467_0 = 1;
                break L133;
              }
            }
            L134: {
              var2 = gr.a(stackIn_467_0 != 0, "plus_something");
              if (var2 == null) {
                break L134;
              } else {
                hh.field_e = q.a(var2, (byte) 84);
                break L134;
              }
            }
            L135: {
              var2 = gr.a(true, "ellipsis");
              if (var2 != null) {
                q.a(var2, (byte) 126);
                break L135;
              } else {
                break L135;
              }
            }
            L136: {
              var2 = gr.a(true, "go_exclaim");
              if (var2 == null) {
                break L136;
              } else {
                lq.field_c = q.a(var2, (byte) 77);
                break L136;
              }
            }
            L137: {
              if (param0) {
                stackIn_481_0 = 0;
                break L137;
              } else {
                stackIn_481_0 = 1;
                break L137;
              }
            }
            L138: {
              var2 = gr.a(stackIn_481_0 != 0, "cool");
              if (null == var2) {
                break L138;
              } else {
                qi.field_N = q.a(var2, (byte) 95);
                break L138;
              }
            }
            L139: {
              var2 = gr.a(true, "awesome");
              if (null != var2) {
                bg.field_o = q.a(var2, (byte) 107);
                break L139;
              } else {
                break L139;
              }
            }
            L140: {
              var2 = gr.a(true, "neat");
              if (null != var2) {
                ue.field_a = q.a(var2, (byte) 127);
                break L140;
              } else {
                break L140;
              }
            }
            L141: {
              var2 = gr.a(true, "nice");
              if (var2 == null) {
                break L141;
              } else {
                eb.field_m = q.a(var2, (byte) 72);
                break L141;
              }
            }
            L142: {
              var2 = gr.a(true, "genius");
              if (var2 == null) {
                break L142;
              } else {
                ch.field_j = q.a(var2, (byte) 123);
                break L142;
              }
            }
            L143: {
              var2 = gr.a(true, "well_done");
              if (var2 == null) {
                break L143;
              } else {
                vg.field_a = q.a(var2, (byte) 78);
                break L143;
              }
            }
            L144: {
              if (param0) {
                stackIn_505_0 = 0;
                break L144;
              } else {
                stackIn_505_0 = 1;
                break L144;
              }
            }
            L145: {
              var2 = gr.a(stackIn_505_0 != 0, "sweet");
              if (var2 != null) {
                nk.field_f = q.a(var2, (byte) 81);
                break L145;
              } else {
                break L145;
              }
            }
            L146: {
              var2 = gr.a(true, "ninja_skills");
              if (var2 != null) {
                tm.field_h = q.a(var2, (byte) 123);
                break L146;
              } else {
                break L146;
              }
            }
            L147: {
              var2 = gr.a(true, "oh_no");
              if (null != var2) {
                ag.field_C = q.a(var2, (byte) 81);
                break L147;
              } else {
                break L147;
              }
            }
            L148: {
              var2 = gr.a(true, "oh_dear");
              if (null == var2) {
                break L148;
              } else {
                bh.field_ub = q.a(var2, (byte) 89);
                break L148;
              }
            }
            L149: {
              if (param0) {
                stackIn_524_0 = 0;
                break L149;
              } else {
                stackIn_524_0 = 1;
                break L149;
              }
            }
            L150: {
              var2 = gr.a(stackIn_524_0 != 0, "curses");
              if (var2 == null) {
                break L150;
              } else {
                qo.field_P = q.a(var2, (byte) 97);
                break L150;
              }
            }
            L151: {
              var2 = gr.a(true, "crumbs");
              if (null != var2) {
                bq.field_f = q.a(var2, (byte) 77);
                break L151;
              } else {
                break L151;
              }
            }
            L152: {
              if (param0) {
                stackIn_535_0 = 0;
                break L152;
              } else {
                stackIn_535_0 = 1;
                break L152;
              }
            }
            L153: {
              var2 = gr.a(stackIn_535_0 != 0, "good_grief");
              if (var2 == null) {
                break L153;
              } else {
                jh.field_c = q.a(var2, (byte) 82);
                break L153;
              }
            }
            L154: {
              var2 = gr.a(true, "instructions_pages,0");
              if (null == var2) {
                break L154;
              } else {
                gh.field_b[0] = q.a(var2, (byte) 95);
                break L154;
              }
            }
            L155: {
              var2 = gr.a(true, "instructions_pages,1");
              if (var2 != null) {
                gh.field_b[1] = q.a(var2, (byte) 78);
                break L155;
              } else {
                break L155;
              }
            }
            L156: {
              var2 = gr.a(true, "instructions_pages,2");
              if (var2 == null) {
                break L156;
              } else {
                gh.field_b[2] = q.a(var2, (byte) 97);
                break L156;
              }
            }
            L157: {
              if (param0) {
                stackIn_552_0 = 0;
                break L157;
              } else {
                stackIn_552_0 = 1;
                break L157;
              }
            }
            L158: {
              var2 = gr.a(stackIn_552_0 != 0, "instructions_pages,3");
              if (null == var2) {
                break L158;
              } else {
                gh.field_b[3] = q.a(var2, (byte) 77);
                break L158;
              }
            }
            L159: {
              var2 = gr.a(true, "instructions_pages,4");
              if (null == var2) {
                break L159;
              } else {
                gh.field_b[4] = q.a(var2, (byte) 76);
                break L159;
              }
            }
            L160: {
              var2 = gr.a(true, "settings_label");
              if (var2 != null) {
                hk.field_L = q.a(var2, (byte) 107);
                break L160;
              } else {
                break L160;
              }
            }
            L161: {
              var2 = gr.a(true, "continue_label");
              if (var2 == null) {
                break L161;
              } else {
                t.field_c = q.a(var2, (byte) 94);
                break L161;
              }
            }
            L162: {
              var2 = gr.a(true, "level_select_label");
              if (var2 == null) {
                break L162;
              } else {
                f.field_b = q.a(var2, (byte) 88);
                break L162;
              }
            }
            L163: {
              var2 = gr.a(true, "tutorial_label");
              if (null != var2) {
                gj.field_d = q.a(var2, (byte) 111);
                break L163;
              } else {
                break L163;
              }
            }
            L164: {
              var2 = gr.a(true, "rematch_label");
              if (null == var2) {
                break L164;
              } else {
                kk.field_a = q.a(var2, (byte) 72);
                break L164;
              }
            }
            L165: {
              if (param0) {
                stackIn_579_0 = 0;
                break L165;
              } else {
                stackIn_579_0 = 1;
                break L165;
              }
            }
            L166: {
              var2 = gr.a(stackIn_579_0 != 0, "test_error_message");
              if (var2 != null) {
                q.a(var2, (byte) 123);
                break L166;
              } else {
                break L166;
              }
            }
            L167: {
              if (param0) {
                stackIn_587_0 = 0;
                break L167;
              } else {
                stackIn_587_0 = 1;
                break L167;
              }
            }
            L168: {
              var2 = gr.a(stackIn_587_0 != 0, "name");
              if (null != var2) {
                ae.field_i = q.a(var2, (byte) 79);
                break L168;
              } else {
                break L168;
              }
            }
            L169: {
              var2 = gr.a(true, "from_level");
              if (var2 != null) {
                mn.field_u = q.a(var2, (byte) 80);
                break L169;
              } else {
                break L169;
              }
            }
            L170: {
              var2 = gr.a(true, "to_level");
              if (null != var2) {
                ba.field_u = q.a(var2, (byte) 120);
                break L170;
              } else {
                break L170;
              }
            }
            L171: {
              if (param0) {
                stackIn_603_0 = 0;
                break L171;
              } else {
                stackIn_603_0 = 1;
                break L171;
              }
            }
            L172: {
              var2 = gr.a(stackIn_603_0 != 0, "score");
              if (null == var2) {
                break L172;
              } else {
                pj.field_d = q.a(var2, (byte) 85);
                break L172;
              }
            }
            L173: {
              var2 = gr.a(true, "group_0");
              if (null != var2) {
                vh.field_T = q.a(var2, (byte) 79);
                break L173;
              } else {
                break L173;
              }
            }
            L174: {
              if (param0) {
                stackIn_614_0 = 0;
                break L174;
              } else {
                stackIn_614_0 = 1;
                break L174;
              }
            }
            L175: {
              var2 = gr.a(stackIn_614_0 != 0, "group_1");
              if (null != var2) {
                oc.field_u = q.a(var2, (byte) 73);
                break L175;
              } else {
                break L175;
              }
            }
            L176: {
              var2 = gr.a(true, "menu_level_label");
              if (var2 != null) {
                lh.field_t = q.a(var2, (byte) 119);
                break L176;
              } else {
                break L176;
              }
            }
            L177: {
              if (param0) {
                stackIn_626_0 = 0;
                break L177;
              } else {
                stackIn_626_0 = 1;
                break L177;
              }
            }
            L178: {
              var2 = gr.a(stackIn_626_0 != 0, "please_select_a_level");
              if (null != var2) {
                oj.field_s = q.a(var2, (byte) 120);
                break L178;
              } else {
                break L178;
              }
            }
            L179: {
              if (param0) {
                stackIn_634_0 = 0;
                break L179;
              } else {
                stackIn_634_0 = 1;
                break L179;
              }
            }
            L180: {
              var2 = gr.a(stackIn_634_0 != 0, "world_select");
              if (var2 == null) {
                break L180;
              } else {
                ki.field_o = q.a(var2, (byte) 104);
                break L180;
              }
            }
            L181: {
              var2 = gr.a(true, "rated_membersonly");
              if (var2 != null) {
                q.a(var2, (byte) 90);
                break L181;
              } else {
                break L181;
              }
            }
            L182: {
              var2 = gr.a(true, "explain_close");
              if (null == var2) {
                break L182;
              } else {
                ro.field_v = q.a(var2, (byte) 118);
                break L182;
              }
            }
            L183: {
              var2 = gr.a(true, "explain_welcome");
              if (null == var2) {
                break L183;
              } else {
                sb.field_d = q.a(var2, (byte) 78);
                break L183;
              }
            }
            L184: {
              var2 = gr.a(true, "explain_lateral_move");
              if (var2 == null) {
                break L184;
              } else {
                hq.field_y = q.a(var2, (byte) 73);
                break L184;
              }
            }
            L185: {
              var2 = gr.a(true, "explain_launch");
              if (null != var2) {
                va.field_d = q.a(var2, (byte) 90);
                break L185;
              } else {
                break L185;
              }
            }
            L186: {
              var2 = gr.a(true, "explain_objective");
              if (null == var2) {
                break L186;
              } else {
                op.field_b = q.a(var2, (byte) 99);
                break L186;
              }
            }
            L187: {
              var2 = gr.a(true, "explain_powerup_bricks");
              if (null == var2) {
                break L187;
              } else {
                o.field_a = q.a(var2, (byte) 89);
                break L187;
              }
            }
            L188: {
              var2 = gr.a(true, "explain_first_release");
              if (null == var2) {
                break L188;
              } else {
                tb.field_db = q.a(var2, (byte) 104);
                break L188;
              }
            }
            L189: {
              if (param0) {
                stackIn_667_0 = 0;
                break L189;
              } else {
                stackIn_667_0 = 1;
                break L189;
              }
            }
            L190: {
              var2 = gr.a(stackIn_667_0 != 0, "explain_gauges_intercept");
              if (var2 == null) {
                break L190;
              } else {
                kq.field_n = q.a(var2, (byte) 100);
                break L190;
              }
            }
            L191: {
              var2 = gr.a(true, "explain_gauges_miss");
              if (var2 != null) {
                tl.field_c = q.a(var2, (byte) 98);
                break L191;
              } else {
                break L191;
              }
            }
            L192: {
              var2 = gr.a(true, "explain_gauges");
              if (var2 != null) {
                ui.field_b = q.a(var2, (byte) 75);
                break L192;
              } else {
                break L192;
              }
            }
            L193: {
              var2 = gr.a(true, "explain_fall_out");
              if (var2 != null) {
                kb.field_Tb = q.a(var2, (byte) 85);
                break L193;
              } else {
                break L193;
              }
            }
            L194: {
              if (param0) {
                stackIn_686_0 = 0;
                break L194;
              } else {
                stackIn_686_0 = 1;
                break L194;
              }
            }
            L195: {
              var2 = gr.a(stackIn_686_0 != 0, "explain_ball_charge");
              if (null != var2) {
                rh.field_a = q.a(var2, (byte) 126);
                break L195;
              } else {
                break L195;
              }
            }
            L196: {
              var2 = gr.a(true, "explain_hearts");
              if (null == var2) {
                break L196;
              } else {
                bj.field_U = q.a(var2, (byte) 78);
                break L196;
              }
            }
            L197: {
              var2 = gr.a(true, "explain_reverse");
              if (var2 == null) {
                break L197;
              } else {
                sj.field_e = q.a(var2, (byte) 74);
                break L197;
              }
            }
            L198: {
              var2 = gr.a(true, "explain_super");
              if (var2 != null) {
                tm.field_d = q.a(var2, (byte) 100);
                break L198;
              } else {
                break L198;
              }
            }
            L199: {
              var2 = gr.a(true, "explain_extra");
              if (var2 != null) {
                ef.field_c = q.a(var2, (byte) 101);
                break L199;
              } else {
                break L199;
              }
            }
            L200: {
              if (param0) {
                stackIn_708_0 = 0;
                break L200;
              } else {
                stackIn_708_0 = 1;
                break L200;
              }
            }
            L201: {
              var2 = gr.a(stackIn_708_0 != 0, "explain_distort");
              if (null == var2) {
                break L201;
              } else {
                ch.field_i = q.a(var2, (byte) 121);
                break L201;
              }
            }
            L202: {
              var2 = gr.a(true, "explain_shrink");
              if (null == var2) {
                break L202;
              } else {
                ke.field_f = q.a(var2, (byte) 112);
                break L202;
              }
            }
            L203: {
              var2 = gr.a(true, "explain_trampoline");
              if (var2 == null) {
                break L203;
              } else {
                oq.field_v = q.a(var2, (byte) 85);
                break L203;
              }
            }
            L204: {
              var2 = gr.a(true, "explain_wipeout");
              if (null == var2) {
                break L204;
              } else {
                mk.field_a = q.a(var2, (byte) 100);
                break L204;
              }
            }
            L205: {
              if (param0) {
                stackIn_724_0 = 0;
                break L205;
              } else {
                stackIn_724_0 = 1;
                break L205;
              }
            }
            L206: {
              var2 = gr.a(stackIn_724_0 != 0, "explain_multiball");
              if (null != var2) {
                eh.field_d = q.a(var2, (byte) 90);
                break L206;
              } else {
                break L206;
              }
            }
            L207: {
              var2 = gr.a(true, "explain_speedup");
              if (var2 == null) {
                break L207;
              } else {
                tn.field_w = q.a(var2, (byte) 99);
                break L207;
              }
            }
            L208: {
              var2 = gr.a(true, "explain_control");
              if (null == var2) {
                break L208;
              } else {
                uo.field_b = q.a(var2, (byte) 97);
                break L208;
              }
            }
            L209: {
              var2 = gr.a(true, "explain_slowdown");
              if (null != var2) {
                vp.field_s = q.a(var2, (byte) 83);
                break L209;
              } else {
                break L209;
              }
            }
            L210: {
              var2 = gr.a(true, "explain_sticky");
              if (var2 == null) {
                break L210;
              } else {
                vh.field_V = q.a(var2, (byte) 114);
                break L210;
              }
            }
            L211: {
              var2 = gr.a(true, "explain_unsuper_ball");
              if (null != var2) {
                ab.field_F = q.a(var2, (byte) 73);
                break L211;
              } else {
                break L211;
              }
            }
            L212: {
              var2 = gr.a(true, "explain_extra_bricks");
              if (var2 == null) {
                break L212;
              } else {
                dc.field_d = q.a(var2, (byte) 111);
                break L212;
              }
            }
            L213: {
              var2 = gr.a(true, "explain_grow");
              if (var2 == null) {
                break L213;
              } else {
                pq.field_q = q.a(var2, (byte) 102);
                break L213;
              }
            }
            L214: {
              var2 = gr.a(true, "explain_plasma");
              if (null != var2) {
                gf.field_g = q.a(var2, (byte) 92);
                break L214;
              } else {
                break L214;
              }
            }
            L215: {
              if (param0) {
                stackIn_759_0 = 0;
                break L215;
              } else {
                stackIn_759_0 = 1;
                break L215;
              }
            }
            L216: {
              var2 = gr.a(stackIn_759_0 != 0, "keycode_player0_left");
              if (var2 != null) {
                ac.field_f = var2[0] & 255;
                break L216;
              } else {
                break L216;
              }
            }
            L217: {
              var2 = gr.a(true, "keycode_player0_right");
              if (null == var2) {
                break L217;
              } else {
                fq.field_b = var2[0] & 255;
                break L217;
              }
            }
            L218: {
              var2 = gr.a(true, "keycode_player0_launch");
              if (var2 != null) {
                aq.field_e = var2[0] & 255;
                break L218;
              } else {
                break L218;
              }
            }
            L219: {
              if (param0) {
                stackIn_774_0 = 0;
                break L219;
              } else {
                stackIn_774_0 = 1;
                break L219;
              }
            }
            L220: {
              var2 = gr.a(stackIn_774_0 != 0, "keycode_player1_left");
              if (null == var2) {
                break L220;
              } else {
                jl.field_b = 255 & var2[0];
                break L220;
              }
            }
            L221: {
              var2 = gr.a(true, "keycode_player1_right");
              if (null != var2) {
                ce.field_d = 255 & var2[0];
                break L221;
              } else {
                break L221;
              }
            }
            L222: {
              if (param0) {
                stackIn_785_0 = 0;
                break L222;
              } else {
                stackIn_785_0 = 1;
                break L222;
              }
            }
            L223: {
              var2 = gr.a(stackIn_785_0 != 0, "keycode_player1_launch");
              hq.field_t = null;
              if (var2 != null) {
                td.field_u = var2[0] & 255;
                break L223;
              } else {
                break L223;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L224: {
            var2_ref = decompiledCaughtException;
            stackIn_793_0 = (RuntimeException) (var2_ref);

            stackIn_793_1 = new StringBuilder().append("og.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_794_0 = (RuntimeException) ((Object) stackIn_793_0);
              stackIn_794_1 = (StringBuilder) ((Object) stackIn_793_1);
              stackIn_794_2 = "null";
              break L224;
            } else {
              stackIn_794_0 = (RuntimeException) ((Object) stackIn_793_0);
              stackIn_794_1 = (StringBuilder) ((Object) stackIn_793_1);
              stackIn_794_2 = "{...}";
              break L224;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_794_0), stackIn_794_2 + ')');
        }
        L225: {
          if (ke.field_l == 0) {
            break L225;
          } else {
            L226: {
              if (var3 == 0) {
                stackIn_802_0 = 1;
                break L226;
              } else {
                stackIn_802_0 = 0;
                break L226;
              }
            }
            BrickABrac.field_J = stackIn_802_0 != 0;
            break L225;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_Xb = this.field_Rb - -(2 * param4);
                        this.a(this.field_Pb, -this.field_Pb + param2, param1, this.field_Xb, (byte) 64);
                        if (param5 == this.field_Sb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_Sb = param5;
                        this.a(this.field_ec, (byte) -81);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7_int = param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var7_int ^ -1) <= (this.field_cc ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_Qb[var7_int].a(-10411, this.field_Qb[var7_int].field_zb, param4, param3, 0, this.field_dc, this.field_Xb);
                        var7_int++;
                        if (var9 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_Tb == -1) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.field_bc[this.field_Tb] == null) {
                            statePc = 23;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_int = this.field_bc[this.field_Tb].field_cc;
                        var8 = this.field_zb - -((var7_int + this.field_Tb) * this.field_dc);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((param2 ^ -1) <= (var8 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var8 - this.field_dc;
                        if (var9 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var9 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_bc[this.field_Tb].a(0, this.field_Xb + param1, var8, param3, param4, this.field_Qb[this.field_Tb].field_db);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw qb.a((Throwable) ((Object) var7), "og.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                field_gc = (mf) null;
                break L1;
              }
            }
            L2: {
              nc.b(124);
              if (null != kj.field_D) {
                t.a(false, kj.field_D);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ic.a((byte) -79);
              ve.a(5);
              qc.a(param0 + 14569);
              if (vg.a(param0 + -104)) {
                k.field_h.e(-13413, 1);
                cr.a(0, 10000);
                break L3;
              } else {
                break L3;
              }
            }
            hn.a((byte) 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "og.K(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (dc.field_b != 85) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            var4_int = stackIn_5_0;
            if (this.field_Vb != null) {
              L2: {
                if (var4_int == 0) {
                  break L2;
                } else {
                  if (this.field_Vb.field_Tb != -1) {
                    break L2;
                  } else {
                    this.f((byte) 41);
                    this.a(0, (byte) -81);
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_24_0 = this.field_Vb.a(param0, param1, (byte) -126);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                if (this.field_Vb != null) {
                  break L3;
                } else {
                  if (hd.field_a != this) {
                    break L3;
                  } else {
                    if (var4_int == 0) {
                      break L3;
                    } else {
                      rd.a(-1);
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              L4: {
                if (param2 == -126) {
                  break L4;
                } else {
                  this.field_Ub = (int[]) null;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var5 = go.field_b;
                  if (var5 > 0) {
                    L7: {
                      if ((wp.field_h ^ -1) == (var5 ^ -1)) {
                        var5 = 63;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var6 = 0;
                    L8: while (true) {
                      if (var6 >= this.field_fc.length) {
                        break L6;
                      } else {
                        stackIn_47_0 = var5;

                        if (var7 != 0) {
                          break L5;
                        } else {
                          if (stackIn_47_0 == this.field_fc[var6]) {
                            this.a(param1, var6, 0, param0);
                            stackIn_44_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            var6++;
                            if (var7 == 0) {
                              continue L8;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                stackIn_47_0 = 0;
                break L5;
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var4), "og.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_47_0 != 0;
              } else {
                return stackIn_44_0 != 0;
              }
            }
          }
        }
    }

    final int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -57) {
                break L1;
              } else {
                this.a(-64, -111, 97, -110, -124, 103);
                break L1;
              }
            }
            L2: {
              stackIn_6_0 = this.field_Xb;

              if (null != this.field_Vb) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = this.field_Vb.e((byte) -117);
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              }
            }
            stackIn_8_0 = stackIn_7_0 - -stackIn_7_1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "og.G(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    public static void d(boolean param0) {
        if (!param0) {
            return;
        }
        try {
            field_Yb = null;
            field_ac = null;
            field_gc = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "og.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, jp param3, int param4, int param5, int param6) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
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
        int var16 = 0;
        try {
          L0: {
            param5 = param5 + param3.field_E;
            param6 = param6 + param3.field_F;
            var7_int = param5 + param6 * lb.field_c;
            var8 = param3.field_C;
            var9 = param3.field_C;
            var10 = param3.field_D;
            var11 = 0;
            var12 = -var10;
            var13 = 0;
            if (param0 <= -111) {
              L1: {
                var14 = param1 << 792415336;
                var15 = (param2 + -param1 << -1174682360) / var9;
                if ((lb.field_b ^ -1) < (param6 ^ -1)) {
                  L2: {
                    var16 = lb.field_b + -param6;
                    param6 = lb.field_b;
                    var14 = var14 + var16 * var15;
                    if ((var16 ^ -1) <= (var9 ^ -1)) {
                      break L2;
                    } else {
                      var8 = param3.field_G[var16];
                      break L2;
                    }
                  }
                  var9 = var9 - var16;
                  var7_int = var7_int + lb.field_c * var16;
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: {
                if (var10 + param5 > lb.field_f) {
                  var13 = var13 - (var10 + param5 + -lb.field_f);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var9 + param6 > lb.field_j) {
                  var9 = var9 - (-lb.field_j + var9 + param6);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param5 >= lb.field_i) {
                  break L5;
                } else {
                  var12 = var12 + (-param5 + lb.field_i);
                  break L5;
                }
              }
              L6: {
                if (var12 >= var13) {
                  break L6;
                } else {
                  if (0 < var9) {
                    kf.a(lb.field_l, var15, var13, var11, var9, var14, param3.field_G, var10, var12, var8, 8, param4, var7_int);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L6;
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
          L7: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("og.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    static {
        field_ac = "Players";
    }
}
