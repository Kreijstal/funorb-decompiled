/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    static ProgressMessageDialog loginProgressDialog;
    static String field_b;
    static UiSelectionState field_d;
    static GameClock gameClock;
    static String field_i;
    static int field_j;
    static ClientUiComponent field_e;
    static ClientUiComponent field_c;
    static String field_f;
    static NodeDeque lobbyRoomOrder;

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        field_e = null;
        if (param0 == -108) {
          field_c = null;
          loginProgressDialog = null;
          field_d = null;
          lobbyRoomOrder = null;
          gameClock = null;
          field_f = null;
          return;
        }
        field_c = (ClientUiComponent) null;
        field_c = null;
        loginProgressDialog = null;
        field_d = null;
        lobbyRoomOrder = null;
        gameClock = null;
        field_f = null;
    }

    final static RgbSprite a(int param0, int param1) {
        BattlefieldTheme var2 = null;
        BattlefieldTheme var2Lifetime1;
        if (param1 != 8806) {
          gameClock = (GameClock) null;
          if (MusicPatchUsage.backgroundArchive == null) {
            return null;
          }
          if (param0 < 0) {
            return null;
          }
          if (UnitLossCondition.battlefieldThemes.length > param0) {
            var2 = UnitLossCondition.battlefieldThemes[param0];
            return var2.loadBackgroundImage((byte) -116);
          }
          return null;
        }
        if (MusicPatchUsage.backgroundArchive == null) {
          return null;
        }
        if (param0 < 0) {
          return null;
        }
        if (UnitLossCondition.battlefieldThemes.length > param0) {
          var2Lifetime1 = UnitLossCondition.battlefieldThemes[param0];
          return var2Lifetime1.loadBackgroundImage((byte) -116);
        }
        return null;
    }

    abstract int advanceTicks(long tickDurationNanos, int obfuscationGuard);

    final int waitAndAdvance(int obfuscationGuard, long tickDurationNanos) {
        long delayMillis = 0L;
        if (obfuscationGuard < -124) {
          delayMillis = this.getDelayMillis((byte) -103);
          if (delayMillis > 0L) {
            SpriteButtonPainter.a(delayMillis, 0);
          }
          return this.advanceTicks(tickDurationNanos, 0);
        }
        return -53;
    }

    abstract long getDelayMillis(byte obfuscationGuard);

    abstract void resetClock(int obfuscationGuard);

    static {
        field_b = "Solicitation";
        field_i = "Items";
        field_f = "This unit's passive effect expands 3 tiles in all directions.";
    }
}
