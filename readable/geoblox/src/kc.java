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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
            if (param1 == -98) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  if (md.field_c > var2_int) {
                    qi.field_i[param0 + var2_int] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      }
                    }
                  }
                  sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c - -param0, false);
                }
                if (param0 < md.field_c) {
                  md.field_c = param0;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "kc.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 3. */
                            {
                                stackIn_12_0 = activeEntity.entityQueue;
                                stackIn_4_0 = stackIn_12_0;
                                if (var9 != 0) {
                                    statePc = 12;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 4. */
                                    {
                                        if (stackIn_4_0 == a.attachedEntities) {
                                            statePc = 8;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 5. */
                                            {
                                                if (activeEntity.detachedFromBoard) {
                                                    /* Inlined CFG state: 7. */
                                                    {
                                                        fa.entitiesDetachedThisTick = true;
                                                        if (var9 == 0) {
                                                            statePc = 9;
                                                        } else {
                                                            statePc = 8;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 6. */
                                                    {
                                                        statePc = 9;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                stackIn_12_0 = a.attachedEntities;
                                statePc = 12;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                stackOut_14_0 = pk.connectivityVisitedByEntityId[activeEntity.entityId];
                                stackIn_56_0 = stackOut_14_0 ? 1 : 0;
                                stackIn_15_0 = stackOut_14_0;
                                if (var9 != 0) {
                                    statePc = 56;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 15. */
                                    {
                                        if (!stackIn_15_0) {
                                            statePc = 18;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 16. */
                                            {
                                                if (var9 == 0) {
                                                    statePc = 54;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 17. */
                                                    {
                                                        statePc = 18;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 22. */
                            {
                                if (stackIn_22_0) {
                                    /* Inlined CFG state: 24. */
                                    {
                                        var4_int = 0;
                                        if (var9 == 0) {
                                            statePc = 43;
                                        } else {
                                            statePc = 25;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 23. */
                                    {
                                        statePc = 25;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                var7 = entityCandidate.relatedEntities[childEntityIndex];
                                stackIn_20_0 = (GameplayEntity) ((Object) var13.c((byte) 121));
                                stackIn_28_0 = stackIn_20_0;
                                if (var9 != 0) {
                                    statePc = 20;
                                } else {
                                    statePc = 28;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 30. */
                            {
                                stackIn_51_0 = (GameplayEntity) (relatedEntityCandidate);
                                stackIn_31_0 = stackIn_51_0;
                                stackIn_51_1 = (GameplayEntity) (var7);
                                stackIn_31_1 = stackIn_51_1;
                                if (var9 != 0) {
                                    statePc = 51;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 31. */
                                    {
                                        if (stackIn_31_0 != stackIn_31_1) {
                                            statePc = 34;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 32. */
                                            {
                                                if (var9 == 0) {
                                                    statePc = 41;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 33. */
                                                    {
                                                        statePc = 34;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                stackIn_51_0 = (GameplayEntity) (relatedEntityCandidate);
                                stackIn_38_0 = stackIn_51_0;
                                stackIn_51_1 = (GameplayEntity) (var7);
                                stackIn_38_1 = stackIn_51_1;
                                if (var9 != 0) {
                                    statePc = 51;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 38. */
                                    {
                                        if (stackIn_38_0 == stackIn_38_1) {
                                            statePc = 41;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 39. */
                                            {
                                                relatedEntityCandidate = (GameplayEntity) ((Object) var11.a(54));
                                                if (var9 == 0) {
                                                    statePc = 36;
                                                } else {
                                                    statePc = 40;
                                                }
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 45. */
                            {
                                groupEntity = (GameplayEntity) ((Object) var13.a(true));
                                statePc = 46;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (groupEntity == null) {
                            statePc = 54;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 47. */
                            {
                                groupEntity.entityQueue = ji.movingEntities;
                                groupEntity.touchesAvatar = false;
                                groupEntity.detachedFromBoard = true;
                                fa.entitiesDetachedThisTick = true;
                                stackIn_56_0 = 0;
                                stackIn_48_0 = stackIn_56_0;
                                if (var9 != 0) {
                                    statePc = 56;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 48. */
                                    {
                                        childEntityIndex = stackIn_48_0;
                                        statePc = 49;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (childEntityIndex >= groupEntity.relatedEntityCount) {
                            statePc = 53;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 50. */
                            {
                                stackIn_51_0 = groupEntity.relatedEntities[childEntityIndex];
                                stackIn_51_1 = (GameplayEntity) (groupEntity);
                                statePc = 51;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 52. */
                            {
                                if (var9 == 0) {
                                    statePc = 49;
                                } else {
                                    statePc = 53;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 58. */
                            {
                                pk.connectivityVisitedByEntityId[entityIndexThenGroupCount] = false;
                                entityIndexThenGroupCount++;
                                if (var9 != 0) {
                                    statePc = 62;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 59. */
                                    {
                                        if (var9 == 0) {
                                            statePc = 57;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 60. */
                                            {
                                                statePc = 61;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 64. */
                            {
                                if (null != candidateEntity.entityQueue) {
                                    statePc = 68;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 65. */
                                    {
                                        if (!w.field_f) {
                                            statePc = 97;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 66. */
                                            {
                                                if (candidateEntity.touchesAvatar) {
                                                    statePc = 68;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 67. */
                                                    {
                                                        statePc = 97;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 69. */
                            {
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
                            }
                        }
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (candidateEntity.relatedEntityCount <= relatedEntityIndex) {
                            statePc = 74;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 71. */
                            {
                                candidateEntity.relatedEntities[relatedEntityIndex].removeRelatedEntity(candidateEntity, 0);
                                relatedEntityIndex++;
                                if (var9 != 0) {
                                    statePc = 96;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 72. */
                                    {
                                        if (var9 == 0) {
                                            statePc = 70;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 73. */
                                            {
                                                statePc = 74;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 76. */
                            {
                                if (w.field_f) {
                                    statePc = 78;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 77. */
                                    {
                                        statePc = 95;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 80. */
                            {
                                candidateEntity.relatedEntities[var3_int].removeRelatedEntity(candidateEntity, 0);
                                candidateEntity.relatedEntities[var3_int].drawEntityIdOnBoardMask(2);
                                var3_int++;
                                if (var9 != 0) {
                                    statePc = 96;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 81. */
                                    {
                                        if (var9 == 0) {
                                            statePc = 79;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 82. */
                                            {
                                                statePc = 83;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 85. */
                            {
                                stackIn_88_0 = (int)candidateEntity.positionY;
                                stackIn_86_0 = stackIn_88_0;
                                stackIn_88_1 = (int)candidateEntity.positionX;
                                stackIn_86_1 = stackIn_88_1;
                                stackIn_88_2 = 117;
                                stackIn_86_2 = stackIn_88_2;
                                if ((candidateEntity.entitySpriteKindId ^ -1) == -5) {
                                    statePc = 88;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 86. */
                                    {
                                        stackIn_89_0 = stackIn_86_0;
                                        stackIn_87_0 = stackIn_89_0;
                                        stackIn_89_1 = stackIn_86_1;
                                        stackIn_87_1 = stackIn_89_1;
                                        stackIn_89_2 = stackIn_86_2;
                                        stackIn_87_2 = stackIn_89_2;
                                        if ((candidateEntity.entitySpriteKindId ^ -1) != -4) {
                                            /* Inlined CFG state: 89. */
                                            {
                                                stackIn_90_0 = stackIn_89_0;
                                                stackIn_90_1 = stackIn_89_1;
                                                stackIn_90_2 = stackIn_89_2;
                                                stackIn_90_3 = 10;
                                                statePc = 90;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 87. */
                                            {
                                                stackIn_88_0 = stackIn_87_0;
                                                stackIn_88_1 = stackIn_87_1;
                                                stackIn_88_2 = stackIn_87_2;
                                                statePc = 88;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 92. */
                            {
                                candidateEntity.configureEntitySprite(320, candidateEntity.entityCategoryKey, candidateEntity.spriteVariantIndex, 5);
                                if (var9 == 0) {
                                    statePc = 95;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 93. */
                                    {
                                        statePc = 94;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 100. */
                            {
                                if (var9 != 0) {
                                    statePc = 106;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 101. */
                                    {
                                        if (ra.availableEntities != queuedEntity.entityQueue) {
                                            statePc = 103;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 102. */
                                            {
                                                queuedEntity.unlinkNode(false);
                                                queuedEntity.unlinkSecondaryNode((byte) 51);
                                                ra.availableEntities.addLast(-44, queuedEntity);
                                                queuedEntity.entityQueue = null;
                                                statePc = 103;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 105. */
                            {
                                jc.a(3, false);
                                jl.field_t = false;
                                statePc = 106;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 107. */
                            {
                                stackIn_110_0 = (GameplaySession) ((Object) stackIn_107_0);
                                stackIn_108_0 = stackIn_110_0;
                                if (ab.boardContactStateDirty) {
                                    statePc = 110;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 108. */
                                    {
                                        stackIn_111_0 = (GameplaySession) ((Object) stackIn_108_0);
                                        stackIn_109_0 = stackIn_111_0;
                                        if (!w.field_f) {
                                            /* Inlined CFG state: 111. */
                                            {
                                                stackIn_112_0 = (GameplaySession) ((Object) stackIn_111_0);
                                                stackIn_112_1 = 0;
                                                statePc = 112;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 109. */
                                            {
                                                stackIn_110_0 = (GameplaySession) ((Object) stackIn_109_0);
                                                statePc = 110;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
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
                case 112: {
                    try {
                        stackIn_112_0.boardRasterDirty = stackIn_112_1 != 0;
                        w.field_f = false;
                        if (-4 >= (entityIndexThenGroupCount ^ -1)) {
                            /* Inlined CFG state: 114. */
                            {
                                ra.a(255 ^ fe.field_f, -88, fe.field_f);
                                statePc = 115;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 113. */
                            {
                                statePc = 115;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (rb.field_b >= 5) {
                            /* Inlined CFG state: 117. */
                            {
                                ra.a(255 ^ vd.field_p, -83, vd.field_p);
                                statePc = 120;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 116. */
                            {
                                statePc = 120;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
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
