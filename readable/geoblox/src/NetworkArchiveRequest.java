/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    static int field_w;
    static PlatformTask field_B;
    ByteArrayBuffer responseBuffer;
    byte reservedTailBytes;
    static byte[][] byteArrayPool30000;
    int blockPosition;
    static int field_x;
    static Sprite barSprite;
    static String settingsCookieValue;

    public static void e(byte param0) {
        if (param0 < 88) {
            return;
        }
        barSprite = null;
        settingsCookieValue = null;
        field_B = null;
        byteArrayPool30000 = (byte[][]) null;
    }

    final byte[] getBytes(int methodGuard) {
        if (this.pending) {
            throw new RuntimeException();
        }
        if (this.responseBuffer.position >= this.responseBuffer.bytes.length - this.reservedTailBytes) {
            if (methodGuard != 397) {
                this.getProgress(-105);
            }
            return this.responseBuffer.bytes;
        }
        throw new RuntimeException();
    }

    final static IndexedSprite[] loadIndexedSpriteFramesById(boolean methodGuard, ResourceArchive graphicsArchive, int fileId, int groupId) {
        RuntimeException spriteLoadFailure = null;
        IndexedSprite[] guardedNullResult = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String archiveContextDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (!methodGuard) {
            guardedNullResult = (IndexedSprite[]) null;
            return guardedNullResult;
          }
          if (mf.decodeSpritesFromArchive(fileId, groupId, 104, graphicsArchive)) {
            return ArchiveNetworkClient.buildIndexedSpritesFromDecodedSheet(0);
          }
          return null;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          spriteLoadFailure = caughtFailure;
          failureContextCause = spriteLoadFailure;
          failureContextBuilder = new StringBuilder().append("sd.H(").append(methodGuard).append(',');
          if (graphicsArchive == null) {
            archiveContextDescription = "null";
          } else {
            archiveContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(archiveContextDescription).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    final static void drawSortedHalfBlendSolidTriangle(int middleX, int topX, int halfRgb, int guard, int[] destinationPixels, int bottomY, int bottomX, int middleY, int topY) {
        RuntimeException triangleFailureBeforeContext = null;
        StringBuilder triangleMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtTriangleFailure = null;
        int leftXQ16 = 0;
        RuntimeException triangleFailure = null;
        int rightXQ16 = 0;
        int leftXStepQ16 = 0;
        int rightXStepQ16 = 0;
        int middleVertexOnRight = 0;
        int topToBottomRows = 0;
        int edgeSegmentRowsThenRowBase = 0;
        int edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder = 0;
        int spanStartOrBottomXQ16 = 0;
        int spanWidth = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if ((bottomY >= 0) &&
              (topY < TriangleRasterState.clipHeight)) {
            if ((0 > topX) &&
                (middleX < 0) &&
                (bottomX < 0)) {
              return;
            }
            if ((topX >= TriangleRasterState.clipWidth) &&
                (middleX >= TriangleRasterState.clipWidth) &&
                (TriangleRasterState.clipWidth <= bottomX)) {
              return;
            }
            topToBottomRows = -topY + bottomY;
            if (middleY == topY) {
              if (topY != bottomY) {
                edgeSegmentRowsThenRowBase = -middleY + bottomY;
                if (middleX > topX) {
                  rightXQ16 = middleX << 16;
                  leftXStepQ16 = (-topX + bottomX << 16) / topToBottomRows;
                  leftXQ16 = topX << 16;
                  rightXStepQ16 = (bottomX - middleX << 16) / edgeSegmentRowsThenRowBase;
                } else {
                  rightXQ16 = topX << 16;
                  leftXStepQ16 = (bottomX - middleX << 16) / edgeSegmentRowsThenRowBase;
                  leftXQ16 = middleX << 16;
                  rightXStepQ16 = (-topX + bottomX << 16) / topToBottomRows;
                }
              } else {
                leftXStepQ16 = 0;
                rightXQ16 = middleX << 16;
                leftXQ16 = topX << 16;
                rightXStepQ16 = 0;
              }
              middleVertexOnRight = 0;
              if (topY < 0) {
                topY = Math.min(-topY, -topY + middleY);
                rightXQ16 = rightXQ16 + rightXStepQ16 * topY;
                leftXQ16 = leftXQ16 + topY * leftXStepQ16;
                topY = 0;
              }
            } else {
              rightXQ16 = topX << 16;
              leftXQ16 = topX << 16;
              edgeSegmentRowsThenRowBase = -topY + middleY;
              leftXStepQ16 = (-topX + middleX << 16) / edgeSegmentRowsThenRowBase;
              rightXStepQ16 = (bottomX - topX << 16) / topToBottomRows;
              if (rightXStepQ16 > leftXStepQ16) {
                middleVertexOnRight = 0;
              } else {
                middleVertexOnRight = 1;
                edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder = leftXStepQ16;
                leftXStepQ16 = rightXStepQ16;
                rightXStepQ16 = edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder;
              }
              L6: {
                if (0 > topY) {
                  if (middleY < 0) {
                    topY = middleY - topY;
                    leftXQ16 = leftXQ16 + leftXStepQ16 * topY;
                    rightXQ16 = rightXQ16 + rightXStepQ16 * topY;
                    topY = middleY;
                    break L6;
                  }
                  topY = -topY;
                  rightXQ16 = rightXQ16 + rightXStepQ16 * topY;
                  leftXQ16 = leftXQ16 + leftXStepQ16 * topY;
                  topY = 0;
                }
                edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder = TriangleRasterState.rowBaseOffsets[topY];
                while (topY < middleY) {
                  spanStartOrBottomXQ16 = leftXQ16 >> 16;
                  if (TriangleRasterState.clipWidth > spanStartOrBottomXQ16) {
                    spanWidth = (rightXQ16 >> 16) - (leftXQ16 >> 16);
                    if (spanWidth != 0) {
                      if (spanStartOrBottomXQ16 + spanWidth >= TriangleRasterState.clipWidth) {
                        spanWidth = -1 + (-spanStartOrBottomXQ16 + TriangleRasterState.clipWidth);
                      }
                      if (0 <= spanStartOrBottomXQ16) {
                        DebouncedValidationProvider.drawHalfBlendSolidSpan(47, destinationPixels, edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder + spanStartOrBottomXQ16, halfRgb, spanWidth);
                      } else {
                        DebouncedValidationProvider.drawHalfBlendSolidSpan(57, destinationPixels, edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder, halfRgb, spanStartOrBottomXQ16 + spanWidth);
                      }
                    } else {
                      if ((spanStartOrBottomXQ16 >= 0) &&
                          (TriangleRasterState.clipWidth > spanStartOrBottomXQ16)) {
                        DebouncedValidationProvider.drawHalfBlendSolidSpan(-61, destinationPixels, spanStartOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder, halfRgb, spanWidth);
                      }
                    }
                  }
                  topY++;
                  if (topY >= TriangleRasterState.clipHeight) {
                    return;
                  }
                  edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder = edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder + SoftwareRasterizer.stride;
                  leftXQ16 = leftXQ16 + leftXStepQ16;
                  rightXQ16 = rightXQ16 + rightXStepQ16;
                }
              }
              edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder = -middleY + bottomY;
              if (edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder == 0) {
                rightXStepQ16 = 0;
                leftXStepQ16 = 0;
              } else {
                spanStartOrBottomXQ16 = bottomX << 16;
                if (middleVertexOnRight == 0) {
                  leftXQ16 = middleX << 16;
                } else {
                  rightXQ16 = middleX << 16;
                }
                leftXStepQ16 = (spanStartOrBottomXQ16 - leftXQ16) / edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder;
                rightXStepQ16 = (spanStartOrBottomXQ16 - rightXQ16) / edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder;
              }
            }
            if (0 > topY) {
              topY = -topY;
              rightXQ16 = rightXQ16 + rightXStepQ16 * topY;
              leftXQ16 = leftXQ16 + topY * leftXStepQ16;
              topY = 0;
            }
            edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder = -91 % ((guard - 74) / 33);
            edgeSegmentRowsThenRowBase = TriangleRasterState.rowBaseOffsets[topY];
            while (bottomY > topY) {
              spanStartOrBottomXQ16 = leftXQ16 >> 16;
              if (TriangleRasterState.clipWidth > spanStartOrBottomXQ16) {
                spanWidth = (rightXQ16 >> 16) - (leftXQ16 >> 16);
                if (spanWidth == 0) {
                  if ((spanStartOrBottomXQ16 >= 0) &&
                      (TriangleRasterState.clipWidth > spanStartOrBottomXQ16)) {
                    DebouncedValidationProvider.drawHalfBlendSolidSpan(-67, destinationPixels, spanStartOrBottomXQ16 + edgeSegmentRowsThenRowBase, halfRgb, spanWidth);
                  }
                } else {
                  if (TriangleRasterState.clipWidth <= spanWidth + spanStartOrBottomXQ16) {
                    spanWidth = -spanStartOrBottomXQ16 + TriangleRasterState.clipWidth - 1;
                  }
                  if (0 > spanStartOrBottomXQ16) {
                    DebouncedValidationProvider.drawHalfBlendSolidSpan(127, destinationPixels, edgeSegmentRowsThenRowBase, halfRgb, spanStartOrBottomXQ16 + spanWidth);
                  } else {
                    DebouncedValidationProvider.drawHalfBlendSolidSpan(115, destinationPixels, spanStartOrBottomXQ16 + edgeSegmentRowsThenRowBase, halfRgb, spanWidth);
                  }
                }
              }
              topY++;
              if (TriangleRasterState.clipHeight <= topY) {
                return;
              }
              leftXQ16 = leftXQ16 + leftXStepQ16;
              rightXQ16 = rightXQ16 + rightXStepQ16;
              edgeSegmentRowsThenRowBase = edgeSegmentRowsThenRowBase + SoftwareRasterizer.stride;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtTriangleParameter) {
          caughtTriangleFailure = caughtTriangleParameter;
          triangleFailure = caughtTriangleFailure;
          triangleFailureBeforeContext = triangleFailure;
          triangleMessagePrefix = new StringBuilder().append("sd.E(").append(middleX).append(',').append(topX).append(',').append(halfRgb).append(',').append(guard).append(',');
          if (destinationPixels == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) triangleFailureBeforeContext), ((StringBuilder) (Object) triangleMessagePrefix).append(destinationDescription).append(',').append(bottomY).append(',').append(bottomX).append(',').append(middleY).append(',').append(topY).append(')').toString());
        }
    }

    final int getProgress(int methodGuard) {
        if (methodGuard != 0) {
            return 76;
        }
        if (null != this.responseBuffer) {
            return 100 * this.responseBuffer.position / (-this.reservedTailBytes + this.responseBuffer.bytes.length);
        }
        return 0;
    }

    NetworkArchiveRequest() {
    }

    final static void h(int param0) {
        MidiNote.a(17, false);
        int var1 = -24 / ((param0 + 4) / 34);
    }

    static {
        byteArrayPool30000 = new byte[50][];
        DiskCacheWorker.a(116, 50);
    }
}
