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
        int meshIndex = 0;
        TriangleMesh meshForDepthBounds = null;
        int viewDirectionYQ8 = 0;
        int boundsCenterX = 0;
        int boundsCenterY = 0;
        int boundsCenterZ = 0;
        int cameraDepthBasisXQ14 = 0;
        int cameraDepthBasisYQ14 = 0;
        int cameraDepthBasisZQ14 = 0;
        double lightDirectionNormalizationScale = 0.0;
        int meshDepthFromXQ16 = 0;
        int meshDepthFromYQ16 = 0;
        int meshDepthFromZQ16 = 0;
        int halfVectorZQ8 = 0;
        int meshDrawOrderIndex = 0;
        int selectedMeshIndex = 0;
        int controlFlagSnapshot = 0;
        int[] allocatedDepthKeysAlias = null;
        int[] meshDepthKeys = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        TriangleMesh selectedMesh = null;
        int viewDirectionXQ8;
        int viewDirectionZQ8;
        int lightAngle16;
        int lightDirectionXQ8;
        int lightDirectionYQ8;
        int lightDirectionZQ8;
        double halfVectorNormalizationScale;
        int halfVectorXQ8;
        int halfVectorYQ8;
        int unusedFinalGuardQuotient;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          IntKeyLookup.meshCameraTransform = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          meshCount = ArchiveIndex.logoMeshes.length;
          meshDepthKeys = new int[meshCount];
          allocatedDepthKeysAlias = meshDepthKeys;
          meshDepthKeysAlias = allocatedDepthKeysAlias;
          for (meshIndex = 0; meshCount > meshIndex; meshIndex++) {
            meshForDepthBounds = ArchiveIndex.logoMeshes[meshIndex];
            meshForDepthBounds.refreshBounds((byte) -99);
            Geoblox.prepareLogoMeshRotation((byte) -112, meshIndex);
            boundsCenterX = meshForDepthBounds.minX + meshForDepthBounds.maxX >> 1;
            boundsCenterY = meshForDepthBounds.minY + meshForDepthBounds.maxY >> 1;
            boundsCenterZ = meshForDepthBounds.maxZ + meshForDepthBounds.minZ >> 1;
            cameraDepthBasisXQ14 = IntKeyLookup.meshCameraTransform[9] >> 2;
            cameraDepthBasisYQ14 = IntKeyLookup.meshCameraTransform[10] >> 2;
            cameraDepthBasisZQ14 = IntKeyLookup.meshCameraTransform[11] >> 2;
            meshDepthFromXQ16 = cameraDepthBasisZQ14 * TextLayoutLine.meshModelTransform[5] + cameraDepthBasisXQ14 * TextLayoutLine.meshModelTransform[3] + TextLayoutLine.meshModelTransform[4] * cameraDepthBasisYQ14 >> 14;
            meshDepthFromYQ16 = cameraDepthBasisYQ14 * TextLayoutLine.meshModelTransform[7] + (cameraDepthBasisXQ14 * TextLayoutLine.meshModelTransform[6] + TextLayoutLine.meshModelTransform[8] * cameraDepthBasisZQ14) >> 14;
            meshDepthFromZQ16 = cameraDepthBasisZQ14 * TextLayoutLine.meshModelTransform[11] + (cameraDepthBasisXQ14 * TextLayoutLine.meshModelTransform[9] + TextLayoutLine.meshModelTransform[10] * cameraDepthBasisYQ14) >> 14;
            meshDepthKeysAlias[meshIndex] = boundsCenterX * meshDepthFromXQ16 + meshDepthFromYQ16 * boundsCenterY + meshDepthFromZQ16 * boundsCenterZ >> 16;
          }
          viewDirectionXQ8 = IntKeyLookup.meshCameraTransform[9] >> 8;
          viewDirectionYQ8 = IntKeyLookup.meshCameraTransform[10] >> 8;
          viewDirectionZQ8 = IntKeyLookup.meshCameraTransform[11] >> 8;
          lightAngle16 = DequeCursor.logoAnimationTick << 4;
          lightDirectionXQ8 = 0;
          lightDirectionYQ8 = DelegatingCanvas.sineQ16((byte) 81, lightAngle16) >> 8;
          lightDirectionZQ8 = IntrusiveNodeHashTable.cosineQ16(lightAngle16, 2048) >> 8;
          if (PrefixCodeDecoder.pointerXSnapshot != -1 &&
              PcmResampler.pointerYSnapshot != -1) {
            lightDirectionXQ8 = -320 + PrefixCodeDecoder.pointerXSnapshot;
            lightDirectionZQ8 = -128;
            lightDirectionYQ8 = -PcmResampler.pointerYSnapshot + 240;
          }
          lightDirectionNormalizationScale = 256.0 / Math.sqrt((double)(lightDirectionYQ8 * lightDirectionYQ8 + (lightDirectionXQ8 * lightDirectionXQ8 + lightDirectionZQ8 * lightDirectionZQ8)));
          lightDirectionYQ8 = (int)((double)lightDirectionYQ8 * lightDirectionNormalizationScale);
          lightDirectionXQ8 = (int)((double)lightDirectionXQ8 * lightDirectionNormalizationScale);
          lightDirectionZQ8 = (int)((double)lightDirectionZQ8 * lightDirectionNormalizationScale);
          halfVectorXQ8 = lightDirectionXQ8 - viewDirectionXQ8;
          halfVectorYQ8 = lightDirectionYQ8 - viewDirectionYQ8;
          halfVectorZQ8 = -viewDirectionZQ8 + lightDirectionZQ8;
          halfVectorNormalizationScale = 256.0 / Math.sqrt((double)(halfVectorZQ8 * halfVectorZQ8 + (halfVectorYQ8 * halfVectorYQ8 + halfVectorXQ8 * halfVectorXQ8)));
          halfVectorZQ8 = (int)((double)halfVectorZQ8 * halfVectorNormalizationScale);
          halfVectorXQ8 = (int)((double)halfVectorXQ8 * halfVectorNormalizationScale);
          halfVectorYQ8 = (int)((double)halfVectorYQ8 * halfVectorNormalizationScale);
          for (meshDrawOrderIndex = 0; ArchiveIndex.logoMeshes.length > meshDrawOrderIndex; meshDrawOrderIndex++) {
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
              TextLayoutLine.meshModelTransform[translationComponentIndex] = TextLayoutLine.meshModelTransform[translationComponentIndex] + ValidationMessageWidget.logoMeshCenters[meshDrawOrderIndex][translationComponentIndex];
            }
            AchievementSubmission.projectMeshAndQueueFaces(IntKeyLookup.meshCameraTransform, TextLayoutLine.meshModelTransform, selectedMesh, true, false, false, true);
            DisplayNamePanel.renderLitQueuedMeshFaces(halfVectorZQ8, lightDirectionZQ8, halfVectorXQ8, 6562, lightDirectionXQ8, selectedMesh, halfVectorYQ8, lightDirectionYQ8);
          }
          unusedFinalGuardQuotient = 123 / ((48 - methodGuard) / 59);
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
