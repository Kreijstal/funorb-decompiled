/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HalloweenBackground extends BackgroundScene {
    static UiComponent field_x;
    static String field_s;
    static int[] field_r;
    static String receivedChatDisplayName;
    private static RgbSprite field_u;
    static UiComponent[] field_w;
    static boolean field_y;
    static ArchiveSourceManager archiveSourceManager;

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 0;
        int var5Lifetime1;
        if (colorIndex <= -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 7829367, 22953);
          if (this.hasSprites((byte) -115)) {
            LevelPackLoader.halloweenSmallSprite.drawTransparent(destinationX, destinationY);
          }
          var5 = 36 % ((obfuscationGuard + 28) / 43);
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, CacheIoWorker.halloweenBackgroundColors[colorIndex], 22953);
        if (this.hasSprites((byte) -115)) {
          LevelPackLoader.halloweenSmallSprite.drawTransparent(destinationX, destinationY);
        }
        var5Lifetime1 = 36 % ((obfuscationGuard + 28) / 43);
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var7 = null;
        if (!obfuscationGuard) {
          this.a(-127, false);
          if (!this.hasSprites((byte) -106)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, CacheIoWorker.halloweenBackgroundColors[colorIndex], 22953);
            return;
          }
          var7 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            ResourcePreparationQueue.a(SocialListResponseHelpers.field_m, 1, colorIndex, QuickChatParameterType.field_j, var7, 0, (byte) -86, va.field_b);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ValidationStatus.a(1, 0, StateIconLabel.halloweenMidSprite, scroll16, ValidationMessageWidget.halloweenNearSprite, 67, 640, destinationX, var7.sprite, destinationY);
          return;
        }
        if (!this.hasSprites((byte) -106)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, CacheIoWorker.halloweenBackgroundColors[colorIndex], 22953);
          return;
        }
        RasterCacheSurface var8 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
        if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          ResourcePreparationQueue.a(SocialListResponseHelpers.field_m, 1, colorIndex, QuickChatParameterType.field_j, var8, 0, (byte) -86, va.field_b);
          var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        ValidationStatus.a(1, 0, StateIconLabel.halloweenMidSprite, scroll16, ValidationMessageWidget.halloweenNearSprite, 67, 640, destinationX, var8.sprite, destinationY);
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          return (RgbSprite[]) null;
        }
        return GameConnectionShell.halloweenSegsSprites[param0 - 1];
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.backgroundSpriteArchive.ensureGroupAvailableByName("halloween", -28138)) {
          return false;
        }
        ValidationMessageWidget.halloweenNearSprite = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_near", (byte) -116, AchievementIcon.backgroundSpriteArchive);
        StateIconLabel.halloweenMidSprite = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_mid", (byte) 116, AchievementIcon.backgroundSpriteArchive);
        GameClock.halloweenFarSprite = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_far", (byte) 120, AchievementIcon.backgroundSpriteArchive);
        LevelPackLoader.halloweenSmallSprite = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_small", (byte) 105, AchievementIcon.backgroundSpriteArchive);
        MotionWaypoint.halloweenMoonSprite = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_moon", (byte) 102, AchievementIcon.backgroundSpriteArchive);
        va.field_b = UiGeometryHelpers.createScaledHalfSizeSprite(0, ValidationMessageWidget.halloweenNearSprite);
        field_u = UiGeometryHelpers.createScaledHalfSizeSprite(0, StateIconLabel.halloweenMidSprite);
        SocialListResponseHelpers.field_m = UiGeometryHelpers.createScaledHalfSizeSprite(0, GameClock.halloweenFarSprite);
        QuickChatParameterType.field_j = UiGeometryHelpers.createScaledHalfSizeSprite(0, MotionWaypoint.halloweenMoonSprite);
        UiComponentNode.halloweenCharacterSprite = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_character", (byte) -106, AchievementIcon.backgroundSpriteArchive);
        StrongCacheEntry.halloweenCapsSprites[0] = ActivityIndicatorWidget.loadRgbSpritesByName("halloween", AchievementIcon.backgroundSpriteArchive, "halloween_caps", 2);
        GameConnectionShell.halloweenSegsSprites[0] = ActivityIndicatorWidget.loadRgbSpritesByName("halloween", AchievementIcon.backgroundSpriteArchive, "halloween_segs", 2);
        CanvasInputHelpers.halloweenCentreSprites[0] = SpriteInputHelpers.loadRgbSpriteByName("halloween", "halloween_centre", (byte) -118, AchievementIcon.backgroundSpriteArchive);
        StrongCacheEntry.halloweenCapsSprites[1] = Under13RegistrationNoticePanel.a(StrongCacheEntry.halloweenCapsSprites[0], obfuscationGuard);
        GameConnectionShell.halloweenSegsSprites[1] = Under13RegistrationNoticePanel.a(GameConnectionShell.halloweenSegsSprites[0], obfuscationGuard);
        CanvasInputHelpers.halloweenCentreSprites[1] = SpriteInputHelpers.createHalfSizeSprite(-16371, CanvasInputHelpers.halloweenCentreSprites[0]);
        return true;
    }

    final int c(int param0) {
        if (param0 >= -72) {
          return 2;
        }
        return 128;
    }

    final static void a(int param0, int param1, boolean param2, int param3, RgbSprite param4, RasterCacheSurface param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-95, param5.sprite);
          Rasterizer2D.clear();
          param4.b(-(60 / param0) + (-param4.canvasWidth + param5.width) / 2, -param4.canvasHeight + param1 - (-param5.height + 130 / param0), 0, 208);
          RasterEffectHelpers.fillVerticalGradientAlpha255(0, 0, param5.width, param5.height, 0, FireworkBurst.backgroundTintColors[param3], 96);
          if (param2) {
            RasterCacheSurface var7 = (RasterCacheSurface) null;
            HalloweenBackground.a(82, 29, true, -26, (RgbSprite) null, (RasterCacheSurface) null);
          }
          RasterStackHelpers.popRaster(-80);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dp.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        boolean stackIn_19_0 = false;
        boolean stackIn_40_0 = false;
        RasterCacheSurface var3;
        if (obfuscationGuard <= -91) {
          if (ValidationMessageWidget.halloweenNearSprite == null) {
            return false;
          }
          if (null == StateIconLabel.halloweenMidSprite) {
            return false;
          }
          if (GameClock.halloweenFarSprite == null) {
            return false;
          }
          if (LevelPackLoader.halloweenSmallSprite == null) {
            return false;
          }
          if (null == MotionWaypoint.halloweenMoonSprite) {
            return false;
          }
          if (null == UiComponentNode.halloweenCharacterSprite) {
            return false;
          }
          if (null == StrongCacheEntry.halloweenCapsSprites) {
            return false;
          }
          if (null == GameConnectionShell.halloweenSegsSprites) {
            return false;
          }
          stackIn_40_0 = (CanvasInputHelpers.halloweenCentreSprites != null);
          return stackIn_40_0;
        }
        var3 = (RasterCacheSurface) null;
        HalloweenBackground.a(62, -82, true, -61, (RgbSprite) null, (RasterCacheSurface) null);
        if (ValidationMessageWidget.halloweenNearSprite == null) {
          return false;
        }
        if (null == StateIconLabel.halloweenMidSprite) {
          return false;
        }
        if (GameClock.halloweenFarSprite == null) {
          return false;
        }
        if (LevelPackLoader.halloweenSmallSprite == null) {
          return false;
        }
        if (null == MotionWaypoint.halloweenMoonSprite) {
          return false;
        }
        if (null == UiComponentNode.halloweenCharacterSprite) {
          return false;
        }
        if (null == StrongCacheEntry.halloweenCapsSprites) {
          return false;
        }
        if (null == GameConnectionShell.halloweenSegsSprites) {
          return false;
        }
        stackIn_19_0 = (CanvasInputHelpers.halloweenCentreSprites != null);
        return stackIn_19_0;
    }

    HalloweenBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        try {
          GameConnectionShell.halloweenSegsSprites = new RgbSprite[2][];
          StrongCacheEntry.halloweenCapsSprites = new RgbSprite[2][];
          CanvasInputHelpers.halloweenCentreSprites = new RgbSprite[2];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dp.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectPrefix != null ? "{...}" : "null") + ',' + soundEffectCount + ')');
        }
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var7 = null;
        if (obfuscationGuard >= -84) {
          this.loadSprites(true);
          if (!this.hasSprites((byte) -126)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, CacheIoWorker.halloweenBackgroundColors[colorIndex], 22953);
            return;
          }
          var7 = BackgroundSurfaceHelpers.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 116);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            ResourcePreparationQueue.a(SocialListResponseHelpers.field_m, 2, colorIndex, QuickChatParameterType.field_j, var7, -13, (byte) -96, va.field_b);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            ValidationStatus.a(2, -13, field_u, scroll16, va.field_b, 62, 306, destinationX, var7.sprite, destinationY);
            return;
          }
          ValidationStatus.a(2, -13, field_u, scroll16, va.field_b, 62, 306, destinationX, var7.sprite, destinationY);
          return;
        }
        if (!this.hasSprites((byte) -126)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, CacheIoWorker.halloweenBackgroundColors[colorIndex], 22953);
          return;
        }
        RasterCacheSurface var8 = BackgroundSurfaceHelpers.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 116);
        if (var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          ValidationStatus.a(2, -13, field_u, scroll16, va.field_b, 62, 306, destinationX, var8.sprite, destinationY);
          return;
        }
        ResourcePreparationQueue.a(SocialListResponseHelpers.field_m, 2, colorIndex, QuickChatParameterType.field_j, var8, -13, (byte) -96, va.field_b);
        var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        ValidationStatus.a(2, -13, field_u, scroll16, va.field_b, 62, 306, destinationX, var8.sprite, destinationY);
    }

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          field_u = (RgbSprite) null;
          return CanvasInputHelpers.halloweenCentreSprites[-1 + param1];
        }
        return CanvasInputHelpers.halloweenCentreSprites[-1 + param1];
    }

    final RgbSprite c(byte param0) {
        if (param0 > -74) {
          field_y = false;
          return UiComponentNode.halloweenCharacterSprite;
        }
        return UiComponentNode.halloweenCharacterSprite;
    }

    public static void f(int param0) {
        field_r = null;
        receivedChatDisplayName = null;
        field_s = null;
        field_w = null;
        field_u = null;
        archiveSourceManager = null;
        field_x = null;
        if (param0 != 1) {
          field_w = (UiComponent[]) null;
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -12 % ((65 - param0) / 49);
        return StrongCacheEntry.halloweenCapsSprites[-1 + param1];
    }

    static {
        field_s = "Back";
        field_r = new int[]{100, 350, 750, 10, 25, 15, 30, 30000, 60000, 30, 60, 10, 10, 25, 5, 10, 1, 1, 3, 10, 20, 30, 7, 1, 2, 3, 1, 1, 1, 10, 5, 10, 5, 10, 100, 500, 2500, 5000, 15000, 1000, 135000, 5};
    }
}
