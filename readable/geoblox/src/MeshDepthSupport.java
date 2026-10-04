/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshDepthSupport {
    static Sprite avatarMaskRaster;

    public static void releaseStaticReferences(boolean repeatClearGuard) {
        try {
            avatarMaskRaster = null;
            if (repeatClearGuard) {
                avatarMaskRaster = (Sprite) null;
            }
        } catch (RuntimeException maskReleaseFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) maskReleaseFailure), "i.A(" + repeatClearGuard + ')');
        }
    }

    final static GameplayEntity findOutermostAttachedEntity(byte methodGuard) {
        float maxDistanceSquared = 0.0f;
        RuntimeException outermostSearchFailureForContext = null;
        Object farthestEntity = null;
        GameplayEntity candidateEntity = null;
        float candidateDistanceSquared = 0.0f;
        int controlFlowGuard = 0;
        Object outermostEntityResult = null;
        RuntimeException caughtOutermostSearchFailure = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          maxDistanceSquared = 1.401298464324817e-45f;
          farthestEntity = null;
          candidateEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.lastForIteration(false));
          if (methodGuard >= -127) {
            MeshDepthSupport.releaseStaticReferences(false);
          }
          while (null != candidateEntity) {
            candidateDistanceSquared = (-240.0f + candidateEntity.positionY) * (-240.0f + candidateEntity.positionY) + (-320.0f + candidateEntity.positionX) * (candidateEntity.positionX - 320.0f);
            if (maxDistanceSquared < candidateDistanceSquared) {
              maxDistanceSquared = candidateDistanceSquared;
              farthestEntity = candidateEntity;
            }
            candidateEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.previousForIteration(0));
            if (controlFlowGuard == 0) {
              continue;
            }
            break;
          }
          outermostEntityResult = farthestEntity;
          return (GameplayEntity) (outermostEntityResult);
        } catch (java.lang.RuntimeException outermostSearchFailure) {
          caughtOutermostSearchFailure = outermostSearchFailure;
          outermostSearchFailureForContext = caughtOutermostSearchFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) outermostSearchFailureForContext), "i.D(" + methodGuard + ')');
        }
    }

    final static void drawMainRasterToCanvas(int drawX, byte methodGuard, java.awt.Canvas canvas, int drawY) {
        java.awt.Graphics canvasGraphics = null;
        int guardResidue = 0;
        RuntimeException presentationFailureCause = null;
        StringBuilder presentationFailurePrefix = null;
        String canvasArgumentDescription = null;
        Throwable caughtPresentationFailure = null;
        Exception repaintFallbackFailure = null;
        RuntimeException presentationFailureForContext = null;
        try {
          try {
            canvasGraphics = canvas.getGraphics();
            SingleChildWidget.mainRasterBuffer.drawImage(drawY, canvasGraphics, drawX, 0);
            guardResidue = 56 % ((-32 - methodGuard) / 59);
            canvasGraphics.dispose();
          } catch (java.lang.Exception drawOrDisposeFailure) {
            caughtPresentationFailure = drawOrDisposeFailure;
            repaintFallbackFailure = (Exception) (Object) caughtPresentationFailure;
            canvas.repaint();
          }
          return;
        } catch (java.lang.RuntimeException presentationFailure) {
          caughtPresentationFailure = presentationFailure;
          presentationFailureForContext = (RuntimeException) (Object) caughtPresentationFailure;
          presentationFailureCause = presentationFailureForContext;
          presentationFailurePrefix = new StringBuilder().append("i.C(").append(drawX).append(',').append(methodGuard).append(',');
          if (canvas == null) {
            canvasArgumentDescription = "null";
          } else {
            canvasArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) presentationFailureCause), ((StringBuilder) (Object) presentationFailurePrefix).append(canvasArgumentDescription).append(',').append(drawY).append(')').toString());
        }
    }

    final static void queueMeshFacesByDepth(int minimumVisibleDepth, byte methodGuard, TriangleMesh mesh, int maximumVisibleDepth, boolean cullBackfaces) {
        byte facePriority = 0;
        boolean cullBackfacesSnapshot = false;
        int scaledRelativeDepthSum = 0;
        int bucketIndexOrFaceOrderIndex = 0;
        int cullFlagOrPriorityLoopSentinel = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String meshContextDescription = null;
        RuntimeException caughtFailure = null;
        boolean cullBackfacesCarrier;
        int depthRangeBitLength = 0;
        RuntimeException contextFailure = null;
        int minimumDepthTimesThree = 0;
        int depthBucketShift = 0;
        int faceIndexOrPriorityPrefix = 0;
        int vertexAOrPriorityIndex = 0;
        int vertexBOrPriorityCount = 0;
        int vertexC = 0;
        int projectedAXOrVertexADepth = 0;
        int projectedAYOrVertexBDepth = 0;
        int edgeBXOrVertexCDepth = 0;
        int edgeCXOrRelativeDepthSum = 0;
        int edgeBYOrDepthBucketIndex = 0;
        int edgeCYOrBucketOccupancy = 0;
        int faceOrderWriteIndex = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          depthRangeBitLength = SpriteConstructionSupport.unsignedBitLength((byte) 58, (maximumVisibleDepth - minimumVisibleDepth) * 3);
          minimumDepthTimesThree = minimumVisibleDepth * 3;
          depthBucketShift = depthRangeBitLength - 10;
          ResizableDialog.clearMeshDepthBucketCounts(0);
          if ((mesh.facePriorityCount > 0) &&
              (null != mesh.facePriorities)) {
            DelayedIncomingPacket.clearMeshPriorityCounts((byte) -35);
          }
          GameApplet.queuedMeshFaceCount = 0;
          faceIndexOrPriorityPrefix = 0;
          while (true) {
            if (!(faceIndexOrPriorityPrefix < mesh.faceCount)) {
              cullFlagOrPriorityLoopSentinel = -1;
              break;
            }
            vertexAOrPriorityIndex = mesh.faceVertexA[faceIndexOrPriorityPrefix];
            vertexBOrPriorityCount = mesh.faceVertexB[faceIndexOrPriorityPrefix];
            vertexC = mesh.faceVertexC[faceIndexOrPriorityPrefix];
            cullBackfacesCarrier = cullBackfaces;
            cullFlagOrPriorityLoopSentinel = cullBackfacesCarrier ? 1 : 0;
            cullBackfacesSnapshot = cullBackfacesCarrier;
            if (controlFlagSnapshot == 0) {
              faceVisibilityAndDepthQueue: {
                if (cullBackfacesSnapshot) {
                  projectedAXOrVertexADepth = SingleChildWidget.projectedMeshVertexX[vertexAOrPriorityIndex];
                  projectedAYOrVertexBDepth = TextInputWidget.projectedMeshVertexY[vertexAOrPriorityIndex];
                  edgeBXOrVertexCDepth = SingleChildWidget.projectedMeshVertexX[vertexBOrPriorityCount] - projectedAXOrVertexADepth;
                  edgeCXOrRelativeDepthSum = SingleChildWidget.projectedMeshVertexX[vertexC] - projectedAXOrVertexADepth;
                  edgeBYOrDepthBucketIndex = TextInputWidget.projectedMeshVertexY[vertexBOrPriorityCount] - projectedAYOrVertexBDepth;
                  edgeCYOrBucketOccupancy = -projectedAYOrVertexBDepth + TextInputWidget.projectedMeshVertexY[vertexC];
                  if (-(edgeBYOrDepthBucketIndex * edgeCXOrRelativeDepthSum) + edgeBXOrVertexCDepth * edgeCYOrBucketOccupancy >= 0) {
                    break faceVisibilityAndDepthQueue;
                  }
                }
                projectedAXOrVertexADepth = CachedArchiveSource.projectedMeshVertexDepth[vertexAOrPriorityIndex];
                if ((-2147483648 == projectedAXOrVertexADepth)) {
                  break faceVisibilityAndDepthQueue;
                }
                projectedAYOrVertexBDepth = CachedArchiveSource.projectedMeshVertexDepth[vertexBOrPriorityCount];
                if ((-2147483648 == projectedAYOrVertexBDepth)) {
                  break faceVisibilityAndDepthQueue;
                }
                edgeBXOrVertexCDepth = CachedArchiveSource.projectedMeshVertexDepth[vertexC];
                if (edgeBXOrVertexCDepth != -2147483648) {
                  edgeCXOrRelativeDepthSum = projectedAYOrVertexBDepth + (projectedAXOrVertexADepth + edgeBXOrVertexCDepth - minimumDepthTimesThree);
                  if (depthBucketShift < 0) {
                    scaledRelativeDepthSum = edgeCXOrRelativeDepthSum << -depthBucketShift;
                  } else {
                    scaledRelativeDepthSum = edgeCXOrRelativeDepthSum >> depthBucketShift;
                  }
                  edgeBYOrDepthBucketIndex = -scaledRelativeDepthSum + (-1 + GameApplet.meshFaceCountsByDepthBucket.length);
                  edgeCYOrBucketOccupancy = GameApplet.meshFaceCountsByDepthBucket[edgeBYOrDepthBucketIndex];
                  while (true) {
                    if (edgeCYOrBucketOccupancy >> 4 != 0) {
                      edgeBYOrDepthBucketIndex--;
                      bucketIndexOrFaceOrderIndex = edgeBYOrDepthBucketIndex;
                      if (bucketIndexOrFaceOrderIndex < 0) {
                        System.err.println("Out of range!");
                        break;
                      }
                      edgeCYOrBucketOccupancy = GameApplet.meshFaceCountsByDepthBucket[edgeBYOrDepthBucketIndex];
                      continue;
                    }
                    bucketIndexOrFaceOrderIndex = (edgeBYOrDepthBucketIndex << 4) + edgeCYOrBucketOccupancy;
                    faceOrderWriteIndex = bucketIndexOrFaceOrderIndex;
                    InstrumentNoteMask.meshFaceOrder[faceOrderWriteIndex] = faceIndexOrPriorityPrefix;
                    GameApplet.meshFaceCountsByDepthBucket[edgeBYOrDepthBucketIndex] = 1 + edgeCYOrBucketOccupancy;
                    if ((0 < mesh.facePriorityCount) &&
                        (null != mesh.facePriorities)) {
                      facePriority = mesh.facePriorities[faceIndexOrPriorityPrefix];
                      PasswordWidgetRenderer.meshFacePriorityWriteOffsets[facePriority] = PasswordWidgetRenderer.meshFacePriorityWriteOffsets[facePriority] + 1;
                    }
                    GameApplet.queuedMeshFaceCount = GameApplet.queuedMeshFaceCount + 1;
                    break;
                  }
                }
              }
              faceIndexOrPriorityPrefix++;
              continue;
            }
            break;
          }
          if ((cullFlagOrPriorityLoopSentinel > ~mesh.facePriorityCount) &&
              (null != mesh.facePriorities)) {
            faceIndexOrPriorityPrefix = 0;
            vertexAOrPriorityIndex = 0;
            while (!(PasswordWidgetRenderer.meshFacePriorityWriteOffsets.length <= vertexAOrPriorityIndex)) {
              vertexBOrPriorityCount = PasswordWidgetRenderer.meshFacePriorityWriteOffsets[vertexAOrPriorityIndex];
              PasswordWidgetRenderer.meshFacePriorityWriteOffsets[vertexAOrPriorityIndex] = faceIndexOrPriorityPrefix;
              faceIndexOrPriorityPrefix = faceIndexOrPriorityPrefix + vertexBOrPriorityCount;
              vertexAOrPriorityIndex++;
              if (controlFlagSnapshot != 0) {
                return;
              }
              continue;
            }
          }
          if (methodGuard != 22) {
            avatarMaskRaster = (Sprite) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = contextFailure;
          failureContextBuilder = new StringBuilder().append("i.B(").append(minimumVisibleDepth).append(',').append(methodGuard).append(',');
          if (mesh == null) {
            meshContextDescription = "null";
          } else {
            meshContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(meshContextDescription).append(',').append(maximumVisibleDepth).append(',').append(cullBackfaces).append(')').toString());
        }
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void queueMeshFacesByDepthWithIntegerGuard(int minimumVisibleDepth, int integerMethodGuard, TriangleMesh mesh, int maximumVisibleDepth, boolean cullBackfaces) {
        byte facePriority = 0;
        boolean cullBackfacesSnapshot = false;
        int scaledRelativeDepthSum = 0;
        int bucketIndexOrFaceOrderIndex = 0;
        int cullFlagOrPriorityLoopSentinel = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String meshContextDescription = null;
        RuntimeException caughtFailure = null;
        boolean cullBackfacesCarrier;
        int depthRangeBitLength = 0;
        RuntimeException contextFailure = null;
        int minimumDepthTimesThree = 0;
        int depthBucketShift = 0;
        int faceIndexOrPriorityPrefix = 0;
        int vertexAOrPriorityIndex = 0;
        int vertexBOrPriorityCount = 0;
        int vertexC = 0;
        int projectedAXOrVertexADepth = 0;
        int projectedAYOrVertexBDepth = 0;
        int edgeBXOrVertexCDepth = 0;
        int edgeCXOrRelativeDepthSum = 0;
        int edgeBYOrDepthBucketIndex = 0;
        int edgeCYOrBucketOccupancy = 0;
        int faceOrderWriteIndex = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          depthRangeBitLength = SpriteConstructionSupport.unsignedBitLength((byte) 58, (maximumVisibleDepth - minimumVisibleDepth) * 3);
          minimumDepthTimesThree = minimumVisibleDepth * 3;
          depthBucketShift = depthRangeBitLength - 10;
          ResizableDialog.clearMeshDepthBucketCounts(0);
          if ((mesh.facePriorityCount > 0) &&
              (null != mesh.facePriorities)) {
            DelayedIncomingPacket.clearMeshPriorityCounts((byte) -35);
          }
          GameApplet.queuedMeshFaceCount = 0;
          faceIndexOrPriorityPrefix = 0;
          while (true) {
            if (!(faceIndexOrPriorityPrefix < mesh.faceCount)) {
              cullFlagOrPriorityLoopSentinel = -1;
              break;
            }
            vertexAOrPriorityIndex = mesh.faceVertexA[faceIndexOrPriorityPrefix];
            vertexBOrPriorityCount = mesh.faceVertexB[faceIndexOrPriorityPrefix];
            vertexC = mesh.faceVertexC[faceIndexOrPriorityPrefix];
            cullBackfacesCarrier = cullBackfaces;
            cullFlagOrPriorityLoopSentinel = cullBackfacesCarrier ? 1 : 0;
            cullBackfacesSnapshot = cullBackfacesCarrier;
            if (controlFlagSnapshot == 0) {
              faceVisibilityAndDepthQueue: {
                if (cullBackfacesSnapshot) {
                  projectedAXOrVertexADepth = SingleChildWidget.projectedMeshVertexX[vertexAOrPriorityIndex];
                  projectedAYOrVertexBDepth = TextInputWidget.projectedMeshVertexY[vertexAOrPriorityIndex];
                  edgeBXOrVertexCDepth = SingleChildWidget.projectedMeshVertexX[vertexBOrPriorityCount] - projectedAXOrVertexADepth;
                  edgeCXOrRelativeDepthSum = SingleChildWidget.projectedMeshVertexX[vertexC] - projectedAXOrVertexADepth;
                  edgeBYOrDepthBucketIndex = TextInputWidget.projectedMeshVertexY[vertexBOrPriorityCount] - projectedAYOrVertexBDepth;
                  edgeCYOrBucketOccupancy = -projectedAYOrVertexBDepth + TextInputWidget.projectedMeshVertexY[vertexC];
                  if (-(edgeBYOrDepthBucketIndex * edgeCXOrRelativeDepthSum) + edgeBXOrVertexCDepth * edgeCYOrBucketOccupancy >= 0) {
                    break faceVisibilityAndDepthQueue;
                  }
                }
                projectedAXOrVertexADepth = CachedArchiveSource.projectedMeshVertexDepth[vertexAOrPriorityIndex];
                if ((-2147483648 == projectedAXOrVertexADepth)) {
                  break faceVisibilityAndDepthQueue;
                }
                projectedAYOrVertexBDepth = CachedArchiveSource.projectedMeshVertexDepth[vertexBOrPriorityCount];
                if ((-2147483648 == projectedAYOrVertexBDepth)) {
                  break faceVisibilityAndDepthQueue;
                }
                edgeBXOrVertexCDepth = CachedArchiveSource.projectedMeshVertexDepth[vertexC];
                if (edgeBXOrVertexCDepth != -2147483648) {
                  edgeCXOrRelativeDepthSum = projectedAYOrVertexBDepth + (projectedAXOrVertexADepth + edgeBXOrVertexCDepth - minimumDepthTimesThree);
                  if (depthBucketShift < 0) {
                    scaledRelativeDepthSum = edgeCXOrRelativeDepthSum << -depthBucketShift;
                  } else {
                    scaledRelativeDepthSum = edgeCXOrRelativeDepthSum >> depthBucketShift;
                  }
                  edgeBYOrDepthBucketIndex = -scaledRelativeDepthSum + (-1 + GameApplet.meshFaceCountsByDepthBucket.length);
                  edgeCYOrBucketOccupancy = GameApplet.meshFaceCountsByDepthBucket[edgeBYOrDepthBucketIndex];
                  while (true) {
                    if (edgeCYOrBucketOccupancy >> 4 != 0) {
                      edgeBYOrDepthBucketIndex--;
                      bucketIndexOrFaceOrderIndex = edgeBYOrDepthBucketIndex;
                      if (bucketIndexOrFaceOrderIndex < 0) {
                        System.err.println("Out of range!");
                        break;
                      }
                      edgeCYOrBucketOccupancy = GameApplet.meshFaceCountsByDepthBucket[edgeBYOrDepthBucketIndex];
                      continue;
                    }
                    bucketIndexOrFaceOrderIndex = (edgeBYOrDepthBucketIndex << 4) + edgeCYOrBucketOccupancy;
                    faceOrderWriteIndex = bucketIndexOrFaceOrderIndex;
                    InstrumentNoteMask.meshFaceOrder[faceOrderWriteIndex] = faceIndexOrPriorityPrefix;
                    GameApplet.meshFaceCountsByDepthBucket[edgeBYOrDepthBucketIndex] = 1 + edgeCYOrBucketOccupancy;
                    if ((0 < mesh.facePriorityCount) &&
                        (null != mesh.facePriorities)) {
                      facePriority = mesh.facePriorities[faceIndexOrPriorityPrefix];
                      PasswordWidgetRenderer.meshFacePriorityWriteOffsets[facePriority] = PasswordWidgetRenderer.meshFacePriorityWriteOffsets[facePriority] + 1;
                    }
                    GameApplet.queuedMeshFaceCount = GameApplet.queuedMeshFaceCount + 1;
                    break;
                  }
                }
              }
              faceIndexOrPriorityPrefix++;
              continue;
            }
            break;
          }
          if ((cullFlagOrPriorityLoopSentinel > ~mesh.facePriorityCount) &&
              (null != mesh.facePriorities)) {
            faceIndexOrPriorityPrefix = 0;
            vertexAOrPriorityIndex = 0;
            while (!(PasswordWidgetRenderer.meshFacePriorityWriteOffsets.length <= vertexAOrPriorityIndex)) {
              vertexBOrPriorityCount = PasswordWidgetRenderer.meshFacePriorityWriteOffsets[vertexAOrPriorityIndex];
              PasswordWidgetRenderer.meshFacePriorityWriteOffsets[vertexAOrPriorityIndex] = faceIndexOrPriorityPrefix;
              faceIndexOrPriorityPrefix = faceIndexOrPriorityPrefix + vertexBOrPriorityCount;
              vertexAOrPriorityIndex++;
              if (controlFlagSnapshot != 0) {
                return;
              }
              continue;
            }
          }
          if (integerMethodGuard != 22) {
            avatarMaskRaster = (Sprite) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = contextFailure;
          failureContextBuilder = new StringBuilder().append("i.B(").append(minimumVisibleDepth).append(',').append(integerMethodGuard).append(',');
          if (mesh == null) {
            meshContextDescription = "null";
          } else {
            meshContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(meshContextDescription).append(',').append(maximumVisibleDepth).append(',').append(cullBackfaces).append(')').toString());
        }
    }
}
