/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    NameSuggestionsPanel field_M;
    static String field_H;
    static boolean field_N;
    private of field_P;
    private ValidatedTextField field_O;
    static int field_C;
    private ValidatedTextField field_G;
    private RichTextWidget field_L;
    private ValidatedTextField field_D;
    private InteractiveWidget field_K;
    private InteractiveWidget field_F;
    private ValidatedTextField field_E;
    static String field_A;
    private ValidatedTextField field_J;
    private ValidatedTextField field_B;

    private final String getLinkOpenMarkup(byte param0) {
        if (param0 < 24) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int addLabeledFieldWithValidationMessage(int param0, int param1, String param2, int param3, String param4, byte param5, UiWidget param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        LabeledWidgetContainer var10 = null;
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
          var10 = new LabeledWidgetContainer(20, param1, 120 + param3, 25, param6, false, 120, 3, lm.field_f, 16777215, param4);
          if (param5 != -81) {
            stackIn_2_0 = 5;
            return stackIn_2_0;
          }
          this.addChild(var10, (byte) 74);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param6)).getFieldValidator((byte) -115), param2, 126, param1 + var10.field_r, 50 + param3, param0);
          var9.field_h = (WidgetEventListener) (this);
          this.addChild(var9, (byte) 74);
          stackIn_4_0 = var9.field_r + var10.field_r;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("rf.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_B = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_O = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_G = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_D = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_J = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_E = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_P = new of("", (WidgetEventListener) null, var1 != 0);
        this.field_K = new InteractiveWidget(SoundCache.field_f, (WidgetEventListener) null);
        this.field_F = new InteractiveWidget(bi.field_b, (WidgetEventListener) null);
        this.field_B.field_i = bg.field_b;
        this.field_O.field_i = ce.field_b;
        this.field_G.field_i = AccountNameAvailabilityValidator.field_s;
        this.field_D.field_i = ba.field_g;
        this.field_J.field_i = fk.field_a;
        this.field_E.field_i = df.field_c;
        this.field_P.field_i = OrbDefence.field_C;
        this.field_B.setFieldValidator(new AccountNameAvailabilityValidator(this.field_B), 67);
        this.field_O.setFieldValidator(new EmailFormatValidator(this.field_O), 45);
        this.field_G.setFieldValidator(new ConfirmedEmailAvailabilityValidator(this.field_G, this.field_O), 79);
        this.field_D.setFieldValidator(new PasswordValidator(this.field_D, this.field_B, this.field_O), 34);
        this.field_J.setFieldValidator(new MatchingFieldValidator(this.field_J, this.field_D), 53);
        this.field_E.setFieldValidator(new AgeValidator(this.field_E), 33);
        this.field_K.field_F = false;
        this.field_K.field_j = (WidgetRenderer) ((Object) new vk());
        this.field_F.field_j = (WidgetRenderer) ((Object) new qc());
        this.field_B.field_j = (WidgetRenderer) ((Object) new fg(10000536));
        fg dupTemp$0 = new fg(10000536);
        this.field_G.field_j = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_O.field_j = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_E.field_j = (WidgetRenderer) ((Object) new fg(10000536));
        this.field_P.field_j = (WidgetRenderer) ((Object) new fi());
        eg dupTemp$1 = new eg(10000536);
        this.field_J.field_j = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_D.field_j = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = CrossfadingMidiPcmStream.a(-415993727, new String[]{this.getLinkOpenMarkup((byte) 105), this.getLinkCloseMarkup((byte) -128)}, AgeValidator.field_n);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(var3, this.field_O, 170, (byte) -82, ef.field_h);
        var3 = var3 + (this.addLabeledFieldWithValidationMessage(20, var3, "", 170, a.field_u, (byte) -81, this.field_G) + 5);
        var3 = var3 + this.addLabeledField(var3, this.field_D, 170, (byte) -82, TextFieldValidator.field_h);
        var3 = var3 + (this.addLabeledFieldWithDefaultValidationMessage(170, var3, pf.field_c, lm.field_b, this.field_J, false) + 5);
        var3 = var3 + (this.addLabeledFieldWithDefaultValidationMessage(170, var3, bh.field_a, ja.field_b, this.field_B, false) + 5);
        var3 = var3 + this.addLabeledFieldWithValidationIcon(var3, 170, pi.field_c, this.field_E, 25);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, -90 + this.field_m, 25, this.field_P, true, this.field_m - 120, 5, StandardContentDialog.field_bb, 11579568, rh.field_d);
        this.addChild(var4, (byte) 74);
        var3 = var3 + var4.field_r;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(lm.field_f, 0, 0, 0, 0, 16777215, -1, 0, 0, lm.field_f.field_H, -1, 2147483647, true);
        this.field_L = new RichTextWidget(var2, var5);
        this.field_L.field_i = "";
        this.field_L.setHotspotTooltip(0, ConfirmedEmailAvailabilityValidator.field_p, 2);
        this.field_L.setHotspotTooltip(1, ConfirmedEmailAvailabilityValidator.field_p, 2);
        this.field_L.field_h = (WidgetEventListener) (this);
        this.field_L.setTextBounds(var3, (byte) 53, -90 + this.field_m, 46);
        var3 = var3 + (this.field_L.field_r + 15);
        this.addChild(this.field_L, (byte) 74);
        int var6 = 4;
        int var7 = 200;
        this.field_K.setBounds(-var7 + 496 >> 1, var3, 40, (byte) -90, var7);
        this.field_F.setBounds(3 + var6, var3 + 15, 40, (byte) -90, 60);
        this.field_F.field_h = (WidgetEventListener) (this);
        this.field_K.field_h = (WidgetEventListener) (this);
        this.addChild(this.field_K, (byte) 74);
        this.addChild(this.field_F, (byte) 74);
        this.field_M = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_M.setBounds(this.field_B.field_m + (this.field_B.field_s + 60), this.field_B.field_n + 20, 150, (byte) -90, this.field_m - (this.field_B.field_s + this.field_B.field_m + 60));
        this.addChild(this.field_M, (byte) 74);
        this.setBounds(0, 0, var6 + var3 + 55, (byte) -90, 496);
    }

    private final String getLinkCloseMarkup(byte param0) {
        int var2 = -43 % ((-69 - param0) / 52);
        return "</col></u>";
    }

    final boolean handleKey(char param0, int param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_7_0 = this.focusPreviousChild(param2, false);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(param2, false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rf.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean l(int param0) {
        int var1 = 68 % ((param0 - 46) / 52);
        return 250 < ji.field_b ? true : false;
    }

    public final void onNameSuggestionSelected(int param0, String param1) {
        ValidatedTextField var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        UiWidget var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_B;
          var4 = param1;
          ((EditableTextField) ((Object) var3)).setText(0, false, var4);
          if (param0 >= 104) {
            return;
          }
          var5 = (UiWidget) null;
          this.handleKey('k', 11, (UiWidget) null, -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("rf.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationIcon(int param0, int param1, String param2, UiWidget param3, int param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledWidgetContainer var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledWidgetContainer(20, param0, param1 + 120, param4, param3, false, 120, 3, lm.field_f, 16777215, param2);
          this.addChild(var8, (byte) 74);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param3)).getFieldValidator((byte) -113));
          this.addChild(var7, (byte) 74);
          var7.setBounds(3 + (var8.field_m + var8.field_s), var8.field_n + (var8.field_r - 15 >> 1), 15, (byte) -90, 15);
          stackIn_1_0 = var8.field_r;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("rf.S(").append(param0).append(',').append(param1).append(',');
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
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void onWidgetActivated(byte param0, int param1, int param2, InteractiveWidget param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          if (this.field_F == param3) {
            qd.a((byte) 122);
          } else {
            if (this.field_K == param3) {
              discarded$1 = this.submitRegistration(false);
            }
          }
          var6_int = 18 / ((-3 - param0) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("rf.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean submitRegistration(boolean param0) {
        if (!this.canSubmitRegistration(20)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_E.field_l);
        } catch (NumberFormatException numberFormatException) {
        }
        if (!param0) {
          return ie.a(var2, -10031, this.field_B.field_l, this.field_O.field_l, this, this.field_P.field_D, this.field_D.field_l);
        }
        boolean discarded$0 = this.submitRegistration(false);
        return ie.a(var2, -10031, this.field_B.field_l, this.field_O.field_l, this, this.field_P.field_D, this.field_D.field_l);
    }

    private final int addLabeledFieldWithDefaultValidationMessage(int param0, int param1, String param2, String param3, UiWidget param4, boolean param5) {
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
          if (param5) {
            field_C = 113;
          }
          stackIn_3_0 = this.addLabeledFieldWithValidationMessage(35, param1, param3, param0, param2, (byte) -81, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("rf.G(").append(param0).append(',').append(param1).append(',');
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
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(byte param0) {
        int discarded$0 = 0;
        ((AccountNameAvailabilityValidator) (this.field_B.getFieldValidator((byte) 65))).invalidateCheckedName((byte) 77);
        if (param0 != -8) {
          String var3 = (String) null;
          discarded$0 = this.addLabeledField(-125, (UiWidget) null, 66, (byte) 102, (String) null);
        }
    }

    final void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_K.field_F = this.canSubmitRegistration(20);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "rf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean canSubmitRegistration(int param0) {
        int discarded$0 = 0;
        UiWidget var3;
        if (param0 == 20) {
          if (!this.isFieldReadyForRegistration(this.field_B, -94)) {
            return false;
          }
          if (!this.isFieldReadyForRegistration(this.field_O, param0 ^ 73)) {
            return false;
          }
          if (!this.isFieldReadyForRegistration(this.field_G, param0 ^ 59)) {
            return false;
          }
          if (!this.isFieldReadyForRegistration(this.field_D, -98)) {
            return false;
          }
          if (!this.isFieldReadyForRegistration(this.field_J, -112)) {
            return false;
          }
          if (!this.isFieldReadyForRegistration(this.field_E, -118)) {
            return false;
          }
          return true;
        }
        var3 = (UiWidget) null;
        discarded$0 = this.addLabeledFieldWithDefaultValidationMessage(77, -40, (String) null, (String) null, (UiWidget) null, false);
        if (!this.isFieldReadyForRegistration(this.field_B, -94)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_O, param0 ^ 73)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_G, param0 ^ 59)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_D, -98)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_J, -112)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_E, -118)) {
          return false;
        }
        return true;
    }

    public static void clearStaticReferences(boolean param0) {
        field_H = null;
        if (param0) {
          return;
        }
        field_A = null;
    }

    private final boolean isFieldReadyForRegistration(FieldValidatorProvider param0, int param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        qd var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getFieldValidator((byte) 89);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus(-7847);
          var5 = -60 % ((-34 - param1) / 60);
          if (var4 == vh.field_h) {
            return false;
          }
          if (var4 == ml.field_a) {
            return false;
          }
          if (fm.field_a != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("rf.W(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int addLabeledField(int param0, UiWidget param1, int param2, byte param3, String param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        RichTextWidget var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param0, param2 + 120, 25, param1, false, 120, 3, lm.field_f, 16777215, param4);
          this.addChild(var6, (byte) 74);
          if (param3 != -82) {
            var7 = (RichTextWidget) null;
            this.onTextHotspotActivated(-72, -9, (byte) -113, (RichTextWidget) null);
          }
          stackIn_3_0 = var6.field_r;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("rf.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void onTextHotspotActivated(int param0, int param1, byte param2, RichTextWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (0 != param1) {
            if (1 != param1) {
              if (param1 == 2) {
                DualLinkDequeIterator.a("conduct.ws", 1);
              }
            } else {
              DualLinkDequeIterator.a("privacy.ws", 1);
            }
          } else {
            DualLinkDequeIterator.a("terms.ws", 1);
          }
          if (param2 == 101) {
            return;
          }
          AccountRegistrationPanel.clearStaticReferences(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void d(boolean param0) {
        String var2 = null;
        String var2Lifetime1;
        if (!param0) {
          var2 = (String) null;
          TextLineMetrics.a((String) null, 0, ModalDialogHost.field_G);
          return;
        }
        field_C = 44;
        var2Lifetime1 = (String) null;
        TextLineMetrics.a((String) null, 0, ModalDialogHost.field_G);
    }

    static {
        field_H = "<%0>.<%1>k";
        field_A = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_N = false;
    }
}
