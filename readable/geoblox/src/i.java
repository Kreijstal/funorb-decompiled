/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static Sprite avatarMaskRaster;

    public static void a(boolean param0) {
        try {
            avatarMaskRaster = null;
            if (param0) {
                avatarMaskRaster = (Sprite) null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "i.A(" + param0 + ')');
        }
    }

    final static GameplayEntity findOutermostAttachedEntity(byte methodGuard) {
        float maxDistanceSquared = 0.0f;
        RuntimeException var1 = null;
        Object farthestEntity = null;
        GameplayEntity candidateEntity = null;
        float candidateDistanceSquared = 0.0f;
        int controlFlowGuard = 0;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          maxDistanceSquared = 1.401298464324817e-45f;
          farthestEntity = null;
          candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.lastForIteration(false));
          if (methodGuard >= -127) {
            i.a(false);
          }
          while (null != candidateEntity) {
            candidateDistanceSquared = (-240.0f + candidateEntity.positionY) * (-240.0f + candidateEntity.positionY) + (-320.0f + candidateEntity.positionX) * (candidateEntity.positionX - 320.0f);
            if (maxDistanceSquared < candidateDistanceSquared) {
              maxDistanceSquared = candidateDistanceSquared;
              farthestEntity = candidateEntity;
            }
            candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.previousForIteration(0));
            if (controlFlowGuard == 0) {
              continue;
            }
            break;
          }
          stackIn_11_0 = farthestEntity;
          return (GameplayEntity) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "i.D(" + methodGuard + ')');
        }
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            SingleChildWidget.mainRasterBuffer.drawImage(param3, var4, param0, 0);
            var5 = 56 % ((-32 - param1) / 59);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = var4_ref2;
          stackIn_7_1 = new StringBuilder().append("i.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
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
          depthRangeBitLength = hj.unsignedBitLength((byte) 58, (maximumVisibleDepth - minimumVisibleDepth) * 3);
          minimumDepthTimesThree = minimumVisibleDepth * 3;
          depthBucketShift = depthRangeBitLength - 10;
          ResizableDialog.clearMeshDepthBucketCounts(0);
          if ((mesh.facePriorityCount > 0) &&
              (null != mesh.facePriorities)) {
            ma.clearMeshPriorityCounts((byte) -35);
          }
          GameApplet.queuedMeshFaceCount = 0;
          faceIndexOrPriorityPrefix = 0;
          while (true) {
            L2: {
              if (faceIndexOrPriorityPrefix < mesh.faceCount) {
                vertexAOrPriorityIndex = mesh.faceVertexA[faceIndexOrPriorityPrefix];
                vertexBOrPriorityCount = mesh.faceVertexB[faceIndexOrPriorityPrefix];
                vertexC = mesh.faceVertexC[faceIndexOrPriorityPrefix];
                cullBackfacesCarrier = cullBackfaces;
                cullFlagOrPriorityLoopSentinel = cullBackfacesCarrier ? 1 : 0;
                cullBackfacesSnapshot = cullBackfacesCarrier;
                if (controlFlagSnapshot != 0) {
                  break L2;
                }
                L4: {
                  if (cullBackfacesSnapshot) {
                    projectedAXOrVertexADepth = SingleChildWidget.projectedMeshVertexX[vertexAOrPriorityIndex];
                    projectedAYOrVertexBDepth = TextInputWidget.projectedMeshVertexY[vertexAOrPriorityIndex];
                    edgeBXOrVertexCDepth = SingleChildWidget.projectedMeshVertexX[vertexBOrPriorityCount] - projectedAXOrVertexADepth;
                    edgeCXOrRelativeDepthSum = SingleChildWidget.projectedMeshVertexX[vertexC] - projectedAXOrVertexADepth;
                    edgeBYOrDepthBucketIndex = TextInputWidget.projectedMeshVertexY[vertexBOrPriorityCount] - projectedAYOrVertexBDepth;
                    edgeCYOrBucketOccupancy = -projectedAYOrVertexBDepth + TextInputWidget.projectedMeshVertexY[vertexC];
                    if (-(edgeBYOrDepthBucketIndex * edgeCXOrRelativeDepthSum) + edgeBXOrVertexCDepth * edgeCYOrBucketOccupancy >= 0) {
                      break L4;
                    }
                  }
                  projectedAXOrVertexADepth = CachedArchiveSource.projectedMeshVertexDepth[vertexAOrPriorityIndex];
                  if ((-2147483648 == projectedAXOrVertexADepth) &&
                      (controlFlagSnapshot == 0)) {
                    break L4;
                  }
                  projectedAYOrVertexBDepth = CachedArchiveSource.projectedMeshVertexDepth[vertexBOrPriorityCount];
                  if ((-2147483648 == projectedAYOrVertexBDepth) &&
                      (controlFlagSnapshot == 0)) {
                    break L4;
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
              cullFlagOrPriorityLoopSentinel = -1;
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
          }
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
          depthRangeBitLength = hj.unsignedBitLength((byte) 58, (maximumVisibleDepth - minimumVisibleDepth) * 3);
          minimumDepthTimesThree = minimumVisibleDepth * 3;
          depthBucketShift = depthRangeBitLength - 10;
          ResizableDialog.clearMeshDepthBucketCounts(0);
          if ((mesh.facePriorityCount > 0) &&
              (null != mesh.facePriorities)) {
            ma.clearMeshPriorityCounts((byte) -35);
          }
          GameApplet.queuedMeshFaceCount = 0;
          faceIndexOrPriorityPrefix = 0;
          while (true) {
            L2: {
              if (faceIndexOrPriorityPrefix < mesh.faceCount) {
                vertexAOrPriorityIndex = mesh.faceVertexA[faceIndexOrPriorityPrefix];
                vertexBOrPriorityCount = mesh.faceVertexB[faceIndexOrPriorityPrefix];
                vertexC = mesh.faceVertexC[faceIndexOrPriorityPrefix];
                cullBackfacesCarrier = cullBackfaces;
                cullFlagOrPriorityLoopSentinel = cullBackfacesCarrier ? 1 : 0;
                cullBackfacesSnapshot = cullBackfacesCarrier;
                if (controlFlagSnapshot != 0) {
                  break L2;
                }
                L4: {
                  if (cullBackfacesSnapshot) {
                    projectedAXOrVertexADepth = SingleChildWidget.projectedMeshVertexX[vertexAOrPriorityIndex];
                    projectedAYOrVertexBDepth = TextInputWidget.projectedMeshVertexY[vertexAOrPriorityIndex];
                    edgeBXOrVertexCDepth = SingleChildWidget.projectedMeshVertexX[vertexBOrPriorityCount] - projectedAXOrVertexADepth;
                    edgeCXOrRelativeDepthSum = SingleChildWidget.projectedMeshVertexX[vertexC] - projectedAXOrVertexADepth;
                    edgeBYOrDepthBucketIndex = TextInputWidget.projectedMeshVertexY[vertexBOrPriorityCount] - projectedAYOrVertexBDepth;
                    edgeCYOrBucketOccupancy = -projectedAYOrVertexBDepth + TextInputWidget.projectedMeshVertexY[vertexC];
                    if (-(edgeBYOrDepthBucketIndex * edgeCXOrRelativeDepthSum) + edgeBXOrVertexCDepth * edgeCYOrBucketOccupancy >= 0) {
                      break L4;
                    }
                  }
                  projectedAXOrVertexADepth = CachedArchiveSource.projectedMeshVertexDepth[vertexAOrPriorityIndex];
                  if ((-2147483648 == projectedAXOrVertexADepth) &&
                      (controlFlagSnapshot == 0)) {
                    break L4;
                  }
                  projectedAYOrVertexBDepth = CachedArchiveSource.projectedMeshVertexDepth[vertexBOrPriorityCount];
                  if ((-2147483648 == projectedAYOrVertexBDepth) &&
                      (controlFlagSnapshot == 0)) {
                    break L4;
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
              cullFlagOrPriorityLoopSentinel = -1;
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
          }
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
