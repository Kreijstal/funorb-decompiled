/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    private String field_b;
    static String[] field_c;
    private boolean field_g;
    static of field_a;
    static String field_f;
    static String field_e;
    static int field_d;

    final String a(byte param0) {
        if (param0 >= -48) {
            return null;
        }
        return ((hb) this).field_b;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            ((hb) this).field_b = null;
            return ((hb) this).field_g;
        }
        return ((hb) this).field_g;
    }

    hb(String param0, boolean param1) {
        ((hb) this).field_b = param0;
        if (null == ((hb) this).field_b) {
            ((hb) this).field_b = "";
        }
        ((hb) this).field_g = param1 ? true : false;
        if (0 == ((hb) this).field_b.length()) {
            ((hb) this).field_g = false;
        }
    }

    hb(String param0) {
        this(param0, false);
    }

    final static String c(int param0) {
        String var1 = null;
        var1 = "";
        if (param0 != -8927) {
          L0: {
            hb.b(75);
            if (ao.field_c != null) {
              var1 = ao.field_c.e(false);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != var1.length()) {
              break L1;
            } else {
              var1 = bd.a(6);
              break L1;
            }
          }
          L2: {
            if (var1.length() != 0) {
              break L2;
            } else {
              var1 = pm.field_a;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (ao.field_c != null) {
              var1 = ao.field_c.e(false);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 != var1.length()) {
              break L4;
            } else {
              var1 = bd.a(6);
              break L4;
            }
          }
          L5: {
            if (var1.length() != 0) {
              break L5;
            } else {
              var1 = pm.field_a;
              break L5;
            }
          }
          return var1;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 >= -107) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new of(1);
        field_f = "Please select an option in the '<%0>' row.";
        field_e = "<%0> has dropped out.";
    }
}
