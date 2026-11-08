/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SharedPanelFactory {
    static int[] field_c;
    static int field_e;
    static String field_d;
    static MidiPcmStream field_b;
    static String field_a;

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 <= 24) {
          SharedPanelFactory.releaseStatics((byte) 73);
        }
    }

    final static void createSharedPanels(boolean param0, byte param1) {
        CachedTextLayout.field_e = param0 ? new SocialTabsPanel(ReflectionCheckHelpers.field_a, QueuedStatSubmission.field_q) : new SocialTabsPanel(KeyHandlerHelpers.field_e, DialWidget.field_Q);
        LoginPanel.field_P = new UiComponent(0L, (UiComponent) null);
        LoginPanel.field_P.addChild((byte) -98, CachedTextLayout.field_e.field_g);
        LoginPanel.field_P.addChild((byte) -114, SparkParticle.field_n);
        ChatMessage.field_b = new UiComponent(0L, RandomAccessCacheFile.field_h);
        DelegatingCanvas.field_e = new UiComponent(0L, (UiComponent) null);
        ChatMessage.field_b.addChild((byte) -90, MarkerSliderPainter.field_l);
        ChatMessage.field_b.addChild((byte) -123, DelegatingCanvas.field_e);
        DelegatingCanvas.field_e.addChild((byte) 21, TextMetricsGlobals.field_c);
        if (param1 == -128) {
          DelegatingCanvas.field_e.addChild((byte) 18, GraphicsSettings.field_b);
          DialWidgetPainter.layoutLobbyComponents(param0, true);
          return;
        }
    }

    final static void reopenLoginPanel(byte param0) {
        if (PacketBuffer.field_r) {
          ClockAndTextHelpers.field_c = true;
          ValidationMessageWidget.showLoginDialog((byte) 126, false);
          DisplayNameForm.field_R = 0;
          int var1 = 82 / ((param0 + 51) / 57);
          return;
        }
        throw new IllegalStateException();
    }

    static {
        field_d = "Passwords can only contain letters and numbers";
        field_a = "Creating your account";
    }
}
