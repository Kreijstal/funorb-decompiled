/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static qd field_d;
    static String[] field_b;
    static String field_c;
    static String field_a;

    public static void a() {
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0) {
        if (gl.field_y != 10) {
          if (Transmogrify.d(false)) {
            g.field_A = true;
            return;
          } else {
            int discarded$4 = -19317;
            bk.c();
            gl.field_y = 11;
            g.field_A = true;
            return;
          }
        } else {
          int discarded$5 = -19317;
          bk.c();
          gl.field_y = 11;
          g.field_A = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qd();
        field_c = "Create a free Account";
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
