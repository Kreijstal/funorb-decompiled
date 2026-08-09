/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends oj {
    static int[] field_F;
    static dm field_E;
    static wk field_z;
    static int[][] field_y;
    int[] field_B;
    static cv field_C;
    static rk field_G;
    static bo field_D;
    int field_I;
    private boolean field_A;
    static boolean field_J;
    int field_H;

    final String a(byte param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        String stackIn_49_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        System.out.println("Move event debug");
                        System.out.println("Unit at " + this.field_H + "," + this.field_I);
                        var3_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3_int >= this.field_B.length) {
                            statePc = 37;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = this.field_B[var3_int];
                        stackIn_38_0 = -2;
                        stackIn_7_0 = stackIn_38_0;
                        stackIn_38_1 = var4 ^ -1;
                        stackIn_7_1 = stackIn_38_1;
                        if (var6 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 != stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var4 ^ -1) == -3) {
                            statePc = 28;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 != var4) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var6 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (3 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        System.out.println("North");
                        if (var6 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        System.out.println("South");
                        if (var6 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        System.out.println("East");
                        if (var6 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        System.out.println("West");
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = -3;
                        stackIn_38_1 = (param0 - 53) / 51;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4 = stackIn_38_0 / stackIn_38_1;
                        var3 = "EventMove: start: (" + this.field_H + ", " + this.field_I + ")" + "\n";
                        if (null != this.field_B) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3 = var3 + "footsteps[" + this.field_B.length + "]: (";
                        var5 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5 >= this.field_B.length) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3 = var3 + this.field_B[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3 = var3 + ")";
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = (String) (var3);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0;
                }
                case 50: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var3_ref), "kr.C(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -84) {
              stackIn_4_0 = this.a((byte) -39, param2, param0, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("kr.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(kl param0, boolean param1, kl param2, kl param3) {
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        wk var4 = null;
        RuntimeException var4_ref = null;
        ru[] var5 = null;
        ru[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ru[] var10 = null;
        wk var10_ref = null;
        int var11_int = 0;
        wk var11 = null;
        wk var12 = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        t.field_d = fk.a("frame_top", (byte) -124, param2, "commonui");
                        ip.field_c = fk.a("frame_bottom", (byte) -125, param2, "commonui");
                        gt.field_e = ic.a("jagex_logo_grey", (byte) 51, "commonui", param2);
                        bb.field_b = fk.a("button", (byte) -124, param2, "commonui");
                        db.field_a = ac.a(param2, "validation", (byte) -4, "commonui");
                        gl.field_e = (ka) ((Object) it.a("arezzo12", param2, param3, (byte) -87, "commonui"));
                        ArmiesOfGielinor.field_J = (ka) ((Object) it.a("arezzo14", param2, param3, (byte) -87, "commonui"));
                        bv.field_t = (ka) ((Object) it.a("arezzo14bold", param2, param3, (byte) -87, "commonui"));
                        var4 = new wk(param0.a("", 45, "button.gif"), (java.awt.Component) ((Object) si.field_b));
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        kr.g(90);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        pv.a("commonui", "dropdown", param2, 24914);
                        var5 = lo.a("screen_options", -28106, "commonui", param2);
                        oa.field_H = new ru[4];
                        dq.field_e = new ru[4];
                        tg.field_b = new ru[4];
                        var6 = new ru[][]{oa.field_H, dq.field_e, tg.field_b};
                        var7 = new int[4][];
                        var7[0] = var5[0].field_j;
                        var8 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var8 ^ -1) <= (var7.length ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7[var8] = (int[]) ((Object) var7[0].clone());
                        var8++;
                        if (var13 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var13 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = var5[0].field_k[0];
                        var7[2][var8] = 16777215;
                        var7[1][var8] = 2394342;
                        var7[3][var8] = 4767999;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-4 >= (var9 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = var6[var9];
                        stackIn_23_0 = 0;
                        stackIn_14_0 = stackIn_23_0;
                        if (var13 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11_int = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var10.length ^ -1) >= (var11_int ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10[var11_int] = vf.a(var7[var11_int], -13546, var5[var9]);
                        var11_int++;
                        if (var13 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var13 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var13 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = var4.field_v;
                        rq.a((byte) -56);
                        var4.b();
                        stackIn_23_0 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        qn.c(stackIn_23_0, 0, qn.field_l, qn.field_g);
                        var10_ref = new wk(var9, var9);
                        var10_ref.b();
                        var4.f(0, 0);
                        var11 = new wk(var9, var9);
                        var11.b();
                        var4.f(-var4.field_y + var9, 0);
                        var12 = new wk(-(var9 * 2) + var4.field_y, var9);
                        var12.b();
                        var4.f(-var9, 0);
                        rf.b(-18862);
                        bb.field_b = new wk[]{var10_ref, var12, var11};
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var4_ref);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("kr.D(");
                    stackIn_26_1 = stackIn_28_1;
                    if (param0 == null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_26_1);
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
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');
                    stackIn_30_1 = stackIn_32_1;
                    if (param2 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_0 = stackIn_36_0;
                    stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
                    stackIn_34_1 = stackIn_36_1;
                    if (param3 == null) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_37_2 = "{...}";
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_37_2 = "null";
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ha param0, int param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_146_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ne var5 = null;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ne var9 = null;
        int var10_int = 0;
        ne var10 = null;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_A) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        this.field_A = true;
                        var3_int = this.field_H;
                        var4 = this.field_I;
                        if (param1 == -26661) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_J = false;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = param0.field_Eb[this.field_H - -(this.field_I * param0.field_v)];
                        var6 = var5.field_c;
                        if (null != var6) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var7 = 0;
                        if ((param0.field_Eb[this.field_H + param0.field_v * this.field_I].field_h ^ -1) == -7) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0.field_Eb[this.field_H + param0.field_v * this.field_I].field_h == 4) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0.field_Eb[this.field_I * param0.field_v + this.field_H].field_h != 10) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = stackIn_19_0;
                        var9_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((this.field_B.length ^ -1) >= (var9_int ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10_int = this.field_B[var9_int];
                        if ((var10_int ^ -1) == -2) {
                            statePc = 39;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-3 != (var10_int ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var12 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 != var10_int) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var12 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var10_int == 3) {
                            statePc = 46;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4--;
                        if (var12 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4++;
                        if (var12 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3_int++;
                        if (var12 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3_int--;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10 = param0.field_Eb[var4 * param0.field_v + var3_int];
                        var11 = var10.field_h;
                        if (62 != var6.field_N) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var11 != 2) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (this.field_B.length == 1) {
                            statePc = 102;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (29 != var6.field_N) {
                            statePc = 81;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var11 ^ -1) != -4) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        param0.b((byte) 10, 0, var3_int, var4);
                        var7 = 1;
                        if (var12 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (param0.field_K == null) {
                            statePc = 103;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var11 == 7) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (-12 != (var11 ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (!var6.c(false)) {
                            statePc = 103;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var10.a(var6.field_O, (byte) 91)) {
                            statePc = 103;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (0 == (var10.field_a ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var7 = 1;
                        param0.b((byte) 127, 1, var3_int, var4);
                        if (var12 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var6.field_N != 40) {
                            statePc = 88;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (0 != var11) {
                            statePc = 88;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var7 = 1;
                        param0.b((byte) 6, 3, var3_int, var4);
                        if (var12 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((this.field_w.field_N ^ -1) != -74) {
                            statePc = 103;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var8 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((var11 ^ -1) == -1) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        param0.b((byte) -59, 4, var3_int, var4);
                        var7 = 1;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (-2 != (var11 ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        param0.b((byte) -100, 10, var3_int, var4);
                        var7 = 1;
                        if (var12 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        param0.b((byte) 113, 0, var3_int, var4);
                        var7 = 1;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var9_int++;
                        if (var12 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var9 = param0.field_Eb[param0.field_v * var4 + var3_int];
                        if (var6.field_N == 39) {
                            statePc = 138;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var6.field_J != var3_int) {
                            statePc = 111;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var6.field_w == var4) {
                            statePc = 140;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var6.field_bb) {
                            statePc = 117;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var5.field_c = null;
                        var5.field_m = var5.e(10);
                        if (var12 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var6.field_bb = false;
                        this.field_w.field_bb = false;
                        param0.a(8288, this.field_w);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        this.field_w.field_w = var4;
                        this.field_w.field_J = var3_int;
                        this.field_w.a((byte) 106);
                        var10 = var9;
                        if (!var6.p(-75)) {
                            statePc = 121;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var7 = 3;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (!var10.e((byte) -118)) {
                            statePc = 125;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if ((var10.field_a ^ -1) == (this.field_w.field_O ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var10.field_c = this.field_w;
                        if (0 < var7) {
                            statePc = 130;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        param0.a(var4, var3_int, 0, var7);
                        if (var12 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_w.field_G = true;
                        this.field_w.field_S = true;
                        this.field_w.d(-109);
                        param0.m(0, this.field_w.field_O);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (-1 > (var7 ^ -1)) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        param0.a(this.field_I, this.field_H, param1 + 26661, var7);
                        nk.a((byte) 101);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var12 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var6.field_s = true;
                        var9.field_c = var6.b(false);
                        var9.field_c.field_J = var3_int;
                        var9.field_c.field_w = var4;
                        var9.field_c.a((byte) -35);
                        var9.field_c.field_s = true;
                        param0.a(param1 ^ -18501, var9.field_c);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        this.field_w.field_s = true;
                        fl.a(param0, param1 ^ 26718);
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 142: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_145_0 = (RuntimeException) (var3);
                    stackIn_143_0 = stackIn_145_0;
                    stackIn_145_1 = new StringBuilder().append("kr.G(");
                    stackIn_143_1 = stackIn_145_1;
                    if (param0 == null) {
                        statePc = 145;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    stackIn_146_0 = (RuntimeException) ((Object) stackIn_143_0);
                    stackIn_146_1 = (StringBuilder) ((Object) stackIn_143_1);
                    stackIn_146_2 = "{...}";
                    statePc = 146;
                    continue stateLoop;
                }
                case 145: {
                    stackIn_146_0 = (RuntimeException) ((Object) stackIn_145_0);
                    stackIn_146_1 = (StringBuilder) ((Object) stackIn_145_1);
                    stackIn_146_2 = "null";
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    throw ig.a((Throwable) ((Object) stackIn_146_0), stackIn_146_2 + ',' + param1 + ')');
                }
                case 147: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_F = null;
              field_z = null;
              field_E = null;
              field_G = null;
              if (param0 == 29333) {
                break L1;
              } else {
                kr.g(-45);
                break L1;
              }
            }
            field_C = null;
            field_D = null;
            field_y = (int[][]) null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "kr.B(" + param0 + ')');
        }
    }

    kr(int param0, int param1, int[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_A = false;
        try {
          L0: {
            this.field_H = param0;
            this.field_m = 0;
            this.field_B = param2;
            this.field_I = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("kr.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_y = new int[29][];
        field_F = new int[]{1000, 1150, 850, 1300, 700};
        field_J = true;
        field_D = new bo();
        gb.a(24, 0, 180, 460, 160, 465, new int[]{32, 31, 47, 1, 25, 30, 40, 35, 5, 48, 19, 16}, -59);
        gb.a(30, 23, 180, 460, 160, 320, new int[]{3, 53, 54, 4, 7}, -52);
        bt.a(26);
        gb.a(30, 1, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 9}, -90);
        gb.a(30, 24, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 50, 9}, -43);
        gb.a(30, 2, 180, 460, 100, 400, new int[]{2, 43, 5, 10, 11, 13}, -75);
        gb.a(30, 19, 180, 460, 100, 170, new int[]{45, 42}, -115);
        gb.a(30, 25, 180, 460, 100, 170, new int[]{52, 51}, -54);
        gb.a(30, 3, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 12, 13}, -41);
        gb.a(30, 4, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 13}, -86);
        gb.a(30, 6, 180, 460, 400, 460, new int[]{20, 8}, -115);
        gb.a(30, 26, 180, 460, 400, 460, new int[]{20, 8}, -51);
        gb.a(30, 27, 180, 460, 400, 460, new int[]{20, 8}, -111);
        gb.a(30, 28, 180, 460, 400, 460, new int[]{20, 8}, -117);
        gb.a(30, 12, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -114);
        gb.a(30, 13, 60, 580, 440, 470, new int[]{7}, -78);
        gb.a(30, 20, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -95);
        vt.a(-120);
        gb.a(30, 8, 280, 360, 438, 440, new int[]{20, 8}, -119);
        gb.a(30, 9, 280, 360, 438, 440, new int[]{7}, -27);
        gb.a(30, 10, 180, 460, 400, 460, new int[]{20, 21}, -70);
        gb.a(30, 11, 100, 540, 100, 400, new int[]{7}, -52);
        gb.a(30, 15, 180, 460, 100, 400, new int[]{}, -102);
        gb.a(30, 14, 180, 460, 120, 350, new int[]{17, 18, 36, 37, 38, 6, 7}, -96);
        gb.a(30, 16, 532, 633, 390, 420, new int[]{39}, -36);
        gb.a(30, 17, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 43}, -63);
        gb.a(30, 18, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -87);
        df.a(-20);
    }
}
