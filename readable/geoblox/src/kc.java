/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int ticksSinceLastEntityRelease;
    static String createNameCharacterAlertText;
    static int sessionStartAttemptCount;

    public static void releaseStaticReferences(int methodGuard) {
        int guardResidue = 7 % ((79 - methodGuard) / 43);
        createNameCharacterAlertText = null;
    }

    final static void detachKeyboardListener(java.awt.Component component, int methodGuard) {
        component.removeKeyListener(je.keyboardListener);
        if (methodGuard != 0) {
            return;
        }
        try {
            component.removeFocusListener(je.keyboardListener);
            ii.keyStateWriteIndexOrResetSentinel = -1;
        } catch (RuntimeException keyboardDetachFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyboardDetachFailure), "kc.D(" + (component != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          SingleChildWidget.a(0, param0, ok.field_b, ProxyAuthenticationRequiredException.field_a, (byte) 121, md.field_c, true);
          if (param1 != -98) {
            return;
          }
          var2_int = 0;
          while (true) {
            L1: {
              if (md.field_c > var2_int) {
                AchievementQuery.field_i[param0 + var2_int] = var2_int;
                var2_int++;
                if (var3 != 0) {
                  break L1;
                }
                continue;
              }
              SingleChildWidget.a(param0, param0 + param0, LoginPayloadKind.field_a, va.field_b, (byte) 112, md.field_c + param0, false);
            }
            if (param0 < md.field_c) {
              md.field_c = param0;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "kc.A(" + param0 + ',' + param1 + ')');
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
        int popupPoints;
        GameplaySession sessionForRasterRead = null;
        boolean rasterDirtyDecision = false;
        RuntimeException caughtReconciliationException = null;
        boolean visitedByEntityIdValue;
        boolean directAvatarContactValue;
        GameplayEntity activeEntity = null;
        int visitedResetIndexThenKindFourCount = 0;
        RuntimeException reconciliationFailure = null;
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
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          fa.entitiesDetachedThisTick = false;
          activeEntity = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.firstForIteration(0));
          while (true) {
            L1: {
              L2: {
                L3: {
                  if (activeEntity != null) {
                    entityQueueThenAttachedQueue = activeEntity.entityQueue;
                    if (clientControlSnapshot != 0) {
                      break L3;
                    }
                    L5: {
                      if (entityQueueThenAttachedQueue != a.attachedEntities) {
                        if (!activeEntity.detachedFromBoard) {
                          break L5;
                        }
                        fa.entitiesDetachedThisTick = true;
                        break L5;
                      }
                      activeEntity.eraseEntityTrail(30383);
                      activeEntity.drawEntityIdOnBoardMask(2);
                      activeEntity.unlinkNode(false);
                      activeEntity.unlinkSecondaryNode((byte) 54);
                      a.attachedEntities.addLast(-80, activeEntity);
                      UiWidget.gameplaySession.boardRasterDirty = true;
                    }
                    activeEntity.entityQueue = null;
                    activeEntity = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.nextForIteration(1));
                    continue;
                  }
                  if (!re.connectivityDirty) {
                    break L2;
                  }
                  entityQueueThenAttachedQueue = a.attachedEntities;
                }
                activeEntity = (GameplayEntity) ((Object) ((IntrusiveDeque) (Object) entityQueueThenAttachedQueue).firstForIteration(0));
                while (true) {
                  L8: {
                    if (activeEntity != null) {
                      visitedByEntityIdValue = PacketBuffer.connectivityVisitedByEntityId[activeEntity.entityId];
                      visitedFlagThenResetIndex = visitedByEntityIdValue ? 1 : 0;
                      alreadyVisited = visitedByEntityIdValue;
                      if (clientControlSnapshot != 0) {
                        break L8;
                      }
                      L10: {
                        if ((alreadyVisited) &&
                            (clientControlSnapshot == 0)) {
                          break L10;
                        }
                        pendingConnectivityEntities = new SecondaryDeque();
                        visitedNonAvatarEntities = new SecondaryDeque();
                        pendingConnectivityEntities.addFirst(activeEntity, false);
                        componentCanDetach = 1;
                        L12: while (true) {
                          poppedEntityOrSearchStart = (GameplayEntity) ((Object) pendingConnectivityEntities.removeFirst(true));
                          while (true) {
                            L15: {
                              currentConnectivityEntity = poppedEntityOrSearchStart;
                              currentConnectivityEntityAlias = currentConnectivityEntity;
                              connectivityAliasThenDetachingEntity = currentConnectivityEntityAlias;
                              if (currentConnectivityEntityAlias != null) {
                                PacketBuffer.connectivityVisitedByEntityId[currentConnectivityEntity.entityId] = true;
                                directAvatarContactValue = currentConnectivityEntityAlias.touchesAvatar;
                                avatarContactThenDetachDecision = directAvatarContactValue ? 1 : 0;
                                poppedEntityTouchesAvatar = directAvatarContactValue;
                                if (poppedEntityTouchesAvatar) {
                                  componentCanDetach = 0;
                                  break L15;
                                }
                                visitedNonAvatarEntities.addFirst(currentConnectivityEntityAlias, false);
                                componentNeighborIndex = 0;
                                L17: while (true) {
                                  if (componentNeighborIndex < currentConnectivityEntityAlias.relatedEntityCount) {
                                    neighborThenCountResetEntity = currentConnectivityEntity.relatedEntities[componentNeighborIndex];
                                    poppedEntityOrSearchStart = (GameplayEntity) ((Object) visitedNonAvatarEntities.firstForIteration((byte) 121));
                                    componentSearchThenVariantResetEntity = poppedEntityOrSearchStart;
                                    while (true) {
                                      L20: {
                                        if (componentSearchThenVariantResetEntity != null) {
                                          comparedThenUnlinkTarget = componentSearchThenVariantResetEntity;
                                          neighborThenUnlinkArgument = neighborThenCountResetEntity;
                                          if ((comparedThenUnlinkTarget == neighborThenUnlinkArgument) &&
                                              (clientControlSnapshot == 0)) {
                                            break L20;
                                          }
                                          componentSearchThenVariantResetEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.nextForIteration(-45));
                                          continue;
                                        }
                                        componentSearchThenVariantResetEntity = (GameplayEntity) ((Object) pendingConnectivityEntities.firstForIteration((byte) 121));
                                        while (componentSearchThenVariantResetEntity != null) {
                                          comparedThenUnlinkTarget = componentSearchThenVariantResetEntity;
                                          neighborThenUnlinkArgument = neighborThenCountResetEntity;
                                          if (comparedThenUnlinkTarget == neighborThenUnlinkArgument) {
                                            break L20;
                                          }
                                          componentSearchThenVariantResetEntity = (GameplayEntity) ((Object) pendingConnectivityEntities.nextForIteration(54));
                                          continue;
                                        }
                                        pendingConnectivityEntities.addFirst(neighborThenCountResetEntity, false);
                                        break L20;
                                      }
                                      componentNeighborIndex++;
                                      continue L17;
                                    }
                                  }
                                  continue L12;
                                }
                              }
                            }
                            avatarContactThenDetachDecision = componentCanDetach;
                            if (avatarContactThenDetachDecision == 0) {
                              break L10;
                            }
                            connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                            while (true) {
                              if (connectivityAliasThenDetachingEntity == null) {
                                break L10;
                              }
                              connectivityAliasThenDetachingEntity.entityQueue = ArchiveNetworkClient.movingEntities;
                              connectivityAliasThenDetachingEntity.touchesAvatar = false;
                              connectivityAliasThenDetachingEntity.detachedFromBoard = true;
                              fa.entitiesDetachedThisTick = true;
                              visitedFlagThenResetIndex = 0;
                              componentNeighborIndex = visitedFlagThenResetIndex;
                              while (componentNeighborIndex < connectivityAliasThenDetachingEntity.relatedEntityCount) {
                                comparedThenUnlinkTarget = connectivityAliasThenDetachingEntity.relatedEntities[componentNeighborIndex];
                                neighborThenUnlinkArgument = connectivityAliasThenDetachingEntity;
                                ((GameplayEntity) (Object) comparedThenUnlinkTarget).removeRelatedEntity(neighborThenUnlinkArgument, 0);
                                componentNeighborIndex++;
                                continue;
                              }
                              entityForComponentCategoryReset = connectivityAliasThenDetachingEntity;
                              neighborThenCountResetEntity = connectivityAliasThenDetachingEntity;
                              connectivityAliasThenDetachingEntity.relatedEntityCount = 0;
                              entityForComponentCategoryReset.sameCategoryEntityCount = 0;
                              neighborThenCountResetEntity.sameVariantEntityCount = 0;
                              connectivityAliasThenDetachingEntity = (GameplayEntity) ((Object) visitedNonAvatarEntities.removeFirst(true));
                              continue;
                            }
                          }
                        }
                      }
                      activeEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
                      continue;
                    }
                    re.connectivityDirty = false;
                    UiWidget.gameplaySession.connectivityRebuiltThisTick = true;
                    visitedFlagThenResetIndex = 0;
                  }
                  visitedResetIndexThenKindFourCount = visitedFlagThenResetIndex;
                  while (true) {
                    if (1000 <= visitedResetIndexThenKindFourCount) {
                      break L2;
                    }
                    PacketBuffer.connectivityVisitedByEntityId[visitedResetIndexThenKindFourCount] = false;
                    visitedResetIndexThenKindFourCount++;
                    if (clientControlSnapshot != 0) {
                      break L1;
                    }
                    continue;
                  }
                }
              }
              visitedResetIndexThenKindFourCount = 0;
            }
            routedAttachedEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
            while (routedAttachedEntity != null) {
              if ((!(null == routedAttachedEntity.entityQueue) ||
                  (!(!w.avatarShockPending) &&
                    !(!routedAttachedEntity.touchesAvatar)))) {
                L39: {
                  L40: {
                    re.connectivityDirty = true;
                    routedAttachedEntity.unlinkNode(false);
                    routedAttachedEntity.unlinkSecondaryNode((byte) 100);
                    UiWidget.gameplaySession.boardRasterDirty = true;
                    routedAttachedEntity.eraseEntityPixels(92);
                    if (ArchiveNetworkClient.movingEntities == routedAttachedEntity.entityQueue) {
                      routedAttachedEntity.rotateEntityAroundBoard(-UiWidget.gameplaySession.boardAngleRadians, -117);
                      radialOffsetX = -routedAttachedEntity.positionX + 320.0f;
                      radialOffsetY = -routedAttachedEntity.positionY + 240.0f;
                      radialVelocityScale = (double)og.entityMotionSpeed / Math.sqrt((double)(radialOffsetY * radialOffsetY + radialOffsetX * radialOffsetX));
                      radialOffsetX = (float)((double)radialOffsetX * radialVelocityScale);
                      radialOffsetY = (float)((double)radialOffsetY * radialVelocityScale);
                      routedAttachedEntity.velocityY = radialOffsetY;
                      routedAttachedEntity.velocityX = radialOffsetX;
                      relatedEntityIndex = 0;
                      while (routedAttachedEntity.relatedEntityCount > relatedEntityIndex) {
                        routedAttachedEntity.relatedEntities[relatedEntityIndex].removeRelatedEntity(routedAttachedEntity, 0);
                        relatedEntityIndex++;
                        if (clientControlSnapshot != 0) {
                          break L39;
                        }
                        continue;
                      }
                      neighborThenCountResetEntity = routedAttachedEntity;
                      componentSearchThenVariantResetEntity = routedAttachedEntity;
                      routedAttachedEntity.relatedEntityCount = 0;
                      neighborThenCountResetEntity.sameCategoryEntityCount = 0;
                      componentSearchThenVariantResetEntity.sameVariantEntityCount = 0;
                      ArchiveNetworkClient.movingEntities.addLast(-36, routedAttachedEntity);
                      if (clientControlSnapshot == 0) {
                        break L40;
                      }
                    }
                    if ((routedAttachedEntity.entityQueue != DelegatingCanvas.transientEntities) &&
                        (!w.avatarShockPending)) {
                      break L40;
                    }
                    transientNeighborIndex = 0;
                    while (transientNeighborIndex < routedAttachedEntity.relatedEntityCount) {
                      routedAttachedEntity.relatedEntities[transientNeighborIndex].removeRelatedEntity(routedAttachedEntity, 0);
                      routedAttachedEntity.relatedEntities[transientNeighborIndex].drawEntityIdOnBoardMask(2);
                      transientNeighborIndex++;
                      if (clientControlSnapshot != 0) {
                        break L39;
                      }
                      continue;
                    }
                    categoryResetThenTransientEntity = routedAttachedEntity;
                    routedAttachedEntity.relatedEntityCount = 0;
                    entityForTransientVariantReset = routedAttachedEntity;
                    categoryResetThenTransientEntity.sameCategoryEntityCount = 0;
                    entityForTransientVariantReset.sameVariantEntityCount = 0;
                    routedAttachedEntity.remainingLifetimeTicks = 50;
                    DelegatingCanvas.transientEntities.addLast(-100, routedAttachedEntity);
                    routedAttachedEntity.animationFrameIndex = 0;
                    if ((routedAttachedEntity.touchesAvatar) &&
                        (w.avatarShockPending)) {
                      popupOriginYInput = (int)routedAttachedEntity.positionY;
                      popupOriginXInput = (int)routedAttachedEntity.positionX;
                      popupGuardInput = 117;
                      if ((routedAttachedEntity.entitySpriteKindId != 4) &&
                          (routedAttachedEntity.entitySpriteKindId != 3)) {
                        popupPoints = 10;
                      } else {
                        popupPoints = 100;
                      }
                      ld.spawnPointsPopup(popupOriginYInput, popupOriginXInput, popupGuardInput, popupPoints);
                    }
                    if (4 != routedAttachedEntity.entitySpriteKindId) {
                      routedAttachedEntity.configureEntitySprite(320, routedAttachedEntity.entityCategoryKey, routedAttachedEntity.spriteVariantIndex, 5);
                      if (clientControlSnapshot == 0) {
                        break L40;
                      }
                    }
                    routedAttachedEntity.configureEntitySprite(320, routedAttachedEntity.entityCategoryKey, routedAttachedEntity.spriteVariantIndex, 7);
                    visitedResetIndexThenKindFourCount++;
                    rb.kindFourRemovalCount = rb.kindFourRemovalCount + 1;
                  }
                  routedAttachedEntity.entityQueue = null;
                }
                UiWidget.gameplaySession.boardRasterDirty = true;
              }
              routedAttachedEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
              if (clientControlSnapshot == 0) {
                continue;
              }
              break;
            }
            methodGuardResidue = -23 / ((methodGuard - 69) / 46);
            categoryResetThenTransientEntity = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.firstForIteration(0));
            while (true) {
              L52: {
                if (categoryResetThenTransientEntity != null) {
                  if (clientControlSnapshot != 0) {
                    break L52;
                  }
                  if (SecondaryNodeDeque.availableEntities == categoryResetThenTransientEntity.entityQueue) {
                    categoryResetThenTransientEntity.unlinkNode(false);
                    categoryResetThenTransientEntity.unlinkSecondaryNode((byte) 51);
                    SecondaryNodeDeque.availableEntities.addLast(-44, categoryResetThenTransientEntity);
                    categoryResetThenTransientEntity.entityQueue = null;
                  }
                  categoryResetThenTransientEntity = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.nextForIteration(1));
                  continue;
                }
                if (w.avatarShockPending) {
                  jc.requestAvatarFeedback(3, false);
                  Bzip2DecoderState.avatarShockContactPending = false;
                }
              }
              sessionForRasterRead = UiWidget.gameplaySession;
              rasterDirtyDecision = (UiWidget.gameplaySession.boardRasterDirty) || (ab.boardContactStateDirty) || (w.avatarShockPending);
              sessionForRasterRead.boardRasterDirty = rasterDirtyDecision;
              w.avatarShockPending = false;
              if (visitedResetIndexThenKindFourCount >= 3) {
                SecondaryNodeDeque.recordAchievement(255 ^ GzipInflater.field_f, -88, GzipInflater.field_f);
              }
              if (rb.kindFourRemovalCount >= 5) {
                SecondaryNodeDeque.recordAchievement(255 ^ vd.field_p, -83, vd.field_p);
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException caughtReconciliationFailure) {
          caughtReconciliationException = caughtReconciliationFailure;
          reconciliationFailure = caughtReconciliationException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) reconciliationFailure), "kc.C(" + methodGuard + ')');
        }
    }

    static {
        sessionStartAttemptCount = 0;
        createNameCharacterAlertText = "Names can only contain letters, numbers, spaces and underscores";
        ticksSinceLastEntityRelease = 0;
    }
}
