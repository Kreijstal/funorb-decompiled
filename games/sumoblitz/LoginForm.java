/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends WidgetContainer implements TextInputListener, WidgetActionListener {
    static TextureCombineOperation ADD;
    private InteractiveWidget loginButton;
    static int[] field_G;
    private TextInputWidget identifierInput;
    private boolean allowGuestPlay;
    private TextInputWidget passwordInput;
    private String messageText;
    private InteractiveWidget field_N;
    static int field_E;
    private InteractiveWidget createAccountButton;
    private boolean allowSignup;
    static int field_O;
    private boolean reconnecting;

    public final void onTextSubmitted(TextInputWidget source, int guard) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.identifierInput == source) {
            this.passwordInput.requestFocus((UiWidget) (this), (byte) 61);
          }
          if (source == this.passwordInput) {
            this.submitLogin((byte) -23);
          }
          if (guard >= -41) {
            this.renderLayer(51, -15, (byte) 12, 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cv.H(");
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 710) {
            this.identifierInput = (TextInputWidget) null;
          }
          if (source == this.loginButton) {
            this.submitLogin((byte) -23);
          } else {
            if (this.createAccountButton == source) {
              AccountCreationNavigation.showAccountCreation((byte) 58);
            } else {
              if (this.field_N == source) {
                if (this.reconnecting) {
                  TimedSceneEffect.c(guard ^ 710);
                } else {
                  if (this.allowGuestPlay) {
                    LoginCredentialType.showAccountSignupPrompt(true);
                  } else {
                    pi.a((byte) -110);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("cv.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (null != this.messageText) {
          TextCaretLayout.field_b.drawParagraph(this.messageText, 20 + (this.x + parentX), parentY + this.y + 15, this.width - 40, this.height, 16777215, -1, 1, 0, TextCaretLayout.field_b.ascent);
        }
        if (guard >= -35) {
          this.identifierInput = (TextInputWidget) null;
        }
        if (null != this.createAccountButton) {
          SoftwareRasterizer.drawHorizontalLine(parentX + 10, parentY + 134, -20 + this.width, 4210752);
        }
        super.renderLayer(parentX, parentY, (byte) -59, layer);
    }

    LoginForm(String identifier, String message, boolean reconnecting, boolean allowSignup, boolean allowGuestPlay) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledWidget dupTemp$0 = null;
        LabeledWidget dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        InteractiveWidget stackIn_18_1 = null;
        InteractiveWidget stackIn_18_2 = null;
        InteractiveWidget stackIn_19_1 = null;
        InteractiveWidget stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpriteStripButtonRenderer var6 = null;
        RuntimeException var6_ref = null;
        LegacyBitmapFont var7 = null;
        String var8 = null;
        LoginMethodPreference var9 = null;
        LabeledWidget var12 = null;
        LabeledWidget var13 = null;
        try {
          stackIn_4_1 = (reconnecting);
          this.reconnecting = stackIn_4_1;
          stackIn_7_1 = (allowSignup);
          this.allowSignup = stackIn_7_1;
          this.messageText = message;
          stackIn_10_1 = (allowGuestPlay);
          this.allowGuestPlay = stackIn_10_1;
          if (this.reconnecting && (this.allowSignup ||
            this.allowGuestPlay)) {
            throw new IllegalStateException();
          }
          this.identifierInput = (TextInputWidget) ((Object) new ValidatedTextInputWidget(identifier, (WidgetListener) (this), 100));
          this.passwordInput = (TextInputWidget) ((Object) new ValidatedTextInputWidget("", (WidgetListener) (this), 20));
          if (!this.reconnecting) {
            this.loginButton = new InteractiveWidget(LoginTextResources.logInText, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.allowGuestPlay) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = EmptyWidgetRenderer.field_b;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = FullscreenCanvas.backText;
            }
            this.field_N = new InteractiveWidget(stackIn_19_3, (WidgetListener) null);
            if (this.allowSignup) {
              this.createAccountButton = new InteractiveWidget(IntrusiveNode.createAFreeAccountText, (WidgetListener) (this));
            }
          } else {
            this.loginButton = new InteractiveWidget(AppletFocusState.retryText, (WidgetListener) null);
            this.field_N = new InteractiveWidget(HiscoreRequest.quitToWebsiteText, (WidgetListener) null);
            this.identifierInput.enabled = false;
          }
          this.identifierInput.renderer = (WidgetRenderer) ((Object) new BeveledTextInputRenderer(10000536));
          this.passwordInput.renderer = (WidgetRenderer) ((Object) new PasswordInputRenderer(10000536));
          var6 = new SpriteStripButtonRenderer();
          this.loginButton.renderer = (WidgetRenderer) ((Object) var6);
          if (this.field_N != null) {
            this.field_N.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.identifierInput.tooltip = SocialContact.theAccountNameYouText;
          if (null != this.createAccountButton) {
            this.createAccountButton.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (null != this.createAccountButton) {
            this.createAccountButton.tooltip = DroneDebris.createYourOwnFreeText;
          }
          if (this.reconnecting) {
            this.field_N.tooltip = AccountCreationNavigation.warningIfYouQuitText;
          } else {
            if (!this.allowGuestPlay) {
              this.field_N.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
            } else {
              this.field_N.tooltip = GameProgressUpdate.playTheGameWithoutText;
              this.field_N.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
            }
          }
          this.y = 15;
          var7 = TextCaretLayout.field_b;
          if (this.messageText != null) {
            this.y = this.y + (var7.wrappedHeight(this.messageText, -40 + this.width, var7.ascent) + 5);
          }
          var8 = OpenGlEnvironmentWaterEffect.loginText;
          var9 = LegacyOpenGlEnvironmentWaterEffect.a(LegacyOpenGlUnlitEffect.c(2), 1);
          if (OpenGlTexture3D.field_m != var9) {
            if (LevelSelectScreen.field_j == var9) {
              var8 = LruNodeCache.usernameText;
            }
          } else {
            var8 = HuffmanDecoder.emailText;
          }
          dupTemp$0 = new LabeledWidget(10, this.y, this.width - 20, 25, this.identifierInput, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, 80);
          this.y = this.y + (((UiWidget) ((Object) var12)).height + 5);
          dupTemp$1 = new LabeledWidget(10, this.y, -20 + this.width, 25, this.passwordInput, false, 80, 3, var7, 16777215, pi.passwordText);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, 107);
          this.y = this.y + (((UiWidget) ((Object) var13)).height + 5);
          this.loginButton.listener = (WidgetListener) (this);
          if (this.createAccountButton != null) {
            this.createAccountButton.listener = (WidgetListener) (this);
          }
          if (this.field_N != null) {
            this.field_N.listener = (WidgetListener) (this);
          }
          if (null != this.createAccountButton) {
            this.loginButton.setBounds(-123, 85, this.y, 30, this.width - 95);
            this.y = this.y + 60;
          } else {
            this.loginButton.setBounds(120, 8, this.y, 30, -16 + this.width);
            this.y = this.y + 35;
          }
          if (null != this.createAccountButton) {
            this.createAccountButton.setBounds(111, 8, this.y, 30, -6 + (this.width - 10));
            this.y = this.y + 35;
          }
          if (this.field_N != null) {
            if (!this.reconnecting &&
              !this.allowGuestPlay) {
              this.field_N.setBounds(-110, 8, this.y, 20, 40);
              this.y = this.y + 25;
            } else {
              this.field_N.setBounds(126, 8, this.y, 30, this.width - 16);
              this.y = this.y + 35;
            }
          }
          this.setBounds(-48, 0, 0, this.y + 3, this.width);
          this.addChild(this.loginButton, 84);
          if (null != this.createAccountButton) {
            this.addChild(this.createAccountButton, 127);
          }
          if (null != this.field_N) {
            this.addChild(this.field_N, 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("cv.<init>(");
          if (identifier == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (message == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(reconnecting).append(',').append(allowSignup).append(',').append(allowGuestPlay).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_G = null;
        if (param0 >= -116) {
          return;
        }
        ADD = null;
    }

    final static int soundOutputBufferSize(boolean guard) {
        if (guard) {
          field_O = -86;
        }
        return IntrusiveDequeCursor.field_c;
    }

    final void clearCredentials(int guard) {
        this.identifierInput.clearText(-1);
        this.passwordInput.clearText(-1);
        if (guard >= -76) {
          this.identifierInput = (TextInputWidget) null;
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 9) {
            return false;
          }
          if (super.onKey(root, character, (byte) 63, keyCode)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_9_0 = this.focusPrevious((byte) -104, root);
            return stackIn_9_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_12_0 = this.focusNext(root, false);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("cv.KA(");
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final void submitLogin(byte guard) {
        if (oi.isReconnecting((byte) -64) ||
          !(this.identifierInput.text.length() <= 0) &&
          !(this.passwordInput.text.length() <= 0)) {
          ProgressDialog.beginLogin(this.passwordInput.text, this.identifierInput.text, -1807);
        }
        if (guard != -23) {
          this.createAccountButton = (InteractiveWidget) null;
        }
    }

    public final void onTextChanged(TextInputWidget source, byte guard) {
        try {
          if (guard > -127) {
            this.loginButton = (InteractiveWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cv.I(" + (source != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void a(int param0, String param1) {
        TextInputWidget var3 = null;
        String var4 = null;
        try {
          if (param0 != -3499) {
            TextInputWidget var5 = (TextInputWidget) null;
            this.onTextSubmitted((TextInputWidget) null, 89);
          }
          var3 = this.identifierInput;
          var4 = param1;
          var3.setText(false, var4, (byte) 67);
          this.passwordInput.clearText(param0 + 3498);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cv.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String identifier(byte guard) {
        if (this.identifierInput.text == null) {
          return "";
        }
        int var2 = -85 % ((-35 - guard) / 59);
        return this.identifierInput.text;
    }

    static {
        field_G = new int[128];
        ADD = new TextureCombineOperation();
        field_O = 480;
    }
}
