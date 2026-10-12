/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv {
    static String field_b;
    static RgbSprite[][][] field_a;

    final static RgbSprite buildFirstDecodedRgbSprite(int obfuscationGuard) {
        RgbSprite var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var1 = c.decodedSpriteHeights[0] * qm.decodedSpriteWidths[0];
        byte[] var6 = AnimationPlayer.decodedSpriteIndices[0];
        byte[] var2 = var6;
        int[] var3 = new int[var1];
        int var4_int = 0;
        RgbSprite var4Lifetime1;
        if (obfuscationGuard != 2809) {
          gv.buildFirstDecodedRgbSprite(11);
          while (var1 > var4_int) {
            var3[var4_int] = MovementPresentation.decodedSpritePalette[rn.bitwiseAnd(255, (int) var6[var4_int])];
            var4_int++;
          }
          var4 = new RgbSprite(lg.decodedSpriteCanvasWidth, wr.decodedSpriteCanvasHeight, j.decodedSpriteOffsetXs[0], CampaignMenuButton.decodedSpriteOffsetYs[0], qm.decodedSpriteWidths[0], c.decodedSpriteHeights[0], var3);
          rj.releaseSpriteDecodeBuffers((byte) 97);
          return var4;
        }
        while (var1 > var4_int) {
          var3[var4_int] = MovementPresentation.decodedSpritePalette[rn.bitwiseAnd(255, (int) var6[var4_int])];
          var4_int++;
        }
        var4Lifetime1 = new RgbSprite(lg.decodedSpriteCanvasWidth, wr.decodedSpriteCanvasHeight, j.decodedSpriteOffsetXs[0], CampaignMenuButton.decodedSpriteOffsetYs[0], qm.decodedSpriteWidths[0], c.decodedSpriteHeights[0], var3);
        rj.releaseSpriteDecodeBuffers((byte) 97);
        return var4Lifetime1;
    }

    public static void b(int param0) {
        field_a = (RgbSprite[][][]) null;
        field_b = null;
        if (param0 > 82) {
          return;
        }
        gv.buildFirstDecodedRgbSprite(24);
    }

    static {
        field_b = "Fog of War: ";
    }
}
