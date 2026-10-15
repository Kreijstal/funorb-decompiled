/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnderwaterBackground extends BackgroundScene {
    static String field_v;
    static int[] viewFacePointOneZ;
    static RgbSprite field_t;
    static PcmPlayer field_w;
    static ChatMessage[] chatHistory;
    static RgbSprite gameCompletedMessageSprite;

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard > -91) {
          viewFacePointOneZ = (int[]) null;
          if (wm.waterNearSprite == null) {
            return false;
          }
          if (null == LoginPanel.waterMidSprite) {
            return false;
          }
          if (null == ConnectionPhase.waterFarSprite) {
            return false;
          }
          if (null == TableNameEntry.waterSmallSprite) {
            return false;
          }
          if (ResourceArchiveFactory.waterRaysSprite == null) {
            return false;
          }
          if (null != ConstructionBackground.waterCharacterSprite) {
            return true;
          }
          return false;
        }
        if (wm.waterNearSprite == null) {
          return false;
        }
        if (null == LoginPanel.waterMidSprite) {
          return false;
        }
        if (null == ConnectionPhase.waterFarSprite) {
          return false;
        }
        if (null == TableNameEntry.waterSmallSprite) {
          return false;
        }
        if (ResourceArchiveFactory.waterRaysSprite == null) {
          return false;
        }
        if (null != ConstructionBackground.waterCharacterSprite) {
          return true;
        }
        return false;
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return true;
        }
        if (AchievementIcon.backgroundSpriteArchive.ensureGroupAvailableByName("water", -28138)) {
          ResourceArchiveFactory.waterRaysSprite = SpriteInputHelpers.loadRgbSpriteByName("water", "water_rays", (byte) 116, AchievementIcon.backgroundSpriteArchive);
          wm.waterNearSprite = SpriteInputHelpers.loadRgbSpriteByName("water", "water_near", (byte) 105, AchievementIcon.backgroundSpriteArchive);
          LoginPanel.waterMidSprite = SpriteInputHelpers.loadRgbSpriteByName("water", "water_mid", (byte) 109, AchievementIcon.backgroundSpriteArchive);
          ConnectionPhase.waterFarSprite = SpriteInputHelpers.loadRgbSpriteByName("water", "water_far", (byte) -121, AchievementIcon.backgroundSpriteArchive);
          TableNameEntry.waterSmallSprite = SpriteInputHelpers.loadRgbSpriteByName("water", "water_small", (byte) 112, AchievementIcon.backgroundSpriteArchive);
          ConstructionBackground.waterCharacterSprite = SpriteInputHelpers.loadRgbSpriteByName("water", "water_character", (byte) -43, AchievementIcon.backgroundSpriteArchive);
          SocialTabbedPanel.field_b = new RgbSprite(ConnectionPhase.waterFarSprite.canvasWidth, ConnectionPhase.waterFarSprite.canvasHeight);
          IndexedSpriteGeometry.pushSpriteRaster(-49, SocialTabbedPanel.field_b);
          ConnectionPhase.waterFarSprite.drawVerticallyFlipped(0, 0);
          sc.popRaster(-81);
          WeightedLruCache.field_e = jh.a(0, wm.waterNearSprite);
          GameplayScreen.field_l = jh.a(0, LoginPanel.waterMidSprite);
          BufferedFile.field_a = jh.a(0, ConnectionPhase.waterFarSprite);
          Under13RegistrationNoticePanel.field_P = jh.a(0, SocialTabbedPanel.field_b);
          uo.field_d = new RgbSprite(ResourceArchiveFactory.waterRaysSprite.canvasWidth / 2, ResourceArchiveFactory.waterRaysSprite.canvasHeight);
          IndexedSpriteGeometry.pushSpriteRaster(-83, uo.field_d);
          ResourceArchiveFactory.waterRaysSprite.a(0, 0, ResourceArchiveFactory.waterRaysSprite.canvasWidth / 2, ResourceArchiveFactory.waterRaysSprite.canvasHeight);
          sc.popRaster(-114);
          SpriteInputHelpers.encodeBinaryMaskRuns(ConnectionPhase.waterFarSprite, 0);
          SpriteInputHelpers.encodeBinaryMaskRuns(SocialTabbedPanel.field_b, 0);
          SpriteInputHelpers.encodeBinaryMaskRuns(BufferedFile.field_a, 0);
          SpriteInputHelpers.encodeBinaryMaskRuns(Under13RegistrationNoticePanel.field_P, 0);
          SpriteInputHelpers.encodeBinaryMaskRuns(ResourceArchiveFactory.waterRaysSprite, 0);
          SpriteInputHelpers.encodeBinaryMaskRuns(uo.field_d, 0);
          return true;
        }
        return false;
    }

    final RgbSprite c(byte param0) {
        if (param0 >= -74) {
          field_t = (RgbSprite) null;
          return ConstructionBackground.waterCharacterSprite;
        }
        return ConstructionBackground.waterCharacterSprite;
    }

    UnderwaterBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
    }

    final static void requestFindOpponents(int opcode, byte obfuscationGuard) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(obfuscationGuard ^ -13319, opcode);
        packet.position = packet.position + 1;
        int payloadStart = packet.position;
        packet.writeByte(6, 2);
        packet.writeBytes(CalendarMatchmakingState.matchmakingChoiceMask, obfuscationGuard - 99, 0, CalendarMatchmakingState.matchmakingChoiceMask.length);
        packet.writeByte(-125, LinkWidgetRenderer.matchmakingOptionByteOne);
        packet.writeByte(obfuscationGuard ^ -12, ResourceArchive.matchmakingOptionByteTwo);
        if (obfuscationGuard == 98) {
          packet.writeBytes(PowerUpWarning.matchmakingSettingMask, -1, 0, PowerUpWarning.matchmakingSettingMask.length);
          packet.backfillByteLength((byte) 126, -payloadStart + packet.position);
          return;
        }
        UnderwaterBackground.d((byte) 3);
        packet.writeBytes(PowerUpWarning.matchmakingSettingMask, -1, 0, PowerUpWarning.matchmakingSettingMask.length);
        packet.backfillByteLength((byte) 126, -payloadStart + packet.position);
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var8 = null;
        if (obfuscationGuard > -84) {
          this.drawPreview((byte) -90, 97, -35, 25);
          if (!this.hasSprites((byte) -95)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, TextWidgetRenderer.underwaterBackgroundColors[colorIndex], 928072);
            return;
          }
          var8 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 106);
          if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            hh.a(BufferedFile.field_a, -13, 2, var8, -8562, colorIndex, Under13RegistrationNoticePanel.field_P);
            var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          BubbleDistortion.a(scroll16, WeightedLruCache.field_e, var8.sprite, 2, 2, GameplayScreen.field_l, -13, colorIndex, destinationY, destinationX, uo.field_d, 306);
          return;
        }
        if (!this.hasSprites((byte) -95)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, TextWidgetRenderer.underwaterBackgroundColors[colorIndex], 928072);
          return;
        }
        RasterCacheSurface var9 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 106);
        if (!var9.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          hh.a(BufferedFile.field_a, -13, 2, var9, -8562, colorIndex, Under13RegistrationNoticePanel.field_P);
          var9.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        BubbleDistortion.a(scroll16, WeightedLruCache.field_e, var9.sprite, 2, 2, GameplayScreen.field_l, -13, colorIndex, destinationY, destinationX, uo.field_d, 306);
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var7 = null;
        if (!obfuscationGuard) {
          field_w = (PcmPlayer) null;
          if (!this.hasSprites((byte) -112)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, TextWidgetRenderer.underwaterBackgroundColors[colorIndex], 928072);
            return;
          }
          var7 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            hh.a(ConnectionPhase.waterFarSprite, 0, 1, var7, -8562, colorIndex, SocialTabbedPanel.field_b);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          BubbleDistortion.a(scroll16, wm.waterNearSprite, var7.sprite, 1, 2, LoginPanel.waterMidSprite, 0, colorIndex, destinationY, destinationX, ResourceArchiveFactory.waterRaysSprite, 640);
          return;
        }
        if (!this.hasSprites((byte) -112)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, TextWidgetRenderer.underwaterBackgroundColors[colorIndex], 928072);
          return;
        }
        RasterCacheSurface var8 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
        if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          hh.a(ConnectionPhase.waterFarSprite, 0, 1, var8, -8562, colorIndex, SocialTabbedPanel.field_b);
          var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        BubbleDistortion.a(scroll16, wm.waterNearSprite, var8.sprite, 1, 2, LoginPanel.waterMidSprite, 0, colorIndex, destinationY, destinationX, ResourceArchiveFactory.waterRaysSprite, 640);
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (colorIndex <= -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 16777215, 11184810);
          if (this.hasSprites((byte) -98)) {
            TableNameEntry.waterSmallSprite.drawTransparent(destinationX, destinationY);
            var5 = 14 / ((obfuscationGuard + 28) / 43);
            return;
          }
          var5Lifetime3 = 14 / ((obfuscationGuard + 28) / 43);
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, TextWidgetRenderer.underwaterBackgroundColors[colorIndex], 928072);
        if (this.hasSprites((byte) -98)) {
          TableNameEntry.waterSmallSprite.drawTransparent(destinationX, destinationY);
          var5Lifetime1 = 14 / ((obfuscationGuard + 28) / 43);
          return;
        }
        var5Lifetime2 = 14 / ((obfuscationGuard + 28) / 43);
    }

    public static void d(byte param0) {
        gameCompletedMessageSprite = null;
        field_v = null;
        if (param0 == -46) {
          viewFacePointOneZ = null;
          field_t = null;
          field_w = null;
          chatHistory = null;
          return;
        }
        viewFacePointOneZ = (int[]) null;
        viewFacePointOneZ = null;
        field_t = null;
        field_w = null;
        chatHistory = null;
    }

    static {
        viewFacePointOneZ = new int[8192];
        field_v = "New Game";
    }
}
