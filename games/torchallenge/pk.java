/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends java.awt.Canvas {
    private java.awt.Component field_b;
    static uf field_e;
    static String[] field_c;
    static boolean field_f;
    static lj field_d;
    static String field_a;

    public final void paint(java.awt.Graphics param0) {
        ((pk) this).field_b.paint(param0);
    }

    pk(java.awt.Component param0) {
        ((pk) this).field_b = param0;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_d = null;
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((pk) this).field_b.update(param0);
    }

    final static String a(int param0, String param1, String param2, lj param3, String param4) {
        if (!param3.b(-7957)) {
          return param4;
        } else {
          if (param0 != 256) {
            return null;
          } else {
            return param1 + " - " + param3.a(109, param2) + "%";
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_e = new uf(256);
        field_f = false;
        field_a = "Unpacking sound effects";
    }
}
