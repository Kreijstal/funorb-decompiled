/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessageLine extends IntrusiveNode {
    boolean field_v;
    int field_l;
    String text;
    int color;
    static String tutorialEightBallAftergrouppot;
    static int field_m;
    Sprite renderedSprite;
    static int field_u;
    int field_q;
    static Sprite field_w;
    static String gameoptMembersonly;
    static boolean field_o;
    int field_p;

    public static void releaseStatics(int param0) {
        tutorialEightBallAftergrouppot = null;
        field_w = null;
        gameoptMembersonly = null;
        if (param0 != -24061) {
          field_u = 64;
        }
    }

    final void renderSprite(int param0) {
        int var2 = CollisionContact.field_h.stringWidth(this.text);
        this.renderedSprite = new Sprite(2 + var2, CollisionContact.field_h.maxAscent - (-CollisionContact.field_h.maxDescent - 2));
        this.renderedSprite.bindAsRenderTarget();
        CollisionContact.field_h.setInlineSprites(AccountCreationForm.field_Z, LoginPayloadFactory.field_d);
        CollisionContact.field_h.drawLeft(this.text, 1, 1 + CollisionContact.field_h.maxAscent, this.color, param0);
        OpacityWidget.field_P.bindAsRenderTarget(param0 ^ -15101);
        this.renderedSprite.addOutline((16711423 & this.color) >> 1);
    }

    ChatMessageLine() {
        this.renderedSprite = null;
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
