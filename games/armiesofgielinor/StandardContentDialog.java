/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StandardContentDialog extends ContentTransitionDialog {
    static RgbSprite field_ob;
    static String field_nb;
    static String field_lb;
    static int field_mb;
    static String field_pb;
    static String field_kb;

    final static void attachQuickChatMenu(byte obfuscationGuard, QuickChatMenu menu) {
        try {
          OwnerChangeEvent.quickChatMenuHost.addChild(menu, 80);
          if (obfuscationGuard != 79) {
            field_nb = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lw.K(" + obfuscationGuard + ',' + (menu != null ? "{...}" : "null") + ')');
        }
    }

    StandardContentDialog(ModalDialogHost host, Widget content) {
        super(host, content, 33, 20, 30);
    }

    final void replaceContent(Widget content, byte obfuscationGuard) {
        try {
          int var3_int = -61 % ((-27 - obfuscationGuard) / 44);
          super.replaceContent(content, (byte) 87);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lw.A(" + (content != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void j(byte param0) {
        field_ob = null;
        if (param0 != 49) {
          return;
        }
        field_kb = null;
        field_pb = null;
        field_nb = null;
        field_lb = null;
    }

    final static ScrollControlWidget createVerticalScrollControl(int obfuscationGuard) {
        if (obfuscationGuard == 0) {
          return new ScrollControlWidget(0, 0, t.field_c.field_a, 0, (WidgetPainter) null, t.field_c.field_k, t.field_c.field_p, t.field_c.field_a, t.field_c.field_a, t.field_c.field_b, t.field_c.field_n, false, true, 32768, 0);
        }
        QuickChatMenu var2 = (QuickChatMenu) null;
        StandardContentDialog.attachQuickChatMenu((byte) -16, (QuickChatMenu) null);
        return new ScrollControlWidget(0, 0, t.field_c.field_a, 0, (WidgetPainter) null, t.field_c.field_k, t.field_c.field_p, t.field_c.field_a, t.field_c.field_a, t.field_c.field_b, t.field_c.field_n, false, true, 32768, 0);
    }

    static {
        field_lb = "Highscores";
        field_nb = "You have <%0> unread messages!";
        field_pb = "Show chat";
        field_kb = "Enter name of player to delete from list";
    }
}
