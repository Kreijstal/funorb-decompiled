/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatFilterPackingHelpers {
    static SceneWidget field_a;

    final static int packChatFilterSettings(byte param0) {
        if (param0 != 56) {
          return 7;
        }
        return (LoginForm.field_Z << 2) + (BufferedSocket.field_c << 4) + CachedArchiveProvider.field_y;
    }

    final static void updatePanelAndTooltip(boolean param0, int param1) {
        FrameStyleHelpers.updateMainPanelWidget(param0, 1);
        if (param1 != 230827172) {
          field_a = (SceneWidget) null;
          if (null != UiTheme.field_i) {
            ViewportController.drawPointerTooltip(UiTheme.field_i, 1);
            return;
          }
          return;
        }
        if (null == UiTheme.field_i) {
          return;
        }
        ViewportController.drawPointerTooltip(UiTheme.field_i, 1);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        int var1 = -64 % ((param0 + 13) / 36);
    }

    static {
    }
}
