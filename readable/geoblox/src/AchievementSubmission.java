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
        int cameraXBasisXQ14 = 0;
        int cameraXBasisYQ14 = 0;
        int cameraXBasisZQ14 = 0;
        int cameraYBasisXQ14 = 0;
        int cameraYBasisYQ14 = 0;
        int cameraYBasisZQ14 = 0;
        int cameraZBasisXQ14 = 0;
        int cameraZBasisYQ14 = 0;
        int cameraZBasisZQ14 = 0;
        int controlFlagSnapshot = 0;
        int modelToCameraDeltaX;
        int clipCenterXOrNormalZ;
        int modelToCameraDeltaY;
        int clipCenterY;
        int modelToCameraDeltaZ;
        int vertexOrSourceFaceIndex;
        int modelVertexX;
        int modelVertexY;
        int modelVertexZ;
        int projectedCameraXScaled;
        int projectedCameraYScaled;
        int projectedCameraDepth;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          minimumVisibleDepth = 2147483647;
          maximumVisibleDepth = -2147483648;
          cameraXBasisXQ14 = cameraTransform[3] >> 2;
          cameraXBasisYQ14 = cameraTransform[4] >> 2;
          cameraXBasisZQ14 = cameraTransform[5] >> 2;
          cameraYBasisXQ14 = cameraTransform[6] >> 2;
          cameraYBasisYQ14 = cameraTransform[7] >> 2;
          cameraYBasisZQ14 = cameraTransform[8] >> 2;
          cameraZBasisXQ14 = cameraTransform[9] >> 2;
          cameraZBasisYQ14 = cameraTransform[10] >> 2;
          cameraYXOrNormalYYQ16 = cameraYBasisYQ14 * modelTransform[4] + (modelTransform[3] * cameraYBasisXQ14 + cameraYBasisZQ14 * modelTransform[5]) >> 14;
          cameraZBasisZQ14 = cameraTransform[11] >> 2;
          cameraXXOrNormalXYQ16 = modelTransform[3] * cameraXBasisXQ14 + cameraXBasisYQ14 * modelTransform[4] + cameraXBasisZQ14 * modelTransform[5] >> 14;
          cameraXZQ16OrNormalIndex = modelTransform[11] * cameraXBasisZQ14 + (modelTransform[10] * cameraXBasisYQ14 + modelTransform[9] * cameraXBasisXQ14) >> 14;
          cameraXYOrNormalXZQ16 = modelTransform[6] * cameraXBasisXQ14 - (-(modelTransform[7] * cameraXBasisYQ14) - modelTransform[8] * cameraXBasisZQ14) >> 14;
          cameraYYOrNormalYZQ16 = cameraYBasisYQ14 * modelTransform[7] + (cameraYBasisXQ14 * modelTransform[6] + cameraYBasisZQ14 * modelTransform[8]) >> 14;
          cameraZXOrNormalZYQ16 = cameraZBasisZQ14 * modelTransform[5] + modelTransform[3] * cameraZBasisXQ14 + modelTransform[4] * cameraZBasisYQ14 >> 14;
          cameraYZQ16OrNormalX = modelTransform[10] * cameraYBasisYQ14 + cameraYBasisXQ14 * modelTransform[9] + modelTransform[11] * cameraYBasisZQ14 >> 14;
          cameraZZQ16OrNormalY = cameraZBasisXQ14 * modelTransform[9] + cameraZBasisYQ14 * modelTransform[10] + modelTransform[11] * cameraZBasisZQ14 >> 14;
          cameraZYOrNormalZZQ16 = modelTransform[8] * cameraZBasisZQ14 + modelTransform[6] * cameraZBasisXQ14 + cameraZBasisYQ14 * modelTransform[7] >> 14;
          modelToCameraDeltaX = modelTransform[0] - cameraTransform[0];
          modelToCameraDeltaY = -cameraTransform[1] + modelTransform[1];
          modelToCameraDeltaZ = modelTransform[2] - cameraTransform[2];
          cameraTranslationXScaledOrNormalXXQ16 = cameraTransform[3] * modelToCameraDeltaX - (-(modelToCameraDeltaY * cameraTransform[4]) - cameraTransform[5] * modelToCameraDeltaZ) >> -ClientRenderingState.meshProjectionShift + 16;
          cameraTranslationYScaledOrNormalYXQ16 = modelToCameraDeltaZ * cameraTransform[8] + (modelToCameraDeltaX * cameraTransform[6] + modelToCameraDeltaY * cameraTransform[7]) >> 16 - ClientRenderingState.meshProjectionShift;
          cameraTranslationZOrNormalZXQ16 = cameraTransform[11] * modelToCameraDeltaZ + modelToCameraDeltaX * cameraTransform[9] + modelToCameraDeltaY * cameraTransform[10] >> 16;
          if (!preserveSharedResources) {
            AchievementSubmission.releaseStaticReferences(-2);
          }
          clipCenterXOrNormalZ = TriangleRasterState.clipCenterX;
          clipCenterY = TriangleRasterState.clipCenterY;
          vertexOrSourceFaceIndex = 0;
          meshProjectionAndFaceQueue: while (true) {
            if (mesh.vertexCount > vertexOrSourceFaceIndex) {
              modelVertexX = mesh.vertexX[vertexOrSourceFaceIndex];
              modelVertexY = mesh.vertexY[vertexOrSourceFaceIndex];
              modelVertexZ = mesh.vertexZ[vertexOrSourceFaceIndex];
              projectedCameraXScaled = (modelVertexX * cameraXXOrNormalXYQ16 + modelVertexY * cameraXYOrNormalXZQ16 + cameraXZQ16OrNormalIndex * modelVertexZ >> -ClientRenderingState.meshProjectionShift + 16) + cameraTranslationXScaledOrNormalXXQ16;
              projectedCameraYScaled = cameraTranslationYScaledOrNormalYXQ16 + (cameraYXOrNormalYYQ16 * modelVertexX + modelVertexY * cameraYYOrNormalYZQ16 + modelVertexZ * cameraYZQ16OrNormalX >> 16 - ClientRenderingState.meshProjectionShift);
              projectedCameraDepth = cameraTranslationZOrNormalZXQ16 + (modelVertexZ * cameraZZQ16OrNormalY + cameraZXOrNormalZYQ16 * modelVertexX + cameraZYOrNormalZZQ16 * modelVertexY >> 16);
              nearPlaneOrNormalCapacityOrQueueMinDepth = -51;
              invertedDepthOrNormalIndexOrQueueGuard = ~projectedCameraDepth;
              if (controlFlagSnapshot == 0) {
                if (nearPlaneOrNormalCapacityOrQueueMinDepth >= invertedDepthOrNormalIndexOrQueueGuard) {
                  SingleChildWidget.projectedMeshVertexX[vertexOrSourceFaceIndex] = projectedCameraXScaled / projectedCameraDepth + clipCenterXOrNormalZ;
                  TextInputWidget.projectedMeshVertexY[vertexOrSourceFaceIndex] = clipCenterY + projectedCameraYScaled / projectedCameraDepth;
                  if (projectedCameraDepth < minimumVisibleDepth) {
                    minimumVisibleDepth = projectedCameraDepth;
                  }
                  if (maximumVisibleDepth < projectedCameraDepth) {
                    maximumVisibleDepth = projectedCameraDepth;
                  }
                  CachedArchiveSource.projectedMeshVertexDepth[vertexOrSourceFaceIndex] = projectedCameraDepth;
                } else {
                  CachedArchiveSource.projectedMeshVertexDepth[vertexOrSourceFaceIndex] = -2147483648;
                }
                if (storeCameraCoordinates) {
                  BoardEntityState.cameraMeshVertexX[vertexOrSourceFaceIndex] = projectedCameraXScaled >> ClientRenderingState.meshProjectionShift;
                  UsernameAvailabilityValidator.cameraMeshVertexY[vertexOrSourceFaceIndex] = projectedCameraYScaled >> ClientRenderingState.meshProjectionShift;
                  EntityCollisionSupport.cameraMeshVertexZ[vertexOrSourceFaceIndex] = projectedCameraDepth;
                }
                vertexOrSourceFaceIndex++;
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
                vertexOrSourceFaceIndex = 0;
                while (!(vertexOrSourceFaceIndex >= mesh.faceCount)) {
                  modelVertexX = mesh.firstVertexSourceX[vertexOrSourceFaceIndex];
                  modelVertexY = mesh.firstVertexSourceY[vertexOrSourceFaceIndex];
                  modelVertexZ = mesh.firstVertexSourceZ[vertexOrSourceFaceIndex];
                  ArchiveLoadStep.firstVertexTransformedX[vertexOrSourceFaceIndex] = (cameraXXOrNormalXYQ16 * modelVertexX - (-(cameraXYOrNormalXZQ16 * modelVertexY) - cameraXZQ16OrNormalIndex * modelVertexZ) >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  GameplaySetupSupport.firstVertexTransformedY[vertexOrSourceFaceIndex] = cameraTranslationYScaledOrNormalYXQ16 + (modelVertexZ * cameraYZQ16OrNormalX + cameraYYOrNormalYZQ16 * modelVertexY + modelVertexX * cameraYXOrNormalYYQ16 >> 16);
                  AccountEligibilitySupport.firstVertexTransformedZ[vertexOrSourceFaceIndex] = (modelVertexZ * cameraZZQ16OrNormalY + (cameraZYOrNormalZZQ16 * modelVertexY + cameraZXOrNormalZYQ16 * modelVertexX) >> 16) + cameraTranslationZOrNormalZXQ16;
                  modelVertexX = mesh.secondVertexSourceX[vertexOrSourceFaceIndex];
                  modelVertexY = mesh.secondVertexSourceY[vertexOrSourceFaceIndex];
                  modelVertexZ = mesh.secondVertexSourceZ[vertexOrSourceFaceIndex];
                  ContentTransitionDialog.secondVertexTransformedX[vertexOrSourceFaceIndex] = (cameraXYOrNormalXZQ16 * modelVertexY + cameraXXOrNormalXYQ16 * modelVertexX + modelVertexZ * cameraXZQ16OrNormalIndex >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  TextInputRenderer.secondVertexTransformedY[vertexOrSourceFaceIndex] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYZQ16OrNormalX * modelVertexZ + modelVertexY * cameraYYOrNormalYZQ16 + cameraYXOrNormalYYQ16 * modelVertexX >> 16);
                  MouseWheelInput.secondVertexTransformedZ[vertexOrSourceFaceIndex] = (modelVertexZ * cameraZZQ16OrNormalY + modelVertexX * cameraZXOrNormalZYQ16 + cameraZYOrNormalZZQ16 * modelVertexY >> 16) + cameraTranslationZOrNormalZXQ16;
                  modelVertexX = mesh.thirdVertexSourceX[vertexOrSourceFaceIndex];
                  modelVertexY = mesh.thirdVertexSourceY[vertexOrSourceFaceIndex];
                  modelVertexZ = mesh.thirdVertexSourceZ[vertexOrSourceFaceIndex];
                  FullscreenEntrySupport.thirdVertexTransformedX[vertexOrSourceFaceIndex] = (modelVertexY * cameraXYOrNormalXZQ16 + (cameraXXOrNormalXYQ16 * modelVertexX + modelVertexZ * cameraXZQ16OrNormalIndex) >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  BufferedSocket.thirdVertexTransformedY[vertexOrSourceFaceIndex] = cameraTranslationYScaledOrNormalYXQ16 + (modelVertexX * cameraYXOrNormalYYQ16 + (cameraYYOrNormalYZQ16 * modelVertexY + cameraYZQ16OrNormalX * modelVertexZ) >> 16);
                  LoginPasswordSupport.thirdVertexTransformedZ[vertexOrSourceFaceIndex] = cameraTranslationZOrNormalZXQ16 + (modelVertexZ * cameraZZQ16OrNormalY + modelVertexY * cameraZYOrNormalZZQ16 + cameraZXOrNormalZYQ16 * modelVertexX >> 16);
                  vertexOrSourceFaceIndex++;
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
                  clipCenterXOrNormalZ = mesh.normalZ[cameraXZQ16OrNormalIndex];
                  ClientRenderingState.transformedMeshNormalX[cameraXZQ16OrNormalIndex] = clipCenterXOrNormalZ * cameraXYOrNormalXZQ16 + (cameraXXOrNormalXYQ16 * cameraZZQ16OrNormalY + cameraYZQ16OrNormalX * cameraTranslationXScaledOrNormalXXQ16) >> 16;
                  ClientClockSupport.transformedMeshNormalY[cameraXZQ16OrNormalIndex] = cameraYYOrNormalYZQ16 * clipCenterXOrNormalZ + (cameraYZQ16OrNormalX * cameraTranslationYScaledOrNormalYXQ16 + cameraZZQ16OrNormalY * cameraYXOrNormalYYQ16) >> 16;
                  IterableNodeHashTable.transformedMeshNormalZ[cameraXZQ16OrNormalIndex] = cameraZXOrNormalZYQ16 * cameraZZQ16OrNormalY + (cameraTranslationZOrNormalZXQ16 * cameraYZQ16OrNormalX + cameraZYOrNormalZZQ16 * clipCenterXOrNormalZ) >> 16;
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
