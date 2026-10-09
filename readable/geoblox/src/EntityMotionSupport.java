/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EntityMotionSupport {
    static TextTemplateArgumentType textTemplateArgumentTypeTwo;
    static boolean boardContactStateDirty;
    static boolean introSecondGeometrySoundPlayed;
    static String createSuggestionsText;
    static int incomingPacketBaseDelayMillis;
    static volatile boolean canvasReplacementRequested;

    final static void decodeLogoAudio(int methodGuard, ResourceArchive logoArchive) {
        MusicDecoder logoAudioDecoder = null;
        RuntimeException decodeFailureBeforeDescription = null;
        StringBuilder decodeMessagePrefix = null;
        String archiveDescription = null;
        RuntimeException caughtDecodeFailure = null;
        RuntimeException decodeFailureForContext = null;
        try {
          MusicDecoder.decodeSetup(logoArchive.getNamedFile(0, "", "headers.packvorbis"));
          logoAudioDecoder = MusicDecoder.loadByName(logoArchive, "jagex logo2.packvorbis", "");
          logoAudioDecoder.decodePcm();
          if (methodGuard < 29) {
            boardContactStateDirty = true;
          }
          return;
        } catch (java.lang.RuntimeException decodeFailure) {
          caughtDecodeFailure = decodeFailure;
          decodeFailureForContext = caughtDecodeFailure;
          decodeFailureBeforeDescription = decodeFailureForContext;
          decodeMessagePrefix = new StringBuilder().append("ab.F(").append(methodGuard).append(',');
          if (logoArchive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailureBeforeDescription), ((StringBuilder) (Object) decodeMessagePrefix).append(archiveDescription).append(')').toString());
        }
    }

    final static String displayNameValidationMessage(boolean allowRepeatedSeparators, int methodGuard, CharSequence candidateName) {
        int characterIndex = 0;
        String nullNameLengthMessageBeforeReturn = null;
        String outOfRangeLengthMessageBeforeReturn = null;
        String normalizedNameLengthMessageBeforeReturn = null;
        String normalizedEdgeSeparatorMessageBeforeReturn = null;
        String repeatedSeparatorMessageBeforeReturn = null;
        String trailingSeparatorMessageBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtValidationFailure = null;
        int candidateLength = 0;
        RuntimeException validationFailureForContext = null;
        String normalizedName = null;
        int consecutiveSeparators = 0;
        int characterCode = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (candidateName == null) {
            nullNameLengthMessageBeforeReturn = NameCharacterSupport.createNameLengthAlertText;
            return nullNameLengthMessageBeforeReturn;
          }
          candidateLength = candidateName.length();
          if (candidateLength >= 1 &&
              candidateLength <= 12) {
            normalizedName = ResizableDialog.normalizeSessionName(candidateName, 12);
            if (methodGuard != 2) {
              EntityMotionSupport.releaseStaticReferences((byte) 112);
            }
            if (normalizedName != null &&
                normalizedName.length() >= 1) {
              if (!NameCharacterSupport.isNameSeparator((byte) -32, normalizedName.charAt(0)) &&
                  !NameCharacterSupport.isNameSeparator((byte) -75, normalizedName.charAt(-1 + normalizedName.length()))) {
                consecutiveSeparators = 0;
                for (characterIndex = 0; characterIndex < candidateName.length(); characterIndex++) {
                  characterCode = candidateName.charAt(characterIndex);
                  if (NameCharacterSupport.isNameSeparator((byte) -96, (char) characterCode)) {
                    consecutiveSeparators++;
                  } else {
                    consecutiveSeparators = 0;
                  }
                  if (2 <= consecutiveSeparators &&
                      !allowRepeatedSeparators) {
                    repeatedSeparatorMessageBeforeReturn = MessageDialogSupport.createDoubleSpaceAlertText;
                    return repeatedSeparatorMessageBeforeReturn;
                  }
                }
                if (consecutiveSeparators <= 0) {
                  return null;
                }
                trailingSeparatorMessageBeforeReturn = GameScreen.createNameLeadingSpaceAlertText;
                return trailingSeparatorMessageBeforeReturn;
              }
              normalizedEdgeSeparatorMessageBeforeReturn = GameScreen.createNameLeadingSpaceAlertText;
              return normalizedEdgeSeparatorMessageBeforeReturn;
            }
            normalizedNameLengthMessageBeforeReturn = NameCharacterSupport.createNameLengthAlertText;
            return normalizedNameLengthMessageBeforeReturn;
          }
          outOfRangeLengthMessageBeforeReturn = NameCharacterSupport.createNameLengthAlertText;
          return outOfRangeLengthMessageBeforeReturn;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("ab.A(").append(allowRepeatedSeparators).append(',').append(methodGuard).append(',');
          if (candidateName == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    final static IndexedSprite buildFirstIndexedSpriteFromDecodedSheet(int methodGuard) {
        IndexedSprite sprite = new IndexedSprite(GameplaySetupSupport.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[0], GmtTimestampSupport.decodedSpriteYOffsets[0], DualLinkNode.decodedSpriteWidths[0], ProgressBarWidget.decodedSpriteHeights[0], TextConcatenationSupport.decodedSpriteIndices[0], NanoFrameTimer.decodedSpritePalette);
        int sentinelDivision = -128 / ((methodGuard - 52) / 49);
        MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
        return sprite;
    }

    final static int hashEncodedText(int methodGuard, CharSequence text) {
        int characterIndex = 0;
        int textLength = 0;
        RuntimeException hashFailureForContext = null;
        int hash = 0;
        CharSequence unusedNullTextSnapshot = null;
        int hashBeforeReturn = 0;
        RuntimeException hashFailureBeforeDescription = null;
        StringBuilder hashMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtHashFailure = null;
        try {
          textLength = text.length();
          hash = 0;
          if (methodGuard <= 42) {
            unusedNullTextSnapshot = (CharSequence) null;
            EntityMotionSupport.hashEncodedText(-120, (CharSequence) null);
          }
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            hash = -hash + (hash << 5) + ByteArrayBuffer.encodeTextCharacter(text.charAt(characterIndex), true);
          }
          hashBeforeReturn = hash;
          return hashBeforeReturn;
        } catch (java.lang.RuntimeException hashFailure) {
          caughtHashFailure = hashFailure;
          hashFailureForContext = caughtHashFailure;
          hashFailureBeforeDescription = hashFailureForContext;
          hashMessagePrefix = new StringBuilder().append("ab.B(").append(methodGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hashFailureBeforeDescription), ((StringBuilder) (Object) hashMessagePrefix).append(textDescription).append(')').toString());
        }
    }

    final static void moveEntitiesAndCollectContacts(int methodGuard, float boardAngleRadians) {
        int wasKind2IntSnapshot = 0;
        int contactedEntityMovesOutwardIntSnapshot = 0;
        int movingEntityMovesOutwardIntSnapshot = 0;
        RuntimeException caughtMotionFailure = null;
        GameplayEntity movingEntity = null;
        RuntimeException motionFailureForContext = null;
        int neighborIndexOrKind2Snapshot = 0;
        float inwardOffsetX = 0.0f;
        GameplayEntity contactedEntity = null;
        float inwardOffsetY = 0.0f;
        float sharedVelocityXOrCrossProduct = 0.0f;
        float sharedVelocityYOrDirectionScale = 0.0f;
        float velocityMagnitudeSquaredThenSpeedScale = 0.0f;
        float contactedCenterOffsetX = 0.0f;
        float contactedCenterOffsetY = 0.0f;
        float contactedNextCenterOffsetXThenSquared = 0.0f;
        float contactedNextCenterOffsetYThenSquared = 0.0f;
        int contactedEntityMovesOutwardInt = 0;
        int movingEntityMovesOutwardInt = 0;
        float midpointInwardSpeedScale = 0.0f;
        int clientControlFlowGuard = 0;
        Object unusedMotionScratch = null;
        GameplayEntity trailEntity = null;
        int unusedMotionGuardRemainder;
        float movingCenterOffsetX;
        float midpointCenterOffsetX;
        float movingCenterOffsetY;
        float midpointCenterOffsetY;
        float movingNextCenterOffsetXThenSquared;
        float movingNextCenterOffsetYThenSquared;
        int contactedEntityId;
        unusedMotionScratch = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          boardContactStateDirty = false;
          AttachmentPointerState.newAttachmentCount = 0;
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
          movingEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.firstForIteration(0));
          while (movingEntity != null) {
            movingEntityContactResolution: {
              if (BoardEntityState.attachedEntities != movingEntity.entityQueue) {
                if (!UiWidget.gameplaySession.tutorialPromptActive) {
                  movingEntity.integrateEntityVelocity((byte) -59);
                  movingEntity.advanceEntityAnimation(true);
                }
                EntityCollisionSupport.renderEntityCollisionSprite(movingEntity, -1232328029, boardAngleRadians);
                if (FullscreenFailureReason.scratchSpriteOverlapsBoard(movingEntity, boardAngleRadians, 0)) {
                  HotspotTextWidget.spriteScratchRaster.addOutline(1);
                  if (movingEntity.matchCooldownTicks <= 0) {
                    ClientFlowToken.playThemeEntitySound(9666, GameScreen.selectedThemeId);
                  }
                  boardContactStateDirty = true;
                  movingEntity.entityQueue = null;
                  for (neighborIndexOrKind2Snapshot = 0; neighborIndexOrKind2Snapshot < movingEntity.relatedEntityCount; neighborIndexOrKind2Snapshot++) {
                    movingEntity.relatedEntities[neighborIndexOrKind2Snapshot].removeRelatedEntity(movingEntity, 0);
                  }
                  movingEntity.relatedEntityCount = 0;
                  wasKind2IntSnapshot = (movingEntity.entitySpriteKindId != 2) ? 0 : 1;
                  neighborIndexOrKind2Snapshot = wasKind2IntSnapshot;
                  EntityContactSupport.linkEntityAtMaskContacts(-1, ValidationIconWidget.rotatedEntityScreenY, movingEntity, DialogLayer.rotatedEntityScreenX);
                  if (neighborIndexOrKind2Snapshot == 0 ||
                      movingEntity.entitySpriteKindId == 2) {
                    if (movingEntity.entitySpriteKindId != 2) {
                      movingEntity.spriteAngleRadians = movingEntity.spriteAngleRadians - boardAngleRadians;
                    }
                    movingEntity.positionY = (float)ValidationIconWidget.rotatedEntityScreenY;
                    movingEntity.entityQueue = BoardEntityState.attachedEntities;
                    movingEntity.positionX = (float)DialogLayer.rotatedEntityScreenX;
                  }
                  if (!movingEntity.detachedFromBoard) {
                    AttachmentPointerState.newAttachmentCount = AttachmentPointerState.newAttachmentCount + 1;
                    break movingEntityContactResolution;
                  }
                  movingEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.nextForIteration(1));
                  continue;
                }
                if (DelayedIncomingPacket.contactProbeOverlapsScratchSprite(true, boardAngleRadians, movingEntity)) {
                  contactedEntityId = SecondaryDeque.contactProbeRaster.pixels[PixelOverlapProbe.firstOverlapX + SecondaryDeque.contactProbeRaster.fullWidth * PixelOverlapProbe.firstOverlapY] - 1;
                  contactedEntity = RasterTargetSnapshot.entitiesById[contactedEntityId];
                  if (BoardEntityState.attachedEntities == contactedEntity.entityQueue) {
                    break movingEntityContactResolution;
                  }
                  sharedVelocityXOrCrossProduct = 0.5f * (contactedEntity.velocityX + movingEntity.velocityX);
                  sharedVelocityYOrDirectionScale = (contactedEntity.velocityY + movingEntity.velocityY) * 0.5f;
                  velocityMagnitudeSquaredThenSpeedScale = sharedVelocityYOrDirectionScale * sharedVelocityYOrDirectionScale + sharedVelocityXOrCrossProduct * sharedVelocityXOrCrossProduct;
                  velocityMagnitudeSquaredThenSpeedScale = TextTemplateDefinition.entityMotionSpeed / (float)Math.sqrt((double)velocityMagnitudeSquaredThenSpeedScale);
                  sharedVelocityYOrDirectionScale = sharedVelocityYOrDirectionScale * velocityMagnitudeSquaredThenSpeedScale;
                  sharedVelocityXOrCrossProduct = sharedVelocityXOrCrossProduct * velocityMagnitudeSquaredThenSpeedScale;
                  contactedCenterOffsetX = -contactedEntity.positionX + 320.0f;
                  contactedCenterOffsetY = 240.0f - contactedEntity.positionY;
                  contactedNextCenterOffsetXThenSquared = -sharedVelocityXOrCrossProduct - contactedEntity.positionX + 320.0f;
                  contactedNextCenterOffsetYThenSquared = 240.0f - (contactedEntity.positionY + sharedVelocityYOrDirectionScale);
                  contactedNextCenterOffsetXThenSquared = contactedNextCenterOffsetXThenSquared * contactedNextCenterOffsetXThenSquared;
                  contactedNextCenterOffsetYThenSquared = contactedNextCenterOffsetYThenSquared * contactedNextCenterOffsetYThenSquared;
                  contactedEntityMovesOutwardIntSnapshot = (!(contactedNextCenterOffsetXThenSquared + contactedNextCenterOffsetYThenSquared > contactedCenterOffsetY * contactedCenterOffsetY + contactedCenterOffsetX * contactedCenterOffsetX)) ? 0 : 1;
                  contactedEntityMovesOutwardInt = contactedEntityMovesOutwardIntSnapshot;
                  movingCenterOffsetX = 320.0f - movingEntity.positionX;
                  movingNextCenterOffsetYThenSquared = 240.0f - (sharedVelocityYOrDirectionScale + movingEntity.positionY);
                  movingNextCenterOffsetXThenSquared = -movingEntity.positionX - sharedVelocityXOrCrossProduct + 320.0f;
                  movingCenterOffsetY = -movingEntity.positionY + 240.0f;
                  movingNextCenterOffsetXThenSquared = movingNextCenterOffsetXThenSquared * movingNextCenterOffsetXThenSquared;
                  movingNextCenterOffsetYThenSquared = movingNextCenterOffsetYThenSquared * movingNextCenterOffsetYThenSquared;
                  movingEntityMovesOutwardIntSnapshot = (!(movingCenterOffsetY * movingCenterOffsetY + movingCenterOffsetX * movingCenterOffsetX < movingNextCenterOffsetYThenSquared + movingNextCenterOffsetXThenSquared)) ? 0 : 1;
                  movingEntityMovesOutwardInt = movingEntityMovesOutwardIntSnapshot;
                  if (contactedEntityMovesOutwardInt != 0 &&
                      movingEntityMovesOutwardInt != 0) {
                    midpointCenterOffsetX = -((movingEntity.positionX + contactedEntity.positionX) * 0.5f) + 320.0f;
                    midpointCenterOffsetY = 240.0f - 0.5f * (contactedEntity.positionY + movingEntity.positionY);
                    midpointInwardSpeedScale = TextTemplateDefinition.entityMotionSpeed / (float)Math.sqrt((double)(midpointCenterOffsetX * midpointCenterOffsetX + midpointCenterOffsetY * midpointCenterOffsetY));
                    sharedVelocityXOrCrossProduct = midpointCenterOffsetX * midpointInwardSpeedScale;
                    sharedVelocityYOrDirectionScale = midpointInwardSpeedScale * midpointCenterOffsetY;
                  }
                  movingEntity.velocityY = movingEntity.velocityY * -1.0f;
                  movingEntity.velocityX = movingEntity.velocityX * -1.0f;
                  movingEntity.integrateEntityVelocity((byte) -59);
                  contactedEntity.velocityX = sharedVelocityXOrCrossProduct;
                  movingEntity.velocityX = sharedVelocityXOrCrossProduct;
                  contactedEntity.velocityY = sharedVelocityYOrDirectionScale;
                  movingEntity.velocityY = sharedVelocityYOrDirectionScale;
                } else {
                  inwardOffsetX = 320.0f - movingEntity.positionX;
                  inwardOffsetY = 240.0f - movingEntity.positionY;
                  sharedVelocityXOrCrossProduct = -(inwardOffsetY * movingEntity.positionX) + movingEntity.positionY * inwardOffsetX;
                  if (movingEntity.relatedEntityCount == 0 &&
                      sharedVelocityXOrCrossProduct * sharedVelocityXOrCrossProduct > 0.30000001192092896f) {
                    movingEntity.velocityX = inwardOffsetX;
                    movingEntity.velocityY = inwardOffsetY;
                    sharedVelocityYOrDirectionScale = TextTemplateDefinition.entityMotionSpeed / (float)Math.sqrt((double)(movingEntity.velocityX * movingEntity.velocityX + movingEntity.velocityY * movingEntity.velocityY));
                    movingEntity.velocityX = movingEntity.velocityX * sharedVelocityYOrDirectionScale;
                    movingEntity.velocityY = movingEntity.velocityY * sharedVelocityYOrDirectionScale;
                  }
                }
                movingEntity.drawEntityIdOnPointerMask((byte) 51);
              }
            }
            movingEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.nextForIteration(1));
          }
          unusedMotionGuardRemainder = -125 % ((methodGuard - 35) / 49);
          trailEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.firstForIteration(0));
          while (trailEntity != null) {
            trailEntity.eraseEntityTrail(30383);
            trailEntity = (GameplayEntity) (ArchiveNetworkClient.movingEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException motionFailure) {
          caughtMotionFailure = motionFailure;
          motionFailureForContext = caughtMotionFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) motionFailureForContext), "ab.C(" + methodGuard + ',' + boardAngleRadians + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        int guardRemainder = -58 % ((methodGuard - 0) / 38);
        createSuggestionsText = null;
        textTemplateArgumentTypeTwo = null;
    }

    static {
        textTemplateArgumentTypeTwo = new TextTemplateArgumentType(2, 4, 4, 0);
        createSuggestionsText = "Suggested names: ";
        canvasReplacementRequested = false;
        incomingPacketBaseDelayMillis = 0;
    }
}
