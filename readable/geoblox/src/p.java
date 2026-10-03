/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends IntrusiveNode {
    int field_l;
    int field_j;
    static boolean field_m;
    int field_h;
    static ue field_i;
    static int[] field_o;
    int field_g;
    int field_n;
    static int field_k;
    int field_f;

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
          cameraXBasisOrDeltaXOrClipCenterXOrNormalZ = modelTransform[0] - cameraTransform[0];
          cameraXBasisOrDeltaYOrClipCenterY = -cameraTransform[1] + modelTransform[1];
          cameraXBasisOrDeltaZOrVertexIndex = modelTransform[2] - cameraTransform[2];
          cameraTranslationXScaledOrNormalXXQ16 = cameraTransform[3] * cameraXBasisOrDeltaXOrClipCenterXOrNormalZ - (-(cameraXBasisOrDeltaYOrClipCenterY * cameraTransform[4]) - cameraTransform[5] * cameraXBasisOrDeltaZOrVertexIndex) >> -ok.meshProjectionShift + 16;
          cameraTranslationYScaledOrNormalYXQ16 = cameraXBasisOrDeltaZOrVertexIndex * cameraTransform[8] + (cameraXBasisOrDeltaXOrClipCenterXOrNormalZ * cameraTransform[6] + cameraXBasisOrDeltaYOrClipCenterY * cameraTransform[7]) >> 16 - ok.meshProjectionShift;
          cameraTranslationZOrNormalZXQ16 = cameraTransform[11] * cameraXBasisOrDeltaZOrVertexIndex + cameraXBasisOrDeltaXOrClipCenterXOrNormalZ * cameraTransform[9] + cameraXBasisOrDeltaYOrClipCenterY * cameraTransform[10] >> 16;
          if (!preserveSharedResources) {
            p.b(-2);
          }
          cameraXBasisOrDeltaXOrClipCenterXOrNormalZ = TriangleRasterState.clipCenterX;
          cameraXBasisOrDeltaYOrClipCenterY = TriangleRasterState.clipCenterY;
          cameraXBasisOrDeltaZOrVertexIndex = 0;
          while (true) {
            L3: {
              if (mesh.vertexCount > cameraXBasisOrDeltaZOrVertexIndex) {
                cameraYBasisOrVertexX = mesh.vertexX[cameraXBasisOrDeltaZOrVertexIndex];
                cameraYBasisOrVertexY = mesh.vertexY[cameraXBasisOrDeltaZOrVertexIndex];
                cameraYBasisOrVertexZ = mesh.vertexZ[cameraXBasisOrDeltaZOrVertexIndex];
                cameraZBasisOrCameraXScaled = (cameraYBasisOrVertexX * cameraXXOrNormalXYQ16 + cameraYBasisOrVertexY * cameraXYOrNormalXZQ16 + cameraXZQ16OrNormalIndex * cameraYBasisOrVertexZ >> -ok.meshProjectionShift + 16) + cameraTranslationXScaledOrNormalXXQ16;
                cameraZBasisOrCameraYScaled = cameraTranslationYScaledOrNormalYXQ16 + (cameraYXOrNormalYYQ16 * cameraYBasisOrVertexX + cameraYBasisOrVertexY * cameraYYOrNormalYZQ16 + cameraYBasisOrVertexZ * cameraYZQ16OrNormalX >> 16 - ok.meshProjectionShift);
                cameraZBasisOrCameraDepth = cameraTranslationZOrNormalZXQ16 + (cameraYBasisOrVertexZ * cameraZZQ16OrNormalY + cameraZXOrNormalZYQ16 * cameraYBasisOrVertexX + cameraZYOrNormalZZQ16 * cameraYBasisOrVertexY >> 16);
                nearPlaneOrNormalCapacityOrQueueMinDepth = -51;
                invertedDepthOrNormalIndexOrQueueGuard = ~cameraZBasisOrCameraDepth;
                if (controlFlagSnapshot != 0) {
                  break L3;
                }
                L5: {
                  if (nearPlaneOrNormalCapacityOrQueueMinDepth >= invertedDepthOrNormalIndexOrQueueGuard) {
                    SingleChildWidget.projectedMeshVertexX[cameraXBasisOrDeltaZOrVertexIndex] = cameraZBasisOrCameraXScaled / cameraZBasisOrCameraDepth + cameraXBasisOrDeltaXOrClipCenterXOrNormalZ;
                    dj.projectedMeshVertexY[cameraXBasisOrDeltaZOrVertexIndex] = cameraXBasisOrDeltaYOrClipCenterY + cameraZBasisOrCameraYScaled / cameraZBasisOrCameraDepth;
                    if (~cameraZBasisOrCameraDepth > ~minimumVisibleDepth) {
                      minimumVisibleDepth = cameraZBasisOrCameraDepth;
                    }
                    if (maximumVisibleDepth < cameraZBasisOrCameraDepth) {
                      maximumVisibleDepth = cameraZBasisOrCameraDepth;
                    }
                    CachedArchiveSource.projectedMeshVertexDepth[cameraXBasisOrDeltaZOrVertexIndex] = cameraZBasisOrCameraDepth;
                    break L5;
                  }
                  CachedArchiveSource.projectedMeshVertexDepth[cameraXBasisOrDeltaZOrVertexIndex] = -2147483648;
                }
                if (storeCameraCoordinates) {
                  a.cameraMeshVertexX[cameraXBasisOrDeltaZOrVertexIndex] = cameraZBasisOrCameraXScaled >> ok.meshProjectionShift;
                  uk.cameraMeshVertexY[cameraXBasisOrDeltaZOrVertexIndex] = cameraZBasisOrCameraYScaled >> ok.meshProjectionShift;
                  gf.cameraMeshVertexZ[cameraXBasisOrDeltaZOrVertexIndex] = cameraZBasisOrCameraDepth;
                }
                cameraXBasisOrDeltaZOrVertexIndex++;
                continue;
              }
              if ((null != mesh.firstVertexSourceX) &&
                  (mesh.firstVertexSourceY != null) &&
                  (mesh.firstVertexSourceZ != null) &&
                  (mesh.secondVertexSourceX != null) &&
                  (null != mesh.secondVertexSourceY) &&
                  (mesh.secondVertexSourceZ != null) &&
                  (mesh.thirdVertexSourceX != null) &&
                  (null != mesh.thirdVertexSourceY) &&
                  (mesh.thirdVertexSourceZ != null)) {
                cameraXBasisOrDeltaZOrVertexIndex = 0;
                while (!(~cameraXBasisOrDeltaZOrVertexIndex <= ~mesh.faceCount)) {
                  cameraYBasisOrVertexX = mesh.firstVertexSourceX[cameraXBasisOrDeltaZOrVertexIndex];
                  cameraYBasisOrVertexY = mesh.firstVertexSourceY[cameraXBasisOrDeltaZOrVertexIndex];
                  cameraYBasisOrVertexZ = mesh.firstVertexSourceZ[cameraXBasisOrDeltaZOrVertexIndex];
                  ii.firstVertexTransformedX[cameraXBasisOrDeltaZOrVertexIndex] = (cameraXXOrNormalXYQ16 * cameraYBasisOrVertexX - (-(cameraXYOrNormalXZQ16 * cameraYBasisOrVertexY) - cameraXZQ16OrNormalIndex * cameraYBasisOrVertexZ) >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  pg.firstVertexTransformedY[cameraXBasisOrDeltaZOrVertexIndex] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYBasisOrVertexZ * cameraYZQ16OrNormalX + cameraYYOrNormalYZQ16 * cameraYBasisOrVertexY + cameraYBasisOrVertexX * cameraYXOrNormalYYQ16 >> 16);
                  kf.firstVertexTransformedZ[cameraXBasisOrDeltaZOrVertexIndex] = (cameraYBasisOrVertexZ * cameraZZQ16OrNormalY + (cameraZYOrNormalZZQ16 * cameraYBasisOrVertexY + cameraZXOrNormalZYQ16 * cameraYBasisOrVertexX) >> 16) + cameraTranslationZOrNormalZXQ16;
                  cameraYBasisOrVertexX = mesh.secondVertexSourceX[cameraXBasisOrDeltaZOrVertexIndex];
                  cameraYBasisOrVertexY = mesh.secondVertexSourceY[cameraXBasisOrDeltaZOrVertexIndex];
                  cameraYBasisOrVertexZ = mesh.secondVertexSourceZ[cameraXBasisOrDeltaZOrVertexIndex];
                  ContentTransitionDialog.secondVertexTransformedX[cameraXBasisOrDeltaZOrVertexIndex] = (cameraXYOrNormalXZQ16 * cameraYBasisOrVertexY + cameraXXOrNormalXYQ16 * cameraYBasisOrVertexX + cameraYBasisOrVertexZ * cameraXZQ16OrNormalIndex >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  ac.secondVertexTransformedY[cameraXBasisOrDeltaZOrVertexIndex] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYZQ16OrNormalX * cameraYBasisOrVertexZ + cameraYBasisOrVertexY * cameraYYOrNormalYZQ16 + cameraYXOrNormalYYQ16 * cameraYBasisOrVertexX >> 16);
                  MouseWheelInput.secondVertexTransformedZ[cameraXBasisOrDeltaZOrVertexIndex] = (cameraYBasisOrVertexZ * cameraZZQ16OrNormalY + cameraYBasisOrVertexX * cameraZXOrNormalZYQ16 + cameraZYOrNormalZZQ16 * cameraYBasisOrVertexY >> 16) + cameraTranslationZOrNormalZXQ16;
                  cameraYBasisOrVertexX = mesh.thirdVertexSourceX[cameraXBasisOrDeltaZOrVertexIndex];
                  cameraYBasisOrVertexY = mesh.thirdVertexSourceY[cameraXBasisOrDeltaZOrVertexIndex];
                  cameraYBasisOrVertexZ = mesh.thirdVertexSourceZ[cameraXBasisOrDeltaZOrVertexIndex];
                  qe.thirdVertexTransformedX[cameraXBasisOrDeltaZOrVertexIndex] = (cameraYBasisOrVertexY * cameraXYOrNormalXZQ16 + (cameraXXOrNormalXYQ16 * cameraYBasisOrVertexX + cameraYBasisOrVertexZ * cameraXZQ16OrNormalIndex) >> 16) + cameraTranslationXScaledOrNormalXXQ16;
                  BufferedSocket.thirdVertexTransformedY[cameraXBasisOrDeltaZOrVertexIndex] = cameraTranslationYScaledOrNormalYXQ16 + (cameraYBasisOrVertexX * cameraYXOrNormalYYQ16 + (cameraYYOrNormalYZQ16 * cameraYBasisOrVertexY + cameraYZQ16OrNormalX * cameraYBasisOrVertexZ) >> 16);
                  hg.thirdVertexTransformedZ[cameraXBasisOrDeltaZOrVertexIndex] = cameraTranslationZOrNormalZXQ16 + (cameraYBasisOrVertexZ * cameraZZQ16OrNormalY + cameraYBasisOrVertexY * cameraZYOrNormalZZQ16 + cameraZXOrNormalZYQ16 * cameraYBasisOrVertexX >> 16);
                  cameraXBasisOrDeltaZOrVertexIndex++;
                  if (controlFlagSnapshot != 0) {
                    return;
                  }
                  continue;
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
                while (!(~mesh.normalCount >= ~cameraXZQ16OrNormalIndex)) {
                  nearPlaneOrNormalCapacityOrQueueMinDepth = ok.transformedMeshNormalX.length;
                  invertedDepthOrNormalIndexOrQueueGuard = cameraXZQ16OrNormalIndex;
                  if (controlFlagSnapshot != 0) {
                    break L3;
                  }
                  if (nearPlaneOrNormalCapacityOrQueueMinDepth <= invertedDepthOrNormalIndexOrQueueGuard) {
                    break;
                  }
                  cameraYZQ16OrNormalX = mesh.normalX[cameraXZQ16OrNormalIndex];
                  cameraZZQ16OrNormalY = mesh.normalY[cameraXZQ16OrNormalIndex];
                  cameraXBasisOrDeltaXOrClipCenterXOrNormalZ = mesh.normalZ[cameraXZQ16OrNormalIndex];
                  ok.transformedMeshNormalX[cameraXZQ16OrNormalIndex] = cameraXBasisOrDeltaXOrClipCenterXOrNormalZ * cameraXYOrNormalXZQ16 + (cameraXXOrNormalXYQ16 * cameraZZQ16OrNormalY + cameraYZQ16OrNormalX * cameraTranslationXScaledOrNormalXXQ16) >> 16;
                  oa.transformedMeshNormalY[cameraXZQ16OrNormalIndex] = cameraYYOrNormalYZQ16 * cameraXBasisOrDeltaXOrClipCenterXOrNormalZ + (cameraYZQ16OrNormalX * cameraTranslationYScaledOrNormalYXQ16 + cameraZZQ16OrNormalY * cameraYXOrNormalYYQ16) >> 16;
                  gi.transformedMeshNormalZ[cameraXZQ16OrNormalIndex] = cameraZXOrNormalZYQ16 * cameraZZQ16OrNormalY + (cameraTranslationZOrNormalZXQ16 * cameraYZQ16OrNormalX + cameraZYOrNormalZZQ16 * cameraXBasisOrDeltaXOrClipCenterXOrNormalZ) >> 16;
                  cameraXZQ16OrNormalIndex++;
                  continue;
                }
              }
              nearPlaneOrNormalCapacityOrQueueMinDepth = minimumVisibleDepth;
              invertedDepthOrNormalIndexOrQueueGuard = 22;
            }
            i.queueMeshFacesByDepthWithIntegerGuard(nearPlaneOrNormalCapacityOrQueueMinDepth, invertedDepthOrNormalIndexOrQueueGuard, mesh, maximumVisibleDepth, cullBackfaces);
            return;
          }
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

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -21) {
            field_k = 120;
          }
          field_o = null;
          field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "p.A(" + param0 + ')');
        }
    }

    p(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            this.field_f = param2;
            this.field_g = param3;
            this.field_n = param5;
            this.field_j = param4;
            this.field_h = param1;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "p.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_i = (ue) null;
          }
          var2 = fh.a(ResourceArchive.a(param0, -48), -78);
          if (null == var2) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("p.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
