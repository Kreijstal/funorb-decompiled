/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static String field_b;
    static boolean[] field_d;
    static String[] field_c;
    static um field_a;
    static String field_e;
    static int field_f;

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 60) {
          field_d = null;
          field_e = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = gd.a(5);
        if (param0 <= 87) {
          return;
        } else {
          var2 = rb.a(0);
          bl.field_d.a(ai.field_j - tn.field_m, (tn.field_m << 1559415873) + var1, var2 + (tm.field_d << -871931391), true, -tm.field_d + ak.field_j);
          di.f((byte) 118);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_f = 1;
        field_e = "This password is part of your Player Name, and would be easy to guess";
    }
}
