/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameSelectionPanel extends DequeWidgetContainer implements NameSuggestionListener, WidgetActivationListener {
    NameSuggestionsPanel field_H;
    static String field_S;
    static od[][] field_R;
    static int[][] field_L;
    private InteractiveWidget field_Q;
    private ValidatedTextField field_O;
    private InteractiveWidget field_P;

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_Q.field_L = this.canSubmitDisplayName(-106);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "bf.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void onNameSuggestionSelected(int param0, String param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_O;
          var4 = param1;
          if (param0 != 11579568) {
            this.submitDisplayName(29);
          }
          ((EditableTextField) ((Object) var3)).setText(false, false, var4);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "bf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_L = (int[][]) null;
        field_R = (od[][]) null;
        field_S = null;
        if (param0) {
          DisplayNameSelectionPanel.clearStaticReferences(false);
        }
    }

    private final int a(UiWidget param0, int param1, int param2, int param3, String param4, String param5, int param6) {
        RuntimeException var8 = null;
        rh var9 = null;
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
          var10 = new LabeledWidgetContainer(20, param2, 120 + param3, 25, param0, false, 120, param1, gm.field_cb, 16777215, param5);
          this.addChild(var10, 10);
          var9 = new rh(((FieldValidatorProvider) ((Object) param0)).getFieldValidator((byte) -9), param4, 126, param2 + var10.field_z, param3 + 25, param6);
          var9.field_t = (WidgetEventListener) (this);
          this.addChild(var9, 10);
          stackIn_1_0 = var10.field_z + var9.field_z;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("bf.A(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final void submitDisplayName(int param0) {
        int var2 = 105 % ((param0 + 68) / 53);
        if (this.canSubmitDisplayName(-112)) {
          DisplayNameSelectionPanel.b(-121, this.field_O.field_B);
          return;
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_P == param3) {
            IntrusiveNode.b((byte) 32);
          } else {
            if (param3 == this.field_Q) {
              this.submitDisplayName(95);
            }
          }
          if (param0 > 68) {
            return;
          }
          this.submitDisplayName(109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("bf.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public DisplayNameSelectionPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_O = new ValidatedTextField("", (WidgetEventListener) null, 12);
        DefaultTextWidgetRenderer var1 = new DefaultTextWidgetRenderer(fa.field_Q, 0, 0, 0, 0, 16777215, -1, 3, 0, gm.field_cb.field_C, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(Confined.field_G, var1, (WidgetEventListener) null);
        this.field_Q = new InteractiveWidget(ta.field_a, (WidgetEventListener) null);
        this.field_P = new InteractiveWidget(AwtRasterBuffer.field_d, (WidgetEventListener) null);
        this.field_O.field_C = DebouncedFieldValidator.field_b;
        this.field_O.setFieldValidator(-18312, new AccountNameAvailabilityValidator(this.field_O));
        this.field_Q.field_L = false;
        this.field_Q.field_n = (WidgetRenderer) ((Object) new je());
        this.field_P.field_n = (WidgetRenderer) ((Object) new hk());
        this.field_O.field_n = (WidgetRenderer) ((Object) new db(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(-125, 270, var3, 50, 20);
        this.addChild(var2, 10);
        var3 += 50;
        var3 = var3 + (5 + this.a(this.field_O, 170, rc.field_a, 3, va.field_d, var3));
        this.field_Q.setBounds(-117, var5, var3, 40, 496 - var5 >> 1);
        this.field_P.setBounds(-128, 60, var3 + 15, 40, 3 + var4);
        this.field_P.field_t = (WidgetEventListener) (this);
        this.field_Q.field_t = (WidgetEventListener) (this);
        this.addChild(this.field_Q, 10);
        this.addChild(this.field_P, 10);
        this.field_H = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_H.setBounds(-126, -this.field_O.field_F + (-this.field_O.field_q + this.field_F - 60), 20, 150, this.field_O.field_F + this.field_O.field_q + 60);
        this.addChild(this.field_H, 10);
        this.setBounds(-125, 496, 0, var3 + (55 + var4), 0);
    }

    public final void onNameSuggestionsRefreshRequested(byte param0) {
        ((AccountNameAvailabilityValidator) (this.field_O.getFieldValidator((byte) -9))).invalidateCheckedName(639775169);
        if (param0 >= -101) {
          DisplayNameSelectionPanel.clearStaticReferences(false);
        }
    }

    private final boolean canSubmitDisplayName(int param0) {
        if (!this.isFieldValid(this.field_O, false)) {
          return false;
        }
        if (param0 > -82) {
          return true;
        }
        return true;
    }

    private final static void b(int param0, String param1) {
        try {
          SectorCacheStore.a(param1, 0);
          if (param0 >= -14) {
            field_L = (int[][]) null;
          }
          r.a((byte) 93, false, ContentTransitionDialog.field_kb);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "bf.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
          if (super.handleKey(param0, (byte) -2, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param0, 32);
            return stackIn_6_0;
          }
          if (param2 == 99) {
            stackIn_9_0 = this.focusNextChild(17731, param0);
            return stackIn_9_0;
          }
          var5_int = -65 / ((47 - param1) / 43);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("bf.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(UiWidget param0, int param1, String param2, int param3, String param4, int param5) {
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
          if (param3 != 3) {
            this.field_O = (ValidatedTextField) null;
          }
          stackIn_3_0 = this.a(param0, param3 + 0, param5, param1, param4, param2, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("bf.B(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean isFieldValid(FieldValidatorProvider param0, boolean param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        fi var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getFieldValidator((byte) -9);
          if (var3 == null) {
            return true;
          }
          if (param1) {
            this.handleKey((UiWidget) null, (byte) -77, -37, '￳');
          }
          var4 = var3.getValidationStatus(-3621);
          stackIn_8_0 = (TextHotspotBounds.field_q == var4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("bf.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_L = new int[][]{new int[]{0, 1, 2, 3}, new int[]{4, 5, 6, 7}, new int[]{8}, new int[]{9, 10, 11, 12}};
        field_R = new od[3][4];
        field_S = "<col=FFFFFF>Cloak:</col> an advanced technology that renders your ship invisible for 30 seconds, so you can fly down the tunnel eluding the aliens. But beware: each time you fire your weapons or your shield shimmers from an impact, they will know where you are!";
    }
}
