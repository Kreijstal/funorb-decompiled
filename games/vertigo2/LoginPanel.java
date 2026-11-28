/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends WidgetContainer implements TextFieldListener, WidgetActivationListener {
    private EditableTextField field_O;
    private InteractiveWidget field_K;
    private boolean field_S;
    private boolean field_N;
    private EditableTextField field_H;
    private String field_P;
    private InteractiveWidget field_G;
    private boolean field_R;
    static IntrusiveDeque field_Q;
    static String field_I;
    static IntrusiveDeque field_M;
    private InteractiveWidget field_J;
    static int field_L;
    static double field_F;

    private final void submitLogin(int param0) {
        if (BlastDebrisModel.isReconnectLoginActive((byte) 6) ||
          !(this.field_H.text.length() <= 0) &&
          !(this.field_O.text.length() <= 0)) {
          la.a(this.field_H.text, this.field_O.text, 26806);
        }
        if (param0 >= -86) {
          this.field_S = false;
        }
    }

    public final void onTextSubmitted(byte param0, EditableTextField param1) {
        EditableTextField var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_H) {
            this.field_O.takeFocus((byte) 116, (UiWidget) (this));
          }
          if (param0 < 16) {
            var4 = (EditableTextField) null;
            this.onTextSubmitted((byte) -64, (EditableTextField) null);
          }
          if (this.field_O == param1) {
            this.submitLogin(-123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.focusPreviousChild(32345, param3);
            return stackIn_6_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild((byte) -70, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ob.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        EditableTextField var3 = null;
        String var4 = null;
        try {
          if (param0 != -79) {
            field_Q = (IntrusiveDeque) null;
          }
          var3 = this.field_H;
          var4 = param1;
          var3.setText(var4, -110, false);
          this.field_O.clearText(param0 ^ -79);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ob.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.applet.Applet e(byte param0) {
        int var1 = 8 % ((6 - param0) / 58);
        if (null != DefaultTextWidgetRenderer.field_o) {
          return DefaultTextWidgetRenderer.field_o;
        }
        return (java.applet.Applet) ((Object) qe.field_T);
    }

    final void drawWidget(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          UiWidget var6 = (UiWidget) null;
          this.handleKey('g', -59, 99, (UiWidget) null);
        }
        if (null != this.field_P) {
          qc.field_x.drawParagraph(this.field_P, this.x + param2 + 20, 15 + this.y + param3, this.width - 40, this.height, 16777215, -1, 1, 0, qc.field_x.field_z);
        }
        if (null != this.field_K) {
          SoftwareRasterizer.drawHorizontalLine(10 + param2, 134 + param3, this.width - 20, 4210752);
        }
        super.drawWidget(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        field_M = null;
        if (param0 != -103) {
          LoginPanel.e((byte) 61);
        }
        field_Q = null;
        field_I = null;
    }

    public final void onTextChanged(int param0, EditableTextField param1) {
        try {
          if (param0 >= -10) {
            this.field_H = (EditableTextField) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ob.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetListener) null);
        LabeledWidgetContainer dupTemp$0 = null;
        LabeledWidgetContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        InteractiveWidget stackIn_17_1 = null;
        InteractiveWidget stackIn_17_2 = null;
        InteractiveWidget stackIn_18_1 = null;
        InteractiveWidget stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        vo var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        ej var9 = null;
        LabeledWidgetContainer var12 = null;
        LabeledWidgetContainer var13 = null;
        try {
          this.field_P = param1;
          stackIn_4_1 = (param2);
          this.field_N = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_R = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_S = stackIn_10_1;
          if (this.field_N && (this.field_S ||
            this.field_R)) {
            throw new IllegalStateException();
          }
          this.field_H = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_O = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (this.field_N) {
            this.field_J = new InteractiveWidget(bk.field_d, (WidgetEventListener) null);
            this.field_G = new InteractiveWidget(jd.field_b, (WidgetEventListener) null);
            this.field_H.field_F = false;
          } else {
            this.field_J = new InteractiveWidget(wp.field_d, (WidgetEventListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_R) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ap.field_f;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = fd.field_o;
            }
            this.field_G = new InteractiveWidget(stackIn_18_3, (WidgetEventListener) null);
            if (this.field_S) {
              this.field_K = new InteractiveWidget(TextHotspotBounds.field_r, (WidgetEventListener) (this));
            }
          }
          this.field_H.listener = (WidgetListener) ((Object) new ml(10000536));
          this.field_O.listener = (WidgetListener) ((Object) new om(10000536));
          var6 = new vo();
          this.field_J.listener = (WidgetListener) ((Object) var6);
          if (this.field_G != null) {
            this.field_G.listener = (WidgetListener) ((Object) var6);
          }
          this.field_H.field_q = wh.field_A;
          if (this.field_K != null) {
            this.field_K.listener = (WidgetListener) ((Object) var6);
          }
          if (null != this.field_K) {
            this.field_K.field_q = ni.field_h;
          }
          if (this.field_N) {
            this.field_G.field_q = fm.field_h;
          } else {
            if (!this.field_R) {
              this.field_G.listener = (WidgetListener) ((Object) new jc());
            } else {
              this.field_G.field_q = he.field_z;
              this.field_G.listener = (WidgetListener) ((Object) new jc());
            }
          }
          this.y = 15;
          var7 = qc.field_x;
          if (this.field_P != null) {
            this.y = this.y + (5 + var7.textHeight(this.field_P, this.width - 40, var7.field_z));
          }
          var8 = ll.field_a;
          var9 = kf.a((byte) -100, LoginPanel.e((byte) -52));
          if (IntrusiveNode.field_j == var9) {
            var8 = la.field_c;
          } else {
            if (var9 == la.field_i) {
              var8 = w.field_A;
            }
          }
          dupTemp$0 = new LabeledWidgetContainer(10, this.y, -20 + this.width, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild((byte) -107, dupTemp$0);
          this.y = this.y + (5 + ((UiWidget) ((Object) var12)).height);
          dupTemp$1 = new LabeledWidgetContainer(10, this.y, -20 + this.width, 25, this.field_O, false, 80, 3, var7, 16777215, uc.field_c);
          var13 = dupTemp$1;
          this.addChild((byte) 83, dupTemp$1);
          this.field_J.field_v = (WidgetEventListener) (this);
          this.y = this.y + (((UiWidget) ((Object) var13)).height + 5);
          if (null != this.field_K) {
            this.field_K.field_v = (WidgetEventListener) (this);
          }
          if (this.field_G != null) {
            this.field_G.field_v = (WidgetEventListener) (this);
          }
          if (this.field_K != null) {
            this.field_J.setBounds(false, 85, this.y, 30, -95 + this.width);
            this.y = this.y + 60;
          } else {
            this.field_J.setBounds(false, 8, this.y, 30, -10 + (-6 + this.width));
            this.y = this.y + 35;
          }
          if (null != this.field_K) {
            this.field_K.setBounds(false, 8, this.y, 30, this.width - 6 - 10);
            this.y = this.y + 35;
          }
          if (this.field_G != null) {
            if (!this.field_N &&
              !this.field_R) {
              this.field_G.setBounds(false, 8, this.y, 20, 40);
              this.y = this.y + 25;
            } else {
              this.field_G.setBounds(false, 8, this.y, 30, -6 + this.width - 10);
              this.y = this.y + 35;
            }
          }
          this.setBounds(false, 0, 0, this.y + 3, this.width);
          this.addChild((byte) 85, this.field_J);
          if (null != this.field_K) {
            this.addChild((byte) -43, this.field_K);
          }
          if (null != this.field_G) {
            this.addChild((byte) 99, this.field_G);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ob.<init>(");
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
          throw wn.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final String j(int param0) {
        if (null != this.field_H.text) {
          if (param0 != 5607) {
            this.drawWidget(true, 116, -61, 8);
          }
          return this.field_H.text;
        }
        return "";
    }

    public final void onWidgetActivated(int param0, InteractiveWidget param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = -35 / ((param2 + 63) / 51);
          if (param1 == this.field_J) {
            this.submitLogin(-113);
          } else {
            if (param1 != this.field_K) {
              if (this.field_G == param1) {
                if (this.field_N) {
                  ArchiveRequest.h(-128);
                } else {
                  if (this.field_R) {
                    sg.b((byte) 81);
                  } else {
                    oq.a(true);
                  }
                }
              }
            } else {
              ff.b((byte) -104);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void i(int param0) {
        this.field_H.clearText(param0 ^ param0);
        this.field_O.clearText(0);
    }

    static {
        field_Q = new IntrusiveDeque();
        field_I = "Please log in as a subscribing member to access this feature.";
        field_F = -1.0;
        field_M = new IntrusiveDeque();
    }
}
