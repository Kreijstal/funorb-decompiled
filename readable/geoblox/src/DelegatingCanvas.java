/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DelegatingCanvas extends java.awt.Canvas {
    static IntrusiveDeque transientEntities;
    static Random sharedClientRandom;
    private java.awt.Component paintDelegate;
    static PcmStreamMixer logoAudioMixerReference;

    final static int sineQ16(byte methodGuard, int angle8192) {
        if (methodGuard <= 7) {
            return -8;
        }
        angle8192 = angle8192 & 8191;
        if (angle8192 < 4096) {
            return angle8192 < 2048 ? ScoreSubmission.quarterSineQ16[angle8192] : ScoreSubmission.quarterSineQ16[4096 - angle8192];
        }
        return angle8192 >= 6144 ? -ScoreSubmission.quarterSineQ16[-angle8192 + 8192] : -ScoreSubmission.quarterSineQ16[angle8192 - 4096];
    }

    public static void releaseStaticReferences(byte methodGuard) {
        sharedClientRandom = null;
        transientEntities = null;
        logoAudioMixerReference = null;
        int guardRemainder = -120 % ((-5 - methodGuard) / 51);
    }

    public final void update(java.awt.Graphics graphics) {
        try {
            this.paintDelegate.update(graphics);
        } catch (RuntimeException updateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) updateFailure), "bh.update(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static void handleRankedListResponse(int methodGuard) {
        RuntimeException rankedResponseFailure = null;
        RuntimeException rankedResponseFailureForContext = null;
        int responseQueryId = 0;
        RankedListQuery matchingQuery = null;
        int responseEntryCount = 0;
        int queryEntryLimit = 0;
        int responseEntryIndex = 0;
        String[][] temporaryNamesByOrdering = null;
        int rankedEntryCountSnapshot = 0;
        int orderingScanIndex = 0;
        int firstOrderingWriteIndex = 0;
        int rankedEntryIndex = 0;
        int clientControlFlowSnapshot = 0;
        int secondOrderingWriteIndex = 0;
        PacketBuffer responseBuffer = null;
        int[][] temporaryPackedEntriesByOrdering = null;
        int packedResponseEntryIndex;
        int secondOrderingScanIndex;
        int unusedInitialSecondOrderingWriteSnapshot;
        int secondOrderingEntryIndex;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          responseBuffer = LogoCompositor.sessionPacketBuffer;
          if (methodGuard != 2) {
            return;
          }
          responseQueryId = responseBuffer.readUnsignedByte((byte) 34);
          matchingQuery = (RankedListQuery) (PendingActionMarker.pendingRankedListQueries.firstForIteration(0));
          while (matchingQuery != null) {
            if (responseQueryId != matchingQuery.queryId) {
              matchingQuery = (RankedListQuery) (PendingActionMarker.pendingRankedListQueries.nextForIteration(1));
              continue;
            }
            break;
          }
          if (matchingQuery == null) {
            Bzip2DecoderState.closeSessionSocket((byte) -122);
            return;
          }
          responseEntryCount = responseBuffer.readUnsignedByte((byte) 34);
          if (responseEntryCount != 0) {
            ByteArrayPoolSupport.rankedListResponseNames[0] = SecondaryDeque.receivedSessionName;
            queryEntryLimit = matchingQuery.entryLimit;
            for (responseEntryIndex = 1; responseEntryCount > responseEntryIndex; responseEntryIndex++) {
              ByteArrayPoolSupport.rankedListResponseNames[responseEntryIndex] = responseBuffer.readNullTerminatedText((byte) 120);
            }
            TriangleMesh.prepareRankedEntryArrays(2147483647, queryEntryLimit, responseEntryCount);
            for (packedResponseEntryIndex = 0; responseEntryCount > packedResponseEntryIndex; packedResponseEntryIndex++) {
              ScorePopup.decodePackedRankedEntry(116, responseBuffer);
              if (packedResponseEntryIndex != 0) {
                TextValidationFailure.appendRankedEntry(GzipInflater.decodedRankedRatioThirdComponent, packedResponseEntryIndex, (byte) 123, StatefulWidgetRenderer.decodedRankedRatioNumerator, EmailAvailabilityQuery.decodedRankedRatioSecondComponent, HighscoreNameEntry.decodedRankedKeyTwo);
              } else {
                TextValidationFailure.appendRankedEntry(GzipInflater.decodedRankedRatioThirdComponent, packedResponseEntryIndex, (byte) -97, StatefulWidgetRenderer.decodedRankedRatioNumerator, EmailAvailabilityQuery.decodedRankedRatioSecondComponent, HighscoreNameEntry.decodedRankedKeyTwo);
              }
            }
            BoardReconciliationSupport.sortRankedListIndices(queryEntryLimit, (byte) -98);
            temporaryNamesByOrdering = new String[2][queryEntryLimit];
            temporaryPackedEntriesByOrdering = new int[2][4 * queryEntryLimit];
            rankedEntryCountSnapshot = GmtTimestampSupport.rankedEntryCount;
            orderingScanIndex = 0;
            firstOrderingWriteIndex = 0;
            while (orderingScanIndex < rankedEntryCountSnapshot) {
              rankedEntryIndex = AchievementQuery.rankedEntryIndices[orderingScanIndex];
              temporaryNamesByOrdering[0][firstOrderingWriteIndex] = ByteArrayPoolSupport.rankedListResponseNames[rankedEntryIndex];
              temporaryPackedEntriesByOrdering[0][4 * firstOrderingWriteIndex] = LoginPasswordSupport.rankedEntryKeyTwo[rankedEntryIndex];
              temporaryPackedEntriesByOrdering[0][4 * firstOrderingWriteIndex + 1] = TextHotspotBounds.rankedEntryRatioNumerators[rankedEntryIndex];
              temporaryPackedEntriesByOrdering[0][4 * firstOrderingWriteIndex + 2] = NodeHashTableIterator.rankedEntryRatioSecondComponents[rankedEntryIndex];
              temporaryPackedEntriesByOrdering[0][4 * firstOrderingWriteIndex + 3] = FrameTimer.rankedEntryRatioThirdComponents[rankedEntryIndex];
              if (WhirlpoolHash.matchesNormalizedSessionName(ByteArrayPoolSupport.rankedListResponseNames[rankedEntryIndex], (byte) 12) &&
                  FrameTimer.rankedEntryRatioThirdComponents[rankedEntryIndex] + (TextHotspotBounds.rankedEntryRatioNumerators[rankedEntryIndex] + NodeHashTableIterator.rankedEntryRatioSecondComponents[rankedEntryIndex]) == 0) {
                temporaryNamesByOrdering[0][firstOrderingWriteIndex] = null;
                firstOrderingWriteIndex--;
              }
              orderingScanIndex++;
              firstOrderingWriteIndex++;
            }
            secondOrderingScanIndex = 0;
            secondOrderingWriteIndex = 0;
            unusedInitialSecondOrderingWriteSnapshot = secondOrderingWriteIndex;
            while (secondOrderingScanIndex < rankedEntryCountSnapshot) {
              secondOrderingEntryIndex = AchievementQuery.rankedEntryIndices[secondOrderingScanIndex + queryEntryLimit];
              temporaryNamesByOrdering[1][secondOrderingWriteIndex] = ByteArrayPoolSupport.rankedListResponseNames[secondOrderingEntryIndex];
              temporaryPackedEntriesByOrdering[1][4 * secondOrderingWriteIndex] = LoginPasswordSupport.rankedEntryKeyTwo[secondOrderingEntryIndex];
              temporaryPackedEntriesByOrdering[1][1 + 4 * secondOrderingWriteIndex] = TextHotspotBounds.rankedEntryRatioNumerators[secondOrderingEntryIndex];
              temporaryPackedEntriesByOrdering[1][secondOrderingWriteIndex * 4 + 2] = NodeHashTableIterator.rankedEntryRatioSecondComponents[secondOrderingEntryIndex];
              temporaryPackedEntriesByOrdering[1][secondOrderingWriteIndex * 4 + 3] = FrameTimer.rankedEntryRatioThirdComponents[secondOrderingEntryIndex];
              if (WhirlpoolHash.matchesNormalizedSessionName(ByteArrayPoolSupport.rankedListResponseNames[secondOrderingEntryIndex], (byte) 12) &&
                  FrameTimer.rankedEntryRatioThirdComponents[secondOrderingEntryIndex] + NodeHashTableIterator.rankedEntryRatioSecondComponents[secondOrderingEntryIndex] + TextHotspotBounds.rankedEntryRatioNumerators[secondOrderingEntryIndex] == 0) {
                temporaryNamesByOrdering[1][secondOrderingWriteIndex] = null;
                secondOrderingWriteIndex--;
              }
              secondOrderingWriteIndex++;
              secondOrderingScanIndex++;
            }
            matchingQuery.unlinkNode(false);
            return;
          }
          matchingQuery.unlinkNode(false);
          return;
        } catch (java.lang.RuntimeException caughtRankedResponseFailure) {
          rankedResponseFailure = caughtRankedResponseFailure;
          rankedResponseFailureForContext = rankedResponseFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rankedResponseFailureForContext), "bh.B(" + methodGuard + ')');
        }
    }

    public final void paint(java.awt.Graphics graphics) {
        try {
            this.paintDelegate.paint(graphics);
        } catch (RuntimeException paintingFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) paintingFailure), "bh.paint(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static void propagateContactConversion(boolean propagateCategoryAndKind, GameplayEntity templateEntity, int methodGuard, GameplayEntity startingEntity, boolean propagateVariant) {
        GameplayEntity poppedEntity = null;
        GameplayEntity neighborForVariantIncrement = null;
        GameplayEntity neighborForCategoryIncrement = null;
        GameplayEntity neighborVariantWriteTarget = null;
        GameplayEntity neighborVariantReadSource = null;
        RuntimeException conversionFailureBeforeDescription = null;
        StringBuilder conversionMessageBeforeTemplate = null;
        String templateEntityDescription = null;
        StringBuilder conversionMessageBeforeStartingEntity = null;
        String startingEntityDescription = null;
        RuntimeException conversionFailure = null;
        RuntimeException conversionFailureForContext = null;
        SecondaryDeque processedEntities = null;
        int templateVariantIndex = 0;
        int templateSpriteKindId = 0;
        int templateCategoryKey = 0;
        GameplayEntity currentEntity = null;
        int neighborIndex = 0;
        GameplayEntity processedEntityToCompare = null;
        int clientControlFlowSnapshot = 0;
        SecondaryDeque pendingEntities = null;
        SecondaryDeque pendingEntitiesForRemoval = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          pendingEntities = new SecondaryDeque();
          pendingEntitiesForRemoval = pendingEntities;
          processedEntities = new SecondaryDeque();
          pendingEntitiesForRemoval.addLast(-45, startingEntity);
          templateVariantIndex = templateEntity.spriteVariantIndex;
          templateSpriteKindId = templateEntity.entitySpriteKindId;
          templateCategoryKey = templateEntity.entityCategoryKey;
          while (true) {
            poppedEntity = (GameplayEntity) (pendingEntitiesForRemoval.removeFirst(true));
            currentEntity = poppedEntity;
            if (null == poppedEntity) {
              if (methodGuard != 1) {
                DelegatingCanvas.releaseStaticReferences((byte) -40);
              }
              return;
            }
            if (propagateVariant) {
              currentEntity.configureEntitySprite(methodGuard + 319, currentEntity.entityCategoryKey, templateVariantIndex, 0);
            }
            if (propagateCategoryAndKind) {
              if (currentEntity.entitySpriteKindId == 2) {
                currentEntity.detachedFromBoard = true;
                currentEntity.entityQueue = ArchiveNetworkClient.movingEntities;
              }
              currentEntity.configureEntitySprite(320, templateCategoryKey, currentEntity.spriteVariantIndex, templateSpriteKindId);
            }
            neighborIndex = 0;
            {
            boolean allRelatedEntitiesScanned = false;
            contactConversionNeighbors: while (!(allRelatedEntitiesScanned = (neighborIndex >= currentEntity.relatedEntityCount))) {
              if (currentEntity.relatedEntities[neighborIndex].entitySpriteKindId != 1 ||
                    !propagateVariant) {
                if (2 != currentEntity.relatedEntities[neighborIndex].entitySpriteKindId) {
                  neighborIndex++;
                  continue;
                }
                if (!propagateCategoryAndKind) {
                  neighborIndex++;
                  continue;
                }
              }
              processedEntityToCompare = (GameplayEntity) (processedEntities.firstForIteration((byte) 121));
              while (processedEntityToCompare != null) {
                if (currentEntity != processedEntityToCompare) {
                  processedEntityToCompare = (GameplayEntity) (processedEntities.nextForIteration(methodGuard - 60));
                  continue;
                }
                neighborIndex++;
                continue contactConversionNeighbors;
              }
              if (propagateVariant) {
                currentEntity.sameVariantEntityCount = currentEntity.sameVariantEntityCount + 1;
                neighborForVariantIncrement = currentEntity.relatedEntities[neighborIndex];
                neighborVariantWriteTarget = neighborForVariantIncrement;
                neighborVariantReadSource = neighborForVariantIncrement;
                neighborVariantWriteTarget.sameVariantEntityCount = neighborVariantReadSource.sameVariantEntityCount + 1;
              }
              if (propagateCategoryAndKind) {
                currentEntity.spriteAngleRadians = templateEntity.spriteAngleRadians;
                currentEntity.sameCategoryEntityCount = currentEntity.sameCategoryEntityCount + 1;
                neighborForCategoryIncrement = currentEntity.relatedEntities[neighborIndex];
                neighborForCategoryIncrement.sameCategoryEntityCount = neighborForCategoryIncrement.sameCategoryEntityCount + 1;
              }
              pendingEntities.addFirst(currentEntity.relatedEntities[neighborIndex], false);
              neighborIndex++;
            }
            if (allRelatedEntitiesScanned) {
                processedEntities.addFirst(currentEntity, false);
                }
            }
          }
        } catch (java.lang.RuntimeException caughtConversionFailure) {
          conversionFailure = caughtConversionFailure;
          conversionFailureForContext = conversionFailure;
          conversionFailureBeforeDescription = conversionFailureForContext;
          conversionMessageBeforeTemplate = new StringBuilder().append("bh.D(").append(propagateCategoryAndKind).append(',');
          if (templateEntity == null) {
            templateEntityDescription = "null";
          } else {
            templateEntityDescription = "{...}";
          }
          conversionMessageBeforeStartingEntity = ((StringBuilder) (Object) conversionMessageBeforeTemplate).append(templateEntityDescription).append(',').append(methodGuard).append(',');
          if (startingEntity == null) {
            startingEntityDescription = "null";
          } else {
            startingEntityDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) conversionFailureBeforeDescription), ((StringBuilder) (Object) conversionMessageBeforeStartingEntity).append(startingEntityDescription).append(',').append(propagateVariant).append(')').toString());
        }
    }

    DelegatingCanvas(java.awt.Component paintDelegate) {
        try {
            this.paintDelegate = paintDelegate;
        } catch (RuntimeException delegateInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) delegateInitializationFailure), "bh.<init>(" + (paintDelegate != null ? "{...}" : "null") + ')');
        }
    }

    static {
        transientEntities = new IntrusiveDeque();
        sharedClientRandom = new Random();
    }
}
