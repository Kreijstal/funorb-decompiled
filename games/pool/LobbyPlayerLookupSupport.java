/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayerLookupSupport {
    static int field_d;
    static String ignorelistdupe;
    static String playerX2AreOut;
    static UiComponent field_c;

    final static LobbyPlayer findLobbyPlayer(int param0, long param1) {
        if (param0 != 0) {
          LobbyPlayerLookupSupport.isLoginComplete(-80);
          return (LobbyPlayer) (ModelOriginSupport.field_n.findFirst(param1, false));
        }
        return (LobbyPlayer) (ModelOriginSupport.field_n.findFirst(param1, false));
    }

    final static boolean isLoginComplete(int obfuscationGuard) {
        int var1 = -30 / ((-4 - obfuscationGuard) / 49);
        if (Atan2Support.field_c == null) {
          return false;
        }
        if (GradientPaletteSupport.field_a == RankingsScreen.field_J) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        playerX2AreOut = null;
        field_c = null;
        ignorelistdupe = null;
        if (param0 >= -40) {
          LobbyPlayerLookupSupport.isGuestOrFreeAccount(true);
        }
    }

    final static boolean isGuestOrFreeAccount(boolean obfuscationGuard) {
        boolean stackIn_7_0 = false;
        if (!obfuscationGuard) {
          return false;
        }
        if (NanoTickClock.isGuestMode(-18)) {
          stackIn_7_0 = true;
        } else {
          if (0 >= UsernameSuggestionsPanel.field_V) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    static {
        ignorelistdupe = "<%0> is already on your ignore list.";
        playerX2AreOut = "<%0> and <%1> are out of lives!";
    }
}
