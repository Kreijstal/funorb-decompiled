/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends DequeWidgetContainer implements EditableTextWidgetListener, WidgetActivationListener {
    private boolean showRegistration;
    private InteractiveWidget submitButton;
    private EditableTextWidget accountInput;
    static int field_E;
    static int field_T;
    private InteractiveWidget navigationButton;
    static int field_M;
    private InteractiveWidget registerButton;
    private boolean retryMode;
    private String description;
    private EditableTextWidget passwordInput;
    private boolean offerGuestPlay;
    static ClientUiComponent field_K;

    final void setAccountAndClearPassword(int obfuscationGuard, String accountIdentifier) {
        EditableTextWidget accountField = null;
        String newAccountIdentifier = null;
        try {
          accountField = this.accountInput;
          newAccountIdentifier = accountIdentifier;
          accountField.setText(false, newAccountIdentifier, -27934);
          if (obfuscationGuard != -17376) {
            this.submitButton = (InteractiveWidget) null;
          }
          this.passwordInput.clearText(110);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "df.GA(" + obfuscationGuard + ',' + (accountIdentifier != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 > -52) {
            LoginForm.a(84);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "df.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    LoginForm(String accountIdentifier, String description, boolean retryMode, boolean showRegistration, boolean offerGuestPlay) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        LabeledWidgetContainer accountRowAlias = null;
        LabeledWidgetContainer passwordRowAlias = null;
        boolean registrationFlag = false;
        boolean guestPlayFlag = false;
        boolean retryFlag = false;
        InteractiveWidget discardedButtonA = null;
        InteractiveWidget discardedButtonB = null;
        InteractiveWidget discardedButtonC = null;
        InteractiveWidget discardedButtonD = null;
        String navigationText = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String accountDescription = null;
        StringBuilder errorContextWithAccount = null;
        String descriptionPresence = null;
        RuntimeException caughtFailure = null;
        SpriteButtonPainter buttonPainter = null;
        RuntimeException failure = null;
        BitmapFont font = null;
        String accountLabel = null;
        LoginMethod lastLoginMethod = null;
        LabeledWidgetContainer accountRow = null;
        LabeledWidgetContainer passwordRow = null;
        try {
          registrationFlag = (showRegistration);
          this.showRegistration = registrationFlag;
          guestPlayFlag = (offerGuestPlay);
          this.offerGuestPlay = guestPlayFlag;
          retryFlag = (retryMode);
          this.retryMode = retryFlag;
          this.description = description;
          if (this.retryMode && (this.showRegistration ||
            this.offerGuestPlay)) {
            throw new IllegalStateException();
          }
          this.accountInput = (EditableTextWidget) ((Object) new ValidatedTextWidget(accountIdentifier, (WidgetListener) (this), 100));
          this.passwordInput = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) (this), 20));
          if (!this.retryMode) {
            this.submitButton = new InteractiveWidget(ResourceRequest.field_v, (WidgetListener) null);
            discardedButtonA = null;
            discardedButtonB = null;
            if (!this.offerGuestPlay) {
              discardedButtonC = null;
              discardedButtonD = null;
              navigationText = fj.field_a;
            } else {
              discardedButtonC = null;
              discardedButtonD = null;
              navigationText = pi.field_O;
            }
            this.navigationButton = new InteractiveWidget(navigationText, (WidgetListener) null);
            if (this.showRegistration) {
              this.registerButton = new InteractiveWidget(li.field_p, (WidgetListener) (this));
            }
          } else {
            this.submitButton = new InteractiveWidget(RegionAnchor.field_k, (WidgetListener) null);
            this.navigationButton = new InteractiveWidget(dt.field_c, (WidgetListener) null);
            this.accountInput.enabled = false;
          }
          this.accountInput.painter = (WidgetPainter) ((Object) new TextEntryWidgetPainter(10000536));
          this.passwordInput.painter = (WidgetPainter) ((Object) new MaskedTextEntryPainter(10000536));
          buttonPainter = new SpriteButtonPainter();
          this.submitButton.painter = (WidgetPainter) ((Object) buttonPainter);
          if (this.navigationButton != null) {
            this.navigationButton.painter = (WidgetPainter) ((Object) buttonPainter);
          }
          if (this.registerButton != null) {
            this.registerButton.painter = (WidgetPainter) ((Object) buttonPainter);
          }
          this.accountInput.tooltipText = de.field_d;
          if (null != this.registerButton) {
            this.registerButton.tooltipText = hb.field_b;
          }
          if (!this.retryMode) {
            if (this.offerGuestPlay) {
              this.navigationButton.tooltipText = CombatSandbox.field_e;
              this.navigationButton.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
            } else {
              this.navigationButton.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
            }
          } else {
            this.navigationButton.tooltipText = VineGrowthAction.field_v;
          }
          this.y = 15;
          font = ArmiesOfGielinor.field_J;
          if (null != this.description) {
            this.y = this.y + (5 + font.getParagraphHeight(this.description, this.width - 40, font.maxAscent));
          }
          accountLabel = AlphaWidgetContainer.field_J;
          lastLoginMethod = CommunityTabGroup.readLastLoginMethod(0, CombatEvent.d((byte) 34));
          if (lastLoginMethod != CombatSandbox.emailLoginMethod) {
            if (lastLoginMethod == ps.usernameLoginMethod) {
              accountLabel = DualNodeDeque.field_h;
            }
          } else {
            accountLabel = DeployAction.field_t;
          }
          accountRowAlias = new LabeledWidgetContainer(10, this.y, this.width - 20, 25, this.accountInput, false, 80, 3, font, 16777215, accountLabel);
          accountRow = accountRowAlias;
          this.addChild((byte) 10, (Widget) (accountRowAlias));
          this.y = this.y + (((Widget) ((Object) accountRow)).height + 5);
          passwordRowAlias = new LabeledWidgetContainer(10, this.y, -20 + this.width, 25, this.passwordInput, false, 80, 3, font, 16777215, jj.field_h);
          passwordRow = passwordRowAlias;
          this.addChild((byte) 10, (Widget) (passwordRowAlias));
          this.submitButton.listener = (WidgetListener) (this);
          this.y = this.y + (5 + ((Widget) ((Object) passwordRow)).height);
          if (this.registerButton != null) {
            this.registerButton.listener = (WidgetListener) (this);
          }
          if (this.navigationButton != null) {
            this.navigationButton.listener = (WidgetListener) (this);
          }
          if (null == this.registerButton) {
            this.submitButton.setBounds(8, -10 + (this.width - 6), this.y, 8192, 30);
            this.y = this.y + 35;
          } else {
            this.submitButton.setBounds(85, this.width - 95, this.y, 8192, 30);
            this.y = this.y + 60;
          }
          if (null != this.registerButton) {
            this.registerButton.setBounds(8, -10 + (this.width - 6), this.y, 8192, 30);
            this.y = this.y + 35;
          }
          if (this.navigationButton != null) {
            if (!this.retryMode &&
              !this.offerGuestPlay) {
              this.navigationButton.setBounds(8, 40, this.y, 8192, 20);
              this.y = this.y + 25;
            } else {
              this.navigationButton.setBounds(8, -16 + this.width, this.y, 8192, 30);
              this.y = this.y + 35;
            }
          }
          this.setBounds(0, this.width, 0, 8192, 3 + this.y);
          this.addChild((byte) 10, (Widget) (this.submitButton));
          if (this.registerButton != null) {
            this.addChild((byte) 10, (Widget) (this.registerButton));
          }
          if (this.navigationButton != null) {
            this.addChild((byte) 10, (Widget) (this.navigationButton));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("df.<init>(");
          if (accountIdentifier == null) {
            accountDescription = "null";
          } else {
            accountDescription = "{...}";
          }
          errorContextWithAccount = ((StringBuilder) (Object) errorContext).append(accountDescription).append(',');
          if (description == null) {
            descriptionPresence = "null";
          } else {
            descriptionPresence = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithAccount).append(descriptionPresence).append(',').append(retryMode).append(',').append(showRegistration).append(',').append(offerGuestPlay).append(')').toString());
        }
    }

    public final void textSubmitted(EditableTextWidget widget, int obfuscationGuard) {
        EditableTextWidget guardWidget = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (this.accountInput == widget) {
            this.passwordInput.takeFocus(11, (Widget) (this));
          }
          if (obfuscationGuard != 80) {
            guardWidget = (EditableTextWidget) null;
            this.textSubmitted((EditableTextWidget) null, -76);
          }
          if (this.passwordInput == widget) {
            this.submitCredentials(false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("df.EA(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (obfuscationGuard > -82) {
          LoginForm.a(-77);
        }
        if (null != this.description) {
          ArmiesOfGielinor.field_J.drawParagraph(this.description, originX - (-this.x - 20), 15 + originY + this.y, -40 + this.width, this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
        }
        if (this.registerButton != null) {
          SoftwareRaster.e(10 + originX, 134 + originY, -20 + this.width, 4210752);
        }
        super.drawWidget(originX, originY, (byte) -104, renderLayer);
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int obfuscationControl = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 11) {
            this.getAccountIdentifier(64);
          }
          if (this.submitButton != widget) {
            if (this.registerButton != widget) {
              if (widget == this.navigationButton) {
                if (this.retryMode) {
                  IntPair.e(17);
                } else {
                  if (!this.offerGuestPlay) {
                    QuickChatCommandDefinition.a(obfuscationGuard ^ 26573);
                  } else {
                    PrintCoatConsoleCommand.showGuestPlayConfirmation(89);
                  }
                }
              }
            } else {
              ConsoleTextNode.showAccountRegistration(false);
            }
          } else {
            this.submitCredentials(false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("df.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_K = null;
    }

    private final static boolean allowsEmptyCredentials(int obfuscationGuard) {
        if (obfuscationGuard != 30) {
          LoginForm.allowsEmptyCredentials(105);
        }
        return fh.field_i;
    }

    public final void textChanged(EditableTextWidget widget, int obfuscationGuard) {
        try {
          int guardRemainder = 14 % ((obfuscationGuard + 80) / 33);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "df.FA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != -20) {
          String var2 = (String) null;
          LoginForm.a((String) null, -20, (ResourceArchive) null, -114, (String) null);
        }
        MoveEvent.campaignMenu = new CampaignMenu();
        EquipmentBattleTutorial.configureTutorialStage(30, 21, 220, 420, 440, 470, new int[]{7}, -121);
        EquipmentBattleTutorial.configureTutorialStage(30, 22, 490, 610, 20, 50, new int[]{47}, param0 - 55);
    }

    final String getAccountIdentifier(int obfuscationGuard) {
        if (this.accountInput.text == null) {
          return "";
        }
        if (obfuscationGuard != -15056) {
          return (String) null;
        }
        return this.accountInput.text;
    }

    private final void submitCredentials(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return;
        }
        if (LoginForm.allowsEmptyCredentials(30) ||
          !(0 >= this.accountInput.text.length()) &&
          !(0 >= this.passwordInput.text.length())) {
          CampaignProgress.beginCredentialLogin(this.passwordInput.text, 0, this.accountInput.text);
        }
    }

    final static void l(int param0) {
        hf.field_a = param0;
    }

    final static String a(String param0, int param1, ResourceArchive param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -27638) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param2.ensureIndex((byte) 82)) {
            stackIn_6_0 = (String) (param4);
            return stackIn_6_0;
          }
          stackIn_8_0 = param0 + " - " + param2.getGroupProgress(param1, (byte) 73) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("df.U(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void clearCredentials(byte obfuscationGuard) {
        this.accountInput.clearText(104);
        if (obfuscationGuard >= -2) {
          return;
        }
        this.passwordInput.clearText(-79);
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException failure = null;
        boolean previousFocused = false;
        boolean nextFocused = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return true;
          }
          if (98 == keyCode) {
            previousFocused = this.focusPreviousChild(false, rootWidget);
            return previousFocused;
          }
          if (keyCode != 99) {
            return false;
          }
          nextFocused = this.focusNextChild((byte) -128, rootWidget);
          return nextFocused;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("df.F(");
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
