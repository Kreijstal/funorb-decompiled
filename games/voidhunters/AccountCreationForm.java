/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends UiContainer implements UiHotspotListener, UiActionListener, NameSuggestionTarget {
    private UiFocusableComponent cancelButton;
    private HotspotTextWidget legalText;
    private ValidatedTextField usernameField;
    private ValidatedTextField passwordConfirmationField;
    private ValidatedTextField passwordField;
    private ValidatedTextField emailConfirmationField;
    static String field_G;
    NameSuggestionsPanel nameSuggestions;
    private ValidatedTextField ageField;
    private UiToggleButton emailUpdatesToggle;
    private UiFocusableComponent submitButton;
    private ValidatedTextField emailField;

    private final int addFieldWithHelp(int param0, String param1, int param2, String param3, int param4, UiComponent param5) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -40) {
            discarded$1 = this.submitAccountCreation(45);
          }
          stackIn_3_0 = this.addFieldWithHelp(param5, param4, param2, param3, false, 35, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("rq.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int addFieldRow(UiComponent param0, int param1, String param2, int param3, byte param4) {
        LabeledInputContainer var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledInputContainer(20, param1, param3 + 120, 25, param0, false, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param2);
          this.addChild(-18756, var6);
          if (param4 > -27) {
            var7 = (String) null;
            this.setSuggestedName((byte) 37, (String) null);
          }
          stackIn_3_0 = var6.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("rq.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            return;
          }
          if (param3 == this.cancelButton) {
            GetGrapplingHookRopeBreakLength.showGuestPlayNotice((byte) -77);
            return;
          }
          if (this.submitButton != param3) {
            return;
          }
          discarded$1 = this.submitAccountCreation(param0 - 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("rq.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean isFieldValid(int param0, ValidatableInput param1) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidator(-782444220);
          if (var3 == null) {
            return true;
          }
          if (param0 != 22239) {
            return false;
          }
          var4 = var3.getValidationState((byte) 35);
          if (SetArmageddonLength.invalidInput == var4) {
            return false;
          }
          if (SetShieldsDirectionalArcParticleSpeedDownshift.debouncingInput == var4) {
            return false;
          }
          if (SetTorpedoFireForce.emptyInput != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("rq.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.submitButton.enabled = this.validateFields(-122);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "rq.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean submitAccountCreation(int param0) {
        if (!this.validateFields(-119)) {
          return false;
        }
        int var2 = -1;
        if (param0 != 4) {
          return false;
        }
        try {
          var2 = Integer.parseInt(this.ageField.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return LegacyOpenGlUnlitEffect.startAccountCreation(this.passwordField.text, var2, this, this.emailUpdatesToggle.active, param0 - 3, this.usernameField.text, this.emailField.text);
    }

    private final int addFieldWithStatusIcon(int param0, UiComponent param1, byte param2, String param3, int param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledInputContainer var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledInputContainer(20, param4, param0 + 120, 25, param1, false, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param3);
          this.addChild(param2 - 18860, var8);
          var7 = new ValidationStatusIcon(((ValidatableInput) ((Object) param1)).getValidator(-782444220));
          this.addChild(-18756, var7);
          if (param2 != 104) {
            field_G = (String) null;
          }
          var7.setBounds(var8.width + (var8.x + 3), 15, 15, param2 - 103, (var8.height - 15 >> 1) + var8.y);
          stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("rq.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (UiRenderer) null);
        this.usernameField = new ValidatedTextField("", (UiListener) null, 12);
        this.emailField = new ValidatedTextField("", (UiListener) null, 100);
        this.emailConfirmationField = new ValidatedTextField("", (UiListener) null, 100);
        this.passwordField = new ValidatedTextField("", (UiListener) null, 20);
        this.passwordConfirmationField = new ValidatedTextField("", (UiListener) null, 20);
        this.ageField = new ValidatedTextField("", (UiListener) null, 3);
        int var1 = 1;
        this.emailUpdatesToggle = new UiToggleButton("", (UiListener) null, var1 != 0);
        this.submitButton = new UiFocusableComponent(SettingsChange.field_d, (UiListener) null);
        this.cancelButton = new UiFocusableComponent(SetTorpedoReload.field_p, (UiListener) null);
        this.usernameField.tooltip = FractalNoiseVolumeGenerator.field_m;
        this.emailField.tooltip = GetPointDefenceLaserProjectileInterceptDamage.field_s;
        this.emailConfirmationField.tooltip = AccountRequestText.confirmEmailTooltip;
        this.passwordField.tooltip = UiScrollPane.field_x;
        this.passwordConfirmationField.tooltip = SetAngularForceDownshift.field_p;
        this.ageField.tooltip = HashNoiseTextureOperation.field_j;
        this.emailUpdatesToggle.tooltip = QuickChatCategoryLoader.field_f;
        this.usernameField.setValidator(6614, new UsernameAvailabilityValidator(this.usernameField));
        this.emailField.setValidator(6614, new EmailSyntaxValidator(this.emailField));
        this.emailConfirmationField.setValidator(6614, new EmailAvailabilityValidator(this.emailConfirmationField, this.emailField));
        this.passwordField.setValidator(6614, new PasswordValidator(this.passwordField, this.usernameField, this.emailField));
        this.passwordConfirmationField.setValidator(6614, new MatchingFieldValidator(this.passwordConfirmationField, this.passwordField));
        this.ageField.setValidator(6614, new AgeValidator(this.ageField));
        this.submitButton.enabled = false;
        this.submitButton.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
        this.cancelButton.renderer = (UiRenderer) ((Object) new UnderlinedLinkRenderer());
        this.usernameField.renderer = (UiRenderer) ((Object) new GradientBorderTextStyle(10000536));
        GradientBorderTextStyle dupTemp$0 = new GradientBorderTextStyle(10000536);
        this.emailConfirmationField.renderer = (UiRenderer) ((Object) dupTemp$0);
        this.emailField.renderer = (UiRenderer) ((Object) dupTemp$0);
        this.ageField.renderer = (UiRenderer) ((Object) new GradientBorderTextStyle(10000536));
        this.emailUpdatesToggle.renderer = (UiRenderer) ((Object) new ActiveIconBorderRenderer());
        MaskedPasswordTextStyle dupTemp$1 = new MaskedPasswordTextStyle(10000536);
        this.passwordConfirmationField.renderer = (UiRenderer) ((Object) dupTemp$1);
        this.passwordField.renderer = (UiRenderer) ((Object) dupTemp$1);
        String var2 = SetReverbGain.substituteIndexedPlaceholders(GetLaserProjectiles.field_o, new String[]{this.getLinkMarkupStart((byte) 50), this.getLinkMarkupEnd((byte) -121)}, 109);
        int var3 = 20;
        var3 = var3 + this.addFieldRow(this.emailField, var3, MissionState.field_h, 170, (byte) -42);
        var3 = var3 + (5 + this.addFieldWithHelp(this.emailConfirmationField, var3, 170, AppletCookieWriter.confirmEmailText, false, 20, ""));
        var3 = var3 + this.addFieldRow(this.passwordField, var3, RequestNewestBlackboxRecording.field_q, 170, (byte) -36);
        var3 = var3 + (this.addFieldWithHelp(-41, OpenGlVertexNormal.field_e, 170, ScramblerPulseOrderDefinition.field_d, var3, this.passwordConfirmationField) + 5);
        var3 = var3 + (5 + this.addFieldWithHelp(-103, Projectile.field_r, 170, ByteStorageAccess.field_c, var3, this.usernameField));
        var3 = var3 + this.addFieldWithStatusIcon(170, this.ageField, (byte) 104, CarouselSystemEventFactory.field_a, var3);
        LabeledInputContainer var4 = new LabeledInputContainer(46, var3, -90 + this.width, 25, this.emailUpdatesToggle, true, this.width - 120, 5, SetTorpedoProjectileLife.field_o, 11579568, UiComponent.field_m);
        this.addChild(-18756, var4);
        var3 = var3 + var4.height;
        UiTextStyle var5 = new UiTextStyle(SetShipToShipRamDamage.field_o, 0, 0, 0, 0, 16777215, -1, 0, 0, SetShipToShipRamDamage.field_o.maxAscent, -1, 2147483647, true);
        this.legalText = new HotspotTextWidget(var2, var5);
        this.legalText.tooltip = "";
        this.legalText.setHotspotTooltip(0, -1, SetBombletSprayProjectileDamage.field_q);
        this.legalText.setHotspotTooltip(1, -1, SetBombletSprayProjectileDamage.field_q);
        this.legalText.listener = (UiListener) (this);
        this.legalText.fitTextBounds(this.width - 90, var3, 46, (byte) -23);
        var3 = var3 + (15 + this.legalText.height);
        this.addChild(-18756, this.legalText);
        int var6 = 4;
        int var7 = 200;
        this.submitButton.setBounds(496 - var7 >> 1, var7, 40, 1, var3);
        this.cancelButton.setBounds(3 + var6, 60, 40, 1, 15 + var3);
        this.cancelButton.listener = (UiListener) (this);
        this.submitButton.listener = (UiListener) (this);
        this.addChild(-18756, this.submitButton);
        this.addChild(-18756, this.cancelButton);
        this.nameSuggestions = new NameSuggestionsPanel((NameSuggestionTarget) (this));
        this.nameSuggestions.setBounds(60 + (this.usernameField.width + this.usernameField.x), -60 + (-this.usernameField.width + this.width) - this.usernameField.x, 150, 1, 20 + this.usernameField.y);
        this.addChild(-18756, this.nameSuggestions);
        this.setBounds(0, 496, var3 + 55 + var6, 1, 0);
    }

    private final boolean validateFields(int param0) {
        if (param0 >= -57) {
          this.legalText = (HotspotTextWidget) null;
          if (!this.isFieldValid(22239, (ValidatableInput) (this.usernameField))) {
            return false;
          }
          if (!this.isFieldValid(22239, (ValidatableInput) (this.emailField))) {
            return false;
          }
          if (!this.isFieldValid(22239, (ValidatableInput) (this.emailConfirmationField))) {
            return false;
          }
          if (!this.isFieldValid(22239, (ValidatableInput) (this.passwordField))) {
            return false;
          }
          if (!this.isFieldValid(22239, (ValidatableInput) (this.passwordConfirmationField))) {
            return false;
          }
          if (this.isFieldValid(22239, (ValidatableInput) (this.ageField))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldValid(22239, (ValidatableInput) (this.usernameField))) {
          return false;
        }
        if (!this.isFieldValid(22239, (ValidatableInput) (this.emailField))) {
          return false;
        }
        if (!this.isFieldValid(22239, (ValidatableInput) (this.emailConfirmationField))) {
          return false;
        }
        if (!this.isFieldValid(22239, (ValidatableInput) (this.passwordField))) {
          return false;
        }
        if (!this.isFieldValid(22239, (ValidatableInput) (this.passwordConfirmationField))) {
          return false;
        }
        if (this.isFieldValid(22239, (ValidatableInput) (this.ageField))) {
          return true;
        }
        return false;
    }

    private final String getLinkMarkupEnd(byte param0) {
        if (param0 >= -97) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int addFieldWithHelp(UiComponent param0, int param1, int param2, String param3, boolean param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        LabeledInputContainer var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledInputContainer(20, param1, 120 + param2, 25, param0, param4, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param3);
          this.addChild(-18756, var10);
          var9 = new ValidationStatusWidget(((ValidatableInput) ((Object) param0)).getValidator(-782444220), param6, 126, param1 + var10.height, param2 + 50, param5);
          var9.listener = (UiListener) (this);
          this.addChild(-18756, var9);
          stackIn_1_0 = var9.height + var10.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("rq.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
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
          stackIn_9_0 = this.focusNextChild(true, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rq.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onHotspotClicked(int param0, int param1, int param2, HotspotTextWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 == ~param2) {
            SetReloadBarWidth.requestAccountRelativeUrl(12, "terms.ws");
            return;
          }
          if (param2 == 1) {
            SetReloadBarWidth.requestAccountRelativeUrl(12, "privacy.ws");
            return;
          }
          if (param2 != 2) {
            return;
          }
          SetReloadBarWidth.requestAccountRelativeUrl(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("rq.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final String getLinkMarkupStart(byte param0) {
        if (param0 != 50) {
          this.cancelButton = (UiFocusableComponent) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void invalidateNameAvailability(int param0) {
        if (param0 != 1546) {
          return;
        }
        ((UsernameAvailabilityValidator) (this.usernameField.getValidator(param0 ^ -782442674))).invalidateAvailabilityCache((byte) 38);
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 67 / ((-47 - param0) / 56);
        field_G = null;
    }

    public final void setSuggestedName(byte param0, String param1) {
        String var4 = null;
        ValidatedTextField var3 = this.usernameField;
        if (param0 != 41) {
          return;
        }
        try {
          var4 = param1;
          ((UiTextField) ((Object) var3)).setText(false, 0, var4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "rq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Scamming";
    }
}
