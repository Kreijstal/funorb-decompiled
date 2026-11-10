/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener, UsernameSuggestionListener {
    private ValidatedTextInputWidget field_I;
    static Sprite field_U;
    private ButtonWidget field_O;
    private ValidatedTextInputWidget field_P;
    static ResourceArchive field_L;
    private ValidatedTextInputWidget field_T;
    UsernameSuggestionsPanel field_J;
    private CheckboxWidget field_H;
    private ValidatedTextInputWidget field_N;
    private HotspotTextWidget field_G;
    static Sprite[] field_W;
    private ButtonWidget field_S;
    private ValidatedTextInputWidget field_M;
    static boolean field_R;
    static String field_Q;
    private ValidatedTextInputWidget field_V;
    static String field_X;

    public final void onMoreSuggestionsRequested(int param0) {
        ((UsernameAvailabilityValidator) (this.field_V.getValidationProvider((byte) -43))).resetCheckedName(param0 ^ -22725);
        if (param0 == 496) {
          return;
        }
        this.field_I = (ValidatedTextInputWidget) null;
    }

    private final boolean isInputValid(ValidationProviderSource param0, int param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 60) {
            return true;
          }
          var3 = param0.getValidationProvider((byte) -61);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getDebouncedValidationState(80);
          if (PowerGaugeHelpers.field_b == var4) {
            return false;
          }
          if (PortalView.field_H == var4) {
            return false;
          }
          if (WidgetContainer.field_F != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("fe.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void resendSavedDataRequests(byte param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        PendingDataRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 > -87) {
            return;
          }
          var4 = (PendingDataRequest) (SpriteState.field_s.last(86));
          while (var4 != null) {
            StatSubmissionHelpers.sendSaveDataRequest(var4, 1, param1);
            var4 = (PendingDataRequest) (SpriteState.field_s.previous(6));
          }
          var2 = TabbedPane.field_Gb.last(84);
          while (var2 != null) {
            StateIconLabel.sendByteRequest(1, param1);
            var2 = TabbedPane.field_Gb.previous(6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "fe.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void onButtonActivated(int param0, int param1, ButtonWidget param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -83) {
            return;
          }
          if (param2 == this.field_O) {
            ImageProducerRasterBuffer.showPlayModeChoiceDialog(-120);
            return;
          }
          if (param2 != this.field_S) {
            return;
          }
          discarded$1 = this.submitAccountCreation((byte) -79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("fe.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKeyInput(int param0, char param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3 ^ 0)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_7_0 = this.focusPreviousChild((byte) -1, param2);
            return stackIn_7_0;
          }
          if (param0 == 99) {
            stackIn_11_0 = this.focusNextChild(param3 + 6267, param2);
            return stackIn_11_0;
          }
          if (param3 == -6208) {
            return false;
          }
          this.field_O = (ButtonWidget) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("fe.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final void updatePointerState(int param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_S.field_F = this.areAllInputsValid(-38);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fe.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void onHotspotActivated(int param0, HotspotTextWidget param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 != 0) {
            if (param3 == 1) {
              SimZombie.openPolicyPage("privacy.ws", (byte) 125);
            } else {
              if (param3 == 2) {
                SimZombie.openPolicyPage("conduct.ws", (byte) 127);
              }
            }
          } else {
            SimZombie.openPolicyPage("terms.ws", (byte) 127);
          }
          if (param2 < -16) {
            return;
          }
          this.field_V = (ValidatedTextInputWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(byte param0) {
        if (param0 != -109) {
          field_W = (Sprite[]) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String getLinkOpenMarkup(byte param0) {
        int var2 = -43 % ((param0 - 45) / 39);
        return "<u=2164A2><col=2164A2>";
    }

    private final int addLabeledFieldWithDefaultMessageWidth(String param0, String param1, int param2, int param3, UiWidget param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 == 35) {
            stackIn_4_0 = this.addFieldWithValidationHelp(35, true, param4, param1, param0, param2, param3);
            return stackIn_4_0;
          }
          stackIn_2_0 = -57;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("fe.P(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_X = null;
        field_U = null;
        if (!param0) {
          field_W = null;
          field_L = null;
          field_Q = null;
          return;
        }
        AccountCreationForm.releaseStatics(true);
        field_W = null;
        field_L = null;
        field_Q = null;
    }

    private final boolean submitAccountCreation(byte param0) {
        if (!this.areAllInputsValid(-122)) {
          return false;
        }
        if (param0 >= -30) {
          field_R = true;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_N.field_j);
        } catch (NumberFormatException numberFormatException) {
        }
        return AccountCreationHelpers.startAccountCreation(this.field_P.field_j, this.field_V.field_j, this.field_M.field_j, var2, -10663, this, this.field_H.field_G);
    }

    private final int addLabeledFieldWithValidationIcon(UiWidget param0, int param1, int param2, String param3, int param4) {
        RuntimeException var6 = null;
        ValidationIconWidget var7 = null;
        int var8 = 0;
        LabeledChildWidget var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new LabeledChildWidget(20, param4, 120 + param2, 25, param0, false, 120, 3, FontPaletteHelpers.field_h, 16777215, param3);
          this.addChild((byte) 45, var9);
          var7 = new ValidationIconWidget(((ValidationProviderSource) ((Object) param0)).getValidationProvider((byte) -109));
          this.addChild((byte) 57, var7);
          var7.setWidgetBounds(3 + (var9.field_y + var9.field_n), (var9.field_w - 15 >> 1) + var9.field_i, 28972, 15, 15);
          var8 = -40 / ((param1 - 34) / 43);
          stackIn_1_0 = var9.field_w;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("fe.F(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean areAllInputsValid(int param0) {
        if (!this.isInputValid((ValidationProviderSource) (this.field_V), 60)) {
          return false;
        }
        if (!this.isInputValid((ValidationProviderSource) (this.field_M), 60)) {
          return false;
        }
        if (!this.isInputValid((ValidationProviderSource) (this.field_T), 60)) {
          return false;
        }
        if (!this.isInputValid((ValidationProviderSource) (this.field_P), 60)) {
          return false;
        }
        if (!this.isInputValid((ValidationProviderSource) (this.field_I), 60)) {
          return false;
        }
        if (!this.isInputValid((ValidationProviderSource) (this.field_N), 60)) {
          return false;
        }
        if (param0 < -20) {
          return true;
        }
        String var3 = (String) null;
        int discarded$0 = this.addLabeledFieldWithValidationIcon((UiWidget) null, -84, -24, (String) null, -8);
        return true;
    }

    public final void onSuggestionSelected(String param0, int param1) {
        ValidatedTextInputWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_V;
          if (param1 != 1) {
            this.field_V = (ValidatedTextInputWidget) null;
          }
          var4 = param0;
          ((TextInputWidget) ((Object) var3)).setInputText(false, var4, (byte) 103);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fe.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int addFieldWithValidationHelp(int param0, boolean param1, UiWidget param2, String param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        LabeledChildWidget var10 = null;
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
          var10 = new LabeledChildWidget(20, param5, 120 + param6, 25, param2, false, 120, 3, FontPaletteHelpers.field_h, 16777215, param3);
          if (!param1) {
            this.field_J = (UsernameSuggestionsPanel) null;
          }
          this.addChild((byte) 86, var10);
          var9 = new ValidationMessageWidget(((ValidationProviderSource) ((Object) param2)).getValidationProvider((byte) -109), param4, 126, param5 + var10.field_w, 50 + param6, param0);
          var9.field_A = (WidgetListener) (this);
          this.addChild((byte) 49, var9);
          stackIn_3_0 = var9.field_w + var10.field_w;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("fe.J(").append(param0).append(',').append(param1).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final int addLabeledField(int param0, UiWidget param1, int param2, int param3, String param4) {
        LabeledChildWidget var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledChildWidget(20, param2, param0 + 120, 25, param1, false, 120, 3, FontPaletteHelpers.field_h, 16777215, param4);
          this.addChild((byte) 86, var6);
          if (param3 > 38) {
            stackIn_4_0 = var6.field_w;
            return stackIn_4_0;
          }
          stackIn_2_0 = 45;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("fe.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_V = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
        this.field_M = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
        this.field_T = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
        this.field_P = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
        this.field_I = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
        this.field_N = new ValidatedTextInputWidget("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_H = new CheckboxWidget("", (WidgetListener) null, var1 != 0);
        this.field_S = new ButtonWidget(ClientProtocolStage.field_a, (WidgetListener) null);
        this.field_O = new ButtonWidget(ThreeSliceButtonPainter.field_v, (WidgetListener) null);
        this.field_V.field_x = AccountTextGlobals.field_d;
        this.field_M.field_x = AlignedIconLabel.field_Nb;
        this.field_T.field_x = IsaacRandom.field_d;
        this.field_P.field_x = SpriteHotspot.field_f;
        this.field_I.field_x = ChatAndOptionHelpers.field_e;
        this.field_N.field_x = SocketConnector.field_g;
        this.field_H.field_x = ClientProtocolStage.field_b;
        this.field_V.setValidationProvider((byte) -27, new UsernameAvailabilityValidator(this.field_V));
        this.field_M.setValidationProvider((byte) -27, new EmailValidator(this.field_M));
        this.field_T.setValidationProvider((byte) -27, new EmailAvailabilityValidator(this.field_T, this.field_M));
        this.field_P.setValidationProvider((byte) -27, new PasswordValidator(this.field_P, this.field_V, this.field_M));
        this.field_I.setValidationProvider((byte) -27, new MatchingTextValidator(this.field_I, this.field_P));
        this.field_N.setValidationProvider((byte) -27, new AgeValidator(this.field_N));
        this.field_S.field_F = false;
        this.field_S.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_O.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.field_V.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        GradientOutlineTextPainter dupTemp$0 = new GradientOutlineTextPainter(10000536);
        this.field_T.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.field_M.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.field_N.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        this.field_H.painter = (WidgetPainter) ((Object) new TickButtonPainter());
        PasswordTextPainter dupTemp$1 = new PasswordTextPainter(10000536);
        this.field_I.painter = (WidgetPainter) ((Object) dupTemp$1);
        this.field_P.painter = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = QueuedListRequest.substituteTemplateArguments(MarkerSliderPainter.field_d, new String[]{this.getLinkOpenMarkup((byte) 3), this.getLinkCloseMarkup((byte) -109)}, 2);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(170, this.field_M, var3, 73, InflaterDecompressor.field_i);
        var3 = var3 + (5 + this.addFieldWithValidationHelp(20, true, this.field_T, QuitPageHelpers.field_d, "", var3, 170));
        var3 = var3 + this.addLabeledField(170, this.field_P, var3, 47, ButtonWidget.field_D);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultMessageWidth(RankingEntry.field_f, MouseInputHandler.field_b, var3, 170, this.field_I, 35));
        var3 = var3 + (this.addLabeledFieldWithDefaultMessageWidth(MusicPatchLoadHelpers.field_e, PasswordValidator.field_w, var3, 170, this.field_V, 35) + 5);
        var3 = var3 + this.addLabeledFieldWithValidationIcon(this.field_N, -99, 170, SoundStopHelpers.field_a, var3);
        LabeledChildWidget var4 = new LabeledChildWidget(46, var3, -90 + this.field_n, 25, this.field_H, true, -120 + this.field_n, 5, DisplayNamePanel.field_H, 11579568, BrowserPageHelpers.field_e);
        this.addChild((byte) 115, var4);
        var3 = var3 + var4.field_w;
        TextWidgetPainter var5 = new TextWidgetPainter(FontPaletteHelpers.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, FontPaletteHelpers.field_h.maxAscent, -1, 2147483647, true);
        this.field_G = new HotspotTextWidget(var2, var5);
        this.field_G.field_x = "";
        this.field_G.setHotspotHoverText(0, (byte) -104, TextLayout.field_d);
        this.field_G.setHotspotHoverText(1, (byte) -127, TextLayout.field_d);
        this.field_G.field_A = (WidgetListener) (this);
        this.field_G.setBoundsToTextHeight(this.field_n - 90, var3, (byte) -4, 46);
        var3 = var3 + (this.field_G.field_w + 15);
        this.addChild((byte) 61, this.field_G);
        int var6 = 4;
        int var7 = 200;
        this.field_S.setWidgetBounds(496 - var7 >> 1, var3, 28972, var7, 40);
        this.field_O.setWidgetBounds(3 + var6, var3 + 15, 28972, 60, 40);
        this.field_O.field_A = (WidgetListener) (this);
        this.field_S.field_A = (WidgetListener) (this);
        this.addChild((byte) 78, this.field_S);
        this.addChild((byte) 75, this.field_O);
        this.field_J = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.field_J.setWidgetBounds(60 + this.field_V.field_n + this.field_V.field_y, 20 + this.field_V.field_i, 28972, -60 + (-this.field_V.field_n + (this.field_n - this.field_V.field_y)), 150);
        this.addChild((byte) 97, this.field_J);
        this.setWidgetBounds(0, 0, 28972, 496, var3 + 55 + var6);
    }

    static {
        field_Q = "Enter name of friend to delete from list";
        field_X = "Your zombies will resist 40% of all powerups...even if they're yours!";
    }
}
