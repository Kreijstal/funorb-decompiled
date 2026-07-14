/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_b;
    static char[] field_a;
    static String[] field_c;

    final static String a(rh param0, String param1, String param2, String param3, byte param4) {
        Object var6 = null;
        if (!param0.b((byte) -115)) {
          return param2;
        } else {
          if (param4 != 46) {
            var6 = null;
            String discarded$1 = sa.a((rh) null, (String) null, (String) null, (String) null, (byte) 95);
            return param3 + " - " + param0.a(param4 + -164, param1) + "%";
          } else {
            return param3 + " - " + param0.a(param4 + -164, param1) + "%";
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 71 / ((-29 - param0) / 44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_a = new char[]{(char)91, (char)93, (char)35};
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
