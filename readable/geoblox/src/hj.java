/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static boolean field_c;
    static int field_b;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (0 > param1 || param1 >= 65536) {
            param1 = param1 >>> 16;
            var2 += 16;
        }
        if (!(param1 < 256)) {
            var2 += 8;
            param1 = param1 >>> 8;
        }
        if (!(16 > param1)) {
            var2 += 4;
            param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
            var2 += 2;
            param1 = param1 >>> 2;
        }
        if (1 <= param1) {
            param1 = param1 >>> 1;
            var2++;
        }
        if (param0 != 58) {
            return -21;
        }
        return param1 + var2;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 != -85) {
                field_c = false;
            }
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(je.keyboardListener);
            param1.addFocusListener(je.keyboardListener);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        unusedClientGuardSnapshot = Geoblox.field_C;
        sprites = new Sprite[sb.decodedSpriteCount];
        if (methodGuard <= 60) {
          field_a = 2;
        }
        spriteIndex = 0;
        L1: while (true) {
          if (sb.decodedSpriteCount <= spriteIndex) {
            kj.clearDecodedSpriteWorkingArrays(true);
            return sprites;
          }
          {
            pixelCount = hl.decodedSpriteHeights[spriteIndex] * DualLinkNode.decodedSpriteWidths[spriteIndex];
            paletteIndices = mj.decodedSpriteIndices[spriteIndex];
            if (!ng.decodedSpriteHasNonOpaqueAlpha[spriteIndex]) {
              rgbPixelsForUpdates = new int[pixelCount];
              rgbPixelsSnapshot = rgbPixelsForUpdates;
              for (rgbPixelIndex = 0; pixelCount > rgbPixelIndex; rgbPixelIndex++) {
                rgbPixelsForUpdates[rgbPixelIndex] = cm.decodedSpritePalette[cd.andInt((int) paletteIndices[rgbPixelIndex], 255)];
              }
              sprites[spriteIndex] = new Sprite(pg.decodedSpriteCanvasWidth, dd.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], md.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], hl.decodedSpriteHeights[spriteIndex], rgbPixelsSnapshot);
              spriteIndex++;
              continue L1;
            }
            {
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
              sprites[spriteIndex] = (Sprite) ((Object) new ArgbSprite(pg.decodedSpriteCanvasWidth, dd.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], md.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], hl.decodedSpriteHeights[spriteIndex], argbPixelsSnapshot));
              spriteIndex++;
              continue L1;
            }
          }
        }
    }

    static {
        field_c = false;
        field_b = 8;
    }
}
