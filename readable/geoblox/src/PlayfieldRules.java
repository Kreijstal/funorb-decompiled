/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayfieldRules {
    static Sprite[] avatarCryEndFrames;
    static String twoThousandBonusText;
    static java.math.BigInteger loginModPowExponent;

    public static void releaseStaticReferences(boolean clearFramesBeforeTextGuard) {
        loginModPowExponent = null;
        if (!clearFramesBeforeTextGuard) {
            avatarCryEndFrames = (Sprite[]) null;
            twoThousandBonusText = null;
            avatarCryEndFrames = null;
            return;
        }
        twoThousandBonusText = null;
        avatarCryEndFrames = null;
    }

    final static boolean hasPixelsAtPlayfieldBoundary(int methodGuard) {
        int previousCircleVerticalOffset = 0;
        RuntimeException caughtBoundaryScanFailure = null;
        int upperNearRowCenterIndex = 0;
        RuntimeException boundaryScanFailureForContext = null;
        int lowerNearRowCenterIndex = 0;
        int upperFarRowCenterIndex = 0;
        int lowerFarRowCenterIndex = 0;
        int circleHorizontalOffset = 0;
        int circleVerticalOffset = 0;
        int playfieldRadiusSquared = 0;
        int guardDivisionResult = 0;
        int circleError = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          upperNearRowCenterIndex = 240 * SoftwareRasterizer.stride + 320;
          lowerNearRowCenterIndex = upperNearRowCenterIndex;
          upperFarRowCenterIndex = -(230 * SoftwareRasterizer.stride) + upperNearRowCenterIndex;
          lowerFarRowCenterIndex = 230 * SoftwareRasterizer.stride + upperNearRowCenterIndex;
          circleHorizontalOffset = 230;
          circleVerticalOffset = 0;
          playfieldRadiusSquared = 52900;
          guardDivisionResult = 64 / ((methodGuard - 32) / 34);
          circleError = playfieldRadiusSquared - circleHorizontalOffset;
          if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + upperNearRowCenterIndex] != 0) {
            return true;
          }
          if (0 != SoftwareRasterizer.framebuffer[upperNearRowCenterIndex + circleHorizontalOffset]) {
            return true;
          }
          if (SoftwareRasterizer.framebuffer[upperFarRowCenterIndex] != 0) {
            return true;
          }
          if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex] != 0) {
            return true;
          }
          do {
            previousCircleVerticalOffset = circleVerticalOffset;
            circleVerticalOffset++;
            circleError = circleError + (previousCircleVerticalOffset + circleVerticalOffset);
            lowerNearRowCenterIndex = lowerNearRowCenterIndex + SoftwareRasterizer.stride;
            upperNearRowCenterIndex = upperNearRowCenterIndex - SoftwareRasterizer.stride;
            if (playfieldRadiusSquared < circleError) {
              upperFarRowCenterIndex = upperFarRowCenterIndex + SoftwareRasterizer.stride;
              lowerFarRowCenterIndex = lowerFarRowCenterIndex - SoftwareRasterizer.stride;
              circleHorizontalOffset--;
              circleError = circleError - (circleHorizontalOffset + circleHorizontalOffset);
            }
            if (circleVerticalOffset > circleHorizontalOffset) {
              return false;
            }
            if (0 != SoftwareRasterizer.framebuffer[-circleVerticalOffset + upperFarRowCenterIndex]) {
              return true;
            }
            if (SoftwareRasterizer.framebuffer[upperFarRowCenterIndex + circleVerticalOffset] != 0) {
              return true;
            }
            if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + upperNearRowCenterIndex] != 0) {
              return true;
            }
            if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + upperNearRowCenterIndex] != 0) {
              return true;
            }
            if (SoftwareRasterizer.framebuffer[lowerNearRowCenterIndex - circleHorizontalOffset] != 0) {
              return true;
            }
            if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + lowerNearRowCenterIndex] != 0) {
              return true;
            }
            if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex - circleVerticalOffset] != 0) {
              return true;
            }
          } while (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex + circleVerticalOffset] == 0);
          return true;
        } catch (java.lang.RuntimeException boundaryScanFailure) {
          caughtBoundaryScanFailure = boundaryScanFailure;
          boundaryScanFailureForContext = caughtBoundaryScanFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) boundaryScanFailureForContext), "ld.B(" + methodGuard + ')');
        }
    }

    final static void advanceDifficulty(boolean recursiveAdvanceGuard) {
        ArchiveNetworkClient.difficultyStep = ArchiveNetworkClient.difficultyStep + 1;
        if (ArchiveNetworkClient.difficultyStep >= ClientFlowState.difficultyStepFlags.length) {
          if (ContextualRuntimeException.specialSpriteKindProbability > 0.15000000000000002) {
            ContextualRuntimeException.specialSpriteKindProbability = ContextualRuntimeException.specialSpriteKindProbability - 0.05;
          }
        } else {
          if ((4 & ClientFlowState.difficultyStepFlags[ArchiveNetworkClient.difficultyStep]) != 0) {
            TextTemplateDefinition.entityMotionSpeed = TextTemplateDefinition.entityMotionSpeed + 0.055555559694767f;
            ContextualRuntimeException.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
          if ((ClientFlowState.difficultyStepFlags[ArchiveNetworkClient.difficultyStep] & 1) != 0 &&
              EmailValidator.availableSpriteVariantCount < 7) {
            EmailValidator.availableSpriteVariantCount = EmailValidator.availableSpriteVariantCount + 1;
          }
          if (recursiveAdvanceGuard) {
            PlayfieldRules.advanceDifficulty(true);
          }
          if ((ClientFlowState.difficultyStepFlags[ArchiveNetworkClient.difficultyStep] & 2) != 0 &&
              MessageDialog.availableEntityCategoryCount < 7) {
            MessageDialog.availableEntityCategoryCount = MessageDialog.availableEntityCategoryCount + 1;
          }
          if (0 != (ClientFlowState.difficultyStepFlags[ArchiveNetworkClient.difficultyStep] & 16)) {
            ContextualRuntimeException.specialSpriteKindProbability = ContextualRuntimeException.specialSpriteKindProbability + 0.05;
          }
          if ((8 & ClientFlowState.difficultyStepFlags[ArchiveNetworkClient.difficultyStep]) != 0) {
            DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          }
          if (0 != (ClientFlowState.difficultyStepFlags[ArchiveNetworkClient.difficultyStep] & 128)) {
            if (0.800000011920929f > FullscreenErrorDialog.spawnIntervalScale) {
              FullscreenErrorDialog.spawnIntervalScale = FullscreenErrorDialog.spawnIntervalScale + 0.02857142873108387f;
            }
            ContextualRuntimeException.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
        }
    }

    final static void spawnPointsPopup(int originY, int originX, int methodGuard, int points) {
        ScorePopupSupport.spawnScorePopup(points, true, originY, 1, originX);
        if (methodGuard > 39) {
            return;
        }
        PlayfieldRules.hasPixelsAtPlayfieldBoundary(118);
    }

    static {
        twoThousandBonusText = "+2,000 for being great!";
        loginModPowExponent = new java.math.BigInteger("65537");
    }
}
