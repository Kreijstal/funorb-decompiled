/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(byte param0) {
        StripedProgressWidget.field_F.setBounds(18, -20500, IconTextComponent.field_Kb.width - (!fh.field_c ? 0 : 40 + (jn.field_c + 4)), 0, 0);
        CampaignProgress.field_a.setBounds(18, -20500, jn.field_c + 42, 0, -2 + (IconTextComponent.field_Kb.width - jn.field_c - 40));
        MapTile.field_f.setLayout(0, false, IconTextComponent.field_Kb.width, 2, jn.field_c, 20, IconTextComponent.field_Kb.height - 20);
        if (param0 >= 29) {
          return;
        }
        field_b = -104;
    }

    final static void shutdownAudioPlayers(byte obfuscationGuard) {
        if (l.musicPlayer != null) {
          l.musicPlayer.shutdown();
          if (TextCursor.effectsPlayer != null) {
            TextCursor.effectsPlayer.shutdown();
          }
          if (obfuscationGuard > -79) {
            mj.shutdownAudioPlayers((byte) 93);
            return;
          }
          return;
        }
        if (TextCursor.effectsPlayer != null) {
          TextCursor.effectsPlayer.shutdown();
        }
        if (obfuscationGuard <= -79) {
          return;
        }
        mj.shutdownAudioPlayers((byte) 93);
    }

    public static void c(byte param0) {
        if (param0 >= -23) {
          mj.shutdownAudioPlayers((byte) 115);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_b = 480;
        field_c = 20;
        field_a = "This option cannot be combined with the current settings for:  ";
    }
}
