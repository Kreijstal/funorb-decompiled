/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends IntrusiveNode {
    static AccountRequestState field_m;
    static String field_r;
    int field_o;
    static Sprite field_s;
    static int field_q;
    int field_t;
    static String field_k;
    static int field_p;
    static boolean field_u;
    static boolean field_n;
    static String field_l;

    final static void a(byte param0) {
        if (param0 == 91) {
          LoginPanel.field_B = new AccountRegistrationPanel();
          sf.field_f.b(LoginPanel.field_B, 23143);
          return;
        }
        ta.a(true, -47);
        LoginPanel.field_B = new AccountRegistrationPanel();
        sf.field_f.b(LoginPanel.field_B, 23143);
    }

    final static void a(boolean param0, int param1) {
        GzipDecompressor.field_b = 0;
        ha.field_w = cj.field_c;
        gj.field_v = 0;
        nk.field_c = 0;
        cd.field_L = new qd(2);
        if (param1 == 713) {
          cd.field_L.a(af.a(1, ni.field_e, KeyHandler.field_a), -1, param0, false);
          return;
        }
        ta.a(false, -126);
        cd.field_L.a(af.a(1, ni.field_e, KeyHandler.field_a), -1, param0, false);
    }

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          field_m = null;
          field_r = null;
          field_l = null;
          field_s = null;
          field_k = null;
          return;
        }
        field_l = (String) null;
        field_m = null;
        field_r = null;
        field_l = null;
        field_s = null;
        field_k = null;
    }

    private ta() throws Throwable {
        throw new Error();
    }

    static {
        field_r = "Highscores";
        field_k = "Create";
        field_m = new AccountRequestState();
        field_l = "Confirm Password: ";
    }
}
