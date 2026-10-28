/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroFinalFrameSupport {
    static Sprite field_a;
    static String field_b;
    static int[][] field_d;
    static String field_c;

    final static void loadFinalFrame(int offsetY, ResourceArchive archive) {
        try {
          Sprite var2 = new Sprite(archive.getNamedFile(-4, "", "final_frame.jpg"), (java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
          int var3 = var2.width;
          int var4 = var2.height;
          LoginStage.pushRasterState(offsetY ^ 58);
          LegacyMenuState.introFinalFrameUpper = new Sprite(var3, 3 * var4 / 4);
          LegacyMenuState.introFinalFrameUpper.bindAsFramebuffer();
          var2.drawOpaque(0, offsetY);
          Js5NetworkRequest.field_G = new Sprite(var3, -LegacyMenuState.introFinalFrameUpper.height + var4);
          Js5NetworkRequest.field_G.bindAsFramebuffer();
          var2.drawOpaque(0, -LegacyMenuState.introFinalFrameUpper.height);
          Js5NetworkRequest.field_G.offsetY = LegacyMenuState.introFinalFrameUpper.height;
          RasterRestoreSupport.popRasterState((byte) 120);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cj.A(" + offsetY + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    final static void clearSharedIntScratch(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2 = -55 % ((guard + 59) / 39);
          int[] var6 = EditableTextWidget.field_I;
          int[] var1 = var6;
          int var3 = 0;
          int var4 = var6.length;
          while (var4 > var3) {
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1_ref), "cj.C(" + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (guard == 17159) {
          field_d = (int[][]) null;
          return;
        }
        IntroFinalFrameSupport.clearSharedIntScratch((byte) 122);
        field_d = (int[][]) null;
    }

    static {
        field_c = "Just play";
        field_b = " - show/hide mini-map";
    }
}
