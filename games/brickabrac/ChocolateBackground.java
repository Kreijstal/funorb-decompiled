/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChocolateBackground extends BackgroundScene {
    static String field_y;
    static IsaacGenerator field_w;
    static String field_t;
    static UiComponent field_u;
    static String field_s;
    static boolean field_r;
    private static RgbSprite chocolateMidSprite;
    static int field_v;

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5;
        var5 = 100 % ((-28 - obfuscationGuard) / 43);
        if (!this.hasSprites((byte) -124)) {
          return;
        }
        if (-1 >= colorIndex) {
          u.chocolateSmallFarSprite.drawTransparent(destinationX, destinationY);
        } else {
          la.a(u.chocolateSmallFarSprite, destinationX, destinationY, MatchCompleteScreen.field_C[colorIndex]);
        }
        GameClock.chocolateSmallNearSprite.drawTransparent(destinationX, destinationY);
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var7 = null;
        if (obfuscationGuard > -84) {
          this.b(33);
          if (!this.hasSprites((byte) -128)) {
            Rasterizer2D.fillRectangle(destinationX, destinationY, 306, 480, 16777215);
            return;
          }
          var7 = kd.a(this.sceneId, colorIndex, (byte) -50);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            SoundPlayback.a(-35, 26746, var7, colorIndex, 2, QuickChatPhraseRegistry.chocolateFarSprite);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          } else {
            ua.a(QuickChatParameterType.field_i, destinationX, 306, destinationY, ek.field_hb, 79, var7.sprite, scroll16, colorIndex, 2, up.field_w, -35);
            return;
          }
          ua.a(QuickChatParameterType.field_i, destinationX, 306, destinationY, ek.field_hb, 79, var7.sprite, scroll16, colorIndex, 2, up.field_w, -35);
          return;
        }
        if (!this.hasSprites((byte) -128)) {
          Rasterizer2D.fillRectangle(destinationX, destinationY, 306, 480, 16777215);
          return;
        }
        RasterCacheSurface var8 = kd.a(this.sceneId, colorIndex, (byte) -50);
        if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          SoundPlayback.a(-35, 26746, var8, colorIndex, 2, QuickChatPhraseRegistry.chocolateFarSprite);
          var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        } else {
          ua.a(QuickChatParameterType.field_i, destinationX, 306, destinationY, ek.field_hb, 79, var8.sprite, scroll16, colorIndex, 2, up.field_w, -35);
          return;
        }
        ua.a(QuickChatParameterType.field_i, destinationX, 306, destinationY, ek.field_hb, 79, var8.sprite, scroll16, colorIndex, 2, up.field_w, -35);
    }

    final RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return IntKeyIndex.chocCentreSprites[param1 - 1];
        }
        java.applet.Applet var4 = (java.applet.Applet) null;
        ChocolateBackground.a((java.applet.Applet) null, 68);
        return IntKeyIndex.chocCentreSprites[param1 - 1];
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("chocolate", -28138)) {
          return false;
        }
        nl.chocolateNearSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_near", (byte) 114, AchievementIcon.field_m);
        chocolateMidSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_mid", (byte) 123, AchievementIcon.field_m);
        CappedUrlRequest.chocolateSpiresSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_spires", (byte) -53, AchievementIcon.field_m);
        QuickChatPhraseRegistry.chocolateFarSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_far", (byte) 127, AchievementIcon.field_m);
        QuickChatParameterType.field_i = jh.a(0, nl.chocolateNearSprite);
        ek.field_hb = jh.a(0, chocolateMidSprite);
        up.field_w = jh.a(0, CappedUrlRequest.chocolateSpiresSprite);
        u.chocolateSmallFarSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_small_far", (byte) -36, AchievementIcon.field_m);
        GameClock.chocolateSmallNearSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_small_near", (byte) -69, AchievementIcon.field_m);
        MeshAttributeRecord.chocolateCharacterSprite = pl.loadRgbSpriteByName("chocolate", "chocolate_character", (byte) 101, AchievementIcon.field_m);
        Brick.chocCapsSprites[0] = cr.loadRgbSpritesByName("chocolate", AchievementIcon.field_m, "choc_caps", 2);
        aj.chocSegsSprites[0] = cr.loadRgbSpritesByName("chocolate", AchievementIcon.field_m, "choc_segs", 2);
        IntKeyIndex.chocCentreSprites[0] = pl.loadRgbSpriteByName("chocolate", "choc_centre", (byte) -126, AchievementIcon.field_m);
        Brick.chocCapsSprites[1] = ig.a(Brick.chocCapsSprites[0], obfuscationGuard);
        aj.chocSegsSprites[1] = ig.a(aj.chocSegsSprites[0], obfuscationGuard);
        IntKeyIndex.chocCentreSprites[1] = pl.a(-16371, IntKeyIndex.chocCentreSprites[0]);
        NameEntryPopup.chocLeverSprites = cr.loadRgbSpritesByName("chocolate", AchievementIcon.field_m, "choc_lever", 2);
        return true;
    }

    final RgbSprite c(byte param0) {
        if (param0 >= -74) {
          this.drawFullBackground(false, 35, 0, 38, 68);
          return MeshAttributeRecord.chocolateCharacterSprite;
        }
        return MeshAttributeRecord.chocolateCharacterSprite;
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_t = (String) null;
          return aj.chocSegsSprites[-1 + param0];
        }
        return aj.chocSegsSprites[-1 + param0];
    }

    final static m f(int param0) {
        String var1 = LevelSelectScreen.d(true);
        if (param0 < 68) {
          ChocolateBackground.d((byte) 97);
          if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
              var1 = "";
            }
            return new m(LevelSelectScreen.d(true), la.b((byte) 118));
          }
          return new m(LevelSelectScreen.d(true), la.b((byte) 118));
        }
        if (var1 == null) {
          return new m(LevelSelectScreen.d(true), la.b((byte) 118));
        }
        if (0 <= var1.indexOf('@')) {
          var1 = "";
          return new m(LevelSelectScreen.d(true), la.b((byte) 118));
        }
        return new m(LevelSelectScreen.d(true), la.b((byte) 118));
    }

    final RgbSprite[] b(int param0) {
        if (param0 >= -12) {
          field_r = false;
          return NameEntryPopup.chocLeverSprites;
        }
        return NameEntryPopup.chocLeverSprites;
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var6 = null;
        if (this.hasSprites((byte) -112)) {
          var6 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            SoundPlayback.a(0, 26746, var6, colorIndex, 1, QuickChatPhraseRegistry.chocolateFarSprite);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ua.a(nl.chocolateNearSprite, destinationX, 640, destinationY, chocolateMidSprite, 95, var6.sprite, scroll16, colorIndex, 1, CappedUrlRequest.chocolateSpiresSprite, 0);
          if (!obfuscationGuard) {
            field_t = (String) null;
            return;
          }
          return;
        }
        Rasterizer2D.fillRectangle(destinationX, destinationY, 640, 480, 16777215);
        if (!obfuscationGuard) {
          field_t = (String) null;
          return;
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -63 % ((65 - param0) / 49);
        return Brick.chocCapsSprites[-1 + param1];
    }

    ChocolateBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        try {
          aj.chocSegsSprites = new RgbSprite[2][];
          IntKeyIndex.chocCentreSprites = new RgbSprite[2];
          Brick.chocCapsSprites = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oo.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectPrefix != null ? "{...}" : "null") + ',' + soundEffectCount + ')');
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard > -91) {
          field_y = (String) null;
          if (nl.chocolateNearSprite == null) {
            return false;
          }
          if (null == chocolateMidSprite) {
            return false;
          }
          if (QuickChatPhraseRegistry.chocolateFarSprite == null) {
            return false;
          }
          if (CappedUrlRequest.chocolateSpiresSprite == null) {
            return false;
          }
          if (u.chocolateSmallFarSprite == null) {
            return false;
          }
          if (null != GameClock.chocolateSmallNearSprite) {
            return null != MeshAttributeRecord.chocolateCharacterSprite ? true : false;
          }
          return false;
        }
        if (nl.chocolateNearSprite == null) {
          return false;
        }
        if (null == chocolateMidSprite) {
          return false;
        }
        if (QuickChatPhraseRegistry.chocolateFarSprite == null) {
          return false;
        }
        if (CappedUrlRequest.chocolateSpiresSprite == null) {
          return false;
        }
        if (u.chocolateSmallFarSprite == null) {
          return false;
        }
        if (null != GameClock.chocolateSmallNearSprite) {
          return null != MeshAttributeRecord.chocolateCharacterSprite ? true : false;
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 != 0) {
                chocolateMidSprite = (RgbSprite) null;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("oo.R(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 < -29) {
          field_t = null;
          chocolateMidSprite = null;
          field_y = null;
          field_w = null;
          field_u = null;
          field_s = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        ChocolateBackground.a((java.applet.Applet) null, -87);
        field_t = null;
        chocolateMidSprite = null;
        field_y = null;
        field_w = null;
        field_u = null;
        field_s = null;
    }

    static {
        field_t = "This is <%0>'s RuneScape clan if they have one.";
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_v = -1;
        field_y = "Remove friend";
    }
}
