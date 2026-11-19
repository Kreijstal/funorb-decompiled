/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginChoicePanel extends WidgetContainer implements ButtonActionListener {
    static int field_M;
    private TextButton field_H;
    private TextButton field_J;
    static NameAvailabilityRequest field_F;
    static int field_I;
    static FullscreenFocusCanvas field_E;
    static String field_L;
    private TextButton field_K;
    static char[] field_G;

    final boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, (byte) -105, param3)) {
            return true;
          }
          if (param2 >= -96) {
            this.field_J = (TextButton) null;
          }
          if (param1 == 98) {
            stackIn_9_0 = this.focusPreviousChild((byte) -117, param3);
            return stackIn_9_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_13_0 = this.focusNextChild(param3, 1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ki.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public LoginChoicePanel() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_K = new TextButton(WhirlpoolHasher.field_h, (WidgetListener) null);
        this.field_H = new TextButton(SpriteAlphaState.field_c, (WidgetListener) null);
        this.field_J = new TextButton(DualLinkDeque.field_b, (WidgetListener) null);
        SpriteButtonPainter var1 = new SpriteButtonPainter();
        this.field_K.renderer = (WidgetRenderer) ((Object) var1);
        this.field_H.renderer = (WidgetRenderer) ((Object) var1);
        this.field_J.renderer = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_H.setBounds(120, -48 + (this.height - var2), 30, var4, this.width - var3 >> 1);
        this.field_J.setBounds(117, -48 + this.height - var2, 30, var4, (-var3 + this.width >> 1) - (-var4 - var2));
        this.field_K.setBounds(120, this.height - (78 + 2 * var2), 30, var3, -var3 + this.width >> 1);
        this.field_H.listener = (WidgetListener) (this);
        this.field_K.listener = (WidgetListener) (this);
        this.field_J.listener = (WidgetListener) (this);
        this.field_K.tooltip = DelayedServerPacket.field_i;
        this.field_J.tooltip = ProxyAuthenticationException.field_a;
        this.addChild((UiWidget) (this.field_H), (byte) 101);
        this.addChild((UiWidget) (this.field_K), (byte) 47);
        this.addChild((UiWidget) (this.field_J), (byte) 46);
    }

    public static void releaseStatics(byte param0) {
        field_E = null;
        int var1 = 31 % ((param0 + 23) / 41);
        field_G = null;
        field_F = null;
        field_L = null;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var5 = this.x + param0;
        int var6 = this.y + param3;
        Crc32Helpers.field_b.a(RankingStatsDecoder.field_c, var5 + 20, 20 + var6, this.width - 40, this.height - 50, 16777215, -1, 1, 0, Crc32Helpers.field_b.field_M);
        super.drawLayer(param0, param1, param2, param3);
    }

    final static void h(byte param0) {
        DialogLayer.field_J = false;
        WrappedTextLayout.field_i = false;
        OpacityWidget.setAccountWorkflowState((byte) 79, -1);
        NetworkArchiveRequest.field_y = ByteArrayPool.field_b;
        if (param0 > 64) {
          ChatMessage.field_j = ByteArrayPool.field_b;
          return;
        }
        LoginChoicePanel.releaseStatics((byte) -56);
        ChatMessage.field_j = ByteArrayPool.field_b;
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = wizardrun.field_H;
        try {
          if (this.field_H == param1) {
            Js5Index.a(-1);
          } else {
            if (param1 == this.field_K) {
              UiThemeSetupHelpers.showAccountCreationForm(-1);
            } else {
              if (param1 == this.field_J) {
                IndexedSpriteState.a(55);
              }
            }
          }
          if (param0 == -18905) {
            return;
          }
          LoginChoicePanel.releaseStatics((byte) 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ki.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_L = "This game has been updated! Please reload this page.";
        field_G = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
