/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModelMeshBase extends MeshObject {
    private final void blendAnimationFrames(AnimationSkeleton skeleton, AnimationFrame frame, AnimationFrame nextFrame, int elapsed, int duration, boolean[] slotSelection, boolean selectedValue, boolean transformOption, int transformMask, int[] transformMatrix) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var31Lifetime1;
        int var31Lifetime2;
        int var14Lifetime1Lifetime1;
        if (nextFrame != null &&
          elapsed != 0) {
          var34 = 0;
          var11 = var34;
          var35 = 0;
          var12 = var35;
          var36 = 0;
          var13 = var36;
          while (var36 < skeleton.transformCount) {
            var14 = 0;
            if (var34 < frame.transformCount &&
              frame.transformSlots[var34] == var36) {
              var14 = 1;
            }
            var15 = 0;
            if (var35 < nextFrame.transformCount &&
              nextFrame.transformSlots[var35] == var36) {
              var15 = 1;
            }
            if (var14 != 0 ||
              var15 != 0) {
              if (slotSelection != null &&
                slotSelection[var36] != selectedValue &&
                skeleton.transformTypes[var36] != 0) {
                if (var14 != 0) {
                  var34++;
                }
                if (var15 != 0) {
                  var35++;
                }
              } else {
                var16 = 0;
                var17 = skeleton.transformTypes[var36];
                if (var17 == 3) {
                  var16 = 128;
                }
                if (var14 == 0) {
                  var18 = var16;
                  var19 = var16;
                  var20 = var16;
                  var21 = -1;
                  var22 = 0;
                } else {
                  var18 = frame.transformX[var34];
                  var19 = frame.transformY[var34];
                  var20 = frame.transformZ[var34];
                  var21 = frame.precedingPivotSlots[var34];
                  var22 = frame.interpolationFlags[var34];
                  var34++;
                }
                if (var15 == 0) {
                  var23 = var16;
                  var24 = var16;
                  var25 = var16;
                  var26 = -1;
                  var27 = 0;
                } else {
                  var23 = nextFrame.transformX[var35];
                  var24 = nextFrame.transformY[var35];
                  var25 = nextFrame.transformZ[var35];
                  var26 = nextFrame.precedingPivotSlots[var35];
                  var27 = nextFrame.interpolationFlags[var35];
                  var35++;
                }
                if ((var22 & 2) == 0 &&
                  (var27 & 1) == 0) {
                  if (var17 != 2) {
                    if (var17 != 7) {
                      var28 = var18 + (var23 - var18) * elapsed / duration;
                      var29 = var19 + (var24 - var19) * elapsed / duration;
                      var30 = var20 + (var25 - var20) * elapsed / duration;
                    } else {
                      var31 = var23 - var18 & 63;
                      if (var31 >= 32) {
                        var31 -= 64;
                      }
                      var28 = var18 + var31 * elapsed / duration & 63;
                      var29 = var19 + (var24 - var19) * elapsed / duration;
                      var30 = var20 + (var25 - var20) * elapsed / duration;
                    }
                  } else {
                    var31 = var23 - var18 & 2047;
                    var32 = var24 - var19 & 2047;
                    var33 = var25 - var20 & 2047;
                    if (var31 >= 1024) {
                      var31 -= 2048;
                    }
                    if (var32 >= 1024) {
                      var32 -= 2048;
                    }
                    if (var33 >= 1024) {
                      var33 -= 2048;
                    }
                    var28 = var18 + var31 * elapsed / duration & 2047;
                    var29 = var19 + var32 * elapsed / duration & 2047;
                    var30 = var20 + var33 * elapsed / duration & 2047;
                  }
                } else {
                  var28 = var18;
                  var29 = var19;
                  var30 = var20;
                }
                if (var21 == -1) {
                  if (var26 != -1) {
                    var31Lifetime1 = transformMask & skeleton.transformMasks[var26];
                    if (var31Lifetime1 == 65535) {
                      this.applyGroupTransform(0, skeleton.transformGroups[var26], 0, 0, 0, transformOption);
                    } else {
                      this.applyMaskedGroupTransform(0, skeleton.transformGroups[var26], 0, 0, 0, transformOption, var31Lifetime1, transformMatrix);
                    }
                  }
                } else {
                  var31Lifetime1 = transformMask & skeleton.transformMasks[var21];
                  if (var31Lifetime1 == 65535) {
                    this.applyGroupTransform(0, skeleton.transformGroups[var21], 0, 0, 0, transformOption);
                  } else {
                    this.applyMaskedGroupTransform(0, skeleton.transformGroups[var21], 0, 0, 0, transformOption, var31Lifetime1, transformMatrix);
                  }
                }
                var31Lifetime2 = transformMask & skeleton.transformMasks[var36];
                if (var31Lifetime2 == 65535) {
                  this.applyGroupTransform(var17, skeleton.transformGroups[var36], var28, var29, var30, transformOption);
                } else {
                  this.applyMaskedGroupTransform(var17, skeleton.transformGroups[var36], var28, var29, var30, transformOption, var31Lifetime2, transformMatrix);
                }
              }
            }
            var36++;
          }
          return;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < frame.transformCount; var11Lifetime1++) {
          var12Lifetime1 = frame.transformSlots[var11Lifetime1];
          if (slotSelection == null ||
            slotSelection[var12Lifetime1] == selectedValue ||
            skeleton.transformTypes[var12Lifetime1] == 0) {
            var13Lifetime1 = frame.precedingPivotSlots[var11Lifetime1];
            if (var13Lifetime1 != -1) {
              var14Lifetime1 = transformMask & skeleton.transformMasks[var13Lifetime1];
              if (var14Lifetime1 == 65535) {
                this.applyGroupTransform(0, skeleton.transformGroups[var13Lifetime1], 0, 0, 0, transformOption);
              } else {
                this.applyMaskedGroupTransform(0, skeleton.transformGroups[var13Lifetime1], 0, 0, 0, transformOption, var14Lifetime1, transformMatrix);
              }
            }
            var14Lifetime1Lifetime1 = transformMask & skeleton.transformMasks[var12Lifetime1];
            if (var14Lifetime1Lifetime1 == 65535) {
              this.applyGroupTransform(skeleton.transformTypes[var12Lifetime1], skeleton.transformGroups[var12Lifetime1], (int) frame.transformX[var11Lifetime1], (int) frame.transformY[var11Lifetime1], (int) frame.transformZ[var11Lifetime1], transformOption);
            } else {
              this.applyMaskedGroupTransform(skeleton.transformTypes[var12Lifetime1], skeleton.transformGroups[var12Lifetime1], (int) frame.transformX[var11Lifetime1], (int) frame.transformY[var11Lifetime1], (int) frame.transformZ[var11Lifetime1], transformOption, var14Lifetime1Lifetime1, transformMatrix);
            }
          }
        }
    }

    abstract boolean beginAnimation();

    abstract void applyGroupTransform(int transformType, int[] groups, int x, int y, int z, boolean transformOption);

    abstract void scaleGeometry(int scaleX, int scaleY, int scaleZ);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7);

    abstract ModelMeshBase a(boolean param0, boolean param1, boolean param2);

    abstract void applyMaskedGroupTransform(int transformType, int[] groups, int x, int y, int z, boolean transformOption, int transformMask, int[] transformMatrix);

    final void applyAnimationFrame(AnimationFrameSet frameSet, int frameId, AnimationFrameSet nextFrameSet, int nextFrameId, int elapsed, int duration, boolean transformOption) {
        if (frameId == -1) {
          return;
        }
        if (!this.beginAnimation()) {
          return;
        }
        AnimationFrame var8 = frameSet.frames[frameId];
        AnimationSkeleton var9 = var8.skeleton;
        Object var10 = null;
        if (nextFrameSet != null) {
          var10 = nextFrameSet.frames[nextFrameId];
          if (((AnimationFrame) (var10)).skeleton != var9) {
            var10 = null;
          }
        }
        this.blendAnimationFrames(var9, var8, (AnimationFrame) (var10), elapsed, duration, (boolean[]) null, false, transformOption, 65535, (int[]) null);
        this.finishAnimation();
    }

    ModelMeshBase() {
    }

    abstract void finishAnimation();
}
