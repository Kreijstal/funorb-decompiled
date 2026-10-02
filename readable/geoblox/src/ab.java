/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static ck field_c;
    static boolean boardContactStateDirty;
    static boolean field_d;
    static String createSuggestionsText;
    static int field_b;
    static volatile boolean field_a;

    final static void a(int param0, rh param1) {
        MusicDecoder var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          MusicDecoder.a(param1.a(0, "", "headers.packvorbis"));
          var2 = MusicDecoder.a(param1, "jagex logo2.packvorbis", "");
          var2.decodePcm();
          if (param0 < 29) {
            boardContactStateDirty = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (var2_ref);
          stackIn_5_1 = new StringBuilder().append("ab.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          if (param2 == null) {
            stackIn_4_0 = gg.createNameLengthAlertText;
            return stackIn_4_0;
          }
          {
            var3_int = param2.length();
            if (var3_int >= 1) {
              if (var3_int <= 12) {
                var4 = oe.a(param2, 12);
                if (param1 != 2) {
                  ab.a((byte) 112);
                }
                if (var4 != null) {
                  if (var4.length() >= 1) {
                    if (!gg.a((byte) -32, var4.charAt(0))) {
                      if (!gg.a((byte) -75, var4.charAt(-1 + var4.length()))) {
                        var5 = 0;
                        for (var6 = 0; var6 < param2.length(); var6++) {
                          var7 = param2.charAt(var6);
                          if (gg.a((byte) -96, (char) var7)) {
                            var5++;
                          } else {
                            var5 = 0;
                          }
                          if (2 <= var5) {
                            if (!param0) {
                              stackIn_31_0 = fa.createDoubleSpaceAlertText;
                              return stackIn_31_0;
                            }
                          }
                        }
                        if (var5 <= 0) {
                          return null;
                        }
                        stackIn_36_0 = GameScreen.createNameLeadingSpaceAlertText;
                        return stackIn_36_0;
                      }
                    }
                    stackIn_21_0 = GameScreen.createNameLeadingSpaceAlertText;
                    return stackIn_21_0;
                  }
                }
                stackIn_16_0 = gg.createNameLengthAlertText;
                return stackIn_16_0;
              }
            }
            stackIn_9_0 = gg.createNameLengthAlertText;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = (RuntimeException) (var3);
          stackIn_39_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static IndexedSprite buildFirstIndexedSpriteFromDecodedSheet(int methodGuard) {
        IndexedSprite sprite = new IndexedSprite(pg.decodedSpriteCanvasWidth, dd.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[0], md.decodedSpriteYOffsets[0], DualLinkNode.decodedSpriteWidths[0], hl.decodedSpriteHeights[0], mj.decodedSpriteIndices[0], cm.decodedSpritePalette);
        int sentinelDivision = -128 / ((methodGuard - 52) / 49);
        kj.clearDecodedSpriteWorkingArrays(true);
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
            ab.hashEncodedText(-120, (CharSequence) null);
          }
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            hash = -hash + (hash << 5) + ByteArrayBuffer.encodeTextCharacter(text.charAt(characterIndex), true);
          }
          hashBeforeReturn = hash;
          return hashBeforeReturn;
        } catch (java.lang.RuntimeException hashFailure) {
          caughtHashFailure = hashFailure;
          hashFailureForContext = caughtHashFailure;
          hashFailureBeforeDescription = (RuntimeException) (hashFailureForContext);
          hashMessagePrefix = new StringBuilder().append("ab.B(").append(methodGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) hashFailureBeforeDescription), ((StringBuilder) (Object) hashMessagePrefix).append(textDescription).append(')').toString());
        }
    }

    final static void moveEntitiesAndCollectContacts(int methodGuard, float boardAngleRadians) {
        int wasKind2IntSnapshot = 0;
        int contactedEntityMovesOutwardIntSnapshot = 0;
        int movingEntityMovesOutwardIntSnapshot = 0;
        RuntimeException caughtMotionFailure = null;
        GameplayEntity movingEntity = null;
        RuntimeException motionFailureForContext = null;
        int neighborIndexOrKindFlagOrContactIdOrDivisionGuard = 0;
        float inwardOffsetX = 0.0f;
        GameplayEntity contactedEntity = null;
        float inwardOffsetY = 0.0f;
        float sharedVelocityXOrCrossProduct = 0.0f;
        float sharedVelocityYOrDirectionScale = 0.0f;
        float velocityMagnitudeSquaredThenSpeedScale = 0.0f;
        float centerOffsetX = 0.0f;
        float centerOffsetY = 0.0f;
        float nextCenterOffsetXThenSquared = 0.0f;
        float nextCenterOffsetYThenSquared = 0.0f;
        int contactedEntityMovesOutwardInt = 0;
        int movingEntityMovesOutwardInt = 0;
        float midpointInwardSpeedScale = 0.0f;
        int clientControlFlowGuard = 0;
        Object unusedMotionScratch = null;
        GameplayEntity trailEntity = null;
        unusedMotionScratch = null;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          boardContactStateDirty = false;
          wb.newAttachmentCount = 0;
          sh.mainRasterBuffer.setAsRasterTarget(255);
          movingEntity = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
          L0: while (movingEntity != null) {
            L2: {
              if (a.attachedEntities != movingEntity.entityQueue) {
                if (!el.gameplaySession.tutorialPromptActive) {
                  movingEntity.integrateEntityVelocity((byte) -59);
                  movingEntity.advanceEntityAnimation(true);
                }
                gf.renderEntityCollisionSprite(movingEntity, -1232328029, boardAngleRadians);
                if (uj.scratchSpriteOverlapsBoard(movingEntity, boardAngleRadians, 0)) {
                  vf.spriteScratchRaster.addOutline(1);
                  if (movingEntity.matchCooldownTicks <= 0) {
                    al.a(9666, GameScreen.selectedThemeId);
                  }
                  boardContactStateDirty = true;
                  movingEntity.entityQueue = null;
                  for (neighborIndexOrKindFlagOrContactIdOrDivisionGuard = 0; neighborIndexOrKindFlagOrContactIdOrDivisionGuard < movingEntity.relatedEntityCount; neighborIndexOrKindFlagOrContactIdOrDivisionGuard++) {
                    movingEntity.relatedEntities[neighborIndexOrKindFlagOrContactIdOrDivisionGuard].removeRelatedEntity(movingEntity, 0);
                  }
                  movingEntity.relatedEntityCount = 0;
                  wasKind2IntSnapshot = (movingEntity.entitySpriteKindId != 2) ? 0 : 1;
                  L11: {
                    neighborIndexOrKindFlagOrContactIdOrDivisionGuard = wasKind2IntSnapshot;
                    ih.linkEntityAtMaskContacts(-1, td.rotatedEntityScreenY, movingEntity, ng.rotatedEntityScreenX);
                    if (neighborIndexOrKindFlagOrContactIdOrDivisionGuard != 0) {
                      if (movingEntity.entitySpriteKindId != 2) {
                        break L11;
                      }
                    }
                    if (movingEntity.entitySpriteKindId != 2) {
                      movingEntity.spriteAngleRadians = movingEntity.spriteAngleRadians - boardAngleRadians;
                    }
                    movingEntity.positionY = (float)td.rotatedEntityScreenY;
                    movingEntity.entityQueue = a.attachedEntities;
                    movingEntity.positionX = (float)ng.rotatedEntityScreenX;
                  }
                  if (!movingEntity.detachedFromBoard) {
                    wb.newAttachmentCount = wb.newAttachmentCount + 1;
                    break L2;
                  }
                  movingEntity = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
                  continue L0;
                }
                if (ma.contactProbeOverlapsScratchSprite(true, boardAngleRadians, movingEntity)) {
                  neighborIndexOrKindFlagOrContactIdOrDivisionGuard = SecondaryDeque.contactProbeRaster.pixels[PixelOverlapProbe.firstOverlapX + SecondaryDeque.contactProbeRaster.fullWidth * PixelOverlapProbe.firstOverlapY] - 1;
                  contactedEntity = tl.entitiesById[neighborIndexOrKindFlagOrContactIdOrDivisionGuard];
                  if (a.attachedEntities == contactedEntity.entityQueue) {
                    break L2;
                  }
                  {
                    sharedVelocityXOrCrossProduct = 0.5f * (contactedEntity.velocityX + movingEntity.velocityX);
                    sharedVelocityYOrDirectionScale = (contactedEntity.velocityY + movingEntity.velocityY) * 0.5f;
                    velocityMagnitudeSquaredThenSpeedScale = sharedVelocityYOrDirectionScale * sharedVelocityYOrDirectionScale + sharedVelocityXOrCrossProduct * sharedVelocityXOrCrossProduct;
                    velocityMagnitudeSquaredThenSpeedScale = og.entityMotionSpeed / (float)Math.sqrt((double)velocityMagnitudeSquaredThenSpeedScale);
                    sharedVelocityYOrDirectionScale = sharedVelocityYOrDirectionScale * velocityMagnitudeSquaredThenSpeedScale;
                    sharedVelocityXOrCrossProduct = sharedVelocityXOrCrossProduct * velocityMagnitudeSquaredThenSpeedScale;
                    centerOffsetX = -contactedEntity.positionX + 320.0f;
                    centerOffsetY = 240.0f - contactedEntity.positionY;
                    nextCenterOffsetXThenSquared = -sharedVelocityXOrCrossProduct - contactedEntity.positionX + 320.0f;
                    nextCenterOffsetYThenSquared = 240.0f - (contactedEntity.positionY + sharedVelocityYOrDirectionScale);
                    nextCenterOffsetXThenSquared = nextCenterOffsetXThenSquared * nextCenterOffsetXThenSquared;
                    nextCenterOffsetYThenSquared = nextCenterOffsetYThenSquared * nextCenterOffsetYThenSquared;
                    contactedEntityMovesOutwardIntSnapshot = (!(nextCenterOffsetXThenSquared + nextCenterOffsetYThenSquared > centerOffsetY * centerOffsetY + centerOffsetX * centerOffsetX)) ? 0 : 1;
                    contactedEntityMovesOutwardInt = contactedEntityMovesOutwardIntSnapshot;
                    centerOffsetX = 320.0f - movingEntity.positionX;
                    nextCenterOffsetYThenSquared = 240.0f - (sharedVelocityYOrDirectionScale + movingEntity.positionY);
                    nextCenterOffsetXThenSquared = -movingEntity.positionX - sharedVelocityXOrCrossProduct + 320.0f;
                    centerOffsetY = -movingEntity.positionY + 240.0f;
                    nextCenterOffsetXThenSquared = nextCenterOffsetXThenSquared * nextCenterOffsetXThenSquared;
                    nextCenterOffsetYThenSquared = nextCenterOffsetYThenSquared * nextCenterOffsetYThenSquared;
                    movingEntityMovesOutwardIntSnapshot = (!(centerOffsetY * centerOffsetY + centerOffsetX * centerOffsetX < nextCenterOffsetYThenSquared + nextCenterOffsetXThenSquared)) ? 0 : 1;
                    movingEntityMovesOutwardInt = movingEntityMovesOutwardIntSnapshot;
                    if (contactedEntityMovesOutwardInt != 0) {
                      if (movingEntityMovesOutwardInt != 0) {
                        centerOffsetX = -((movingEntity.positionX + contactedEntity.positionX) * 0.5f) + 320.0f;
                        centerOffsetY = 240.0f - 0.5f * (contactedEntity.positionY + movingEntity.positionY);
                        midpointInwardSpeedScale = og.entityMotionSpeed / (float)Math.sqrt((double)(centerOffsetX * centerOffsetX + centerOffsetY * centerOffsetY));
                        sharedVelocityXOrCrossProduct = centerOffsetX * midpointInwardSpeedScale;
                        sharedVelocityYOrDirectionScale = midpointInwardSpeedScale * centerOffsetY;
                      }
                    }
                    movingEntity.velocityY = movingEntity.velocityY * -1.0f;
                    movingEntity.velocityX = movingEntity.velocityX * -1.0f;
                    movingEntity.integrateEntityVelocity((byte) -59);
                    contactedEntity.velocityX = sharedVelocityXOrCrossProduct;
                    movingEntity.velocityX = sharedVelocityXOrCrossProduct;
                    contactedEntity.velocityY = sharedVelocityYOrDirectionScale;
                    movingEntity.velocityY = sharedVelocityYOrDirectionScale;
                  }
                } else {
                  inwardOffsetX = 320.0f - movingEntity.positionX;
                  inwardOffsetY = 240.0f - movingEntity.positionY;
                  sharedVelocityXOrCrossProduct = -(inwardOffsetY * movingEntity.positionX) + movingEntity.positionY * inwardOffsetX;
                  if (movingEntity.relatedEntityCount == 0) {
                    if (sharedVelocityXOrCrossProduct * sharedVelocityXOrCrossProduct > 0.30000001192092896f) {
                      movingEntity.velocityX = inwardOffsetX;
                      movingEntity.velocityY = inwardOffsetY;
                      sharedVelocityYOrDirectionScale = og.entityMotionSpeed / (float)Math.sqrt((double)(movingEntity.velocityX * movingEntity.velocityX + movingEntity.velocityY * movingEntity.velocityY));
                      movingEntity.velocityX = movingEntity.velocityX * sharedVelocityYOrDirectionScale;
                      movingEntity.velocityY = movingEntity.velocityY * sharedVelocityYOrDirectionScale;
                    }
                  }
                }
                movingEntity.drawEntityIdOnPointerMask((byte) 51);
              }
            }
            movingEntity = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
          }
          neighborIndexOrKindFlagOrContactIdOrDivisionGuard = -125 % ((methodGuard - 35) / 49);
          trailEntity = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
          L1: while (trailEntity != null) {
            trailEntity.eraseEntityTrail(30383);
            trailEntity = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException motionFailure) {
          caughtMotionFailure = motionFailure;
          motionFailureForContext = caughtMotionFailure;
          throw t.a((Throwable) ((Object) motionFailureForContext), "ab.C(" + methodGuard + ',' + boardAngleRadians + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -58 % ((param0 - 0) / 38);
        createSuggestionsText = null;
        field_c = null;
    }

    static {
        field_c = new ck(2, 4, 4, 0);
        createSuggestionsText = "Suggested names: ";
        field_a = false;
        field_b = 0;
    }
}
