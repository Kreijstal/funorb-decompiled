/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends jk {
    static pj field_J;
    static String field_E;
    static int field_G;
    static ai[] field_D;
    static int field_H;
    static String field_F;
    static boolean field_I;

    public static void a(boolean param0) {
        if (param0) {
            oa.a(false);
        }
        field_J = null;
        field_E = null;
        field_D = null;
        field_F = null;
    }

    private oa(int param0, int param1, int param2, int param3, ml param4, of param5, we param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_v = param6;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_15_1 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
            var7 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var2 = "tuhstatbut";
                    var3 = (String) (mf.a(-26159, "getcookies", param1));
                    var4 = ma.a(126, ';', var3);
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if ((var4.length ^ -1) >= (var5 ^ -1)) {
                          break L3;
                        } else {
                          var6 = var4[var5].indexOf('=');
                          stackIn_15_0 = -1;

                          stackIn_15_1 = var6 ^ -1;

                          if (var7 != 0) {
                            decompiledRegionSelector0 = 0;
                            break L1;
                          } else {
                            L4: {
                              if (stackIn_15_0 < stackIn_15_1) {
                                break L4;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                  stackIn_10_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2_ref2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 2;
                    break L5;
                  }
                }
                L6: {
                  if (decompiledRegionSelector0 == 0) {
                    break L6;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      stackIn_15_0 = param0;
                      stackIn_15_1 = -120;
                      break L6;
                    }
                  }
                }
                L7: {
                  if (stackIn_15_0 < stackIn_15_1) {
                    break L7;
                  } else {
                    field_D = (ai[]) null;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.getParameter("tuhstatbut")) {
                    stackIn_20_0 = 0;
                    break L8;
                  } else {
                    stackIn_20_0 = 1;
                    break L8;
                  }
                }
                decompiledRegionSelector1 = 0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2_ref);

                stackIn_23_1 = new StringBuilder().append("oa.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L9;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L9;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ee var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3, param4 ^ param4, param5);
                var7 = od.field_n;
                if (var7 == null) {
                  break L2;
                } else {
                  if (!this.a(param1, param0, param5, param3, (byte) 45)) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_o instanceof tc) {
                        break L3;
                      } else {
                        if (!(var7.field_o instanceof tc)) {
                          break L2;
                        } else {
                          ((tc) ((Object) var7.field_o)).a((oa) (this), (byte) -27, var7);
                          od.field_n = null;
                          if (!MonkeyPuzzle2.field_F) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ((tc) ((Object) this.field_o)).a((oa) (this), (byte) -27, var7);
                    od.field_n = null;
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("oa.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(float param0, float[] param1, int param2) {
        try {
            param1[1] = param1[1] * param0;
            if (param2 <= 104) {
                field_F = (String) null;
            }
            param1[0] = param1[0] * param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void j(int param0) {
        boolean stackIn_4_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_44_0 = 0;
        il stackIn_47_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        boolean stackOut_3_0;
        il stackOut_46_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        ki var2 = null;
        int var2_int = 0;
        int var3 = 0;
        il var3_ref_il = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        var2 = (ki) ((Object) ok.field_a.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == null) {
                            statePc = 43;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = qb.field_b;
                        stackIn_44_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var6 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (2 != var2.field_w) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        h.a(3, true);
                        if (var6 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-4 == (var2.field_w ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2.field_w != 5) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        h.a(2, true);
                        if (var6 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (6 != var2.field_w) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        h.a(1, true);
                        if (var6 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        h.a(4, true);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var2.field_w != 6) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var2.field_j) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var2.field_x) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = stackIn_22_0;
                        var2.g(122);
                        if (var3 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var2.field_j) {
                            statePc = 37;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 <= (var2.field_m ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = 0;
                        var5 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var2.field_m ^ -1) >= (var5 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_56_0 = -5;
                        stackIn_28_0 = stackIn_56_0;
                        stackIn_56_1 = var2.field_o[var5].field_w ^ -1;
                        stackIn_28_1 = stackIn_56_1;
                        if (var6 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = 1;
                        if (var6 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var4 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2.field_t = hd.field_u;
                        if (var6 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var2.field_q = var2.field_q + 2.0f;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var6 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!var2.field_x) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var2.field_w != 6) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var2.field_m == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2.field_t = hd.field_u;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var2_int = stackIn_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-4 >= (var2_int ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (il) ((Object) rf.field_a.a((byte) -117));
                        stackIn_55_0 = stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (var6 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3_ref_il = stackIn_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var3_ref_il == null) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var3_ref_il.e(5);
                        var3_ref_il = (il) ((Object) rf.field_a.d((byte) 63));
                        if (var6 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var6 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var2_int++;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var6 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = ok.field_a.a((byte) -117);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var2 = (ki) ((Object) stackIn_55_0);
                        stackIn_56_0 = param0;
                        stackIn_56_1 = -79;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 <= stackIn_56_1) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        oa.a(true);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var2 == null) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var2.d((byte) 116);
                        var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                        if (var6 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var6 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var2 = (ki) ((Object) ok.field_a.a((byte) -117));
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var2 == null) {
                            statePc = 87;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var2.f(-7);
                        stackIn_88_0 = (var2.field_q - (float)var2.field_y < (float)(hf.field_f.field_k + -90) ? -1 : (var2.field_q - (float)var2.field_y == (float)(hf.field_f.field_k + -90) ? 0 : 1));
                        stackIn_66_0 = stackIn_88_0;
                        if (var6 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 > 0) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (vl.field_j) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        hf.field_f.d(-115);
                        vl.field_j = false;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var1_int = 1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var2.field_w ^ -1) == -2) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (6 == var2.field_w) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var2.field_w == 5) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var2.field_w ^ -1) != -1) {
                            statePc = 82;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (!pa.a(var2.field_I, (int)(var2.field_B + (float)var2.field_G), (int)var2.field_q + var2.field_y, sb.field_m, 80, 0)) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (!jj.a(-32680, var2, -80 + (var2.field_G + (int)var2.field_B), var2.field_y + (int)var2.field_q)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_81_0 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3 = stackIn_81_0;
                        var2.field_x = var2.field_x | var3 != 0;
                        if (var6 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var2.field_w != 3) {
                            statePc = 86;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (-2 != (var2.field_n ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var2.field_C ^ -1) >= -5) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var2.field_t = ri.field_b;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var2.c((byte) -114);
                        var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                        if (var6 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_88_0 = var1_int;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        vl.field_j = stackIn_88_0 != 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "oa.D(" + param0 + ')');
                }
                case 91: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_J = new pj();
        field_G = -1;
        field_E = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_F = "Please try again in a few minutes.";
    }
}
