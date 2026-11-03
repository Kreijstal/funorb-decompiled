/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends IntrusiveNode {
    static UiComponent field_q;
    static int keycodeDefaultUp2;
    int[] field_r;
    static String endOfGamePressEscapeToContinue;
    int field_o;
    static int field_l;
    static String quickchatLobby;

    public static void clearSharedReferences(int param0) {
        endOfGamePressEscapeToContinue = null;
        field_q = null;
        if (param0 != 59) {
          fl.clearSharedReferences(-121);
          quickchatLobby = null;
          return;
        }
        quickchatLobby = null;
    }

    final static void registerPunctuationKeyCodes(boolean param0) {
        AchievementsScreen.field_H[44] = 71;
        AchievementsScreen.field_H[47] = 73;
        AchievementsScreen.field_H[222] = 58;
        AchievementsScreen.field_H[192] = 28;
        AchievementsScreen.field_H[520] = 59;
        AchievementsScreen.field_H[91] = 42;
        AchievementsScreen.field_H[93] = 43;
        if (param0) {
          AchievementsScreen.field_H[59] = 57;
          AchievementsScreen.field_H[46] = 72;
          AchievementsScreen.field_H[45] = 26;
          AchievementsScreen.field_H[92] = 74;
          AchievementsScreen.field_H[61] = 27;
          return;
        }
        field_q = (UiComponent) null;
        AchievementsScreen.field_H[59] = 57;
        AchievementsScreen.field_H[46] = 72;
        AchievementsScreen.field_H[45] = 26;
        AchievementsScreen.field_H[92] = 74;
        AchievementsScreen.field_H[61] = 27;
    }

    private fl() throws Throwable {
        throw new Error();
    }

    static {
        keycodeDefaultUp2 = 98;
        endOfGamePressEscapeToContinue = "Press <img=3> to continue.";
        quickchatLobby = "Quick Chat lobby";
        field_l = 2000;
    }
}
