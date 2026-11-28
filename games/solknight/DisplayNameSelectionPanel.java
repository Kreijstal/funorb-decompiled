/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameSelectionPanel extends WidgetContainer implements NameSuggestionListener, WidgetActivationListener {
    static boolean field_G;
    static String field_H;
    private InteractiveWidget field_J;
    private InteractiveWidget field_I;
    NameSuggestionsPanel field_F;
    static IntrusiveDeque field_E;
    private ValidatedTextField field_K;

    public static void h(int param0) {
        if (param0 != 60) {
          DisplayNameSelectionPanel.b(-12, -36, false, 71);
          field_E = null;
          field_H = null;
          return;
        }
        field_E = null;
        field_H = null;
    }

    public final void onNameSuggestionsRefreshRequested(byte param0) {
        if (param0 == 22) {
          ((AccountNameAvailabilityValidator) (this.field_K.getFieldValidator(87))).invalidateCheckedName(true);
          return;
        }
        field_H = (String) null;
        ((AccountNameAvailabilityValidator) (this.field_K.getFieldValidator(87))).invalidateCheckedName(true);
    }

    private final void submitDisplayName(byte param0) {
        if (!this.canSubmitDisplayName((byte) -96)) {
          return;
        }
        tk.a((byte) -15, this.field_K.field_i);
        if (param0 <= 54) {
          field_G = true;
        }
    }

    final boolean handleKey(char param0, byte param1, int param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -34 / ((31 - param1) / 56);
          if (super.handleKey(param0, (byte) -30, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.focusPreviousChild((byte) -125, param3);
            return stackIn_6_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(123, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ga.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public DisplayNameSelectionPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_K = new ValidatedTextField("", (WidgetEventListener) null, 12);
        DefaultTextWidgetRenderer var1 = new DefaultTextWidgetRenderer(jh.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, NameSuggestionsPanel.field_G.field_F, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(cd.field_a, var1, (WidgetEventListener) null);
        this.field_J = new InteractiveWidget(MidiPcmStream.field_x, (WidgetEventListener) null);
        this.field_I = new InteractiveWidget(FullscreenStatusDialog.field_X, (WidgetEventListener) null);
        this.field_K.field_z = ql.field_u;
        this.field_K.setFieldValidator(new AccountNameAvailabilityValidator(this.field_K), false);
        this.field_J.field_B = false;
        this.field_J.field_w = (WidgetRenderer) ((Object) new gh());
        this.field_I.field_w = (WidgetRenderer) ((Object) new ri());
        this.field_K.field_w = (WidgetRenderer) ((Object) new uf(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(50, 270, 20, 0, var3);
        var3 += 50;
        this.addChild(var2, 5411);
        var3 = var3 + (5 + this.a(var3, 15016, eb.field_a, this.field_K, 170, uc.field_k));
        this.field_J.setBounds(40, var5, 496 - var5 >> 1, 0, var3);
        this.field_I.setBounds(40, 60, 3 + var4, 0, 15 + var3);
        this.field_I.field_n = (WidgetEventListener) (this);
        this.field_J.field_n = (WidgetEventListener) (this);
        this.addChild(this.field_J, 5411);
        this.addChild(this.field_I, 5411);
        this.field_F = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_F.setBounds(150, -this.field_K.field_t + (this.field_t - this.field_K.field_m - 60), 60 + (this.field_K.field_m + this.field_K.field_t), 0, 20);
        this.addChild(this.field_F, 5411);
        this.setBounds(55 + var3 + var4, 496, 0, 0, 0);
    }

    public final void onNameSuggestionSelected(boolean param0, String param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        if (!param0) {
          return;
        }
        try {
          var3 = this.field_K;
          var4 = param1;
          ((EditableTextField) ((Object) var3)).setText(74, false, var4);
        } catch (RuntimeException runtimeException) {
          throw fc.wrapClientException((Throwable) ((Object) runtimeException), "ga.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, String param2, UiWidget param3, int param4, String param5) {
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
          if (param1 != 15016) {
            this.field_I = (InteractiveWidget) null;
          }
          stackIn_3_0 = this.a((byte) -121, 35, param5, param4, param3, param0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ga.J(").append(param0).append(',').append(param1).append(',');
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
          throw fc.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean isFieldValid(int param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        qf var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 270) {
            this.field_J = (InteractiveWidget) null;
          }
          var3 = param1.getFieldValidator(96);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus(-9362);
          stackIn_9_0 = (var4 == ph.field_g);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ga.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiWidget param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_J.field_B = this.canSubmitDisplayName((byte) -119);
        } catch (RuntimeException runtimeException) {
          throw fc.wrapClientException((Throwable) ((Object) runtimeException), "ga.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          pb.field_b = param0;
          hc.field_d = param1;
          FrameTimer.field_c = param3;
          return;
        }
        field_E = (IntrusiveDeque) null;
        pb.field_b = param0;
        hc.field_d = param1;
        FrameTimer.field_c = param3;
    }

    private final boolean canSubmitDisplayName(byte param0) {
        if (param0 < -63) {
          return this.isFieldValid(270, (FieldValidatorProvider) (this.field_K)) ? true : false;
        }
        field_H = (String) null;
        if (!this.isFieldValid(270, (FieldValidatorProvider) (this.field_K))) {
          return false;
        }
        return true;
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            return;
          }
          if (param3 == this.field_I) {
            ok.a((byte) 119);
            return;
          }
          if (param3 != this.field_J) {
            return;
          }
          this.submitDisplayName((byte) 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ga.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, String param2, int param3, UiWidget param4, int param5, String param6) {
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
          var10 = new LabeledWidgetContainer(20, param5, 120 + param3, 25, param4, false, 120, 3, NameSuggestionsPanel.field_G, 16777215, param6);
          this.addChild(var10, 5411);
          if (param0 != -121) {
            DisplayNameSelectionPanel.b(-99, 56, false, 23);
          }
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param4)).getFieldValidator(99), param2, 126, param5 + var10.field_x, param3 + 25, param1);
          var9.field_n = (WidgetEventListener) (this);
          this.addChild(var9, 5411);
          stackIn_3_0 = var9.field_x + var10.field_x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ga.G(").append(param0).append(',').append(param1).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_H = "Log in";
        field_G = false;
        field_E = new IntrusiveDeque();
    }
}
