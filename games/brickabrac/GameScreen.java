/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameScreen {
    static SoundCache field_e;
    int screenId;
    static String field_d;
    static n field_c;
    static String field_b;
    static ScrollPaneWithFooter friendsListPane;
    static String field_g;

    abstract void drawScreen(byte obfuscationGuard);

    final boolean supportsTransition(byte obfuscationGuard) {
        if (obfuscationGuard != -51) {
          return true;
        }
        return true;
    }

    abstract boolean handleKey(char character, int obfuscationGuard, int keyCode);

    abstract void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard);

    GameScreen(int screenId) {
        this.screenId = screenId;
    }

    public static void c(byte param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        friendsListPane = null;
        field_c = null;
        field_e = null;
        if (param0 != -91) {
          GameScreen.getOrRequestRankings(119, 39, -126, (byte) 48);
          return;
        }
    }

    final static RankingsRequest getOrRequestRankings(int opcode, int rankingKind, int rowLimit, byte obfuscationGuard) {
        RankingsRequest pendingRequest;
        int clientBranchFlag;
        RankingsRequest newRequest;
        RankingsRequest newRequestAfterWrongGuard;
        RankingsRequest requestAlias;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        pendingRequest = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.first(-55));
        if (obfuscationGuard < -102) {
          while (pendingRequest != null) {
            if (rankingKind == pendingRequest.rankingKind) {
              return pendingRequest;
            }
            pendingRequest = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.next((byte) 116));
          }
          newRequest = new RankingsRequest();
          pendingRequest = newRequest;
          newRequest.rowLimit = rowLimit;
          newRequest.rankingKind = rankingKind;
          HuffmanCodec.pendingRankingsRequests.addLast(newRequest, (byte) 3);
          MultiplayerExitScreen.sendRankingsRequest(-21167, newRequest, opcode);
          return newRequest;
        }
        GameScreen.c((byte) -109);
        while (pendingRequest != null) {
          if (rankingKind == pendingRequest.rankingKind) {
            return pendingRequest;
          }
          pendingRequest = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.next((byte) 116));
        }
        newRequestAfterWrongGuard = new RankingsRequest();
        requestAlias = newRequestAfterWrongGuard;
        newRequestAfterWrongGuard.rowLimit = rowLimit;
        newRequestAfterWrongGuard.rankingKind = rankingKind;
        HuffmanCodec.pendingRankingsRequests.addLast(newRequestAfterWrongGuard, (byte) 3);
        MultiplayerExitScreen.sendRankingsRequest(-21167, newRequestAfterWrongGuard, opcode);
        return newRequestAfterWrongGuard;
    }

    static {
        field_c = new n();
        field_b = "Connection lost - attempting to reconnect";
        field_g = "Charge: instantly charges the ball.";
    }
}
