/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSprite {
    int offsetX;
    int height;
    int fullHeight;
    static LoginCredentialType EMAIL_CREDENTIALS;
    int fullWidth;
    int offsetY;
    int width;

    final static FullscreenCanvas createFullscreenCanvas(int width, int guard, int bitDepth, int height, PlatformTaskDispatcher dispatcher, int refreshRate) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenCanvas var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        FullscreenCanvas stackIn_5_0 = null;
        FullscreenCanvas stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ResizingDialog.enterFullscreen(true, dispatcher, refreshRate, bitDepth, height, width);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (FullscreenCanvas) (stackIn_2_0);
          }
          if (guard != 8089) {
            stackIn_5_0 = (FullscreenCanvas) null;
            return stackIn_5_0;
          }
          var7 = new FullscreenCanvas();
          var7.field_b = var8;
          var7.field_b.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, width, height);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("pb.C(").append(width).append(',').append(guard).append(',').append(bitDepth).append(',').append(height).append(',');
          if (dispatcher == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(refreshRate).append(')').toString());
        }
    }

    final static QuickChatCommand[] quickChatCommands(int guard) {
        if (guard >= 10) {
          return new QuickChatCommand[]{OpenGlTexture3D.field_n, RasterBuffer.field_i, DisplayPromptRenderer.field_b, OpenGlTransparentWaterEffect.field_h, IndexBufferReference.field_a, LegacyOpenGlSpriteTexture.field_t, RenderPresentationException.field_e, DualLinkNode.field_n, NextLevelChoiceLabels.field_b, ClientExceptionSupport.field_b, AccountUiBootstrap.field_a, AccountCreationForm.field_G, LegacyOpenGlInterleavedStream.field_a, IntroductionOverlaySupport.field_d};
        }
        EMAIL_CREDENTIALS = (LoginCredentialType) null;
        return new QuickChatCommand[]{OpenGlTexture3D.field_n, RasterBuffer.field_i, DisplayPromptRenderer.field_b, OpenGlTransparentWaterEffect.field_h, IndexBufferReference.field_a, LegacyOpenGlSpriteTexture.field_t, RenderPresentationException.field_e, DualLinkNode.field_n, NextLevelChoiceLabels.field_b, ClientExceptionSupport.field_b, AccountUiBootstrap.field_a, AccountCreationForm.field_G, LegacyOpenGlInterleavedStream.field_a, IntroductionOverlaySupport.field_d};
    }

    public static void releaseStatics(int param0) {
        EMAIL_CREDENTIALS = null;
        if (param0 != 3) {
          EMAIL_CREDENTIALS = (LoginCredentialType) null;
        }
    }

    abstract void drawAlpha(int x, int y, int alpha);

    abstract void draw(int x, int y);

    static {
        EMAIL_CREDENTIALS = new LoginCredentialType(3);
    }
}
