/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPanelSlideHelpers {
    static LoginMethod field_j;
    static String field_b;
    static String field_i;
    static String[][] field_g;
    static String field_f;
    static java.applet.Applet field_h;
    static GameApplet field_a;
    static PendingStatQuery field_e;
    static String field_d;
    static String field_c;

    public static void releaseStatics(int param0) {
        field_h = null;
        field_j = null;
        field_f = null;
        field_b = null;
        field_g = (String[][]) null;
        field_c = null;
        if (param0 == 120) {
          field_d = null;
          field_i = null;
          field_e = null;
          return;
        }
        field_c = (String) null;
        field_d = null;
        field_i = null;
        field_e = null;
    }

    final static void layoutAnimatedChatPanel(byte param0) {
        int var1 = -13 % ((3 - param0) / 44);
        int var2 = AnimationPlayer.field_f * AnimationPlayer.field_f;
        int var3 = -(Js5Transport.field_g * Js5Transport.field_g) + var2;
        int var4 = TextureCache.field_f + var3 * (DropTargetWidget.field_P - TextureCache.field_f) / var2;
        IsaacCipher.field_a.setBounds((byte) -116, 640, var4, 120, LoadingStatusHelpers.field_d);
        DateOfBirthValidator.drawOverlays(5, QueuedStatSubmission.field_w, 640, DropTargetWidget.field_P - 24, 1000000, DisplayNameForm.field_Q, 0);
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_j = new LoginMethod("usename");
        field_i = "Elapsed time";
        field_f = "You have been removed from <%0>'s game.";
        field_d = "Message game";
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = null;
    }
}
