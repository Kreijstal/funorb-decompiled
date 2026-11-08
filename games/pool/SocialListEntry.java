/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListEntry extends UiComponent {
    String actionName;
    static String field_Rb;
    String name;
    UiComponent field_Ob;
    String previousName;
    int insertionIndex;
    static int field_Qb;
    UiComponent field_Nb;
    static LoginMethod field_Xb;
    static int field_Vb;
    String serverName;
    UiComponent field_Pb;
    static int field_Ub;
    static int field_Lb;
    static int field_Tb;

    public static void releaseStatics(byte param0) {
        field_Rb = null;
        if (param0 != -105) {
          field_Vb = 60;
          field_Xb = null;
          return;
        }
        field_Xb = null;
    }

    SocialListEntry() {
        super(0L, (UiComponent) null);
    }

    final static void requestLobbyGamePlayers(int opcode, int gameId, int obfuscationGuard) {
        LobbyGame var6 = null;
        LobbyGame var7 = null;
        CipherPacketBuffer var4 = null;
        CipherPacketBuffer var4Lifetime1;
        if (gameId != AgeValidator.field_r) {
          var6 = (LobbyGame) (LoginEncryptionSupport.field_a.findFirst((long)AgeValidator.field_r, false));
          var7 = var6;
          AgeValidator.field_r = gameId;
          if (var7 != null) {
            var7.playerNames = null;
          } else {
            var4 = JaggrabDownloader.field_j;
            var4.writeCipheredOpcode(false, opcode);
            var4.writeByte(3, false);
            var4.writeByte(11, false);
            var4.writeShort((byte) -81, gameId);
            if (obfuscationGuard != 11) {
              field_Rb = (String) null;
              return;
            }
            return;
          }
          var4Lifetime1 = JaggrabDownloader.field_j;
          var4Lifetime1.writeCipheredOpcode(false, opcode);
          var4Lifetime1.writeByte(3, false);
          var4Lifetime1.writeByte(11, false);
          var4Lifetime1.writeShort((byte) -81, gameId);
          if (obfuscationGuard != 11) {
            field_Rb = (String) null;
            return;
          }
          return;
        }
        if (obfuscationGuard == 11) {
          return;
        }
        field_Rb = (String) null;
    }

    static {
        field_Vb = 50;
        field_Xb = new LoginMethod("email");
    }
}
