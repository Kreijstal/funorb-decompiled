/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class tb {
    static String field_a;
    static String[] field_b;
    static String[] field_c;

    final static java.awt.Canvas a(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        java.awt.Canvas stackOut_7_0 = null;
        ea stackOut_6_0 = null;
        java.awt.Canvas stackOut_3_0 = null;
        ea stackOut_2_0 = null;
        if (param0 <= 107) {
          L0: {
            field_b = null;
            if (null == mg.field_k) {
              stackOut_7_0 = tf.field_f;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = mg.field_k;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == mg.field_k) {
              stackOut_3_0 = tf.field_f;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = mg.field_k;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param2 >> 16;
        if (param1 != 723204176) {
          java.awt.Canvas discarded$1 = tb.a((byte) -5);
          var4 = 65535 & param2;
          var5 = param0 >> 16;
          var6 = 65535 & param0;
          return param0 * var3 + (var5 * var4 + (var4 * var6 >> 16));
        } else {
          var4 = 65535 & param2;
          var5 = param0 >> 16;
          var6 = 65535 & param0;
          return param0 * var3 + (var5 * var4 + (var4 * var6 >> 16));
        }
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
