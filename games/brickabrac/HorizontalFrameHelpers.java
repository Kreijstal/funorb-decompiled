/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class HorizontalFrameHelpers {
    static java.util.zip.CRC32 archiveCrc;
    static RgbSprite[] field_d;
    static RgbSprite[] field_c;
    static int[] field_e;
    static int field_b;

    final static void drawHorizontalFrame(int width, int y, int obfuscationGuard, RgbSprite[] sprites, int x) {
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String spritesArgumentSummary = null;
        RuntimeException caughtFailure = null;
        int leftWidth = 0;
        RuntimeException drawingFailure = null;
        int rightWidth = 0;
        int tileWidth = 0;
        int tileStartX = 0;
        int tileEndX = 0;
        int unusedClientFlag = 0;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (sprites != null &&
            width > 0) {
            if (obfuscationGuard != 743) {
              HorizontalFrameHelpers.a((byte) 123);
            }
            leftWidth = sprites[0].canvasWidth;
            rightWidth = sprites[2].canvasWidth;
            tileWidth = sprites[1].canvasWidth;
            sprites[0].drawTransparent(x, y);
            sprites[2].drawTransparent(x + width - rightWidth, y);
            Rasterizer2D.saveClip(RasterCacheSurface.horizontalFrameClipScratch);
            Rasterizer2D.intersectClip(x + leftWidth, y, width + x - rightWidth, sprites[1].canvasHeight + y);
            tileStartX = x + leftWidth;
            tileEndX = x - (-width + rightWidth);
            for (x = tileStartX; tileEndX > x; x = x + tileWidth) {
              sprites[1].drawTransparent(x, y);
            }
            Rasterizer2D.restoreClip(RasterCacheSurface.horizontalFrameClipScratch);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtDrawingFailure) {
          caughtFailure = caughtDrawingFailure;
          drawingFailure = caughtFailure;
          contextFailure = drawingFailure;
          contextPrefix = new StringBuilder().append("fq.A(").append(width).append(',').append(y).append(',').append(obfuscationGuard).append(',');
          if (sprites == null) {
            spritesArgumentSummary = "null";
          } else {
            spritesArgumentSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) contextPrefix).append(spritesArgumentSummary).append(',').append(x).append(')').toString());
        }
    }

    final static void configureTextChoiceColors(byte obfuscationGuard, int buttonColor, int selectedButtonColor, int bodyColor) {
        DateInputWidget.textChoiceButtonTextColor = buttonColor;
        if (obfuscationGuard > 83) {
          ValidationStatus.textChoiceBodyTextColor = bodyColor;
          LobbyGame.textChoiceSelectedButtonTextColor = selectedButtonColor;
          return;
        }
        HorizontalFrameHelpers.configureTextChoiceColors((byte) -44, 39, -69, 32);
        ValidationStatus.textChoiceBodyTextColor = bodyColor;
        LobbyGame.textChoiceSelectedButtonTextColor = selectedButtonColor;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 15) {
          return;
        }
        archiveCrc = null;
        field_e = null;
        field_c = null;
    }

    static {
        archiveCrc = new java.util.zip.CRC32();
        field_b = 97;
        field_e = new int[]{1, 2, 3, 3, 5, 1, 3, 3, 5, 2, 5, 5, 5, 10, 3, 10, 1, 3, 5, 3, 5, 10, 5, 3, 5, 10, 3, 2, 5, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 5, 10, 2};
    }
}
