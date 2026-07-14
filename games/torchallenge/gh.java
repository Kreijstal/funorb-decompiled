/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends da {
    mi[] field_q;
    static String field_z;
    int[] field_o;
    int field_p;
    byte[][][] field_s;
    mi[] field_j;
    static int[] field_n;
    static String field_v;
    int field_l;
    static String field_y;
    int[] field_u;
    static String field_r;
    int[] field_t;
    static String field_i;
    static int[][][] field_k;
    static boolean field_x;
    static int field_w;
    static boolean field_m;

    public static void a(int param0) {
        field_r = null;
        field_n = null;
        field_k = null;
        field_z = null;
        if (param0 != -16742) {
          gh.a(-119);
          field_y = null;
          field_i = null;
          field_v = null;
          return;
        } else {
          field_y = null;
          field_i = null;
          field_v = null;
          return;
        }
    }

    final static void a(byte param0, String param1, boolean param2) {
        ae.field_C = param2 ? true : false;
        hl.field_e = true;
        da.field_c = new wa(t.field_b, dl.field_H, param1, eb.field_m, ae.field_C);
        t.field_b.a((byte) 73, (ee) (Object) da.field_c);
        if (param0 != -116) {
            field_y = null;
        }
    }

    gh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Open in popup window";
        field_v = "FULL ACCESS";
        field_y = "Seal";
        field_r = "You have <%0> unread messages!";
        field_n = new int[]{300, 300, 300, 425, 300};
        field_x = false;
        field_i = "Help posts: ON";
        field_k = new int[][][]{new int[1][], new int[1][], new int[1][], new int[2][], new int[1][]};
        field_m = false;
    }
}
