/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends IntrusiveNode {
    int[][] field_l;
    static Sprite[][] field_m;
    int field_h;
    static kc field_n;
    int field_i;
    int field_k;
    String[][] field_r;
    int field_p;
    static String field_o;
    static IntrusiveNodeHashTable field_q;
    int field_s;
    static String field_j;
    int field_t;
    boolean field_g;
    private static String field_z;

    public static void a(int param0) {
        field_j = null;
        field_q = null;
        field_n = null;
        if (param0 == 30025) {
          field_m = (Sprite[][]) null;
          field_o = null;
          return;
        }
        nk.a(68);
        field_m = (Sprite[][]) null;
        field_o = null;
    }

    nk() {
    }

    static {
        field_z = "nk.A(";
        field_j = "Type your password again to make sure it's correct";
        field_o = "Offline";
    }
}
