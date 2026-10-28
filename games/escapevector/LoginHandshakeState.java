/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginHandshakeState {
    static TerrainMaskSupport contentTransitionPhase;
    static LoginStage keyExchangeStage;
    static Sprite[] achievementIcons;
    static String instructionsLabel;
    private static String field_z;

    public static void releaseStatics(int guard) {
        achievementIcons = null;
        contentTransitionPhase = null;
        keyExchangeStage = null;
        instructionsLabel = null;
        if (guard != 8123) {
          achievementIcons = (Sprite[]) null;
        }
    }

    static {
        field_z = "mc.A(";
        contentTransitionPhase = new TerrainMaskSupport();
        keyExchangeStage = new LoginStage();
        instructionsLabel = "Instructions";
    }
}
