/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplayRenderHelpers {
    static String[] field_b;
    static GameCanvas fullscreenCanvas;
    static String field_e;
    static NodeDeque lobbyPlayers;
    static String field_a;

    final static void drawCenteredPowerUpMeters(PlayerBoard board, int x, int width, int obfuscationGuard, int y, int height, MultiplayerMatch match) {
        try {
          if (obfuscationGuard >= -53) {
            field_e = (String) null;
          }
          MenuScreen.drawPowerUpMeterGrid(match, board, 3 + (y + (height - 75) / 2), (width - 75) / 2 + x, true, 4, 3);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "ua.C(" + (board != null ? "{...}" : "null") + ',' + x + ',' + width + ',' + obfuscationGuard + ',' + y + ',' + height + ',' + (match != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        lobbyPlayers = null;
        fullscreenCanvas = null;
        if (param0 == 2) {
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        }
        RgbSprite var2 = (RgbSprite) null;
        GameplayRenderHelpers.drawOffsetParallaxLayers((RgbSprite) null, 90, -100, 66, (RgbSprite) null, 58, (RgbSprite) null, 15, 124, -102, (RgbSprite) null, 52);
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static void drawOffsetParallaxLayers(RgbSprite nearSprite, int x, int width, int y, RgbSprite middleSprite, int obfuscationGuard, RgbSprite farSprite, int scroll65536, int unusedValue, int scaleDivisor, RgbSprite backSprite, int verticalOffset) {
        try {
          farSprite.drawAt((scroll65536 * 5 >> 16) + ((-farSprite.canvasWidth + width) / 2 + x), y);
          backSprite.drawTransparent(x + ((-backSprite.canvasWidth + width) / 2 + (scroll65536 * 5 >> 16) + 10), verticalOffset + (-(23 / scaleDivisor) + (-backSprite.canvasHeight + y) + 480));
          middleSprite.drawTransparent((width - middleSprite.canvasWidth) / 2 + x + (scroll65536 * 10 >> 16), verticalOffset - 43 / scaleDivisor - middleSprite.canvasHeight + (480 + y));
          nearSprite.drawTransparent(x + ((width - nearSprite.canvasWidth) / 2 + (scroll65536 * 20 >> 16)), verticalOffset + 47 / scaleDivisor + (-nearSprite.canvasHeight + y + 480));
          int unusedGuardQuotient = 115 / ((5 - obfuscationGuard) / 61);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "ua.B(" + (nearSprite != null ? "{...}" : "null") + ',' + x + ',' + width + ',' + y + ',' + (middleSprite != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (farSprite != null ? "{...}" : "null") + ',' + scroll65536 + ',' + unusedValue + ',' + scaleDivisor + ',' + (backSprite != null ? "{...}" : "null") + ',' + verticalOffset + ')');
        }
    }

    static {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = "Play rated game";
    }
}
