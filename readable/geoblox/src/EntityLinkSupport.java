/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EntityLinkSupport {
    static int sessionAccessLevelByte;
    static String waitingForFontsText;

    final static void writeRankedListQuery(RankedListQuery query, int packetOpcode, byte methodGuard) {
        PacketBuffer outputPacket = CacheReference.outgoingSessionBuffer;
        outputPacket.writeCipherByte(packetOpcode, (byte) -77);
        outputPacket.writeByte((byte) 123, query.queryId);
        if (methodGuard < 80) {
            return;
        }
        try {
            outputPacket.writeByte((byte) -49, query.entryLimit);
        } catch (RuntimeException rankedQueryWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rankedQueryWriteFailure), "ik.C(" + (query != null ? "{...}" : "null") + ',' + packetOpcode + ',' + methodGuard + ')');
        }
    }

    final static void drawGradientWidgetBorder(int leftX, int height, int topY, int width, int methodGuard) {
        RuntimeException caughtBorderFailure = null;
        int firstInteriorRow = 0;
        RuntimeException borderFailureForContext = null;
        int interiorRowLimit = 0;
        int interiorRow = 0;
        int grayChannel = 0;
        int grayRgb = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          SoftwareRasterizer.drawHorizontalLine(leftX, topY, width + 1, 10000536);
          SoftwareRasterizer.drawHorizontalLine(leftX, topY + height, width + 1, 12105912);
          firstInteriorRow = 1;
          if (SoftwareRasterizer.clipTop > topY + firstInteriorRow) {
            firstInteriorRow = -topY + SoftwareRasterizer.clipTop;
          }
          interiorRowLimit = height;
          if (SoftwareRasterizer.clipBottom < interiorRowLimit + topY) {
            interiorRowLimit = -topY + SoftwareRasterizer.clipBottom;
          }
          interiorRow = firstInteriorRow;
          if (methodGuard != -1540604944) {
            waitingForFontsText = (String) null;
          }
          while (interiorRow < interiorRowLimit) {
            grayChannel = 152 + 48 * interiorRow / height;
            grayRgb = grayChannel << 8 | grayChannel << 16 | grayChannel;
            SoftwareRasterizer.framebuffer[leftX + SoftwareRasterizer.stride * (interiorRow + topY)] = grayRgb;
            SoftwareRasterizer.framebuffer[width + (topY + interiorRow) * SoftwareRasterizer.stride + leftX] = grayRgb;
            interiorRow++;
          }
          return;
        } catch (java.lang.RuntimeException borderFailure) {
          caughtBorderFailure = borderFailure;
          borderFailureForContext = caughtBorderFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) borderFailureForContext), "ik.B(" + leftX + ',' + height + ',' + topY + ',' + width + ',' + methodGuard + ')');
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 48) {
            sessionAccessLevelByte = -51;
        }
        waitingForFontsText = null;
    }

    final static boolean linkTouchingEntities(GameplayEntity firstEntity, GameplayEntity secondEntity, boolean forceDetachSecond) {
        int secondNeighborInsertionIndex = 0;
        int firstNeighborInsertionIndex = 0;
        int secondIsKindOne = 0;
        int firstIsKindOne = 0;
        int secondDetachmentReturnValue = 0;
        RuntimeException linkFailureCause = null;
        StringBuilder linkFailurePrefix = null;
        String firstEntityArgumentDescription = null;
        StringBuilder linkFailureBeforeSecondDescription = null;
        String secondEntityArgumentDescription = null;
        RuntimeException caughtLinkFailure = null;
        int neighborIndexThenDetachSecond = 0;
        RuntimeException linkFailureForContext = null;
        int detachFirst = 0;
        int variantPropagationThenNeighborIndex = 0;
        GameplayEntity firstEntityForNeighborCountReset = null;
        int propagateCategory = 0;
        GameplayEntity firstEntityForVariantCountReset = null;
        int unusedClientControlSnapshot = 0;
        GameplayEntity secondEntityForNeighborCountReset;
        GameplayEntity secondEntityForVariantCountReset;
        int detachSecondDecision;
        int secondEntityNeighborIndex;
        int firstEntityNeighborIndex;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          for (neighborIndexThenDetachSecond = 0; neighborIndexThenDetachSecond < secondEntity.relatedEntityCount; neighborIndexThenDetachSecond++) {
            if (secondEntity.relatedEntities[neighborIndexThenDetachSecond] == firstEntity) {
              return false;
            }
          }
          detachSecondDecision = forceDetachSecond ? 1 : 0;
          detachFirst = 0;
          secondNeighborInsertionIndex = secondEntity.relatedEntityCount;
          secondEntity.relatedEntityCount = secondEntity.relatedEntityCount + 1;
          secondEntity.relatedEntities[secondNeighborInsertionIndex] = firstEntity;
          firstNeighborInsertionIndex = firstEntity.relatedEntityCount;
          firstEntity.relatedEntityCount = firstEntity.relatedEntityCount + 1;
          firstEntity.relatedEntities[firstNeighborInsertionIndex] = secondEntity;
          if (secondEntity.entitySpriteKindId != 0 ||
              firstEntity.entitySpriteKindId != 0) {
            variantPropagationThenNeighborIndex = 0;
            propagateCategory = 0;
            secondIsKindOne = (secondEntity.entitySpriteKindId != 1) ? 0 : 1;
            if (firstEntity.entitySpriteKindId != 1) {
              firstIsKindOne = 0;
            } else {
              firstIsKindOne = 1;
            }
            if ((secondIsKindOne ^ firstIsKindOne) != 0) {
              if (secondEntity.entitySpriteKindId == 1 &&
                  firstEntity.entitySpriteKindId == 0) {
                secondEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, 0);
              } else {
                if (secondEntity.entitySpriteKindId == 0 &&
                    firstEntity.entitySpriteKindId == 1) {
                  variantPropagationThenNeighborIndex = 1;
                } else {
                  if (firstEntity.entitySpriteKindId == 2 &&
                      secondEntity.entitySpriteKindId == 1) {
                    detachSecondDecision = 1;
                    detachFirst = 1;
                    propagateCategory = 1;
                    secondEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, 0);
                  } else {
                    if (1 == firstEntity.entitySpriteKindId &&
                        secondEntity.entitySpriteKindId == 2) {
                      secondEntity.configureEntitySprite(320, firstEntity.entityCategoryKey, secondEntity.spriteVariantIndex, 0);
                      variantPropagationThenNeighborIndex = 1;
                      detachSecondDecision = 1;
                    }
                  }
                }
              }
            } else {
              if (2 == secondEntity.entitySpriteKindId ||
                  firstEntity.entitySpriteKindId == 2) {
                if (secondEntity.entitySpriteKindId == 2 &&
                    2 != firstEntity.entitySpriteKindId) {
                  secondEntity.configureEntitySprite(320, firstEntity.entityCategoryKey, secondEntity.spriteVariantIndex, firstEntity.entitySpriteKindId);
                  detachSecondDecision = 1;
                } else {
                  if (firstEntity.entitySpriteKindId == 2 &&
                      2 != secondEntity.entitySpriteKindId) {
                    detachFirst = 1;
                    propagateCategory = 1;
                    detachSecondDecision = 1;
                    firstEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, secondEntity.entitySpriteKindId);
                  }
                }
              }
            }
            if (variantPropagationThenNeighborIndex != 0 ||
                  propagateCategory != 0) {
              DelegatingCanvas.propagateContactConversion(propagateCategory != 0, secondEntity, 1, firstEntity, variantPropagationThenNeighborIndex != 0);
            }
            if (secondEntity.entitySpriteKindId == 1 &&
                firstEntity.entitySpriteKindId == 1 &&
                firstEntity.entityCategoryKey == secondEntity.entityCategoryKey) {
              secondEntity.sameCategoryEntityCount = secondEntity.sameCategoryEntityCount + 1;
              firstEntity.sameCategoryEntityCount = firstEntity.sameCategoryEntityCount + 1;
            } else {
              if (secondEntity.entitySpriteKindId == 2 &&
                  firstEntity.entitySpriteKindId == 2 &&
                  firstEntity.spriteVariantIndex == secondEntity.spriteVariantIndex) {
                secondEntity.sameVariantEntityCount = secondEntity.sameVariantEntityCount + 1;
                firstEntity.sameVariantEntityCount = firstEntity.sameVariantEntityCount + 1;
              }
            }
          }
          if (secondEntity.entitySpriteKindId == 0 &&
              firstEntity.entitySpriteKindId == 0) {
            if (secondEntity.entityCategoryKey == firstEntity.entityCategoryKey) {
              secondEntity.sameCategoryEntityCount = secondEntity.sameCategoryEntityCount + 1;
              firstEntity.sameCategoryEntityCount = firstEntity.sameCategoryEntityCount + 1;
            }
            if (firstEntity.spriteVariantIndex == secondEntity.spriteVariantIndex) {
              secondEntity.sameVariantEntityCount = secondEntity.sameVariantEntityCount + 1;
              firstEntity.sameVariantEntityCount = firstEntity.sameVariantEntityCount + 1;
            }
          }
          if (detachSecondDecision != 0) {
            for (secondEntityNeighborIndex = 0; secondEntity.relatedEntityCount > secondEntityNeighborIndex; secondEntityNeighborIndex++) {
              secondEntity.relatedEntities[secondEntityNeighborIndex].removeRelatedEntity(secondEntity, 0);
            }
            firstEntityForNeighborCountReset = secondEntity;
            secondEntity.sameCategoryEntityCount = 0;
            firstEntityForVariantCountReset = secondEntity;
            firstEntityForVariantCountReset.sameVariantEntityCount = 0;
            firstEntityForNeighborCountReset.relatedEntityCount = 0;
            secondEntity.entityQueue = ArchiveNetworkClient.movingEntities;
            secondEntity.detachedFromBoard = true;
          }
          if (detachFirst != 0) {
            for (firstEntityNeighborIndex = 0; firstEntity.relatedEntityCount > firstEntityNeighborIndex; firstEntityNeighborIndex++) {
              firstEntity.relatedEntities[firstEntityNeighborIndex].removeRelatedEntity(firstEntity, 0);
            }
            secondEntityForNeighborCountReset = firstEntity;
            firstEntity.sameCategoryEntityCount = 0;
            secondEntityForVariantCountReset = firstEntity;
            secondEntityForNeighborCountReset.relatedEntityCount = 0;
            firstEntity.touchesAvatar = false;
            firstEntity.detachedFromBoard = true;
            firstEntity.entityQueue = ArchiveNetworkClient.movingEntities;
            secondEntityForVariantCountReset.sameVariantEntityCount = 0;
          }
          secondDetachmentReturnValue = detachSecondDecision;
          return secondDetachmentReturnValue != 0;
        } catch (java.lang.RuntimeException linkFailure) {
          caughtLinkFailure = linkFailure;
          linkFailureForContext = caughtLinkFailure;
          linkFailureCause = linkFailureForContext;
          linkFailurePrefix = new StringBuilder().append("ik.D(");
          if (firstEntity == null) {
            firstEntityArgumentDescription = "null";
          } else {
            firstEntityArgumentDescription = "{...}";
          }
          linkFailureBeforeSecondDescription = ((StringBuilder) (Object) linkFailurePrefix).append(firstEntityArgumentDescription).append(',');
          if (secondEntity == null) {
            secondEntityArgumentDescription = "null";
          } else {
            secondEntityArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) linkFailureCause), ((StringBuilder) (Object) linkFailureBeforeSecondDescription).append(secondEntityArgumentDescription).append(',').append(forceDetachSecond).append(')').toString());
        }
    }

    static {
        waitingForFontsText = "Waiting for fonts";
    }
}
