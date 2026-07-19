/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static qd field_d;
    static String[] field_b;
    static String field_c;
    static String field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -125) {
          field_a = (String) null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0) {
        if ((gl.field_y ^ -1) != param0) {
          if (Transmogrify.d(false)) {
            g.field_A = true;
            return;
          } else {
            bk.c(-19317);
            gl.field_y = 11;
            g.field_A = true;
            return;
          }
        } else {
          bk.c(-19317);
          gl.field_y = 11;
          g.field_A = true;
          return;
        }
    }

    static {
        field_d = new qd();
        field_c = "Create a free Account";
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
