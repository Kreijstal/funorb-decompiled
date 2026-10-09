/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementSubmission extends IntrusiveNode {
    int achievementId;
    int primaryTrackingCounterSnapshot;
    static boolean simpleUiMode;
    int achievementCheckByte;
    static PcmResampler gameSoundResampler;
    static int[] retentionCategoryCounts;
    int trackingAccumulatorSnapshot;
    int secondaryTrackingCounterSnapshot;
    static int sessionPacketPayloadLength;
    int trackingBitsSnapshot;

    final static void projectMeshAndQueueFaces(int[] cameraTransform, int[] modelTransform, TriangleMesh mesh, boolean preserveSharedResources, boolean storeCameraCoordinates, boolean cullBackfaces, boolean transformNormals) {
        int nearPlaneOrNormalCapacityOrQueueMinDepth = 0;
        int invertedDepthOrNormalIndexOrQueueGuard = 0;
        RuntimeException failureContextCause = null;
        StringBuilder cameraContextBuilder = null;
        String cameraContextDescription = null;
        StringBuilder modelContextBuilder = null;
        String modelContextDescription = null;
        StringBuilder meshContextBuilder = null;
        String meshContextDescription = null;
        RuntimeException caughtFailure = null;
        int minimumVisibleDepth = 0;
        RuntimeException contextFailure = null;
        int maximumVisibleDepth = 0;
        int cameraTranslationXScaledOrNormalXXQ16 = 0;
        int cameraTranslationYScaledOrNormalYXQ16 = 0;
        int cameraTranslationZOrNormalZXQ16 = 0;
        int cameraXXOrNormalXYQ16 = 0;
        int cameraYXOrNormalYYQ16 = 0;
        int cameraZXOrNormalZYQ16 = 0;
        int cameraXYOrNormalXZQ16 = 0;
        int cameraYYOrNormalYZQ16 = 0;
        int cameraZYOrNormalZZQ16 = 0;
        int cameraXZQ16OrNormalIndex = 0;
        int cameraYZQ16OrNormalX = 0;
        int cameraZZQ16OrNormalY = 0;
        int cameraXBasisOrDeltaXOrClipCenterXOrNormalZ = 0;
        int cameraXBasisOrDeltaYOrClipCenterY = 0;
        int cameraXBasisOrDeltaZOrVertexIndex = 0;
        int cameraYBasisOrVertexX = 0;
        int cameraYBasisOrVertexY = 0;
        int cameraYBasisOrVertexZ = 0;
        int cameraZBasisOrCameraXScaled = 0;
        int cameraZBasisOrCameraYScaled = 0;
        int cameraZBasisOrCameraDepth = 0;
        int controlFlagSnapshot = 0;
        int cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase1;
        int cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2;
        int cameraXBasisOrDeltaYOrClipCenterYLiteralPhase1;
        int cameraXBasisOrDeltaYOrClipCenterYLiteralPhase2;
        int cameraXBasisOrDeltaZOrVertexIndexLiteralPhase1;
        int cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2;
        int cameraYBasisOrVertexXLiteralPhase1;
        int cameraYBasisOrVertexYLiteralPhase1;
        int cameraYBasisOrVertexZLiteralPhase1;
        int cameraZBasisOrCameraXScaledLiteralPhase1;
        int cameraZBasisOrCameraYScaledLiteralPhase1;
        int cameraZBasisOrCameraDepthLiteralPhase1;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          minimumVisibleDepth = 2147483647;
          maximumVisibleDepth = -2147483648;
          cameraXBasisOrDeltaXOrClipCenterXOrNormalZ = cameraTransform[3] >> 2;
          cameraXBasisOrDeltaYOrClipCenterY = cameraTransform[4] >> 2;
          cameraXBasisOrDeltaZOrVertexIndex = cameraTransform[5] >> 2;
          cameraYBasisOrVertexX = cameraTransform[6] >> 2;
          cameraYBasisOrVertexY = cameraTransform[7] >> 2;
          cameraYBasisOrVertexZ = cameraTransform[8] >> 2;
          cameraZBasisOrCameraXScaled = cameraTransform[9] >> 2;
          cameraZBasisOrCameraYScaled = cameraTransform[10] >> 2;
          cameraYXOrNormalYYQ16 = cameraYBasisOrVertexY * modelTransform[4] + (modelTransform[3] * cameraYBasisOrVertexX + cameraYBasisOrVertexZ * modelTransform[5]) >> 14;
          cameraZBasisOrCameraDepth = cameraTransform[11] >> 2;
          cameraXXOrNormalXYQ16 = modelTransform[3] * cameraXBasisOrDeltaXOrClipCenterXOrNormalZ + cameraXBasisOrDeltaYOrClipCenterY * modelTransform[4] + cameraXBasisOrDeltaZOrVertexIndex * modelTransform[5] >> 14;
          cameraXZQ16OrNormalIndex = modelTransform[11] * cameraXBasisOrDeltaZOrVertexIndex + (modelTransform[10] * cameraXBasisOrDeltaYOrClipCenterY + modelTransform[9] * cameraXBasisOrDeltaXOrClipCenterXOrNormalZ) >> 14;
          cameraXYOrNormalXZQ16 = modelTransform[6] * cameraXBasisOrDeltaXOrClipCenterXOrNormalZ - (-(modelTransform[7] * cameraXBasisOrDeltaYOrClipCenterY) - modelTransform[8] * cameraXBasisOrDeltaZOrVertexIndex) >> 14;
          cameraYYOrNormalYZQ16 = cameraYBasisOrVertexY * modelTransform[7] + (cameraYBasisOrVertexX * modelTransform[6] + cameraYBasisOrVertexZ * modelTransform[8]) >> 14;
          cameraZXOrNormalZYQ16 = cameraZBasisOrCameraDepth * modelTransform[5] + modelTransform[3] * cameraZBasisOrCameraXScaled + modelTransform[4] * cameraZBasisOrCameraYScaled >> 14;
          cameraYZQ16OrNormalX = modelTransform[10] * cameraYBasisOrVertexY + cameraYBasisOrVertexX * modelTransform[9] + modelTransform[11] * cameraYBasisOrVertexZ >> 14;
          cameraZZQ16OrNormalY = cameraZBasisOrCameraXScaled * modelTransform[9] + cameraZBasisOrCameraYScaled * modelTransform[10] + modelTransform[11] * cameraZBasisOrCameraDepth >> 14;
          cameraZYOrNormalZZQ16 = modelTransform[8] * cameraZBasisOrCameraDepth + modelTransform[6] * cameraZBasisOrCameraXScaled + cameraZBasisOrCameraYScaled * modelTransform[7] >> 14;
          cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase1 = modelTransform[0] - cameraTransform[0];
          cameraXBasisOrDeltaYOrClipCenterYLiteralPhase1 = -cameraTransform[1] + modelTransform[1];
          cameraXBasisOrDeltaZOrVertexIndexLiteralPhase1 = modelTransform[2] - cameraTransform[2];
          cameraTranslationXScaledOrNormalXXQ16 = cameraTransform[3] * cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase1 - (-(cameraXBasisOrDeltaYOrClipCenterYLiteralPhase1 * cameraTransform[4]) - cameraTransform[5] * cameraXBasisOrDeltaZOrVertexIndexLiteralPhase1) >> -ClientRenderingState.meshProjectionShift + 16;
          cameraTranslationYScaledOrNormalYXQ16 = cameraXBasisOrDeltaZOrVertexIndexLiteralPhase1 * cameraTransform[8] + (cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase1 * cameraTransform[6] + cameraXBasisOrDeltaYOrClipCenterYLiteralPhase1 * cameraTransform[7]) >> 16 - ClientRenderingState.meshProjectionShift;
          cameraTranslationZOrNormalZXQ16 = cameraTransform[11] * cameraXBasisOrDeltaZOrVertexIndexLiteralPhase1 + cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase1 * cameraTransform[9] + cameraXBasisOrDeltaYOrClipCenterYLiteralPhase1 * cameraTransform[10] >> 16;
          if (!preserveSharedResources) {
            AchievementSubmission.releaseStaticReferences(-2);
          }
          cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2 = TriangleRasterState.clipCenterX;
          cameraXBasisOrDeltaYOrClipCenterYLiteralPhase2 = TriangleRasterState.clipCenterY;
          cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2 = 0;
          meshProjectionAndFaceQueue: while (true) {
            if (mesh.vertexCount > cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2) {
              cameraYBasisOrVertexXLiteralPhase1 = mesh.vertexX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
              cameraYBasisOrVertexYLiteralPhase1 = mesh.vertexY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
              cameraYBasisOrVertexZLiteralPhase1 = mesh.vertexZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
              cameraZBasisOrCameraXScaledLiteralPhase1 = (cameraYBasisOrVertexXLiteralPhase1 * cameraXXOrNormalXYQ16 + cameraYBasisOrVertexYLiteralPhase1 * cameraXYOrNormalXZQ16 + cameraXZQ16OrNormalIndex * cameraYBasisOrVertexZLiteralPhase1 >> -ClientRenderingState.meshProjectionShift + 16) + cameraTranslationXScaledOrNormalXXQ16;
              cameraZBasisOrCameraYScaledLiteralPhase1 = cameraTranslationYScaledOrNormalYXQ16 + (cameraYXOrNormalYYQ16 * cameraYBasisOrVertexXLiteralPhase1 + cameraYBasisOrVertexYLiteralPhase1 * cameraYYOrNormalYZQ16 + cameraYBasisOrVertexZLiteralPhase1 * cameraYZQ16OrNormalX >> 16 - ClientRenderingState.meshProjectionShift);
              cameraZBasisOrCameraDepthLiteralPhase1 = cameraTranslationZOrNormalZXQ16 + (cameraYBasisOrVertexZLiteralPhase1 * cameraZZQ16OrNormalY + cameraZXOrNormalZYQ16 * cameraYBasisOrVertexXLiteralPhase1 + cameraZYOrNormalZZQ16 * cameraYBasisOrVertexYLiteralPhase1 >> 16);
              nearPlaneOrNormalCapacityOrQueueMinDepth = -51;
              invertedDepthOrNormalIndexOrQueueGuard = ~cameraZBasisOrCameraDepthLiteralPhase1;
              if (controlFlagSnapshot == 0) {
                if (nearPlaneOrNormalCapacityOrQueueMinDepth >= invertedDepthOrNormalIndexOrQueueGuard) {
                  SingleChildWidget.projectedMeshVertexX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraZBasisOrCameraXScaledLiteralPhase1 / cameraZBasisOrCameraDepthLiteralPhase1 + cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2;
                  TextInputWidget.projectedMeshVertexY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraXBasisOrDeltaYOrClipCenterYLiteralPhase2 + cameraZBasisOrCameraYScaledLiteralPhase1 / cameraZBasisOrCameraDepthLiteralPhase1;
                  if (cameraZBasisOrCameraDepthLiteralPhase1 < minimumVisibleDepth) {
                    minimumVisibleDepth = cameraZBasisOrCameraDepthLiteralPhase1;
                  }
                  if (maximumVisibleDepth < cameraZBasisOrCameraDepthLiteralPhase1) {
                    maximumVisibleDepth = cameraZBasisOrCameraDepthLiteralPhase1;
                  }
                  CachedArchiveSource.projectedMeshVertexDepth[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraZBasisOrCameraDepthLiteralPhase1;
                } else {
                  CachedArchiveSource.projectedMeshVertexDepth[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = -2147483648;
                }
                if (storeCameraCoordinates) {
                  BoardEntityState.cameraMeshVertexX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraZBasisOrCameraXScaledLiteralPhase1 >> ClientRenderingState.meshProjectionShift;
                  UsernameAvailabilityValidator.cameraMeshVertexY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraZBasisOrCameraYScaledLiteralPhase1 >> ClientRenderingState.meshProjectionShift;
                  EntityCollisionSupport.cameraMeshVertexZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraZBasisOrCameraDepthLiteralPhase1;
                }
                cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2++;
                continue;
              }
            } else {
              if (null != mesh.firstVertexSourceX &&
                  mesh.firstVertexSourceY != null &&
                  mesh.firstVertexSourceZ != null &&
                  mesh.secondVertexSourceX != null &&
                  null != mesh.secondVertexSourceY &&
                  mesh.secondVertexSourceZ != null &&
                  mesh.thirdVertexSourceX != null &&
                  null != mesh.thirdVertexSourceY &&
                  mesh.thirdVertexSourceZ != null) {
                cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2 = 0;
                while (!(cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2 >= mesh.faceCount)) {
                  cameraYBasisOrVertexXLiteralPhase1 = mesh.firstVertexSourceX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  cameraYBasisOrVertexYLiteralPhase1 = mesh.firstVertexSourceY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  cameraYBasisOrVertexZLiteralPhase1 = mesh.firstVertexSourceZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  ArchiveLoadStep.firstVertexTransformedX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = (cameraXXOrNormalXYQ16 * cameraYBasisOrVertexXLiteralPhase1 - (-(cameraXYOrNormalXZQ16 * cameraYBasisOrVertexYLiteralPhase1) - cameraXZQ16OrNormalIndex * cameraYBasisOrVertexZLiteralPhase1) >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  GameplaySetupSupport.firstVertexTransformedY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYBasisOrVertexZLiteralPhase1 * cameraYZQ16OrNormalX + cameraYYOrNormalYZQ16 * cameraYBasisOrVertexYLiteralPhase1 + cameraYBasisOrVertexXLiteralPhase1 * cameraYXOrNormalYYQ16 >> 16);
                  AccountEligibilitySupport.firstVertexTransformedZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = (cameraYBasisOrVertexZLiteralPhase1 * cameraZZQ16OrNormalY + (cameraZYOrNormalZZQ16 * cameraYBasisOrVertexYLiteralPhase1 + cameraZXOrNormalZYQ16 * cameraYBasisOrVertexXLiteralPhase1) >> 16) + cameraTranslationZOrNormalZXQ16;
                  cameraYBasisOrVertexXLiteralPhase1 = mesh.secondVertexSourceX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  cameraYBasisOrVertexYLiteralPhase1 = mesh.secondVertexSourceY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  cameraYBasisOrVertexZLiteralPhase1 = mesh.secondVertexSourceZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  ContentTransitionDialog.secondVertexTransformedX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = (cameraXYOrNormalXZQ16 * cameraYBasisOrVertexYLiteralPhase1 + cameraXXOrNormalXYQ16 * cameraYBasisOrVertexXLiteralPhase1 + cameraYBasisOrVertexZLiteralPhase1 * cameraXZQ16OrNormalIndex >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  TextInputRenderer.secondVertexTransformedY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYZQ16OrNormalX * cameraYBasisOrVertexZLiteralPhase1 + cameraYBasisOrVertexYLiteralPhase1 * cameraYYOrNormalYZQ16 + cameraYXOrNormalYYQ16 * cameraYBasisOrVertexXLiteralPhase1 >> 16);
                  MouseWheelInput.secondVertexTransformedZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = (cameraYBasisOrVertexZLiteralPhase1 * cameraZZQ16OrNormalY + cameraYBasisOrVertexXLiteralPhase1 * cameraZXOrNormalZYQ16 + cameraZYOrNormalZZQ16 * cameraYBasisOrVertexYLiteralPhase1 >> 16) + cameraTranslationZOrNormalZXQ16;
                  cameraYBasisOrVertexXLiteralPhase1 = mesh.thirdVertexSourceX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  cameraYBasisOrVertexYLiteralPhase1 = mesh.thirdVertexSourceY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  cameraYBasisOrVertexZLiteralPhase1 = mesh.thirdVertexSourceZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2];
                  FullscreenEntrySupport.thirdVertexTransformedX[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = (cameraYBasisOrVertexYLiteralPhase1 * cameraXYOrNormalXZQ16 + (cameraXXOrNormalXYQ16 * cameraYBasisOrVertexXLiteralPhase1 + cameraYBasisOrVertexZLiteralPhase1 * cameraXZQ16OrNormalIndex) >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  BufferedSocket.thirdVertexTransformedY[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYBasisOrVertexXLiteralPhase1 * cameraYXOrNormalYYQ16 + (cameraYYOrNormalYZQ16 * cameraYBasisOrVertexYLiteralPhase1 + cameraYZQ16OrNormalX * cameraYBasisOrVertexZLiteralPhase1) >> 16);
                  LoginPasswordSupport.thirdVertexTransformedZ[cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2] = cameraTranslationZOrNormalZXQ16 + (cameraYBasisOrVertexZLiteralPhase1 * cameraZZQ16OrNormalY + cameraYBasisOrVertexYLiteralPhase1 * cameraZYOrNormalZZQ16 + cameraZXOrNormalZYQ16 * cameraYBasisOrVertexXLiteralPhase1 >> 16);
                  cameraXBasisOrDeltaZOrVertexIndexLiteralPhase2++;
                  if (controlFlagSnapshot != 0) {
                    return;
                  }
                }
              }
              if (transformNormals) {
                cameraTranslationXScaledOrNormalXXQ16 = modelTransform[3];
                cameraTranslationYScaledOrNormalYXQ16 = modelTransform[4];
                cameraTranslationZOrNormalZXQ16 = modelTransform[5];
                cameraXXOrNormalXYQ16 = modelTransform[6];
                cameraYXOrNormalYYQ16 = modelTransform[7];
                cameraZXOrNormalZYQ16 = modelTransform[8];
                cameraXYOrNormalXZQ16 = modelTransform[9];
                cameraYYOrNormalYZQ16 = modelTransform[10];
                cameraZYOrNormalZZQ16 = modelTransform[11];
                cameraXZQ16OrNormalIndex = 0;
                while (!(mesh.normalCount <= cameraXZQ16OrNormalIndex)) {
                  nearPlaneOrNormalCapacityOrQueueMinDepth = ClientRenderingState.transformedMeshNormalX.length;
                  invertedDepthOrNormalIndexOrQueueGuard = cameraXZQ16OrNormalIndex;
                  if (controlFlagSnapshot != 0) {
                    break meshProjectionAndFaceQueue;
                  }
                  if (nearPlaneOrNormalCapacityOrQueueMinDepth <= invertedDepthOrNormalIndexOrQueueGuard) {
                    break;
                  }
                  cameraYZQ16OrNormalX = mesh.normalX[cameraXZQ16OrNormalIndex];
                  cameraZZQ16OrNormalY = mesh.normalY[cameraXZQ16OrNormalIndex];
                  cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2 = mesh.normalZ[cameraXZQ16OrNormalIndex];
                  ClientRenderingState.transformedMeshNormalX[cameraXZQ16OrNormalIndex] = cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2 * cameraXYOrNormalXZQ16 + (cameraXXOrNormalXYQ16 * cameraZZQ16OrNormalY + cameraYZQ16OrNormalX * cameraTranslationXScaledOrNormalXXQ16) >> 16;
                  ClientClockSupport.transformedMeshNormalY[cameraXZQ16OrNormalIndex] = cameraYYOrNormalYZQ16 * cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2 + (cameraYZQ16OrNormalX * cameraTranslationYScaledOrNormalYXQ16 + cameraZZQ16OrNormalY * cameraYXOrNormalYYQ16) >> 16;
                  IterableNodeHashTable.transformedMeshNormalZ[cameraXZQ16OrNormalIndex] = cameraZXOrNormalZYQ16 * cameraZZQ16OrNormalY + (cameraTranslationZOrNormalZXQ16 * cameraYZQ16OrNormalX + cameraZYOrNormalZZQ16 * cameraXBasisOrDeltaXOrClipCenterXOrNormalZLiteralPhase2) >> 16;
                  cameraXZQ16OrNormalIndex++;
                }
              }
              nearPlaneOrNormalCapacityOrQueueMinDepth = minimumVisibleDepth;
              invertedDepthOrNormalIndexOrQueueGuard = 22;
            }
            break;
          }
          MeshDepthSupport.queueMeshFacesByDepthWithIntegerGuard(nearPlaneOrNormalCapacityOrQueueMinDepth, invertedDepthOrNormalIndexOrQueueGuard, mesh, maximumVisibleDepth, cullBackfaces);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = contextFailure;
          cameraContextBuilder = new StringBuilder().append("p.B(");
          if (cameraTransform == null) {
            cameraContextDescription = "null";
          } else {
            cameraContextDescription = "{...}";
          }
          modelContextBuilder = ((StringBuilder) (Object) cameraContextBuilder).append(cameraContextDescription).append(',');
          if (modelTransform == null) {
            modelContextDescription = "null";
          } else {
            modelContextDescription = "{...}";
          }
          meshContextBuilder = ((StringBuilder) (Object) modelContextBuilder).append(modelContextDescription).append(',');
          if (mesh == null) {
            meshContextDescription = "null";
          } else {
            meshContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) meshContextBuilder).append(meshContextDescription).append(',').append(preserveSharedResources).append(',').append(storeCameraCoordinates).append(',').append(cullBackfaces).append(',').append(transformNormals).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        RuntimeException caughtCleanupFailure = null;
        RuntimeException cleanupFailureForContext = null;
        try {
          if (methodGuard > -21) {
            sessionPacketPayloadLength = 120;
          }
          retentionCategoryCounts = null;
          gameSoundResampler = null;
          return;
        } catch (java.lang.RuntimeException cleanupFailure) {
          caughtCleanupFailure = cleanupFailure;
          cleanupFailureForContext = caughtCleanupFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cleanupFailureForContext), "p.A(" + methodGuard + ')');
        }
    }

    AchievementSubmission(int achievementId, int achievementCheckByte, int trackingBits, int trackingAccumulator, int primaryTrackingCounter, int secondaryTrackingCounter) {
        try {
            this.trackingBitsSnapshot = trackingBits;
            this.trackingAccumulatorSnapshot = trackingAccumulator;
            this.secondaryTrackingCounterSnapshot = secondaryTrackingCounter;
            this.primaryTrackingCounterSnapshot = primaryTrackingCounter;
            this.achievementCheckByte = achievementCheckByte;
            this.achievementId = achievementId;
        } catch (RuntimeException submissionConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionConstructionFailure), "p.<init>(" + achievementId + ',' + achievementCheckByte + ',' + trackingBits + ',' + trackingAccumulator + ',' + primaryTrackingCounter + ',' + secondaryTrackingCounter + ')');
        }
    }

    final static String canonicalizeBase37DisplayNameOrEmpty(CharSequence nameCharacters, int methodGuard) {
        String canonicalName = null;
        RuntimeException canonicalizationFailureForContext = null;
        String canonicalNameBeforeReturn = null;
        RuntimeException canonicalizationFailureBeforeDescription = null;
        StringBuilder canonicalizationMessagePrefix = null;
        String nameDescription = null;
        RuntimeException caughtCanonicalizationFailure = null;
        try {
          if (methodGuard != 3) {
            gameSoundResampler = (PcmResampler) null;
          }
          canonicalName = UnderlinedButtonRenderer.decodeBase37DisplayName(ResourceArchive.encodeBase37Name(nameCharacters, -48), -78);
          if (null == canonicalName) {
            canonicalName = "";
          }
          canonicalNameBeforeReturn = canonicalName;
          return canonicalNameBeforeReturn;
        } catch (java.lang.RuntimeException canonicalizationFailure) {
          caughtCanonicalizationFailure = canonicalizationFailure;
          canonicalizationFailureForContext = caughtCanonicalizationFailure;
          canonicalizationFailureBeforeDescription = canonicalizationFailureForContext;
          canonicalizationMessagePrefix = new StringBuilder().append("p.C(");
          if (nameCharacters == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) canonicalizationFailureBeforeDescription), ((StringBuilder) (Object) canonicalizationMessagePrefix).append(nameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
    }
}
