/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static boolean achievementMaskReceived;
    static int field_b;

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

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 != -85) {
                achievementMaskReceived = false;
            }
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(je.keyboardListener);
            param1.addFocusListener(je.keyboardListener);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        sprites = new Sprite[sb.decodedSpriteCount];
        if (methodGuard <= 60) {
          field_a = 2;
        }
        spriteIndex = 0;
        while (true) {
          if (sb.decodedSpriteCount <= spriteIndex) {
            kj.clearDecodedSpriteWorkingArrays(true);
            return sprites;
          }
          pixelCount = hl.decodedSpriteHeights[spriteIndex] * DualLinkNode.decodedSpriteWidths[spriteIndex];
          paletteIndices = mj.decodedSpriteIndices[spriteIndex];
          if (!DialogLayer.decodedSpriteHasNonOpaqueAlpha[spriteIndex]) {
            rgbPixelsForUpdates = new int[pixelCount];
            rgbPixelsSnapshot = rgbPixelsForUpdates;
            for (rgbPixelIndex = 0; pixelCount > rgbPixelIndex; rgbPixelIndex++) {
              rgbPixelsForUpdates[rgbPixelIndex] = cm.decodedSpritePalette[cd.andInt((int) paletteIndices[rgbPixelIndex], 255)];
            }
            sprites[spriteIndex] = new Sprite(pg.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], md.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], hl.decodedSpriteHeights[spriteIndex], rgbPixelsSnapshot);
            spriteIndex++;
            continue;
          }
          alphaPlaneSnapshot = vf.decodedSpriteAlpha[spriteIndex];
          alphaPlaneForwarded = alphaPlaneSnapshot;
          alphaPlaneAlias = alphaPlaneForwarded;
          unusedAlphaPlaneAlias = alphaPlaneAlias;
          argbPixelsSnapshot = new int[pixelCount];
          argbPixelsForwarded = argbPixelsSnapshot;
          argbPixelsForUpdates = argbPixelsForwarded;
          for (argbPixelIndex = 0; argbPixelIndex < pixelCount; argbPixelIndex++) {
            argbPixelsForUpdates[argbPixelIndex] = lb.orInt(cd.andInt(alphaPlaneSnapshot[argbPixelIndex] << 24, -16777216), cm.decodedSpritePalette[cd.andInt((int) paletteIndices[argbPixelIndex], 255)]);
          }
          sprites[spriteIndex] = (Sprite) ((Object) new ArgbSprite(pg.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], md.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], hl.decodedSpriteHeights[spriteIndex], argbPixelsSnapshot));
          spriteIndex++;
          continue;
        }
    }

    static {
        achievementMaskReceived = false;
        field_b = 8;
    }
}
