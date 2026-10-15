/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArcticBackground extends BackgroundScene {
    static MenuSelection textChoiceSelection;
    static String field_u;
    static int[] faceDepthBucketCounts;
    static UiComponent field_s;
    static int field_t;
    static String field_v;

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var8 = null;
        if (obfuscationGuard >= -84) {
          this.drawFullBackground(false, 56, -90, -99, 75);
          if (!this.hasSprites((byte) -111)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, RadialSelectorRenderer.arcticBackgroundColors[colorIndex], 16777215);
            return;
          }
          var8 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 107);
          if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            AccountRegistrationPanel.a(2, colorIndex, var8, -35, 23275, Brick.field_K);
            var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            SpriteGeometry.a(var8.sprite, 306, destinationY, destinationX, colorIndex, scroll16, un.field_d, 2, LogoRenderHelpers.field_d, 1, -35);
            return;
          }
          SpriteGeometry.a(var8.sprite, 306, destinationY, destinationX, colorIndex, scroll16, un.field_d, 2, LogoRenderHelpers.field_d, 1, -35);
          return;
        }
        if (!this.hasSprites((byte) -111)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, RadialSelectorRenderer.arcticBackgroundColors[colorIndex], 16777215);
          return;
        }
        RasterCacheSurface var9 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 107);
        if (var9.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          SpriteGeometry.a(var9.sprite, 306, destinationY, destinationX, colorIndex, scroll16, un.field_d, 2, LogoRenderHelpers.field_d, 1, -35);
          return;
        }
        AccountRegistrationPanel.a(2, colorIndex, var9, -35, 23275, Brick.field_K);
        var9.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        SpriteGeometry.a(var9.sprite, 306, destinationY, destinationX, colorIndex, scroll16, un.field_d, 2, LogoRenderHelpers.field_d, 1, -35);
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 22 % ((obfuscationGuard + 28) / 43);
        if (colorIndex > -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 160, 238, RadialSelectorRenderer.arcticBackgroundColors[colorIndex], 16777215);
          if (this.hasSprites((byte) -107)) {
            WidgetPaintStyle.arcticSmallSprite.drawTransparent(destinationX, destinationY);
            return;
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 240, 16777215, 11184810);
        if (this.hasSprites((byte) -107)) {
          WidgetPaintStyle.arcticSmallSprite.drawTransparent(destinationX, destinationY);
          return;
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard > -91) {
          field_v = (String) null;
          if (null == ResourcePreparationQueue.arcticNearSprite) {
            return false;
          }
          if (BallPulseEffect.arcticMidSprite == null) {
            return false;
          }
          if (null == LoginPanel.arcticFarSprite) {
            return false;
          }
          if (WidgetPaintStyle.arcticSmallSprite != null) {
            return true;
          }
          return false;
        }
        if (null == ResourcePreparationQueue.arcticNearSprite) {
          return false;
        }
        if (BallPulseEffect.arcticMidSprite == null) {
          return false;
        }
        if (null == LoginPanel.arcticFarSprite) {
          return false;
        }
        if (WidgetPaintStyle.arcticSmallSprite != null) {
          return true;
        }
        return false;
    }

    ArcticBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        try {
          ga.arcticCentreSprites = new RgbSprite[2];
          ObjectHistoryBuffer.arcticCapsSprites = new RgbSprite[2][];
          BoardPresentationHelpers.arcticSegsSprites = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fi.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectPrefix != null ? "{...}" : "null") + ',' + soundEffectCount + ')');
        }
    }

    public static void d(byte param0) {
        field_v = null;
        if (param0 != -31) {
          return;
        }
        field_u = null;
        textChoiceSelection = null;
        field_s = null;
        faceDepthBucketCounts = null;
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_u = (String) null;
          return BoardPresentationHelpers.arcticSegsSprites[param0 - 1];
        }
        return BoardPresentationHelpers.arcticSegsSprites[param0 - 1];
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = 84 % ((65 - param0) / 49);
        return ObjectHistoryBuffer.arcticCapsSprites[-1 + param1];
    }

    final RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return ga.arcticCentreSprites[-1 + param1];
        }
        this.drawFullBackground(true, -66, 69, -83, 51);
        return ga.arcticCentreSprites[-1 + param1];
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        if (!this.hasSprites((byte) -125)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, RadialSelectorRenderer.arcticBackgroundColors[colorIndex], 16777215);
          if (!obfuscationGuard) {
            this.loadSprites(false);
            return;
          }
          return;
        }
        RasterCacheSurface var6 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
        if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          AccountRegistrationPanel.a(1, colorIndex, var6, 0, 23275, LoginPanel.arcticFarSprite);
          var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        } else {
          SpriteGeometry.a(var6.sprite, 640, destinationY, destinationX, colorIndex, scroll16, ResourcePreparationQueue.arcticNearSprite, 1, BallPulseEffect.arcticMidSprite, 1, 0);
          if (!obfuscationGuard) {
            this.loadSprites(false);
            return;
          }
          return;
        }
        SpriteGeometry.a(var6.sprite, 640, destinationY, destinationX, colorIndex, scroll16, ResourcePreparationQueue.arcticNearSprite, 1, BallPulseEffect.arcticMidSprite, 1, 0);
        if (obfuscationGuard) {
          return;
        }
        this.loadSprites(false);
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (AchievementIcon.backgroundSpriteArchive.ensureGroupAvailableByName("arctic", -28138)) {
          ResourcePreparationQueue.arcticNearSprite = pl.loadRgbSpriteByName("arctic", "arctic_near", (byte) 117, AchievementIcon.backgroundSpriteArchive);
          BallPulseEffect.arcticMidSprite = pl.loadRgbSpriteByName("arctic", "arctic_mid", (byte) -79, AchievementIcon.backgroundSpriteArchive);
          LoginPanel.arcticFarSprite = pl.loadRgbSpriteByName("arctic", "arctic_far", (byte) 112, AchievementIcon.backgroundSpriteArchive);
          WidgetPaintStyle.arcticSmallSprite = pl.loadRgbSpriteByName("arctic", "arctic_small", (byte) -44, AchievementIcon.backgroundSpriteArchive);
          un.field_d = jh.a(0, ResourcePreparationQueue.arcticNearSprite);
          LogoRenderHelpers.field_d = jh.a(0, BallPulseEffect.arcticMidSprite);
          Brick.field_K = jh.a(0, LoginPanel.arcticFarSprite);
          ObjectHistoryBuffer.arcticCapsSprites[0] = ActivityIndicatorWidget.loadRgbSpritesByName("arctic", AchievementIcon.backgroundSpriteArchive, "arctic_caps", 2);
          BoardPresentationHelpers.arcticSegsSprites[0] = ActivityIndicatorWidget.loadRgbSpritesByName("arctic", AchievementIcon.backgroundSpriteArchive, "arctic_segs", 2);
          ga.arcticCentreSprites[0] = pl.loadRgbSpriteByName("arctic", "arctic_centre", (byte) -115, AchievementIcon.backgroundSpriteArchive);
          ObjectHistoryBuffer.arcticCapsSprites[1] = Under13RegistrationNoticePanel.a(ObjectHistoryBuffer.arcticCapsSprites[0], obfuscationGuard);
          BoardPresentationHelpers.arcticSegsSprites[1] = Under13RegistrationNoticePanel.a(BoardPresentationHelpers.arcticSegsSprites[0], false);
          ga.arcticCentreSprites[1] = pl.a(-16371, ga.arcticCentreSprites[0]);
          return true;
        }
        return false;
    }

    static {
        textChoiceSelection = new MenuSelection(1);
        faceDepthBucketCounts = new int[1024];
        field_u = "Lobby";
        field_v = "<%0> has left the lobby.";
    }
}
