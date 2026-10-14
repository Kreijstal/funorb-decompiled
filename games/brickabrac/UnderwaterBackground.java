/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnderwaterBackground extends BackgroundScene {
    static String field_v;
    static int[] viewFacePointOneZ;
    static RgbSprite field_t;
    static PcmPlayer field_w;
    static ChatMessage[] chatHistory;
    static RgbSprite field_u;

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard > -91) {
          viewFacePointOneZ = (int[]) null;
          if (wm.waterNearSprite == null) {
            return false;
          }
          if (null == hk.waterMidSprite) {
            return false;
          }
          if (null == n.waterFarSprite) {
            return false;
          }
          if (null == TableNameEntry.waterSmallSprite) {
            return false;
          }
          if (go.waterRaysSprite == null) {
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
        if (null == hk.waterMidSprite) {
          return false;
        }
        if (null == n.waterFarSprite) {
          return false;
        }
        if (null == TableNameEntry.waterSmallSprite) {
          return false;
        }
        if (go.waterRaysSprite == null) {
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
        if (AchievementIcon.field_m.ensureGroupAvailableByName("water", -28138)) {
          go.waterRaysSprite = pl.loadRgbSpriteByName("water", "water_rays", (byte) 116, AchievementIcon.field_m);
          wm.waterNearSprite = pl.loadRgbSpriteByName("water", "water_near", (byte) 105, AchievementIcon.field_m);
          hk.waterMidSprite = pl.loadRgbSpriteByName("water", "water_mid", (byte) 109, AchievementIcon.field_m);
          n.waterFarSprite = pl.loadRgbSpriteByName("water", "water_far", (byte) -121, AchievementIcon.field_m);
          TableNameEntry.waterSmallSprite = pl.loadRgbSpriteByName("water", "water_small", (byte) 112, AchievementIcon.field_m);
          ConstructionBackground.waterCharacterSprite = pl.loadRgbSpriteByName("water", "water_character", (byte) -43, AchievementIcon.field_m);
          vj.field_b = new RgbSprite(n.waterFarSprite.canvasWidth, n.waterFarSprite.canvasHeight);
          IndexedSpriteGeometry.pushSpriteRaster(-49, vj.field_b);
          n.waterFarSprite.g(0, 0);
          sc.popRaster(-81);
          to.field_e = jh.a(0, wm.waterNearSprite);
          GameplayScreen.field_l = jh.a(0, hk.waterMidSprite);
          BufferedFile.field_a = jh.a(0, n.waterFarSprite);
          ig.field_P = jh.a(0, vj.field_b);
          uo.field_d = new RgbSprite(go.waterRaysSprite.canvasWidth / 2, go.waterRaysSprite.canvasHeight);
          IndexedSpriteGeometry.pushSpriteRaster(-83, uo.field_d);
          go.waterRaysSprite.a(0, 0, go.waterRaysSprite.canvasWidth / 2, go.waterRaysSprite.canvasHeight);
          sc.popRaster(-114);
          pl.a(n.waterFarSprite, 0);
          pl.a(vj.field_b, 0);
          pl.a(BufferedFile.field_a, 0);
          pl.a(ig.field_P, 0);
          pl.a(go.waterRaysSprite, 0);
          pl.a(uo.field_d, 0);
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
        BitPacketBuffer packet = k.outgoingPackets;
        packet.writeCipheredOpcode(obfuscationGuard ^ -13319, opcode);
        packet.position = packet.position + 1;
        int payloadStart = packet.position;
        packet.writeByte(6, 2);
        packet.writeBytes(rh.matchmakingChoiceMask, obfuscationGuard - 99, 0, rh.matchmakingChoiceMask.length);
        packet.writeByte(-125, bb.matchmakingOptionByteOne);
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
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, um.underwaterBackgroundColors[colorIndex], 928072);
            return;
          }
          var8 = kd.a(this.sceneId, colorIndex, (byte) 106);
          if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            hh.a(BufferedFile.field_a, -13, 2, var8, -8562, colorIndex, ig.field_P);
            var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          BubbleDistortion.a(scroll16, to.field_e, var8.sprite, 2, 2, GameplayScreen.field_l, -13, colorIndex, destinationY, destinationX, uo.field_d, 306);
          return;
        }
        if (!this.hasSprites((byte) -95)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, um.underwaterBackgroundColors[colorIndex], 928072);
          return;
        }
        RasterCacheSurface var9 = kd.a(this.sceneId, colorIndex, (byte) 106);
        if (!var9.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          hh.a(BufferedFile.field_a, -13, 2, var9, -8562, colorIndex, ig.field_P);
          var9.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        BubbleDistortion.a(scroll16, to.field_e, var9.sprite, 2, 2, GameplayScreen.field_l, -13, colorIndex, destinationY, destinationX, uo.field_d, 306);
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var7 = null;
        if (!obfuscationGuard) {
          field_w = (PcmPlayer) null;
          if (!this.hasSprites((byte) -112)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, um.underwaterBackgroundColors[colorIndex], 928072);
            return;
          }
          var7 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            hh.a(n.waterFarSprite, 0, 1, var7, -8562, colorIndex, vj.field_b);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          BubbleDistortion.a(scroll16, wm.waterNearSprite, var7.sprite, 1, 2, hk.waterMidSprite, 0, colorIndex, destinationY, destinationX, go.waterRaysSprite, 640);
          return;
        }
        if (!this.hasSprites((byte) -112)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, um.underwaterBackgroundColors[colorIndex], 928072);
          return;
        }
        RasterCacheSurface var8 = PowerUp.a(this.sceneId, colorIndex, -20777);
        if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          hh.a(n.waterFarSprite, 0, 1, var8, -8562, colorIndex, vj.field_b);
          var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        BubbleDistortion.a(scroll16, wm.waterNearSprite, var8.sprite, 1, 2, hk.waterMidSprite, 0, colorIndex, destinationY, destinationX, go.waterRaysSprite, 640);
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
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, um.underwaterBackgroundColors[colorIndex], 928072);
        if (this.hasSprites((byte) -98)) {
          TableNameEntry.waterSmallSprite.drawTransparent(destinationX, destinationY);
          var5Lifetime1 = 14 / ((obfuscationGuard + 28) / 43);
          return;
        }
        var5Lifetime2 = 14 / ((obfuscationGuard + 28) / 43);
    }

    public static void d(byte param0) {
        field_u = null;
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
