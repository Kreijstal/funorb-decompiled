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

    final static FullscreenCanvas a(int param0, int param1, int param2, int param3, PlatformTaskDispatcher param4, int param5) {
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
          var8 = ResizingDialog.a(true, param4, param5, param2, param3, param0);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (FullscreenCanvas) (stackIn_2_0);
          }
          if (param1 != 8089) {
            stackIn_5_0 = (FullscreenCanvas) null;
            return stackIn_5_0;
          }
          var7 = new FullscreenCanvas();
          var7.field_b = var8;
          var7.field_b.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("pb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
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
