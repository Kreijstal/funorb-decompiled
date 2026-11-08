/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedStatSubmission extends IntrusiveNode {
    int field_y;
    int field_o;
    int field_u;
    static UiComponent field_q;
    static int field_w;
    int field_r;
    static int field_n;
    static ClientProtocolStage field_v;
    int field_x;
    int field_t;
    static int field_s;
    static QuickChatPhraseCache field_p;

    final static void updateLobbyFadeOut(byte param0) {
        int var1;
        var1 = 6 % ((40 - param0) / 42);
        if (Js5Transport.field_g > 0) {
          Js5Transport.field_g = Js5Transport.field_g - 1;
        }
        if (DropTargetWidget.field_P != WidgetContainer.field_O.field_j) {
          TextureCache.field_f = TextureCache.field_f + (WidgetContainer.field_O.field_j - DropTargetWidget.field_P);
          DropTargetWidget.field_P = WidgetContainer.field_O.field_j;
        }
        if (Js5Transport.field_g > 0) {
          ChatPanelSlideHelpers.layoutAnimatedChatPanel((byte) -61);
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_p = null;
        if (param0 != 0) {
          field_w = 3;
          field_v = null;
          return;
        }
        field_v = null;
    }

    private QueuedStatSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_n = 0;
        field_v = new ClientProtocolStage();
    }
}
