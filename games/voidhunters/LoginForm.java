/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends UiContainer implements UiTextFieldListener, UiActionListener {
    static String field_E;
    private UiFocusableComponent submitButton;
    private boolean reconnectMode;
    private UiFocusableComponent alternateButton;
    private String headerMessage;
    private UiTextField passwordField;
    private boolean showCreateAccountButton;
    private boolean showGuestOption;
    static String field_C;
    private UiTextField loginField;
    private UiFocusableComponent createAccountButton;

    final void setLoginName(byte param0, String param1) {
        UiTextField var3 = null;
        String var4 = null;
        if (param0 != 9) {
          return;
        }
        try {
          var3 = this.loginField;
          var4 = param1;
          var3.setText(false, param0 ^ 9, var4);
          this.passwordField.clearText(82);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vla.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            return;
          }
          if (this.submitButton != param3) {
            if (param3 == this.createAccountButton) {
              GetPhasedEnergyBeamProjectiles.showAccountCreationForm(70);
            } else {
              if (param3 == this.alternateButton) {
                if (!this.reconnectMode) {
                  if (!this.showGuestOption) {
                    OpenGlTransparentWaterEffect.e(-24248);
                  } else {
                    GetGrapplingHookRopeBreakLength.showGuestPlayNotice((byte) -91);
                  }
                } else {
                  EmailTopLevelDomainValidator.requestQuitToWebsite((byte) 127);
                }
              }
            }
          } else {
            this.submitLogin(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("vla.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.headerMessage != null) {
          SetShipToShipRamDamage.field_o.drawParagraph(this.headerMessage, this.x + (param0 + 20), 15 + (param3 + this.y), -40 + this.width, this.height, 16777215, -1, 1, 0, SetShipToShipRamDamage.field_o.maxAscent);
        }
        if (this.createAccountButton != null) {
          SoftwareRasterizer2D.drawHorizontalLine(param0 + 10, param3 + 134, -20 + this.width, 4210752);
        }
        super.drawLayer(param0, param1, 58, param3);
        if (param2 < 47) {
          UiTextField var6 = (UiTextField) null;
          this.onTextChanged((UiTextField) null, (byte) 79);
        }
    }

    final void clearCredentials(byte param0) {
        this.loginField.clearText(82);
        if (param0 != -29) {
          this.submitButton = (UiFocusableComponent) null;
        }
        this.passwordField.clearText(82);
    }

    private final void submitLogin(int param0) {
        UiTextField var3;
        if (param0 != -1) {
          var3 = (UiTextField) null;
          this.onTextChanged((UiTextField) null, (byte) -20);
        }
        if (Projectile.isReconnecting((byte) -21) ||
          !(this.loginField.text.length() <= 0) &&
          !(this.passwordField.text.length() <= 0)) {
          PartitionZoneList.a(-41, this.passwordField.text, this.loginField.text);
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
          stackIn_14_1 = new StringBuilder().append("vla.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final String getLoginName(int param0) {
        if (null == this.loginField.text) {
          return "";
        }
        if (param0 != 30) {
          return (String) null;
        }
        return this.loginField.text;
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (UiRenderer) null);
        LabeledInputContainer dupTemp$0 = null;
        LabeledInputContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        UiFocusableComponent stackIn_17_1 = null;
        UiFocusableComponent stackIn_17_2 = null;
        UiFocusableComponent stackIn_18_1 = null;
        UiFocusableComponent stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ThreeSliceButtonStyle var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        LabeledInputContainer var12 = null;
        LabeledInputContainer var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.showGuestOption = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.showCreateAccountButton = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.reconnectMode = stackIn_10_1;
          this.headerMessage = param1;
          if (this.reconnectMode && (this.showCreateAccountButton ||
            this.showGuestOption)) {
            throw new IllegalStateException();
          }
          this.loginField = (UiTextField) ((Object) new ValidatedTextField(param0, (UiListener) (this), 100));
          this.passwordField = (UiTextField) ((Object) new ValidatedTextField("", (UiListener) (this), 20));
          if (this.reconnectMode) {
            this.submitButton = new UiFocusableComponent(SetSpecialOrderBoxHeight.field_p, (UiListener) null);
            this.alternateButton = new UiFocusableComponent(GetFighterBayAimspeed.field_q, (UiListener) null);
            this.loginField.enabled = false;
          } else {
            this.submitButton = new UiFocusableComponent(GetBombletSprayProjectiles.field_s, (UiListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.showGuestOption) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = GuestPlayText.justPlayText;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ArbProgram.field_a;
            }
            this.alternateButton = new UiFocusableComponent(stackIn_18_3, (UiListener) null);
            if (this.showCreateAccountButton) {
              this.createAccountButton = new UiFocusableComponent(TimedSpecialOrderBehaviour.field_b, (UiListener) (this));
            }
          }
          this.loginField.renderer = (UiRenderer) ((Object) new GradientBorderTextStyle(10000536));
          this.passwordField.renderer = (UiRenderer) ((Object) new MaskedPasswordTextStyle(10000536));
          var6 = new ThreeSliceButtonStyle();
          this.submitButton.renderer = (UiRenderer) ((Object) var6);
          if (null != this.alternateButton) {
            this.alternateButton.renderer = (UiRenderer) ((Object) var6);
          }
          this.loginField.tooltip = ToolkitRasterState.field_j;
          if (this.createAccountButton != null) {
            this.createAccountButton.renderer = (UiRenderer) ((Object) var6);
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.tooltip = AdjustBodyComponentsAction.field_a;
          }
          if (this.reconnectMode) {
            this.alternateButton.tooltip = GetSpecialOrderBoxHeight.field_o;
          } else {
            if (!this.showGuestOption) {
              this.alternateButton.renderer = (UiRenderer) ((Object) new UnderlinedLinkRenderer());
            } else {
              this.alternateButton.tooltip = UiContainer.field_u;
              this.alternateButton.renderer = (UiRenderer) ((Object) new UnderlinedLinkRenderer());
            }
          }
          this.y = 15;
          var7 = SetShipToShipRamDamage.field_o;
          if (null != this.headerMessage) {
            this.y = this.y + (var7.getParagraphHeight(this.headerMessage, this.width - 40, var7.maxAscent) + 5);
          }
          var8 = RemoveEventActionFactory.field_a;
          var9 = GpuFaceAttachmentState.readLastLoginMethod(19314, MissionList.b((byte) -86));
          if (SetFighterBayAimspeed.field_o != var9) {
            if (var9 == SetShowTutorial.field_p) {
              var8 = SetSpinningBladeTopSpeed.field_o;
            }
          } else {
            var8 = WhirlpoolDigest.field_a;
          }
          dupTemp$0 = new LabeledInputContainer(10, this.y, this.width - 20, 25, this.loginField, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(-18756, dupTemp$0);
          this.y = this.y + (((UiComponent) ((Object) var12)).height + 5);
          dupTemp$1 = new LabeledInputContainer(10, this.y, -20 + this.width, 25, this.passwordField, false, 80, 3, var7, 16777215, RequestNewestBlackboxRecording.field_q);
          var13 = dupTemp$1;
          this.addChild(-18756, dupTemp$1);
          this.y = this.y + (((UiComponent) ((Object) var13)).height + 5);
          this.submitButton.listener = (UiListener) (this);
          if (this.createAccountButton != null) {
            this.createAccountButton.listener = (UiListener) (this);
          }
          if (this.alternateButton != null) {
            this.alternateButton.listener = (UiListener) (this);
          }
          if (null == this.createAccountButton) {
            this.submitButton.setBounds(8, this.width - 16, 30, 1, this.y);
            this.y = this.y + 35;
          } else {
            this.submitButton.setBounds(85, this.width - 95, 30, 1, this.y);
            this.y = this.y + 60;
          }
          if (null != this.createAccountButton) {
            this.createAccountButton.setBounds(8, -16 + this.width, 30, 1, this.y);
            this.y = this.y + 35;
          }
          if (null != this.alternateButton) {
            if (!this.reconnectMode &&
              !this.showGuestOption) {
              this.alternateButton.setBounds(8, 40, 20, 1, this.y);
              this.y = this.y + 25;
            } else {
              this.alternateButton.setBounds(8, -10 + (-6 + this.width), 30, 1, this.y);
              this.y = this.y + 35;
            }
          }
          this.setBounds(0, this.width, 3 + this.y, 1, 0);
          this.addChild(-18756, this.submitButton);
          if (this.createAccountButton != null) {
            this.addChild(-18756, this.createAccountButton);
          }
          if (null != this.alternateButton) {
            this.addChild(-18756, this.alternateButton);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("vla.<init>(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 3) {
          return;
        }
        field_E = null;
        field_C = null;
    }

    final static int hashCp1252(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 <= 105) {
            LoginForm.clearSharedReferences(30);
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = Cp1252CharacterEncoder.encodeCp1252Character(-125, param1.charAt(var4)) + (-var3 + (var3 << 5));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("vla.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onTextChanged(UiTextField param0, byte param1) {
        try {
          if (param1 != 100) {
            this.submitLogin(-74);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vla.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onSubmitted(int param0, UiTextField param1) {
        CharSequence var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -12409) {
            var4 = (CharSequence) null;
            LoginForm.hashCp1252((byte) -119, (CharSequence) null);
          }
          if (param1 == this.loginField) {
            this.passwordField.requestFocus(param0 ^ -12409, (UiComponent) (this));
          }
          if (param1 == this.passwordField) {
            this.submitLogin(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vla.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_C = "Hull block";
    }
}
