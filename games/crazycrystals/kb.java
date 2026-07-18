/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static String[] field_f;
    int field_d;
    f[][] field_b;
    static int field_h;
    String field_e;
    static String[] field_c;
    static int field_a;
    static int field_g;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 >= -71) {
            kb.a(37);
        }
    }

    kb(f[][] param0, String param1, int param2) {
        try {
            ((kb) this).field_b = param0;
            ((kb) this).field_e = param1;
            ((kb) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_f = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
