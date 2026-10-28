/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountTermsPanel extends UiContainer implements TextHotspotListener, ButtonListener {
    static Sprite field_H;
    static String field_M;
    static int field_J;
    static String field_K;
    static String field_O;
    private TextButton continueButton;
    private RegistrationRequestDialog registrationDialog;
    static String[] field_I;
    private TextHotspotWidget termsText;

    public static void releaseStatics(int guard) {
        field_K = null;
        field_H = null;
        field_I = null;
        field_O = null;
        if (guard == 1) {
          field_M = null;
          return;
        }
        AccountTermsPanel.introFinished(51);
        field_M = null;
    }

    private final String linkCloseMarkup(byte guard) {
        if (guard <= 113) {
          TextButton var3 = (TextButton) null;
          this.onAction((TextButton) null, -9, -71, 98, 16);
          return "</col></u>";
        }
        return "</col></u>";
    }

    AccountTermsPanel(RegistrationRequestDialog param0) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        try {
          this.registrationDialog = param0;
          this.continueButton = new TextButton(NameAvailabilityResultSupport.field_d, (UiListener) null);
          this.continueButton.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          String var7 = SingleChildContainer.formatPlaceholders(LoginIdentifierSupport.field_c, -63, new String[]{this.linkOpenMarkup(-102), this.linkCloseMarkup((byte) 126)});
          int var3 = 20;
          TextWidgetPainter var4 = new TextWidgetPainter(Js5Transport.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, Js5Transport.field_a.maxAscent, -1, 2147483647, true);
          this.termsText = new TextHotspotWidget(var7, var4);
          this.termsText.tooltip = "";
          this.termsText.setHotspotTooltip(TextFieldValidator.field_m, (byte) 102, 0);
          this.termsText.setHotspotTooltip(TextFieldValidator.field_m, (byte) 104, 1);
          this.termsText.listener = (UiListener) (this);
          this.termsText.width = this.width - 40;
          this.termsText.setBoundsToTextHeight(2463, 26, -40 + this.width, var3);
          var3 = var3 + (15 + this.termsText.height);
          this.addChild(this.termsText, false);
          int var5 = 4;
          int var6 = 200;
          this.continueButton.setBounds(var6, var3, -var6 + 300 >> 1, true, 40);
          this.continueButton.listener = (UiListener) (this);
          this.addChild(this.continueButton, false);
          this.setBounds(300, 0, 0, true, var5 + (var3 + 55));
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean introFinished(int guard) {
        if (guard == 3) {
          return SocketConnector.field_d > 250 ? true : false;
        }
        field_M = (String) null;
        return SocketConnector.field_d > 250 ? true : false;
    }

    public final void onHotspotAction(int guard, TextHotspotWidget widget, int hotspotId, int buttonCode) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (hotspotId == 0) {
            AchievementRecord.requestPolicyPage(guard ^ -2849, "terms.ws");
          } else if (1 == hotspotId) {
            AchievementRecord.requestPolicyPage(12, "privacy.ws");
          } else if (hotspotId == 2) {
            AchievementRecord.requestPolicyPage(12, "conduct.ws");
          }
          if (guard == -2861) {
            return;
          }
          field_H = (Sprite) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("jf.A(").append(guard).append(',');
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(hotspotId).append(',').append(buttonCode).append(')').toString());
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_17_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 18)) {
            return true;
          }
          if (guard <= 0) {
            return false;
          }
          if (98 == keyCode) {
            boolean stackIn_9_0 = this.focusPreviousChild((byte) 22, root);
            return stackIn_9_0;
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
          StringBuilder stackIn_16_1 = new StringBuilder().append("jf.G(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    private final String linkOpenMarkup(int guard) {
        if (guard >= -90) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_9_2 = null;
        try {
          if (guard != 1) {
            TextHotspotWidget var7 = (TextHotspotWidget) null;
            this.onHotspotAction(-113, (TextHotspotWidget) null, -113, -16);
          }
          if (button != this.continueButton) {
            return;
          }
          DebouncedValidator.requestRegistrationLogin((byte) -125);
          this.registrationDialog.closeDialog(-18861);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var6;
          StringBuilder stackIn_8_1 = new StringBuilder().append("jf.K(");
          if (button == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    static {
        field_M = "Level will restart shortly.";
        field_K = "Level: ";
        field_O = "Create a free account to store your progress.";
    }
}
