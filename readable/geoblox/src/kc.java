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
                  sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c + param0, false);
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

    final static void reconcileBoardEntities(int methodGuard) {
        IntrusiveDeque entityQueueThenAttachedQueue = null;
        boolean alreadyVisited = false;
        GameplayEntity poppedEntityOrSearchStart = null;
        boolean poppedEntityTouchesAvatar = false;
        int avatarContactThenDetachDecision = 0;
        GameplayEntity comparedThenUnlinkTarget = null;
        GameplayEntity neighborThenUnlinkArgument = null;
        int visitedFlagThenResetIndex = 0;
        int popupOriginYInput = 0;
        int popupOriginXInput = 0;
        int popupGuardInput = 0;
        int popupOriginY;
        int popupOriginX;
        int popupMethodGuard;
        int popupPoints;
        GameplaySession sessionForRasterRead = null;
        GameplaySession sessionForRasterWrite = null;
        int rasterDirtyDecision = 0;
        RuntimeException decompiledCaughtException = null;
        boolean visitedByEntityIdValue;
        boolean directAvatarContactValue;
        GameplayEntity activeEntity = null;
        int visitedResetIndexThenKindFourCount = 0;
        RuntimeException var1_ref = null;
        GameplayEntity routedAttachedEntity = null;
        int methodGuardResidue = 0;
        float radialOffsetX = 0.0f;
        int transientNeighborIndex = 0;
        GameplayEntity categoryResetThenTransientEntity = null;
        int componentCanDetach = 0;
        float radialOffsetY = 0.0f;
        GameplayEntity entityForTransientVariantReset = null;
        GameplayEntity connectivityAliasThenDetachingEntity = null;
        double radialVelocityScale = 0.0;
        int componentNeighborIndex = 0;
        GameplayEntity entityForComponentCategoryReset = null;
        GameplayEntity neighborThenCountResetEntity = null;
        int relatedEntityIndex = 0;
        GameplayEntity componentSearchThenVariantResetEntity = null;
        int clientControlSnapshot = 0;
        GameplayEntity currentConnectivityEntity = null;
        SecondaryDeque pendingConnectivityEntities = null;
        GameplayEntity currentConnectivityEntityAlias = null;
        SecondaryDeque visitedNonAvatarEntities = null;
        clientControlSnapshot = Geoblox.field_C;
        try {
          L0: {
            fa.entitiesDetachedThisTick = false;
            activeEntity = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (activeEntity != null) {
                      entityQueueThenAttachedQueue = activeEntity.entityQueue;

                      if (clientControlSnapshot != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (entityQueueThenAttachedQueue != a.attachedEntities) {
                            if (activeEntity.detachedFromBoard) {
                              fa.entitiesDetachedThisTick = true;
                              if (clientControlSnapshot == 0) {
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
                        if (clientControlSnapshot == 0) {
                          continue L1;
                        }
                      }
                    }
                    if (!re.connectivityDirty) {
                      break L3;
                    } else {
                      entityQueueThenAttachedQueue = a.attachedEntities;
                    }
                  }
                  activeEntity = (GameplayEntity) ((Object) ((IntrusiveDeque) (Object) entityQueueThenAttachedQueue).firstForIteration(0));
                  L8: while (true) {
                    L9: {
                      if (activeEntity != null) {
                        visitedByEntityIdValue = pk.connectivityVisitedByEntityId[activeEntity.entityId];
                        visitedFlagThenResetIndex = visitedByEntityIdValue ? 1 : 0;
                        alreadyVisited = visitedByEntityIdValue;
                        if (clientControlSnapshot != 0) {
                          break L9;
                        } else {
                          L11: {
                            if (alreadyVisited) {
                              if (clientControlSnapshot == 0) {
                                break L11;
                              }
                            }
                            pendingConnectivityEntities = new SecondaryDeque();
                            visitedNonAvatarEntities = new SecondaryDeque();
                            pendingConnectivityEntities.addFirst(activeEntity, false);
                            componentCanDetach = 1;
                            L13: while (true) {
                              poppedEntityOrSearchStart = (GameplayEntity) ((Object) pendingConnectivityEntities.removeFirst(true));
                              L14: while (true) {
                                L15: {
                                  L16: {
                                    currentConnectivityEntity = poppedEntityOrSearchStart;
                                    currentConnectivityEntityAlias = currentConnectivityEntity;
                                    connectivityAliasThenDetachingEntity = currentConnectivityEntityAlias;
                                    if (currentConnectivityEntityAlias != null) {
                                      pk.connectivityVisitedByEntityId[currentConnectivityEntity.entityId] = true;
                                      directAvatarContactValue = currentConnectivityEntityAlias.touchesAvatar;
                                      avatarContactThenDetachDecision = directAvatarContactValue ? 1 : 0;
                                      poppedEntityTouchesAvatar = directAvatarContactValue;
                                      if (clientControlSnapshot != 0) {
                                        break L15;
                                      } else {
                                        if (poppedEntityTouchesAvatar) {
                                          componentCanDetach = 0;
                                          if (clientControlSnapshot == 0) {
                                            break L16;
                                          }
                                        }
                                        visitedNonAvatarEntities.addFirst(currentConnectivityEntityAlias, false);
                                        componentNeighborIndex = 0;
                                        L18: while (true) {
                                          L19: {
                                            if (componentNeighborIndex < currentConnectivityEntityAlias.relatedEntityCount) {
                                              neighborThenCountResetEntity = currentConnectivityEntity.relatedEntities[componentNeighborIndex];
                                              poppedEntityOrSearchStart = (GameplayEntity) ((Object) visitedNonAvatarEntities.firstForIteration((byte) 121));

                                              if (clientControlSnapshot != 0) {
                                                continue L14;
                                              } else {
                                                componentSearchThenVariantResetEntity = poppedEntityOrSearchStart;
                                                L20: while (true) {
                                                  L21: {
                                                    L22: {
                                                      if (componentSearchThenVariantResetEntity != null) {
                                                        comparedThenUnlinkTarget = (GameplayEntity) (componentSearchThenVariantResetEntity);

                                                        neighborThenUnlinkArgument = (GameplayEntity) (neighborThenCountResetEntity);

                                                        if (clientControlSnapshot != 0) {
                                                          break L22;
                                                        } else {
                                                          if (comparedThenUnlinkTarget == neighborThenUnlinkArgument) {
                                                            if (clientControlSnapshot == 0) {
                                                              break L21;
                                                            }
                                                          }
                                                          componentSearchThenVariantResetEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.nextForIteration(-45));
                                                          if (clientControlSnapshot == 0) {
                                                            continue L20;
                                                          }
                                                        }
                                                      }
                                                      componentSearchThenVariantResetEntity = (GameplayEntity) ((Object) pendingConnectivityEntities.firstForIteration((byte) 121));
                                                      L25: while (componentSearchThenVariantResetEntity != null) {
                                                        comparedThenUnlinkTarget = (GameplayEntity) (componentSearchThenVariantResetEntity);

                                                        neighborThenUnlinkArgument = (GameplayEntity) (neighborThenCountResetEntity);

                                                        if (clientControlSnapshot != 0) {
                                                          break L22;
                                                        } else {
                                                          if (comparedThenUnlinkTarget == neighborThenUnlinkArgument) {
                                                            break L21;
                                                          } else {
                                                            componentSearchThenVariantResetEntity = (GameplayEntity) ((Object) pendingConnectivityEntities.nextForIteration(54));
                                                            if (clientControlSnapshot == 0) {
                                                              continue L25;
                                                            }
                                                          }
                                                        }
                                                        break;
                                                      }
                                                      pendingConnectivityEntities.addFirst(neighborThenCountResetEntity, false);
                                                      break L21;
                                                    }
                                                    L27: while (true) {
                                                      L28: {
                                                        ((GameplayEntity) (Object) comparedThenUnlinkTarget).removeRelatedEntity(neighborThenUnlinkArgument, 0);
                                                        componentNeighborIndex++;
                                                        if (clientControlSnapshot != 0) {
                                                          L29: while (true) {
                                                            if (connectivityAliasThenDetachingEntity == null) {
                                                              break L11;
                                                            } else {
                                                              connectivityAliasThenDetachingEntity.entityQueue = ji.movingEntities;
                                                              connectivityAliasThenDetachingEntity.touchesAvatar = false;
                                                              connectivityAliasThenDetachingEntity.detachedFromBoard = true;
                                                              fa.entitiesDetachedThisTick = true;
                                                              visitedFlagThenResetIndex = 0;

                                                              if (clientControlSnapshot != 0) {
                                                                break L9;
                                                              } else {
                                                                componentNeighborIndex = visitedFlagThenResetIndex;
                                                                if (componentNeighborIndex >= connectivityAliasThenDetachingEntity.relatedEntityCount) {
                                                                  entityForComponentCategoryReset = connectivityAliasThenDetachingEntity;
                                                                  neighborThenCountResetEntity = connectivityAliasThenDetachingEntity;
                                                                  connectivityAliasThenDetachingEntity.relatedEntityCount = 0;
                                                                  entityForComponentCategoryReset.sameCategoryEntityCount = 0;
                                                                  neighborThenCountResetEntity.sameVariantEntityCount = 0;
                                                                  connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                                                                  if (clientControlSnapshot == 0) {
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
                                                          if (clientControlSnapshot == 0) {
                                                            L30: while (true) {
                                                              if (componentNeighborIndex >= connectivityAliasThenDetachingEntity.relatedEntityCount) {
                                                                entityForComponentCategoryReset = connectivityAliasThenDetachingEntity;
                                                                neighborThenCountResetEntity = connectivityAliasThenDetachingEntity;
                                                                connectivityAliasThenDetachingEntity.relatedEntityCount = 0;
                                                                entityForComponentCategoryReset.sameCategoryEntityCount = 0;
                                                                neighborThenCountResetEntity.sameVariantEntityCount = 0;
                                                                connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                                                                if (clientControlSnapshot == 0) {
                                                                  if (connectivityAliasThenDetachingEntity == null) {
                                                                    break L11;
                                                                  } else {
                                                                    connectivityAliasThenDetachingEntity.entityQueue = ji.movingEntities;
                                                                    connectivityAliasThenDetachingEntity.touchesAvatar = false;
                                                                    connectivityAliasThenDetachingEntity.detachedFromBoard = true;
                                                                    fa.entitiesDetachedThisTick = true;
                                                                    visitedFlagThenResetIndex = 0;

                                                                    if (clientControlSnapshot != 0) {
                                                                      break L9;
                                                                    } else {
                                                                      componentNeighborIndex = visitedFlagThenResetIndex;
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
                                                              entityForComponentCategoryReset = connectivityAliasThenDetachingEntity;
                                                              neighborThenCountResetEntity = connectivityAliasThenDetachingEntity;
                                                              connectivityAliasThenDetachingEntity.relatedEntityCount = 0;
                                                              entityForComponentCategoryReset.sameCategoryEntityCount = 0;
                                                              neighborThenCountResetEntity.sameVariantEntityCount = 0;
                                                              connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                                                              if (clientControlSnapshot == 0) {
                                                                if (connectivityAliasThenDetachingEntity == null) {
                                                                  break L11;
                                                                } else {
                                                                  connectivityAliasThenDetachingEntity.entityQueue = ji.movingEntities;
                                                                  connectivityAliasThenDetachingEntity.touchesAvatar = false;
                                                                  connectivityAliasThenDetachingEntity.detachedFromBoard = true;
                                                                  fa.entitiesDetachedThisTick = true;
                                                                  visitedFlagThenResetIndex = 0;

                                                                  if (clientControlSnapshot != 0) {
                                                                    break L9;
                                                                  } else {
                                                                    componentNeighborIndex = visitedFlagThenResetIndex;
                                                                    if (componentNeighborIndex >= connectivityAliasThenDetachingEntity.relatedEntityCount) {
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
                                                      comparedThenUnlinkTarget = connectivityAliasThenDetachingEntity.relatedEntities[componentNeighborIndex];
                                                      neighborThenUnlinkArgument = (GameplayEntity) (connectivityAliasThenDetachingEntity);
                                                      continue L27;
                                                    }
                                                  }
                                                  componentNeighborIndex++;
                                                  if (clientControlSnapshot == 0) {
                                                    continue L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (clientControlSnapshot == 0) {
                                            continue L13;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  avatarContactThenDetachDecision = componentCanDetach;
                                }
                                if (avatarContactThenDetachDecision == 0) {
                                  break L11;
                                } else {
                                  connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                                  L32: while (true) {
                                    if (connectivityAliasThenDetachingEntity == null) {
                                      break L11;
                                    } else {
                                      connectivityAliasThenDetachingEntity.entityQueue = ji.movingEntities;
                                      connectivityAliasThenDetachingEntity.touchesAvatar = false;
                                      connectivityAliasThenDetachingEntity.detachedFromBoard = true;
                                      fa.entitiesDetachedThisTick = true;
                                      visitedFlagThenResetIndex = 0;

                                      if (clientControlSnapshot != 0) {
                                        break L9;
                                      } else {
                                        componentNeighborIndex = visitedFlagThenResetIndex;
                                        L33: while (componentNeighborIndex < connectivityAliasThenDetachingEntity.relatedEntityCount) {
                                          comparedThenUnlinkTarget = connectivityAliasThenDetachingEntity.relatedEntities[componentNeighborIndex];
                                          neighborThenUnlinkArgument = (GameplayEntity) (connectivityAliasThenDetachingEntity);
                                          ((GameplayEntity) (Object) comparedThenUnlinkTarget).removeRelatedEntity(neighborThenUnlinkArgument, 0);
                                          componentNeighborIndex++;
                                          if (clientControlSnapshot != 0) {
                                            continue L32;
                                          } else {
                                            if (clientControlSnapshot == 0) {
                                              continue L33;
                                            }
                                          }
                                          break;
                                        }
                                        entityForComponentCategoryReset = connectivityAliasThenDetachingEntity;
                                        neighborThenCountResetEntity = connectivityAliasThenDetachingEntity;
                                        connectivityAliasThenDetachingEntity.relatedEntityCount = 0;
                                        entityForComponentCategoryReset.sameCategoryEntityCount = 0;
                                        neighborThenCountResetEntity.sameVariantEntityCount = 0;
                                        connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                                        if (clientControlSnapshot == 0) {
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
                          if (clientControlSnapshot == 0) {
                            continue L8;
                          }
                        }
                      }
                      re.connectivityDirty = false;
                      el.gameplaySession.connectivityRebuiltThisTick = true;
                      visitedFlagThenResetIndex = 0;
                    }
                    visitedResetIndexThenKindFourCount = visitedFlagThenResetIndex;
                    L35: while (true) {
                      if (1000 <= visitedResetIndexThenKindFourCount) {
                        break L3;
                      } else {
                        pk.connectivityVisitedByEntityId[visitedResetIndexThenKindFourCount] = false;
                        visitedResetIndexThenKindFourCount++;
                        if (clientControlSnapshot != 0) {
                          break L2;
                        } else {
                          if (clientControlSnapshot == 0) {
                            continue L35;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                visitedResetIndexThenKindFourCount = 0;
              }
              routedAttachedEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
              L36: while (routedAttachedEntity != null) {
                L38: {
                  if (null == routedAttachedEntity.entityQueue) {
                    if (!w.avatarShockPending) {
                      break L38;
                    } else {
                      if (!routedAttachedEntity.touchesAvatar) {
                        break L38;
                      }
                    }
                  }
                  L40: {
                    L41: {
                      L42: {
                        re.connectivityDirty = true;
                        routedAttachedEntity.unlinkNode(false);
                        routedAttachedEntity.unlinkSecondaryNode((byte) 100);
                        el.gameplaySession.boardRasterDirty = true;
                        routedAttachedEntity.eraseEntityPixels(92);
                        if (ji.movingEntities == routedAttachedEntity.entityQueue) {
                          routedAttachedEntity.rotateEntityAroundBoard(-el.gameplaySession.boardAngleRadians, -117);
                          radialOffsetX = -routedAttachedEntity.positionX + 320.0f;
                          radialOffsetY = -routedAttachedEntity.positionY + 240.0f;
                          radialVelocityScale = (double)og.entityMotionSpeed / Math.sqrt((double)(radialOffsetY * radialOffsetY + radialOffsetX * radialOffsetX));
                          radialOffsetX = (float)((double)radialOffsetX * radialVelocityScale);
                          radialOffsetY = (float)((double)radialOffsetY * radialVelocityScale);
                          routedAttachedEntity.velocityY = radialOffsetY;
                          routedAttachedEntity.velocityX = radialOffsetX;
                          relatedEntityIndex = 0;
                          L43: while (routedAttachedEntity.relatedEntityCount > relatedEntityIndex) {
                            routedAttachedEntity.relatedEntities[relatedEntityIndex].removeRelatedEntity(routedAttachedEntity, 0);
                            relatedEntityIndex++;
                            if (clientControlSnapshot != 0) {
                              break L40;
                            } else {
                              if (clientControlSnapshot == 0) {
                                continue L43;
                              }
                            }
                            break;
                          }
                          neighborThenCountResetEntity = routedAttachedEntity;
                          componentSearchThenVariantResetEntity = routedAttachedEntity;
                          routedAttachedEntity.relatedEntityCount = 0;
                          neighborThenCountResetEntity.sameCategoryEntityCount = 0;
                          componentSearchThenVariantResetEntity.sameVariantEntityCount = 0;
                          ji.movingEntities.addLast(-36, routedAttachedEntity);
                          if (clientControlSnapshot == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      if (routedAttachedEntity.entityQueue != bh.field_c) {
                        if (!w.avatarShockPending) {
                          break L41;
                        }
                      }
                      transientNeighborIndex = 0;
                      L46: while (transientNeighborIndex < routedAttachedEntity.relatedEntityCount) {
                        routedAttachedEntity.relatedEntities[transientNeighborIndex].removeRelatedEntity(routedAttachedEntity, 0);
                        routedAttachedEntity.relatedEntities[transientNeighborIndex].drawEntityIdOnBoardMask(2);
                        transientNeighborIndex++;
                        if (clientControlSnapshot != 0) {
                          break L40;
                        } else {
                          if (clientControlSnapshot == 0) {
                            continue L46;
                          }
                        }
                        break;
                      }
                      categoryResetThenTransientEntity = routedAttachedEntity;
                      routedAttachedEntity.relatedEntityCount = 0;
                      entityForTransientVariantReset = routedAttachedEntity;
                      categoryResetThenTransientEntity.sameCategoryEntityCount = 0;
                      entityForTransientVariantReset.sameVariantEntityCount = 0;
                      routedAttachedEntity.remainingLifetimeTicks = 50;
                      bh.field_c.addLast(-100, routedAttachedEntity);
                      routedAttachedEntity.animationFrameIndex = 0;
                      if (routedAttachedEntity.touchesAvatar) {
                        if (w.avatarShockPending) {
                          L49: {
                            popupOriginYInput = (int)routedAttachedEntity.positionY;

                            popupOriginXInput = (int)routedAttachedEntity.positionX;

                            popupGuardInput = 117;

                            if (routedAttachedEntity.entitySpriteKindId != 4) {






                              if (routedAttachedEntity.entitySpriteKindId != 3) {
                                popupOriginY = popupOriginYInput;
                                popupOriginX = popupOriginXInput;
                                popupMethodGuard = popupGuardInput;
                                popupPoints = 10;
                                break L49;
                              } else {



                              }
                            }
                            popupOriginY = popupOriginYInput;
                            popupOriginX = popupOriginXInput;
                            popupMethodGuard = popupGuardInput;
                            popupPoints = 100;
                          }
                          ld.spawnPointsPopup(popupOriginY, popupOriginX, popupMethodGuard, popupPoints);
                        }
                      }
                      if (4 != routedAttachedEntity.entitySpriteKindId) {
                        routedAttachedEntity.configureEntitySprite(320, routedAttachedEntity.entityCategoryKey, routedAttachedEntity.spriteVariantIndex, 5);
                        if (clientControlSnapshot == 0) {
                          break L41;
                        }
                      }
                      routedAttachedEntity.configureEntitySprite(320, routedAttachedEntity.entityCategoryKey, routedAttachedEntity.spriteVariantIndex, 7);
                      visitedResetIndexThenKindFourCount++;
                      rb.kindFourRemovalCount = rb.kindFourRemovalCount + 1;
                      break L41;
                    }
                    routedAttachedEntity.entityQueue = null;
                  }
                  el.gameplaySession.boardRasterDirty = true;
                }
                routedAttachedEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
                if (clientControlSnapshot == 0) {
                  continue L36;
                }
                break;
              }
              methodGuardResidue = -23 / ((methodGuard - 69) / 46);
              categoryResetThenTransientEntity = (GameplayEntity) ((Object) bh.field_c.firstForIteration(0));
              L52: while (true) {
                L53: {
                  if (categoryResetThenTransientEntity != null) {
                    if (clientControlSnapshot != 0) {
                      break L53;
                    } else {
                      if (ra.availableEntities == categoryResetThenTransientEntity.entityQueue) {
                        categoryResetThenTransientEntity.unlinkNode(false);
                        categoryResetThenTransientEntity.unlinkSecondaryNode((byte) 51);
                        ra.availableEntities.addLast(-44, categoryResetThenTransientEntity);
                        categoryResetThenTransientEntity.entityQueue = null;
                      }
                      categoryResetThenTransientEntity = (GameplayEntity) ((Object) bh.field_c.nextForIteration(1));
                      if (clientControlSnapshot == 0) {
                        continue L52;
                      }
                    }
                  }
                  if (w.avatarShockPending) {
                    jc.requestAvatarFeedback(3, false);
                    jl.avatarShockContactPending = false;
                  }
                }
                L56: {
                  sessionForRasterRead = el.gameplaySession;

                  if (!el.gameplaySession.boardRasterDirty) {
                    sessionForRasterRead = (GameplaySession) ((Object) sessionForRasterRead);

                    if (!ab.boardContactStateDirty) {


                      if (!w.avatarShockPending) {
                        sessionForRasterWrite = (GameplaySession) ((Object) sessionForRasterRead);
                        rasterDirtyDecision = 0;
                        break L56;
                      } else {
                        sessionForRasterRead = (GameplaySession) ((Object) sessionForRasterRead);
                      }
                    }
                  }
                  sessionForRasterWrite = (GameplaySession) ((Object) sessionForRasterRead);
                  rasterDirtyDecision = 1;
                }
                sessionForRasterWrite.boardRasterDirty = rasterDirtyDecision != 0;
                w.avatarShockPending = false;
                if (visitedResetIndexThenKindFourCount >= 3) {
                  ra.a(255 ^ fe.field_f, -88, fe.field_f);
                }
                if (rb.kindFourRemovalCount >= 5) {
                  ra.a(255 ^ vd.field_p, -83, vd.field_p);
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "kc.C(" + methodGuard + ')');
        }
    }

    static {
        field_c = 0;
        createNameCharacterAlertText = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
