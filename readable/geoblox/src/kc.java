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

    final static void reconcileBoardEntities(int param0) {
        IntrusiveDeque stackIn_4_0 = null;
        IntrusiveDeque stackIn_12_0 = null;
        boolean stackIn_15_0 = false;
        GameplayEntity stackIn_20_0 = null;
        boolean stackIn_22_0 = false;
        GameplayEntity stackIn_28_0 = null;
        GameplayEntity stackIn_31_0 = null;
        GameplayEntity stackIn_31_1 = null;
        GameplayEntity stackIn_38_0 = null;
        GameplayEntity stackIn_38_1 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        GameplayEntity stackIn_51_0 = null;
        GameplayEntity stackIn_51_1 = null;
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
        GameplaySession stackIn_107_0 = null;
        GameplaySession stackIn_108_0 = null;
        GameplaySession stackIn_109_0 = null;
        GameplaySession stackIn_110_0 = null;
        GameplaySession stackIn_111_0 = null;
        GameplaySession stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        boolean stackOut_14_0;
        boolean stackOut_21_0;
        int statePc = 0;
        Throwable caughtException = null;
        GameplayEntity activeEntity = null;
        int entityIndexThenGroupCount = 0;
        RuntimeException var1_ref = null;
        GameplayEntity candidateEntity = null;
        int var2 = 0;
        float radialOffsetX = 0.0f;
        int var3_int = 0;
        GameplayEntity queuedEntity = null;
        int var4_int = 0;
        float radialOffsetY = 0.0f;
        GameplayEntity var4 = null;
        GameplayEntity groupEntity = null;
        double radialVelocityScale = 0.0;
        int childEntityIndex = 0;
        GameplayEntity var6 = null;
        GameplayEntity var7 = null;
        int relatedEntityIndex = 0;
        GameplayEntity relatedEntityCandidate = null;
        int var9 = 0;
        GameplayEntity entityCandidate = null;
        wd var11 = null;
        GameplayEntity parentEntity = null;
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
                        fa.entitiesDetachedThisTick = false;
                        activeEntity = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
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
                        if (activeEntity == null) {
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
                        stackIn_12_0 = activeEntity.entityQueue;
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
                        if (stackIn_4_0 == a.attachedEntities) {
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
                        if (activeEntity.detachedFromBoard) {
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
                        fa.entitiesDetachedThisTick = true;
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
                        activeEntity.eraseEntityTrail(30383);
                        activeEntity.drawEntityIdOnBoardMask(2);
                        activeEntity.unlinkNode(false);
                        activeEntity.unlinkSecondaryNode((byte) 54);
                        a.attachedEntities.addLast(-80, activeEntity);
                        el.gameplaySession.boardRasterDirty = true;
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
                        activeEntity.entityQueue = null;
                        activeEntity = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
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
                        if (!re.connectivityDirty) {
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
                        stackIn_12_0 = a.attachedEntities;
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
                        activeEntity = (GameplayEntity) ((Object) ((IntrusiveDeque) (Object) stackIn_12_0).firstForIteration(0));
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
                        if (activeEntity == null) {
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
                        stackOut_14_0 = pk.connectivityVisitedByEntityId[activeEntity.entityId];
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
                        var11.a(activeEntity, false);
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
                        stackIn_20_0 = (GameplayEntity) ((Object) var11.a(true));
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
                        entityCandidate = stackIn_20_0;
                        parentEntity = entityCandidate;
                        groupEntity = parentEntity;
                        if (parentEntity == null) {
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
                        pk.connectivityVisitedByEntityId[entityCandidate.entityId] = true;
                        stackOut_21_0 = parentEntity.touchesAvatar;
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
                        var13.a(parentEntity, false);
                        childEntityIndex = 0;
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
                        if (childEntityIndex >= parentEntity.relatedEntityCount) {
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
                        var7 = entityCandidate.relatedEntities[childEntityIndex];
                        stackIn_20_0 = (GameplayEntity) ((Object) var13.c((byte) 121));
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
                        relatedEntityCandidate = stackIn_28_0;
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
                        if (relatedEntityCandidate == null) {
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
                        stackIn_51_0 = (GameplayEntity) (relatedEntityCandidate);
                        stackIn_31_0 = stackIn_51_0;
                        stackIn_51_1 = (GameplayEntity) (var7);
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
                        relatedEntityCandidate = (GameplayEntity) ((Object) var13.a(-45));
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
                        relatedEntityCandidate = (GameplayEntity) ((Object) var11.c((byte) 121));
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
                        if (relatedEntityCandidate == null) {
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
                        stackIn_51_0 = (GameplayEntity) (relatedEntityCandidate);
                        stackIn_38_0 = stackIn_51_0;
                        stackIn_51_1 = (GameplayEntity) (var7);
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
                        relatedEntityCandidate = (GameplayEntity) ((Object) var11.a(54));
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
                        childEntityIndex++;
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
                        groupEntity = (GameplayEntity) ((Object) var13.a(true));
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
                        if (groupEntity == null) {
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
                        groupEntity.entityQueue = ji.movingEntities;
                        groupEntity.touchesAvatar = false;
                        groupEntity.detachedFromBoard = true;
                        fa.entitiesDetachedThisTick = true;
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
                        childEntityIndex = stackIn_48_0;
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
                        if (childEntityIndex >= groupEntity.relatedEntityCount) {
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
                        stackIn_51_0 = groupEntity.relatedEntities[childEntityIndex];
                        stackIn_51_1 = (GameplayEntity) (groupEntity);
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
                        ((GameplayEntity) (Object) stackIn_51_0).removeRelatedEntity(stackIn_51_1, 0);
                        childEntityIndex++;
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
                        var6 = groupEntity;
                        var7 = groupEntity;
                        groupEntity.relatedEntityCount = 0;
                        var6.sameCategoryEntityCount = 0;
                        var7.sameVariantEntityCount = 0;
                        groupEntity = (GameplayEntity) ((Object) var13.a(true));
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
                        activeEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
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
                        re.connectivityDirty = false;
                        el.gameplaySession.connectivityRebuiltThisTick = true;
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
                        entityIndexThenGroupCount = stackIn_56_0;
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
                        if (1000 <= entityIndexThenGroupCount) {
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
                        pk.connectivityVisitedByEntityId[entityIndexThenGroupCount] = false;
                        entityIndexThenGroupCount++;
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
                        entityIndexThenGroupCount = 0;
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
                        candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
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
                        if (candidateEntity == null) {
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
                        if (null != candidateEntity.entityQueue) {
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
                        if (candidateEntity.touchesAvatar) {
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
                        re.connectivityDirty = true;
                        candidateEntity.unlinkNode(false);
                        candidateEntity.unlinkSecondaryNode((byte) 100);
                        el.gameplaySession.boardRasterDirty = true;
                        candidateEntity.eraseEntityPixels(92);
                        if (ji.movingEntities != candidateEntity.entityQueue) {
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
                        candidateEntity.rotateEntityAroundBoard(-el.gameplaySession.boardAngleRadians, -117);
                        radialOffsetX = -candidateEntity.positionX + 320.0f;
                        radialOffsetY = -candidateEntity.positionY + 240.0f;
                        radialVelocityScale = (double)og.entityMotionSpeed / Math.sqrt((double)(radialOffsetY * radialOffsetY + radialOffsetX * radialOffsetX));
                        radialOffsetX = (float)((double)radialOffsetX * radialVelocityScale);
                        radialOffsetY = (float)((double)radialOffsetY * radialVelocityScale);
                        candidateEntity.velocityY = radialOffsetY;
                        candidateEntity.velocityX = radialOffsetX;
                        relatedEntityIndex = 0;
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
                        if (candidateEntity.relatedEntityCount <= relatedEntityIndex) {
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
                        candidateEntity.relatedEntities[relatedEntityIndex].removeRelatedEntity(candidateEntity, 0);
                        relatedEntityIndex++;
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
                        var7 = candidateEntity;
                        relatedEntityCandidate = candidateEntity;
                        candidateEntity.relatedEntityCount = 0;
                        var7.sameCategoryEntityCount = 0;
                        relatedEntityCandidate.sameVariantEntityCount = 0;
                        ji.movingEntities.addLast(-36, candidateEntity);
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
                        if (candidateEntity.entityQueue == bh.field_c) {
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
                        if (var3_int >= candidateEntity.relatedEntityCount) {
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
                        candidateEntity.relatedEntities[var3_int].removeRelatedEntity(candidateEntity, 0);
                        candidateEntity.relatedEntities[var3_int].drawEntityIdOnBoardMask(2);
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
                        queuedEntity = candidateEntity;
                        candidateEntity.relatedEntityCount = 0;
                        var4 = candidateEntity;
                        queuedEntity.sameCategoryEntityCount = 0;
                        var4.sameVariantEntityCount = 0;
                        candidateEntity.remainingLifetimeTicks = 50;
                        bh.field_c.addLast(-100, candidateEntity);
                        candidateEntity.animationFrameIndex = 0;
                        if (!candidateEntity.touchesAvatar) {
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
                        stackIn_88_0 = (int)candidateEntity.positionY;
                        stackIn_86_0 = stackIn_88_0;
                        stackIn_88_1 = (int)candidateEntity.positionX;
                        stackIn_86_1 = stackIn_88_1;
                        stackIn_88_2 = 117;
                        stackIn_86_2 = stackIn_88_2;
                        if ((candidateEntity.entitySpriteKindId ^ -1) == -5) {
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
                        if ((candidateEntity.entitySpriteKindId ^ -1) != -4) {
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
                        if (4 == candidateEntity.entitySpriteKindId) {
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
                        candidateEntity.configureEntitySprite(320, candidateEntity.entityCategoryKey, candidateEntity.spriteVariantIndex, 5);
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
                        candidateEntity.configureEntitySprite(320, candidateEntity.entityCategoryKey, candidateEntity.spriteVariantIndex, 7);
                        entityIndexThenGroupCount++;
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
                        candidateEntity.entityQueue = null;
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
                        el.gameplaySession.boardRasterDirty = true;
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
                        candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
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
                        queuedEntity = (GameplayEntity) ((Object) bh.field_c.firstForIteration(0));
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
                        if (queuedEntity == null) {
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
                        if (ra.availableEntities != queuedEntity.entityQueue) {
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
                        queuedEntity.unlinkNode(false);
                        queuedEntity.unlinkSecondaryNode((byte) 51);
                        ra.availableEntities.addLast(-44, queuedEntity);
                        queuedEntity.entityQueue = null;
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
                        queuedEntity = (GameplayEntity) ((Object) bh.field_c.nextForIteration(1));
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
                        stackIn_110_0 = el.gameplaySession;
                        stackIn_107_0 = stackIn_110_0;
                        if (el.gameplaySession.boardRasterDirty) {
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
                        stackIn_110_0 = (GameplaySession) ((Object) stackIn_107_0);
                        stackIn_108_0 = stackIn_110_0;
                        if (ab.boardContactStateDirty) {
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
                        stackIn_111_0 = (GameplaySession) ((Object) stackIn_108_0);
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
                        stackIn_110_0 = (GameplaySession) ((Object) stackIn_109_0);
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
                        stackIn_112_0 = (GameplaySession) ((Object) stackIn_110_0);
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
                        stackIn_112_0 = (GameplaySession) ((Object) stackIn_111_0);
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
                        stackIn_112_0.boardRasterDirty = stackIn_112_1 != 0;
                        w.field_f = false;
                        if (-4 >= (entityIndexThenGroupCount ^ -1)) {
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
