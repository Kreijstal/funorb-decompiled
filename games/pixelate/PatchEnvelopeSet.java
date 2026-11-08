/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PatchEnvelopeSet {
    static boolean field_l;
    int field_f;
    static String field_c;
    int field_g;
    byte[] field_h;
    int field_m;
    int field_a;
    int field_d;
    int field_e;
    static String[] field_k;
    static PuzzlePieceQueue field_j;
    byte[] field_b;
    int field_i;

    final static void drawAchievementBanner(byte param0) {
        int var1 = 0;
        if (-1 != MatchController.field_q) {
          var1 = -ValidatedTextWidget.field_bb + 50;
          SoftwareRasterizer.fillRectangleAlpha(var1, 70, MatchHud.field_a, 48, 65793, 160);
          CanvasRasterBuffer.field_b.drawAlpha(MatchHud.field_a + var1, 70, 160);
          MenuScreen.field_c.drawAlpha(var1 - 22, 70, 160);
          AchievementIconGlobals.field_c[MatchController.field_q].drawQuarterSize(var1, 78);
          PrivateChatHelpers.field_e.drawText(GameApplet.field_n[MatchController.field_q], var1 + 16 + 32, 99, 16777215, -1);
        }
        if (param0 >= 21) {
          return;
        }
        PatchEnvelopeSet.releaseStatics((byte) 89);
    }

    final static int padToByteBoundary(int param0, int param1) {
        int var2 = 0;
        int var3 = -31 % ((param1 + 38) / 44);
        if ((param0 & 7) != 0) {
          var2 = 8 - (param0 & 7);
        }
        int var4 = var2 + param0;
        return var4;
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 != -6) {
          field_l = false;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void clearPendingMessageFlag(boolean param0) {
        ChatHistoryHelpers.field_c = false;
        if (!param0) {
          field_j = (PuzzlePieceQueue) null;
        }
    }

    static {
        field_l = false;
        field_c = "<%0> has dropped out.";
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
