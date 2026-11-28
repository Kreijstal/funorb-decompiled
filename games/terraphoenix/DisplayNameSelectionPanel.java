/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameSelectionPanel extends WidgetContainer implements NameSuggestionListener, WidgetActivationListener {
    static int field_H;
    NameSuggestionsPanel field_N;
    private InteractiveWidget field_K;
    static String field_L;
    static int field_I;
    static java.awt.Canvas field_G;
    private InteractiveWidget field_O;
    private ValidatedTextField field_J;
    static long field_M;
    static String field_F;

    public static void clearStaticReferences(int param0) {
        field_L = null;
        field_G = null;
        field_F = null;
        if (param0 != -13271) {
          DisplayNameSelectionPanel.clearStaticReferences(-27);
        }
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_O == param0) {
            TextLayout.a(1);
          } else {
            if (param0 == this.field_K) {
              this.submitDisplayName(50);
            }
          }
          var6_int = -85 / ((-5 - param4) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ae.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, String param2) {
        try {
          na.a(false, param2, 92, param0);
          if (param1 < 52) {
            DisplayNameSelectionPanel.clearStaticReferences(-17);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "ae.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(UiWidget param0, int param1, int param2, int param3) {
        if (param3 <= 25) {
          return;
        }
        try {
          super.a(param0, param1, param2, 123);
          this.field_K.field_A = this.canSubmitDisplayName((byte) 19);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "ae.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean canSubmitDisplayName(byte param0) {
        if (!this.isFieldValid((byte) 122, (FieldValidatorProvider) (this.field_J))) {
          return false;
        }
        int var2 = -89 / ((param0 + 47) / 49);
        return true;
    }

    private final int a(String param0, String param1, int param2, int param3, UiWidget param4, int param5) {
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
          if (param5 < -115) {
            stackIn_4_0 = this.a(param2, -18366, param3, param0, 35, param1, param4);
            return stackIn_4_0;
          }
          stackIn_2_0 = -71;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("ae.Q(");
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
          throw qk.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean isFieldValid(byte param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        im var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 118 / ((param0 - 70) / 51);
          var3 = param1.getFieldValidator(29730);
          if (var3 == null) {
            return true;
          }
          var5 = var3.getValidationStatus(-16323);
          stackIn_7_0 = (var5 == dg.field_c);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ae.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public DisplayNameSelectionPanel() {
        super(0, 0, 496, 0, (WidgetActionListener) null);
        this.field_J = new ValidatedTextField("", (sc) null, 12);
        DefaultTextWidgetRenderer var1 = new DefaultTextWidgetRenderer(ra.field_l, 0, 0, 0, 0, 16777215, -1, 3, 0, qk.field_e.field_s, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(wj.field_f, var1, (sc) null);
        this.field_K = new InteractiveWidget(BattleUnit.field_lb, (sc) null);
        this.field_O = new InteractiveWidget(lf.field_d, (sc) null);
        this.field_J.field_x = p.field_g;
        this.field_J.setFieldValidator(new AccountNameAvailabilityValidator(this.field_J), 5859);
        this.field_K.field_A = false;
        this.field_K.listener = (WidgetActionListener) ((Object) new ic());
        this.field_O.listener = (WidgetActionListener) ((Object) new qh());
        this.field_J.listener = (WidgetActionListener) ((Object) new ng(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(var3, (byte) 83, 270, 20, 50);
        this.b((byte) 95, var2);
        var3 += 50;
        var3 = var3 + (this.a(ag.field_b, im.field_b, 170, var3, this.field_J, -117) + 5);
        this.field_K.a(var3, (byte) 46, var5, -var5 + 496 >> 1, 40);
        this.field_O.a(var3 + 15, (byte) 73, 60, 3 + var4, 40);
        this.field_O.field_r = (sc) (this);
        this.field_K.field_r = (sc) (this);
        this.b((byte) 95, this.field_K);
        this.b((byte) 95, this.field_O);
        this.field_N = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_N.a(20, (byte) 68, -60 - this.field_J.width + (-this.field_J.x + this.width), 60 + (this.field_J.width + this.field_J.x), 150);
        this.b((byte) 95, this.field_N);
        this.a(0, (byte) 94, 496, 0, var3 - (-55 - var4));
    }

    private final int a(int param0, int param1, int param2, String param3, int param4, String param5, UiWidget param6) {
        RuntimeException var8 = null;
        ki var9 = null;
        j var10 = null;
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
          if (param1 != -18366) {
            stackIn_2_0 = 17;
            return stackIn_2_0;
          }
          var10 = new j(20, param2, param0 + 120, 25, param6, false, 120, 3, qk.field_e, 16777215, param3);
          this.b((byte) 95, var10);
          var9 = new ki(((FieldValidatorProvider) ((Object) param6)).getFieldValidator(29730), param5, 126, var10.height + param2, param0 + 25, param4);
          var9.field_r = (sc) (this);
          this.b((byte) 95, var9);
          stackIn_4_0 = var10.height + var9.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ae.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void submitDisplayName(int param0) {
        if (!this.canSubmitDisplayName((byte) 70)) {
          return;
        }
        if (param0 != 50) {
          return;
        }
        vf.a(this.field_J.text, param0 - 17);
    }

    public final void onNameSuggestionSelected(String param0, int param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_J;
          var4 = param0;
          int var5 = 127 % ((2 - param1) / 51);
          ((EditableTextField) ((Object) var3)).setText(false, (byte) -120, var4);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "ae.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(char param0, UiWidget param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2 ^ 0, param3)) {
            return true;
          }
          if (param2 != 30) {
            field_F = (String) null;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.a(48, param1);
            return stackIn_7_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param1, (byte) 114);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ae.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        ((AccountNameAvailabilityValidator) (this.field_J.getFieldValidator(29730))).invalidateCheckedName(-4328);
        if (param0 != 50) {
          field_G = (java.awt.Canvas) null;
        }
    }

    static {
        field_L = "If you do not wish to save at this time, click below.";
        field_H = 0;
        field_M = 0L;
        field_F = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_I = 0;
    }
}
