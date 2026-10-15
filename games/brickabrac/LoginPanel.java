/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends WidgetGroup implements TextFieldListener, WidgetActionListener {
    static String field_L;
    static RgbSprite waterMidSprite;
    private String introMessage;
    static boolean field_R;
    private FocusableWidget backOrGuestButton;
    private FocusableWidget createAccountButton;
    private boolean showCreateAccountButton;
    private boolean retryMode;
    private FocusableWidget loginButton;
    static RgbSprite arcticFarSprite;
    private TextFieldWidget accountField;
    static int field_W;
    static String field_J;
    private boolean showGuestPlayButton;
    private TextFieldWidget passwordField;

    final static void a(byte param0) {
        if (MatchResultScreen.field_t != -BoundedFile.field_i + 0 &&
          -BoundedFile.field_i + 250 != MatchResultScreen.field_t) {
        }
        MatchResultScreen.field_t = MatchResultScreen.field_t + 1;
        int var1 = -127 / ((29 - param0) / 32);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (this.introMessage != null) {
          ArchiveNetworkClient.field_u.drawParagraph(this.introMessage, this.x + (parentX + 20), parentY - (-this.y - 15), -40 + this.width, this.height, 16777215, -1, 1, 0, ArchiveNetworkClient.field_u.ascent);
        }
        if (null != this.createAccountButton) {
          Rasterizer2D.drawHorizontalLine(parentX + 10, parentY + 134, this.width - 20, 4210752);
        }
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_7_0 = this.b(focusRoot, (byte) -78);
            return stackIn_7_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_11_0 = this.a(focusRoot, (byte) -122);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("hk.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(character).append(')').toString());
        }
    }

    final static void a(TextFont param0, byte param1, ResourceArchive param2) {
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        QuickChatCategoryDefinition var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        TextFont var10 = null;
        int[] var14 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = LoginCredentialKind.field_e;
          QuickChatPhraseDefinition.quickChatMenuRoot = new UiComponent(0L, (UiComponent) null);
          if (param2 == null) {
            AlignedIconLabel.a("QC1", (Throwable) null, param1 ^ 118);
            return;
          }
          param2.decodedFilePolicy = 0;
          param2.discardPackedGroups = false;
          DebouncedValidationSource.quickChatCategories = new QuickChatCategoryRegistry(var3_int, param2, param2);
          nh.quickChatPhrases = new QuickChatPhraseRegistry(var3_int, param2, param2, new rm());
          var4 = gj.findRootQuickChatCategory(0);
          if (var4 == null) {
            AlignedIconLabel.a("QC2", (Throwable) null, param1 - 14);
            return;
          }
          ResourceRequest.setQuickChatHelpEntry(var4, false);
          var10 = (TextFont) null;
          ArchiveIndex.field_j = DateInputWidget.a(1513239, 1127256, (byte) 123, 65793, 4020342, 5138823, 65793, 1513239, (TextFont) null, 0, 65793, 2245737, 8947848);
          SoftwareFramebuffer.field_e = DateInputWidget.a(0, 0, (byte) 122, 0, 0, 0, 0, 0, param0, 16764006, 0, 0, 0);
          WidgetLayerStack.field_K = DateInputWidget.a(0, 0, (byte) 113, 0, 0, 0, 0, 0, param0, 16777215, 0, 0, 0);
          var5 = Rasterizer2D.width;
          var6 = Rasterizer2D.height;
          var14 = Rasterizer2D.pixels;
          uf.field_e = new RgbSprite(10, 14);
          uf.field_e.bindRasterTarget();
          for (var8 = 2; 7 > var8; var8++) {
            Rasterizer2D.drawVerticalLine(var8, var8 + 1, 14 - (var8 << 1), 16777215);
          }
          if (param1 != 90) {
            LoginPanel.i((byte) 86);
          }
          Rasterizer2D.bind(var14, var5, var6);
          ContentTransitionLayer.field_kb = AchievementSubmission.buildQuickChatCategoryMenu(SoftwareFramebuffer.field_e, ArchiveIndex.field_j, var4, 4, WidgetLayerStack.field_K);
          QuickChatPhraseDefinition.quickChatMenuRoot.children = new NodeDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("hk.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final void onSubmitted(TextFieldWidget textField, int obfuscationGuard) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.accountField == textField) {
            this.passwordField.tryFocus(true, (Widget) (this));
          }
          if (textField == this.passwordField) {
            this.submitLogin(25);
          }
          if (obfuscationGuard != -40) {
            this.drawLayer(-38, -29, -91, (byte) 20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hk.H(");
          if (textField == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String getAccount(byte obfuscationGuard) {
        if (obfuscationGuard != -76) {
          String var3 = (String) null;
          this.setAccountAndClearPassword(113, (String) null);
        }
        if (null != this.accountField.text) {
          return this.accountField.text;
        }
        return "";
    }

    final void setAccountAndClearPassword(int obfuscationGuard, String account) {
        TextFieldWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.accountField;
          var4 = account;
          if (obfuscationGuard < 53) {
            this.clearCredentials(-119);
          }
          var3.setText(var4, -12592, false);
          this.passwordField.clearText(false);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hk.B(" + obfuscationGuard + ',' + (account != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeMenuScreens(byte obfuscationGuard, ResourceArchive archive) {
        try {
          DelayedPacket.menuScreens = new MenuScreen[22];
          GameCanvas.registerMenuScreen(-74, new MainMenuScreen());
          GameCanvas.registerMenuScreen(-68, cf.createPauseMenu(1, -2635));
          GameCanvas.registerMenuScreen(-90, cf.createPauseMenu(2, -2635));
          GameCanvas.registerMenuScreen(-111, cf.createPauseMenu(3, -2635));
          GameCanvas.registerMenuScreen(-109, cf.createPauseMenu(4, -2635));
          GameCanvas.registerMenuScreen(-93, new HighscoresScreen());
          GameCanvas.registerMenuScreen(-114, new RankingsScreen());
          GameCanvas.registerMenuScreen(-114, new InstructionsScreen());
          GameCanvas.registerMenuScreen(-104, new AchievementsScreen());
          GameCanvas.registerMenuScreen(-66, new NewAchievementsScreen());
          GameCanvas.registerMenuScreen(-55, new SaveResultsPromptScreen());
          GameCanvas.registerMenuScreen(-75, new MessageScreen());
          GameCanvas.registerMenuScreen(-63, new MembershipBenefitsScreen(archive));
          GameCanvas.registerMenuScreen(-60, new LevelSelectScreen(13, 0));
          GameCanvas.registerMenuScreen(-105, new OptionsScreen());
          GameCanvas.registerMenuScreen(-69, new LevelSelectScreen(15, 1));
          GameCanvas.registerMenuScreen(-71, new LevelPackSelectScreen());
          GameCanvas.registerMenuScreen(-54, cf.createPauseMenu(17, -2635));
          GameCanvas.registerMenuScreen(-70, new LevelCompleteScreen());
          GameCanvas.registerMenuScreen(-63, new MultiplayerExitScreen());
          GameCanvas.registerMenuScreen(-91, new MatchCompleteScreen());
          int var2_int = -5 / ((obfuscationGuard - 70) / 42);
          GameCanvas.registerMenuScreen(-73, new TimedSplashScreen());
          IntrusiveHashTable.field_k = rd.selectBackground(0, (byte) 19);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hk.E(" + obfuscationGuard + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(TextFieldWidget textField, byte obfuscationGuard) {
        try {
          if (obfuscationGuard >= -39) {
            this.clearCredentials(68);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hk.I(" + (textField != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(int param0, byte param1) {
        kd.field_c = FullscreenFailureKind.field_f[param0];
        int var2 = -14 % ((param1 + 33) / 34);
        wn.field_a = GameplayRenderHelpers.field_b[param0];
        FocusableWidget.field_C = AccountIntroductionPanel.field_L[param0];
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard > -22) {
            this.createAccountButton = (FocusableWidget) null;
          }
          if (this.loginButton != widget) {
            if (this.createAccountButton != widget) {
              if (widget == this.backOrGuestButton) {
                if (!this.retryMode) {
                  if (this.showGuestPlayButton) {
                    ln.a(-107);
                  } else {
                    ResourceRequest.g(29);
                  }
                } else {
                  MultiValueSliderRenderer.a(true);
                }
              }
            } else {
              Mesh3D.d(-1);
            }
          } else {
            this.submitLogin(25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("hk.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 >= 4) {
          var1 = ContextActionController.field_g.measureText(ArrayWidgetGroup.buttonLabels[20]);
          var2 = ContextActionController.field_g.measureText(ArrayWidgetGroup.buttonLabels[21]);
          MultiValueSliderRenderer.field_d = (var2 >= var1 ? var2 : var1) + 4;
          QuickChatMenu.field_Zb = QuickChatMenu.field_Zb + (MultiValueSliderRenderer.field_d + 120);
          return;
        }
    }

    LoginPanel(String account, String introMessage, boolean retryMode, boolean showCreateAccountButton, boolean showGuestPlayButton) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledWidget dupTemp$0 = null;
        LabeledWidget dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        FocusableWidget stackIn_18_1 = null;
        FocusableWidget stackIn_18_2 = null;
        FocusableWidget stackIn_19_1 = null;
        FocusableWidget stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ButtonWidgetRenderer var6 = null;
        RuntimeException var6_ref = null;
        TextFont var7 = null;
        String var8 = null;
        LoginMethodPreference var9 = null;
        LabeledWidget var12 = null;
        LabeledWidget var13 = null;
        try {
          stackIn_4_1 = (showGuestPlayButton);
          this.showGuestPlayButton = stackIn_4_1;
          stackIn_7_1 = (showCreateAccountButton);
          this.showCreateAccountButton = stackIn_7_1;
          stackIn_10_1 = (retryMode);
          this.retryMode = stackIn_10_1;
          this.introMessage = introMessage;
          if (this.retryMode && (this.showCreateAccountButton ||
            this.showGuestPlayButton)) {
            throw new IllegalStateException();
          }
          this.accountField = (TextFieldWidget) ((Object) new ValidatedTextFieldWidget(account, (WidgetListener) (this), 100));
          this.passwordField = (TextFieldWidget) ((Object) new ValidatedTextFieldWidget("", (WidgetListener) (this), 20));
          if (!this.retryMode) {
            this.loginButton = new FocusableWidget(ok.field_a, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.showGuestPlayButton) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = HalloweenBackground.field_s;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = nd.field_d;
            }
            this.backOrGuestButton = new FocusableWidget(stackIn_19_3, (WidgetListener) null);
            if (this.showCreateAccountButton) {
              this.createAccountButton = new FocusableWidget(CheckboxWidgetRenderer.field_a, (WidgetListener) (this));
            }
          } else {
            this.loginButton = new FocusableWidget(TabbedPane.field_Tb, (WidgetListener) null);
            this.backOrGuestButton = new FocusableWidget(wc.field_a, (WidgetListener) null);
            this.accountField.enabled = false;
          }
          this.accountField.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
          this.passwordField.renderer = (WidgetRenderer) ((Object) new PasswordFieldRenderer(10000536));
          var6 = new ButtonWidgetRenderer();
          this.loginButton.renderer = (WidgetRenderer) ((Object) var6);
          if (null != this.backOrGuestButton) {
            this.backOrGuestButton.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.accountField.tooltip = ValidatedTextFieldWidget.field_X;
          if (this.createAccountButton != null) {
            this.createAccountButton.tooltip = MidiSynthesizer.field_q;
          }
          if (this.retryMode) {
            this.backOrGuestButton.tooltip = LevelResultSubmission.field_o;
          } else {
            if (this.showGuestPlayButton) {
              this.backOrGuestButton.tooltip = SoundCache.field_i;
              this.backOrGuestButton.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
            } else {
              this.backOrGuestButton.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
            }
          }
          this.y = 15;
          var7 = ArchiveNetworkClient.field_u;
          if (this.introMessage != null) {
            this.y = this.y + (5 + var7.measureWrappedHeight(this.introMessage, -40 + this.width, var7.ascent));
          }
          var8 = PlayerInputBatch.field_p;
          var9 = MultiValueSliderWidget.a(EmailConfirmationValidator.e((byte) -115), -28432);
          if (EmailConfirmationValidator.field_k == var9) {
            var8 = sq.field_a;
          } else {
            if (ll.field_d == var9) {
              var8 = IndexedSpriteGeometry.field_c;
            }
          }
          dupTemp$0 = new LabeledWidget(10, this.y, this.width - 20, 25, this.accountField, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, true);
          this.y = this.y + (5 + ((Widget) ((Object) var12)).height);
          dupTemp$1 = new LabeledWidget(10, this.y, this.width - 20, 25, this.passwordField, false, 80, 3, var7, 16777215, wc.field_c);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, true);
          this.loginButton.listener = (WidgetListener) (this);
          this.y = this.y + (5 + ((Widget) ((Object) var13)).height);
          if (null != this.createAccountButton) {
            this.createAccountButton.listener = (WidgetListener) (this);
          }
          if (this.backOrGuestButton != null) {
            this.backOrGuestButton.listener = (WidgetListener) (this);
          }
          if (null == this.createAccountButton) {
            this.loginButton.setBounds(30, 8, this.y, (byte) -119, this.width - 16);
            this.y = this.y + 35;
          } else {
            this.loginButton.setBounds(30, 85, this.y, (byte) -119, -95 + this.width);
            this.y = this.y + 60;
          }
          if (null != this.createAccountButton) {
            this.createAccountButton.setBounds(30, 8, this.y, (byte) -119, -6 + this.width - 10);
            this.y = this.y + 35;
          }
          if (null != this.backOrGuestButton) {
            if (!this.retryMode &&
              !this.showGuestPlayButton) {
              this.backOrGuestButton.setBounds(20, 8, this.y, (byte) -119, 40);
              this.y = this.y + 25;
            } else {
              this.backOrGuestButton.setBounds(30, 8, this.y, (byte) -119, -10 + (this.width - 6));
              this.y = this.y + 35;
            }
          }
          this.setBounds(this.y + 3, 0, 0, (byte) -119, this.width);
          this.addChild(this.loginButton, true);
          if (null != this.createAccountButton) {
            this.addChild(this.createAccountButton, true);
          }
          if (this.backOrGuestButton != null) {
            this.addChild(this.backOrGuestButton, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("hk.<init>(");
          if (account == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (introMessage == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(retryMode).append(',').append(showCreateAccountButton).append(',').append(showGuestPlayButton).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_J = null;
        if (param0 != 88) {
          return;
        }
        arcticFarSprite = null;
        waterMidSprite = null;
        field_L = null;
    }

    private final void submitLogin(int obfuscationGuard) {
        if (Mesh3D.a((byte) 114) ||
          !(this.accountField.text.length() <= 0) &&
          !(0 >= this.passwordField.text.length())) {
          HighscoresScreen.a(this.accountField.text, 11455, this.passwordField.text);
        }
        if (obfuscationGuard != 25) {
          this.createAccountButton = (FocusableWidget) null;
        }
    }

    final void clearCredentials(int obfuscationGuard) {
        if (obfuscationGuard >= -101) {
          FocusableWidget var3 = (FocusableWidget) null;
          this.onAction(64, -27, (byte) 58, 71, (FocusableWidget) null);
        }
        this.accountField.clearText(false);
        this.passwordField.clearText(false);
    }

    static {
        field_L = "Options";
        field_J = "Add friend";
        field_W = 0;
    }
}
