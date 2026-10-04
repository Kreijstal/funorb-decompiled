/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateArgumentType {
    int typeId;
    static String cancelText;
    int valueCount;
    static int[] gameSoundThemeIds;
    static boolean field_e;

    final static boolean b(int param0) {
        if (param0 != 0) {
            gameSoundThemeIds = (int[]) null;
            return true;
        }
        return true;
    }

    final static void renderLogoMeshes(byte methodGuard) {
        int depthCandidateIndex = 0;
        int translationComponentIndex = 0;
        int meshCount = 0;
        int[] meshDepthKeysAlias = null;
        int meshIndexOrViewDirectionXQ8 = 0;
        TriangleMesh meshForDepthBounds = null;
        int viewDirectionYQ8 = 0;
        int boundsCenterXOrViewDirectionZQ8 = 0;
        int boundsCenterYOrLightAngle = 0;
        int boundsCenterZOrLightDirectionXQ8 = 0;
        int cameraDepthBasisXQ14OrLightDirectionYQ8 = 0;
        int cameraDepthBasisYQ14OrLightDirectionZQ8 = 0;
        int cameraDepthBasisZQ14 = 0;
        double directionNormalizationScale = 0.0;
        int meshDepthFromXQ16 = 0;
        int meshDepthFromYQ16OrHalfVectorXQ8 = 0;
        int meshDepthFromZQ16OrHalfVectorYQ8 = 0;
        int halfVectorZQ8 = 0;
        int drawOrderIndexOrFinalGuardQuotient = 0;
        int selectedMeshIndex = 0;
        int controlFlagSnapshot = 0;
        int[] allocatedDepthKeysAlias = null;
        int[] meshDepthKeys = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        TriangleMesh selectedMesh = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          IntKeyLookup.meshCameraTransform = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          meshCount = ArchiveIndex.logoMeshes.length;
          meshDepthKeys = new int[meshCount];
          allocatedDepthKeysAlias = meshDepthKeys;
          meshDepthKeysAlias = allocatedDepthKeysAlias;
          for (meshIndexOrViewDirectionXQ8 = 0; meshCount > meshIndexOrViewDirectionXQ8; meshIndexOrViewDirectionXQ8++) {
            meshForDepthBounds = ArchiveIndex.logoMeshes[meshIndexOrViewDirectionXQ8];
            meshForDepthBounds.refreshBounds((byte) -99);
            Geoblox.prepareLogoMeshRotation((byte) -112, meshIndexOrViewDirectionXQ8);
            boundsCenterXOrViewDirectionZQ8 = meshForDepthBounds.minX + meshForDepthBounds.maxX >> 1;
            boundsCenterYOrLightAngle = meshForDepthBounds.minY + meshForDepthBounds.maxY >> 1;
            boundsCenterZOrLightDirectionXQ8 = meshForDepthBounds.maxZ + meshForDepthBounds.minZ >> 1;
            cameraDepthBasisXQ14OrLightDirectionYQ8 = IntKeyLookup.meshCameraTransform[9] >> 2;
            cameraDepthBasisYQ14OrLightDirectionZQ8 = IntKeyLookup.meshCameraTransform[10] >> 2;
            cameraDepthBasisZQ14 = IntKeyLookup.meshCameraTransform[11] >> 2;
            meshDepthFromXQ16 = cameraDepthBasisZQ14 * TextLayoutLine.meshModelTransform[5] + cameraDepthBasisXQ14OrLightDirectionYQ8 * TextLayoutLine.meshModelTransform[3] + TextLayoutLine.meshModelTransform[4] * cameraDepthBasisYQ14OrLightDirectionZQ8 >> 14;
            meshDepthFromYQ16OrHalfVectorXQ8 = cameraDepthBasisYQ14OrLightDirectionZQ8 * TextLayoutLine.meshModelTransform[7] + (cameraDepthBasisXQ14OrLightDirectionYQ8 * TextLayoutLine.meshModelTransform[6] + TextLayoutLine.meshModelTransform[8] * cameraDepthBasisZQ14) >> 14;
            meshDepthFromZQ16OrHalfVectorYQ8 = cameraDepthBasisZQ14 * TextLayoutLine.meshModelTransform[11] + (cameraDepthBasisXQ14OrLightDirectionYQ8 * TextLayoutLine.meshModelTransform[9] + TextLayoutLine.meshModelTransform[10] * cameraDepthBasisYQ14OrLightDirectionZQ8) >> 14;
            meshDepthKeysAlias[meshIndexOrViewDirectionXQ8] = boundsCenterXOrViewDirectionZQ8 * meshDepthFromXQ16 + meshDepthFromYQ16OrHalfVectorXQ8 * boundsCenterYOrLightAngle + meshDepthFromZQ16OrHalfVectorYQ8 * boundsCenterZOrLightDirectionXQ8 >> 16;
          }
          meshIndexOrViewDirectionXQ8 = IntKeyLookup.meshCameraTransform[9] >> 8;
          viewDirectionYQ8 = IntKeyLookup.meshCameraTransform[10] >> 8;
          boundsCenterXOrViewDirectionZQ8 = IntKeyLookup.meshCameraTransform[11] >> 8;
          boundsCenterYOrLightAngle = DequeCursor.logoAnimationTick << 4;
          boundsCenterZOrLightDirectionXQ8 = 0;
          cameraDepthBasisXQ14OrLightDirectionYQ8 = DelegatingCanvas.sineQ16((byte) 81, boundsCenterYOrLightAngle) >> 8;
          cameraDepthBasisYQ14OrLightDirectionZQ8 = IntrusiveNodeHashTable.cosineQ16(boundsCenterYOrLightAngle, 2048) >> 8;
          if ((PrefixCodeDecoder.pointerXSnapshot != -1) &&
              (PcmResampler.pointerYSnapshot != -1)) {
            boundsCenterZOrLightDirectionXQ8 = -320 + PrefixCodeDecoder.pointerXSnapshot;
            cameraDepthBasisYQ14OrLightDirectionZQ8 = -128;
            cameraDepthBasisXQ14OrLightDirectionYQ8 = -PcmResampler.pointerYSnapshot + 240;
          }
          directionNormalizationScale = 256.0 / Math.sqrt((double)(cameraDepthBasisXQ14OrLightDirectionYQ8 * cameraDepthBasisXQ14OrLightDirectionYQ8 + (boundsCenterZOrLightDirectionXQ8 * boundsCenterZOrLightDirectionXQ8 + cameraDepthBasisYQ14OrLightDirectionZQ8 * cameraDepthBasisYQ14OrLightDirectionZQ8)));
          cameraDepthBasisXQ14OrLightDirectionYQ8 = (int)((double)cameraDepthBasisXQ14OrLightDirectionYQ8 * directionNormalizationScale);
          boundsCenterZOrLightDirectionXQ8 = (int)((double)boundsCenterZOrLightDirectionXQ8 * directionNormalizationScale);
          cameraDepthBasisYQ14OrLightDirectionZQ8 = (int)((double)cameraDepthBasisYQ14OrLightDirectionZQ8 * directionNormalizationScale);
          meshDepthFromYQ16OrHalfVectorXQ8 = boundsCenterZOrLightDirectionXQ8 - meshIndexOrViewDirectionXQ8;
          meshDepthFromZQ16OrHalfVectorYQ8 = cameraDepthBasisXQ14OrLightDirectionYQ8 - viewDirectionYQ8;
          halfVectorZQ8 = -boundsCenterXOrViewDirectionZQ8 + cameraDepthBasisYQ14OrLightDirectionZQ8;
          directionNormalizationScale = 256.0 / Math.sqrt((double)(halfVectorZQ8 * halfVectorZQ8 + (meshDepthFromZQ16OrHalfVectorYQ8 * meshDepthFromZQ16OrHalfVectorYQ8 + meshDepthFromYQ16OrHalfVectorXQ8 * meshDepthFromYQ16OrHalfVectorXQ8)));
          halfVectorZQ8 = (int)((double)halfVectorZQ8 * directionNormalizationScale);
          meshDepthFromYQ16OrHalfVectorXQ8 = (int)((double)meshDepthFromYQ16OrHalfVectorXQ8 * directionNormalizationScale);
          meshDepthFromZQ16OrHalfVectorYQ8 = (int)((double)meshDepthFromZQ16OrHalfVectorYQ8 * directionNormalizationScale);
          for (drawOrderIndexOrFinalGuardQuotient = 0; ArchiveIndex.logoMeshes.length > drawOrderIndexOrFinalGuardQuotient; drawOrderIndexOrFinalGuardQuotient++) {
            selectedMeshIndex = 0;
            for (depthCandidateIndex = 1; ArchiveIndex.logoMeshes.length > depthCandidateIndex; depthCandidateIndex++) {
              if (meshDepthKeys[depthCandidateIndex] <= meshDepthKeys[selectedMeshIndex]) {
                continue;
              }
              selectedMeshIndex = depthCandidateIndex;
            }
            meshDepthKeys[selectedMeshIndex] = -2147483648;
            selectedMesh = ArchiveIndex.logoMeshes[selectedMeshIndex];
            Geoblox.prepareLogoMeshRotation((byte) -112, selectedMeshIndex);
            for (translationComponentIndex = 0; translationComponentIndex < 3; translationComponentIndex++) {
              TextLayoutLine.meshModelTransform[translationComponentIndex] = TextLayoutLine.meshModelTransform[translationComponentIndex] + ValidationMessageWidget.logoMeshCenters[drawOrderIndexOrFinalGuardQuotient][translationComponentIndex];
            }
            AchievementSubmission.projectMeshAndQueueFaces(IntKeyLookup.meshCameraTransform, TextLayoutLine.meshModelTransform, selectedMesh, true, false, false, true);
            DisplayNamePanel.renderLitQueuedMeshFaces(halfVectorZQ8, cameraDepthBasisYQ14OrLightDirectionZQ8, meshDepthFromYQ16OrHalfVectorXQ8, 6562, boundsCenterZOrLightDirectionXQ8, selectedMesh, meshDepthFromZQ16OrHalfVectorYQ8, cameraDepthBasisXQ14OrLightDirectionYQ8);
          }
          drawOrderIndexOrFinalGuardQuotient = 123 / ((48 - methodGuard) / 59);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contextFailure), "ck.D(" + methodGuard + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        int var1 = -55 % ((param0 + 80) / 32);
        gameSoundThemeIds = null;
        cancelText = null;
    }

    final static void c(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Geoblox.clientControlFlowFlag;
        try {
          if (!IntrusiveDeque.hasVisibleFullscreenDialog((byte) 124)) {
            if ((InstrumentPatch.field_n != null) &&
                (InstrumentPatch.field_n.focusLost)) {
              FullscreenSupport.exitActiveFullscreen((byte) -87);
              ClientScreenExitSupport.fullscreenDialogLayer.showDialog(false, new FullscreenErrorDialog(ClientScreenExitSupport.fullscreenDialogLayer, AccountContentDialog.field_hb));
            }
            return;
          }
          if (param0 != 1) {
            TextTemplateArgumentType.renderLogoMeshes((byte) 8);
          }
          ClientScreenExitSupport.fullscreenDialogLayer.processPointerFrame(true, 127, TextLayout.fullscreenPointerOriginX, MessageDialogContent.field_I);
          ClientScreenExitSupport.fullscreenDialogLayer.advanceDialogAnimations(-50);
          while (UiFontResources.pollKeyboardEvent(125)) {
            ClientScreenExitSupport.fullscreenDialogLayer.dispatchKeyInputOrRequestFocus((byte) -126, GameAudioState.currentKeyboardEventCharacter, SessionTextHistorySupport.currentKeyboardEventCode);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ck.B(" + param0 + ')');
        }
    }

    TextTemplateArgumentType(int typeId, int unusedFirstOption, int unusedSecondOption, int valueCount) {
        this.typeId = typeId;
        this.valueCount = valueCount;
    }

    static {
        int var0 = 0;
        cancelText = "Cancel";
        gameSoundThemeIds = new int[33];
        for (var0 = 0; var0 < 3; var0++) {
            gameSoundThemeIds[var0 + 10] = 4;
            gameSoundThemeIds[13 + var0] = 3;
            gameSoundThemeIds[7 + var0] = 1;
            gameSoundThemeIds[var0 + 1] = 0;
            gameSoundThemeIds[var0 + 4] = 6;
            gameSoundThemeIds[16 + var0] = 5;
            gameSoundThemeIds[19 + var0] = 2;
        }
    }
}
