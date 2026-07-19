/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    static String field_e;
    static String field_f;
    static int field_b;
    static jp field_d;
    static jp[][] field_c;
    static int field_a;

    final static void b(boolean param0) {
        bj.field_T = sh.a((byte) 84);
        if (param0) {
          field_e = (String) null;
          mf.field_f = new cp();
          ag.a((byte) -16, true, true);
          return;
        } else {
          mf.field_f = new cp();
          ag.a((byte) -16, true, true);
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_c = (jp[][]) null;
        if (!param0) {
            np.a(false);
        }
    }

    static {
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "Decline invitation to <%0>'s game";
    }
}
