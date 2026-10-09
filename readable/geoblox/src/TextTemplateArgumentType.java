/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateArgumentType {
    int typeId;
    static String cancelText;
    int valueCount;
    static int[] gameSoundThemeIds;
    static boolean loginRetryAttempted;

    final static boolean returnTrueWithSoundThemeGuard(int methodGuard) {
        if (methodGuard != 0) {
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
        int meshIndexOrViewDirectionXQ8LiteralPhase1;
        int boundsCenterXOrViewDirectionZQ8LiteralPhase1;
        int boundsCenterYOrLightAngleLiteralPhase1;
        int boundsCenterZOrLightDirectionXQ8LiteralPhase1;
        int cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1;
        int cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1;
        double directionNormalizationScaleLiteralPhase1;
        int meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1;
        int meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1;
        int drawOrderIndexOrFinalGuardQuotientLiteralPhase1;
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
          meshIndexOrViewDirectionXQ8LiteralPhase1 = IntKeyLookup.meshCameraTransform[9] >> 8;
          viewDirectionYQ8 = IntKeyLookup.meshCameraTransform[10] >> 8;
          boundsCenterXOrViewDirectionZQ8LiteralPhase1 = IntKeyLookup.meshCameraTransform[11] >> 8;
          boundsCenterYOrLightAngleLiteralPhase1 = DequeCursor.logoAnimationTick << 4;
          boundsCenterZOrLightDirectionXQ8LiteralPhase1 = 0;
          cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 = DelegatingCanvas.sineQ16((byte) 81, boundsCenterYOrLightAngleLiteralPhase1) >> 8;
          cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1 = IntrusiveNodeHashTable.cosineQ16(boundsCenterYOrLightAngleLiteralPhase1, 2048) >> 8;
          if (PrefixCodeDecoder.pointerXSnapshot != -1 &&
              PcmResampler.pointerYSnapshot != -1) {
            boundsCenterZOrLightDirectionXQ8LiteralPhase1 = -320 + PrefixCodeDecoder.pointerXSnapshot;
            cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1 = -128;
            cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 = -PcmResampler.pointerYSnapshot + 240;
          }
          directionNormalizationScale = 256.0 / Math.sqrt((double)(cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 * cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 + (boundsCenterZOrLightDirectionXQ8LiteralPhase1 * boundsCenterZOrLightDirectionXQ8LiteralPhase1 + cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1 * cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1)));
          cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 = (int)((double)cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 * directionNormalizationScale);
          boundsCenterZOrLightDirectionXQ8LiteralPhase1 = (int)((double)boundsCenterZOrLightDirectionXQ8LiteralPhase1 * directionNormalizationScale);
          cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1 = (int)((double)cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1 * directionNormalizationScale);
          meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1 = boundsCenterZOrLightDirectionXQ8LiteralPhase1 - meshIndexOrViewDirectionXQ8LiteralPhase1;
          meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1 = cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1 - viewDirectionYQ8;
          halfVectorZQ8 = -boundsCenterXOrViewDirectionZQ8LiteralPhase1 + cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1;
          directionNormalizationScaleLiteralPhase1 = 256.0 / Math.sqrt((double)(halfVectorZQ8 * halfVectorZQ8 + (meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1 * meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1 + meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1 * meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1)));
          halfVectorZQ8 = (int)((double)halfVectorZQ8 * directionNormalizationScaleLiteralPhase1);
          meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1 = (int)((double)meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1 * directionNormalizationScaleLiteralPhase1);
          meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1 = (int)((double)meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1 * directionNormalizationScaleLiteralPhase1);
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
            DisplayNamePanel.renderLitQueuedMeshFaces(halfVectorZQ8, cameraDepthBasisYQ14OrLightDirectionZQ8LiteralPhase1, meshDepthFromYQ16OrHalfVectorXQ8LiteralPhase1, 6562, boundsCenterZOrLightDirectionXQ8LiteralPhase1, selectedMesh, meshDepthFromZQ16OrHalfVectorYQ8LiteralPhase1, cameraDepthBasisXQ14OrLightDirectionYQ8LiteralPhase1);
          }
          drawOrderIndexOrFinalGuardQuotientLiteralPhase1 = 123 / ((48 - methodGuard) / 59);
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

    public static void releaseStaticReferences(int methodGuard) {
        int guardRemainder = -55 % ((methodGuard + 80) / 32);
        gameSoundThemeIds = null;
        cancelText = null;
    }

    final static void updateFullscreenDialogFrame(int methodGuard) {
        int unusedClientControlSnapshot = 0;
        RuntimeException caughtFrameFailure = null;
        RuntimeException frameFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (!IntrusiveDeque.hasVisibleFullscreenDialog((byte) 124)) {
            if (InstrumentPatch.activeFullscreenCanvas != null &&
                InstrumentPatch.activeFullscreenCanvas.focusLost) {
              FullscreenSupport.exitActiveFullscreen((byte) -87);
              ClientScreenExitSupport.fullscreenDialogLayer.showDialog(false, new FullscreenErrorDialog(ClientScreenExitSupport.fullscreenDialogLayer, AccountContentDialog.fullscreenFocusLostFailureReason));
            }
            return;
          }
          if (methodGuard != 1) {
            TextTemplateArgumentType.renderLogoMeshes((byte) 8);
          }
          ClientScreenExitSupport.fullscreenDialogLayer.processPointerFrame(true, 127, TextLayout.fullscreenPointerOriginX, MessageDialogContent.fullscreenDialogPointerOriginY);
          ClientScreenExitSupport.fullscreenDialogLayer.advanceDialogAnimations(-50);
          while (UiFontResources.pollKeyboardEvent(125)) {
            ClientScreenExitSupport.fullscreenDialogLayer.dispatchKeyInputOrRequestFocus((byte) -126, GameAudioState.currentKeyboardEventCharacter, SessionTextHistorySupport.currentKeyboardEventCode);
          }
          return;
        } catch (java.lang.RuntimeException frameFailure) {
          caughtFrameFailure = frameFailure;
          frameFailureForContext = caughtFrameFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) frameFailureForContext), "ck.B(" + methodGuard + ')');
        }
    }

    TextTemplateArgumentType(int typeId, int unusedFirstOption, int unusedSecondOption, int valueCount) {
        this.typeId = typeId;
        this.valueCount = valueCount;
    }

    static {
        int soundThemeEntryIndex = 0;
        cancelText = "Cancel";
        gameSoundThemeIds = new int[33];
        for (soundThemeEntryIndex = 0; soundThemeEntryIndex < 3; soundThemeEntryIndex++) {
            gameSoundThemeIds[soundThemeEntryIndex + 10] = 4;
            gameSoundThemeIds[13 + soundThemeEntryIndex] = 3;
            gameSoundThemeIds[7 + soundThemeEntryIndex] = 1;
            gameSoundThemeIds[soundThemeEntryIndex + 1] = 0;
            gameSoundThemeIds[soundThemeEntryIndex + 4] = 6;
            gameSoundThemeIds[16 + soundThemeEntryIndex] = 5;
            gameSoundThemeIds[19 + soundThemeEntryIndex] = 2;
        }
    }
}
