/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static ca field_d;
    static String[] field_a;
    static java.awt.Canvas field_e;
    static int[] field_c;
    static String[] field_b;
    static rk field_f;

    final static ad a(int param0) {
        if (param0 >= -98) {
          return (ad) null;
        }
        return new ad(ti.a((byte) -120), rl.a(true));
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_a = (String[]) null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static hm a(String param0, int param1, int param2) {
        jk var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 55) {
            var4 = (String) null;
            ol.a((String) null, 81, 32);
          }
          var3 = new jk();
          ((hm) ((Object) var3)).field_a = param0;
          ((hm) ((Object) var3)).field_e = param2;
          stackIn_3_0 = var3;
          return (hm) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ol.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          if ((param0 <= 0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            param0 > 255)) {
            if (param1 >= -84) {
              return true;
            }
            if (param0 != 0) {
              var6 = fh.field_e;
              var2 = var6;
              for (var3 = 0; var3 < var6.length; var3++) {
                var4 = var6[var3];
                if (var4 == param0) {
                  return true;
                }
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "ol.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_c = new int[8192];
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
