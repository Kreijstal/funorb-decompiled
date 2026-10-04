/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteConstructionSupport {
    static int clientScreenStage;
    static boolean achievementMaskReceived;
    static int sunThemeCompletionAchievementId;

    final static int unsignedBitLength(byte methodGuard, int remainingBits) {
        int shiftedBitCount = 0;
        if (0 > remainingBits || remainingBits >= 65536) {
            remainingBits = remainingBits >>> 16;
            shiftedBitCount += 16;
        }
        if (!(remainingBits < 256)) {
            shiftedBitCount += 8;
            remainingBits = remainingBits >>> 8;
        }
        if (!(16 > remainingBits)) {
            shiftedBitCount += 4;
            remainingBits = remainingBits >>> 4;
        }
        if (remainingBits >= 4) {
            shiftedBitCount += 2;
            remainingBits = remainingBits >>> 2;
        }
        if (1 <= remainingBits) {
            remainingBits = remainingBits >>> 1;
            shiftedBitCount++;
        }
        if (methodGuard != 58) {
            return -21;
        }
        return remainingBits + shiftedBitCount;
    }

    final static void attachKeyboardListeners(byte methodGuard, java.awt.Component component) {
        try {
            if (methodGuard != -85) {
                achievementMaskReceived = false;
            }
            component.setFocusTraversalKeysEnabled(false);
            component.addKeyListener(TrackedPcmStream.keyboardListener);
            component.addFocusListener(TrackedPcmStream.keyboardListener);
        } catch (RuntimeException listenerAttachmentFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) listenerAttachmentFailure), "hj.A(" + methodGuard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] buildSpritesWithDecodedAlpha(int methodGuard) {
        int rgbPixelIndex = 0;
        int argbPixelIndex = 0;
        Sprite[] sprites;
        int spriteIndex;
        int pixelCount;
        byte[] unusedAlphaPlaneAlias;
        int[] argbPixelsForUpdates;
        int unusedClientGuardSnapshot;
        byte[] alphaPlaneAlias;
        int[] rgbPixelsForUpdates;
        byte[] alphaPlaneForwarded;
        int[] argbPixelsForwarded;
        byte[] alphaPlaneSnapshot;
        int[] argbPixelsSnapshot;
        byte[] paletteIndices;
        int[] rgbPixelsSnapshot;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        sprites = new Sprite[ClientTimingSupport.decodedSpriteCount];
        if (methodGuard <= 60) {
          clientScreenStage = 2;
        }
        spriteIndex = 0;
        while (true) {
          if (ClientTimingSupport.decodedSpriteCount <= spriteIndex) {
            MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
            return sprites;
          }
          pixelCount = ProgressBarWidget.decodedSpriteHeights[spriteIndex] * DualLinkNode.decodedSpriteWidths[spriteIndex];
          paletteIndices = TextConcatenationSupport.decodedSpriteIndices[spriteIndex];
          if (!DialogLayer.decodedSpriteHasNonOpaqueAlpha[spriteIndex]) {
            rgbPixelsForUpdates = new int[pixelCount];
            rgbPixelsSnapshot = rgbPixelsForUpdates;
            for (rgbPixelIndex = 0; pixelCount > rgbPixelIndex; rgbPixelIndex++) {
              rgbPixelsForUpdates[rgbPixelIndex] = NanoFrameTimer.decodedSpritePalette[ProxySocketConnector.andInt((int) paletteIndices[rgbPixelIndex], 255)];
            }
            sprites[spriteIndex] = new Sprite(GameplaySetupSupport.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], GmtTimestampSupport.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], ProgressBarWidget.decodedSpriteHeights[spriteIndex], rgbPixelsSnapshot);
            spriteIndex++;
            continue;
          }
          alphaPlaneSnapshot = HotspotTextWidget.decodedSpriteAlpha[spriteIndex];
          alphaPlaneForwarded = alphaPlaneSnapshot;
          alphaPlaneAlias = alphaPlaneForwarded;
          unusedAlphaPlaneAlias = alphaPlaneAlias;
          argbPixelsSnapshot = new int[pixelCount];
          argbPixelsForwarded = argbPixelsSnapshot;
          argbPixelsForUpdates = argbPixelsForwarded;
          for (argbPixelIndex = 0; argbPixelIndex < pixelCount; argbPixelIndex++) {
            argbPixelsForUpdates[argbPixelIndex] = SessionInstanceState.orInt(ProxySocketConnector.andInt(alphaPlaneSnapshot[argbPixelIndex] << 24, -16777216), NanoFrameTimer.decodedSpritePalette[ProxySocketConnector.andInt((int) paletteIndices[argbPixelIndex], 255)]);
          }
          sprites[spriteIndex] = (Sprite) ((Object) new ArgbSprite(GameplaySetupSupport.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], GmtTimestampSupport.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], ProgressBarWidget.decodedSpriteHeights[spriteIndex], argbPixelsSnapshot));
          spriteIndex++;
          continue;
        }
    }

    static {
        achievementMaskReceived = false;
        sunThemeCompletionAchievementId = 8;
    }
}
