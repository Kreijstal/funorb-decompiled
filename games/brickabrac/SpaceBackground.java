/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpaceBackground extends BackgroundScene {
    static int field_u;
    static String field_s;
    static boolean field_r;
    static boolean field_t;

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var8 = null;
        if (obfuscationGuard) {
          if (!this.hasSprites((byte) -102)) {
            Rasterizer2D.fillRectangle(destinationX, destinationY, 640, 480, 0);
          } else {
            var8 = PowerUp.a(this.sceneId, colorIndex, -20777);
            if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
              HalloweenBackground.a(1, 0, !obfuscationGuard ? true : false, colorIndex, ng.spaceFarSprite, var8);
              var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            }
            AchievementBrowserScreen.a(LobbyGame.spaceNearSprite, destinationX, scroll16, colorIndex, 640, 0, 0, var8.sprite, 1, LevelResultSubmission.spaceMidSprite, destinationY);
          }
          return;
        }
        this.c((byte) 70);
        if (!this.hasSprites((byte) -102)) {
          Rasterizer2D.fillRectangle(destinationX, destinationY, 640, 480, 0);
          return;
        }
        RasterCacheSurface var7 = PowerUp.a(this.sceneId, colorIndex, -20777);
        if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          HalloweenBackground.a(1, 0, !obfuscationGuard ? true : false, colorIndex, ng.spaceFarSprite, var7);
          var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        AchievementBrowserScreen.a(LobbyGame.spaceNearSprite, destinationX, scroll16, colorIndex, 640, 0, 0, var7.sprite, 1, LevelResultSubmission.spaceMidSprite, destinationY);
    }

    final RgbSprite[] b(int param0) {
        if (param0 > -12) {
          this.hasSprites((byte) 4);
          return b.spaceLeverSprites;
        }
        return b.spaceLeverSprites;
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var8 = null;
        RasterCacheSurface var7 = null;
        if (obfuscationGuard <= -84) {
          if (!this.hasSprites((byte) -101)) {
            Rasterizer2D.fillRectangle(destinationX, destinationY, 306, 480, 0);
          } else {
            var8 = kd.a(this.sceneId, colorIndex, (byte) 125);
            if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
              HalloweenBackground.a(2, 0, false, colorIndex, NodeDequeCursor.field_b, var8);
              var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            }
            AchievementBrowserScreen.a(jh.field_d, destinationX, scroll16, colorIndex, 306, 0, 0, var8.sprite, 2, MusicVoiceMixer.field_t, destinationY);
          }
          return;
        }
        field_s = (String) null;
        if (!this.hasSprites((byte) -101)) {
          Rasterizer2D.fillRectangle(destinationX, destinationY, 306, 480, 0);
        } else {
          var7 = kd.a(this.sceneId, colorIndex, (byte) 125);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            HalloweenBackground.a(2, 0, false, colorIndex, NodeDequeCursor.field_b, var7);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          AchievementBrowserScreen.a(jh.field_d, destinationX, scroll16, colorIndex, 306, 0, 0, var7.sprite, 2, MusicVoiceMixer.field_t, destinationY);
        }
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 0;
        int var5Lifetime1;
        if (colorIndex <= -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 7829367, 11184810);
          if (this.hasSprites((byte) -103)) {
            rf.spaceSmallSprite.drawTransparent(destinationX, destinationY);
          }
          var5 = -77 % ((-28 - obfuscationGuard) / 43);
          return;
        }
        RasterEffectHelpers.fillVerticalGradientAlpha255(destinationX, destinationY, 153, 238, 0, FireworkBurst.backgroundTintColors[colorIndex], 96);
        if (this.hasSprites((byte) -103)) {
          rf.spaceSmallSprite.drawTransparent(destinationX, destinationY);
        }
        var5Lifetime1 = -77 % ((-28 - obfuscationGuard) / 43);
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("space", -28138)) {
          return false;
        }
        LobbyGame.spaceNearSprite = pl.loadRgbSpriteByName("space", "space_near", (byte) -91, AchievementIcon.field_m);
        LevelResultSubmission.spaceMidSprite = pl.loadRgbSpriteByName("space", "space_mid", (byte) 115, AchievementIcon.field_m);
        ng.spaceFarSprite = pl.loadRgbSpriteByName("space", "space_far", (byte) -98, AchievementIcon.field_m);
        rf.spaceSmallSprite = pl.loadRgbSpriteByName("space", "space_small", (byte) -90, AchievementIcon.field_m);
        ng.spaceFarSprite.bindRasterTarget();
        Rasterizer2D.drawRadialGlow(7136, 6592, 1600, 128, sq.field_b);
        if (!obfuscationGuard) {
          BallPulseEffect.framebuffer.bindRaster((byte) 100);
          TableNameEntry.spaceCharacterSprite = pl.loadRgbSpriteByName("space", "space_character", (byte) -50, AchievementIcon.field_m);
          jh.field_d = jh.a(0, LobbyGame.spaceNearSprite);
          MusicVoiceMixer.field_t = jh.a(0, LevelResultSubmission.spaceMidSprite);
          NodeDequeCursor.field_b = jh.a(0, ng.spaceFarSprite);
          b.spaceLeverSprites = ActivityIndicatorWidget.loadRgbSpritesByName("space", AchievementIcon.field_m, "space_lever", 2);
          return true;
        }
        return false;
    }

    SpaceBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
    }

    final RgbSprite c(byte param0) {
        if (param0 > -74) {
          String var3 = (String) null;
          SpaceBackground.isLocalPlayerName((String) null, -110);
          return TableNameEntry.spaceCharacterSprite;
        }
        return TableNameEntry.spaceCharacterSprite;
    }

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard > -91) {
          field_t = false;
          if (LobbyGame.spaceNearSprite == null) {
            return false;
          }
          if (null == LevelResultSubmission.spaceMidSprite) {
            return false;
          }
          if (null == ng.spaceFarSprite) {
            return false;
          }
          if (rf.spaceSmallSprite != null) {
            return null != TableNameEntry.spaceCharacterSprite ? true : false;
          }
          return false;
        }
        if (LobbyGame.spaceNearSprite == null) {
          return false;
        }
        if (null == LevelResultSubmission.spaceMidSprite) {
          return false;
        }
        if (null == ng.spaceFarSprite) {
          return false;
        }
        if (rf.spaceSmallSprite != null) {
          return null != TableNameEntry.spaceCharacterSprite ? true : false;
        }
        return false;
    }

    final static boolean isLocalPlayerName(String name, int obfuscationGuard) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -6) {
            field_u = -69;
          }
          var3 = (CharSequence) ((Object) name);
          stackIn_3_0 = ArchiveFetchClient.localPlayerNameKey.equals(ChatMessage.normalizePlayerName(var3, 92));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ci.A(");
          if (name == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_s = null;
        if (param0 <= 1) {
          SpaceBackground.d((byte) 54);
        }
    }

    static {
        field_s = "Game over";
    }
}
