/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VolcanicBackground extends BackgroundScene {
    static UiComponent field_t;
    static String field_r;
    static String field_w;
    static int[] field_s;
    static int field_u;
    static UiComponent field_v;

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          return (RgbSprite) null;
        }
        return LevelList.volcanicCentreSprites[-1 + param1];
    }

    VolcanicBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        try {
          LevelList.volcanicCentreSprites = new RgbSprite[2];
          np.volcanicSegsSprites = new RgbSprite[2][];
          CacheIoWorker.volcanicCapsSprites = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "td.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectPrefix != null ? "{...}" : "null") + ',' + soundEffectCount + ')');
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        if (obfuscationGuard > -91) {
          return true;
        }
        if (RasterCacheSurface.volcanicNearSprite == null) {
          return false;
        }
        if (null == WidgetLayerStack.volcanicMidSprite) {
          return false;
        }
        if (null == ByteArrayNode.volcanicFarSprite) {
          return false;
        }
        if (mc.volcanicSmallSprite == null) {
          return false;
        }
        return true;
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.backgroundSpriteArchive.ensureGroupAvailableByName("volcanic", -28138)) {
          return false;
        }
        RasterCacheSurface.volcanicNearSprite = pl.loadRgbSpriteByName("volcanic", "volcanic_near", (byte) -127, AchievementIcon.backgroundSpriteArchive);
        WidgetLayerStack.volcanicMidSprite = pl.loadRgbSpriteByName("volcanic", "volcanic_mid", (byte) -73, AchievementIcon.backgroundSpriteArchive);
        ByteArrayNode.volcanicFarSprite = pl.loadRgbSpriteByName("volcanic", "volcanic_far", (byte) -125, AchievementIcon.backgroundSpriteArchive);
        mc.volcanicSmallSprite = pl.loadRgbSpriteByName("volcanic", "volcanic_small", (byte) -77, AchievementIcon.backgroundSpriteArchive);
        NanoGameClock.field_q = jh.a(0, RasterCacheSurface.volcanicNearSprite);
        NameEntryPopup.field_Sb = jh.a(0, WidgetLayerStack.volcanicMidSprite);
        RectangleBody.field_p = jh.a(0, ByteArrayNode.volcanicFarSprite);
        CacheIoWorker.volcanicCapsSprites[0] = ActivityIndicatorWidget.loadRgbSpritesByName("volcanic", AchievementIcon.backgroundSpriteArchive, "volcanic_caps", 2);
        np.volcanicSegsSprites[0] = ActivityIndicatorWidget.loadRgbSpritesByName("volcanic", AchievementIcon.backgroundSpriteArchive, "volcanic_segs", 2);
        LevelList.volcanicCentreSprites[0] = pl.loadRgbSpriteByName("volcanic", "volcanic_centre", (byte) -67, AchievementIcon.backgroundSpriteArchive);
        CacheIoWorker.volcanicCapsSprites[1] = Under13RegistrationNoticePanel.a(CacheIoWorker.volcanicCapsSprites[0], false);
        np.volcanicSegsSprites[1] = Under13RegistrationNoticePanel.a(np.volcanicSegsSprites[0], obfuscationGuard);
        LevelList.volcanicCentreSprites[1] = pl.a(-16371, LevelList.volcanicCentreSprites[0]);
        return true;
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 9 / ((obfuscationGuard + 28) / 43);
        if (colorIndex > -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, hh.volcanicBackgroundColors[colorIndex], 10792131);
          if (this.hasSprites((byte) -125)) {
            mc.volcanicSmallSprite.drawTransparent(destinationX, destinationY);
          }
          return;
        }
        Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 16777215, 11184810);
        if (this.hasSprites((byte) -125)) {
          mc.volcanicSmallSprite.drawTransparent(destinationX, destinationY);
        }
    }

    public static void f(int param0) {
        field_w = null;
        field_v = null;
        field_t = null;
        field_r = null;
        if (param0 != 0) {
          field_u = 41;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var6 = null;
        if (!this.hasSprites((byte) -92)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, hh.volcanicBackgroundColors[colorIndex], 10792131);
        } else {
          var6 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            BitPacketBuffer.a(ByteArrayNode.volcanicFarSprite, var6, colorIndex, 1, (byte) 18, 0);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ArchiveIndex.a(-91, -7, RasterCacheSurface.volcanicNearSprite, scroll16, var6.sprite, colorIndex, 640, 1, destinationX, destinationY, WidgetLayerStack.volcanicMidSprite);
        }
        if (!obfuscationGuard) {
          field_v = (UiComponent) null;
          return;
        }
    }

    final static int decodeLevelBytes(NodeDeque[] brickGroups, byte[] data, IntNode levelState, NodeDeque motionPaths, ga unusedContext, int obfuscationGuard) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 10792131) {
            stackIn_4_0 = LevelDecoder.decodeLevel(brickGroups, true, new PacketBuffer(data), motionPaths, levelState, unusedContext);
            return stackIn_4_0;
          }
          stackIn_2_0 = 21;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("td.I(");
          if (brickGroups == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (data == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (levelState == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (motionPaths == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (unusedContext == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          return (RgbSprite[]) null;
        }
        return np.volcanicSegsSprites[-1 + param0];
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -91 / ((65 - param0) / 49);
        return CacheIoWorker.volcanicCapsSprites[param1 - 1];
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var6 = null;
        if (!this.hasSprites((byte) -120)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, hh.volcanicBackgroundColors[colorIndex], 10792131);
        } else {
          var6 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) -111);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            BitPacketBuffer.a(RectangleBody.field_p, var6, colorIndex, 2, (byte) 119, -14);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ArchiveIndex.a(-113, -14, NanoGameClock.field_q, scroll16, var6.sprite, colorIndex, 306, 2, destinationX, destinationY, NameEntryPopup.field_Sb);
        }
        if (obfuscationGuard >= -84) {
          field_v = (UiComponent) null;
          return;
        }
    }

    final static void g(int param0) {
        int var2 = 0;
        IsaacGenerator var1 = null;
        int var3 = 0;
        IsaacGenerator var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = new IsaacGenerator(new int[]{(int)MonotonicTime.nowMillis(false)});
          var1 = var4;
          for (var2 = param0; var2 < UiComponent.glowSequenceWords.length; var2++) {
            UiComponent.glowSequenceWords[var2] = var4.nextInt(101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "td.M(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              if (param0) {
                VolcanicBackground.g(-95);
              }
              var3 = DisplayModeInfo.a(param1, var4, -1).getFile();
              ne.a(new Object[]{"home", var3 + "home.ws"}, 111, param1, "updatelinks");
              ne.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, 76, param1, "updatelinks");
              ne.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, 88, param1, "updatelinks");
              ne.a(new Object[]{"options", var3 + "options.ws"}, 98, param1, "updatelinks");
              ne.a(new Object[]{"terms", var3 + "terms.ws"}, 109, param1, "updatelinks");
              ne.a(new Object[]{"privacy", var3 + "privacy.ws"}, 113, param1, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("td.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_s = new int[]{8, 23};
        field_r = "Owner";
        field_u = 83;
    }
}
