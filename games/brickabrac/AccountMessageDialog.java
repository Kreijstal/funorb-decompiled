/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AccountMessageDialog extends ContentTransitionLayer implements WidgetActionListener {
    static NodeDeque queuedAchievementSubmissions;
    private boolean response256;
    private boolean field_vb;
    private boolean field_tb;
    private ActivityIndicatorWidget activityIndicator;
    private boolean responseHandled;
    static RgbSprite[] spaceSmallLeverSprites;
    static UiComponent field_Ab;
    static ValidationStatus validationInvalid;
    private TextFont font;
    static GameScreen currentScreen;
    static PlatformServices field_ub;

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == keyCode) {
            this.closeDialog(obfuscationGuard ^ 127);
            return true;
          }
          if (obfuscationGuard != 110) {
            currentScreen = (GameScreen) null;
          }
          stackIn_7_0 = super.handleWidgetKey(keyCode, (byte) 110, focusRoot, character);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lp.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(character).append(')').toString());
        }
    }

    final static boolean n(int param0) {
        if (param0 != -5) {
          spaceSmallLeverSprites = (RgbSprite[]) null;
          if (!LegacyUtf8Decoder.a((byte) -80)) {
            return false;
          }
          if (0 == (MembershipBenefitsScreen.clientTick & 8)) {
            return true;
          }
          return false;
        }
        if (!LegacyUtf8Decoder.a((byte) -80)) {
          return false;
        }
        if (0 == (MembershipBenefitsScreen.clientTick & 8)) {
          return true;
        }
        return false;
    }

    final void showPendingMessage(byte obfuscationGuard) {
        this.activityIndicator.setActivityColors(2121792, 4210752, 2);
        DialogMessagePanel var2 = new DialogMessagePanel(this, this.font, FarmBackground.field_t);
        if (obfuscationGuard < -11) {
          var2.addAction(false, DebouncedValidationSource.field_e, 15);
          this.transitionToContent((byte) 110, var2);
          return;
        }
    }

    public void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.response256) {
            AgeValidator.a("tochangedisplayname.ws", (byte) -113, EmailConfirmationValidator.e((byte) -103));
          } else {
            CheckboxWidgetRenderer.a(3, true);
            this.closeDialog(17);
          }
          if (obfuscationGuard < -22) {
            return;
          }
          AccountMessageDialog.o(-11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("lp.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void showResponseMessage(int responseCode, boolean closeFirst, String message) {
        boolean stackIn_7_1 = false;
        DialogMessagePanel stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        String stackIn_15_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        DialogMessagePanel var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        DialogMessagePanel var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.responseHandled) {
            return;
          }
          stackIn_7_1 = (256 == responseCode);
          this.response256 = stackIn_7_1;
          this.responseHandled = true;
          this.activityIndicator.setActivityColors(8405024, 4210752, 2);
          if (closeFirst) {
            this.closeDialog(6);
          }
          var6 = new DialogMessagePanel(this, this.font, message);
          var4 = var6;
          if (responseCode != 5) {
            if (responseCode == 256) {
              var6.appendButton((byte) -78, TabbedPane.field_Tb, (WidgetListener) (this));
            } else {
              stackIn_14_0 = var6;
              stackIn_14_1 = false;
              if (this.field_vb) {
                stackIn_15_2 = TabbedPane.field_Tb;
              } else {
                stackIn_15_2 = HalloweenBackground.field_s;
              }
              ((DialogMessagePanel) (Object) stackIn_14_0).addAction(stackIn_14_1, stackIn_15_2, -1);
            }
          } else {
            var6.addAction(closeFirst, DialogMessagePanel.field_L, 11);
            var6.addAction(false, wc.field_a, 17);
          }
          if (responseCode != 3) {
            if (responseCode != 4) {
              if (responseCode == 6) {
                var6.addAction(false, MatchingTextValidator.field_p, 9);
              } else {
                if (9 == responseCode) {
                  var6.appendButton((byte) 126, BrickABrac.field_G, (WidgetListener) (this));
                }
              }
            } else {
              var6.addAction(closeFirst, MonotonicTime.field_f, 8);
            }
          } else {
            var6.addAction(false, Ball.field_H, 7);
          }
          this.transitionToContent((byte) 125, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("lp.R(").append(responseCode).append(',').append(closeFirst).append(',');
          if (message == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    AccountMessageDialog(WidgetLayerStack layerStack, TextFont font, String initialMessage, boolean param3, boolean param4) {
        super(layerStack, new DialogMessagePanel((AccountMessageDialog) null, font, initialMessage), 77, 10, 10);
        try {
          this.field_tb = param4 ? true : false;
          this.field_vb = param3 ? true : false;
          this.responseHandled = false;
          this.response256 = false;
          this.font = font;
          this.activityIndicator = new ActivityIndicatorWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.activityIndicator.animated = true;
          this.addChild(this.activityIndicator, true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lp.<init>(" + (layerStack != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + (initialMessage != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void closeDialog(int obfuscationGuard) {
        if (obfuscationGuard != 17) {
          this.field_vb = false;
          if (!this.visible) {
            return;
          }
          this.visible = false;
          if (this.field_vb) {
            MatchingTextValidator.e((byte) -46);
            return;
          }
          if (this.field_tb) {
            ResourcePreparationQueue.a((byte) -30);
            return;
          }
          return;
        }
        if (!this.visible) {
          return;
        }
        this.visible = false;
        if (this.field_vb) {
          MatchingTextValidator.e((byte) -46);
          return;
        }
        if (this.field_tb) {
          ResourcePreparationQueue.a((byte) -30);
          return;
        }
    }

    public static void o(int param0) {
        queuedAchievementSubmissions = null;
        field_ub = null;
        currentScreen = null;
        field_Ab = null;
        if (param0 == 50) {
          validationInvalid = null;
          spaceSmallLeverSprites = null;
          return;
        }
        AccountMessageDialog.o(29);
        validationInvalid = null;
        spaceSmallLeverSprites = null;
    }

    static {
        queuedAchievementSubmissions = new NodeDeque();
        validationInvalid = new ValidationStatus();
    }
}
