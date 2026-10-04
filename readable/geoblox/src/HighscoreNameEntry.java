/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreNameEntry {
    String primaryName;
    String alternateName;
    boolean usedInUniqueView;
    static int unusedGuardScratch;

    final static void updateSpawnQueue(int methodGuard) {
        RuntimeException caughtSpawnQueueFailure = null;
        GameplayEntity queuedEntityThenPooledEntity = null;
        RuntimeException spawnQueueFailureForContext = null;
        double spawnAngleRadians = 0.0;
        float spawnPositionX = 0.0f;
        float spawnPositionY = 0.0f;
        float inwardDirectionX = 0.0f;
        float inwardDirectionY = 0.0f;
        double inverseSpawnDistance = 0.0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          queuedEntityThenPooledEntity = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.firstForIteration(0));
          while (true) {
            if (!(queuedEntityThenPooledEntity != null)) {
              if (methodGuard != 255) {
                unusedGuardScratch = -11;
              }
              break;
            }
            queuedEntityThenPooledEntity.advanceEntityAnimation(true);
            queuedEntityThenPooledEntity = (GameplayEntity) ((Object) SecondaryDeque.spawnQueue.nextForIteration(1));
            if (clientControlFlowGuard == 0) {
              continue;
            }
            break;
          }
          if ((!((!((MidiPcmStream.heldInternalKeys[99]) &&
                (ArchiveNetworkClient.movingEntities.isEmpty(13519)))) &&
              (~UsernameResponseSupport.spawnReleaseIntervalTicks <= ~BoardReconciliationSupport.ticksSinceLastEntityRelease)) ||
              (!(MatchCandidateSupport.releasedInCurrentTheme != 0) &&
                !(UiWidget.gameplaySession.tutorialMode)))) {
            if ((0 < SecondaryDeque.spawnQueue.countNodes(methodGuard ^ -170)) &&
                (!UiWidget.gameplaySession.spawnReleaseDisabled)) {
              ArchiveNetworkClient.movingEntities.addLast(-48, SecondaryDeque.spawnQueue.removeFirst((byte) -124));
              LabeledChildWidget.recordEntityRelease(2);
              BoardReconciliationSupport.ticksSinceLastEntityRelease = 0;
            }
          }
          BoardReconciliationSupport.ticksSinceLastEntityRelease = BoardReconciliationSupport.ticksSinceLastEntityRelease + 1;
          if ((SecondaryDeque.spawnQueue.countNodes(methodGuard ^ 143) < 3) &&
              (DelayedIncomingPacket.c((byte) -53)) &&
              (!UiWidget.gameplaySession.canAdvanceSession(true))) {
            queuedEntityThenPooledEntity = (GameplayEntity) ((Object) SecondaryNodeDeque.availableEntities.removeFirst((byte) -101));
            if (null != queuedEntityThenPooledEntity) {
              spawnAngleRadians = 2.0 * Math.random() * 3.141592653589793;
              spawnPositionX = 240.0f * (float)Math.cos(spawnAngleRadians) + 320.0f;
              spawnPositionY = 240.0f + (float)Math.sin(spawnAngleRadians) * 240.0f;
              inwardDirectionX = 320.0f - spawnPositionX;
              inwardDirectionY = -spawnPositionY + 240.0f;
              inverseSpawnDistance = 1.0 / Math.sqrt((double)(inwardDirectionY * inwardDirectionY + inwardDirectionX * inwardDirectionX));
              inwardDirectionY = (float)((double)inwardDirectionY * inverseSpawnDistance);
              inwardDirectionX = (float)((double)inwardDirectionX * inverseSpawnDistance);
              queuedEntityThenPooledEntity.initializeEntityMotion(101, spawnPositionX, ReceivedTextRecord.chooseSpawnSpriteKind(methodGuard ^ 741924143), TextTemplateDefinition.entityMotionSpeed * inwardDirectionX, TriangleMesh.chooseSpawnSpriteVariant((byte) -67), BoardReconciliationSupport.ticksSinceLastEntityRelease + UsernameResponseSupport.spawnReleaseIntervalTicks * (1 + SecondaryDeque.spawnQueue.countNodes(111)), 0.0f, spawnPositionY, inwardDirectionY * TextTemplateDefinition.entityMotionSpeed, FullscreenErrorDialog.chooseSpawnEntityCategory(methodGuard ^ 131), 0.0f);
              SecondaryDeque.spawnQueue.addLast(-47, queuedEntityThenPooledEntity);
              SpawnQuotaSupport.recordGeneratedEntity(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException spawnQueueFailure) {
          caughtSpawnQueueFailure = spawnQueueFailure;
          spawnQueueFailureForContext = caughtSpawnQueueFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spawnQueueFailureForContext), "lc.E(" + methodGuard + ')');
        }
    }

    final static void setLoadingProgress(String statusText, int methodGuard, float scaledProgress) {
        RuntimeException progressFailureBeforeContext = null;
        StringBuilder progressMessagePrefix = null;
        String statusTextDescription = null;
        RuntimeException caughtProgressFailure = null;
        RuntimeException progressFailureForContext = null;
        try {
          if (methodGuard != -2) {
            HighscoreNameEntry.handleSocialListResponse((byte) -59);
          }
          ByteArrayPoolSupport.loadingStatusText = statusText;
          ArchiveRequest.loadingScaledProgress = scaledProgress;
          return;
        } catch (java.lang.RuntimeException progressFailure) {
          caughtProgressFailure = progressFailure;
          progressFailureForContext = caughtProgressFailure;
          progressFailureBeforeContext = progressFailureForContext;
          progressMessagePrefix = new StringBuilder().append("lc.A(");
          if (statusText == null) {
            statusTextDescription = "null";
          } else {
            statusTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressFailureBeforeContext), ((StringBuilder) (Object) progressMessagePrefix).append(statusTextDescription).append(',').append(methodGuard).append(',').append(scaledProgress).append(')').toString());
        }
    }

    final static void blendScaledDebugOverviewPixels(int sampleXQ16, int destinationHeight, int[] destinationPixels, int sampleXStepQ16, int sampleYStepQ16, int sourceStride, int sampleYQ16, int destinationRowSkip, int destinationIndex, int destinationWidth, byte methodGuard, int[] overviewPixels, int sampleColor) {
        int destinationIndexBeforeIncrement = 0;
        int sampleColorOrRowStartXQ16 = 0;
        RuntimeException blendFailureBeforeArrayDescriptions = null;
        StringBuilder blendMessagePrefix = null;
        String destinationArrayArgumentDescription = null;
        StringBuilder blendMessageBeforeSourceDescription = null;
        String sourceArrayArgumentDescription = null;
        RuntimeException caughtBlendFailure = null;
        int rowStartXQ16 = 0;
        RuntimeException blendFailureForContext = null;
        int debugTintRgb = 0;
        int debugTintRed = 0;
        int debugTintGreenPacked = 0;
        int debugTintBlue = 0;
        int negativeRowCounter = 0;
        int sourceRowOffset = 0;
        int negativeColumnCounter = 0;
        int destinationRgb = 0;
        int doubledDestinationRed = 0;
        int destinationGreen = 0;
        int destinationBlue = 0;
        int weightedDestinationGrayOrTintedRgb = 0;
        int inverseSourceGrayWeight = 0;
        int tintedRed = 0;
        int tintedGreen = 0;
        int tintedBlue = 0;
        int weightedTintRed = 0;
        int weightedTintGreen = 0;
        int weightedTintBlue = 0;
        int modulatedRedThenWeighted = 0;
        int modulatedGreenThenWeighted = 0;
        int modulatedBlueThenWeighted = 0;
        int sourceGrayWeight = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard > -74) {
            unusedGuardScratch = 78;
          }
          rowStartXQ16 = sampleXQ16;
          debugTintRgb = 1122867;
          debugTintRed = (debugTintRgb & 16711680) >>> 16;
          debugTintGreenPacked = debugTintRgb & 65280;
          debugTintBlue = debugTintRgb & 255;
          negativeRowCounter = -destinationHeight;
          L1: while (negativeRowCounter < 0) {
            sourceRowOffset = sourceStride * (sampleYQ16 >> 16);
            if (clientControlFlowGuard != 0) {
              return;
            }
            negativeColumnCounter = -destinationWidth;
            while (negativeColumnCounter < 0) {
              sampleColor = overviewPixels[sourceRowOffset + (sampleXQ16 >> 16)];
              sampleXQ16 = sampleXQ16 + sampleXStepQ16;
              sampleColorOrRowStartXQ16 = sampleColor;
              {
                if (sampleColorOrRowStartXQ16 == 0) {
                  destinationIndex++;
                } else {
                  destinationRgb = destinationPixels[destinationIndex];
                  if (destinationRgb == 0) {
                    destinationIndex++;
                  } else {
                    doubledDestinationRed = 510 & destinationRgb >> 15;
                    destinationGreen = (destinationRgb & 65429) >> 8;
                    destinationBlue = 255 & destinationRgb;
                    weightedDestinationGrayOrTintedRgb = (destinationBlue + doubledDestinationRed) / 3 + destinationGreen >> 1;
                    inverseSourceGrayWeight = -(((255 & sampleColor) + (sampleColor >> 8 & 255) + (sampleColor >> 16 & 255)) / 3) + 256;
                    tintedRed = debugTintRed * (weightedDestinationGrayOrTintedRgb << 16 >>> 16) >>> 8;
                    tintedGreen = (weightedDestinationGrayOrTintedRgb << 8) * debugTintGreenPacked >>> 24;
                    tintedBlue = debugTintBlue * weightedDestinationGrayOrTintedRgb >>> 8;
                    weightedDestinationGrayOrTintedRgb = (tintedGreen << 8) + (tintedRed << 16) + tintedBlue;
                    weightedTintRed = inverseSourceGrayWeight * ((16711680 & weightedDestinationGrayOrTintedRgb) >> 16);
                    weightedTintGreen = (255 & weightedDestinationGrayOrTintedRgb >> 8) * inverseSourceGrayWeight;
                    weightedTintBlue = (weightedDestinationGrayOrTintedRgb & 255) * inverseSourceGrayWeight;
                    modulatedRedThenWeighted = ((16711680 & destinationRgb) >>> 16) * ((sampleColor & 16711680) >>> 16) >>> 8;
                    modulatedGreenThenWeighted = (destinationRgb & 65280) * (sampleColor & 65280) >>> 24;
                    modulatedBlueThenWeighted = (255 & destinationRgb) * (255 & sampleColor) >>> 8;
                    sourceGrayWeight = 256 - inverseSourceGrayWeight;
                    modulatedRedThenWeighted = modulatedRedThenWeighted * sourceGrayWeight;
                    modulatedGreenThenWeighted = modulatedGreenThenWeighted * sourceGrayWeight;
                    modulatedBlueThenWeighted = modulatedBlueThenWeighted * sourceGrayWeight;
                    destinationIndexBeforeIncrement = destinationIndex;
                    destinationIndex++;
                    destinationPixels[destinationIndexBeforeIncrement] = (weightedTintBlue + modulatedBlueThenWeighted >> 8) + ((modulatedGreenThenWeighted + weightedTintGreen >> 8 << 8) + (weightedTintRed + modulatedRedThenWeighted >> 8 << 16));
                  }
                }
              }
              negativeColumnCounter++;
              continue;
            }
            sampleYQ16 = sampleYQ16 + sampleYStepQ16;
            destinationIndex = destinationIndex + destinationRowSkip;
            sampleColorOrRowStartXQ16 = rowStartXQ16;
            sampleXQ16 = sampleColorOrRowStartXQ16;
            negativeRowCounter++;
            continue L1;
          }
          return;
        } catch (java.lang.RuntimeException debugOverviewBlendFailure) {
          caughtBlendFailure = debugOverviewBlendFailure;
          blendFailureForContext = caughtBlendFailure;
          blendFailureBeforeArrayDescriptions = blendFailureForContext;
          blendMessagePrefix = new StringBuilder().append("lc.C(").append(sampleXQ16).append(',').append(destinationHeight).append(',');
          if (destinationPixels == null) {
            destinationArrayArgumentDescription = "null";
          } else {
            destinationArrayArgumentDescription = "{...}";
          }
          blendMessageBeforeSourceDescription = ((StringBuilder) (Object) blendMessagePrefix).append(destinationArrayArgumentDescription).append(',').append(sampleXStepQ16).append(',').append(sampleYStepQ16).append(',').append(sourceStride).append(',').append(sampleYQ16).append(',').append(destinationRowSkip).append(',').append(destinationIndex).append(',').append(destinationWidth).append(',').append(methodGuard).append(',');
          if (overviewPixels == null) {
            sourceArrayArgumentDescription = "null";
          } else {
            sourceArrayArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) blendFailureBeforeArrayDescriptions), ((StringBuilder) (Object) blendMessageBeforeSourceDescription).append(sourceArrayArgumentDescription).append(',').append(sampleColor).append(')').toString());
        }
    }

    final static MonochromeBitmapFont buildMonochromeFontFromDecodedSprites(int methodGuard, byte[] metrics) {
        MonochromeBitmapFont font = null;
        RuntimeException fontFailureForContext = null;
        Object nullFontBeforeReturn = null;
        MonochromeBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeMetricsDescription = null;
        StringBuilder fontMessagePrefix = null;
        String metricsDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (null == metrics) {
            nullFontBeforeReturn = null;
            return (MonochromeBitmapFont) (nullFontBeforeReturn);
          }
          if (methodGuard != 4520) {
            HighscoreNameEntry.blendScaledDebugOverviewPixels(-56, -44, (int[]) null, 118, 4, -55, 25, -98, -82, -78, (byte) -35, (int[]) null, -116);
          }
          font = new MonochromeBitmapFont(metrics, GameplaySession.decodedSpriteXOffsets, GmtTimestampSupport.decodedSpriteYOffsets, DualLinkNode.decodedSpriteWidths, ProgressBarWidget.decodedSpriteHeights, TextConcatenationSupport.decodedSpriteIndices);
          MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
          fontBeforeReturn = font;
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeMetricsDescription = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("lc.B(").append(methodGuard).append(',');
          if (metrics == null) {
            metricsDescription = "null";
          } else {
            metricsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeMetricsDescription), ((StringBuilder) (Object) fontMessagePrefix).append(metricsDescription).append(')').toString());
        }
    }

    final static void handleSocialListResponse(byte methodGuard) {
        int secondaryInsertionIndexBeforeIncrement = 0;
        int primaryInsertionIndexBeforeIncrement = 0;
        int alternateNamePresentSnapshot = 0;
        SocialListEntry entryOrInsertionTargetSnapshot = null;
        RuntimeException caughtResponseFailure = null;
        PacketBuffer packet = null;
        RuntimeException responseFailureForContext = null;
        int operation = 0;
        int alternateNamePresentInt = 0;
        Object locationLabelValue = null;
        String displayName = null;
        int packedSettings = 0;
        SocialListEntry secondaryEntry = null;
        String previousPrimaryName = null;
        String previousSecondaryName = null;
        SocialListEntry primaryEntry = null;
        String normalizedSecondaryName = null;
        SocialListEntry insertionTarget = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 104) {
            unusedGuardScratch = 67;
          }
          packet = LogoCompositor.sessionPacketBuffer;
          operation = packet.readUnsignedByte((byte) 34);
          if (operation == 0) {
            if (ScorePopupSupport.secondarySocialEntriesByNameHash == null) {
              ScorePopupSupport.secondarySocialEntriesByNameHash = new SecondaryNodeHashTable(128);
              FifoResponseToken.nextSecondarySocialInsertionIndex = 0;
            }
            alternateNamePresentSnapshot = (packet.readUnsignedByte((byte) 34) != 1) ? 0 : 1;
            alternateNamePresentInt = alternateNamePresentSnapshot;
            displayName = packet.readNullTerminatedText((byte) 105);
            if (alternateNamePresentInt != 0) {
              packet.readNullTerminatedText((byte) 108);
            }
            secondaryEntry = AchievementProtocolSupport.findSecondarySocialEntry(0, displayName);
            previousSecondaryName = packet.readNullTerminatedText((byte) 103);
            normalizedSecondaryName = ResizableDialog.normalizeSessionName((CharSequence) ((Object) displayName), 12);
            if (null == normalizedSecondaryName) {
              normalizedSecondaryName = displayName;
            }
            if (secondaryEntry == null) {
              secondaryEntry = AchievementProtocolSupport.findSecondarySocialEntry(methodGuard ^ 104, previousSecondaryName);
              if (secondaryEntry != null) {
                ScorePopupSupport.secondarySocialEntriesByNameHash.put((long)normalizedSecondaryName.hashCode(), 113, secondaryEntry);
              }
            }
            if (null == secondaryEntry) {
              secondaryEntry = new SocialListEntry();
              ScorePopupSupport.secondarySocialEntriesByNameHash.put((long)normalizedSecondaryName.hashCode(), 94, secondaryEntry);
              secondaryInsertionIndexBeforeIncrement = FifoResponseToken.nextSecondarySocialInsertionIndex;
              FifoResponseToken.nextSecondarySocialInsertionIndex = FifoResponseToken.nextSecondarySocialInsertionIndex + 1;
              secondaryEntry.insertionIndex = secondaryInsertionIndexBeforeIncrement;
              TextTemplateDefinitionLoader.secondarySocialEntriesInOrder.addLast(methodGuard ^ -86, secondaryEntry);
            }
            secondaryEntry.displayName = displayName;
            return;
          }
          if (operation != 1) {
            if (operation == 2) {
              if (MouseWheelInput.primarySocialListState == 1) {
                MouseWheelInput.primarySocialListState = 2;
              }
              return;
            }
            if (operation == 3) {
              if (MouseWheelInput.primarySocialListState == 2) {
                MouseWheelInput.primarySocialListState = 1;
              }
              return;
            }
            if (operation != 4) {
              IterableNodeHashTable.reportClientError((Throwable) null, "F1: " + TextTemplateDefinition.e(55), (byte) 125);
              Bzip2DecoderState.closeSessionSocket((byte) -119);
              return;
            }
            MouseWheelInput.primarySocialListState = 1;
            locationLabelValue = packet.readNullTerminatedText((byte) 122);
            ReflectionCheckRequest.currentSocialLocationLabel = ((String) (locationLabelValue)).intern();
            packedSettings = packet.readUnsignedByte((byte) 34);
            ValidationMessageWidget.decodeSocialSettingBits(packedSettings, methodGuard ^ -12742);
            return;
          }
          if (ArchiveSource.primarySocialEntriesByNameHash == null) {
            ArchiveSource.primarySocialEntriesByNameHash = new SecondaryNodeHashTable(128);
            HighscoreQuery.nextPrimarySocialInsertionIndex = 0;
          }
          locationLabelValue = packet.readNullTerminatedText((byte) 108);
          if (((String) (locationLabelValue)).equals("")) {
            locationLabelValue = null;
          }
          displayName = packet.readNullTerminatedText((byte) 102);
          previousPrimaryName = packet.readNullTerminatedText((byte) 110);
          primaryEntry = SocketConnector.findSocialEntry((byte) -62, displayName);
          if (null == primaryEntry) {
            primaryEntry = SocketConnector.findSocialEntry((byte) -62, previousPrimaryName);
            if (null != primaryEntry) {
              ArchiveSource.primarySocialEntriesByNameHash.put((long)ResizableDialog.normalizeSessionName((CharSequence) ((Object) displayName), 12).hashCode(), -63, primaryEntry);
            }
          }
          if (null == primaryEntry) {
            primaryEntry = new SocialListEntry();
            ArchiveSource.primarySocialEntriesByNameHash.put((long)ResizableDialog.normalizeSessionName((CharSequence) ((Object) displayName), methodGuard ^ 100).hashCode(), 110, primaryEntry);
            primaryInsertionIndexBeforeIncrement = HighscoreQuery.nextPrimarySocialInsertionIndex;
            HighscoreQuery.nextPrimarySocialInsertionIndex = HighscoreQuery.nextPrimarySocialInsertionIndex + 1;
            primaryEntry.insertionIndex = primaryInsertionIndexBeforeIncrement;
            ProgressBarWidget.primarySocialEntriesInOrder.addLast(-59, primaryEntry);
          }
          if (locationLabelValue != null) {
            locationLabelValue = ((String) (locationLabelValue)).intern();
          }
          primaryEntry.displayName = displayName;
          primaryEntry.locationLabel = (String) (locationLabelValue);
          primaryEntry.unlinkNode(false);
          insertionTarget = (SocialListEntry) ((Object) ProgressBarWidget.primarySocialEntriesInOrder.firstForIteration(0));
          while (true) {
            insertionTargetSelection: {
              if (null != insertionTarget) {
                entryOrInsertionTargetSnapshot = primaryEntry;
                if (clientControlFlowGuard != 0) {
                  break insertionTargetSelection;
                }
                if (MatchCandidateSupport.socialEntrySortsAfter(entryOrInsertionTargetSnapshot, insertionTarget, (byte) 127)) {
                  insertionTarget = (SocialListEntry) ((Object) ProgressBarWidget.primarySocialEntriesInOrder.nextForIteration(1));
                  continue;
                }
              }
              entryOrInsertionTargetSnapshot = insertionTarget;
            }
            break;
          }
          if (entryOrInsertionTargetSnapshot == null) {
            ProgressBarWidget.primarySocialEntriesInOrder.addLast(-39, primaryEntry);
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          PointerInputListener.insertNodeBefore(insertionTarget, 121, primaryEntry);
          return;
        } catch (java.lang.RuntimeException responseFailure) {
          caughtResponseFailure = responseFailure;
          responseFailureForContext = caughtResponseFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) responseFailureForContext), "lc.D(" + methodGuard + ')');
        }
    }

    static {
    }
}
