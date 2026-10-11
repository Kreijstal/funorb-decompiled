/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_a;
    static String[] field_b;
    static String[] field_c;

    final static java.awt.Canvas a(byte param0) {
        if (param0 > 107) {
          return null != mg.field_k ? (java.awt.Canvas) ((Object) mg.field_k) : tf.field_f;
        }
        field_b = (String[]) null;
        return null != mg.field_k ? (java.awt.Canvas) ((Object) mg.field_k) : tf.field_f;
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3 = param2 >> 16;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 == 723204176) {
          var4 = 65535 & param2;
          var5 = param0 >> 16;
          var6 = 65535 & param0;
          return param0 * var3 + (var5 * var4 + (var4 * var6 >> 16));
        }
        tb.a((byte) -5);
        var4Lifetime1 = 65535 & param2;
        var5Lifetime1 = param0 >> 16;
        var6Lifetime1 = 65535 & param0;
        return param0 * var3 + (var5Lifetime1 * var4Lifetime1 + (var4Lifetime1 * var6Lifetime1 >> 16));
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -9698) {
          field_b = (String[]) null;
        }
    }

    static {
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
