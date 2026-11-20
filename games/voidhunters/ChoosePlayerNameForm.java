/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChoosePlayerNameForm extends UiContainer implements NameSuggestionTarget, UiActionListener {
    NameSuggestionsPanel suggestionsPanel;
    private ValidatedTextField nameField;
    static String instructionsText;
    static String[] field_w;
    static String field_x;
    static String[] field_D;
    private UiFocusableComponent okButton;
    private UiFocusableComponent cancelButton;

    private final int addValidatedField(int param0, int param1, String param2, String param3, int param4, UiComponent param5) {
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
          if (param0 != 35) {
            field_D = (String[]) null;
          }
          stackIn_3_0 = this.addValidatedField(param1, 35, param2, param5, param3, 126, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("waa.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        ValidatableInput var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            var7 = (ValidatableInput) null;
            discarded$1 = this.isInputValid((ValidatableInput) null, (byte) 100);
          }
          if (param3 == this.cancelButton) {
            LoginFormNavigation.showEmptyLoginForm(-116);
            return;
          }
          if (this.okButton != param3) {
            return;
          }
          this.submitName(25);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("waa.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            field_D = (String[]) null;
          }
          if (super.handleKey(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_8_0 = this.focusPreviousChild(param2, 0);
            return stackIn_8_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_12_0 = this.focusNextChild(true, param2);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("waa.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public ChoosePlayerNameForm() {
        super(0, 0, 496, 0, (UiRenderer) null);
        this.nameField = new ValidatedTextField("", (UiListener) null, 12);
        UiTextStyle var1 = new UiTextStyle(SetTorpedoProjectileLife.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, SetShipToShipRamDamage.field_o.maxAscent, -1, 2147483647, true);
        UiComponent var2 = new UiComponent(instructionsText, var1, (UiListener) null);
        this.okButton = new UiFocusableComponent(UiComboBoxList.field_K, (UiListener) null);
        this.cancelButton = new UiFocusableComponent(SetMissileLauncherProjectiles.field_p, (UiListener) null);
        this.nameField.tooltip = FractalNoiseVolumeGenerator.field_m;
        this.nameField.setValidator(6614, new UsernameAvailabilityValidator(this.nameField));
        this.okButton.enabled = false;
        this.okButton.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
        this.cancelButton.renderer = (UiRenderer) ((Object) new meb());
        this.nameField.renderer = (UiRenderer) ((Object) new GradientBorderTextStyle(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(20, 270, 50, 1, var3);
        this.addChild(-18756, var2);
        var3 += 50;
        var3 = var3 + (5 + this.addValidatedField(35, var3, ffb.field_c, Projectile.field_r, 170, this.nameField));
        this.okButton.setBounds(-var5 + 496 >> 1, var5, 40, 1, var3);
        this.cancelButton.setBounds(var4 + 3, 60, 40, 1, 15 + var3);
        this.cancelButton.listener = (UiListener) (this);
        this.okButton.listener = (UiListener) (this);
        this.addChild(-18756, this.okButton);
        this.addChild(-18756, this.cancelButton);
        this.suggestionsPanel = new NameSuggestionsPanel((NameSuggestionTarget) (this));
        this.suggestionsPanel.setBounds(60 + (this.nameField.x + this.nameField.width), -60 - this.nameField.x + (this.width - this.nameField.width), 150, 1, 20);
        this.addChild(-18756, this.suggestionsPanel);
        this.setBounds(0, 496, var4 + var3 + 55, 1, 0);
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.okButton.enabled = this.canSubmit(-31927);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "waa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean canSubmit(int param0) {
        if (param0 == -31927) {
          return this.isInputValid((ValidatableInput) (this.nameField), (byte) -92) ? true : false;
        }
        instructionsText = (String) null;
        if (!this.isInputValid((ValidatableInput) (this.nameField), (byte) -92)) {
          return false;
        }
        return true;
    }

    private final boolean isInputValid(ValidatableInput param0, byte param1) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        UiComponent var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getValidator(-782444220);
          if (var3 == null) {
            return true;
          }
          if (param1 != -92) {
            var5 = (UiComponent) null;
            this.updatePointer(-39, -53, -80, (UiComponent) null);
          }
          var4 = var3.getValidationState((byte) 35);
          stackIn_9_0 = (var4 == GetShipPersistence.validInput);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("waa.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int addValidatedField(int param0, int param1, String param2, UiComponent param3, String param4, int param5, int param6) {
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
          var10 = new LabeledInputContainer(20, param0, 120 + param6, 25, param3, false, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param2);
          this.addChild(-18756, var10);
          var9 = new ValidationStatusWidget(((ValidatableInput) ((Object) param3)).getValidator(-782444220), param4, param5, param0 + var10.height, 25 + param6, param1);
          var9.listener = (UiListener) (this);
          this.addChild(-18756, var9);
          stackIn_1_0 = var10.height + var9.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("waa.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static MusicPatch loadMusicPatch(ResourceArchive param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        MusicPatch stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.fetchSingleFile((byte) 9, param2);
          var3 = var5;
          if (var5 == null) {
            return null;
          }
          var4 = -102 % ((param1 - 24) / 60);
          stackIn_4_0 = new MusicPatch(var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("waa.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_D = null;
        int var1 = -52 % ((6 - param0) / 55);
        field_x = null;
        field_w = null;
        instructionsText = null;
    }

    final static void attachPresetComponents(ShipComponent param0, int param1) {
        ShipComponent var4 = null;
        ShipComponent var5 = null;
        try {
          param0.attachToHardpoint(1, 15, new ShipComponent(15));
          param0.attachToHardpoint(param1 ^ 18633, 14, new ShipComponent(15));
          if (param1 != 18632) {
            ResourceArchive var3 = (ResourceArchive) null;
            ChoosePlayerNameForm.loadMusicPatch((ResourceArchive) null, (byte) -43, -58);
          }
          param0.attachToHardpoint(param1 - 18631, 5, new ShipComponent(13));
          param0.attachToHardpoint(1, 6, new ShipComponent(13));
          param0.attachToHardpoint(1, 7, new ShipComponent(13));
          param0.attachToHardpoint(1, 8, new ShipComponent(13));
          param0.attachToHardpoint(1, 0, new ShipComponent(13));
          param0.attachToHardpoint(1, 13, new ShipComponent(13));
          param0.attachToHardpoint(param1 ^ 18633, 4, new ShipComponent(13));
          param0.attachToHardpoint(1, 9, new ShipComponent(13));
          var4 = new ShipComponent(34);
          var4.attachToHardpoint(1, 3, new ShipComponent(15));
          param0.attachToHardpoint(param1 - 18631, 11, var4);
          var5 = new ShipComponent(34);
          var5.attachToHardpoint(1, 1, new ShipComponent(15));
          param0.attachToHardpoint(param1 ^ 18633, 2, var5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "waa.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void invalidateNameAvailability(int param0) {
        int discarded$0 = 0;
        ((UsernameAvailabilityValidator) (this.nameField.getValidator(-782444220))).invalidateAvailabilityCache((byte) 127);
        if (param0 != 1546) {
          UiComponent var3 = (UiComponent) null;
          discarded$0 = this.addValidatedField(25, 1, (String) null, (String) null, 83, (UiComponent) null);
        }
    }

    private final void submitName(int param0) {
        int var2 = 71 / ((78 - param0) / 41);
        if (this.canSubmit(-31927)) {
          GetMachineGunAimspeed.a(this.nameField.text, -127);
          return;
        }
    }

    public final void setSuggestedName(byte param0, String param1) {
        int discarded$1 = 0;
        ValidatedTextField var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.nameField;
          var4 = param1;
          ((UiTextField) ((Object) var3)).setText(false, 0, var4);
          if (param0 == 41) {
            return;
          }
          var5 = (String) null;
          discarded$1 = this.addValidatedField(37, 125, (String) null, (UiComponent) null, (String) null, 67, -21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("waa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_w = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        instructionsText = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_D = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
