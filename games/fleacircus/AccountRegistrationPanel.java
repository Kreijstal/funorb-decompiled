/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    private ValidatedTextField field_K;
    private InteractiveWidget field_R;
    static mf field_L;
    static RgbSprite field_P;
    private ValidatedTextField field_F;
    static String field_O;
    private InteractiveWidget field_I;
    NameSuggestionsPanel field_N;
    static int field_Q;
    private ValidatedTextField field_S;
    static int[] field_G;
    private vk field_T;
    private RichTextWidget field_J;
    private ValidatedTextField field_H;
    private ValidatedTextField field_U;
    private ValidatedTextField field_M;

    private final int addLabeledFieldWithValidationIcon(int param0, UiComponent param1, String param2, int param3, int param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        ValidationStatusIcon var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param4, 120 + param3, 25, param1, false, 120, 3, ug.field_e, 16777215, param2);
          this.addChild((UiComponent) (var6), (byte) -85);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param1)).getFieldValidator((byte) 21));
          this.addChild((UiComponent) (var7), (byte) -29);
          var7.setBounds(3 + var6.field_u + var6.field_y, 15, var6.field_z + (var6.field_j + param0 >> 1), 15, 80);
          stackIn_1_0 = var6.field_j;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("ca.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addLabeledField(int param0, int param1, String param2, int param3, UiComponent param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param3, param1 + 120, 25, param4, false, 120, 3, ug.field_e, 16777215, param2);
          this.addChild((UiComponent) (var6), (byte) -66);
          if (param0 > -27) {
            this.field_R = (InteractiveWidget) null;
          }
          stackIn_4_0 = var6.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("ca.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_O = null;
          if (param0 != 100) {
            field_Q = -51;
          }
          field_L = null;
          field_G = null;
          field_P = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.wrapClientException((Throwable) ((Object) var1), "ca.NA(" + param0 + ')');
        }
    }

    private final boolean isFieldReadyForRegistration(FieldValidatorProvider param0, int param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getFieldValidator((byte) 92);
          if (var3 == null) {
            return true;
          }
          if (param1 != 22898) {
            field_G = (int[]) null;
          }
          var4 = var3.getValidationStatus(false);
          if (LabeledWidgetContainer.field_K == var4) {
            return false;
          }
          if (var4 == ea.field_b) {
            return false;
          }
          if (var4 != uk.field_b) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_24_0 = var3_ref;
          stackIn_24_1 = new StringBuilder().append("ca.QA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(String param0, String param1, int param2, int param3, int param4, UiComponent param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -19983) {
            this.updatePointer(-55, -75, (UiComponent) null, (byte) -86);
          }
          stackIn_4_0 = this.addLabeledFieldWithValidationMessage(param5, 35, param3, param0, param1, (byte) -86, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ca.OA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final String getLinkOpenMarkup(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11579568) {
            this.handleKey(75, 25, (UiComponent) null, '￱');
          }
          stackIn_4_0 = "<u=2164A2><col=2164A2>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.wrapClientException((Throwable) ((Object) var2), "ca.AA(" + param0 + ')');
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param2, -28533);
            return stackIn_7_0;
          }
          if (99 == param1) {
            stackIn_12_0 = this.focusNextChild(32, param2);
            return stackIn_12_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ca.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean submitRegistration(int param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        boolean stackIn_10_0 = false;
        Throwable decompiledCaughtException = null;
        try {
          if (!this.canSubmitRegistration((byte) 65)) {
            return false;
          }
          var2_int = -1;
          try {
            var3_int = 78 / ((40 - param0) / 42);
            var2_int = Integer.parseInt(this.field_S.field_i);
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          }
          stackIn_10_0 = PasswordValidator.a(this.field_K.field_i, var2_int, this.field_F.field_i, this.field_T.field_G, this, -122, this.field_U.field_i);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.wrapClientException((Throwable) ((Object) var2), "ca.IA(" + param0 + ')');
        }
    }

    private final int addLabeledFieldWithValidationMessage(UiComponent param0, int param1, int param2, String param3, String param4, byte param5, int param6) {
        LabeledWidgetContainer var8 = null;
        RuntimeException var8_ref = null;
        ValidationStatusWidget var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledWidgetContainer(20, param2, param6 + 120, 25, param0, false, 120, 3, ug.field_e, 16777215, param3);
          this.addChild((UiComponent) (var8), (byte) -42);
          if (param5 != -86) {
            stackIn_2_0 = 108;
            return stackIn_2_0;
          }
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param0)).getFieldValidator((byte) -2), param4, 126, var8.field_j + param2, 50 + param6, param1);
          var9.field_s = (WidgetEventListener) (this);
          this.addChild((UiComponent) (var9), (byte) -77);
          stackIn_4_0 = var8.field_j + var9.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_8_0 = var8_ref;
          stackIn_8_1 = new StringBuilder().append("ca.PA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean canSubmitRegistration(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_K), 22898) &&
            this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_U), 22898) &&
            this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_H), 22898) &&
            this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_F), 22898) &&
            this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_M), 22898) &&
            this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_S), 22898)) {
            if (param0 >= 18) {
              return true;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.wrapClientException((Throwable) ((Object) var2), "ca.FA(" + param0 + ')');
        }
    }

    public final void onTextHotspotActivated(int param0, RichTextWidget param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          if (param0 == 0) {
            StripedProgressWidget.a(-15493, "terms.ws");
          }
          if (param0 != 0 ||
            var6 != 0) {
            if (param0 != 1) {
              if (param0 == 2) {
                StripedProgressWidget.a(-15493, "conduct.ws");
                if (var6 != 0) {
                  StripedProgressWidget.a(-15493, "privacy.ws");
                }
              }
            } else {
              StripedProgressWidget.a(-15493, "privacy.ws");
            }
          }
          var5_int = 8 % ((param3 + 36) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ca.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          param0.removeKeyListener(ResourceArchive.field_f);
          if (param1 != 83) {
            AccountRegistrationPanel.j(-73);
          }
          param0.removeFocusListener(ResourceArchive.field_f);
          ProxyAuthenticationRequiredException.field_f = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ca.LA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, si param2, boolean param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_37_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = fleas.field_A ? 1 : 0;
        try {
          var5_int = SingleChildWidgetContainer.bitLength(3 * (param1 - param0), (byte) -57);
          var6 = 3 * param0;
          if (param3) {
            return;
          }
          sk.b((byte) -80);
          var7 = -10 + var5_int;
          if (param2.field_h > 0 &&
            param2.field_J != null) {
            ik.d(109);
          }
          IntrusiveDeque.field_d = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_j)))) {
            var9 = param2.field_Q[var8];
            var10 = param2.field_M[var8];
            var11 = param2.field_N[var8];
            stackOut_11_0 = param4;
            stackIn_47_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = kb.field_o[var9];
                var13 = il.field_c[var9];
                var14 = -var12 + kb.field_o[var10];
                var15 = -var12 + kb.field_o[var11];
                var16 = il.field_c[var10] - var13;
                var17 = -var13 + il.field_c[var11];
              }
              if (!stackIn_12_0 ||
                var14 * var17 - var15 * var16 < 0) {
                var12Lifetime1 = ContextualRuntimeException.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = ContextualRuntimeException.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = ContextualRuntimeException.field_c[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + var13Lifetime1 + (var12Lifetime1 - var6);
                      if (var7 < 0) {
                        stackIn_26_0 = var15 << -var7;
                      } else {
                        stackIn_26_0 = var15 >> var7;
                      }
                      var16 = -stackIn_26_0 + ed.field_c.length - 1;
                      var17 = ed.field_c[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_37_0 = var16;
                          if (stackIn_37_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ed.field_c[var16];
                          continue;
                        }
                        stackIn_37_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_37_0Lifetime1;
                        DraggableWidgetContainer.field_J[var18] = var8;
                        ed.field_c[var16] = 1 + var17;
                        if (param2.field_h > 0 &&
                          null != param2.field_J) {
                          dupTemp$0 = param2.field_J[var8];
                          ge.field_e[dupTemp$0] = ge.field_e[dupTemp$0] + 1;
                        }
                        IntrusiveDeque.field_d = IntrusiveDeque.field_d + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_47_0 = -1;
          }
          if (stackIn_47_0 > ~param2.field_h &&
            null != param2.field_J) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ge.field_e.length)) {
              var10Lifetime1 = ge.field_e[var9Lifetime1];
              ge.field_e[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_63_0 = var5;
          stackIn_63_1 = new StringBuilder().append("ca.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (ComponentLayout) null);
        int var1_int = 0;
        aa dupTemp$0 = null;
        mh dupTemp$1 = null;
        String var2 = null;
        int var3 = 0;
        LabeledWidgetContainer var4 = null;
        DefaultTextWidgetRenderer var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          this.field_K = new ValidatedTextField("", (WidgetEventListener) null, 12);
          this.field_U = new ValidatedTextField("", (WidgetEventListener) null, 100);
          this.field_H = new ValidatedTextField("", (WidgetEventListener) null, 100);
          this.field_F = new ValidatedTextField("", (WidgetEventListener) null, 20);
          this.field_M = new ValidatedTextField("", (WidgetEventListener) null, 20);
          this.field_S = new ValidatedTextField("", (WidgetEventListener) null, 3);
          var1_int = 1;
          this.field_T = new vk("", (WidgetEventListener) null, var1_int != 0);
          this.field_I = new InteractiveWidget(MusicPatchNode.field_y, (WidgetEventListener) null);
          this.field_R = new InteractiveWidget(DropTargetWidgetContainer.field_J, (WidgetEventListener) null);
          this.field_K.field_m = df.field_c;
          this.field_U.field_m = ImageProducerRasterBuffer.field_i;
          this.field_H.field_m = cg.field_v;
          this.field_F.field_m = nc.field_c;
          this.field_M.field_m = a.field_h;
          this.field_S.field_m = va.field_k;
          this.field_T.field_m = ByteArrayPoolSupport.field_f;
          this.field_K.setFieldValidator(true, new AccountNameAvailabilityValidator(this.field_K));
          this.field_U.setFieldValidator(true, new EmailFormatValidator(this.field_U));
          this.field_H.setFieldValidator(true, new ConfirmedEmailAvailabilityValidator(this.field_H, this.field_U));
          this.field_F.setFieldValidator(true, new PasswordValidator(this.field_F, this.field_K, this.field_U));
          this.field_M.setFieldValidator(true, new MatchingFieldValidator(this.field_M, this.field_F));
          this.field_S.setFieldValidator(true, new AgeValidator(this.field_S));
          this.field_I.field_D = false;
          this.field_I.field_p = (ComponentLayout) ((Object) new ri());
          this.field_R.field_p = (ComponentLayout) ((Object) new me());
          this.field_K.field_p = (ComponentLayout) ((Object) new aa(10000536));
          dupTemp$0 = new aa(10000536);
          this.field_H.field_p = (ComponentLayout) ((Object) dupTemp$0);
          this.field_U.field_p = (ComponentLayout) ((Object) dupTemp$0);
          this.field_S.field_p = (ComponentLayout) ((Object) new aa(10000536));
          this.field_T.field_p = (ComponentLayout) ((Object) new jc());
          dupTemp$1 = new mh(10000536);
          this.field_M.field_p = (ComponentLayout) ((Object) dupTemp$1);
          this.field_F.field_p = (ComponentLayout) ((Object) dupTemp$1);
          var2 = ModalDialog.a(MidiPcmStream.field_v, new String[]{this.getLinkOpenMarkup(11579568), this.getLinkCloseMarkup((byte) 49)}, true);
          var3 = 20;
          var3 = var3 + this.addLabeledField(-61, 170, ff.field_a, var3, this.field_U);
          var3 = var3 + (this.addLabeledFieldWithValidationMessage(this.field_H, 20, var3, b.field_c, "", (byte) -86, 170) + 5);
          var3 = var3 + this.addLabeledField(-93, 170, kc.field_g, var3, this.field_F);
          var3 = var3 + (this.addLabeledFieldWithDefaultValidationMessage(gd.field_c, ByteStorage.field_f, 170, var3, -19983, this.field_M) + 5);
          var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(me.field_a, InteractiveWidget.field_J, 170, var3, -19983, this.field_K));
          var3 = var3 + this.addLabeledFieldWithValidationIcon(-15, this.field_S, me.field_f, 170, var3);
          var4 = new LabeledWidgetContainer(46, var3, this.field_u - 90, 25, this.field_T, true, -120 + this.field_u, 5, nb.field_c, 11579568, lf.field_a);
          this.addChild((UiComponent) (var4), (byte) -101);
          var3 = var3 + var4.field_j;
          var5 = new DefaultTextWidgetRenderer(ug.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, ug.field_e.field_H, -1, 2147483647, true);
          this.field_J = new RichTextWidget(var2, var5);
          this.field_J.field_m = "";
          this.field_J.setHotspotTooltip(0, TextLineMetrics.field_f, 0);
          this.field_J.setHotspotTooltip(0, TextLineMetrics.field_f, 1);
          this.field_J.field_s = (WidgetEventListener) (this);
          this.field_J.setTextBounds(this.field_u - 90, 46, var3, -9);
          var3 = var3 + (15 + this.field_J.field_j);
          this.addChild((UiComponent) (this.field_J), (byte) -83);
          var6 = 4;
          var7 = 200;
          this.field_I.setBounds(-var7 + 496 >> 1, var7, var3, 40, 80);
          this.field_R.setBounds(var6 + 3, 60, var3 + 15, 40, 80);
          this.field_R.field_s = (WidgetEventListener) (this);
          this.field_I.field_s = (WidgetEventListener) (this);
          this.addChild((UiComponent) (this.field_I), (byte) -51);
          this.addChild((UiComponent) (this.field_R), (byte) -106);
          this.field_N = new NameSuggestionsPanel((NameSuggestionListener) (this));
          this.field_N.setBounds(60 + this.field_K.field_u + this.field_K.field_y, -60 + (-this.field_K.field_y + this.field_u - this.field_K.field_u), 20 + this.field_K.field_z, 150, 80);
          this.addChild((UiComponent) (this.field_N), (byte) -77);
          this.setBounds(0, 496, 0, var6 + (var3 + 55), 80);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ca.<init>()");
        }
    }

    final void updatePointer(int param0, int param1, UiComponent param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, (byte) -107);
          if (param3 >= -85) {
            this.field_R = (InteractiveWidget) null;
          }
          this.field_I.field_D = this.canSubmitRegistration((byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ca.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(String param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        ValidatedTextField var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_K;
          if (param1 != -96) {
            discarded$1 = this.addLabeledFieldWithValidationIcon(4, (UiComponent) null, (String) null, 11, 117);
          }
          var4 = param0;
          ((EditableTextField) ((Object) var3)).setText(false, (byte) -91, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ca.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(byte param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 49) {
            this.onWidgetActivated(46, -16, 42, -88, (InteractiveWidget) null);
          }
          stackIn_4_0 = "</col></u>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.wrapClientException((Throwable) ((Object) var2), "ca.BA(" + param0 + ')');
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_R == param4) {
            ej.a(param3 - 232);
            if ((fleas.field_A) &&
              (param4 == this.field_I)) {
              discarded$0 = this.submitRegistration(127);
            }
          } else {
            if (param4 == this.field_I) {
              discarded$0 = this.submitRegistration(127);
            }
          }
          if (param3 != 248) {
            AccountRegistrationPanel.a((java.awt.Component) null, (byte) 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ca.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        try {
          ((AccountNameAvailabilityValidator) (this.field_K.getFieldValidator((byte) -109))).invalidateCheckedName(true);
          if (param0 >= -66) {
            field_L = (mf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ca.HA(" + param0 + ')');
        }
    }

    static {
        field_Q = 480;
        field_G = new int[5];
        field_O = "<%0>Bomb:<%1> Explodes when a flea touches it, removing all adjacent tiles. Does <u>not</u> harm fleas.";
    }
}
