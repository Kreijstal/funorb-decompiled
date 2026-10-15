/*
 * Decompiled by CFR-JS 0.4.0.
 */
class NineSliceFrame {
    private RgbSprite[] sprites;
    static int field_f;
    static String field_a;
    static PcmSound[] uiSounds;
    static ResourceArchive field_g;
    static String field_d;
    static String field_c;

    final static RgbSprite b(int param0) {
        int var5_int = 0;
        int var6 = 0;
        int var1;
        Object var3;
        int[] var5;
        int var7;
        int[] var8;
        int[] var11;
        int[] var13;
        byte[] var16;
        byte[] var17;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 13874) {
          NineSliceFrame.a(-46);
        }
        var1 = jh.decodedSpriteWidths[0] * TextHotspotRegion.decodedSpriteHeights[0];
        var16 = GameOverlayHelpers.decodedSpriteIndices[0];
        if (!tm.decodedSpriteHasAlpha[0]) {
          var8 = new int[var1];
          for (var5_int = 0; var5_int < var1; var5_int++) {
            var8[var5_int] = qp.decodedSpritePalette[IntrusiveHashIterator.a((int) var16[var5_int], 255)];
          }
          var3 = new RgbSprite(cf.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[0], SocketConnector.decodedSpriteOffsetY[0], jh.decodedSpriteWidths[0], TextHotspotRegion.decodedSpriteHeights[0], var8);
        } else {
          var17 = PopupWidgetLayer.decodedSpriteAlpha[0];
          var13 = new int[var1];
          var11 = var13;
          var5 = var11;
          for (var6 = 0; var6 < var1; var6++) {
            var5[var6] = LevelSelectScreen.d(qp.decodedSpritePalette[IntrusiveHashIterator.a((int) var16[var6], 255)], IntrusiveHashIterator.a(-16777216, var17[var6] << 24));
          }
          var3 = new ArgbSprite(cf.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[0], SocketConnector.decodedSpriteOffsetY[0], jh.decodedSpriteWidths[0], TextHotspotRegion.decodedSpriteHeights[0], var13);
        }
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return (RgbSprite) (var3);
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_g = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
        uiSounds = null;
    }

    void paintFrame(int width, int height, int x, boolean obfuscationGuard, int y) {
        if (obfuscationGuard) {
          NineSliceFrame.a(true, false);
        }
        nh.paintNineSliceFrame(width, height, -40, x, this.sprites, y);
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
          return;
        }
        if (!ConditionalTextValue.a(2)) {
          return;
        }
        if (param0) {
          Rasterizer2D.fillRectangleAlpha(0, 0, Rasterizer2D.width, Rasterizer2D.height, 0, 192);
        }
        wo.field_b.a(0, 0, 0);
    }

    NineSliceFrame(RgbSprite[] sprites) {
        try {
          this.sprites = sprites;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ta.<init>(" + (sprites != null ? "{...}" : "null") + ')');
        }
    }

    static {
        uiSounds = new PcmSound[16];
        field_d = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_a = "You need to play 1 more rated game to unlock this option.";
        field_c = "Disruptive behaviour";
    }
}
