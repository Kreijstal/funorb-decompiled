/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok implements wo {
    static fp field_b;
    private int field_d;
    static String field_i;
    private int field_f;
    static oj field_e;
    private vc field_h;
    static jm field_g;
    static db field_c;
    static wb field_a;

    final static void a(int param0) {
        jm.field_a = null;
        ui.field_c = (byte[][]) null;
        if (param0 != 2188450) {
            return;
        }
        try {
            uo.field_l = null;
            je.field_c = null;
            gh.field_z = null;
            uo.field_k = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ok.A(" + param0 + ')');
        }
    }

    final static void a(jg param0, int param1, byte param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        boolean stackOut_10_0;
        int statePc = 0;
        Throwable caughtException = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 8 / ((-86 - param2) / 33);
                        var6 = eq.c((-param1 + param4) * 3, (byte) 100);
                        var7 = param1 * 3;
                        var8 = var6 - 10;
                        go.a(-21587);
                        if (0 >= param0.field_s) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param0.field_o) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ck.n(48);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        pi.field_o = 0;
                        var9 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param0.field_I ^ -1) >= (var9 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = param0.field_K[var9];
                        var11 = param0.field_g[var9];
                        var12 = param0.field_c[var9];
                        stackOut_10_0 = param3;
                        stackIn_45_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var20 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13 = dn.field_a[var10];
                        var14 = qk.field_E[var10];
                        var15 = dn.field_a[var11] + -var13;
                        var16 = dn.field_a[var12] + -var13;
                        var17 = -var14 + qk.field_E[var11];
                        var18 = qk.field_E[var12] - var14;
                        if (var15 * var18 + -(var16 * var17) < 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var20 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 = cf.field_g[var10];
                        if (2147483647 == (var13 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var14 = cf.field_g[var11];
                        if (-2147483648 == var14) {
                            statePc = 43;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var15 = cf.field_g[var12];
                        if ((var15 ^ -1) == 2147483647) {
                            statePc = 43;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var16 = var15 + (var13 - -var14 + -var7);
                        if (var8 >= 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_25_0 = var16 << -var8;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var16 >> var8;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var17 = -stackIn_25_0 + (-1 + ga.field_J.length);
                        var18 = ga.field_J[var17];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var18 >> 488168516 ^ -1) == -1) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var17--;
                        stackIn_36_0 = -1;
                        stackIn_28_0 = stackIn_36_0;
                        stackIn_36_1 = var17 ^ -1;
                        stackIn_28_1 = stackIn_36_1;
                        if (var20 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 >= stackIn_28_1) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        System.err.println("Out of range!");
                        if (var20 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var18 = ga.field_J[var17];
                        if (var20 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var17 << 928575492;
                        stackIn_36_1 = var18;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var19 = stackIn_36_0 + stackIn_36_1;
                        gh.field_E[var19] = var9;
                        ga.field_J[var17] = 1 + var18;
                        if (-1 <= (param0.field_s ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param0.field_o) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        dupTemp$0 = param0.field_o[var9];
                        to.field_b[dupTemp$0] = to.field_b[dupTemp$0] + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        pi.field_o = pi.field_o + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9++;
                        if (var20 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = -1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 <= (param0.field_s ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null == param0.field_o) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var9 = 0;
                        var10 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((to.field_b.length ^ -1) >= (var10 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11 = to.field_b[var10];
                        to.field_b[var10] = var9;
                        var9 = var9 + var11;
                        var10++;
                        if (var20 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var20 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var5);
                    stackIn_57_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("ok.C(");
                    stackIn_57_1 = stackIn_59_1;
                    if (param0 == null) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw dn.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_b = null;
            field_g = null;
            field_c = null;
            field_e = null;
            field_i = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ok.D(" + param0 + ')');
        }
    }

    public ok() {
        try {
            this.field_h = ai.field_h;
            this.field_f = 1;
            this.field_d = 1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ok.<init>()");
        }
    }

    ok(vc param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_d = param2;
            this.field_f = param1;
            this.field_h = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ok.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int stackIn_10_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!param1) {
              L1: {
                L2: {
                  if (param3.field_m) {
                    break L2;
                  } else {
                    if (!param3.e(-123)) {
                      stackIn_10_0 = 2188450;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 3249872;
                break L1;
              }
              L3: {
                var6_int = stackIn_10_0;
                this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_o + "</u>", param2 - -param3.field_r, param0 + param3.field_j, param3.field_g, param3.field_f, var6_int, -1, this.field_f, this.field_d, this.field_h.field_u + this.field_h.field_o);
                if (!param3.e(-125)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var7 = this.field_h.a(param3.field_o);
                      var8 = this.field_h.field_o - -this.field_h.field_u;
                      var9 = param2 - -param3.field_r;
                      var10 = param3.field_j + param0;
                      if (this.field_f == 2) {
                        break L5;
                      } else {
                        if (1 != this.field_f) {
                          break L4;
                        } else {
                          var9 = var9 + (-var7 + param3.field_g >> -475426655);
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var9 = var9 + (-var7 + param3.field_g);
                    break L4;
                  }
                  L6: {
                    L7: {
                      if ((this.field_d ^ -1) == -3) {
                        break L7;
                      } else {
                        if (-2 != (this.field_d ^ -1)) {
                          break L6;
                        } else {
                          var10 = var10 + (-var8 + param3.field_f >> 1133987009);
                          if (var11 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var10 = var10 + (param3.field_f - var8);
                    break L6;
                  }
                  ci.a(var9 - 2, var10 - -2, param1, var8, 4 + var7);
                  break L3;
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
          L8: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("ok.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_i = "Create";
        field_b = new fp();
        field_a = new wb();
    }
}
