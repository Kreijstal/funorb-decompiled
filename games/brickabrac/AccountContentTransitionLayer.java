/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountContentTransitionLayer extends ContentTransitionLayer {
    static ContentTransitionPhase contentFadingOut;
    static String field_rb;
    static s field_tb;
    static String field_ub;
    static String field_sb;
    static int field_vb;

    final static void m(int param0) {
        PasswordFieldRenderer.field_G = MonotonicTime.nowMillis(false);
        GameplayScreen.field_h = 0;
        if (param0 >= -58) {
          AccountContentTransitionLayer.m(-3);
        }
    }

    AccountContentTransitionLayer(WidgetLayerStack layerStack, Widget content) {
        super(layerStack, content, 33, 20, 30);
    }

    public static void n(int param0) {
        field_ub = null;
        contentFadingOut = null;
        if (param0 < 26) {
          return;
        }
        field_tb = null;
        field_rb = null;
        field_sb = null;
    }

    final void transitionToContent(byte obfuscationGuard, Widget content) {
        if (obfuscationGuard <= 105) {
          return;
        }
        try {
          super.transitionToContent((byte) 120, content);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "bh.C(" + obfuscationGuard + ',' + (content != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_rb = "You do not have a suitable number of players for the current options.";
        field_sb = "This entry doesn't match";
        field_ub = "Oh dear!";
        contentFadingOut = new ContentTransitionPhase();
    }
}
