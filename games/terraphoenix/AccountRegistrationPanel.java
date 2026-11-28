/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends WidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    static int field_P;
    private RichTextWidget field_T;
    private ValidatedTextField field_R;
    private df field_W;
    private ValidatedTextField field_J;
    private InteractiveWidget field_M;
    private InteractiveWidget field_O;
    static long field_Q;
    static int field_L;
    static String field_G;
    static String field_V;
    private ValidatedTextField field_I;
    private ValidatedTextField field_H;
    NameSuggestionsPanel field_N;
    private ValidatedTextField field_U;
    private ValidatedTextField field_S;

    final static Object storeBytes(byte[] param0, boolean param1, boolean param2) {
        DirectByteStorage var3 = null;
        RuntimeException var3_ref = null;
        DirectByteStorage stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param2) {
            field_P = -101;
          }
          if (param0.length > 136) {
            var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).setBytes(param0, false);
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (!param1) {
            stackIn_13_0 = (byte[]) (param0);
            return stackIn_13_0;
          }
          stackIn_11_0 = li.copyBytes(0, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("pl.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationIcon(int param0, boolean param1, String param2, UiWidget param3, int param4) {
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
          var8 = new LabeledWidgetContainer(20, param4, 120 + param0, 25, param3, param1, 120, 3, qk.field_e, 16777215, param2);
          this.addChild((byte) 95, var8);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param3)).getFieldValidator(29730));
          this.addChild((byte) 95, var7);
          var7.setBounds((var8.height - 15 >> 1) + var8.y, (byte) 113, 15, var8.x + var8.width + 3, 15);
          stackIn_1_0 = var8.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("pl.G(").append(param0).append(',').append(param1).append(',');
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
          throw qk.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetActionListener) null);
        this.field_J = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_S = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_I = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_H = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_U = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_R = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_W = new df("", (WidgetEventListener) null, var1 != 0);
        this.field_O = new InteractiveWidget(fm.field_a, (WidgetEventListener) null);
        this.field_M = new InteractiveWidget(sl.field_f, (WidgetEventListener) null);
        this.field_J.field_x = p.field_g;
        this.field_S.field_x = tg.field_h;
        this.field_I.field_x = ga.field_p;
        this.field_H.field_x = ValidationStatusWidget.field_Y;
        this.field_U.field_x = be.field_y;
        this.field_R.field_x = bl.field_c;
        this.field_W.field_x = hd.field_j;
        this.field_J.setFieldValidator(new AccountNameAvailabilityValidator(this.field_J), 5859);
        this.field_S.setFieldValidator(new EmailFormatValidator(this.field_S), 5859);
        this.field_I.setFieldValidator(new ConfirmedEmailAvailabilityValidator(this.field_I, this.field_S), 5859);
        this.field_H.setFieldValidator(new PasswordValidator(this.field_H, this.field_J, this.field_S), 5859);
        this.field_U.setFieldValidator(new MatchingFieldValidator(this.field_U, this.field_H), 5859);
        this.field_R.setFieldValidator(new AgeValidator(this.field_R), 5859);
        this.field_O.field_A = false;
        this.field_O.listener = (WidgetActionListener) ((Object) new ic());
        this.field_M.listener = (WidgetActionListener) ((Object) new qh());
        this.field_J.listener = (WidgetActionListener) ((Object) new ng(10000536));
        ng dupTemp$0 = new ng(10000536);
        this.field_I.listener = (WidgetActionListener) ((Object) dupTemp$0);
        this.field_S.listener = (WidgetActionListener) ((Object) dupTemp$0);
        this.field_R.listener = (WidgetActionListener) ((Object) new ng(10000536));
        this.field_W.listener = (WidgetActionListener) ((Object) new kj());
        ah dupTemp$1 = new ah(10000536);
        this.field_U.listener = (WidgetActionListener) ((Object) dupTemp$1);
        this.field_H.listener = (WidgetActionListener) ((Object) dupTemp$1);
        String var2 = MessageKeys.a(new String[]{this.getLinkOpenMarkup(46), this.getLinkCloseMarkup((byte) 9)}, -1, h.field_d);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(g.field_nb, this.field_S, 170, 16777215, var3);
        var3 = var3 + (5 + this.addLabeledFieldWithValidationMessage(false, 20, "", this.field_I, bh.field_h, var3, 170));
        var3 = var3 + this.addLabeledField(InteractiveWidget.field_E, this.field_H, 170, 16777215, var3);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(q.field_Kb, this.field_U, var3, EditableTextField.field_N, 170, 16777215));
        var3 = var3 + (this.addLabeledFieldWithDefaultValidationMessage(im.field_b, this.field_J, var3, ag.field_b, 170, 16777215) + 5);
        var3 = var3 + this.addLabeledFieldWithValidationIcon(170, false, ig.field_d, this.field_R, var3);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, this.width - 90, 25, this.field_W, true, this.width - 120, 5, ra.field_l, 11579568, p.field_b);
        this.addChild((byte) 95, var4);
        var3 = var3 + var4.height;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(qk.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, qk.field_e.field_s, -1, 2147483647, true);
        this.field_T = new RichTextWidget(var2, var5);
        this.field_T.field_x = "";
        this.field_T.setHotspotTooltip(0, ig.field_b, (byte) -104);
        this.field_T.setHotspotTooltip(1, ig.field_b, (byte) -12);
        this.field_T.field_r = (WidgetEventListener) (this);
        this.field_T.setTextBounds(var3, -57, 46, -90 + this.width);
        var3 = var3 + (15 + this.field_T.height);
        this.addChild((byte) 95, this.field_T);
        int var6 = 4;
        int var7 = 200;
        this.field_O.setBounds(var3, (byte) 105, var7, 496 - var7 >> 1, 40);
        this.field_M.setBounds(15 + var3, (byte) 95, 60, var6 + 3, 40);
        this.field_M.field_r = (WidgetEventListener) (this);
        this.field_O.field_r = (WidgetEventListener) (this);
        this.addChild((byte) 95, this.field_O);
        this.addChild((byte) 95, this.field_M);
        this.field_N = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_N.setBounds(this.field_J.y + 20, (byte) 61, this.width - this.field_J.x + (-this.field_J.width - 60), 60 + (this.field_J.x + this.field_J.width), 150);
        this.addChild((byte) 95, this.field_N);
        this.setBounds(0, (byte) 56, 496, 0, 55 + (var3 + var6));
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        try {
          if (param0 == this.field_M) {
            DefaultTextWidgetRenderer.c(-113);
          } else {
            if (param0 == this.field_O) {
              discarded$0 = this.submitRegistration((byte) -111);
            }
          }
          int var6_int = 105 / ((param4 + 5) / 57);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "pl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(String param0, UiWidget param1, int param2, String param3, int param4, int param5) {
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
          if (param5 != 16777215) {
            this.field_U = (ValidatedTextField) null;
          }
          stackIn_3_0 = this.addLabeledFieldWithValidationMessage(false, 35, param0, param1, param3, param2, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("pl.Q(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        super.updatePointer(param0, param1, param2, 106);
        if (param3 < 25) {
          return;
        }
        try {
          this.field_O.field_A = this.canSubmitRegistration((byte) -85);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean submitRegistration(byte param0) {
        if (!this.canSubmitRegistration((byte) -100)) {
          return false;
        }
        int var3 = -84 / ((param0 + 50) / 49);
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_R.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return vf.a(this, this.field_S.text, this.field_W.field_C, var2, false, this.field_J.text, this.field_H.text);
    }

    public final void onNameSuggestionSelected(String param0, int param1) {
        ValidatedTextField var4 = null;
        String var5 = null;
        try {
          int var3_int = -6 / ((param1 - 2) / 51);
          var4 = this.field_J;
          var5 = param0;
          ((EditableTextField) ((Object) var4)).setText(false, (byte) -123, var5);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "pl.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean canSubmitRegistration(byte param0) {
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_J), (byte) -31)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_S), (byte) -39)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_I), (byte) -25)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_H), (byte) -86)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_U), (byte) -125)) {
          return false;
        }
        if (this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_R), (byte) -73)) {
          int var2 = -127 % ((param0 - 27) / 37);
          return true;
        }
        return false;
    }

    public final void onTextHotspotActivated(byte param0, RichTextWidget param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_intLifetime1;
        var6 = Terraphoenix.field_V;
        try {
          if (param3 != 0) {
            if (1 == param3) {
              TextLayout.a((byte) -29, "privacy.ws");
            } else {
              if (2 != param3) {
                var5_int = -53 / ((-10 - param0) / 40);
                return;
              }
              TextLayout.a((byte) -29, "conduct.ws");
            }
          } else {
            TextLayout.a((byte) -29, "terms.ws");
          }
          var5_intLifetime1 = -53 / ((-10 - param0) / 40);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationMessage(boolean param0, int param1, String param2, UiWidget param3, String param4, int param5, int param6) {
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
          var10 = new LabeledWidgetContainer(20, param5, 120 + param6, 25, param3, param0, 120, 3, qk.field_e, 16777215, param4);
          this.addChild((byte) 95, var10);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param3)).getFieldValidator(29730), param2, 126, var10.height + param5, 50 + param6, param1);
          var9.field_r = (WidgetEventListener) (this);
          this.addChild((byte) 95, var9);
          stackIn_1_0 = var9.height + var10.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("pl.S(").append(param0).append(',').append(param1).append(',');
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
          throw qk.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final String getLinkOpenMarkup(int param0) {
        if (param0 != 46) {
          field_G = (String) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int addLabeledField(String param0, UiWidget param1, int param2, int param3, int param4) {
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
          var6 = new LabeledWidgetContainer(20, param4, 120 + param2, 25, param1, false, 120, 3, qk.field_e, param3, param0);
          this.addChild((byte) 95, var6);
          stackIn_1_0 = var6.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("pl.H(");
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
          throw qk.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean isFieldReadyForRegistration(FieldValidatorProvider param0, byte param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        im var4 = null;
        byte[] var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -16) {
            var5 = (byte[]) null;
            AccountRegistrationPanel.storeBytes((byte[]) null, false, true);
          }
          var3 = param0.getFieldValidator(29730);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus(-16323);
          if (var4 == FullscreenNoticeType.field_d) {
            return false;
          }
          if (var4 == kj.field_d) {
            return false;
          }
          if (var4 != ab.field_d) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("pl.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_G = null;
        field_V = null;
        if (param0 <= 101) {
          field_G = (String) null;
        }
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        if (param0 == 50) {
          ((AccountNameAvailabilityValidator) (this.field_J.getFieldValidator(29730))).invalidateCheckedName(-4328);
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.updatePointer((UiWidget) null, 45, -116, 19);
        ((AccountNameAvailabilityValidator) (this.field_J.getFieldValidator(29730))).invalidateCheckedName(-4328);
    }

    private final String getLinkCloseMarkup(byte param0) {
        if (param0 <= 4) {
          return (String) null;
        }
        return "</col></u>";
    }

    final boolean handleKey(char param0, UiWidget param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_6_0 = this.focusPreviousChild(48, param1);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(param1, (byte) 121);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pl.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_G = "Clear all enemies out from the area";
        field_V = "Play free version";
    }
}
