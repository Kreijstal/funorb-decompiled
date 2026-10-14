/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String[] field_b;
    static GameCanvas field_d;
    static String field_e;
    static NodeDeque lobbyPlayers;
    static String field_a;

    final static void a(PlayerBoard param0, int param1, int param2, int param3, int param4, int param5, MultiplayerMatch param6) {
        try {
          if (param3 >= -53) {
            field_e = (String) null;
          }
          MenuScreen.a(param6, param0, 3 + (param4 + (param5 - 75) / 2), (param2 - 75) / 2 + param1, true, 4, 3);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ua.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        lobbyPlayers = null;
        field_d = null;
        if (param0 == 2) {
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        }
        RgbSprite var2 = (RgbSprite) null;
        ua.a((RgbSprite) null, 90, -100, 66, (RgbSprite) null, 58, (RgbSprite) null, 15, 124, -102, (RgbSprite) null, 52);
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static void a(RgbSprite param0, int param1, int param2, int param3, RgbSprite param4, int param5, RgbSprite param6, int param7, int param8, int param9, RgbSprite param10, int param11) {
        try {
          param6.drawAt((param7 * 5 >> 16) + ((-param6.canvasWidth + param2) / 2 + param1), param3);
          param10.drawTransparent(param1 + ((-param10.canvasWidth + param2) / 2 + (param7 * 5 >> 16) + 10), param11 + (-(23 / param9) + (-param10.canvasHeight + param3) + 480));
          param4.drawTransparent((param2 - param4.canvasWidth) / 2 + param1 + (param7 * 10 >> 16), param11 - 43 / param9 - param4.canvasHeight + (480 + param3));
          param0.drawTransparent(param1 + ((param2 - param0.canvasWidth) / 2 + (param7 * 20 >> 16)), param11 + 47 / param9 + (-param0.canvasHeight + param3 + 480));
          int var12_int = 115 / ((5 - param5) / 61);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ')');
        }
    }

    static {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = "Play rated game";
    }
}
