/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Under13AccountNoticePanel extends UiContainer implements UiHotspotListener, UiActionListener {
    static int field_y;
    private UiFocusableComponent continueButton;
    static GameStateFactory field_v;
    private AccountCreationDialog dialog;
    private HotspotTextWidget noticeText;

    private final String getLinkMarkupEnd(byte param0) {
        if (param0 >= -25) {
          this.dialog = (AccountCreationDialog) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onHotspotClicked(int param0, int param1, int param2, HotspotTextWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != -1) {
            this.noticeText = (HotspotTextWidget) null;
          }
          if (0 == param2) {
            SetReloadBarWidth.a(12, "terms.ws");
            return;
          }
          if (param2 == 1) {
            SetReloadBarWidth.a(12, "privacy.ws");
            return;
          }
          if (param2 != 2) {
            return;
          }
          SetReloadBarWidth.a(param0 + 13, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("w.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    Under13AccountNoticePanel(AccountCreationDialog param0) {
        super(0, 0, 288, 0, (UiRenderer) null);
        String var7 = null;
        int var3 = 0;
        UiTextStyle var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.dialog = param0;
          this.continueButton = new UiFocusableComponent(NativeModelIntValue.field_b, (UiListener) null);
          this.continueButton.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
          var7 = SetReverbGain.a(SetCountermeasuresPulsetime.field_o, new String[]{this.getLinkMarkupStart(true), this.getLinkMarkupEnd((byte) -30)}, 81);
          var3 = 20;
          var4 = new UiTextStyle(SetShipToShipRamDamage.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, SetShipToShipRamDamage.field_o.maxAscent, -1, 2147483647, true);
          this.noticeText = new HotspotTextWidget(var7, var4);
          this.noticeText.tooltip = "";
          this.noticeText.setHotspotTooltip(0, -1, SetBombletSprayProjectileDamage.field_q);
          this.noticeText.setHotspotTooltip(1, -1, SetBombletSprayProjectileDamage.field_q);
          this.noticeText.listener = (UiListener) (this);
          this.noticeText.width = -40 + this.width;
          this.noticeText.fitTextBounds(-40 + this.width, var3, 26, (byte) -23);
          var3 = var3 + (15 + this.noticeText.height);
          this.addChild(-18756, this.noticeText);
          var5 = 4;
          var6 = 200;
          this.continueButton.setBounds(-var6 + 300 >> 1, var6, 40, 1, var3);
          this.continueButton.listener = (UiListener) (this);
          this.addChild(-18756, this.continueButton);
          this.setBounds(0, 300, var3 - (-55 - var5), 1, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        IsaacPacketBuffer var2 = RequestNewestBlackboxRecording.field_p;
        var2.writeIsaacByte(24335, param0);
        var2.writeByte(0, 1);
        int var3 = -52 / ((-27 - param1) / 35);
        var2.writeByte(0, 0);
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
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
            stackIn_6_0 = this.focusPreviousChild(param2, 0);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(true, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("w.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.continueButton == param3) {
            GetBoostersActiveTime.f((byte) -74);
            this.dialog.closeDialog((byte) -106);
          }
          if (param0 == 11) {
            return;
          }
          Under13AccountNoticePanel.a(-96, (byte) -47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("w.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 77) {
          field_y = 91;
          field_v = null;
          return;
        }
        field_v = null;
    }

    private final String getLinkMarkupStart(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_v = (GameStateFactory) ((Object) new PlayerActionFactory());
    }
}
