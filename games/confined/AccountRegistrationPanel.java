/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    private ValidatedTextField field_H;
    static String field_ab;
    static double field_Z;
    static PcmSample field_cb;
    private ValidatedTextField field_R;
    NameSuggestionsPanel field_O;
    private RichTextWidget field_T;
    static String field_L;
    private ValidatedTextField field_X;
    private fa field_bb;
    private ValidatedTextField field_U;
    private ValidatedTextField field_W;
    static int[] field_P;
    private InteractiveWidget field_Y;
    private ValidatedTextField field_V;
    private InteractiveWidget field_S;

    private final int addLabeledField(UiWidget param0, String param1, int param2, int param3, int param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param3, param2 + 120, 25, param0, false, param4, 3, gm.field_cb, 16777215, param1);
          this.addChild(var6, 10);
          stackIn_1_0 = var6.field_z;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("ke.A(");
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
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean submitRegistration(boolean param0) {
        if (!this.canSubmitRegistration((byte) -66)) {
          return false;
        }
        if (!param0) {
          String var4 = (String) null;
          this.onNameSuggestionSelected(-115, (String) null);
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_V.field_B);
        } catch (NumberFormatException numberFormatException) {
        }
        return ByteStorage.a(30692, this.field_U.field_B, this.field_bb.field_O, this, this.field_H.field_B, this.field_R.field_B, var2);
    }

    public final void onTextHotspotActivated(RichTextWidget param0, int param1, int param2, boolean param3) {
        int discarded$0 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        UiWidget var7 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (param1 != 0) {
            if (1 == param1) {
              tb.a(-15912, "privacy.ws");
            } else {
              if (param1 == 2) {
                tb.a(-15912, "conduct.ws");
              }
            }
          } else {
            tb.a(-15912, "terms.ws");
          }
          if (!param3) {
            return;
          }
          var7 = (UiWidget) null;
          discarded$0 = this.addLabeledFieldWithValidationIcon(-104, 80, (String) null, (byte) -57, (UiWidget) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ke.LA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_S.field_L = this.canSubmitRegistration((byte) -66);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ke.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean canSubmitRegistration(byte param0) {
        if (param0 != -66) {
          UiWidget var3 = (UiWidget) null;
          this.handleKey((UiWidget) null, (byte) 14, -34, '￤');
          if (!this.isFieldReadyForRegistration((byte) -111, (FieldValidatorProvider) (this.field_R))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) -7, (FieldValidatorProvider) (this.field_U))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 74, (FieldValidatorProvider) (this.field_W))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) -128, (FieldValidatorProvider) (this.field_H))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 37, (FieldValidatorProvider) (this.field_X))) {
            return false;
          }
          if (this.isFieldReadyForRegistration((byte) 23, (FieldValidatorProvider) (this.field_V))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) -111, (FieldValidatorProvider) (this.field_R))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) -7, (FieldValidatorProvider) (this.field_U))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 74, (FieldValidatorProvider) (this.field_W))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) -128, (FieldValidatorProvider) (this.field_H))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 37, (FieldValidatorProvider) (this.field_X))) {
          return false;
        }
        if (this.isFieldReadyForRegistration((byte) 23, (FieldValidatorProvider) (this.field_V))) {
          return true;
        }
        return false;
    }

    private final String getLinkOpenMarkup(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean isFieldReadyForRegistration(byte param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        fi var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getFieldValidator((byte) -9);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus(-3621);
          if (var4 == fb.field_e) {
            return false;
          }
          var5 = 26 % ((-60 - param0) / 47);
          if (var4 == ab.field_b) {
            return false;
          }
          if (gi.field_bb != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ke.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(byte param0) {
        String discarded$0 = null;
        ((AccountNameAvailabilityValidator) (this.field_R.getFieldValidator((byte) -9))).invalidateCheckedName(639775169);
        if (param0 > -101) {
          discarded$0 = this.getLinkCloseMarkup((byte) -41);
        }
    }

    final static void g(byte param0) {
        dn.field_b.replaceContent((UiWidget) (new GuestPlayConfirmationForm()), (byte) -72);
        if (param0 > -7) {
          field_ab = (String) null;
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_R = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_U = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_W = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_H = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_X = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_V = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_bb = new fa("", (WidgetEventListener) null, var1 != 0);
        this.field_S = new InteractiveWidget(he.field_c, (WidgetEventListener) null);
        this.field_Y = new InteractiveWidget(qn.field_m, (WidgetEventListener) null);
        this.field_R.field_C = DebouncedFieldValidator.field_b;
        this.field_U.field_C = p.field_a;
        this.field_W.field_C = tf.field_g;
        this.field_H.field_C = ModalDialog.field_O;
        this.field_X.field_C = DualLinkNode.field_m;
        this.field_V.field_C = rm.field_D;
        this.field_bb.field_C = HomingProjectile.field_U;
        this.field_R.setFieldValidator(-18312, new AccountNameAvailabilityValidator(this.field_R));
        this.field_U.setFieldValidator(-18312, new EmailFormatValidator(this.field_U));
        this.field_W.setFieldValidator(-18312, new ConfirmedEmailAvailabilityValidator(this.field_W, this.field_U));
        this.field_H.setFieldValidator(-18312, new PasswordValidator(this.field_H, this.field_R, this.field_U));
        this.field_X.setFieldValidator(-18312, new MatchingFieldValidator(this.field_X, this.field_H));
        this.field_V.setFieldValidator(-18312, new AgeValidator(this.field_V));
        this.field_S.field_L = false;
        this.field_S.field_n = (WidgetRenderer) ((Object) new je());
        this.field_Y.field_n = (WidgetRenderer) ((Object) new hk());
        this.field_R.field_n = (WidgetRenderer) ((Object) new db(10000536));
        db dupTemp$0 = new db(10000536);
        this.field_W.field_n = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_U.field_n = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_V.field_n = (WidgetRenderer) ((Object) new db(10000536));
        this.field_bb.field_n = (WidgetRenderer) ((Object) new cj());
        qm dupTemp$1 = new qm(10000536);
        this.field_X.field_n = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_H.field_n = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = b.a(new String[]{this.getLinkOpenMarkup(false), this.getLinkCloseMarkup((byte) -110)}, ui.field_e, 1177);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(this.field_U, oh.field_d, 170, var3, 120);
        var3 = var3 + (this.addLabeledFieldWithValidationMessage(this.field_W, 170, var3, UiWidget.field_A, "", 20, 20) + 5);
        var3 = var3 + this.addLabeledField(this.field_H, TextLayout.field_b, 170, var3, 120);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(CipherPacketBuffer.field_t, ProgressDialog.field_hb, 150, 170, var3, this.field_X));
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(rc.field_a, va.field_d, 150, 170, var3, this.field_R));
        var3 = var3 + this.addLabeledFieldWithValidationIcon(170, var3, qi.field_j, (byte) 59, this.field_V);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, -90 + this.field_F, 25, this.field_bb, true, -120 + this.field_F, 5, fa.field_Q, 11579568, ag.field_j);
        this.addChild(var4, 10);
        var3 = var3 + var4.field_z;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(gm.field_cb, 0, 0, 0, 0, 16777215, -1, 0, 0, gm.field_cb.field_C, -1, 2147483647, true);
        this.field_T = new RichTextWidget(var2, var5);
        this.field_T.field_C = "";
        this.field_T.setHotspotTooltip(0, (byte) 9, om.field_o);
        this.field_T.setHotspotTooltip(1, (byte) 9, om.field_o);
        this.field_T.field_t = (WidgetEventListener) (this);
        this.field_T.setTextBounds(var3, 46, this.field_F - 90, 8888);
        var3 = var3 + (this.field_T.field_z + 15);
        this.addChild(this.field_T, 10);
        int var6 = 4;
        int var7 = 200;
        this.field_S.setBounds(-116, var7, var3, 40, 496 - var7 >> 1);
        this.field_Y.setBounds(-119, 60, 15 + var3, 40, var6 + 3);
        this.field_Y.field_t = (WidgetEventListener) (this);
        this.field_S.field_t = (WidgetEventListener) (this);
        this.addChild(this.field_S, 10);
        this.addChild(this.field_Y, 10);
        this.field_O = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_O.setBounds(-128, -60 + (this.field_F - this.field_R.field_q) - this.field_R.field_F, 20 + this.field_R.field_m, 150, this.field_R.field_q - (-this.field_R.field_F - 60));
        this.addChild(this.field_O, 10);
        this.setBounds(-124, 496, 0, 55 + (var3 + var6), 0);
    }

    private final int addLabeledFieldWithValidationMessage(UiWidget param0, int param1, int param2, String param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        LabeledWidgetContainer var10 = null;
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
          var10 = new LabeledWidgetContainer(param5, param2, param1 + 120, 25, param0, false, 120, 3, gm.field_cb, 16777215, param3);
          this.addChild(var10, 10);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param0)).getFieldValidator((byte) -9), param4, 126, param2 + var10.field_z, param1 + 50, param6);
          var9.field_t = (WidgetEventListener) (this);
          this.addChild(var9, 10);
          stackIn_1_0 = var10.field_z + var9.field_z;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ke.MA(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean handleKey(UiWidget param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, (byte) -66, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_6_0 = this.focusPreviousChild(param0, 32);
            return stackIn_6_0;
          }
          if (param2 == 99) {
            stackIn_9_0 = this.focusNextChild(17731, param0);
            return stackIn_9_0;
          }
          var5_int = -44 % ((47 - param1) / 43);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ke.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationIcon(int param0, int param1, String param2, byte param3, UiWidget param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledWidgetContainer var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledWidgetContainer(20, param1, 120 + param0, 25, param4, false, 120, 3, gm.field_cb, 16777215, param2);
          this.addChild(var8, 10);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param4)).getFieldValidator((byte) -9));
          this.addChild(var7, 10);
          var7.setBounds(-127, 15, var8.field_m + (-15 + var8.field_z >> 1), 15, 3 + var8.field_q + var8.field_F);
          if (param3 != 59) {
            this.field_W = (ValidatedTextField) null;
          }
          stackIn_3_0 = var8.field_z;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("ke.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(String param0, String param1, int param2, int param3, int param4, UiWidget param5) {
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
          if (param2 != 150) {
            discarded$1 = this.canSubmitRegistration((byte) 79);
          }
          stackIn_3_0 = this.addLabeledFieldWithValidationMessage(param5, param3, param4, param0, param1, 20, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ke.GA(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        String discarded$2 = null;
        boolean discarded$3 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 68) {
            discarded$2 = this.getLinkCloseMarkup((byte) 75);
          }
          if (this.field_Y == param3) {
            AccountRegistrationPanel.g((byte) -107);
            return;
          }
          if (this.field_S != param3) {
            return;
          }
          discarded$3 = this.submitRegistration(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ke.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(int param0, String param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          if (param0 != 11579568) {
            this.field_bb = (fa) null;
          }
          var3 = this.field_R;
          var4 = param1;
          ((EditableTextField) ((Object) var3)).setText(false, false, var4);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ke.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void j(int param0) {
        field_ab = null;
        field_L = null;
        field_P = null;
        field_cb = null;
        if (param0 != -14508) {
          AccountRegistrationPanel.g((byte) -49);
        }
    }

    private final String getLinkCloseMarkup(byte param0) {
        if (param0 >= -8) {
          AccountRegistrationPanel.g((byte) -50);
          return "</col></u>";
        }
        return "</col></u>";
    }

    static {
        field_ab = "You already have 10 cluster missiles";
        field_P = new int[128];
        field_L = "Fly your ship in the confined space of the tunnel.#Take what you like. Blow up what you like.#Use their technology against them. Show no mercy.";
    }
}
