/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BoardReconciliationSupport {
    static int ticksSinceLastEntityRelease;
    static String createNameCharacterAlertText;
    static int sessionStartAttemptCount;

    public static void releaseStaticReferences(int methodGuard) {
        int guardResidue = 7 % ((79 - methodGuard) / 43);
        createNameCharacterAlertText = null;
    }

    final static void detachKeyboardListener(java.awt.Component component, int methodGuard) {
        component.removeKeyListener(TrackedPcmStream.keyboardListener);
        if (methodGuard != 0) {
            return;
        }
        try {
            component.removeFocusListener(TrackedPcmStream.keyboardListener);
            ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = -1;
        } catch (RuntimeException keyboardDetachFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyboardDetachFailure), "kc.D(" + (component != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final static void sortRankedListIndices(int entryLimit, byte methodGuard) {
        int secondaryEntryIndex = 0;
        int clientControlSnapshot = 0;
        RuntimeException caughtSortFailure = null;
        RuntimeException sortFailureForContext = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          SingleChildWidget.sortRankedEntryRange(0, entryLimit, ClientRenderingState.rankedKeyTwoLowerBoundSeed, ProxyAuthenticationRequiredException.rankedKeyTwoUpperBoundSeed, (byte) 121, GmtTimestampSupport.rankedEntryCount, true);
          if (methodGuard != -98) {
            return;
          }
          secondaryEntryIndex = 0;
          do {
            if (!(GmtTimestampSupport.rankedEntryCount > secondaryEntryIndex)) {
              SingleChildWidget.sortRankedEntryRange(entryLimit, entryLimit + entryLimit, LoginPayloadKind.rankedSortLowerBoundValue, MeshPrioritySupport.rankedSortUpperBoundValue, (byte) 112, GmtTimestampSupport.rankedEntryCount + entryLimit, false);
              break;
            }
            AchievementQuery.rankedEntryIndices[entryLimit + secondaryEntryIndex] = secondaryEntryIndex;
            secondaryEntryIndex++;
          } while (clientControlSnapshot == 0);
          if (entryLimit < GmtTimestampSupport.rankedEntryCount) {
            GmtTimestampSupport.rankedEntryCount = entryLimit;
          }
          return;
        } catch (java.lang.RuntimeException sortFailure) {
          caughtSortFailure = sortFailure;
          sortFailureForContext = caughtSortFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) sortFailureForContext), "kc.A(" + entryLimit + ',' + methodGuard + ')');
        }
    }

    final static void reconcileBoardEntities(int methodGuard) {
        IntrusiveDeque entityQueueThenAttachedQueue = null;
        boolean alreadyVisited = false;
        GameplayEntity poppedConnectivityEntity = null;
        boolean poppedEntityTouchesAvatar = false;
        int avatarContactBitSnapshot = 0;
        GameplayEntity comparisonEntity = null;
        GameplayEntity neighborForConnectivityComparison = null;
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
        GameplayEntity entityForRoutingCategoryReset = null;
        int componentCanDetach = 0;
        float radialOffsetY = 0.0f;
        GameplayEntity entityForTransientVariantReset = null;
        GameplayEntity connectivityEntityAlias = null;
        double radialVelocityScale = 0.0;
        int connectivityNeighborIndex = 0;
        GameplayEntity entityForComponentCategoryReset = null;
        GameplayEntity connectivityNeighbor = null;
        int relatedEntityIndex = 0;
        GameplayEntity componentSearchEntity = null;
        int clientControlSnapshot = 0;
        GameplayEntity currentConnectivityEntity = null;
        SecondaryDeque pendingConnectivityEntities = null;
        GameplayEntity currentConnectivityEntityAlias = null;
        SecondaryDeque visitedNonAvatarEntities = null;
        GameplayEntity visitedNeighborSearchStart;
        GameplayEntity neighborForRelationRemoval;
        GameplayEntity detachingEntityForRelationRemoval;
        GameplayEntity transientQueueEntity;
        GameplayEntity detachingComponentEntity;
        GameplayEntity routedEntityForCategoryReset;
        GameplayEntity routedEntityForVariantReset;
        GameplayEntity detachingEntityForVariantReset;
        int componentDetachDecision;
        int relationRemovalNeighborIndex;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          MessageDialogSupport.entitiesDetachedThisTick = false;
          activeEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.firstForIteration(0));
          movingAndConnectivityPhase: while (true) {
            connectivityRebuild: {
              if (activeEntity != null) {
                entityQueueThenAttachedQueue = activeEntity.entityQueue;
                if (clientControlSnapshot == 0) {
                  if (entityQueueThenAttachedQueue != BoardEntityState.attachedEntities) {
                    if (activeEntity.detachedFromBoard) {
                      MessageDialogSupport.entitiesDetachedThisTick = true;
                    }
                  } else {
                    activeEntity.eraseEntityTrail(30383);
                    activeEntity.drawEntityIdOnBoardMask(2);
                    activeEntity.unlinkNode(false);
                    activeEntity.unlinkSecondaryNode((byte) 54);
                    BoardEntityState.attachedEntities.addLast(-80, activeEntity);
                    UiWidget.gameplaySession.boardRasterDirty = true;
                  }
                  activeEntity.entityQueue = null;
                  activeEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.nextForIteration(1));
                  continue;
                }
              } else {
                if (!RankedListQuery.connectivityDirty) {
                  break connectivityRebuild;
                }
                entityQueueThenAttachedQueue = BoardEntityState.attachedEntities;
              }
              activeEntity = (GameplayEntity) (((IntrusiveDeque) (Object) entityQueueThenAttachedQueue).firstForIteration(0));
              {
              boolean connectivityEntityScanCompleted = false;
              while (!(connectivityEntityScanCompleted = (activeEntity == null))) {
                visitedByEntityIdValue = PacketBuffer.connectivityVisitedByEntityId[activeEntity.entityId];
                visitedFlagThenResetIndex = visitedByEntityIdValue ? 1 : 0;
                alreadyVisited = visitedByEntityIdValue;
                if (clientControlSnapshot == 0) {
                  if (!alreadyVisited) {
                    pendingConnectivityEntities = new SecondaryDeque();
                    visitedNonAvatarEntities = new SecondaryDeque();
                    pendingConnectivityEntities.addFirst(activeEntity, false);
                    componentCanDetach = 1;
                    while (true) {
                      poppedConnectivityEntity = (GameplayEntity) (pendingConnectivityEntities.removeFirst(true));
                      currentConnectivityEntity = poppedConnectivityEntity;
                      currentConnectivityEntityAlias = currentConnectivityEntity;
                      connectivityEntityAlias = currentConnectivityEntityAlias;
                      if (currentConnectivityEntityAlias != null) {
                        PacketBuffer.connectivityVisitedByEntityId[currentConnectivityEntity.entityId] = true;
                        directAvatarContactValue = currentConnectivityEntityAlias.touchesAvatar;
                        avatarContactBitSnapshot = directAvatarContactValue ? 1 : 0;
                        poppedEntityTouchesAvatar = directAvatarContactValue;
                        if (poppedEntityTouchesAvatar) {
                          componentCanDetach = 0;
                        } else {
                          visitedNonAvatarEntities.addFirst(currentConnectivityEntityAlias, false);
                          connectivityNeighborIndex = 0;
                          while (connectivityNeighborIndex < currentConnectivityEntityAlias.relatedEntityCount) {
                            connectivityNeighbor = currentConnectivityEntity.relatedEntities[connectivityNeighborIndex];
                            visitedNeighborSearchStart = (GameplayEntity) (visitedNonAvatarEntities.firstForIteration((byte) 121));
                            componentSearchEntity = visitedNeighborSearchStart;
                            enqueueUnseenNeighbor: while (true) {
                              if (componentSearchEntity != null) {
                                comparisonEntity = componentSearchEntity;
                                neighborForConnectivityComparison = connectivityNeighbor;
                                if (comparisonEntity != neighborForConnectivityComparison) {
                                  componentSearchEntity = (GameplayEntity) (visitedNonAvatarEntities.nextForIteration(-45));
                                  continue;
                                }
                              } else {
                                componentSearchEntity = (GameplayEntity) (pendingConnectivityEntities.firstForIteration((byte) 121));
                                while (componentSearchEntity != null) {
                                  comparisonEntity = componentSearchEntity;
                                  neighborForConnectivityComparison = connectivityNeighbor;
                                  if (comparisonEntity == neighborForConnectivityComparison) {
                                    break enqueueUnseenNeighbor;
                                  }
                                  componentSearchEntity = (GameplayEntity) (pendingConnectivityEntities.nextForIteration(54));
                                }
                                pendingConnectivityEntities.addFirst(connectivityNeighbor, false);
                              }
                              break;
                            }
                            connectivityNeighborIndex++;
                          }
                          continue;
                        }
                      }
                      componentDetachDecision = componentCanDetach;
                      if (componentDetachDecision == 0) {
                        break;
                      }
                      detachingComponentEntity = (GameplayEntity) (visitedNonAvatarEntities.removeFirst(true));
                      while (detachingComponentEntity != null) {
                        detachingComponentEntity.entityQueue = ArchiveNetworkClient.movingEntities;
                        detachingComponentEntity.touchesAvatar = false;
                        detachingComponentEntity.detachedFromBoard = true;
                        MessageDialogSupport.entitiesDetachedThisTick = true;
                        visitedFlagThenResetIndex = 0;
                        relationRemovalNeighborIndex = visitedFlagThenResetIndex;
                        while (relationRemovalNeighborIndex < detachingComponentEntity.relatedEntityCount) {
                          neighborForRelationRemoval = detachingComponentEntity.relatedEntities[relationRemovalNeighborIndex];
                          detachingEntityForRelationRemoval = detachingComponentEntity;
                          ((GameplayEntity) (Object) neighborForRelationRemoval).removeRelatedEntity(detachingEntityForRelationRemoval, 0);
                          relationRemovalNeighborIndex++;
                        }
                        entityForComponentCategoryReset = detachingComponentEntity;
                        detachingEntityForVariantReset = detachingComponentEntity;
                        detachingComponentEntity.relatedEntityCount = 0;
                        entityForComponentCategoryReset.sameCategoryEntityCount = 0;
                        detachingEntityForVariantReset.sameVariantEntityCount = 0;
                        detachingComponentEntity = (GameplayEntity) (visitedNonAvatarEntities.removeFirst(true));
                      }
                      break;
                    }
                  }
                  activeEntity = (GameplayEntity) (BoardEntityState.attachedEntities.nextForIteration(1));
                  continue;
                }
                break;
              }
              if (connectivityEntityScanCompleted) {
                  RankedListQuery.connectivityDirty = false;
                  UiWidget.gameplaySession.connectivityRebuiltThisTick = true;
                  visitedFlagThenResetIndex = 0;
                  }
              }
              visitedResetIndexThenKindFourCount = visitedFlagThenResetIndex;
              while (1000 > visitedResetIndexThenKindFourCount) {
                PacketBuffer.connectivityVisitedByEntityId[visitedResetIndexThenKindFourCount] = false;
                visitedResetIndexThenKindFourCount++;
                if (clientControlSnapshot != 0) {
                  break movingAndConnectivityPhase;
                }
              }
            }
            visitedResetIndexThenKindFourCount = 0;
            break;
          }
          routedAttachedEntity = (GameplayEntity) (BoardEntityState.attachedEntities.firstForIteration(0));
          while (routedAttachedEntity != null) {
            if (null != routedAttachedEntity.entityQueue ||
                SessionSocketSupport.avatarShockPending &&
                  routedAttachedEntity.touchesAvatar) {
              {
                boolean movingEntityRoutingRemainderEnabled = true;
                boolean transientEntityRoutingRemainderEnabled = true;
                routingDestinationSelection: {
                  RankedListQuery.connectivityDirty = true;
                  routedAttachedEntity.unlinkNode(false);
                  routedAttachedEntity.unlinkSecondaryNode((byte) 100);
                  UiWidget.gameplaySession.boardRasterDirty = true;
                  routedAttachedEntity.eraseEntityPixels(92);
                  if (ArchiveNetworkClient.movingEntities == routedAttachedEntity.entityQueue) {
                    routedAttachedEntity.rotateEntityAroundBoard(-UiWidget.gameplaySession.boardAngleRadians, -117);
                    radialOffsetX = -routedAttachedEntity.positionX + 320.0f;
                    radialOffsetY = -routedAttachedEntity.positionY + 240.0f;
                    radialVelocityScale = (double)TextTemplateDefinition.entityMotionSpeed / Math.sqrt((double)(radialOffsetY * radialOffsetY + radialOffsetX * radialOffsetX));
                    radialOffsetX = (float)((double)radialOffsetX * radialVelocityScale);
                    radialOffsetY = (float)((double)radialOffsetY * radialVelocityScale);
                    routedAttachedEntity.velocityY = radialOffsetY;
                    routedAttachedEntity.velocityX = radialOffsetX;
                    relatedEntityIndex = 0;
                    while (routedAttachedEntity.relatedEntityCount > relatedEntityIndex) {
                      routedAttachedEntity.relatedEntities[relatedEntityIndex].removeRelatedEntity(routedAttachedEntity, 0);
                      relatedEntityIndex++;
                      if (clientControlSnapshot != 0) {
                        movingEntityRoutingRemainderEnabled = false;
                        break;
                      }
                    }
                    if (movingEntityRoutingRemainderEnabled) {
                      routedEntityForCategoryReset = routedAttachedEntity;
                      routedEntityForVariantReset = routedAttachedEntity;
                      routedAttachedEntity.relatedEntityCount = 0;
                      routedEntityForCategoryReset.sameCategoryEntityCount = 0;
                      routedEntityForVariantReset.sameVariantEntityCount = 0;
                      ArchiveNetworkClient.movingEntities.addLast(-36, routedAttachedEntity);
                      if (clientControlSnapshot == 0) {
                        break routingDestinationSelection;
                      }
                    }
                  }
                  if (movingEntityRoutingRemainderEnabled) {
                    if (routedAttachedEntity.entityQueue == DelegatingCanvas.transientEntities ||
                        SessionSocketSupport.avatarShockPending) {
                      transientNeighborIndex = 0;
                      while (transientNeighborIndex < routedAttachedEntity.relatedEntityCount) {
                        routedAttachedEntity.relatedEntities[transientNeighborIndex].removeRelatedEntity(routedAttachedEntity, 0);
                        routedAttachedEntity.relatedEntities[transientNeighborIndex].drawEntityIdOnBoardMask(2);
                        transientNeighborIndex++;
                        if (clientControlSnapshot != 0) {
                          transientEntityRoutingRemainderEnabled = false;
                          break;
                        }
                      }
                      if (transientEntityRoutingRemainderEnabled) {
                        entityForRoutingCategoryReset = routedAttachedEntity;
                        routedAttachedEntity.relatedEntityCount = 0;
                        entityForTransientVariantReset = routedAttachedEntity;
                        entityForRoutingCategoryReset.sameCategoryEntityCount = 0;
                        entityForTransientVariantReset.sameVariantEntityCount = 0;
                        routedAttachedEntity.remainingLifetimeTicks = 50;
                        DelegatingCanvas.transientEntities.addLast(-100, routedAttachedEntity);
                        routedAttachedEntity.animationFrameIndex = 0;
                        if (routedAttachedEntity.touchesAvatar &&
                            SessionSocketSupport.avatarShockPending) {
                          popupOriginYInput = (int)routedAttachedEntity.positionY;
                          popupOriginXInput = (int)routedAttachedEntity.positionX;
                          popupGuardInput = 117;
                          if (routedAttachedEntity.entitySpriteKindId != 4 &&
                              routedAttachedEntity.entitySpriteKindId != 3) {
                            popupPoints = 10;
                          } else {
                            popupPoints = 100;
                          }
                          PlayfieldRules.spawnPointsPopup(popupOriginYInput, popupOriginXInput, popupGuardInput, popupPoints);
                        }
                        boolean applyKindSevenConversionAndCounters = !(4 != routedAttachedEntity.entitySpriteKindId);
                        if (!applyKindSevenConversionAndCounters) {
                          routedAttachedEntity.configureEntitySprite(320, routedAttachedEntity.entityCategoryKey, routedAttachedEntity.spriteVariantIndex, 5);
                          applyKindSevenConversionAndCounters = (clientControlSnapshot != 0);
                        }
                        if (applyKindSevenConversionAndCounters) {
                          routedAttachedEntity.configureEntitySprite(320, routedAttachedEntity.entityCategoryKey, routedAttachedEntity.spriteVariantIndex, 7);
                          visitedResetIndexThenKindFourCount++;
                          FontLoadingSupport.kindFourRemovalCount = FontLoadingSupport.kindFourRemovalCount + 1;
                        }
                      }
                    }
                  }
                }
                if (movingEntityRoutingRemainderEnabled) {
                  if (transientEntityRoutingRemainderEnabled) {
                    routedAttachedEntity.entityQueue = null;
                  }
                }
              }
              UiWidget.gameplaySession.boardRasterDirty = true;
            }
            routedAttachedEntity = (GameplayEntity) (BoardEntityState.attachedEntities.nextForIteration(1));
            if (clientControlSnapshot == 0) {
              continue;
            }
            break;
          }
          methodGuardResidue = -23 / ((methodGuard - 69) / 46);
          transientQueueEntity = (GameplayEntity) (DelegatingCanvas.transientEntities.firstForIteration(0));
          {
          boolean transientQueueExhausted = false;
          while (!(transientQueueExhausted = (transientQueueEntity == null))) {
            if (clientControlSnapshot == 0) {
              if (SecondaryNodeDeque.availableEntities == transientQueueEntity.entityQueue) {
                transientQueueEntity.unlinkNode(false);
                transientQueueEntity.unlinkSecondaryNode((byte) 51);
                SecondaryNodeDeque.availableEntities.addLast(-44, transientQueueEntity);
                transientQueueEntity.entityQueue = null;
              }
              transientQueueEntity = (GameplayEntity) (DelegatingCanvas.transientEntities.nextForIteration(1));
              continue;
            }
            break;
          }
          if (transientQueueExhausted) {
              if (SessionSocketSupport.avatarShockPending) {
                AvatarFeedbackSupport.requestAvatarFeedback(3, false);
                Bzip2DecoderState.avatarShockContactPending = false;
              }
              }
          }
          sessionForRasterRead = UiWidget.gameplaySession;
          rasterDirtyDecision = (UiWidget.gameplaySession.boardRasterDirty) || (EntityMotionSupport.boardContactStateDirty) || (SessionSocketSupport.avatarShockPending);
          sessionForRasterRead.boardRasterDirty = rasterDirtyDecision;
          SessionSocketSupport.avatarShockPending = false;
          if (visitedResetIndexThenKindFourCount >= 3) {
            SecondaryNodeDeque.recordAchievement(255 ^ GzipInflater.threeKindFourRemovalAchievementId, -88, GzipInflater.threeKindFourRemovalAchievementId);
          }
          if (FontLoadingSupport.kindFourRemovalCount >= 5) {
            SecondaryNodeDeque.recordAchievement(255 ^ ReceivedTextRecord.fiveKindFourRemovalsAchievementId, -83, ReceivedTextRecord.fiveKindFourRemovalsAchievementId);
          }
          return;
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
