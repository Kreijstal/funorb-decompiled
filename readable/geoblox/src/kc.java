/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String createNameCharacterAlertText;
    static int field_c;

    public static void a(int param0) {
        int var1 = 7 % ((79 - param0) / 43);
        createNameCharacterAlertText = null;
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
        IntrusiveDeque stackIn_12_0 = null;
        boolean stackIn_15_0 = false;
        GameplayEntity stackIn_20_0 = null;
        boolean stackIn_22_0 = false;
        int stackIn_44_0 = 0;
        GameplayEntity stackIn_51_0 = null;
        GameplayEntity stackIn_51_1 = null;
        int stackIn_56_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_90_0;
        int stackIn_90_1;
        int stackIn_90_2;
        int stackIn_90_3;
        GameplaySession stackIn_110_0 = null;
        GameplaySession stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_14_0;
        boolean stackOut_21_0;
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
        var9 = Geoblox.field_C;
        try {
          L0: {
            fa.entitiesDetachedThisTick = false;
            activeEntity = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (activeEntity != null) {
                      stackIn_12_0 = activeEntity.entityQueue;

                      if (var9 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_12_0 != a.attachedEntities) {
                            if (activeEntity.detachedFromBoard) {
                              fa.entitiesDetachedThisTick = true;
                              if (var9 == 0) {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          activeEntity.eraseEntityTrail(30383);
                          activeEntity.drawEntityIdOnBoardMask(2);
                          activeEntity.unlinkNode(false);
                          activeEntity.unlinkSecondaryNode((byte) 54);
                          a.attachedEntities.addLast(-80, activeEntity);
                          el.gameplaySession.boardRasterDirty = true;
                        }
                        activeEntity.entityQueue = null;
                        activeEntity = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
                        if (var9 == 0) {
                          continue L1;
                        }
                      }
                    }
                    if (!re.connectivityDirty) {
                      break L3;
                    } else {
                      stackIn_12_0 = a.attachedEntities;
                    }
                  }
                  activeEntity = (GameplayEntity) ((Object) ((IntrusiveDeque) (Object) stackIn_12_0).firstForIteration(0));
                  L8: while (true) {
                    L9: {
                      if (activeEntity != null) {
                        stackOut_14_0 = pk.connectivityVisitedByEntityId[activeEntity.entityId];
                        stackIn_56_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L9;
                        } else {
                          L11: {
                            if (stackIn_15_0) {
                              if (var9 == 0) {
                                break L11;
                              }
                            }
                            var11 = new wd();
                            var13 = new wd();
                            var11.a(activeEntity, false);
                            var4_int = 1;
                            L13: while (true) {
                              stackIn_20_0 = (GameplayEntity) ((Object) var11.a(true));
                              L14: while (true) {
                                L15: {
                                  L16: {
                                    entityCandidate = stackIn_20_0;
                                    parentEntity = entityCandidate;
                                    groupEntity = parentEntity;
                                    if (parentEntity != null) {
                                      pk.connectivityVisitedByEntityId[entityCandidate.entityId] = true;
                                      stackOut_21_0 = parentEntity.touchesAvatar;
                                      stackIn_44_0 = stackOut_21_0 ? 1 : 0;
                                      stackIn_22_0 = stackOut_21_0;
                                      if (var9 != 0) {
                                        break L15;
                                      } else {
                                        if (stackIn_22_0) {
                                          var4_int = 0;
                                          if (var9 == 0) {
                                            break L16;
                                          }
                                        }
                                        var13.a(parentEntity, false);
                                        childEntityIndex = 0;
                                        L18: while (true) {
                                          L19: {
                                            if (childEntityIndex < parentEntity.relatedEntityCount) {
                                              var7 = entityCandidate.relatedEntities[childEntityIndex];
                                              stackIn_20_0 = (GameplayEntity) ((Object) var13.c((byte) 121));

                                              if (var9 != 0) {
                                                continue L14;
                                              } else {
                                                relatedEntityCandidate = stackIn_20_0;
                                                L20: while (true) {
                                                  L21: {
                                                    L22: {
                                                      if (relatedEntityCandidate != null) {
                                                        stackIn_51_0 = (GameplayEntity) (relatedEntityCandidate);

                                                        stackIn_51_1 = (GameplayEntity) (var7);

                                                        if (var9 != 0) {
                                                          break L22;
                                                        } else {
                                                          if (stackIn_51_0 == stackIn_51_1) {
                                                            if (var9 == 0) {
                                                              break L21;
                                                            }
                                                          }
                                                          relatedEntityCandidate = (GameplayEntity) ((Object) var13.a(-45));
                                                          if (var9 == 0) {
                                                            continue L20;
                                                          }
                                                        }
                                                      }
                                                      relatedEntityCandidate = (GameplayEntity) ((Object) var11.c((byte) 121));
                                                      L25: while (relatedEntityCandidate != null) {
                                                        stackIn_51_0 = (GameplayEntity) (relatedEntityCandidate);

                                                        stackIn_51_1 = (GameplayEntity) (var7);

                                                        if (var9 != 0) {
                                                          break L22;
                                                        } else {
                                                          if (stackIn_51_0 == stackIn_51_1) {
                                                            break L21;
                                                          } else {
                                                            relatedEntityCandidate = (GameplayEntity) ((Object) var11.a(54));
                                                            if (var9 == 0) {
                                                              continue L25;
                                                            }
                                                          }
                                                        }
                                                        break;
                                                      }
                                                      var11.a(var7, false);
                                                      break L21;
                                                    }
                                                    L27: while (true) {
                                                      L28: {
                                                        ((GameplayEntity) (Object) stackIn_51_0).removeRelatedEntity(stackIn_51_1, 0);
                                                        childEntityIndex++;
                                                        if (var9 != 0) {
                                                          L29: while (true) {
                                                            if (groupEntity == null) {
                                                              break L11;
                                                            } else {
                                                              groupEntity.entityQueue = ji.movingEntities;
                                                              groupEntity.touchesAvatar = false;
                                                              groupEntity.detachedFromBoard = true;
                                                              fa.entitiesDetachedThisTick = true;
                                                              stackIn_56_0 = 0;

                                                              if (var9 != 0) {
                                                                break L9;
                                                              } else {
                                                                childEntityIndex = stackIn_56_0;
                                                                if (childEntityIndex >= groupEntity.relatedEntityCount) {
                                                                  var6 = groupEntity;
                                                                  var7 = groupEntity;
                                                                  groupEntity.relatedEntityCount = 0;
                                                                  var6.sameCategoryEntityCount = 0;
                                                                  var7.sameVariantEntityCount = 0;
                                                                  groupEntity = (GameplayEntity) ((Object) var13.a(true));
                                                                  if (var9 == 0) {
                                                                    continue L29;
                                                                  } else {
                                                                    break L11;
                                                                  }
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (var9 == 0) {
                                                            L30: while (true) {
                                                              if (childEntityIndex >= groupEntity.relatedEntityCount) {
                                                                var6 = groupEntity;
                                                                var7 = groupEntity;
                                                                groupEntity.relatedEntityCount = 0;
                                                                var6.sameCategoryEntityCount = 0;
                                                                var7.sameVariantEntityCount = 0;
                                                                groupEntity = (GameplayEntity) ((Object) var13.a(true));
                                                                if (var9 == 0) {
                                                                  if (groupEntity == null) {
                                                                    break L11;
                                                                  } else {
                                                                    groupEntity.entityQueue = ji.movingEntities;
                                                                    groupEntity.touchesAvatar = false;
                                                                    groupEntity.detachedFromBoard = true;
                                                                    fa.entitiesDetachedThisTick = true;
                                                                    stackIn_56_0 = 0;

                                                                    if (var9 != 0) {
                                                                      break L9;
                                                                    } else {
                                                                      childEntityIndex = stackIn_56_0;
                                                                      continue L30;
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L11;
                                                                }
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          } else {
                                                            L31: while (true) {
                                                              var6 = groupEntity;
                                                              var7 = groupEntity;
                                                              groupEntity.relatedEntityCount = 0;
                                                              var6.sameCategoryEntityCount = 0;
                                                              var7.sameVariantEntityCount = 0;
                                                              groupEntity = (GameplayEntity) ((Object) var13.a(true));
                                                              if (var9 == 0) {
                                                                if (groupEntity == null) {
                                                                  break L11;
                                                                } else {
                                                                  groupEntity.entityQueue = ji.movingEntities;
                                                                  groupEntity.touchesAvatar = false;
                                                                  groupEntity.detachedFromBoard = true;
                                                                  fa.entitiesDetachedThisTick = true;
                                                                  stackIn_56_0 = 0;

                                                                  if (var9 != 0) {
                                                                    break L9;
                                                                  } else {
                                                                    childEntityIndex = stackIn_56_0;
                                                                    if (childEntityIndex >= groupEntity.relatedEntityCount) {
                                                                      continue L31;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                break L11;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      stackIn_51_0 = groupEntity.relatedEntities[childEntityIndex];
                                                      stackIn_51_1 = (GameplayEntity) (groupEntity);
                                                      continue L27;
                                                    }
                                                  }
                                                  childEntityIndex++;
                                                  if (var9 == 0) {
                                                    continue L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var9 == 0) {
                                            continue L13;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackIn_44_0 = var4_int;
                                }
                                if (stackIn_44_0 == 0) {
                                  break L11;
                                } else {
                                  groupEntity = (GameplayEntity) ((Object) var13.a(true));
                                  L32: while (true) {
                                    if (groupEntity == null) {
                                      break L11;
                                    } else {
                                      groupEntity.entityQueue = ji.movingEntities;
                                      groupEntity.touchesAvatar = false;
                                      groupEntity.detachedFromBoard = true;
                                      fa.entitiesDetachedThisTick = true;
                                      stackIn_56_0 = 0;

                                      if (var9 != 0) {
                                        break L9;
                                      } else {
                                        childEntityIndex = stackIn_56_0;
                                        L33: while (childEntityIndex < groupEntity.relatedEntityCount) {
                                          stackIn_51_0 = groupEntity.relatedEntities[childEntityIndex];
                                          stackIn_51_1 = (GameplayEntity) (groupEntity);
                                          ((GameplayEntity) (Object) stackIn_51_0).removeRelatedEntity(stackIn_51_1, 0);
                                          childEntityIndex++;
                                          if (var9 != 0) {
                                            continue L32;
                                          } else {
                                            if (var9 == 0) {
                                              continue L33;
                                            }
                                          }
                                          break;
                                        }
                                        var6 = groupEntity;
                                        var7 = groupEntity;
                                        groupEntity.relatedEntityCount = 0;
                                        var6.sameCategoryEntityCount = 0;
                                        var7.sameVariantEntityCount = 0;
                                        groupEntity = (GameplayEntity) ((Object) var13.a(true));
                                        if (var9 == 0) {
                                          continue L32;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          activeEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
                          if (var9 == 0) {
                            continue L8;
                          }
                        }
                      }
                      re.connectivityDirty = false;
                      el.gameplaySession.connectivityRebuiltThisTick = true;
                      stackIn_56_0 = 0;
                    }
                    entityIndexThenGroupCount = stackIn_56_0;
                    L35: while (true) {
                      if (1000 <= entityIndexThenGroupCount) {
                        break L3;
                      } else {
                        pk.connectivityVisitedByEntityId[entityIndexThenGroupCount] = false;
                        entityIndexThenGroupCount++;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (var9 == 0) {
                            continue L35;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                entityIndexThenGroupCount = 0;
              }
              candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
              L36: while (candidateEntity != null) {
                L38: {
                  if (null == candidateEntity.entityQueue) {
                    if (!w.field_f) {
                      break L38;
                    } else {
                      if (!candidateEntity.touchesAvatar) {
                        break L38;
                      }
                    }
                  }
                  L40: {
                    L41: {
                      L42: {
                        re.connectivityDirty = true;
                        candidateEntity.unlinkNode(false);
                        candidateEntity.unlinkSecondaryNode((byte) 100);
                        el.gameplaySession.boardRasterDirty = true;
                        candidateEntity.eraseEntityPixels(92);
                        if (ji.movingEntities == candidateEntity.entityQueue) {
                          candidateEntity.rotateEntityAroundBoard(-el.gameplaySession.boardAngleRadians, -117);
                          radialOffsetX = -candidateEntity.positionX + 320.0f;
                          radialOffsetY = -candidateEntity.positionY + 240.0f;
                          radialVelocityScale = (double)og.entityMotionSpeed / Math.sqrt((double)(radialOffsetY * radialOffsetY + radialOffsetX * radialOffsetX));
                          radialOffsetX = (float)((double)radialOffsetX * radialVelocityScale);
                          radialOffsetY = (float)((double)radialOffsetY * radialVelocityScale);
                          candidateEntity.velocityY = radialOffsetY;
                          candidateEntity.velocityX = radialOffsetX;
                          relatedEntityIndex = 0;
                          L43: while (candidateEntity.relatedEntityCount > relatedEntityIndex) {
                            candidateEntity.relatedEntities[relatedEntityIndex].removeRelatedEntity(candidateEntity, 0);
                            relatedEntityIndex++;
                            if (var9 != 0) {
                              break L40;
                            } else {
                              if (var9 == 0) {
                                continue L43;
                              }
                            }
                            break;
                          }
                          var7 = candidateEntity;
                          relatedEntityCandidate = candidateEntity;
                          candidateEntity.relatedEntityCount = 0;
                          var7.sameCategoryEntityCount = 0;
                          relatedEntityCandidate.sameVariantEntityCount = 0;
                          ji.movingEntities.addLast(-36, candidateEntity);
                          if (var9 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      if (candidateEntity.entityQueue != bh.field_c) {
                        if (!w.field_f) {
                          break L41;
                        }
                      }
                      var3_int = 0;
                      L46: while (var3_int < candidateEntity.relatedEntityCount) {
                        candidateEntity.relatedEntities[var3_int].removeRelatedEntity(candidateEntity, 0);
                        candidateEntity.relatedEntities[var3_int].drawEntityIdOnBoardMask(2);
                        var3_int++;
                        if (var9 != 0) {
                          break L40;
                        } else {
                          if (var9 == 0) {
                            continue L46;
                          }
                        }
                        break;
                      }
                      queuedEntity = candidateEntity;
                      candidateEntity.relatedEntityCount = 0;
                      var4 = candidateEntity;
                      queuedEntity.sameCategoryEntityCount = 0;
                      var4.sameVariantEntityCount = 0;
                      candidateEntity.remainingLifetimeTicks = 50;
                      bh.field_c.addLast(-100, candidateEntity);
                      candidateEntity.animationFrameIndex = 0;
                      if (candidateEntity.touchesAvatar) {
                        if (w.field_f) {
                          L49: {
                            stackIn_88_0 = (int)candidateEntity.positionY;

                            stackIn_88_1 = (int)candidateEntity.positionX;

                            stackIn_88_2 = 117;

                            if (candidateEntity.entitySpriteKindId != 4) {






                              if (candidateEntity.entitySpriteKindId != 3) {
                                stackIn_90_0 = stackIn_88_0;
                                stackIn_90_1 = stackIn_88_1;
                                stackIn_90_2 = stackIn_88_2;
                                stackIn_90_3 = 10;
                                break L49;
                              } else {



                              }
                            }
                            stackIn_90_0 = stackIn_88_0;
                            stackIn_90_1 = stackIn_88_1;
                            stackIn_90_2 = stackIn_88_2;
                            stackIn_90_3 = 100;
                          }
                          ld.spawnPointsPopup(stackIn_90_0, stackIn_90_1, stackIn_90_2, stackIn_90_3);
                        }
                      }
                      if (4 != candidateEntity.entitySpriteKindId) {
                        candidateEntity.configureEntitySprite(320, candidateEntity.entityCategoryKey, candidateEntity.spriteVariantIndex, 5);
                        if (var9 == 0) {
                          break L41;
                        }
                      }
                      candidateEntity.configureEntitySprite(320, candidateEntity.entityCategoryKey, candidateEntity.spriteVariantIndex, 7);
                      entityIndexThenGroupCount++;
                      rb.field_b = rb.field_b + 1;
                      break L41;
                    }
                    candidateEntity.entityQueue = null;
                  }
                  el.gameplaySession.boardRasterDirty = true;
                }
                candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
                if (var9 == 0) {
                  continue L36;
                }
                break;
              }
              var2 = -23 / ((param0 - 69) / 46);
              queuedEntity = (GameplayEntity) ((Object) bh.field_c.firstForIteration(0));
              L52: while (true) {
                L53: {
                  if (queuedEntity != null) {
                    if (var9 != 0) {
                      break L53;
                    } else {
                      if (ra.availableEntities == queuedEntity.entityQueue) {
                        queuedEntity.unlinkNode(false);
                        queuedEntity.unlinkSecondaryNode((byte) 51);
                        ra.availableEntities.addLast(-44, queuedEntity);
                        queuedEntity.entityQueue = null;
                      }
                      queuedEntity = (GameplayEntity) ((Object) bh.field_c.nextForIteration(1));
                      if (var9 == 0) {
                        continue L52;
                      }
                    }
                  }
                  if (w.field_f) {
                    jc.a(3, false);
                    jl.field_t = false;
                  }
                }
                L56: {
                  stackIn_110_0 = el.gameplaySession;

                  if (!el.gameplaySession.boardRasterDirty) {
                    stackIn_110_0 = (GameplaySession) ((Object) stackIn_110_0);

                    if (!ab.boardContactStateDirty) {


                      if (!w.field_f) {
                        stackIn_112_0 = (GameplaySession) ((Object) stackIn_110_0);
                        stackIn_112_1 = 0;
                        break L56;
                      } else {
                        stackIn_110_0 = (GameplaySession) ((Object) stackIn_110_0);
                      }
                    }
                  }
                  stackIn_112_0 = (GameplaySession) ((Object) stackIn_110_0);
                  stackIn_112_1 = 1;
                }
                stackIn_112_0.boardRasterDirty = stackIn_112_1 != 0;
                w.field_f = false;
                if (entityIndexThenGroupCount >= 3) {
                  ra.a(255 ^ fe.field_f, -88, fe.field_f);
                }
                if (rb.field_b >= 5) {
                  ra.a(255 ^ vd.field_p, -83, vd.field_p);
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "kc.C(" + param0 + ')');
        }
    }

    static {
        field_c = 0;
        createNameCharacterAlertText = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
