/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    private te field_J;
    private ValidatedTextField field_E;
    private ValidatedTextField field_D;
    NameSuggestionsPanel field_C;
    private ValidatedTextField field_O;
    private InteractiveWidget field_I;
    private InteractiveWidget field_P;
    private RichTextWidget field_F;
    private ValidatedTextField field_M;
    static String field_L;
    private ValidatedTextField field_K;
    static String field_B;
    static int field_H;
    static int[] field_N;
    private ValidatedTextField field_G;

    public final void onNameSuggestionsRefreshRequested(byte param0) {
        if (param0 != -12) {
          return;
        }
        ((AccountNameAvailabilityValidator) (this.field_E.getFieldValidator((byte) 3))).invalidateCheckedName(116);
    }

    public final void onNameSuggestionSelected(String param0, byte param1) {
        String var4 = null;
        ValidatedTextField var3 = this.field_E;
        if (param1 <= 103) {
          return;
        }
        try {
          var4 = param0;
          ((EditableTextField) ((Object) var3)).setText(var4, -1, false);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "pj.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean canSubmitRegistration(int param0) {
        boolean discarded$0 = false;
        if (param0 != -5210) {
          discarded$0 = this.submitRegistration(true);
          if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_E))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_G))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_K))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_O))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_D))) {
            return false;
          }
          if (this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_M))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_E))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_G))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_K))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_O))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_D))) {
          return false;
        }
        if (this.isFieldReadyForRegistration((byte) 35, (FieldValidatorProvider) (this.field_M))) {
          return true;
        }
        return false;
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_E = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_G = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_K = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_O = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_D = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_M = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_J = new te("", (WidgetEventListener) null, var1 != 0);
        this.field_I = new InteractiveWidget(NameSuggestionsPanel.field_K, (WidgetEventListener) null);
        this.field_P = new InteractiveWidget(ch.field_g, (WidgetEventListener) null);
        this.field_E.field_q = ValidatedTextField.field_Q;
        this.field_G.field_q = field_L;
        this.field_K.field_q = mk.field_l;
        this.field_O.field_q = bf.field_f;
        this.field_D.field_q = DisplayNameSelectionPanel.field_C;
        this.field_M.field_q = ProxyAuthenticationRequiredException.field_b;
        this.field_J.field_q = wb.field_c;
        this.field_E.setFieldValidator(new AccountNameAvailabilityValidator(this.field_E), (byte) 23);
        this.field_G.setFieldValidator(new EmailFormatValidator(this.field_G), (byte) 23);
        this.field_K.setFieldValidator(new ConfirmedEmailAvailabilityValidator(this.field_K, this.field_G), (byte) 23);
        this.field_O.setFieldValidator(new PasswordValidator(this.field_O, this.field_E, this.field_G), (byte) 23);
        this.field_D.setFieldValidator(new MatchingFieldValidator(this.field_D, this.field_O), (byte) 23);
        this.field_M.setFieldValidator(new AgeValidator(this.field_M), (byte) 23);
        this.field_I.field_D = false;
        this.field_I.field_i = (WidgetRenderer) ((Object) new v());
        this.field_P.field_i = (WidgetRenderer) ((Object) new uj());
        this.field_E.field_i = (WidgetRenderer) ((Object) new id(10000536));
        id dupTemp$0 = new id(10000536);
        this.field_K.field_i = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_G.field_i = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_M.field_i = (WidgetRenderer) ((Object) new id(10000536));
        this.field_J.field_i = (WidgetRenderer) ((Object) new fe());
        di dupTemp$1 = new di(10000536);
        this.field_D.field_i = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_O.field_i = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = da.a(new String[]{this.d((byte) 38), this.g(14359)}, di.field_y, false);
        int var3 = 20;
        var3 = var3 + this.a(170, 170, sa.field_a, this.field_G, var3);
        var3 = var3 + (this.a(20, "", true, 170, var3, LoginPanel.field_C, this.field_K) + 5);
        var3 = var3 + this.a(170, 170, p.field_b, this.field_O, var3);
        var3 = var3 + (this.a(170, sc.field_a, ProgressMessageDialog.field_nb, var3, this.field_D, 10000536) + 5);
        var3 = var3 + (5 + this.a(170, hc.field_kb, nk.field_C, var3, this.field_E, 10000536));
        var3 = var3 + this.a((byte) -78, this.field_M, 170, var3, AgeValidator.field_o);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, this.field_j - 90, 25, this.field_J, true, -120 + this.field_j, 5, ValidatedTextField.field_T, 11579568, IsaacRandom.field_j);
        this.addChild((byte) -74, var4);
        var3 = var3 + var4.field_v;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(ResizableModalDialog.field_Q, 0, 0, 0, 0, 16777215, -1, 0, 0, ResizableModalDialog.field_Q.field_E, -1, 2147483647, true);
        this.field_F = new RichTextWidget(var2, var5);
        this.field_F.field_q = "";
        this.field_F.a(wc.field_b, 0, -27371);
        this.field_F.a(wc.field_b, 1, -27371);
        this.field_F.field_r = (WidgetEventListener) (this);
        this.field_F.b(46, var3, -2, this.field_j - 90);
        var3 = var3 + (15 + this.field_F.field_v);
        this.addChild((byte) -119, this.field_F);
        int var6 = 4;
        int var7 = 200;
        this.field_I.setBounds(40, var7, true, var3, 496 - var7 >> 1);
        this.field_P.setBounds(40, 60, true, var3 + 15, 3 + var6);
        this.field_P.field_r = (WidgetEventListener) (this);
        this.field_I.field_r = (WidgetEventListener) (this);
        this.addChild((byte) 118, this.field_I);
        this.addChild((byte) 100, this.field_P);
        this.field_C = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_C.setBounds(150, -this.field_E.field_j + (-this.field_E.field_t + this.field_j) - 60, true, 20 + this.field_E.field_o, this.field_E.field_t - (-this.field_E.field_j - 60));
        this.addChild((byte) 68, this.field_C);
        this.setBounds(var6 + (55 + var3), 496, true, 0, 0);
    }

    final boolean handleKey(char param0, int param1, UiWidget param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, (byte) -112)) {
            return true;
          }
          var5_int = 26 % ((param3 + 13) / 55);
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(0, param2);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild((byte) 119, param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pj.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_P) {
            ga.b(0);
          } else {
            if (this.field_I == param4) {
              discarded$1 = this.submitRegistration(true);
            }
          }
          if (param2 == 215535458) {
            return;
          }
          this.field_G = (ValidatedTextField) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final String d(byte param0) {
        if (param0 == 38) {
          return "<u=2164A2><col=2164A2>";
        }
        String var3 = (String) null;
        int discarded$0 = this.a((byte) -112, (UiWidget) null, -4, 94, (String) null);
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, UiWidget param3, int param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        InteractiveWidget var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param4, 120 + param1, 25, param3, false, 120, 3, ResizableModalDialog.field_Q, 16777215, param2);
          this.addChild((byte) 75, var6);
          if (param0 != 170) {
            var7 = (InteractiveWidget) null;
            this.onWidgetActivated(102, -98, 84, -63, (InteractiveWidget) null);
          }
          stackIn_3_0 = var6.field_v;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("pj.CA(").append(param0).append(',').append(param1).append(',');
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
          throw ld.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    private final String g(int param0) {
        if (param0 != 14359) {
          return (String) null;
        }
        return "</col></u>";
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = jd.a(PcmOutputWorker.encodeNameBase37((byte) -58, param0), 37);
          if (var2 == null) {
            var2 = "";
          }
          if (param1 > -13) {
            field_H = -41;
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("pj.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onTextHotspotActivated(int param0, RichTextWidget param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 != 0) {
            if (1 != param2) {
              if (param2 == 2) {
                jl.a("conduct.ws", (byte) -45);
              }
            } else {
              jl.a("privacy.ws", (byte) 37);
            }
          } else {
            jl.a("terms.ws", (byte) 80);
          }
          if (param0 >= 50) {
            return;
          }
          var7 = (String) null;
          discarded$1 = this.a((byte) 95, (UiWidget) null, -32, 20, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pj.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, String param1, String param2, int param3, UiWidget param4, int param5) {
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
          if (param5 == 10000536) {
            stackIn_4_0 = this.a(35, param2, true, param0, param3, param1, param4);
            return stackIn_4_0;
          }
          stackIn_2_0 = 60;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("pj.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, String param1, boolean param2, int param3, int param4, String param5, UiWidget param6) {
        RuntimeException var8 = null;
        li var9 = null;
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
          var10 = new LabeledWidgetContainer(20, param4, param3 + 120, 25, param6, false, 120, 3, ResizableModalDialog.field_Q, 16777215, param5);
          this.addChild((byte) 113, var10);
          var9 = new li(((FieldValidatorProvider) ((Object) param6)).getFieldValidator((byte) 97), param1, 126, param4 + var10.field_v, param3 + 50, param0);
          var9.field_r = (WidgetEventListener) (this);
          if (!param2) {
            this.field_G = (ValidatedTextField) null;
          }
          this.addChild((byte) -123, var9);
          stackIn_3_0 = var10.field_v + var9.field_v;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("pj.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static AwtRasterBuffer a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          AwtRasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          AwtRasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (AwtRasterBuffer) (var4.newInstance());
              if (param1 != 99) {
                AccountRegistrationPanel.clearStaticReferences((byte) 89);
              }
              var5.initialize(false, param0, param2, param3);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((AwtRasterBuffer) ((Object) var5_ref)).initialize(false, param0, param2, param3);
              stackIn_5_0 = var5_ref;
              return (AwtRasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("pj.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_B = null;
        field_L = null;
        field_N = null;
        if (param0 <= 52) {
          AccountRegistrationPanel.clearStaticReferences((byte) 97);
        }
    }

    private final boolean isFieldReadyForRegistration(byte param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        sc var4 = null;
        UiWidget var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getFieldValidator((byte) 110);
          if (var3 == null) {
            return true;
          }
          if (param0 != 35) {
            var5 = (UiWidget) null;
            this.handleKey('ﾤ', -28, (UiWidget) null, (byte) 103);
          }
          var4 = var3.getValidationStatus((byte) 117);
          if (var4 == ni.field_b) {
            return false;
          }
          if (jj.field_e == var4) {
            return false;
          }
          if (var4 != rc.field_a) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("pj.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final int a(byte param0, UiWidget param1, int param2, int param3, String param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        LabeledWidgetContainer var7 = null;
        ld var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -35 / ((param0 - 63) / 36);
          var7 = new LabeledWidgetContainer(20, param3, param2 + 120, 25, param1, false, 120, 3, ResizableModalDialog.field_Q, 16777215, param4);
          this.addChild((byte) 123, var7);
          var8 = new ld(((FieldValidatorProvider) ((Object) param1)).getFieldValidator((byte) 103));
          this.addChild((byte) 115, var8);
          var8.setBounds(15, 15, true, (var7.field_v - 15 >> 1) + var7.field_o, var7.field_t - (-var7.field_j - 3));
          stackIn_1_0 = var7.field_v;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("pj.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_I.field_D = this.canSubmitRegistration(-5210);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "pj.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean submitRegistration(boolean param0) {
        if (!this.canSubmitRegistration(-5210)) {
          return false;
        }
        int var2 = -1;
        try {
          if (!param0) {
            this.field_I = (InteractiveWidget) null;
          }
          var2 = Integer.parseInt(this.field_M.field_u);
        } catch (NumberFormatException numberFormatException) {
        }
        return PcmOutputWorker.a(this.field_E.field_u, 0, var2, this.field_G.field_u, this, this.field_O.field_u, this.field_J.field_C);
    }

    static {
        field_L = "Your email address is used to identify this account";
        field_B = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
