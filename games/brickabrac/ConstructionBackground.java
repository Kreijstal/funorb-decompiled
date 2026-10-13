/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConstructionBackground extends BackgroundScene {
    static String field_s;
    static String field_u;
    static String field_r;
    static RgbSprite waterCharacterSprite;

    private final static void a(RgbSprite param0, int param1, int param2, int param3, int param4, RgbSprite param5, int param6, int param7, int param8, int param9, RgbSprite param10, int param11, RgbSprite param12) {
        try {
          param12.drawAt(-((-param3 + param12.canvasWidth) / 2) + (param6 + (param2 * param7 >> 16)), param8);
          og.a(-121, 144, 128, param10, 11970969, (param2 * 9 >> 16) + (-param10.canvasWidth + param3) / 2 + param6 - 35 / param1, -(120 / param1) - param10.canvasHeight + (param9 + param4) + param8);
          param5.drawTransparent(-(23 / param1) + (10 * param2 >> 16) + (param6 + (-param5.canvasHeight + param3) / 2), -param5.canvasHeight + param9 + (param8 + param4));
          param0.drawTransparent(-(279 / param1) + (param3 - param0.canvasHeight) / 2 + (param6 + (20 * param2 >> 16)), -param0.canvasHeight + param9 + (param8 + param4));
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sn.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ')');
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -31 / ((param0 - 65) / 49);
        return rd.constructionCapsSprites[-1 + param1];
    }

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          this.drawPreview((byte) 31, 89, 39, 72);
        }
        return sk.constructionCentreSprites[-1 + param1];
    }

    public static void f(int param0) {
        field_r = null;
        if (param0 < 82) {
          return;
        }
        waterCharacterSprite = null;
        field_s = null;
        field_u = null;
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          return (RgbSprite[]) null;
        }
        return NodeDequeCursor.constructionSegsSprites[param0 - 1];
    }

    ConstructionBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        try {
          sk.constructionCentreSprites = new RgbSprite[2];
          rd.constructionCapsSprites = new RgbSprite[2][];
          NodeDequeCursor.constructionSegsSprites = new RgbSprite[2][];
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sn.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectPrefix != null ? "{...}" : "null") + ',' + soundEffectCount + ')');
        }
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5 = 110 % ((obfuscationGuard + 28) / 43);
        if (colorIndex > -1) {
          Rasterizer2D.fillRectangle(destinationX, destinationY, 153, 240, 16777215);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 240, 16777215, 11184810);
        }
        if (colorIndex > -1) {
          la.a(destinationX, destinationY, 153, 240, IntrusiveNode.field_h[colorIndex], 11970969, 152);
        }
        if (this.hasSprites((byte) -112)) {
          MenuSelection.constructionSmallSprite.drawTransparent(destinationX, destinationY);
        }
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var6 = null;
        if (this.hasSprites((byte) -116)) {
          var6 = kd.a(this.sceneId, colorIndex, (byte) -47);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            tf.a(-10, colorIndex, var6, 2, -119, hg.field_g);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ConstructionBackground.a(t.field_a, 2, scroll16, 306, -10, IntrusiveNode.field_d, destinationX, 5, destinationY, 480, er.field_d, colorIndex, var6.sprite);
        } else {
          Rasterizer2D.fillRectangle(destinationX, destinationY, 306, 480, 16777215);
        }
        if (obfuscationGuard > -84) {
          field_r = (String) null;
        }
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var6 = null;
        if (!obfuscationGuard) {
          ConstructionBackground.b((byte) -60, 50);
        }
        if (!this.hasSprites((byte) -124)) {
          Rasterizer2D.fillRectangle(destinationX, destinationY, 640, 480, 16777215);
        } else {
          var6 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            tf.a(0, colorIndex, var6, 1, 114, sf.constructionFarSprite);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ConstructionBackground.a(sf.constructionNearSprite, 1, scroll16, 640, 0, AchievementBrowserScreen.constructionMidSprite, destinationX, 5, destinationY, 480, IntNode.constructionSmokeSprite, colorIndex, var6.sprite);
        }
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("construct", -28138)) {
          return false;
        }
        sf.constructionNearSprite = pl.loadRgbSpriteByName("construct", "construction_near", (byte) 124, AchievementIcon.field_m);
        AchievementBrowserScreen.constructionMidSprite = pl.loadRgbSpriteByName("construct", "construction_mid", (byte) 102, AchievementIcon.field_m);
        sf.constructionFarSprite = pl.loadRgbSpriteByName("construct", "construction_far", (byte) -93, AchievementIcon.field_m);
        IntNode.constructionSmokeSprite = pl.loadRgbSpriteByName("construct", "construction_smoke", (byte) -128, AchievementIcon.field_m);
        MenuSelection.constructionSmallSprite = pl.loadRgbSpriteByName("construct", "construction_small", (byte) -74, AchievementIcon.field_m);
        t.field_a = jh.a(0, sf.constructionNearSprite);
        IntrusiveNode.field_d = jh.a(0, AchievementBrowserScreen.constructionMidSprite);
        hg.field_g = jh.a(0, sf.constructionFarSprite);
        er.field_d = jh.a(0, IntNode.constructionSmokeSprite);
        rd.constructionCapsSprites[0] = cr.loadRgbSpritesByName("construct", AchievementIcon.field_m, "construction_caps", 2);
        NodeDequeCursor.constructionSegsSprites[0] = cr.loadRgbSpritesByName("construct", AchievementIcon.field_m, "construction_segs", 2);
        sk.constructionCentreSprites[0] = pl.loadRgbSpriteByName("construct", "construction_centre", (byte) 127, AchievementIcon.field_m);
        rd.constructionCapsSprites[1] = ig.a(rd.constructionCapsSprites[0], false);
        NodeDequeCursor.constructionSegsSprites[1] = ig.a(NodeDequeCursor.constructionSegsSprites[0], obfuscationGuard);
        sk.constructionCentreSprites[1] = pl.a(-16371, sk.constructionCentreSprites[0]);
        pl.a(IntNode.constructionSmokeSprite, 0);
        pl.a(er.field_d, 0);
        return true;
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        BoundedFile.field_h = param1;
        if (hj.field_Yb != hc.field_f) {
          var2 = hj.field_Yb * hj.field_Yb;
          var3 = var2 - hc.field_f * hc.field_f;
          param1 = param1 + var3 * (ej.field_O - param1) / var2;
        }
        DualLinkDeque.field_d.a(120, param1, qh.field_f, 640, (byte) 64);
        fj.a(kn.field_z, 5, ej.field_O - 24, 640, om.field_oc, 0, (byte) 94);
        if (param0 > -70) {
          RgbSprite var4 = (RgbSprite) null;
          ConstructionBackground.a((RgbSprite) null, 67, 35, -28, -34, (RgbSprite) null, -56, 62, -67, 118, (RgbSprite) null, -55, (RgbSprite) null);
        }
    }

    final static void a(int param0, byte[] param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = -8 % ((33 - param0) / 48);
          var3_int = 256;
          var5 = new int[256];
          for (var6 = 0; var6 < 256; var6++) {
            incrementValue$1 = var3_int;
            var3_int++;
            var5[var6] = ik.a(255, (int) param1[incrementValue$1]);
          }
          var3_int += 256;
          var8 = 0;
          var6Lifetime1 = var8;
          while (var8 < 256) {
            param1[var3_int] = (byte)(param1[var3_int] - param2);
            var3_int = var3_int + var5[var8];
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sn.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        boolean stackIn_9_0 = false;
        if (obfuscationGuard >= -91) {
          this.a((byte) -78, -121);
        }
        stackIn_9_0 = (null != sf.constructionNearSprite) && (AchievementBrowserScreen.constructionMidSprite != null) && (null != sf.constructionFarSprite) && (null != IntNode.constructionSmokeSprite) && (MenuSelection.constructionSmallSprite != null);
        return stackIn_9_0;
    }

    static {
        field_s = "Email address is unavailable";
        field_r = "Start Game";
        field_u = "Please remove <%0> from your ignore list first.";
    }
}
