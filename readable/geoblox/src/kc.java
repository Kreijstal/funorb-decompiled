/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        int var1 = 7 % ((79 - param0) / 43);
        field_b = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener(je.field_j);
        if (param1 != 0) {
            return;
        }
        try {
            param0.removeFocusListener(je.field_j);
            ii.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
                        if (param1 == -98) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (md.field_c <= var2_int) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        qi.field_i[param0 + var2_int] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c - -param0, false);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 < md.field_c) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        md.field_c = param0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw t.a((Throwable) ((Object) var2), "kc.A(" + param0 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void reconcileBoardEntities_b(int param0) {
        tf stackIn_4_0 = null;
        tf stackIn_12_0 = null;
        boolean stackIn_15_0 = false;
        GameplayEntity_ja stackIn_20_0 = null;
        boolean stackIn_22_0 = false;
        GameplayEntity_ja stackIn_28_0 = null;
        GameplayEntity_ja stackIn_31_0 = null;
        GameplayEntity_ja stackIn_31_1 = null;
        GameplayEntity_ja stackIn_38_0 = null;
        GameplayEntity_ja stackIn_38_1 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        GameplayEntity_ja stackIn_51_0 = null;
        GameplayEntity_ja stackIn_51_1 = null;
        int stackIn_56_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        GameplaySession_gh stackIn_107_0 = null;
        GameplaySession_gh stackIn_108_0 = null;
        GameplaySession_gh stackIn_109_0 = null;
        GameplaySession_gh stackIn_110_0 = null;
        GameplaySession_gh stackIn_111_0 = null;
        GameplaySession_gh stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        boolean stackOut_14_0;
        boolean stackOut_21_0;
        int statePc = 0;
        Throwable caughtException = null;
        GameplayEntity_ja activeEntity_var1 = null;
        int entityIndexThenGroupCount_var1_int = 0;
        RuntimeException var1_ref = null;
        GameplayEntity_ja candidateEntity_var2_ref_ja = null;
        int var2 = 0;
        float radialOffsetX_var3_float = 0.0f;
        int var3_int = 0;
        GameplayEntity_ja queuedEntity_var3 = null;
        int var4_int = 0;
        float radialOffsetY_var4_float = 0.0f;
        GameplayEntity_ja var4 = null;
        GameplayEntity_ja groupEntity_var5_ref_ja = null;
        double radialVelocityScale_var5 = 0.0;
        int childEntityIndex_var6_int = 0;
        GameplayEntity_ja var6 = null;
        GameplayEntity_ja var7 = null;
        int relatedEntityIndex_var7_int = 0;
        GameplayEntity_ja relatedEntityCandidate_var8 = null;
        int var9 = 0;
        GameplayEntity_ja entityCandidate_var10 = null;
        wd var11 = null;
        GameplayEntity_ja parentEntity_var12 = null;
        wd var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fa.field_a = false;
                        activeEntity_var1 = (GameplayEntity_ja) ((Object) ji.field_r.g(0));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (activeEntity_var1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_12_0 = activeEntity_var1.entityQueue_field_K;
                        stackIn_4_0 = stackIn_12_0;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == a.field_d) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (activeEntity_var1.field_B) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        fa.field_a = true;
                        if (var9 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        activeEntity_var1.eraseEntityTrail_j(30383);
                        activeEntity_var1.k(2);
                        activeEntity_var1.a(false);
                        activeEntity_var1.a((byte) 54);
                        a.field_d.a(-80, activeEntity_var1);
                        el.gameplaySession_field_o.field_F = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        activeEntity_var1.entityQueue_field_K = null;
                        activeEntity_var1 = (GameplayEntity_ja) ((Object) ji.field_r.d(1));
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!re.field_j) {
                            statePc = 61;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = a.field_d;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        activeEntity_var1 = (GameplayEntity_ja) ((Object) ((tf) (Object) stackIn_12_0).g(0));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (activeEntity_var1 == null) {
                            statePc = 55;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = pk.field_o[activeEntity_var1.entityId_field_H];
                        stackIn_56_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!stackIn_15_0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = new wd();
                        var13 = new wd();
                        var11.a(activeEntity_var1, false);
                        var4_int = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (GameplayEntity_ja) ((Object) var11.a(true));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        entityCandidate_var10 = stackIn_20_0;
                        parentEntity_var12 = entityCandidate_var10;
                        groupEntity_var5_ref_ja = parentEntity_var12;
                        if (parentEntity_var12 == null) {
                            statePc = 43;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        pk.field_o[entityCandidate_var10.entityId_field_H] = true;
                        stackOut_21_0 = parentEntity_var12.field_t;
                        stackIn_44_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var9 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4_int = 0;
                        if (var9 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13.a(parentEntity_var12, false);
                        childEntityIndex_var6_int = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (childEntityIndex_var6_int >= parentEntity_var12.relatedEntityCount_field_L) {
                            statePc = 42;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 = entityCandidate_var10.relatedEntities_field_n[childEntityIndex_var6_int];
                        stackIn_20_0 = (GameplayEntity_ja) ((Object) var13.c((byte) 121));
                        stackIn_28_0 = stackIn_20_0;
                        if (var9 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        relatedEntityCandidate_var8 = stackIn_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (relatedEntityCandidate_var8 == null) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_51_0 = (GameplayEntity_ja) (relatedEntityCandidate_var8);
                        stackIn_31_0 = stackIn_51_0;
                        stackIn_51_1 = (GameplayEntity_ja) (var7);
                        stackIn_31_1 = stackIn_51_1;
                        if (var9 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        relatedEntityCandidate_var8 = (GameplayEntity_ja) ((Object) var13.a(-45));
                        if (var9 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        relatedEntityCandidate_var8 = (GameplayEntity_ja) ((Object) var11.c((byte) 121));
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (relatedEntityCandidate_var8 == null) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_51_0 = (GameplayEntity_ja) (relatedEntityCandidate_var8);
                        stackIn_38_0 = stackIn_51_0;
                        stackIn_51_1 = (GameplayEntity_ja) (var7);
                        stackIn_38_1 = stackIn_51_1;
                        if (var9 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == stackIn_38_1) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        relatedEntityCandidate_var8 = (GameplayEntity_ja) ((Object) var11.a(54));
                        if (var9 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11.a(var7, false);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        childEntityIndex_var6_int++;
                        if (var9 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = var4_int;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        groupEntity_var5_ref_ja = (GameplayEntity_ja) ((Object) var13.a(true));
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (groupEntity_var5_ref_ja == null) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        groupEntity_var5_ref_ja.entityQueue_field_K = ji.field_r;
                        groupEntity_var5_ref_ja.field_t = false;
                        groupEntity_var5_ref_ja.field_B = true;
                        fa.field_a = true;
                        stackIn_56_0 = 0;
                        stackIn_48_0 = stackIn_56_0;
                        if (var9 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        childEntityIndex_var6_int = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (childEntityIndex_var6_int >= groupEntity_var5_ref_ja.relatedEntityCount_field_L) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = groupEntity_var5_ref_ja.relatedEntities_field_n[childEntityIndex_var6_int];
                        stackIn_51_1 = (GameplayEntity_ja) (groupEntity_var5_ref_ja);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((GameplayEntity_ja) (Object) stackIn_51_0).removeRelatedEntity_a(stackIn_51_1, 0);
                        childEntityIndex_var6_int++;
                        if (var9 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var9 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = groupEntity_var5_ref_ja;
                        var7 = groupEntity_var5_ref_ja;
                        groupEntity_var5_ref_ja.relatedEntityCount_field_L = 0;
                        var6.sameCategoryEntityCount_field_N = 0;
                        var7.sameVariantEntityCount_field_m = 0;
                        groupEntity_var5_ref_ja = (GameplayEntity_ja) ((Object) var13.a(true));
                        if (var9 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        activeEntity_var1 = (GameplayEntity_ja) ((Object) a.field_d.d(1));
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        re.field_j = false;
                        el.gameplaySession_field_o.field_B = true;
                        stackIn_56_0 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        entityIndexThenGroupCount_var1_int = stackIn_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (1000 <= entityIndexThenGroupCount_var1_int) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        pk.field_o[entityIndexThenGroupCount_var1_int] = false;
                        entityIndexThenGroupCount_var1_int++;
                        if (var9 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var9 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        entityIndexThenGroupCount_var1_int = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        candidateEntity_var2_ref_ja = (GameplayEntity_ja) ((Object) a.field_d.g(0));
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (candidateEntity_var2_ref_ja == null) {
                            statePc = 98;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (null != candidateEntity_var2_ref_ja.entityQueue_field_K) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (!w.field_f) {
                            statePc = 97;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (candidateEntity_var2_ref_ja.field_t) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        re.field_j = true;
                        candidateEntity_var2_ref_ja.a(false);
                        candidateEntity_var2_ref_ja.a((byte) 100);
                        el.gameplaySession_field_o.field_F = true;
                        candidateEntity_var2_ref_ja.eraseEntityPixels_f(92);
                        if (ji.field_r != candidateEntity_var2_ref_ja.entityQueue_field_K) {
                            statePc = 75;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        candidateEntity_var2_ref_ja.rotateEntityAroundBoard_a(-el.gameplaySession_field_o.boardAngleRadians_field_J, -117);
                        radialOffsetX_var3_float = -candidateEntity_var2_ref_ja.positionX_field_o + 320.0f;
                        radialOffsetY_var4_float = -candidateEntity_var2_ref_ja.positionY_field_v + 240.0f;
                        radialVelocityScale_var5 = (double)og.field_r / Math.sqrt((double)(radialOffsetY_var4_float * radialOffsetY_var4_float + radialOffsetX_var3_float * radialOffsetX_var3_float));
                        radialOffsetX_var3_float = (float)((double)radialOffsetX_var3_float * radialVelocityScale_var5);
                        radialOffsetY_var4_float = (float)((double)radialOffsetY_var4_float * radialVelocityScale_var5);
                        candidateEntity_var2_ref_ja.velocityY_field_F = radialOffsetY_var4_float;
                        candidateEntity_var2_ref_ja.velocityX_field_w = radialOffsetX_var3_float;
                        relatedEntityIndex_var7_int = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (candidateEntity_var2_ref_ja.relatedEntityCount_field_L <= relatedEntityIndex_var7_int) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        candidateEntity_var2_ref_ja.relatedEntities_field_n[relatedEntityIndex_var7_int].removeRelatedEntity_a(candidateEntity_var2_ref_ja, 0);
                        relatedEntityIndex_var7_int++;
                        if (var9 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var9 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var7 = candidateEntity_var2_ref_ja;
                        relatedEntityCandidate_var8 = candidateEntity_var2_ref_ja;
                        candidateEntity_var2_ref_ja.relatedEntityCount_field_L = 0;
                        var7.sameCategoryEntityCount_field_N = 0;
                        relatedEntityCandidate_var8.sameVariantEntityCount_field_m = 0;
                        ji.field_r.a(-36, candidateEntity_var2_ref_ja);
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (candidateEntity_var2_ref_ja.entityQueue_field_K == bh.field_c) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (w.field_f) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var3_int = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var3_int >= candidateEntity_var2_ref_ja.relatedEntityCount_field_L) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        candidateEntity_var2_ref_ja.relatedEntities_field_n[var3_int].removeRelatedEntity_a(candidateEntity_var2_ref_ja, 0);
                        candidateEntity_var2_ref_ja.relatedEntities_field_n[var3_int].k(2);
                        var3_int++;
                        if (var9 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var9 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        queuedEntity_var3 = candidateEntity_var2_ref_ja;
                        candidateEntity_var2_ref_ja.relatedEntityCount_field_L = 0;
                        var4 = candidateEntity_var2_ref_ja;
                        queuedEntity_var3.sameCategoryEntityCount_field_N = 0;
                        var4.sameVariantEntityCount_field_m = 0;
                        candidateEntity_var2_ref_ja.remainingLifetimeTicks_field_r = 50;
                        bh.field_c.a(-100, candidateEntity_var2_ref_ja);
                        candidateEntity_var2_ref_ja.animationFrameIndex_field_G = 0;
                        if (!candidateEntity_var2_ref_ja.field_t) {
                            statePc = 91;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (!w.field_f) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_88_0 = (int)candidateEntity_var2_ref_ja.positionY_field_v;
                        stackIn_86_0 = stackIn_88_0;
                        stackIn_88_1 = (int)candidateEntity_var2_ref_ja.positionX_field_o;
                        stackIn_86_1 = stackIn_88_1;
                        stackIn_88_2 = 117;
                        stackIn_86_2 = stackIn_88_2;
                        if ((candidateEntity_var2_ref_ja.field_z ^ -1) == -5) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_89_0 = stackIn_86_0;
                        stackIn_87_0 = stackIn_89_0;
                        stackIn_89_1 = stackIn_86_1;
                        stackIn_87_1 = stackIn_89_1;
                        stackIn_89_2 = stackIn_86_2;
                        stackIn_87_2 = stackIn_89_2;
                        if ((candidateEntity_var2_ref_ja.field_z ^ -1) != -4) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_88_0 = stackIn_87_0;
                        stackIn_88_1 = stackIn_87_1;
                        stackIn_88_2 = stackIn_87_2;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_90_0 = stackIn_88_0;
                        stackIn_90_1 = stackIn_88_1;
                        stackIn_90_2 = stackIn_88_2;
                        stackIn_90_3 = 100;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_90_0 = stackIn_89_0;
                        stackIn_90_1 = stackIn_89_1;
                        stackIn_90_2 = stackIn_89_2;
                        stackIn_90_3 = 10;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ld.a(stackIn_90_0, stackIn_90_1, stackIn_90_2, stackIn_90_3);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (4 == candidateEntity_var2_ref_ja.field_z) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        candidateEntity_var2_ref_ja.configureEntitySprite_a(320, candidateEntity_var2_ref_ja.entityCategoryKey_field_C, candidateEntity_var2_ref_ja.spriteVariantIndex_field_M, 5);
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        candidateEntity_var2_ref_ja.configureEntitySprite_a(320, candidateEntity_var2_ref_ja.entityCategoryKey_field_C, candidateEntity_var2_ref_ja.spriteVariantIndex_field_M, 7);
                        entityIndexThenGroupCount_var1_int++;
                        rb.field_b = rb.field_b + 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        candidateEntity_var2_ref_ja.entityQueue_field_K = null;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        el.gameplaySession_field_o.field_F = true;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        candidateEntity_var2_ref_ja = (GameplayEntity_ja) ((Object) a.field_d.d(1));
                        if (var9 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var2 = -23 / ((param0 - 69) / 46);
                        queuedEntity_var3 = (GameplayEntity_ja) ((Object) bh.field_c.g(0));
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (queuedEntity_var3 == null) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var9 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (ra.field_a != queuedEntity_var3.entityQueue_field_K) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        queuedEntity_var3.a(false);
                        queuedEntity_var3.a((byte) 51);
                        ra.field_a.a(-44, queuedEntity_var3);
                        queuedEntity_var3.entityQueue_field_K = null;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        queuedEntity_var3 = (GameplayEntity_ja) ((Object) bh.field_c.d(1));
                        if (var9 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (!w.field_f) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        jc.a(3, false);
                        jl.field_t = false;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_110_0 = el.gameplaySession_field_o;
                        stackIn_107_0 = stackIn_110_0;
                        if (el.gameplaySession_field_o.field_F) {
                            statePc = 110;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackIn_110_0 = (GameplaySession_gh) ((Object) stackIn_107_0);
                        stackIn_108_0 = stackIn_110_0;
                        if (ab.field_f) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackIn_111_0 = (GameplaySession_gh) ((Object) stackIn_108_0);
                        stackIn_109_0 = stackIn_111_0;
                        if (!w.field_f) {
                            statePc = 111;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackIn_110_0 = (GameplaySession_gh) ((Object) stackIn_109_0);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_112_0 = (GameplaySession_gh) ((Object) stackIn_110_0);
                        stackIn_112_1 = 1;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackIn_112_0 = (GameplaySession_gh) ((Object) stackIn_111_0);
                        stackIn_112_1 = 0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackIn_112_0.field_F = stackIn_112_1 != 0;
                        w.field_f = false;
                        if (-4 >= (entityIndexThenGroupCount_var1_int ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        ra.a(255 ^ fe.field_f, -88, fe.field_f);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (rb.field_b >= 5) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        ra.a(255 ^ vd.field_p, -83, vd.field_p);
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw t.a((Throwable) ((Object) var1_ref), "kc.C(" + param0 + ')');
                }
                case 120: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = 0;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
