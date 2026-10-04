/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MatchCandidateSupport {
    static Calendar gmtCalendar;
    static int releasedInCurrentTheme;
    static Sprite currentAvatarCryFrame;

    public static void releaseStaticReferences(int methodGuard) {
        gmtCalendar = null;
        currentAvatarCryFrame = null;
        if (methodGuard > -58) {
            SocialListEntry unusedNullSocialEntrySnapshot = (SocialListEntry) null;
            MatchCandidateSupport.socialEntrySortsAfter((SocialListEntry) null, (SocialListEntry) null, (byte) -96);
        }
    }

    final static void collectMatchCandidates(int methodGuard) {
        int firstNeighborIndex = 0;
        int secondNeighborIndex = 0;
        int variantMatchEligibilityValue = 0;
        int categoryMatchEligibilityValue = 0;
        int firstNeighborVariantMatchValue = 0;
        int firstNeighborCategoryMatchValue = 0;
        int tripleCategoryMatchValue = 0;
        int tripleVariantMatchValue = 0;
        int[] candidateArrayBeforePack;
        int candidateWriteIndexBeforePack;
        int existingCandidateBits;
        int smallestEntityIdBeforePack;
        int categoryMatchFlagBits = 0;
        int variantMatchFlagBits;
        int singleMatchFeedbackRequest = 0;
        RuntimeException caughtCollectionFailure = null;
        int eligibleNeighborhoodVisited = 0;
        RuntimeException collectionFailureForContext = null;
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
          centralEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.firstForIteration(0));
          if (methodGuard != -2) {
            currentAvatarCryFrame = (Sprite) null;
          }
          while (centralEntity != null) {
            if (!((centralEntity.sameVariantEntityCount <= 1) &&
                (centralEntity.sameCategoryEntityCount <= 1))) {
              centralEntity.entityQueue = DelegatingCanvas.transientEntities;
              variantMatchEligibilityValue = (centralEntity.sameVariantEntityCount <= 1) ? 0 : 1;
              variantMatchingAllowed = variantMatchEligibilityValue;
              categoryMatchEligibilityValue = (centralEntity.sameCategoryEntityCount <= 1) ? 0 : 1;
              categoryMatchingAllowed = categoryMatchEligibilityValue;
              for (firstNeighborIndex = 0; firstNeighborIndex < centralEntity.relatedEntityCount; firstNeighborIndex++) {
                eligibleNeighborhoodVisited = 1;
                if (variantMatchingAllowed != 0) {
                  firstNeighborVariantMatchValue = (centralEntity.spriteVariantIndex == centralEntity.relatedEntities[firstNeighborIndex].spriteVariantIndex) ? 1 : 0;
                } else {
                  firstNeighborVariantMatchValue = 0;
                }
                firstNeighborSharesVariant = firstNeighborVariantMatchValue;
                if (categoryMatchingAllowed != 0) {
                  firstNeighborCategoryMatchValue = (centralEntity.entityCategoryKey == centralEntity.relatedEntities[firstNeighborIndex].entityCategoryKey) ? 1 : 0;
                } else {
                  firstNeighborCategoryMatchValue = 0;
                }
                firstNeighborSharesCategory = firstNeighborCategoryMatchValue;
                if (!((firstNeighborSharesVariant == 0) &&
                    (firstNeighborSharesCategory == 0))) {
                  for (secondNeighborIndex = firstNeighborIndex + 1; secondNeighborIndex < centralEntity.relatedEntityCount; secondNeighborIndex++) {
                    if (firstNeighborSharesCategory != 0) {
                      tripleCategoryMatchValue = (centralEntity.relatedEntities[secondNeighborIndex].entityCategoryKey == centralEntity.entityCategoryKey) ? 1 : 0;
                    } else {
                      tripleCategoryMatchValue = 0;
                    }
                    tripleSharesCategory = tripleCategoryMatchValue;
                    if (firstNeighborSharesVariant != 0) {
                      tripleVariantMatchValue = (centralEntity.spriteVariantIndex == centralEntity.relatedEntities[secondNeighborIndex].spriteVariantIndex) ? 1 : 0;
                    } else {
                      tripleVariantMatchValue = 0;
                    }
                    tripleSharesVariant = tripleVariantMatchValue;
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
                      candidateArrayBeforePack = TextPairLoginPayload.packedMatchCandidates;
                      candidateWriteIndexBeforePack = EmailAvailabilityQuery.matchCandidateCount;
                      existingCandidateBits = TextPairLoginPayload.packedMatchCandidates[EmailAvailabilityQuery.matchCandidateCount];
                      smallestEntityIdBeforePack = smallestPackedEntityId;
                      if (tripleSharesCategory == 0) {
                        categoryMatchFlagBits = 0;
                      } else {
                        categoryMatchFlagBits = -2147483648;
                      }
                      if (tripleSharesVariant == 0) {
                        variantMatchFlagBits = 0;
                      } else {
                        variantMatchFlagBits = 1073741824;
                      }
                      candidateArrayBeforePack[candidateWriteIndexBeforePack] = SessionInstanceState.orInt(existingCandidateBits, SessionInstanceState.orInt(smallestEntityIdBeforePack, SessionInstanceState.orInt(SessionInstanceState.orInt(SessionInstanceState.orInt(categoryMatchFlagBits, variantMatchFlagBits), largestPackedEntityId << 20), middlePackedEntityId << 10)));
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
            centralEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.nextForIteration(1));
          }
          if (eligibleNeighborhoodVisited != 0) {
            if (dualMatchFound == 0) {
              singleMatchFeedbackRequest = 4;
              AvatarFeedbackSupport.requestAvatarFeedback(singleMatchFeedbackRequest, false);
            } else {
              AvatarFeedbackSupport.requestAvatarFeedback(5, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException collectionFailure) {
          caughtCollectionFailure = collectionFailure;
          collectionFailureForContext = caughtCollectionFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) collectionFailureForContext), "ul.C(" + methodGuard + ')');
        }
    }

    final static boolean socialEntrySortsAfter(SocialListEntry first, SocialListEntry second, byte methodGuard) {
        int adjustedInsertionOrder = 0;
        RuntimeException comparisonFailureForContext = null;
        int unusedClientControlSnapshot = 0;
        RuntimeException comparisonFailureCause = null;
        StringBuilder comparisonFailurePrefix = null;
        String firstEntryDescription = null;
        StringBuilder comparisonBeforeSecondDescription = null;
        String secondEntryDescription = null;
        RuntimeException caughtComparisonFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 127) {
            return false;
          }
          adjustedInsertionOrder = first.insertionIndex - second.insertionIndex;
          if (ReflectionCheckRequest.currentSocialLocationLabel != first.locationLabel) {
            if (first.locationLabel == null) {
              adjustedInsertionOrder += 200;
            }
          } else {
            adjustedInsertionOrder -= 200;
          }
          if (second.locationLabel == ReflectionCheckRequest.currentSocialLocationLabel) {
            adjustedInsertionOrder += 200;
          } else {
            if (null == second.locationLabel) {
              adjustedInsertionOrder -= 200;
            }
          }
          return !(0 >= adjustedInsertionOrder);
        } catch (java.lang.RuntimeException comparisonFailure) {
          caughtComparisonFailure = comparisonFailure;
          comparisonFailureForContext = caughtComparisonFailure;
          comparisonFailureCause = comparisonFailureForContext;
          comparisonFailurePrefix = new StringBuilder().append("ul.D(");
          if (first == null) {
            firstEntryDescription = "null";
          } else {
            firstEntryDescription = "{...}";
          }
          comparisonBeforeSecondDescription = ((StringBuilder) (Object) comparisonFailurePrefix).append(firstEntryDescription).append(',');
          if (second == null) {
            secondEntryDescription = "null";
          } else {
            secondEntryDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) comparisonFailureCause), ((StringBuilder) (Object) comparisonBeforeSecondDescription).append(secondEntryDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void prepareFinalFrameSlices(int methodGuard, ResourceArchive graphicsArchive) {
        Sprite finalFrameSprite = null;
        int finalFrameWidth = 0;
        int finalFrameHeight = 0;
        try {
            finalFrameSprite = new Sprite(graphicsArchive.getNamedFile(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) MessageDialog.gameCanvas));
            finalFrameWidth = finalFrameSprite.width;
            finalFrameHeight = finalFrameSprite.height;
            SpriteCheckboxRenderer.pushRasterTarget(methodGuard + 21619);
            LogoPreparationSupport.logoFinalFrameTop = new Sprite(finalFrameWidth, 3 * finalFrameHeight / 4);
            LogoPreparationSupport.logoFinalFrameTop.setAsRasterTarget();
            finalFrameSprite.drawUnmasked(0, 0);
            UsernameQuerySupport.logoFinalFrameBottom = new Sprite(finalFrameWidth, finalFrameHeight - LogoPreparationSupport.logoFinalFrameTop.height);
            UsernameQuerySupport.logoFinalFrameBottom.setAsRasterTarget();
            if (methodGuard != -21541) {
                currentAvatarCryFrame = (Sprite) null;
            }
            finalFrameSprite.drawUnmasked(0, -LogoPreparationSupport.logoFinalFrameTop.height);
            UsernameQuerySupport.logoFinalFrameBottom.trimY = LogoPreparationSupport.logoFinalFrameTop.height;
            RasterTargetRestoreSupport.restoreRasterTarget(true);
        } catch (RuntimeException slicePreparationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) slicePreparationFailure), "ul.A(" + methodGuard + ',' + (graphicsArchive != null ? "{...}" : "null") + ')');
        }
    }

    static {
        gmtCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
