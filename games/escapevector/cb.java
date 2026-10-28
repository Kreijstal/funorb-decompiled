/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static wc field_c;
    static String[] field_b;
    static Sprite field_a;
    private static String field_z;

    public static void releaseStatics(int guard) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (guard != -13379) {
          cb.releaseStatics(-126);
        }
    }

    static {
        field_z = "cb.A(";
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_c = new wc(1);
    }
}
