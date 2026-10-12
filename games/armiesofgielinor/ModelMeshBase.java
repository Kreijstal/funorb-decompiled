/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModelMeshBase extends MeshObject {
    private final void blendAnimationFrames(AnimationSkeleton skeleton, AnimationFrame frame, AnimationFrame nextFrame, int elapsed, int duration, boolean[] slotSelection, boolean selectedValue, boolean transformOption, int transformMask, int[] transformMatrix) {
        int initialFrameCursor;
        int initialNextFrameCursor;
        int initialSlotCursor;
        int frameHasSlot;
        int nextFrameHasSlot;
        int defaultComponent;
        int transformType;
        int frameX;
        int frameY;
        int frameZ;
        int framePivotSlot;
        int frameFlags;
        int nextX;
        int nextY;
        int nextZ;
        int nextPivotSlot;
        int nextFlags;
        int blendedX;
        int blendedY;
        int blendedZ;
        int wrappedXOrHueDelta;
        int wrappedYDelta;
        int wrappedZDelta;
        int frameCursor;
        int nextFrameCursor;
        int slot;
        int singleFrameCursor;
        int singleFrameSlot;
        int singleFramePivotSlot;
        int singleFramePivotMask;
        int pivotMask;
        int slotMask;
        int singleFrameSlotMask;
        if (nextFrame != null &&
          elapsed != 0) {
          frameCursor = 0;
          initialFrameCursor = frameCursor;
          nextFrameCursor = 0;
          initialNextFrameCursor = nextFrameCursor;
          slot = 0;
          initialSlotCursor = slot;
          while (slot < skeleton.transformCount) {
            frameHasSlot = 0;
            if (frameCursor < frame.transformCount &&
              frame.transformSlots[frameCursor] == slot) {
              frameHasSlot = 1;
            }
            nextFrameHasSlot = 0;
            if (nextFrameCursor < nextFrame.transformCount &&
              nextFrame.transformSlots[nextFrameCursor] == slot) {
              nextFrameHasSlot = 1;
            }
            if (frameHasSlot != 0 ||
              nextFrameHasSlot != 0) {
              if (slotSelection != null &&
                slotSelection[slot] != selectedValue &&
                skeleton.transformTypes[slot] != 0) {
                if (frameHasSlot != 0) {
                  frameCursor++;
                }
                if (nextFrameHasSlot != 0) {
                  nextFrameCursor++;
                }
              } else {
                defaultComponent = 0;
                transformType = skeleton.transformTypes[slot];
                if (transformType == 3) {
                  defaultComponent = 128;
                }
                if (frameHasSlot == 0) {
                  frameX = defaultComponent;
                  frameY = defaultComponent;
                  frameZ = defaultComponent;
                  framePivotSlot = -1;
                  frameFlags = 0;
                } else {
                  frameX = frame.transformX[frameCursor];
                  frameY = frame.transformY[frameCursor];
                  frameZ = frame.transformZ[frameCursor];
                  framePivotSlot = frame.precedingPivotSlots[frameCursor];
                  frameFlags = frame.interpolationFlags[frameCursor];
                  frameCursor++;
                }
                if (nextFrameHasSlot == 0) {
                  nextX = defaultComponent;
                  nextY = defaultComponent;
                  nextZ = defaultComponent;
                  nextPivotSlot = -1;
                  nextFlags = 0;
                } else {
                  nextX = nextFrame.transformX[nextFrameCursor];
                  nextY = nextFrame.transformY[nextFrameCursor];
                  nextZ = nextFrame.transformZ[nextFrameCursor];
                  nextPivotSlot = nextFrame.precedingPivotSlots[nextFrameCursor];
                  nextFlags = nextFrame.interpolationFlags[nextFrameCursor];
                  nextFrameCursor++;
                }
                if ((frameFlags & 2) == 0 &&
                  (nextFlags & 1) == 0) {
                  if (transformType != 2) {
                    if (transformType != 7) {
                      blendedX = frameX + (nextX - frameX) * elapsed / duration;
                      blendedY = frameY + (nextY - frameY) * elapsed / duration;
                      blendedZ = frameZ + (nextZ - frameZ) * elapsed / duration;
                    } else {
                      wrappedXOrHueDelta = nextX - frameX & 63;
                      if (wrappedXOrHueDelta >= 32) {
                        wrappedXOrHueDelta -= 64;
                      }
                      blendedX = frameX + wrappedXOrHueDelta * elapsed / duration & 63;
                      blendedY = frameY + (nextY - frameY) * elapsed / duration;
                      blendedZ = frameZ + (nextZ - frameZ) * elapsed / duration;
                    }
                  } else {
                    wrappedXOrHueDelta = nextX - frameX & 2047;
                    wrappedYDelta = nextY - frameY & 2047;
                    wrappedZDelta = nextZ - frameZ & 2047;
                    if (wrappedXOrHueDelta >= 1024) {
                      wrappedXOrHueDelta -= 2048;
                    }
                    if (wrappedYDelta >= 1024) {
                      wrappedYDelta -= 2048;
                    }
                    if (wrappedZDelta >= 1024) {
                      wrappedZDelta -= 2048;
                    }
                    blendedX = frameX + wrappedXOrHueDelta * elapsed / duration & 2047;
                    blendedY = frameY + wrappedYDelta * elapsed / duration & 2047;
                    blendedZ = frameZ + wrappedZDelta * elapsed / duration & 2047;
                  }
                } else {
                  blendedX = frameX;
                  blendedY = frameY;
                  blendedZ = frameZ;
                }
                if (framePivotSlot == -1) {
                  if (nextPivotSlot != -1) {
                    pivotMask = transformMask & skeleton.transformMasks[nextPivotSlot];
                    if (pivotMask == 65535) {
                      this.applyGroupTransform(0, skeleton.transformGroups[nextPivotSlot], 0, 0, 0, transformOption);
                    } else {
                      this.applyMaskedGroupTransform(0, skeleton.transformGroups[nextPivotSlot], 0, 0, 0, transformOption, pivotMask, transformMatrix);
                    }
                  }
                } else {
                  pivotMask = transformMask & skeleton.transformMasks[framePivotSlot];
                  if (pivotMask == 65535) {
                    this.applyGroupTransform(0, skeleton.transformGroups[framePivotSlot], 0, 0, 0, transformOption);
                  } else {
                    this.applyMaskedGroupTransform(0, skeleton.transformGroups[framePivotSlot], 0, 0, 0, transformOption, pivotMask, transformMatrix);
                  }
                }
                slotMask = transformMask & skeleton.transformMasks[slot];
                if (slotMask == 65535) {
                  this.applyGroupTransform(transformType, skeleton.transformGroups[slot], blendedX, blendedY, blendedZ, transformOption);
                } else {
                  this.applyMaskedGroupTransform(transformType, skeleton.transformGroups[slot], blendedX, blendedY, blendedZ, transformOption, slotMask, transformMatrix);
                }
              }
            }
            slot++;
          }
          return;
        }
        for (singleFrameCursor = 0; singleFrameCursor < frame.transformCount; singleFrameCursor++) {
          singleFrameSlot = frame.transformSlots[singleFrameCursor];
          if (slotSelection == null ||
            slotSelection[singleFrameSlot] == selectedValue ||
            skeleton.transformTypes[singleFrameSlot] == 0) {
            singleFramePivotSlot = frame.precedingPivotSlots[singleFrameCursor];
            if (singleFramePivotSlot != -1) {
              singleFramePivotMask = transformMask & skeleton.transformMasks[singleFramePivotSlot];
              if (singleFramePivotMask == 65535) {
                this.applyGroupTransform(0, skeleton.transformGroups[singleFramePivotSlot], 0, 0, 0, transformOption);
              } else {
                this.applyMaskedGroupTransform(0, skeleton.transformGroups[singleFramePivotSlot], 0, 0, 0, transformOption, singleFramePivotMask, transformMatrix);
              }
            }
            singleFrameSlotMask = transformMask & skeleton.transformMasks[singleFrameSlot];
            if (singleFrameSlotMask == 65535) {
              this.applyGroupTransform(skeleton.transformTypes[singleFrameSlot], skeleton.transformGroups[singleFrameSlot], (int) frame.transformX[singleFrameCursor], (int) frame.transformY[singleFrameCursor], (int) frame.transformZ[singleFrameCursor], transformOption);
            } else {
              this.applyMaskedGroupTransform(skeleton.transformTypes[singleFrameSlot], skeleton.transformGroups[singleFrameSlot], (int) frame.transformX[singleFrameCursor], (int) frame.transformY[singleFrameCursor], (int) frame.transformZ[singleFrameCursor], transformOption, singleFrameSlotMask, transformMatrix);
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
        AnimationFrame frame = frameSet.frames[frameId];
        AnimationSkeleton skeleton = frame.skeleton;
        Object compatibleNextFrame = null;
        if (nextFrameSet != null) {
          compatibleNextFrame = nextFrameSet.frames[nextFrameId];
          if (((AnimationFrame) (compatibleNextFrame)).skeleton != skeleton) {
            compatibleNextFrame = null;
          }
        }
        this.blendAnimationFrames(skeleton, frame, (AnimationFrame) (compatibleNextFrame), elapsed, duration, (boolean[]) null, false, transformOption, 65535, (int[]) null);
        this.finishAnimation();
    }

    ModelMeshBase() {
    }

    abstract void finishAnimation();
}
