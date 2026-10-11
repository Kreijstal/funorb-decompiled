/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss {
    static int field_j;
    static hd field_c;
    static String field_f;
    static String field_i;
    static String[] field_a;
    static String field_h;
    static String field_g;
    static ak field_b;
    static String field_e;
    static String field_d;

    public static void a(byte param0) {
        field_b = null;
        field_i = null;
        field_f = null;
        if (param0 == -90) {
          field_g = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_h = null;
          field_c = null;
          return;
        }
        ss.a((byte) -76, 109, 26, -32);
        field_g = null;
        field_d = null;
        field_e = null;
        field_a = null;
        field_h = null;
        field_c = null;
    }

    final static void a(String param0, byte param1, String param2) {
        try {
          ql.a(false, param0, param2, 3960);
          if (param1 >= -114) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ss.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != 88) {
          return true;
        }
        if (null != wi.field_v &&
          wi.field_v.a((byte) -52)) {
          da.b(param0 ^ 21);
          return true;
        }
        if (null != ck.field_b &&
          ck.field_b.h((byte) 37)) {
          ck.field_b = null;
          da.b(85);
          return true;
        }
        if (br.a(param0 ^ 62)) {
          return true;
        }
        if (ni.a(param3, param2, param1, -20859)) {
          return true;
        }
        return false;
    }

    static {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_f = "leagues";
        field_g = "resigned";
        field_i = "Drag your players from the grid to fill slot <%0> and slot <%1> on the pitch.<br>Click ready when done.";
        field_e = "Total: ";
        field_d = "You need to play 1 more rated game to unlock this option.";
        field_h = "Unable to add friend - system busy";
    }
}
