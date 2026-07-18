/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    int field_d;
    static int[][] field_i;
    static String[] field_k;
    int field_b;
    int field_c;
    int field_a;
    byte[] field_e;
    byte[] field_f;
    int field_j;
    int field_g;
    int field_h;

    final static sa a(Throwable param0, String param1) {
        sa var2 = null;
        if (param0 instanceof sa) {
            var2 = (sa) (Object) param0;
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new sa(param0, param1);
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 == 13) {
          if (oc.field_e != null) {
            if (pk.field_l != eh.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_k = null;
          if (oc.field_e != null) {
            if (pk.field_l != eh.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a() {
        field_i = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[9][];
        field_i[7] = new int[2];
        field_i[4] = new int[2];
        field_i[2] = new int[4];
        field_i[3] = new int[4];
        field_i[8] = new int[2];
        field_i[1] = new int[6];
        field_i[5] = new int[1];
        field_i[6] = new int[2];
        field_i[0] = new int[8];
        field_k = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
