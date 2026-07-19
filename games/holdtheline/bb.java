/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static sa field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var4 = param0.getCodeBase();
                    var3 = ah.a(var4, param0, (byte) 56).getFile();
                    discarded$6 = eo.a(param0, new Object[]{"home", var3 + "home.ws"}, false, "updatelinks");
                    discarded$7 = eo.a(param0, new Object[]{"gamelist", var3 + "togamelist.ws"}, false, "updatelinks");
                    if (param1 == 49) {
                      discarded$8 = eo.a(param0, new Object[]{"serverlist", var3 + "toserverlist.ws"}, false, "updatelinks");
                      discarded$9 = eo.a(param0, new Object[]{"options", var3 + "options.ws"}, false, "updatelinks");
                      discarded$10 = eo.a(param0, new Object[]{"terms", var3 + "terms.ws"}, false, "updatelinks");
                      discarded$11 = eo.a(param0, new Object[]{"privacy", var3 + "privacy.ws"}, false, "updatelinks");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("bb.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        ei discarded$2 = null;
        ei var2 = null;
        field_a = null;
        if (param0 < -34) {
          return;
        } else {
          var2 = (ei) null;
          discarded$2 = bb.a(-19, (ei) null, -1.1091806888580322f, (ei) null, true, (byte) 52, (ei) null, (ei) null);
          return;
        }
    }

    final static ei a(int param0, ei param1, float param2, ei param3, boolean param4, byte param5, ei param6, ei param7) {
        RuntimeException var8 = null;
        ei var9 = null;
        ei var10 = null;
        int var11 = 0;
        int var12 = 0;
        ha var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        ei var16 = null;
        ei var17 = null;
        ei var18 = null;
        Object var19 = null;
        ei stackIn_6_0 = null;
        ei stackIn_9_0 = null;
        ei stackIn_15_0 = null;
        ei stackIn_18_0 = null;
        boolean stackIn_21_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_34_0 = false;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        int stackIn_36_1 = 0;
        int stackIn_40_0 = 0;
        ei stackIn_44_0 = null;
        ei stackIn_47_0 = null;
        ei stackIn_51_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        ei stackOut_4_0 = null;
        ei stackOut_5_0 = null;
        ei stackOut_7_0 = null;
        ei stackOut_8_0 = null;
        ei stackOut_14_0 = null;
        ei stackOut_16_0 = null;
        ei stackOut_17_0 = null;
        boolean stackOut_20_0 = false;
        boolean stackOut_21_0 = false;
        int stackOut_21_1 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_22_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        boolean stackOut_33_0 = false;
        boolean stackOut_34_0 = false;
        int stackOut_34_1 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_35_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        ei stackOut_42_0 = null;
        ei stackOut_43_0 = null;
        ei stackOut_45_0 = null;
        ei stackOut_46_0 = null;
        ei stackOut_50_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 < -39) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bb.a(-105);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var18 = new ei();
                        if (!param4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (ei) (param1);
                        stackIn_6_0 = stackOut_4_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (ei) (param3);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var17 = stackIn_6_0;
                        var9 = var17;
                        if (!param4) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (ei) (param6);
                        stackIn_9_0 = stackOut_7_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (ei) (param7);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = stackIn_9_0;
                        var10 = var16;
                        var11 = param4 ? 1 : 0;
                        var12 = param4 ? 1 : 0;
                        if (-1 == (var16.field_e ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-1 >= (param0 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fc.a(2, 0.0f, param2, var17, var18);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        fc.a(2, (float)var17.field_e, param2, var17, var18);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (ei) (var18);
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    stackOut_16_0 = (ei) (var10);
                    stackIn_18_0 = stackOut_16_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (ei) (var19);
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0.field_e <= param0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        fc.a(2, (float)var9.field_e, param2, var9, var18);
                        param2 = 0.0f;
                        stackOut_20_0 = param4;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var11 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = stackIn_21_0;
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = stackIn_22_0;
                        stackOut_22_1 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((stackIn_23_0 ? 1 : 0) != stackIn_23_1) {
                            statePc = 50;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        kj.field_r = true;
                        param0 = param0 - var10.field_e;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 > param0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        fc.a(2, 0.0f, param2, var9, var18);
                        param2 = (float)var9.field_e;
                        if (param4) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 != var11) {
                            statePc = 50;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        kj.field_r = true;
                        param0 = param0 + var10.field_e;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var13 = (ha) (var10.field_b[param0]);
                        var14 = var13.field_m;
                        fc.a(2, var14, param2, var9, var18);
                        if (var13.field_l) {
                            statePc = 50;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = var13.field_s.field_r;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (param4) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = stackIn_34_0;
                        stackOut_34_1 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((stackIn_36_0 ? 1 : 0) != stackIn_36_1) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var12 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13.field_l = true;
                        var13.field_s.field_l = true;
                        param4 = var13.field_s.field_r;
                        param2 = var13.field_s.field_m;
                        if (!param4) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (ei) (param6);
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = (ei) (param7);
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var19 = stackIn_44_0;
                        var10 = (ei) (var19);
                        if (param4) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = (ei) (param3);
                        stackIn_47_0 = stackOut_45_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (ei) (param1);
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9 = stackIn_47_0;
                        param0 = var13.field_s.field_q;
                        if (var12 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param0++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param0--;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = (ei) (var18);
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return stackIn_51_0;
                }
                case 52: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackOut_52_0 = (RuntimeException) (var8);
                    stackOut_52_1 = new StringBuilder().append("bb.C(").append(param0).append(',');
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    if (param1 == null) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackOut_53_2 = "{...}";
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    stackIn_55_2 = stackOut_53_2;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackOut_54_2 = "null";
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param2).append(',');
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    if (param3 == null) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackOut_56_2 = "{...}";
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_58_2 = stackOut_56_2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackOut_57_2 = "null";
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (param6 == null) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackOut_59_2 = "{...}";
                    stackIn_61_0 = stackOut_59_0;
                    stackIn_61_1 = stackOut_59_1;
                    stackIn_61_2 = stackOut_59_2;
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackOut_60_2 = "null";
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    stackIn_61_2 = stackOut_60_2;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (param7 == null) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackOut_62_2 = "{...}";
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_64_2 = stackOut_62_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackOut_63_2 = "null";
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    stackIn_64_2 = stackOut_63_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    throw kk.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized static long b(int param0) {
        ei discarded$1 = null;
        long var1 = 0L;
        ei var3 = null;
        if (param0 == -1) {
          var1 = System.currentTimeMillis();
          if (ka.field_c > var1) {
            dg.field_d = dg.field_d + (-var1 + ka.field_c);
            ka.field_c = var1;
            return var1 - -dg.field_d;
          } else {
            ka.field_c = var1;
            return var1 - -dg.field_d;
          }
        } else {
          var3 = (ei) null;
          discarded$1 = bb.a(112, (ei) null, -1.1291340589523315f, (ei) null, true, (byte) 49, (ei) null, (ei) null);
          var1 = System.currentTimeMillis();
          if (ka.field_c <= var1) {
            ka.field_c = var1;
            return var1 - -dg.field_d;
          } else {
            dg.field_d = dg.field_d + (-var1 + ka.field_c);
            ka.field_c = var1;
            return var1 - -dg.field_d;
          }
        }
    }

    final static hj[] a(int param0, byte param1) {
        hj[] var4 = new hj[9];
        hj[] var2 = var4;
        var4[4] = mk.a(param0, -61, 64);
        int var3 = -88 % ((-70 - param1) / 56);
        return var2;
    }

    static {
    }
}
