/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameSelectionPanel extends WidgetContainer implements NameSuggestionListener, WidgetActivationListener {
    static String field_C;
    private ValidatedTextField field_E;
    private InteractiveWidget field_G;
    static String field_B;
    static byte[][] field_D;
    NameSuggestionsPanel field_F;
    private InteractiveWidget field_H;

    private final boolean isFieldValid(int param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        cg var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getFieldValidator((byte) 65);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus(-28036);
          if (param0 == 31142) {
            stackIn_10_0 = (lg.field_c == var4);
            return stackIn_10_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("lj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(int param0, byte param1, UiWidget param2, String param3, String param4, int param5) {
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
          if (param1 == 64) {
            stackIn_4_0 = this.addLabeledFieldWithValidationMessage(param3, param0, param5, 35, param4, (byte) -120, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 105;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("lj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        ((AccountNameAvailabilityValidator) (this.field_E.getFieldValidator((byte) 119))).invalidateCheckedName(false);
        int var2 = -28 % ((param0 - 63) / 60);
    }

    public DisplayNameSelectionPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_E = new ValidatedTextField("", (WidgetEventListener) null, 12);
        DefaultTextWidgetRenderer var1 = new DefaultTextWidgetRenderer(de.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, si.field_V.field_N, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(l.field_d, var1, (WidgetEventListener) null);
        this.field_H = new InteractiveWidget(sf.field_e, (WidgetEventListener) null);
        this.field_G = new InteractiveWidget(bb.field_l, (WidgetEventListener) null);
        this.field_E.field_x = fc.field_d;
        this.field_E.setFieldValidator((byte) -2, new AccountNameAvailabilityValidator(this.field_E));
        this.field_H.field_E = false;
        this.field_H.field_u = (WidgetRenderer) ((Object) new b());
        this.field_G.field_u = (WidgetRenderer) ((Object) new ll());
        this.field_E.field_u = (WidgetRenderer) ((Object) new vg(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.setBounds(270, 20, var3, 50, 23987);
        int var5 = 200;
        var3 += 50;
        this.addChild(4, var2);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(170, (byte) 64, this.field_E, si.field_I, nk.field_h, var3));
        this.field_H.setBounds(var5, -var5 + 496 >> 1, var3, 40, 23987);
        this.field_G.setBounds(60, 3 + var4, var3 + 15, 40, 23987);
        this.field_G.field_v = (WidgetEventListener) (this);
        this.field_H.field_v = (WidgetEventListener) (this);
        this.addChild(4, this.field_H);
        this.addChild(4, this.field_G);
        this.field_F = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_F.setBounds(-60 + (-this.field_E.field_p + this.field_p - this.field_E.field_w), 60 + this.field_E.field_w + this.field_E.field_p, 20, 150, 23987);
        this.addChild(4, this.field_F);
        this.setBounds(496, 0, 0, var3 - (-55 - var4), 23987);
    }

    public static void clearStaticReferences(int param0) {
        field_C = null;
        field_B = null;
        if (param0 != 120) {
          return;
        }
        field_D = (byte[][]) null;
    }

    final void updatePointer(int param0, boolean param1, int param2, UiWidget param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_H.field_E = this.canSubmitDisplayName((byte) 34);
          if (param1) {
            this.field_E = (ValidatedTextField) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lj.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int addLabeledFieldWithValidationMessage(String param0, int param1, int param2, int param3, String param4, byte param5, UiWidget param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        int var10 = 0;
        LabeledWidgetContainer var11 = null;
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
          var11 = new LabeledWidgetContainer(20, param2, param1 + 120, 25, param6, false, 120, 3, si.field_V, 16777215, param0);
          this.addChild(4, var11);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param6)).getFieldValidator((byte) 48), param4, 126, var11.field_t + param2, param1 + 25, param3);
          var9.field_v = (WidgetEventListener) (this);
          var10 = -34 / ((-78 - param5) / 35);
          this.addChild(4, var9);
          stackIn_1_0 = var11.field_t + var9.field_t;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("lj.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, int param1, InteractiveWidget param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != this.field_G) {
            if (this.field_H == param2) {
              this.submitDisplayName((byte) 120);
            }
          } else {
            ll.c(32270);
          }
          if (!param3) {
            return;
          }
          this.field_F = (NameSuggestionsPanel) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("lj.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(byte param0, String param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          int var5 = 52 % ((param0 - 61) / 62);
          var3 = this.field_E;
          var4 = param1;
          ((EditableTextField) ((Object) var3)).setText((byte) 20, var4, false);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0 + 0, param1, param2, param3)) {
            return true;
          }
          if (param0 != 29657) {
            return true;
          }
          if (param1 == 98) {
            stackIn_9_0 = this.focusPreviousChild(param3, -8666);
            return stackIn_9_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_13_0 = this.focusNextChild(param3, (byte) 66);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("lj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void submitDisplayName(byte param0) {
        if (!this.canSubmitDisplayName((byte) 34)) {
          return;
        }
        IntrusiveNode.a(this.field_E.field_m, 97);
        int var2 = 72 / ((59 - param0) / 49);
    }

    private final boolean canSubmitDisplayName(byte param0) {
        if (!this.isFieldValid(param0 + 31108, (FieldValidatorProvider) (this.field_E))) {
          return false;
        }
        if (param0 == 34) {
          return true;
        }
        this.field_H = (InteractiveWidget) null;
        return true;
    }

    static {
        field_C = "You have 1 unread message!";
        field_B = "Loading extra data";
    }
}
