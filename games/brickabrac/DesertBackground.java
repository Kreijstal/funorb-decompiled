/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DesertBackground extends BackgroundScene {
    static String field_r;
    static String field_s;
    static String field_u;
    static String field_t;

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var6 = null;
        if (this.hasSprites((byte) -127)) {
          var6 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            RankingsScreen.a(var6, 1, 0, OptionsScreen.desertFarSprite, colorIndex, 100);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            InteractiveGameClient.drawParallaxLayers((byte) 119, wn.desertNearSprite, destinationY, 1, PowerUpWarning.desertMidSprite, var6.sprite, scroll16, 640, 0, destinationX);
            if (!obfuscationGuard) {
              field_u = (String) null;
              return;
            }
            return;
          }
          InteractiveGameClient.drawParallaxLayers((byte) 119, wn.desertNearSprite, destinationY, 1, PowerUpWarning.desertMidSprite, var6.sprite, scroll16, 640, 0, destinationX);
          if (!obfuscationGuard) {
            field_u = (String) null;
            return;
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, CacheIoWorker.desertBackgroundColors[colorIndex], 16777215);
        if (obfuscationGuard) {
          return;
        }
        field_u = (String) null;
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 0;
        int var5Lifetime1;
        if (-1 >= colorIndex) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 16777215, 11184810);
          var5 = 52 % ((obfuscationGuard + 28) / 43);
          if (this.hasSprites((byte) -106)) {
            ce.desertSmallSprite.drawTransparent(destinationX, destinationY);
            return;
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, CacheIoWorker.desertBackgroundColors[colorIndex], 16777215);
        var5Lifetime1 = 52 % ((obfuscationGuard + 28) / 43);
        if (this.hasSprites((byte) -106)) {
          ce.desertSmallSprite.drawTransparent(destinationX, destinationY);
          return;
        }
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (AchievementIcon.field_m.ensureGroupAvailableByName("desert", -28138)) {
          wn.desertNearSprite = pl.loadRgbSpriteByName("desert", "desert_near", (byte) 107, AchievementIcon.field_m);
          PowerUpWarning.desertMidSprite = pl.loadRgbSpriteByName("desert", "desert_mid", (byte) -121, AchievementIcon.field_m);
          OptionsScreen.desertFarSprite = pl.loadRgbSpriteByName("desert", "desert_far", (byte) 122, AchievementIcon.field_m);
          ce.desertSmallSprite = pl.loadRgbSpriteByName("desert", "desert_small", (byte) 99, AchievementIcon.field_m);
          SecondaryNodeQueue.field_d = jh.a(0, wn.desertNearSprite);
          oc.field_x = jh.a(0, PowerUpWarning.desertMidSprite);
          pp.field_b = jh.a(0, OptionsScreen.desertFarSprite);
          GzipInflater.desertCapsSprites[0] = cr.loadRgbSpritesByName("desert", AchievementIcon.field_m, "desert_caps", 2);
          TableNameEntry.desertSegsSprites[0] = cr.loadRgbSpritesByName("desert", AchievementIcon.field_m, "desert_segs", 2);
          um.desertCentreSprites[0] = pl.loadRgbSpriteByName("desert", "desert_centre", (byte) 110, AchievementIcon.field_m);
          GzipInflater.desertCapsSprites[1] = ig.a(GzipInflater.desertCapsSprites[0], obfuscationGuard);
          TableNameEntry.desertSegsSprites[1] = ig.a(TableNameEntry.desertSegsSprites[0], false);
          um.desertCentreSprites[1] = pl.a(-16371, um.desertCentreSprites[0]);
          return true;
        }
        return false;
    }

    final RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return um.desertCentreSprites[-1 + param1];
        }
        this.drawPreview((byte) 65, 25, -62, -115);
        return um.desertCentreSprites[-1 + param1];
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = 105 % ((param0 - 65) / 49);
        return GzipInflater.desertCapsSprites[param1 - 1];
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_u = (String) null;
          return TableNameEntry.desertSegsSprites[param0 - 1];
        }
        return TableNameEntry.desertSegsSprites[param0 - 1];
    }

    public static void f(int param0) {
        field_u = null;
        field_t = null;
        field_r = null;
        field_s = null;
        if (param0 != -417029247) {
          DesertBackground.g(-5);
        }
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var7 = null;
        if (obfuscationGuard >= -84) {
          field_u = (String) null;
          if (!this.hasSprites((byte) -123)) {
            Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, CacheIoWorker.desertBackgroundColors[colorIndex], 16777215);
            return;
          }
          var7 = kd.a(this.sceneId, colorIndex, (byte) -74);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            RankingsScreen.a(var7, 2, -13, pp.field_b, colorIndex, 102);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          } else {
            InteractiveGameClient.drawParallaxLayers((byte) 86, SecondaryNodeQueue.field_d, destinationY, 2, oc.field_x, var7.sprite, scroll16, 306, -13, destinationX);
            return;
          }
          InteractiveGameClient.drawParallaxLayers((byte) 86, SecondaryNodeQueue.field_d, destinationY, 2, oc.field_x, var7.sprite, scroll16, 306, -13, destinationX);
          return;
        }
        if (!this.hasSprites((byte) -123)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, CacheIoWorker.desertBackgroundColors[colorIndex], 16777215);
          return;
        }
        RasterCacheSurface var8 = kd.a(this.sceneId, colorIndex, (byte) -74);
        if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          RankingsScreen.a(var8, 2, -13, pp.field_b, colorIndex, 102);
          var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        } else {
          InteractiveGameClient.drawParallaxLayers((byte) 86, SecondaryNodeQueue.field_d, destinationY, 2, oc.field_x, var8.sprite, scroll16, 306, -13, destinationX);
          return;
        }
        InteractiveGameClient.drawParallaxLayers((byte) 86, SecondaryNodeQueue.field_d, destinationY, 2, oc.field_x, var8.sprite, scroll16, 306, -13, destinationX);
    }

    DesertBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        try {
          GzipInflater.desertCapsSprites = new RgbSprite[2][];
          um.desertCentreSprites = new RgbSprite[2];
          TableNameEntry.desertSegsSprites = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "gi.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectPrefix != null ? "{...}" : "null") + ',' + soundEffectCount + ')');
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard >= -91) {
          field_s = (String) null;
          if (wn.desertNearSprite == null) {
            return false;
          }
          if (null == PowerUpWarning.desertMidSprite) {
            return false;
          }
          if (null == OptionsScreen.desertFarSprite) {
            return false;
          }
          if (ce.desertSmallSprite == null) {
            return false;
          }
          if (GzipInflater.desertCapsSprites == null) {
            return false;
          }
          if (TableNameEntry.desertSegsSprites != null) {
            return um.desertCentreSprites != null ? true : false;
          }
          return false;
        }
        if (wn.desertNearSprite == null) {
          return false;
        }
        if (null == PowerUpWarning.desertMidSprite) {
          return false;
        }
        if (null == OptionsScreen.desertFarSprite) {
          return false;
        }
        if (ce.desertSmallSprite == null) {
          return false;
        }
        if (GzipInflater.desertCapsSprites == null) {
          return false;
        }
        if (TableNameEntry.desertSegsSprites != null) {
          return um.desertCentreSprites != null ? true : false;
        }
        return false;
    }

    final static void g(int param0) {
        int var1 = co.a((byte) -53);
        int var2 = ba.b(true);
        vg.field_c.a(var1 + (un.field_a << 1), var2 + (Paddle.field_A << 1), LevelPack.field_k - un.field_a, false, mi.field_d - Paddle.field_A);
        CachedArchiveSource.d(-16085);
        if (param0 == 11184810) {
          return;
        }
        field_t = (String) null;
    }

    static {
        field_r = "Discard";
        field_t = "Report <%0> for abuse";
        field_u = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_s = "Achieved";
    }
}
