/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_a;
    static String[] field_b;
    static String[] field_c;

    final static java.awt.Canvas a(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        if (param0 <= 107) {
          L0: {
            field_b = (String[]) null;
            if (null == mg.field_k) {
              stackIn_8_0 = tf.field_f;
              break L0;
            } else {
              stackIn_8_0 = mg.field_k;
              break L0;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == mg.field_k) {
              stackIn_4_0 = tf.field_f;
              break L1;
            } else {
              stackIn_4_0 = mg.field_k;
              break L1;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_4_0);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = param2 >> -714080944;
        if (param1 != 723204176) {
          tb.a((byte) -5);
          var4 = 65535 & param2;
          var5 = param0 >> 723204176;
          var6 = 65535 & param0;
          return param0 * var3 + (var5 * var4 + (var4 * var6 >> 1908624688));
        } else {
          var4 = 65535 & param2;
          var5 = param0 >> 723204176;
          var6 = 65535 & param0;
          return param0 * var3 + (var5 * var4 + (var4 * var6 >> 1908624688));
        }
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
