/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends ca {
    static String[] field_h;
    static String field_r;
    static int field_l;
    cc field_p;
    int field_q;
    static String field_m;
    int field_o;
    int field_n;
    int field_g;
    int field_s;
    static cf field_k;
    static wa field_t;
    static od field_f;
    static int[] field_j;
    static String field_i;

    final static void a(boolean param0, int param1) {
        vc.field_j = 1000000000L / (long)param1;
        if (param0) {
            field_j = (int[]) null;
        }
    }

    public static void a(byte param0) {
        field_r = null;
        field_f = null;
        field_t = null;
        field_i = null;
        field_h = null;
        field_m = null;
        field_k = null;
        if (param0 < 3) {
          field_f = (od) null;
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    cc(int param0, int param1, int param2, int param3, int param4) {
        this.field_q = param0;
        this.field_o = param1;
        this.field_g = param2;
        this.field_n = param4;
        this.field_s = param3;
    }

    static {
        field_h = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_r = "Norbsome";
        field_m = "Tutorial ON";
        field_j = new int[8192];
        field_i = "This entry doesn't match";
    }
}
