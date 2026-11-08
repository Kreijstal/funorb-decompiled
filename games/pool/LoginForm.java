/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends WidgetContainer implements TextInputListener, ButtonActivationListener {
    static IntrusiveDeque field_U;
    private ButtonWidget loginButton;
    private ButtonWidget createAccountButton;
    private String field_T;
    private TextInputWidget usernameInput;
    private boolean field_Y;
    private boolean field_O;
    private ButtonWidget secondaryButton;
    private boolean field_P;
    static String createOptinNewsTooltip;
    static String tutorialNineBallPottingNine;
    private TextInputWidget passwordInput;
    static String textRemovedFromGame;
    static int[] field_V;

    public final void onTextInputSubmitted(TextInputWidget param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.usernameInput) {
            this.passwordInput.requestKeyboardFocus((UiWidget) (this), (byte) 115);
          }
          if (param0 == this.passwordInput) {
            this.submitLogin(-1);
          }
          if (param1) {
            this.passwordInput = (TextInputWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ui.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final String getEnteredName(int param0) {
        if (param0 >= -99) {
          createOptinNewsTooltip = (String) null;
        }
        if (null == this.usernameInput.widgetText) {
          return "";
        }
        return this.usernameInput.widgetText;
    }

    final void prefillUsername(int param0, String param1) {
        TextInputWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.usernameInput;
          var4 = param1;
          var3.setInputText((byte) -124, false, var4);
          if (param0 != 8) {
            String var5 = (String) null;
            LoginForm.a((byte) -7, (String) null, (String) null);
          }
          this.passwordInput.clearInputText(88);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        LabeledChildWidget dupTemp$0 = null;
        LabeledChildWidget dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        ButtonWidget stackIn_18_1 = null;
        ButtonWidget stackIn_18_2 = null;
        ButtonWidget stackIn_19_1 = null;
        ButtonWidget stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ThreeSliceButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        LabeledChildWidget var11 = null;
        LabeledChildWidget var12 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_P = stackIn_4_1;
          this.field_T = param1;
          stackIn_7_1 = (param4);
          this.field_O = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_Y = stackIn_10_1;
          if (this.field_P && (this.field_Y ||
            this.field_O)) {
            throw new IllegalStateException();
          }
          this.usernameInput = (TextInputWidget) ((Object) new MaxLengthTextInputWidget(param0, (WidgetListener) (this), 100));
          this.passwordInput = (TextInputWidget) ((Object) new MaxLengthTextInputWidget("", (WidgetListener) (this), 20));
          if (!this.field_P) {
            this.loginButton = new ButtonWidget(CollisionContact.login, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_O) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = MultiHandleSliderWidget.justplay;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = CueStick.back;
            }
            this.secondaryButton = new ButtonWidget(stackIn_19_3, (WidgetListener) null);
            if (this.field_Y) {
              this.createAccountButton = new ButtonWidget(ArchiveIndex.createCreateanaccount, (WidgetListener) (this));
            }
          } else {
            this.loginButton = new ButtonWidget(QuickChatPhraseDefinition.retry, (WidgetListener) null);
            this.secondaryButton = new ButtonWidget(FullscreenDisplayMode.quittowebsite, (WidgetListener) null);
            this.usernameInput.enabled = false;
          }
          this.usernameInput.renderer = (WidgetPainter) ((Object) new TextInputPainter(10000536));
          this.passwordInput.renderer = (WidgetPainter) ((Object) new PasswordInputPainter(10000536));
          var6 = new ThreeSliceButtonPainter();
          this.loginButton.renderer = (WidgetPainter) ((Object) var6);
          if (this.secondaryButton != null) {
            this.secondaryButton.renderer = (WidgetPainter) ((Object) var6);
          }
          this.usernameInput.hoverText = ChatMessage.loginUsernameTooltip;
          if (null != this.createAccountButton) {
            this.createAccountButton.renderer = (WidgetPainter) ((Object) var6);
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.hoverText = AccountMenuText.loginCreateTooltip;
          }
          if (!this.field_P) {
            if (this.field_O) {
              this.secondaryButton.hoverText = ArchiveProvider.loginJustplayTooltip;
              this.secondaryButton.renderer = (WidgetPainter) ((Object) new LinkButtonPainter());
            } else {
              this.secondaryButton.renderer = (WidgetPainter) ((Object) new LinkButtonPainter());
            }
          } else {
            this.secondaryButton.hoverText = StateIconLabel.warningIfyouquit;
          }
          this.widgetY = 15;
          var7 = ValidationIconWidget.field_O;
          if (this.field_T != null) {
            this.widgetY = this.widgetY + (5 + var7.measureWrappedHeight(this.field_T, -40 + this.widgetWidth, var7.maxAscent));
          }
          var8 = Cp1252CharacterSupport.loginUsernameEmail;
          var9 = NameEntryPopup.readLastLoginMethod(NanoTickClock.getApplet(76), 5137);
          if (var9 == SocialListEntry.field_Xb) {
            var8 = ReportAbuseDialog.loginEmail;
          } else {
            if (var9 == SocketArchiveNetworkClient.field_v) {
              var8 = QuickChatMenu.loginUsername;
            }
          }
          dupTemp$0 = new LabeledChildWidget(10, this.widgetY, -20 + this.widgetWidth, 25, this.usernameInput, false, 80, 3, var7, 16777215, var8);
          var11 = dupTemp$0;
          this.addChild(true, dupTemp$0);
          this.widgetY = this.widgetY + (((UiWidget) ((Object) var11)).widgetHeight + 5);
          dupTemp$1 = new LabeledChildWidget(10, this.widgetY, -20 + this.widgetWidth, 25, this.passwordInput, false, 80, 3, var7, 16777215, PolarBallSkin.createPassword);
          var12 = dupTemp$1;
          this.addChild(true, dupTemp$1);
          this.widgetY = this.widgetY + (5 + ((UiWidget) ((Object) var12)).widgetHeight);
          this.loginButton.listener = (WidgetListener) (this);
          if (this.createAccountButton != null) {
            this.createAccountButton.listener = (WidgetListener) (this);
          }
          if (this.secondaryButton != null) {
            this.secondaryButton.listener = (WidgetListener) (this);
          }
          if (this.createAccountButton == null) {
            this.loginButton.setWidgetBounds(this.widgetWidth - 6 - 10, 8, 30, false, this.widgetY);
            this.widgetY = this.widgetY + 35;
          } else {
            this.loginButton.setWidgetBounds(this.widgetWidth - 95, 85, 30, false, this.widgetY);
            this.widgetY = this.widgetY + 60;
          }
          if (null != this.createAccountButton) {
            this.createAccountButton.setWidgetBounds(-10 + this.widgetWidth - 6, 8, 30, false, this.widgetY);
            this.widgetY = this.widgetY + 35;
          }
          if (null != this.secondaryButton) {
            if (!this.field_P &&
              !this.field_O) {
              this.secondaryButton.setWidgetBounds(40, 8, 20, false, this.widgetY);
              this.widgetY = this.widgetY + 25;
            } else {
              this.secondaryButton.setWidgetBounds(-6 + this.widgetWidth - 10, 8, 30, false, this.widgetY);
              this.widgetY = this.widgetY + 35;
            }
          }
          this.setWidgetBounds(this.widgetWidth, 0, 3 + this.widgetY, false, 0);
          this.addChild(true, this.loginButton);
          if (this.createAccountButton != null) {
            this.addChild(true, this.createAccountButton);
          }
          if (null != this.secondaryButton) {
            this.addChild(true, this.secondaryButton);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ui.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.requestPreviousChildFocus(param3, 3);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_8_0 = this.requestNextChildFocus(param3, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ui.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void clearInputs(byte param0) {
        this.usernameInput.clearInputText(90);
        this.passwordInput.clearInputText(100);
        if (param0 > -21) {
          this.field_T = (String) null;
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5 = -3 % ((param1 + 42) / 53);
        if (null != this.field_T) {
          ValidationIconWidget.field_O.drawParagraph(this.field_T, 20 + (this.widgetX + param2), this.widgetY + (param3 + 15), this.widgetWidth - 40, this.widgetHeight, 16777215, -1, 1, 0, ValidationIconWidget.field_O.maxAscent);
        }
        if (null != this.createAccountButton) {
          SoftwareRasterizer.drawHorizontalLine(10 + param2, 134 + param3, -20 + this.widgetWidth, 4210752);
        }
        super.renderWidget(param0, (byte) 23, param2, param3);
    }

    public final void onTextInputChanged(TextInputWidget param0, int param1) {
        try {
          int var3_int = 100 / ((-43 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ui.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void submitLogin(int param0) {
        UiWidget var3;
        if (Base37Support.a(true) ||
          !(this.usernameInput.widgetText.length() <= 0) &&
          !(this.passwordInput.widgetText.length() <= 0)) {
          LoginForm.a((byte) 34, this.usernameInput.widgetText, this.passwordInput.widgetText);
        }
        if (param0 != -1) {
          var3 = (UiWidget) null;
          this.handleKeyInput('8', -107, true, (UiWidget) null);
        }
    }

    private final static void a(byte param0, String param1, String param2) {
        try {
          if (param0 != 34) {
            String var4 = (String) null;
            LoginForm.a((byte) -59, (String) null, (String) null);
          }
          HotspotRectangle.a(false, param1, -102, param2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ui.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 67) {
          return 14;
        }
        return PauseMenuScreen.c(16, -54264319, param0);
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4) {
        IntrusiveDequeCursor var5 = null;
        ChatMessageLine var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Pool.field_O;
        try {
          var5 = new IntrusiveDequeCursor(MatchingTextValidator.field_r);
          var6 = (ChatMessageLine) (var5.last((byte) -92));
          while (true) {
            if (var6 == null) {
              LabeledChildWidget.enqueueMessageLine(8, param0, param1, param3, param4);
              if (param2 != -6) {
                createOptinNewsTooltip = (String) null;
              }
              return;
            }
            if (var6.text != param0 &&
              !var6.text.equals(param0)) {
              var6 = (ChatMessageLine) (var5.previous(-84));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("ui.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        createOptinNewsTooltip = null;
        field_V = null;
        textRemovedFromGame = null;
        field_U = null;
        if (param0 != -31360) {
          return;
        }
        tutorialNineBallPottingNine = null;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pool.field_O;
        try {
          if (param3 != this.loginButton) {
            if (this.createAccountButton != param3) {
              if (this.secondaryButton == param3) {
                if (this.field_P) {
                  MidiNoteMixer.c(-119);
                } else {
                  if (!this.field_O) {
                    VerticalScrollbar.h(15158);
                  } else {
                    FullscreenFocusCanvas.a(true);
                  }
                }
              }
            } else {
              LoginRequiredScreen.showAccountCreationForm(35);
            }
          } else {
            this.submitLogin(-1);
          }
          if (!param0) {
            tutorialNineBallPottingNine = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ui.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
          java.net.URL var3 = null;
          java.applet.Applet var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = ModelInstance.a((byte) -61, var3, param1);
              AppletUrlSupport.openUrl(-10553, param1, var3.toString(), true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            if (param2) {
              var4 = (java.applet.Applet) null;
              LoginForm.a((String) null, (java.applet.Applet) null, true);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ui.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_U = new IntrusiveDeque();
        createOptinNewsTooltip = "Updates will sent to the email address you've given";
        tutorialNineBallPottingNine = "To win nine-ball pool, pot the 9 ball without fouling.";
        textRemovedFromGame = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
