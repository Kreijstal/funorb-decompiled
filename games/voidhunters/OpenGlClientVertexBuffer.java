/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlClientVertexBuffer extends OpenGlClientBuffer implements OpenGlVertexBufferBinding {
    static HighscorePlayerInfo[] highscorePlayers;
    static String field_c;

    public final int getBufferId(boolean param0) {
        if (!param0) {
          return 79;
        }
        return 0;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          highscorePlayers = (HighscorePlayerInfo[]) null;
          highscorePlayers = null;
          field_c = null;
          return;
        }
        highscorePlayers = null;
        field_c = null;
    }

    final static void ensureIntScratchCapacity(int param0, int param1) {
        if (null == dw.field_a) {
          dw.field_a = new int[param0];
        } else {
          if (dw.field_a.length < param0) {
            dw.field_a = new int[param0];
          }
        }
        if (param1 > 52) {
          return;
        }
        highscorePlayers = (HighscorePlayerInfo[]) null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 18090) {
          highscorePlayers = (HighscorePlayerInfo[]) null;
          GetGrapplingHooksDamageableBySourcePlayer.field_o = param1;
          return;
        }
        GetGrapplingHooksDamageableBySourcePlayer.field_o = param1;
    }

    OpenGlClientVertexBuffer(OpenGlToolkit param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
    }

    static {
        int var0 = 0;
        highscorePlayers = new HighscorePlayerInfo[255];
        for (var0 = 0; highscorePlayers.length > var0; var0++) {
          highscorePlayers[var0] = new HighscorePlayerInfo();
        }
        field_c = "Unrated game";
    }
}
