/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends br {
    static int field_i;
    int field_f;
    static int[] field_o;
    int field_h;
    int field_g;
    static ri field_m;
    static String field_l;
    int field_k;
    static boolean field_p;
    int field_q;
    static String field_j;
    int field_n;

    final static void a(String param0, boolean param1, int param2) {
        bl.field_h = param1 ? true : false;
        nj.field_f = true;
        h.field_L = new ne(nb.field_a, ci.field_d, param0, ch.field_e, bl.field_h);
        nb.field_a.b(3016, (cf) (Object) h.field_L);
        if (param2 <= 89) {
            field_j = null;
        }
    }

    public static void b(boolean param0) {
        Object var2 = null;
        field_j = null;
        if (param0) {
          var2 = null;
          qj.a((String) null, false, 17);
          field_m = null;
          field_o = null;
          field_l = null;
          return;
        } else {
          field_m = null;
          field_o = null;
          field_l = null;
          return;
        }
    }

    qj(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((qj) this).field_k = param5;
        ((qj) this).field_h = param3;
        ((qj) this).field_q = param2;
        ((qj) this).field_f = param4;
        ((qj) this).field_g = param0;
        ((qj) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This will help you organise your horde. Use CTRL + '1', '2' or '3' to set unit groups, then press '1', '2' or '3' to quickly select each group.";
        field_p = true;
        field_j = "Allow spectators?";
    }
}
