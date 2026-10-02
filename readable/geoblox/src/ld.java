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
        int leftCardinalHit = 0;
        int rightCardinalHit = 0;
        int topCardinalHit = 0;
        int bottomCardinalHit = 0;
        int upperFarLeftHit = 0;
        int upperFarRightHit = 0;
        int upperNearLeftHit = 0;
        int upperNearRightHit = 0;
        int lowerNearLeftHit = 0;
        int lowerNearRightHit = 0;
        int lowerFarLeftHit = 0;
        int lowerFarRightHit = 0;
        int boundaryScanMissResult = 0;
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
            leftCardinalHit = 1;
            return leftCardinalHit != 0;
          }
          if (0 != SoftwareRasterizer.framebuffer[upperNearRowCenterIndex + circleHorizontalOffset]) {
            rightCardinalHit = 1;
            return rightCardinalHit != 0;
          }
          if (SoftwareRasterizer.framebuffer[upperFarRowCenterIndex] != 0) {
            topCardinalHit = 1;
            return topCardinalHit != 0;
          }
          if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex] != 0) {
            bottomCardinalHit = 1;
            return bottomCardinalHit != 0;
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
              boundaryScanMissResult = 0;
              return boundaryScanMissResult != 0;
            }
            if (0 != SoftwareRasterizer.framebuffer[-circleVerticalOffset + upperFarRowCenterIndex]) {
              upperFarLeftHit = 1;
              return upperFarLeftHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[upperFarRowCenterIndex + circleVerticalOffset] != 0) {
              upperFarRightHit = 1;
              return upperFarRightHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + upperNearRowCenterIndex] != 0) {
              upperNearLeftHit = 1;
              return upperNearLeftHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + upperNearRowCenterIndex] != 0) {
              upperNearRightHit = 1;
              return upperNearRightHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[lowerNearRowCenterIndex - circleHorizontalOffset] != 0) {
              lowerNearLeftHit = 1;
              return lowerNearLeftHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + lowerNearRowCenterIndex] != 0) {
              lowerNearRightHit = 1;
              return lowerNearRightHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex - circleVerticalOffset] != 0) {
              lowerFarLeftHit = 1;
              return lowerFarLeftHit != 0;
            }
            if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex + circleVerticalOffset] == 0) {
              continue L0;
            }
            lowerFarRightHit = 1;
            return lowerFarRightHit != 0;
          }
        } catch (java.lang.RuntimeException boundaryScanFailure) {
          caughtBoundaryScanFailure = boundaryScanFailure;
          boundaryScanFailureForContext = caughtBoundaryScanFailure;
          throw t.a((Throwable) ((Object) boundaryScanFailureForContext), "ld.B(" + methodGuard + ')');
        }
    }

    final static void advanceDifficulty(boolean recursiveAdvanceGuard) {
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_228_0 = 0;
        ji.difficultyStep = ji.difficultyStep + 1;
        if (ji.difficultyStep >= kd.difficultyStepFlags.length) {
          if (sa.specialSpriteKindProbability > 0.15000000000000002) {
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability - 0.05;
          }
          return;
        }
        if ((4 & kd.difficultyStepFlags[ji.difficultyStep]) != 0) {
          og.entityMotionSpeed = og.entityMotionSpeed + 0.055555559694767f;
          if (recursiveAdvanceGuard) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 1;
          }
          sa.recomputeSpawnReleaseInterval(stackIn_10_0 != 0);
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
              if (recursiveAdvanceGuard) {
                stackIn_29_0 = 0;
              } else {
                stackIn_29_0 = 1;
              }
              sa.recomputeSpawnReleaseInterval(stackIn_29_0 != 0);
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
              if (recursiveAdvanceGuard) {
                stackIn_61_0 = 0;
              } else {
                stackIn_61_0 = 1;
              }
              sa.recomputeSpawnReleaseInterval(stackIn_61_0 != 0);
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
            if (recursiveAdvanceGuard) {
              stackIn_47_0 = 0;
            } else {
              stackIn_47_0 = 1;
            }
            sa.recomputeSpawnReleaseInterval(stackIn_47_0 != 0);
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
            if (recursiveAdvanceGuard) {
              stackIn_83_0 = 0;
            } else {
              stackIn_83_0 = 1;
            }
            sa.recomputeSpawnReleaseInterval(stackIn_83_0 != 0);
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
                if (recursiveAdvanceGuard) {
                  stackIn_100_0 = 0;
                } else {
                  stackIn_100_0 = 1;
                }
                sa.recomputeSpawnReleaseInterval(stackIn_100_0 != 0);
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
              if (recursiveAdvanceGuard) {
                stackIn_114_0 = 0;
              } else {
                stackIn_114_0 = 1;
              }
              sa.recomputeSpawnReleaseInterval(stackIn_114_0 != 0);
            }
            return;
          }
          if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              if (recursiveAdvanceGuard) {
                stackIn_125_0 = 0;
              } else {
                stackIn_125_0 = 1;
              }
              sa.recomputeSpawnReleaseInterval(stackIn_125_0 != 0);
            }
            return;
          }
          DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            if (recursiveAdvanceGuard) {
              stackIn_135_0 = 0;
            } else {
              stackIn_135_0 = 1;
            }
            sa.recomputeSpawnReleaseInterval(stackIn_135_0 != 0);
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
                  if (recursiveAdvanceGuard) {
                    stackIn_172_0 = 0;
                  } else {
                    stackIn_172_0 = 1;
                  }
                  sa.recomputeSpawnReleaseInterval(stackIn_172_0 != 0);
                }
                return;
              }
              DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
              if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
                if (0.800000011920929f > ij.spawnIntervalScale) {
                  ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
                }
                if (recursiveAdvanceGuard) {
                  stackIn_182_0 = 0;
                } else {
                  stackIn_182_0 = 1;
                }
                sa.recomputeSpawnReleaseInterval(stackIn_182_0 != 0);
              }
              return;
            }
            sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
            if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
              if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
                if (0.800000011920929f > ij.spawnIntervalScale) {
                  ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
                }
                if (recursiveAdvanceGuard) {
                  stackIn_160_0 = 0;
                } else {
                  stackIn_160_0 = 1;
                }
                sa.recomputeSpawnReleaseInterval(stackIn_160_0 != 0);
              }
              return;
            }
            DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
            if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
              if (0.800000011920929f > ij.spawnIntervalScale) {
                ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
              }
              if (recursiveAdvanceGuard) {
                stackIn_150_0 = 0;
              } else {
                stackIn_150_0 = 1;
              }
              sa.recomputeSpawnReleaseInterval(stackIn_150_0 != 0);
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
              if (recursiveAdvanceGuard) {
                stackIn_218_0 = 0;
              } else {
                stackIn_218_0 = 1;
              }
              sa.recomputeSpawnReleaseInterval(stackIn_218_0 != 0);
            }
            return;
          }
          DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            if (recursiveAdvanceGuard) {
              stackIn_228_0 = 0;
            } else {
              stackIn_228_0 = 1;
            }
            sa.recomputeSpawnReleaseInterval(stackIn_228_0 != 0);
          }
          return;
        }
        sa.specialSpriteKindProbability = sa.specialSpriteKindProbability + 0.05;
        if ((8 & kd.difficultyStepFlags[ji.difficultyStep]) == 0) {
          if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
            if (0.800000011920929f > ij.spawnIntervalScale) {
              ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
            }
            if (recursiveAdvanceGuard) {
              stackIn_196_0 = 0;
            } else {
              stackIn_196_0 = 1;
            }
            sa.recomputeSpawnReleaseInterval(stackIn_196_0 != 0);
          }
          return;
        }
        DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
        if (0 != (kd.difficultyStepFlags[ji.difficultyStep] & 128)) {
          if (0.800000011920929f > ij.spawnIntervalScale) {
            ij.spawnIntervalScale = ij.spawnIntervalScale + 0.02857142873108387f;
          }
          if (recursiveAdvanceGuard) {
            stackIn_206_0 = 0;
          } else {
            stackIn_206_0 = 1;
          }
          sa.recomputeSpawnReleaseInterval(stackIn_206_0 != 0);
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
