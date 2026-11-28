/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationAgreementPane extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener {
    private AccountCreationResultPanel field_B;
    static String field_E;
    static int field_K;
    static boolean field_F;
    static BinaryBitmapFont field_I;
    static String field_L;
    static String field_D;
    static int field_H;
    static String field_C;
    private RichTextWidget field_A;
    private InteractiveWidget field_G;

    public final void onWidgetActivated(byte param0, int param1, int param2, InteractiveWidget param3, int param4) {
        try {
          if (param3 == this.field_G) {
            mh.b((byte) -57);
            this.field_B.closeDialog(4210752);
          }
          int var6_int = -98 / ((param0 + 3) / 62);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "ob.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void resetStaticState(byte param0) {
        field_E = null;
        field_L = null;
        field_D = null;
        field_I = null;
        if (param0 == -19) {
          field_C = null;
          return;
        }
        field_K = -18;
        field_C = null;
    }

    public final void onTextHotspotActivated(int param0, int param1, byte param2, RichTextWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != 101) {
            this.field_A = (RichTextWidget) null;
          }
          if (param1 == 0) {
            DualLinkDequeIterator.a("terms.ws", 1);
            return;
          }
          if (param1 == 1) {
            DualLinkDequeIterator.a("privacy.ws", param2 - 100);
            return;
          }
          if (param1 != 2) {
            return;
          }
          DualLinkDequeIterator.a("conduct.ws", param2 - 100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ob.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    RegistrationAgreementPane(AccountCreationResultPanel param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        DefaultTextWidgetRenderer var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_B = param0;
          this.field_G = new InteractiveWidget(ModalDialogHost.field_C, (WidgetEventListener) null);
          this.field_G.field_j = (WidgetRenderer) ((Object) new vk());
          var7 = CrossfadingMidiPcmStream.a(-415993727, new String[]{this.getAgreementLinkOpeningTag(67), this.getAgreementLinkClosingTag(-804)}, lb.field_a);
          var3 = 20;
          var4 = new DefaultTextWidgetRenderer(lm.field_f, 0, 0, 0, 0, 16777215, -1, 3, 0, lm.field_f.field_H, -1, 2147483647, true);
          this.field_A = new RichTextWidget(var7, var4);
          this.field_A.field_i = "";
          this.field_A.setHotspotTooltip(0, ConfirmedEmailAvailabilityValidator.field_p, 2);
          this.field_A.setHotspotTooltip(1, ConfirmedEmailAvailabilityValidator.field_p, 2);
          this.field_A.field_h = (WidgetEventListener) (this);
          this.field_A.field_m = this.field_m - 40;
          this.field_A.setTextBounds(var3, (byte) 53, -40 + this.field_m, 26);
          var3 = var3 + (this.field_A.field_r + 15);
          this.addChild(this.field_A, (byte) 74);
          var5 = 4;
          var6 = 200;
          this.field_G.setBounds(300 - var6 >> 1, var3, 40, (byte) -90, var6);
          this.field_G.field_h = (WidgetEventListener) (this);
          this.addChild(this.field_G, (byte) 74);
          this.setBounds(0, 0, var5 + var3 + 55, (byte) -90, 300);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Container l(int param0) {
        if (LabeledWidgetContainer.field_J != null) {
          return (java.awt.Container) ((Object) LabeledWidgetContainer.field_J);
        }
        if (param0 != 4) {
          RegistrationAgreementPane.resetStaticState((byte) -91);
          return (java.awt.Container) ((Object) uj.b((byte) -120));
        }
        return (java.awt.Container) ((Object) uj.b((byte) -120));
    }

    private final String getAgreementLinkClosingTag(int param0) {
        if (param0 != -804) {
          field_H = -2;
          return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean handleKey(char param0, int param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param2, false);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(param2, false);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ob.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final String getAgreementLinkOpeningTag(int param0) {
        if (param0 <= 55) {
          field_C = (String) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_E = "NOVA BLAST";
        field_F = false;
        field_L = "NITRO BLAST";
        field_D = "Cancel";
        field_C = "Unfortunately we are unable to create an account for you at this time.";
    }
}
