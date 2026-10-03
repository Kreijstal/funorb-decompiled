/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DelegatingCanvas extends java.awt.Canvas {
    static IntrusiveDeque transientEntities;
    static Random field_d;
    private java.awt.Component field_b;
    static PcmStreamMixer field_a;

    final static int sineQ16(byte methodGuard, int angle8192) {
        if (methodGuard <= 7) {
            return -8;
        }
        angle8192 = angle8192 & 8191;
        if (angle8192 < 4096) {
            return angle8192 < 2048 ? ai.quarterSineQ16[angle8192] : ai.quarterSineQ16[4096 - angle8192];
        }
        return angle8192 >= 6144 ? -ai.quarterSineQ16[-angle8192 + 8192] : -ai.quarterSineQ16[angle8192 - 4096];
    }

    public static void a(byte param0) {
        field_d = null;
        transientEntities = null;
        field_a = null;
        int var1 = -120 % ((-5 - param0) / 51);
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bh.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        re var3 = null;
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
          var14 = eh.field_d;
          if (param0 != 2) {
            return;
          }
          var2 = var14.readUnsignedByte((byte) 34);
          var3 = (re) ((Object) PendingActionMarker.field_f.firstForIteration(0));
          while (var3 != null) {
            if (var2 != var3.field_k) {
              var3 = (re) ((Object) PendingActionMarker.field_f.nextForIteration(1));
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
            oi.field_a[0] = SecondaryDeque.field_f;
            var5 = var3.field_g;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              oi.field_a[var6_int] = var14.readNullTerminatedText((byte) 120);
            }
            TriangleMesh.a(2147483647, var5, var4);
            for (var6_int = 0; var4 > var6_int; var6_int++) {
              ScorePopup.a(116, var14);
              if (var6_int != 0) {
                nd.a(GzipInflater.field_g, var6_int, (byte) 123, StatefulWidgetRenderer.field_v, EmailAvailabilityQuery.field_b, lc.field_b);
              } else {
                nd.a(GzipInflater.field_g, var6_int, (byte) -97, StatefulWidgetRenderer.field_v, EmailAvailabilityQuery.field_b, lc.field_b);
              }
            }
            kc.a(var5, (byte) -98);
            var6 = new String[2][var5];
            var18 = new int[2][4 * var5];
            var8 = md.field_c;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = AchievementQuery.field_i[var9];
              var6[0][var10] = oi.field_a[var11];
              var18[0][4 * var10] = hg.field_a[var11];
              var18[0][4 * var10 + 1] = fb.field_m[var11];
              var18[0][4 * var10 + 2] = NodeHashTableIterator.field_i[var11];
              var18[0][4 * var10 + 3] = FrameTimer.field_b[var11];
              if ((WhirlpoolHash.a(oi.field_a[var11], (byte) 12)) &&
                  (FrameTimer.field_b[var11] + (fb.field_m[var11] + NodeHashTableIterator.field_i[var11]) == 0)) {
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
              var11 = AchievementQuery.field_i[var9 + var5];
              var6[1][var13] = oi.field_a[var11];
              var18[1][4 * var13] = hg.field_a[var11];
              var18[1][1 + 4 * var13] = fb.field_m[var11];
              var18[1][var13 * 4 + 2] = NodeHashTableIterator.field_i[var11];
              var18[1][var13 * 4 + 3] = FrameTimer.field_b[var11];
              if ((WhirlpoolHash.a(oi.field_a[var11], (byte) 12)) &&
                  (FrameTimer.field_b[var11] + NodeHashTableIterator.field_i[var11] + fb.field_m[var11] == 0)) {
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
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "bh.B(" + param0 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_b.paint(param0);
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
                DelegatingCanvas.a((byte) -40);
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
              while (true) {
                if (processedEntityToCompare != null) {
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
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        transientEntities = new IntrusiveDeque();
        field_d = new Random();
    }
}
