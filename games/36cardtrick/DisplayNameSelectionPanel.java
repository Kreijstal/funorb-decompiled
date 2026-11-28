/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameSelectionPanel extends DequeWidgetContainer implements NameSuggestionListener, WidgetActivationListener {
    private InteractiveWidget field_F;
    static int[][] field_G;
    private InteractiveWidget field_H;
    private ValidatedTextField field_E;
    static String field_D;
    NameSuggestionsPanel field_I;

    private final int addLabeledFieldWithValidationMessage(String param0, int param1, UiWidget param2, String param3, int param4, int param5, byte param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        LabeledWidgetContainer var10 = null;
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
          var10 = new LabeledWidgetContainer(20, param4, 120 + param1, 25, param2, false, 120, 3, ModalDialogHost.field_C, 16777215, param0);
          this.addChild(var10, (byte) 118);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param2)).getFieldValidator(84), param3, 126, param4 + var10.field_q, 25 + param1, param5);
          var9.field_k = (WidgetEventListener) (this);
          if (param6 < 112) {
            discarded$1 = this.canSubmitDisplayName((byte) 89);
          }
          this.addChild(var9, (byte) 118);
          stackIn_3_0 = var10.field_q + var9.field_q;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("fh.GA(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(boolean param0) {
        if (param0) {
          ((AccountNameAvailabilityValidator) (this.field_E.getFieldValidator(-67))).invalidateCheckedName(80);
          return;
        }
        this.field_E = (ValidatedTextField) null;
        ((AccountNameAvailabilityValidator) (this.field_E.getFieldValidator(-67))).invalidateCheckedName(80);
    }

    final boolean handleKey(char param0, byte param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -99) {
            field_G = (int[][]) null;
          }
          if (super.handleKey(param0, (byte) -115, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_7_0 = this.focusPreviousChild(-85, param3);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(param3, (byte) -28);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fh.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != 200) {
          field_D = (String) null;
          field_D = null;
          field_G = (int[][]) null;
          return;
        }
        field_D = null;
        field_G = (int[][]) null;
    }

    public final void onNameSuggestionSelected(String param0, boolean param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          if (!param1) {
            String var5 = (String) null;
            this.onNameSuggestionSelected((String) null, true);
          }
          var3 = this.field_E;
          var4 = param0;
          ((EditableTextField) ((Object) var3)).setText(var4, -18845, false);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "fh.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public DisplayNameSelectionPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_E = new ValidatedTextField("", (WidgetEventListener) null, 12);
        DefaultTextWidgetRenderer var1 = new DefaultTextWidgetRenderer(me.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, ModalDialogHost.field_C.field_s, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(DialogMessagePane.field_F, var1, (WidgetEventListener) null);
        this.field_F = new InteractiveWidget(bl.field_g, (WidgetEventListener) null);
        this.field_H = new InteractiveWidget(cj.field_m, (WidgetEventListener) null);
        this.field_E.field_n = re.field_h;
        this.field_E.setFieldValidator((byte) 68, new AccountNameAvailabilityValidator(this.field_E));
        this.field_F.field_B = false;
        this.field_F.field_v = (WidgetRenderer) ((Object) new ki());
        this.field_H.field_v = (WidgetRenderer) ((Object) new nb());
        this.field_E.field_v = (WidgetRenderer) ((Object) new r(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.setBounds(50, var3, 270, 20, true);
        int var5 = 200;
        var3 += 50;
        this.addChild(var2, (byte) 118);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(this.field_E, pk.field_c, var3, 35, TextLayout.field_a, 170));
        this.field_F.setBounds(40, var3, var5, -var5 + 496 >> 1, true);
        this.field_H.setBounds(40, var3 + 15, 60, var4 + 3, true);
        this.field_H.field_k = (WidgetEventListener) (this);
        this.field_F.field_k = (WidgetEventListener) (this);
        this.addChild(this.field_F, (byte) 118);
        this.addChild(this.field_H, (byte) 118);
        this.field_I = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_I.setBounds(150, 20, -60 - this.field_E.field_o + (this.field_h - this.field_E.field_h), 60 + this.field_E.field_h + this.field_E.field_o, true);
        this.addChild(this.field_I, (byte) 118);
        this.setBounds(var3 + (55 + var4), 0, 496, 0, true);
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == this.field_H) {
            RichTextLayout.c(0);
          } else {
            if (param3 == this.field_F) {
              this.submitDisplayName(14831);
            }
          }
          var6_int = -80 % ((param1 + 62) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("fh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean canSubmitDisplayName(byte param0) {
        if (!this.isFieldValid(98, (FieldValidatorProvider) (this.field_E))) {
          return false;
        }
        if (param0 == 68) {
          return true;
        }
        this.field_F = (InteractiveWidget) null;
        return true;
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_F.field_B = this.canSubmitDisplayName((byte) 68);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void submitDisplayName(int param0) {
        if (param0 != 14831) {
          String var3 = (String) null;
          this.onNameSuggestionSelected((String) null, true);
          if (this.canSubmitDisplayName((byte) 68)) {
            EmailFormatValidator.a((byte) 68, this.field_E.field_r);
            return;
          }
          return;
        }
        if (this.canSubmitDisplayName((byte) 68)) {
          EmailFormatValidator.a((byte) 68, this.field_E.field_r);
          return;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          if (param2 != -1) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          var3 = null;
          if (ni.field_a != null &&
            !ni.field_a.equals(param0.getParameter("settings"))) {
            var3 = ni.field_a;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != ImageProducerRasterBuffer.field_l &&
            !ImageProducerRasterBuffer.field_l.equals(param0.getParameter("session"))) {
            var4Lifetime1 = ImageProducerRasterBuffer.field_l;
          }
          stackIn_11_0 = hi.a((String) (var3), param1, (String) (var4Lifetime1), -1, 353);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("fh.IA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.wrapException((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(UiWidget param0, String param1, int param2, int param3, String param4, int param5) {
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
          if (param3 != 35) {
            this.submitDisplayName(-7);
          }
          stackIn_3_0 = this.addLabeledFieldWithValidationMessage(param4, param5, param0, param1, param2, 35, (byte) 114);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("fh.D(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean isFieldValid(int param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        sg var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getFieldValidator(-52);
          if (var3 == null) {
            return true;
          }
          if (param0 != 98) {
            return false;
          }
          var4 = var3.getValidationStatus(true);
          stackIn_10_0 = (ii.field_e == var4);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fh.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_D = "Try again";
    }
}
