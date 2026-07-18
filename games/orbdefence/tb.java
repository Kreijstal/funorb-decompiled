/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_a;
    static String[] field_b;
    static String[] field_c;

    final static java.awt.Canvas a(byte param0) {
        return null != mg.field_k ? (java.awt.Canvas) (Object) mg.field_k : tf.field_f;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        int var4 = 65535 & param2;
        int var5 = param0 >> 16;
        int var6 = 65535 & param0;
        return param0 * var3 + (var5 * var4 + (var4 * var6 >> 16));
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
