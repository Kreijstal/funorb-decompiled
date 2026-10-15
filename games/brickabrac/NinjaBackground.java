/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NinjaBackground extends BackgroundScene {
    static String field_s;
    static NodeDeque pendingLevelResults;
    static MouseWheelSource mouseWheelSource;
    static UiComponent field_w;
    static RgbSprite parisNearSprite;
    static boolean frameFocus;
    static String emailLocalAtomCharacters;
    static boolean uiHoverClaimed;

    final RgbSprite c(byte param0) {
        if (param0 >= -74) {
          this.drawPreview((byte) 57, -62, 109, 2);
          return ObjectHistoryBuffer.ninjaCharacterSprite;
        }
        return ObjectHistoryBuffer.ninjaCharacterSprite;
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.backgroundSpriteArchive.ensureGroupAvailableByName("ninja", -28138)) {
          return false;
        }
        LegacyUtf8Decoder.ninjaNearSprite = pl.loadRgbSpriteByName("ninja", "ninja_near", (byte) -24, AchievementIcon.backgroundSpriteArchive);
        ap.ninjaMidSprite = pl.loadRgbSpriteByName("ninja", "ninja_mid", (byte) -128, AchievementIcon.backgroundSpriteArchive);
        hn.ninjaFarSprite = pl.loadRgbSpriteByName("ninja", "ninja_far", (byte) 127, AchievementIcon.backgroundSpriteArchive);
        hc.ninjaSmallSprite = pl.loadRgbSpriteByName("ninja", "ninja_small", (byte) -81, AchievementIcon.backgroundSpriteArchive);
        ObjectHistoryBuffer.ninjaCharacterSprite = pl.loadRgbSpriteByName("ninja", "ninja_character", (byte) -105, AchievementIcon.backgroundSpriteArchive);
        nk.field_h = jh.a(0, LegacyUtf8Decoder.ninjaNearSprite);
        SocialListEntry.field_Zb = jh.a(0, ap.ninjaMidSprite);
        rh.field_c = jh.a(0, hn.ninjaFarSprite);
        pl.a(hn.ninjaFarSprite, 0);
        if (!obfuscationGuard) {
          pl.a(rh.field_c, 0);
          return true;
        }
        return false;
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        if (!obfuscationGuard) {
          return;
        }
        if (!this.hasSprites((byte) -110)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, VerticalScrollbar.ninjaBackgroundColors[colorIndex], 0);
          return;
        }
        RasterCacheSurface var6 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
        if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          aa.a(0, hn.ninjaFarSprite, true, colorIndex, var6, 1);
          var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        }
        ByteStorage.a(var6.sprite, (byte) -78, destinationY, 640, LegacyUtf8Decoder.ninjaNearSprite, ap.ninjaMidSprite, scroll16, 0, colorIndex, destinationX, 1);
    }

    NinjaBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
    }

    public static void d(byte param0) {
        field_s = null;
        emailLocalAtomCharacters = null;
        mouseWheelSource = null;
        int var1 = -103 % ((-61 - param0) / 57);
        pendingLevelResults = null;
        field_w = null;
        parisNearSprite = null;
    }

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard >= -91) {
          NinjaBackground.a(-41, -77, (byte) -108, -18);
          if (null == LegacyUtf8Decoder.ninjaNearSprite) {
            return false;
          }
          if (ap.ninjaMidSprite == null) {
            return false;
          }
          if (null == hn.ninjaFarSprite) {
            return false;
          }
          if (null != hc.ninjaSmallSprite) {
            return null != ObjectHistoryBuffer.ninjaCharacterSprite ? true : false;
          }
          return false;
        }
        if (null == LegacyUtf8Decoder.ninjaNearSprite) {
          return false;
        }
        if (ap.ninjaMidSprite == null) {
          return false;
        }
        if (null == hn.ninjaFarSprite) {
          return false;
        }
        if (null != hc.ninjaSmallSprite) {
          return null != ObjectHistoryBuffer.ninjaCharacterSprite ? true : false;
        }
        return false;
    }

    final static RgbSprite[] loadRgbSprites(int fileId, int groupId, ResourceArchive archive, boolean obfuscationGuard) {
        RuntimeException var4 = null;
        ResourceArchive var5 = null;
        Object stackIn_4_0 = null;
        RgbSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            var5 = (ResourceArchive) null;
            NinjaBackground.loadRgbSprites(-20, -51, (ResourceArchive) null, true);
          }
          if (BytePayloadSubmission.decodeSpritesFromArchive(-97, fileId, archive, groupId)) {
            stackIn_6_0 = ClientException.buildRgbSprites(-835);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (RgbSprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qa.M(").append(fileId).append(',').append(groupId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var1 = 35 / ((-43 - param0) / 37);
        ResourceArchive.field_f.hideLayers(-125);
        if (null != ChatLobbyUiHelpers.loadingProgressDialog) {
          ResourceArchive.field_f.pushLayer(-76, ChatLobbyUiHelpers.loadingProgressDialog);
          return;
        }
        ChatLobbyUiHelpers.loadingProgressDialog = new LoadingProgressDialog(ResourceArchive.field_f, AppletGameShell.field_b);
        ResourceArchive.field_f.pushLayer(-76, ChatLobbyUiHelpers.loadingProgressDialog);
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        ResourceArchive var7 = null;
        ResourceArchive var7Lifetime1;
        ResourceArchive var7Lifetime2;
        if (!this.hasSprites((byte) -127)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, VerticalScrollbar.ninjaBackgroundColors[colorIndex], 0);
          if (obfuscationGuard > -84) {
            var7 = (ResourceArchive) null;
            NinjaBackground.loadRgbSprites(90, 38, (ResourceArchive) null, true);
            return;
          }
          return;
        }
        RasterCacheSurface var8 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) 120);
        if (!var8.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
          aa.a(0, rh.field_c, true, colorIndex, var8, 2);
          var8.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
        } else {
          ByteStorage.a(var8.sprite, (byte) -78, destinationY, 306, nk.field_h, SocialListEntry.field_Zb, scroll16, 0, colorIndex, destinationX, 2);
          if (obfuscationGuard > -84) {
            var7Lifetime1 = (ResourceArchive) null;
            NinjaBackground.loadRgbSprites(90, 38, (ResourceArchive) null, true);
            return;
          }
          return;
        }
        ByteStorage.a(var8.sprite, (byte) -78, destinationY, 306, nk.field_h, SocialListEntry.field_Zb, scroll16, 0, colorIndex, destinationX, 2);
        if (obfuscationGuard <= -84) {
          return;
        }
        var7Lifetime2 = (ResourceArchive) null;
        NinjaBackground.loadRgbSprites(90, 38, (ResourceArchive) null, true);
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 0;
        int var5Lifetime1;
        if (-1 < colorIndex) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, VerticalScrollbar.ninjaBackgroundColors[colorIndex], 0);
          var5 = 110 / ((obfuscationGuard + 28) / 43);
          if (this.hasSprites((byte) -97)) {
            hc.ninjaSmallSprite.drawTransparent(destinationX, destinationY);
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 7829367, 928072);
        var5Lifetime1 = 110 / ((obfuscationGuard + 28) / 43);
        if (this.hasSprites((byte) -97)) {
          hc.ninjaSmallSprite.drawTransparent(destinationX, destinationY);
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (TextWidgetRenderer.field_e) {
          return PacketReceiveHelpers.field_a.a(ResourceArchiveFactory.currentKeyCharacter, MeshAttributeRecord.currentKeyCode, true);
        }
        if (TooltipSprite.field_p) {
          return InteractiveGameClient.a(param1, 102, param0);
        }
        if (BytePayloadSubmission.a(param1, 11, param0)) {
          return true;
        }
        if (PlayerNameChooserPanel.field_I) {
          return false;
        }
        if (param2 == 108) {
          return ButtonWidgetRenderer.a(false, param3, param1);
        }
        parisNearSprite = (RgbSprite) null;
        return ButtonWidgetRenderer.a(false, param3, param1);
    }

    static {
        field_s = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        pendingLevelResults = new NodeDeque();
        emailLocalAtomCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
