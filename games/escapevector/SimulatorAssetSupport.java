/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SimulatorAssetSupport {
    static PcmSample field_a;
    static int field_b;

    final static int multiplyQ16(boolean guard, int left, int right) {
        int var3 = left >> 16;
        if (!guard) {
          int var4 = left & 65535;
          int var5 = right >> 16;
          int var6 = right & 65535;
          return var4 * var5 + right * var3 + (var6 * var4 >> 16);
        }
        field_a = (PcmSample) null;
        int var4Lifetime1 = left & 65535;
        int var5Lifetime1 = right >> 16;
        int var6Lifetime1 = right & 65535;
        return var4Lifetime1 * var5Lifetime1 + right * var3 + (var6Lifetime1 * var4Lifetime1 >> 16);
    }

    final static boolean loadSimulatorTheme(int slot) {
        boolean var1 = (ThemeAssetSupport.loadTheme(4, 5));
        ChatMessageDecoder.field_b[6][slot] = SharedSpriteAssets.field_a;
        return (var1);
    }

    final static IndexedSprite[] buildIndexedSpritesFromSheet(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        IndexedSprite[] var1 = new IndexedSprite[ArchiveLoadTask.spriteCount];
        if (guard == 13029) {
          for (int var2 = 0; ArchiveLoadTask.spriteCount > var2; var2++) {
            var1[var2] = new IndexedSprite(IntroAudioSupport.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[var2], ChatMessage.spriteOffsetYs[var2], SpriteLoadTask.spriteWidths[var2], SavedDataQuerySupport.spriteHeights[var2], AnimatedPathMarker.spriteIndices[var2], ArchiveLoadTask.spritePalette);
          }
          SpriteDecodeSupport.releaseSpriteSheet(false);
          return var1;
        }
        SimulatorAssetSupport.loadSimulatorSprites(16);
        for (int var2Lifetime1 = 0; ArchiveLoadTask.spriteCount > var2Lifetime1; var2Lifetime1++) {
          var1[var2Lifetime1] = new IndexedSprite(IntroAudioSupport.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[var2Lifetime1], ChatMessage.spriteOffsetYs[var2Lifetime1], SpriteLoadTask.spriteWidths[var2Lifetime1], SavedDataQuerySupport.spriteHeights[var2Lifetime1], AnimatedPathMarker.spriteIndices[var2Lifetime1], ArchiveLoadTask.spritePalette);
        }
        SpriteDecodeSupport.releaseSpriteSheet(false);
        return var1;
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        if (guard >= -113) {
          field_a = (PcmSample) null;
        }
    }

    final static void loadSimulatorSprites(int guard) {
        int var6 = EscapeVector.obfuscationControl;
        if (!UiContainer.hasMembership((byte) 118)) {
          return;
        }
        String var1 = "simulator";
        if (!IndexedSpriteState.field_j.tryLoadNamedGroup(guard, var1)) {
          return;
        }
        try {
          ArchiveProvider.field_b = new Sprite[17];
          String[] var2 = AlternateUsernameCredentials.field_k;
          for (int var3_int = 0; var2.length > var3_int; var3_int++) {
            String var4 = var2[var3_int];
            Sprite var5 = MembershipPromotionScreen.loadNamedSprite(var1, IndexedSpriteState.field_j, var4, true);
            ArchiveProvider.field_b[var3_int] = var5;
          }
          String var3 = "infrastructure_virtual";
          ServerListNavigationSupport.field_a = SpriteArchiveSupport.loadNamedSprites(IndexedSpriteState.field_j, (byte) 126, var1, var3);
          String var3Lifetime1 = "seeker_mine";
          TerrainMaskSupport.field_a = MembershipPromotionScreen.loadNamedSprite(var1, IndexedSpriteState.field_j, var3Lifetime1, true);
          String var3Lifetime2 = "rock_buster";
          BitCountSupport.field_a = MembershipPromotionScreen.loadNamedSprite(var1, IndexedSpriteState.field_j, var3Lifetime2, true);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fg.B(" + guard + ')');
        }
    }

    static {
    }
}
