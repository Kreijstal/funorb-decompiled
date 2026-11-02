/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends IntrusiveNode {
    boolean field_v;
    int field_l;
    String field_x;
    int field_s;
    static String tutorialEightBallAftergrouppot;
    static int field_m;
    Sprite field_n;
    static int field_u;
    int field_q;
    static Sprite field_w;
    static String gameoptMembersonly;
    static boolean field_o;
    int field_p;

    public static void a(int param0) {
        tutorialEightBallAftergrouppot = null;
        field_w = null;
        gameoptMembersonly = null;
        if (param0 != -24061) {
          field_u = 64;
        }
    }

    final void c(int param0) {
        int var2 = sa.field_h.b(this.field_x);
        this.field_n = new Sprite(2 + var2, sa.field_h.maxAscent - (-sa.field_h.maxDescent - 2));
        this.field_n.e();
        sa.field_h.setInlineSprites(AccountCreationForm.field_Z, bi.field_d);
        sa.field_h.d(this.field_x, 1, 1 + sa.field_h.maxAscent, this.field_s, param0);
        OpacityWidget.field_P.bindAsRenderTarget(param0 ^ -15101);
        this.field_n.e((16711423 & this.field_s) >> 1);
    }

    lk() {
        this.field_n = null;
        this.field_q = 1;
        this.field_p = 230;
    }

    static {
        tutorialEightBallAftergrouppot = "Now that you have finished potting all of your group's balls, you must pot the black ball (without fouling) to win.";
        field_u = 0;
        gameoptMembersonly = "This game option is only available to members.";
        field_o = false;
    }
}
