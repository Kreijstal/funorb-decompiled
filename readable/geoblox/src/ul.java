/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ul {
    static Calendar field_c;
    static int releasedInCurrentTheme;
    static Sprite currentAvatarCryFrame;

    public static void a(int param0) {
        field_c = null;
        currentAvatarCryFrame = null;
        if (param0 > -58) {
            SocialListEntry var2 = (SocialListEntry) null;
            ul.socialEntrySortsAfter((SocialListEntry) null, (SocialListEntry) null, (byte) -96);
        }
    }

    final static void collectMatchCandidates(int methodGuard) {
        int firstNeighborIndex = 0;
        int secondNeighborIndex = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int[] stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int stackIn_65_4 = 0;
        int stackIn_68_5;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int eligibleNeighborhoodVisited = 0;
        RuntimeException var1 = null;
        int dualMatchFound = 0;
        GameplayEntity centralEntity = null;
        int variantMatchingAllowed = 0;
        int categoryMatchingAllowed = 0;
        int firstNeighborSharesVariant = 0;
        int firstNeighborSharesCategory = 0;
        int tripleSharesCategory = 0;
        int tripleSharesVariant = 0;
        int largestPackedEntityId = 0;
        int middlePackedEntityId = 0;
        int smallestPackedEntityId = 0;
        int swappedEntityId = 0;
        int controlFlowGuard = 0;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          EmailAvailabilityQuery.matchCandidateCount = 0;
          eligibleNeighborhoodVisited = 0;
          dualMatchFound = 0;
          centralEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
          if (methodGuard != -2) {
            currentAvatarCryFrame = (Sprite) null;
          }
          while (centralEntity != null) {
            if (!((centralEntity.sameVariantEntityCount <= 1) &&
                (centralEntity.sameCategoryEntityCount <= 1))) {
              centralEntity.entityQueue = DelegatingCanvas.transientEntities;
              stackIn_10_0 = (centralEntity.sameVariantEntityCount <= 1) ? 0 : 1;
              variantMatchingAllowed = stackIn_10_0;
              stackIn_13_0 = (centralEntity.sameCategoryEntityCount <= 1) ? 0 : 1;
              categoryMatchingAllowed = stackIn_13_0;
              for (firstNeighborIndex = 0; firstNeighborIndex < centralEntity.relatedEntityCount; firstNeighborIndex++) {
                eligibleNeighborhoodVisited = 1;
                if (variantMatchingAllowed != 0) {
                  stackIn_21_0 = (centralEntity.spriteVariantIndex == centralEntity.relatedEntities[firstNeighborIndex].spriteVariantIndex) ? 1 : 0;
                } else {
                  stackIn_21_0 = 0;
                }
                firstNeighborSharesVariant = stackIn_21_0;
                if (categoryMatchingAllowed != 0) {
                  stackIn_27_0 = (centralEntity.entityCategoryKey == centralEntity.relatedEntities[firstNeighborIndex].entityCategoryKey) ? 1 : 0;
                } else {
                  stackIn_27_0 = 0;
                }
                firstNeighborSharesCategory = stackIn_27_0;
                if (!((firstNeighborSharesVariant == 0) &&
                    (firstNeighborSharesCategory == 0))) {
                  for (secondNeighborIndex = firstNeighborIndex + 1; secondNeighborIndex < centralEntity.relatedEntityCount; secondNeighborIndex++) {
                    if (firstNeighborSharesCategory != 0) {
                      stackIn_38_0 = (centralEntity.relatedEntities[secondNeighborIndex].entityCategoryKey == centralEntity.entityCategoryKey) ? 1 : 0;
                    } else {
                      stackIn_38_0 = 0;
                    }
                    tripleSharesCategory = stackIn_38_0;
                    if (firstNeighborSharesVariant != 0) {
                      stackIn_44_0 = (centralEntity.spriteVariantIndex == centralEntity.relatedEntities[secondNeighborIndex].spriteVariantIndex) ? 1 : 0;
                    } else {
                      stackIn_44_0 = 0;
                    }
                    tripleSharesVariant = stackIn_44_0;
                    if (!((tripleSharesCategory == 0) &&
                        (tripleSharesVariant == 0))) {
                      centralEntity.relatedEntities[firstNeighborIndex].entityQueue = DelegatingCanvas.transientEntities;
                      centralEntity.relatedEntities[secondNeighborIndex].entityQueue = DelegatingCanvas.transientEntities;
                      middlePackedEntityId = centralEntity.relatedEntities[firstNeighborIndex].entityId;
                      largestPackedEntityId = centralEntity.entityId;
                      smallestPackedEntityId = centralEntity.relatedEntities[secondNeighborIndex].entityId;
                      if (middlePackedEntityId < smallestPackedEntityId) {
                        swappedEntityId = middlePackedEntityId;
                        middlePackedEntityId = smallestPackedEntityId;
                        smallestPackedEntityId = swappedEntityId;
                      }
                      if (tripleSharesVariant != 0) {
                        FadingDialog.variantMatchCandidateCount = FadingDialog.variantMatchCandidateCount + 1;
                      }
                      if ((tripleSharesVariant != 0) &&
                          (tripleSharesCategory != 0)) {
                      }
                      if (tripleSharesCategory != 0) {
                        TextLayout.categoryMatchCandidateCount = TextLayout.categoryMatchCandidateCount + 1;
                      }
                      if (largestPackedEntityId >= smallestPackedEntityId) {
                        if (middlePackedEntityId > largestPackedEntityId) {
                          swappedEntityId = largestPackedEntityId;
                          largestPackedEntityId = middlePackedEntityId;
                          middlePackedEntityId = swappedEntityId;
                        }
                      } else {
                        swappedEntityId = middlePackedEntityId;
                        middlePackedEntityId = smallestPackedEntityId;
                        smallestPackedEntityId = largestPackedEntityId;
                        largestPackedEntityId = swappedEntityId;
                      }
                      stackIn_64_0 = TextPairLoginPayload.packedMatchCandidates;
                      stackIn_64_1 = EmailAvailabilityQuery.matchCandidateCount;
                      stackIn_64_2 = TextPairLoginPayload.packedMatchCandidates[EmailAvailabilityQuery.matchCandidateCount];
                      stackIn_64_3 = smallestPackedEntityId;
                      if (tripleSharesCategory == 0) {
                        stackIn_65_4 = 0;
                      } else {
                        stackIn_65_4 = -2147483648;
                      }
                      if (tripleSharesVariant == 0) {
                        stackIn_68_5 = 0;
                      } else {
                        stackIn_68_5 = 1073741824;
                      }
                      stackIn_64_0[stackIn_64_1] = lb.orInt(stackIn_64_2, lb.orInt(stackIn_64_3, lb.orInt(lb.orInt(lb.orInt(stackIn_65_4, stackIn_68_5), largestPackedEntityId << 20), middlePackedEntityId << 10)));
                      EmailAvailabilityQuery.matchCandidateCount = EmailAvailabilityQuery.matchCandidateCount + 1;
                    }
                    if (tripleSharesCategory == 0) {
                      continue;
                    }
                    if (tripleSharesVariant != 0) {
                      dualMatchFound = 1;
                    }
                  }
                }
              }
            }
            centralEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
          }
          if (eligibleNeighborhoodVisited != 0) {
            if (dualMatchFound == 0) {
              stackIn_82_0 = 4;
              AvatarFeedbackSupport.requestAvatarFeedback(stackIn_82_0, false);
            } else {
              AvatarFeedbackSupport.requestAvatarFeedback(5, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ul.C(" + methodGuard + ')');
        }
    }

    final static boolean socialEntrySortsAfter(SocialListEntry first, SocialListEntry second, byte methodGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 127) {
            return false;
          }
          var3_int = first.insertionIndex - second.insertionIndex;
          if (ReflectionCheckRequest.currentSocialLocationLabel != first.locationLabel) {
            if (first.locationLabel == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (second.locationLabel == ReflectionCheckRequest.currentSocialLocationLabel) {
            var3_int += 200;
          } else {
            if (null == second.locationLabel) {
              var3_int -= 200;
            }
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ul.D(");
          if (first == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (second == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new Sprite(param1.getNamedFile(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) MessageDialog.gameCanvas));
            var3 = var2.width;
            var4 = var2.height;
            SpriteCheckboxRenderer.pushRasterTarget(param0 + 21619);
            bk.field_b = new Sprite(var3, 3 * var4 / 4);
            bk.field_b.setAsRasterTarget();
            var2.drawUnmasked(0, 0);
            cl.field_b = new Sprite(var3, var4 - bk.field_b.height);
            cl.field_b.setAsRasterTarget();
            if (param0 != -21541) {
                currentAvatarCryFrame = (Sprite) null;
            }
            var2.drawUnmasked(0, -bk.field_b.height);
            cl.field_b.trimY = bk.field_b.height;
            id.restoreRasterTarget(true);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ul.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
