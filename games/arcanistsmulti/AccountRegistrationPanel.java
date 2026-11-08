/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends UiContainer implements TextHotspotListener, ButtonListener, NameSuggestionListener {
    static String field_L;
    static String field_R;
    private ValidatedTextWidget field_K;
    static int field_J;
    static int[] field_M;
    static String field_T;
    static BirthDateEntryPanel field_U;
    private ValidatedTextWidget field_P;
    NameSuggestionsPanel field_G;
    private ValidatedTextWidget field_D;
    private TextHotspotWidget field_S;
    static String field_Q;
    private TextButton field_O;
    private TextButton field_C;
    static byte[][] field_I;
    private ValidatedTextWidget field_H;
    private ValidatedTextWidget field_N;
    private Checkbox field_F;
    private ValidatedTextWidget field_E;

    private final boolean isFieldAcceptable(int param0, ValidationProviderSource param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 43) {
            this.field_F = (Checkbox) null;
          }
          var3 = param1.getValidationProvider(0);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationState(-83);
          if (var4 == DateHelpers.field_k) {
            return false;
          }
          if (var4 == MusicAndClipHelpers.field_f) {
            return false;
          }
          if (SocialListEntry.field_Wb != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ln.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_I = (byte[][]) null;
        int var1 = -76 / ((68 - param0) / 58);
        field_U = null;
        field_L = null;
        field_T = null;
        field_Q = null;
        field_R = null;
        field_M = null;
    }

    private final boolean areAllFieldsValid(int param0) {
        if (param0 != 0) {
          this.field_D = (ValidatedTextWidget) null;
          if (!this.isFieldAcceptable(118, (ValidationProviderSource) (this.field_K))) {
            return false;
          }
          if (!this.isFieldAcceptable(param0 + 91, (ValidationProviderSource) (this.field_N))) {
            return false;
          }
          if (!this.isFieldAcceptable(99, (ValidationProviderSource) (this.field_D))) {
            return false;
          }
          if (!this.isFieldAcceptable(72, (ValidationProviderSource) (this.field_P))) {
            return false;
          }
          if (!this.isFieldAcceptable(94, (ValidationProviderSource) (this.field_E))) {
            return false;
          }
          if (this.isFieldAcceptable(80, (ValidationProviderSource) (this.field_H))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldAcceptable(118, (ValidationProviderSource) (this.field_K))) {
          return false;
        }
        if (!this.isFieldAcceptable(param0 + 91, (ValidationProviderSource) (this.field_N))) {
          return false;
        }
        if (!this.isFieldAcceptable(99, (ValidationProviderSource) (this.field_D))) {
          return false;
        }
        if (!this.isFieldAcceptable(72, (ValidationProviderSource) (this.field_P))) {
          return false;
        }
        if (!this.isFieldAcceptable(94, (ValidationProviderSource) (this.field_E))) {
          return false;
        }
        if (this.isFieldAcceptable(80, (ValidationProviderSource) (this.field_H))) {
          return true;
        }
        return false;
    }

    private final int addHelpFieldDefaultHeight(int param0, UiComponent param1, String param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
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
          var7_int = 34 % ((41 - param3) / 45);
          stackIn_1_0 = this.addFieldWithHelp(param2, param1, 25, 35, param4, param5, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ln.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String getLinkOpenMarkup(byte param0) {
        if (param0 != 34) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void onNameSelected(String param0, int param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_K;
          if (param1 != 90) {
            field_T = (String) null;
          }
          var4 = param0;
          ((EditableTextWidget) ((Object) var3)).setText(false, var4, false);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ln.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_K = new ValidatedTextWidget("", (UiListener) null, 12);
        this.field_N = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_D = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_P = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_E = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_H = new ValidatedTextWidget("", (UiListener) null, 3);
        int var1 = 1;
        this.field_F = new Checkbox("", (UiListener) null, var1 != 0);
        this.field_C = new TextButton(PaddedContainer.field_G, (UiListener) null);
        this.field_O = new TextButton(OptionsDialog.field_rb, (UiListener) null);
        this.field_K.field_q = ValidationState.field_b;
        this.field_N.field_q = ArchiveIndex.field_s;
        this.field_D.field_q = SceneScrollPane.field_Fb;
        this.field_P.field_q = LobbyLayoutHelpers.field_c;
        this.field_E.field_q = ListRequest.field_j;
        this.field_H.field_q = MenuScreen.field_k;
        this.field_F.field_q = GameSelectionHelpers.field_l;
        this.field_K.setValidator(new NameValidator(this.field_K), (byte) 18);
        this.field_N.setValidator(new EmailValidator(this.field_N), (byte) -127);
        this.field_D.setValidator(new ConfirmedNameValidator(this.field_D, this.field_N), (byte) -128);
        this.field_P.setValidator(new PasswordValidator(this.field_P, this.field_K, this.field_N), (byte) -127);
        this.field_E.setValidator(new MatchingFieldValidator(this.field_E, this.field_P), (byte) -128);
        this.field_H.setValidator(new AgeValidator(this.field_H), (byte) 39);
        this.field_C.field_B = false;
        this.field_C.field_r = (WidgetPainter) ((Object) new MenuButtonPainter());
        this.field_O.field_r = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.field_K.field_r = (WidgetPainter) ((Object) new BevelTextPainter(10000536));
        BevelTextPainter dupTemp$0 = new BevelTextPainter(10000536);
        this.field_D.field_r = (WidgetPainter) ((Object) dupTemp$0);
        this.field_N.field_r = (WidgetPainter) ((Object) dupTemp$0);
        this.field_H.field_r = (WidgetPainter) ((Object) new BevelTextPainter(10000536));
        this.field_F.field_r = (WidgetPainter) ((Object) new IconHighlightPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_E.field_r = (WidgetPainter) ((Object) dupTemp$1);
        this.field_P.field_r = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = CachedArchiveProvider.formatTemplate(-23, new String[]{this.getLinkOpenMarkup((byte) 34), this.getLinkCloseMarkup(false)}, GameListHelpers.field_d);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(this.field_N, Checkbox.field_K, var3, 170, 109);
        var3 = var3 + (5 + this.addFieldWithHelp("", this.field_D, 25, 20, 170, SceneScrollPane.field_Gb, var3));
        var3 = var3 + this.addLabeledField(this.field_P, ValidationState.field_a, var3, 170, 126);
        var3 = var3 + (5 + this.addHelpFieldDefaultHeight(var3, this.field_E, WhirlpoolHasher.field_p, 99, 170, BattleScreen.field_A));
        var3 = var3 + (5 + this.addHelpFieldDefaultHeight(var3, this.field_K, ButtonMenuDialog.field_kb, -67, 170, CredentialKind.field_h));
        var3 = var3 + this.addFieldWithStatusIcon(ProxySocketConnector.field_n, this.field_H, (byte) -71, 170, var3);
        LabeledField var4 = new LabeledField(46, var3, this.field_v - 90, 25, this.field_F, true, this.field_v - 120, 5, WidgetStyleLayer.field_e, 11579568, AudioService.field_c);
        this.addChild(-114, var4);
        var3 = var3 + var4.field_k;
        TextWidgetPainter var5 = new TextWidgetPainter(RootInputHelpers.field_c, 0, 0, 0, 0, 16777215, -1, 0, 0, RootInputHelpers.field_c.field_C, -1, 2147483647, true);
        this.field_S = new TextHotspotWidget(var2, var5);
        this.field_S.field_q = "";
        this.field_S.setHotspotTooltip(0, 0, MenuButtonPainter.field_s);
        this.field_S.setHotspotTooltip(1, 0, MenuButtonPainter.field_s);
        this.field_S.field_o = (UiListener) (this);
        this.field_S.setBoundsToPreferredHeight(46, (byte) -4, this.field_v - 90, var3);
        var3 = var3 + (this.field_S.field_k + 15);
        this.addChild(-66, this.field_S);
        int var6 = 4;
        int var7 = 200;
        this.field_C.setBounds(40, var3, var7, -var7 + 496 >> 1, -87);
        this.field_O.setBounds(40, 15 + var3, 60, 3 + var6, -100);
        this.field_O.field_o = (UiListener) (this);
        this.field_C.field_o = (UiListener) (this);
        this.addChild(-85, this.field_C);
        this.addChild(-96, this.field_O);
        this.field_G = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_G.setBounds(150, this.field_K.field_j + 20, -60 + (this.field_v + (-this.field_K.field_n - this.field_K.field_v)), 60 + (this.field_K.field_n + this.field_K.field_v), -127);
        this.addChild(-99, this.field_G);
        this.setBounds(var3 - (-55 - var6), 0, 496, 0, -107);
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_M = (int[]) null;
          }
          if (this.field_O == param4) {
            PatchEnvelopeSet.openSimpleDialog(110);
            return;
          }
          if (this.field_C != param4) {
            return;
          }
          discarded$1 = this.submitRegistration(-48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ln.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean submitRegistration(int param0) {
        if (!this.areAllFieldsValid(0)) {
          return false;
        }
        int var2 = -73 / ((72 - param0) / 40);
        int var3 = -1;
        try {
          var3 = Integer.parseInt(this.field_H.field_g);
        } catch (NumberFormatException numberFormatException) {
        }
        return LoginLoadingHelpers.showAccountDialog(this.field_P.field_g, this.field_K.field_g, var3, this, -30001, this.field_N.field_g, this.field_F.field_z);
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, (byte) -121, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.field_O = (TextButton) null;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param0, 9555);
            return stackIn_7_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(2, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ln.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_C.field_B = this.areAllFieldsValid(0);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ln.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void onHotspotClicked(int param0, TextHotspotWidget param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (0 != param3) {
            if (1 == param3) {
              ClipState.setStatusCaption(126, "privacy.ws");
            } else {
              if (param3 == 2) {
                ClipState.setStatusCaption(127, "conduct.ws");
              }
            }
          } else {
            ClipState.setStatusCaption(param2 + 1734, "terms.ws");
          }
          if (param2 == -1607) {
            return;
          }
          this.field_P = (ValidatedTextWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ln.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int addFieldWithHelp(String param0, UiComponent param1, int param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        LabeledField var10 = null;
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
          var10 = new LabeledField(20, param6, 120 + param4, param2, param1, false, 120, 3, RootInputHelpers.field_c, 16777215, param5);
          this.addChild(-75, var10);
          var9 = new ValidationHelpWidget(((ValidationProviderSource) ((Object) param1)).getValidationProvider(0), param0, 126, param6 + var10.field_k, param4 + 50, param3);
          var9.field_o = (UiListener) (this);
          this.addChild(-127, var9);
          stackIn_1_0 = var9.field_k + var10.field_k;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ln.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void onSuggestionsChanged(byte param0) {
        if (param0 != -7) {
          return;
        }
        ((NameValidator) (this.field_K.getValidationProvider(0))).resetLookup(126);
    }

    private final int addFieldWithStatusIcon(String param0, UiComponent param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledField var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledField(20, param4, param3 + 120, 25, param1, false, 120, 3, RootInputHelpers.field_c, 16777215, param0);
          if (param2 != -71) {
            stackIn_2_0 = 93;
            return stackIn_2_0;
          }
          this.addChild(param2 ^ 13, var8);
          var7 = new ValidationStatusIcon(((ValidationProviderSource) ((Object) param1)).getValidationProvider(0));
          this.addChild(-94, var7);
          var7.setBounds(15, var8.field_j + (-15 + var8.field_k >> 1), 15, 3 + var8.field_v + var8.field_n, param2 - 48);
          stackIn_4_0 = var8.field_k;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ln.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addLabeledField(UiComponent param0, String param1, int param2, int param3, int param4) {
        String discarded$1 = null;
        LabeledField var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 97) {
            discarded$1 = this.getLinkOpenMarkup((byte) -39);
          }
          var6 = new LabeledField(20, param2, param3 + 120, 25, param0, false, 120, 3, RootInputHelpers.field_c, 16777215, param1);
          this.addChild(-66, var6);
          stackIn_3_0 = var6.field_k;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("ln.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_R = "Accept";
        field_T = "Add friend";
        field_J = -1;
        field_L = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
