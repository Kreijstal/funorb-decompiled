/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    static RgbSprite field_p;
    static String field_i;
    static String field_q;
    static String field_n;
    int opcodeOrByteCount;
    static int field_m;
    static String field_o;
    byte[] data;
    long deliverAfterMillis;
    static MenuScreen[] menuScreens;

    final static boolean isFullscreenUnavailable(int param0) {
        if (param0 <= 57) {
          field_o = (String) null;
          if (!QuickChatMenu.isGuestSession(-26090)) {
            return 0 >= ResourceArchiveFactory.windowModeCapabilityWord ? true : false;
          }
          return true;
        }
        if (QuickChatMenu.isGuestSession(-26090)) {
          return true;
        }
        if (0 < ResourceArchiveFactory.windowModeCapabilityWord) {
          return false;
        }
        return true;
    }

    final static RgbSprite createBlurredSilhouetteSprite(RgbSprite sprite, int radius, int obfuscationGuard) {
        int var4 = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        RgbSprite var6 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -17912) {
            DelayedPacket.isFullscreenUnavailable(-48);
          }
          var6 = new RgbSprite(radius * 2 + sprite.width, 2 * radius + sprite.height);
          var6.bindRasterTarget();
          Rasterizer2D.fillRectangle(0, 0, var6.width, var6.height, 16777215);
          for (var4 = 0; radius > var4; var4++) {
            sprite.drawSilhouette(-sprite.offsetX + radius, -sprite.offsetY + radius, 0);
            Rasterizer2D.blurRectangle(1, 1, 0, 0, var6.width, var6.height);
          }
          var6.replaceZeroWithOne();
          sprite.drawSilhouette(-sprite.offsetX + radius, radius - sprite.offsetY, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 109);
          var6.offsetY = sprite.offsetY - radius;
          var6.offsetX = -radius + sprite.offsetX;
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pg.D(");
          if (sprite == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(radius).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        menuScreens = null;
        field_o = null;
        field_i = null;
        field_p = null;
        field_q = null;
        field_n = null;
        if (obfuscationGuard > -123) {
          field_p = (RgbSprite) null;
        }
    }

    final static void paintScreenFrame(int param0) {
        if (param0 != 0) {
          return;
        }
        LobbyUiHelpers.paintNineSliceFrame(642, 482, -40, -1, LoginCredentialKind.field_h, -1);
    }

    DelayedPacket(long deliverAfterMillis, int opcodeOrByteCount, byte[] data) {
        try {
          this.opcodeOrByteCount = opcodeOrByteCount;
          this.data = data;
          this.deliverAfterMillis = deliverAfterMillis;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pg.<init>(" + deliverAfterMillis + ',' + opcodeOrByteCount + ',' + (data != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawPointerTooltipText(boolean obfuscationGuard, String text) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = MusicPatch.pointerX;
          var3 = ResourcePreparationEntry.pointerY;
          if (obfuscationGuard) {
            String var9 = (String) null;
            DelayedPacket.drawPointerTooltipText(false, (String) null);
          }
          var4 = CappedUrlRequest.field_l.font.countWrappedLines(text, 500);
          var5 = CappedUrlRequest.field_l.font.measureWrappedWidth(text, 500) + 6;
          var6 = 2 + WidgetLayerBootstrap.uiRowHeight * var4;
          var7 = OptionsScreen.choosePopupX(-1, var5, var2_int, 12);
          var8 = ContextMenu.choosePopupY(var6, var3, 20, -30);
          Rasterizer2D.drawRectangle(var7, var8, var5, var6, 0);
          Rasterizer2D.fillRectangle(var7 + 1, 1 + var8, -2 + var5, var6 - 2, 16777088);
          CappedUrlRequest.field_l.font.drawParagraph(text, 3 + var7, -CappedUrlRequest.field_l.font.ascent + (1 + var8) + ClientViewHelpers.field_f, 500, 1000, 0, -1, 0, 0, WidgetLayerBootstrap.uiRowHeight);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pg.A(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Rated game";
        field_q = "Player Two";
        field_i = "Buying or selling an account";
        field_o = "Confirm Email:";
    }
}
