/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_a;
    static String waitingForFontsText;

    final static void writeRankedListQuery(RankedListQuery query, int packetOpcode, byte methodGuard) {
        PacketBuffer var3 = CacheReference.field_q;
        var3.writeCipherByte(packetOpcode, (byte) -77);
        var3.writeByte((byte) 123, query.queryId);
        if (methodGuard < 80) {
            return;
        }
        try {
            var3.writeByte((byte) -49, query.entryLimit);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ik.C(" + (query != null ? "{...}" : "null") + ',' + packetOpcode + ',' + methodGuard + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.clientControlFlowFlag;
        try {
          SoftwareRasterizer.drawHorizontalLine(param0, param2, param3 + 1, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param0, param2 + param1, param3 + 1, 12105912);
          var5_int = 1;
          if (SoftwareRasterizer.clipTop > param2 + var5_int) {
            var5_int = -param2 + SoftwareRasterizer.clipTop;
          }
          var6 = param1;
          if (SoftwareRasterizer.clipBottom < var6 + param2) {
            var6 = -param2 + SoftwareRasterizer.clipBottom;
          }
          var7 = var5_int;
          if (param4 != -1540604944) {
            waitingForFontsText = (String) null;
          }
          while (var7 < var6) {
            var8 = 152 + 48 * var7 / param1;
            var9 = var8 << 8 | var8 << 16 | var8;
            SoftwareRasterizer.framebuffer[param0 + SoftwareRasterizer.stride * (var7 + param2)] = var9;
            SoftwareRasterizer.framebuffer[param3 + (param2 + var7) * SoftwareRasterizer.stride + param0] = var9;
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var5), "ik.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 48) {
            field_a = -51;
        }
        waitingForFontsText = null;
    }

    final static boolean linkTouchingEntities(GameplayEntity firstEntity, GameplayEntity secondEntity, boolean forceDetachSecond) {
        int secondNeighborInsertionIndex = 0;
        int firstNeighborInsertionIndex = 0;
        int secondIsKindOne = 0;
        int firstIsKindOne = 0;
        int secondDetachmentReturnValue = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int neighborIndexThenDetachSecond = 0;
        RuntimeException var3 = null;
        int detachFirst = 0;
        int variantPropagationThenNeighborIndex = 0;
        GameplayEntity entityForNeighborCountReset = null;
        int propagateCategory = 0;
        GameplayEntity entityForVariantCountReset = null;
        int var7 = 0;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          for (neighborIndexThenDetachSecond = 0; neighborIndexThenDetachSecond < secondEntity.relatedEntityCount; neighborIndexThenDetachSecond++) {
            if (secondEntity.relatedEntities[neighborIndexThenDetachSecond] == firstEntity) {
              return false;
            }
          }
          neighborIndexThenDetachSecond = forceDetachSecond ? 1 : 0;
          detachFirst = 0;
          secondNeighborInsertionIndex = secondEntity.relatedEntityCount;
          secondEntity.relatedEntityCount = secondEntity.relatedEntityCount + 1;
          secondEntity.relatedEntities[secondNeighborInsertionIndex] = firstEntity;
          firstNeighborInsertionIndex = firstEntity.relatedEntityCount;
          firstEntity.relatedEntityCount = firstEntity.relatedEntityCount + 1;
          firstEntity.relatedEntities[firstNeighborInsertionIndex] = secondEntity;
          if (!((secondEntity.entitySpriteKindId == 0) &&
              (firstEntity.entitySpriteKindId == 0))) {
            variantPropagationThenNeighborIndex = 0;
            propagateCategory = 0;
            secondIsKindOne = (secondEntity.entitySpriteKindId != 1) ? 0 : 1;
            if (firstEntity.entitySpriteKindId != 1) {
              firstIsKindOne = 0;
            } else {
              firstIsKindOne = 1;
            }
            {
              if ((secondIsKindOne ^ firstIsKindOne) != 0) {
                if ((secondEntity.entitySpriteKindId == 1) &&
                    (firstEntity.entitySpriteKindId == 0)) {
                  secondEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, 0);
                } else {
                  if ((secondEntity.entitySpriteKindId == 0) &&
                      (firstEntity.entitySpriteKindId == 1)) {
                    variantPropagationThenNeighborIndex = 1;
                  } else {
                    if ((firstEntity.entitySpriteKindId == 2) &&
                        (secondEntity.entitySpriteKindId == 1)) {
                      neighborIndexThenDetachSecond = 1;
                      detachFirst = 1;
                      propagateCategory = 1;
                      secondEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, 0);
                    } else {
                      if ((1 == firstEntity.entitySpriteKindId) &&
                          (secondEntity.entitySpriteKindId == 2)) {
                        secondEntity.configureEntitySprite(320, firstEntity.entityCategoryKey, secondEntity.spriteVariantIndex, 0);
                        variantPropagationThenNeighborIndex = 1;
                        neighborIndexThenDetachSecond = 1;
                      }
                    }
                  }
                }
              } else {
                if (!((2 != secondEntity.entitySpriteKindId) &&
                    (firstEntity.entitySpriteKindId != 2))) {
                  if ((secondEntity.entitySpriteKindId == 2) &&
                      (2 != firstEntity.entitySpriteKindId)) {
                    secondEntity.configureEntitySprite(320, firstEntity.entityCategoryKey, secondEntity.spriteVariantIndex, firstEntity.entitySpriteKindId);
                    neighborIndexThenDetachSecond = 1;
                  } else {
                    if ((firstEntity.entitySpriteKindId == 2) &&
                        (2 != secondEntity.entitySpriteKindId)) {
                      detachFirst = 1;
                      propagateCategory = 1;
                      neighborIndexThenDetachSecond = 1;
                      firstEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, secondEntity.entitySpriteKindId);
                    }
                  }
                }
              }
            }
            if (!((variantPropagationThenNeighborIndex == 0) &&
                  (propagateCategory == 0))) {
              DelegatingCanvas.propagateContactConversion(propagateCategory != 0, secondEntity, 1, firstEntity, variantPropagationThenNeighborIndex != 0);
            }
            if ((secondEntity.entitySpriteKindId == 1) &&
                (firstEntity.entitySpriteKindId == 1) &&
                (firstEntity.entityCategoryKey == secondEntity.entityCategoryKey)) {
              secondEntity.sameCategoryEntityCount = secondEntity.sameCategoryEntityCount + 1;
              firstEntity.sameCategoryEntityCount = firstEntity.sameCategoryEntityCount + 1;
            } else {
              if ((secondEntity.entitySpriteKindId == 2) &&
                  (firstEntity.entitySpriteKindId == 2) &&
                  (firstEntity.spriteVariantIndex == secondEntity.spriteVariantIndex)) {
                secondEntity.sameVariantEntityCount = secondEntity.sameVariantEntityCount + 1;
                firstEntity.sameVariantEntityCount = firstEntity.sameVariantEntityCount + 1;
              }
            }
          }
          if ((secondEntity.entitySpriteKindId == 0) &&
              (firstEntity.entitySpriteKindId == 0)) {
            if (secondEntity.entityCategoryKey == firstEntity.entityCategoryKey) {
              secondEntity.sameCategoryEntityCount = secondEntity.sameCategoryEntityCount + 1;
              firstEntity.sameCategoryEntityCount = firstEntity.sameCategoryEntityCount + 1;
            }
            if (firstEntity.spriteVariantIndex == secondEntity.spriteVariantIndex) {
              secondEntity.sameVariantEntityCount = secondEntity.sameVariantEntityCount + 1;
              firstEntity.sameVariantEntityCount = firstEntity.sameVariantEntityCount + 1;
            }
          }
          if (neighborIndexThenDetachSecond != 0) {
            for (variantPropagationThenNeighborIndex = 0; secondEntity.relatedEntityCount > variantPropagationThenNeighborIndex; variantPropagationThenNeighborIndex++) {
              secondEntity.relatedEntities[variantPropagationThenNeighborIndex].removeRelatedEntity(secondEntity, 0);
            }
            entityForNeighborCountReset = secondEntity;
            secondEntity.sameCategoryEntityCount = 0;
            entityForVariantCountReset = secondEntity;
            entityForVariantCountReset.sameVariantEntityCount = 0;
            entityForNeighborCountReset.relatedEntityCount = 0;
            secondEntity.entityQueue = ArchiveNetworkClient.movingEntities;
            secondEntity.detachedFromBoard = true;
          }
          if (detachFirst != 0) {
            for (variantPropagationThenNeighborIndex = 0; firstEntity.relatedEntityCount > variantPropagationThenNeighborIndex; variantPropagationThenNeighborIndex++) {
              firstEntity.relatedEntities[variantPropagationThenNeighborIndex].removeRelatedEntity(firstEntity, 0);
            }
            entityForNeighborCountReset = firstEntity;
            firstEntity.sameCategoryEntityCount = 0;
            entityForVariantCountReset = firstEntity;
            entityForNeighborCountReset.relatedEntityCount = 0;
            firstEntity.touchesAvatar = false;
            firstEntity.detachedFromBoard = true;
            firstEntity.entityQueue = ArchiveNetworkClient.movingEntities;
            entityForVariantCountReset.sameVariantEntityCount = 0;
          }
          secondDetachmentReturnValue = neighborIndexThenDetachSecond;
          return secondDetachmentReturnValue != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_80_0 = var3;
          stackIn_80_1 = new StringBuilder().append("ik.D(");
          if (firstEntity == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',');
          if (secondEntity == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(forceDetachSecond).append(')').toString());
        }
    }

    static {
        waitingForFontsText = "Waiting for fonts";
    }
}
