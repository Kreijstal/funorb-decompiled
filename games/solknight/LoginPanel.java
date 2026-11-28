/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends WidgetContainer implements TextFieldListener, WidgetActivationListener {
    private boolean field_H;
    static fg field_I;
    private EditableTextField field_L;
    private EditableTextField field_O;
    private boolean field_E;
    private InteractiveWidget field_N;
    private String field_K;
    static int[] field_P;
    private InteractiveWidget field_M;
    private InteractiveWidget field_D;
    static int field_G;
    private boolean field_J;

    public final void onTextSubmitted(EditableTextField param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            this.field_K = (String) null;
          }
          if (this.field_O == param0) {
            this.field_L.takeFocus(-1463, (UiWidget) (this));
          }
          if (param0 == this.field_L) {
            this.submitLogin(-1525);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bb.NA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (param2 != -63) {
            LoginPanel.h(86);
          }
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (gh.a(param0.charAt(var5), (byte) -124)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!DualLinkNode.a(30418, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = il.a((CharSequence) ((Object) var7_ref_String), param2 ^ -6041);
              var4 = var4 + (-var5 + var6_int + param1[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_28_0 = var6.toString();
              return stackIn_28_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (gh.a(param0.charAt(var5Lifetime1), (byte) -124)) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!DualLinkNode.a(30418, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = il.a((CharSequence) ((Object) var9), 6054);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("bb.K(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledWidgetContainer dupTemp$0 = null;
        LabeledWidgetContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        InteractiveWidget stackIn_18_1 = null;
        InteractiveWidget stackIn_18_2 = null;
        InteractiveWidget stackIn_19_1 = null;
        InteractiveWidget stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        fg var9 = null;
        LabeledWidgetContainer var12 = null;
        LabeledWidgetContainer var13 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_E = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_H = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_J = stackIn_10_1;
          this.field_K = param1;
          if (this.field_E && (this.field_J ||
            this.field_H)) {
            throw new IllegalStateException();
          }
          this.field_O = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_L = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (!this.field_E) {
            this.field_N = new InteractiveWidget(DisplayNameSelectionPanel.field_H, (WidgetEventListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_H) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = pf.field_c;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = u.field_e;
            }
            this.field_D = new InteractiveWidget(stackIn_19_3, (WidgetEventListener) null);
            if (this.field_J) {
              this.field_M = new InteractiveWidget(DelegatingCanvas.field_g, (WidgetEventListener) (this));
            }
          } else {
            this.field_N = new InteractiveWidget(IntrusiveNode.field_c, (WidgetEventListener) null);
            this.field_D = new InteractiveWidget(ph.field_e, (WidgetEventListener) null);
            this.field_O.field_B = false;
          }
          this.field_O.field_w = (WidgetRenderer) ((Object) new uf(10000536));
          this.field_L.field_w = (WidgetRenderer) ((Object) new bg(10000536));
          var6 = new gh();
          this.field_N.field_w = (WidgetRenderer) ((Object) var6);
          if (null != this.field_D) {
            this.field_D.field_w = (WidgetRenderer) ((Object) var6);
          }
          this.field_O.field_z = oc.field_e;
          if (this.field_M != null) {
            this.field_M.field_w = (WidgetRenderer) ((Object) var6);
          }
          if (this.field_M != null) {
            this.field_M.field_z = id.field_b;
          }
          if (this.field_E) {
            this.field_D.field_z = BufferedCacheFile.field_j;
          } else {
            if (!this.field_H) {
              this.field_D.field_w = (WidgetRenderer) ((Object) new ri());
            } else {
              this.field_D.field_z = TextFieldValidator.field_g;
              this.field_D.field_w = (WidgetRenderer) ((Object) new ri());
            }
          }
          this.field_j = 15;
          var7 = NameSuggestionsPanel.field_G;
          if (this.field_K != null) {
            this.field_j = this.field_j + (var7.textHeight(this.field_K, -40 + this.field_t, var7.field_F) + 5);
          }
          var8 = hh.field_J;
          var9 = MouseWheelInput.a((byte) 120, ia.g(116));
          if (ArchiveRequest.field_p == var9) {
            var8 = UiWidget.field_y;
          } else {
            if (field_I == var9) {
              var8 = ModalDialog.field_H;
            }
          }
          dupTemp$0 = new LabeledWidgetContainer(10, this.field_j, this.field_t - 20, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, 5411);
          this.field_j = this.field_j + (((UiWidget) ((Object) var12)).field_x + 5);
          dupTemp$1 = new LabeledWidgetContainer(10, this.field_j, this.field_t - 20, 25, this.field_L, false, 80, 3, var7, 16777215, ResizableModalDialog.field_O);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, 5411);
          this.field_N.field_n = (WidgetEventListener) (this);
          this.field_j = this.field_j + (5 + ((UiWidget) ((Object) var13)).field_x);
          if (this.field_M != null) {
            this.field_M.field_n = (WidgetEventListener) (this);
          }
          if (null != this.field_D) {
            this.field_D.field_n = (WidgetEventListener) (this);
          }
          if (this.field_M != null) {
            this.field_N.setBounds(30, -95 + this.field_t, 85, 0, this.field_j);
            this.field_j = this.field_j + 60;
          } else {
            this.field_N.setBounds(30, this.field_t - 6 - 10, 8, 0, this.field_j);
            this.field_j = this.field_j + 35;
          }
          if (null != this.field_M) {
            this.field_M.setBounds(30, -10 + this.field_t - 6, 8, 0, this.field_j);
            this.field_j = this.field_j + 35;
          }
          if (this.field_D != null) {
            if (!this.field_E &&
              !this.field_H) {
              this.field_D.setBounds(20, 40, 8, 0, this.field_j);
              this.field_j = this.field_j + 25;
            } else {
              this.field_D.setBounds(30, -10 + (-6 + this.field_t), 8, 0, this.field_j);
              this.field_j = this.field_j + 35;
            }
          }
          this.setBounds(3 + this.field_j, this.field_t, 0, 0, 0);
          this.addChild(this.field_N, 5411);
          if (this.field_M != null) {
            this.addChild(this.field_M, 5411);
          }
          if (null != this.field_D) {
            this.addChild(this.field_D, 5411);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("bb.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        h.field_g = param1;
        SoundCache.field_b = param2;
        je.field_d = 1;
        if (param0 != -14) {
          LoginPanel.clearStaticReferences((byte) -52);
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, boolean param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (!param4) {
            this.field_J = true;
          }
          if (param3 == this.field_N) {
            this.submitLogin(-1525);
          } else {
            if (param3 != this.field_M) {
              if (param3 == this.field_D) {
                if (!this.field_E) {
                  if (this.field_H) {
                    GuestPlayConfirmationForm.a((byte) -82);
                  } else {
                    qd.a((byte) -13);
                  }
                } else {
                  AccountRegistrationPanel.h(15);
                }
              }
            } else {
              DebouncedFieldValidator.d(350);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("bb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(char param0, byte param1, int param2, UiWidget param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 34 % ((param1 - 31) / 56);
          if (super.handleKey(param0, (byte) -36, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_7_0 = this.focusPreviousChild((byte) -114, param3);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(90, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        if (null != this.field_K) {
          NameSuggestionsPanel.field_G.drawParagraph(this.field_K, this.field_m + (param2 + 20), 15 + (this.field_j + param0), -40 + this.field_t, this.field_x, 16777215, -1, 1, 0, NameSuggestionsPanel.field_G.field_F);
        }
        if (null != this.field_M) {
          SoftwareRasterizer.drawHorizontalLine(10 + param2, param0 + 134, this.field_t - 20, 4210752);
        }
        super.drawWidget(param0, param1, param2, param3);
    }

    final void setAccountAndClearPassword(int param0, String param1) {
        EditableTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_O;
          var4 = param1;
          if (param0 != 25) {
            this.field_L = (EditableTextField) null;
          }
          var3.setText(param0 ^ -110, false, var4);
          this.field_L.clearText(param0 ^ -125);
        } catch (RuntimeException runtimeException) {
          throw fc.wrapClientException((Throwable) ((Object) runtimeException), "bb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_P = null;
        if (param0 < 92) {
          return;
        }
        field_I = null;
    }

    public final void onTextChanged(EditableTextField param0, byte param1) {
        try {
          if (param1 != -79) {
            this.field_E = false;
          }
        } catch (RuntimeException runtimeException) {
          throw fc.wrapClientException((Throwable) ((Object) runtimeException), "bb.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String getAccountIdentifier(int param0) {
        if (param0 != -19569) {
          return (String) null;
        }
        if (this.field_O.field_i == null) {
          return "";
        }
        return this.field_O.field_i;
    }

    private final void submitLogin(int param0) {
        if (ji.a(-19688) ||
          !(0 >= this.field_O.field_i.length()) &&
          !(this.field_L.field_i.length() <= 0)) {
          hg.a(8192, this.field_O.field_i, this.field_L.field_i);
        }
        if (param0 != -1525) {
          this.field_J = true;
        }
    }

    final static boolean h(int param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = 34 % ((param0 + 11) / 48);
        stackIn_4_0 = (10 <= fj.field_i) && (RichTextWidget.field_R >= 13);
        return stackIn_4_0;
    }

    final void clearCredentials(int param0) {
        this.field_O.clearText(-115);
        this.field_L.clearText(-87);
        if (param0 < 5) {
          this.getAccountIdentifier(-11);
        }
    }

    static {
        field_I = new fg("usename");
        field_P = new int[10];
    }
}
