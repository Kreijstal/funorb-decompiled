/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountChoicePanel extends UiContainer implements ButtonListener {
    private TextButton guestButton;
    static int field_H;
    private TextButton backButton;
    private TextButton createAccountButton;

    public AccountChoicePanel() {
        super(0, 0, 476, 225, (WidgetPainter) null);
        this.createAccountButton = new TextButton(pc.field_g, (UiListener) null);
        this.backButton = new TextButton(CipherPacketBuffer.field_p, (UiListener) null);
        this.guestButton = new TextButton(cj.field_c, (UiListener) null);
        ThreeSliceButtonPainter var1 = new ThreeSliceButtonPainter();
        this.createAccountButton.painter = (WidgetPainter) ((Object) var1);
        this.backButton.painter = (WidgetPainter) ((Object) var1);
        this.guestButton.painter = (WidgetPainter) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.backButton.setBounds(var4, this.height - (48 + var2), -var3 + this.width >> 1, true, 30);
        this.guestButton.setBounds(var4, -48 + (this.height - var2), (this.width - var3 >> 1) + (var4 + var2), true, 30);
        this.createAccountButton.setBounds(var3, -78 + (this.height - 2 * var2), -var3 + this.width >> 1, true, 30);
        this.backButton.listener = (UiListener) (this);
        this.createAccountButton.listener = (UiListener) (this);
        this.guestButton.listener = (UiListener) (this);
        this.createAccountButton.tooltip = mm.field_c;
        this.guestButton.tooltip = ValidationHelpWidget.field_G;
        this.addChild(this.backButton, false);
        this.addChild(this.createAccountButton, false);
        this.addChild(this.guestButton, false);
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (guard > 85) {
          int var5 = this.x + screenX;
          int var6 = screenY + this.y;
          Js5Transport.field_a.drawParagraph(MarkerSlider.field_F, var5 + 20, var6 + 20, this.width - 40, this.height - 50, 16777215, -1, 1, 0, Js5Transport.field_a.maxAscent);
          super.drawLayer(screenY, (byte) 99, layer, screenX);
          return;
        }
        this.guestButton = (TextButton) null;
        int var5Lifetime1 = this.x + screenX;
        int var6Lifetime1 = screenY + this.y;
        Js5Transport.field_a.drawParagraph(MarkerSlider.field_F, var5Lifetime1 + 20, var6Lifetime1 + 20, this.width - 40, this.height - 50, 16777215, -1, 1, 0, Js5Transport.field_a.maxAscent);
        super.drawLayer(screenY, (byte) 99, layer, screenX);
    }

    final static boolean a(byte param0) {
        if (param0 >= -30) {
          field_H = -87;
          if (AccountSessionSupport.isGuestSession(-127)) {
            return false;
          }
          if (mg.field_b >= 2) {
            return true;
          }
          return false;
        }
        if (AccountSessionSupport.isGuestSession(-127)) {
          return false;
        }
        if (mg.field_b >= 2) {
          return true;
        }
        return false;
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_14_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.backButton == button) {
            GameAppletShell.b(-74);
          } else if (this.createAccountButton == button) {
            fe.a((byte) -83);
          } else if (this.guestButton == button) {
            NameAvailabilityResultSupport.chooseGuestSession(4);
          }
          if (guard == 1) {
            return;
          }
          AccountChoicePanel.a((byte) -64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var6;
          StringBuilder stackIn_13_1 = new StringBuilder().append("l.K(");
          if (button == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_17_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 71)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_6_0 = this.focusPreviousChild((byte) 22, root);
            return stackIn_6_0;
          }
          if (guard < 0) {
            return true;
          }
          if (keyCode != 99) {
            return false;
          }
          boolean stackIn_13_0 = this.focusNextChild(root, true);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("l.G(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != -8462) {
          return -107;
        }
        if (!AchievementRecord.a(param1, -99)) {
          return -1;
        }
        return param1;
    }

    static {
        field_H = 4;
    }
}
