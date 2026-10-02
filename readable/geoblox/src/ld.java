/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static Sprite[] field_b;
    static String field_a;
    static java.math.BigInteger field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_b = (Sprite[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
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
        clientControlFlowGuard = Geoblox.field_C;
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
          L0: while (true) {
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
            if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex + circleVerticalOffset] == 0) {
              continue L0;
            }
            return true;
          }
        } catch (java.lang.RuntimeException boundaryScanFailure) {
          caughtBoundaryScanFailure = boundaryScanFailure;
          boundaryScanFailureForContext = caughtBoundaryScanFailure;
          throw t.a((Throwable) ((Object) boundaryScanFailureForContext), "ld.B(" + methodGuard + ')');
        }
    }

    final static void advanceDifficulty(boolean recursiveAdvanceGuard) {
        ji.difficultyStep = ji.difficultyStep + 1;
        if (ji.difficultyStep >= kd.difficultyStepFlags.length) {
          if (sa.specialSpriteKindProbability > 0.15000000000000002) {
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability - 0.05;
          }
          return;
        }
        if ((4 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
          og.entityMotionSpeed = og.entityMotionSpeed + 0.055555559694767f;
          sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
        }
        if ((kd.difficultyStepFlags[ji.difficultyStep] & 1) == 0) {
          if (!recursiveAdvanceGuard) {
            if ((kd.difficultyStepFlags[ji.difficultyStep] & 2) != 0) {
              if (f.availableEntityCategoryCount < 7) {
                f.availableEntityCategoryCount = f.availableEntityCategoryCount + 1;
              }
            }
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
              sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
            }
            if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
              DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
            }
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
            }
            return;
          }
          ld.advanceDifficulty(true);
          if ((kd.difficultyStepFlags[ji.difficultyStep] & 2) == 0) {
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
              sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
            }
            if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
              DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
            }
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
            }
            return;
          }
          if (f.availableEntityCategoryCount < 7) {
            f.availableEntityCategoryCount = f.availableEntityCategoryCount + 1;
          }
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
          }
          if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
            DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          }
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
          return;
        }
        if (ag.availableSpriteVariantCount < 7) {
          ag.availableSpriteVariantCount = ag.availableSpriteVariantCount + 1;
          if (recursiveAdvanceGuard) {
            ld.advanceDifficulty(true);
          }
          if ((kd.difficultyStepFlags[ji.difficultyStep] & 2) != 0) {
            if (f.availableEntityCategoryCount < 7) {
              f.availableEntityCategoryCount = f.availableEntityCategoryCount + 1;
            }
          }
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
          }
          if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
            DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          }
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
          return;
        }
        if (recursiveAdvanceGuard) {
          ld.advanceDifficulty(true);
          if ((kd.difficultyStepFlags[ji.difficultyStep] & 2) != 0) {
            if (f.availableEntityCategoryCount >= 7) {
              if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
                sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
              }
              if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
                DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
              }
              if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
                if (0.800000011920929f > ij.spawnIntervalScale) {
                  ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
                }
                sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
              }
              return;
            }
            f.availableEntityCategoryCount = f.availableEntityCategoryCount + 1;
          }
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
            if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
              DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
            }
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
            }
            return;
          }
          if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
            }
            return;
          }
          DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
          return;
        }
        if ((kd.difficultyStepFlags[ji.difficultyStep] & 2) != 0) {
          if (f.availableEntityCategoryCount >= 7) {
            if (0 == (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
              if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
                if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
                  if (0.800000011920929f > ij.spawnIntervalScale) {
                    ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
                  }
                  sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
                }
                return;
              }
              DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
              if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
                if (0.800000011920929f > ij.spawnIntervalScale) {
                  ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
                }
                sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
              }
              return;
            }
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
            if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
              if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
                if (0.800000011920929f > ij.spawnIntervalScale) {
                  ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
                }
                sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
              }
              return;
            }
            DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
            }
            return;
          }
          f.availableEntityCategoryCount = f.availableEntityCategoryCount + 1;
        }
        if (0 == (kd.difficultyStepFlags[ji.difficultyStep] & 16)) {
          if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
            }
            return;
          }
          DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
          return;
        }
        sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
        if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
          }
          return;
        }
        DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
        if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
          if (0.800000011920929f > ij.spawnIntervalScale) {
            ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
          }
          sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard);
        }
    }

    final static void spawnPointsPopup(int originY, int originX, int methodGuard, int points) {
        ug.spawnScorePopup(points, true, originY, 1, originX);
        if (methodGuard > 39) {
            return;
        }
        ld.hasPixelsAtPlayfieldBoundary(118);
    }

    static {
        field_a = "+2,000 for being great!";
        field_c = new java.math.BigInteger("65537");
    }
}
