/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteFactorySupport {
    static int field_b;
    static IntrusiveDeque field_a;

    public static void releaseStatics(int guard) {
        int var1 = 86 / ((-10 - guard) / 57);
        field_a = null;
    }

    final static Sprite buildSpriteFromSheet(int guard) {
        Object var3 = null;
        int var7 = EscapeVector.obfuscationControl;
        Object var3Lifetime1;
        if (guard > 44) {
          int var1 = SpriteLoadTask.spriteWidths[0] * SavedDataQuerySupport.spriteHeights[0];
          byte[] var21 = AnimatedPathMarker.spriteIndices[0];
          if (UiContainer.spriteHasAlpha[0]) {
            byte[] var20 = CheckboxPainter.spriteAlphas[0];
            int[] var13 = new int[var1];
            int[] var11 = var13;
            int[] var5_ref_int__ = var11;
            for (int var6 = 0; var1 > var6; var6++) {
              var5_ref_int__[var6] = MatchingTextValidator.a(SpriteCheckboxPainter.bitwiseAnd(var20[var6] << 24, -16777216), ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var21[var6], 255)]);
            }
            var3 = new ArgbSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[0], ChatMessage.spriteOffsetYs[0], SpriteLoadTask.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var13);
          } else {
            int[] var9 = new int[var1];
            for (int var5 = 0; var1 > var5; var5++) {
              var9[var5] = ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var21[var5], 255)];
            }
            var3 = new Sprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[0], ChatMessage.spriteOffsetYs[0], SpriteLoadTask.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var9);
          }
          SpriteDecodeSupport.releaseSpriteSheet(false);
          return (Sprite) (var3);
        }
        SpriteFactorySupport.releaseStatics(24);
        int var1Lifetime1 = SpriteLoadTask.spriteWidths[0] * SavedDataQuerySupport.spriteHeights[0];
        byte[] var19 = AnimatedPathMarker.spriteIndices[0];
        if (UiContainer.spriteHasAlpha[0]) {
          byte[] var18 = CheckboxPainter.spriteAlphas[0];
          int[] var13Lifetime1 = new int[var1Lifetime1];
          int[] var11Lifetime1 = var13Lifetime1;
          int[] var5_ref_int__Lifetime1 = var11Lifetime1;
          for (int var6Lifetime1 = 0; var1Lifetime1 > var6Lifetime1; var6Lifetime1++) {
            var5_ref_int__Lifetime1[var6Lifetime1] = MatchingTextValidator.a(SpriteCheckboxPainter.bitwiseAnd(var18[var6Lifetime1] << 24, -16777216), ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var19[var6Lifetime1], 255)]);
          }
          var3Lifetime1 = new ArgbSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[0], ChatMessage.spriteOffsetYs[0], SpriteLoadTask.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var13Lifetime1);
        } else {
          int[] var9Lifetime1 = new int[var1Lifetime1];
          for (int var5Lifetime1 = 0; var1Lifetime1 > var5Lifetime1; var5Lifetime1++) {
            var9Lifetime1[var5Lifetime1] = ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var19[var5Lifetime1], 255)];
          }
          var3Lifetime1 = new Sprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[0], ChatMessage.spriteOffsetYs[0], SpriteLoadTask.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var9Lifetime1);
        }
        SpriteDecodeSupport.releaseSpriteSheet(false);
        return (Sprite) (var3Lifetime1);
    }

    final static int levelCount(boolean guard, int mode) {
        if (guard) {
          SpriteFactorySupport.buildSpriteFromSheet(13);
          if (AchievementRecord.a(mode, -102)) {
            return pc.levelNameCount(2513, mode);
          }
          return 0;
        }
        if (AchievementRecord.a(mode, -102)) {
          return pc.levelNameCount(2513, mode);
        }
        return 0;
    }

    final static void initializeIntroAssets(ResourceArchive archive, PcmStreamMixer mixer, int durationMillis, byte guard) {
        try {
          NodeHashTableIterator.field_h = FrameCadenceSupport.ticksPerSecond(0) * durationMillis / 1000;
          on.a(archive, -58);
          LoginForm.loadLogoMeshes(archive, (byte) 110);
          IntroFinalFrameSupport.loadFinalFrame(0, archive);
          GuestLoginSupport.initializeIntroIntensityRamp(-83);
          if (guard < 80) {
            String var5 = (String) null;
            SpriteFactorySupport.printEncodedError(false, (String) null);
          }
          id.c(120);
          SocketConnector.field_d = 0 - NodeHashTableIterator.field_h;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "je.A(" + (archive != null ? "{...}" : "null") + ',' + (mixer != null ? "{...}" : "null") + ',' + durationMillis + ',' + guard + ')');
        }
    }

    final static void printEncodedError(boolean guard, String message) {
        System.out.println("Error: " + ResizableModalPanel.replaceAllLiteral(message, "%0a", (byte) 111, "\n"));
        if (guard) {
          String var3 = (String) null;
          SpriteFactorySupport.printEncodedError(false, (String) null);
        }
    }

    static {
        field_a = new IntrusiveDeque();
    }
}
