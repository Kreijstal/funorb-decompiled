/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyMenuState {
    static MenuInputState input;
    static String[] updateServerMessages;
    static Sprite introFinalFrameUpper;
    private static String field_z;

    public static void releaseStatics(int guard) {
        updateServerMessages = null;
        introFinalFrameUpper = null;
        input = null;
        if (guard != -13379) {
          LegacyMenuState.releaseStatics(-126);
        }
    }

    static {
        field_z = "cb.A(";
        updateServerMessages = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        input = new MenuInputState(1);
    }
}
