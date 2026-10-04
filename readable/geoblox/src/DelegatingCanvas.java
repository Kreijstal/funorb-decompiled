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

    public final void update(java.awt.Graphics param0) {
        try {
            this.paintDelegate.update(param0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bh.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void handleRankedListResponse(int methodGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        RankedListQuery var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        PacketBuffer var14 = null;
        int[][] var18 = null;
        var12 = Geoblox.clientControlFlowFlag;
        try {
          var14 = LogoCompositor.sessionPacketBuffer;
          if (methodGuard != 2) {
            return;
          }
          var2 = var14.readUnsignedByte((byte) 34);
          var3 = (RankedListQuery) ((Object) PendingActionMarker.pendingRankedListQueries.firstForIteration(0));
          while (var3 != null) {
            if (var2 != var3.queryId) {
              var3 = (RankedListQuery) ((Object) PendingActionMarker.pendingRankedListQueries.nextForIteration(1));
              continue;
            }
            break;
          }
          if (var3 == null) {
            Bzip2DecoderState.closeSessionSocket((byte) -122);
            return;
          }
          var4 = var14.readUnsignedByte((byte) 34);
          if (var4 != 0) {
            ByteArrayPoolSupport.rankedListResponseNames[0] = SecondaryDeque.receivedSessionName;
            var5 = var3.entryLimit;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              ByteArrayPoolSupport.rankedListResponseNames[var6_int] = var14.readNullTerminatedText((byte) 120);
            }
            TriangleMesh.prepareRankedEntryArrays(2147483647, var5, var4);
            for (var6_int = 0; var4 > var6_int; var6_int++) {
              ScorePopup.decodePackedRankedEntry(116, var14);
              if (var6_int != 0) {
                TextValidationFailure.appendRankedEntry(GzipInflater.decodedRankedRatioThirdComponent, var6_int, (byte) 123, StatefulWidgetRenderer.decodedRankedRatioNumerator, EmailAvailabilityQuery.decodedRankedRatioSecondComponent, HighscoreNameEntry.decodedRankedKeyTwo);
              } else {
                TextValidationFailure.appendRankedEntry(GzipInflater.decodedRankedRatioThirdComponent, var6_int, (byte) -97, StatefulWidgetRenderer.decodedRankedRatioNumerator, EmailAvailabilityQuery.decodedRankedRatioSecondComponent, HighscoreNameEntry.decodedRankedKeyTwo);
              }
            }
            BoardReconciliationSupport.sortRankedListIndices(var5, (byte) -98);
            var6 = new String[2][var5];
            var18 = new int[2][4 * var5];
            var8 = GmtTimestampSupport.rankedEntryCount;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = AchievementQuery.rankedEntryIndices[var9];
              var6[0][var10] = ByteArrayPoolSupport.rankedListResponseNames[var11];
              var18[0][4 * var10] = LoginPasswordSupport.rankedEntryKeyTwo[var11];
              var18[0][4 * var10 + 1] = TextHotspotBounds.rankedEntryRatioNumerators[var11];
              var18[0][4 * var10 + 2] = NodeHashTableIterator.rankedEntryRatioSecondComponents[var11];
              var18[0][4 * var10 + 3] = FrameTimer.rankedEntryRatioThirdComponents[var11];
              if ((WhirlpoolHash.a(ByteArrayPoolSupport.rankedListResponseNames[var11], (byte) 12)) &&
                  (FrameTimer.rankedEntryRatioThirdComponents[var11] + (TextHotspotBounds.rankedEntryRatioNumerators[var11] + NodeHashTableIterator.rankedEntryRatioSecondComponents[var11]) == 0)) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9 = 0;
            var13 = 0;
            var10 = var13;
            while (var9 < var8) {
              var11 = AchievementQuery.rankedEntryIndices[var9 + var5];
              var6[1][var13] = ByteArrayPoolSupport.rankedListResponseNames[var11];
              var18[1][4 * var13] = LoginPasswordSupport.rankedEntryKeyTwo[var11];
              var18[1][1 + 4 * var13] = TextHotspotBounds.rankedEntryRatioNumerators[var11];
              var18[1][var13 * 4 + 2] = NodeHashTableIterator.rankedEntryRatioSecondComponents[var11];
              var18[1][var13 * 4 + 3] = FrameTimer.rankedEntryRatioThirdComponents[var11];
              if ((WhirlpoolHash.a(ByteArrayPoolSupport.rankedListResponseNames[var11], (byte) 12)) &&
                  (FrameTimer.rankedEntryRatioThirdComponents[var11] + NodeHashTableIterator.rankedEntryRatioSecondComponents[var11] + TextHotspotBounds.rankedEntryRatioNumerators[var11] == 0)) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9++;
            }
            var3.unlinkNode(false);
            return;
          }
          var3.unlinkNode(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "bh.B(" + methodGuard + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.paintDelegate.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bh.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void propagateContactConversion(boolean propagateCategoryAndKind, GameplayEntity templateEntity, int methodGuard, GameplayEntity startingEntity, boolean propagateVariant) {
        GameplayEntity poppedEntity = null;
        GameplayEntity neighborForVariantIncrement = null;
        GameplayEntity neighborForCategoryIncrement = null;
        GameplayEntity neighborVariantWriteTarget = null;
        GameplayEntity neighborVariantReadSource = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        SecondaryDeque processedEntities = null;
        int templateVariantIndex = 0;
        int templateSpriteKindId = 0;
        int templateCategoryKey = 0;
        GameplayEntity currentEntity = null;
        int neighborIndex = 0;
        GameplayEntity processedEntityToCompare = null;
        int var13 = 0;
        SecondaryDeque pendingEntities = null;
        SecondaryDeque pendingEntitiesForRemoval = null;
        var13 = Geoblox.clientControlFlowFlag;
        try {
          pendingEntities = new SecondaryDeque();
          pendingEntitiesForRemoval = pendingEntities;
          processedEntities = new SecondaryDeque();
          pendingEntitiesForRemoval.addLast(-45, startingEntity);
          templateVariantIndex = templateEntity.spriteVariantIndex;
          templateSpriteKindId = templateEntity.entitySpriteKindId;
          templateCategoryKey = templateEntity.entityCategoryKey;
          L0: while (true) {
            poppedEntity = (GameplayEntity) ((Object) pendingEntitiesForRemoval.removeFirst(true));
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
            L5: while (true) {
              if (neighborIndex >= currentEntity.relatedEntityCount) {
                processedEntities.addFirst(currentEntity, false);
                continue L0;
              }
              if (!((currentEntity.relatedEntities[neighborIndex].entitySpriteKindId == 1) &&
                    (propagateVariant))) {
                if (2 != currentEntity.relatedEntities[neighborIndex].entitySpriteKindId) {
                  neighborIndex++;
                  continue;
                }
                if (!propagateCategoryAndKind) {
                  neighborIndex++;
                  continue;
                }
              }
              processedEntityToCompare = (GameplayEntity) ((Object) processedEntities.firstForIteration((byte) 121));
              while (processedEntityToCompare != null) {
                if (currentEntity != processedEntityToCompare) {
                  processedEntityToCompare = (GameplayEntity) ((Object) processedEntities.nextForIteration(methodGuard - 60));
                  continue;
                }
                neighborIndex++;
                continue L5;
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
              continue L5;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("bh.D(").append(propagateCategoryAndKind).append(',');
          if (templateEntity == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(methodGuard).append(',');
          if (startingEntity == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(propagateVariant).append(')').toString());
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
            this.paintDelegate = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        transientEntities = new IntrusiveDeque();
        sharedClientRandom = new Random();
    }
}
