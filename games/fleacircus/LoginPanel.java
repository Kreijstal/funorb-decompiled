/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends DequeWidgetContainer implements TextFieldListener, WidgetActivationListener {
    private boolean field_K;
    private InteractiveWidget field_N;
    static String field_F;
    private boolean field_P;
    private InteractiveWidget field_I;
    private boolean field_M;
    private String field_O;
    private EditableTextField field_H;
    private InteractiveWidget field_L;
    private EditableTextField field_J;
    static pl field_G;

    final String j(int param0) {
        if (this.field_H.field_i == null) {
          return "";
        }
        if (param0 != -1) {
          return (String) null;
        }
        return this.field_H.field_i;
    }

    final void drawWidget(int param0, int param1, boolean param2, int param3) {
        if (null != this.field_O) {
          ug.field_e.drawParagraph(this.field_O, 20 + this.field_y + param1, 15 + this.field_z + param0, -40 + this.field_u, this.field_j, 16777215, -1, 1, 0, ug.field_e.field_H);
        }
        if (this.field_N != null) {
          SoftwareRasterizer.drawHorizontalLine(param1 + 10, param0 + 134, this.field_u - 20, 4210752);
        }
        super.drawWidget(param0, param1, param2, param3);
    }

    private final void submitLogin(byte param0) {
        if (NanoFrameTimer.c((byte) 39) ||
          !(this.field_H.field_i.length() <= 0) &&
          !(0 >= this.field_J.field_i.length())) {
          IsaacRandom.a(false, this.field_H.field_i, this.field_J.field_i);
        }
        if (param0 != -32) {
          this.field_P = false;
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param2, -28533);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(32, param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ul.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onTextSubmitted(int param0, EditableTextField param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_H) {
            this.field_J.takeFocus((UiComponent) (this), -123);
          }
          if (this.field_J == param1) {
            this.submitLogin((byte) -32);
          }
          if (param0 != -31825) {
            this.field_N = (InteractiveWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ul.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        DisplayNameSelectionPanel.field_K = (param1 & 48) >> 4;
        if (DisplayNameSelectionPanel.field_K > 2) {
          DisplayNameSelectionPanel.field_K = 2;
        }
        if (param0 == 18398) {
          NetworkArchiveRequest.field_C = (param1 & 13) >> 2;
          oj.field_k = param1 & 3;
          if (2 < NetworkArchiveRequest.field_C) {
            NetworkArchiveRequest.field_C = 2;
          }
          if (oj.field_k > 2) {
            oj.field_k = 2;
          }
          return;
        }
    }

    public final void onTextChanged(int param0, EditableTextField param1) {
        try {
          if (param0 != 40) {
            this.field_M = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ul.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(boolean param0) {
        kb var2 = null;
        int var4 = 0;
        int var3 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        BitmapFont var6 = MatchingFieldValidator.field_p;
        BitmapFont var7 = var6;
        if (param0) {
          var2 = (kb) (pb.field_f.beginForward((byte) 47));
          if (var2 == null) {
          } else {
            var4 = hi.field_q;
            if (var4 < 80) {
              var3 = var4 / 2 - 32;
            } else {
              if (var4 < 230) {
                var3 = 8;
              } else {
                var3 = 123 - var4 / 2;
              }
            }
            SoftwareRasterizer.fillRectangleAlpha(0, -4 + var3, var6.stringWidth(wa.field_f[var2.field_q]) + 64, 40, 16755200, 128);
            SoftwareRasterizer.drawRectangleOutlineAlpha(0, var3 - 4, var6.stringWidth(wa.field_f[var2.field_q]) + 64, 40, 16746496, 128);
            il.field_d[var2.field_q].drawQuarterSizeAveraged(8, var3);
            var6.drawString(wa.field_f[var2.field_q], 48, var3 + var7.field_H, 0, -1);
          }
          return;
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != 16777215) {
          LoginPanel.releaseDeclaredStaticReferences(-9);
        }
    }

    final void a(byte param0, String param1) {
        EditableTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_H;
          var4 = param1;
          if (param0 > -100) {
            this.field_P = false;
          }
          var3.setText(false, (byte) -127, var4);
          this.field_J.clearText(32);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ul.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (param3 != 248) {
            return;
          }
          if (this.field_I != param4) {
            if (this.field_N != param4) {
              if (this.field_L == param4) {
                if (!this.field_P) {
                  if (this.field_K) {
                    ej.a(param3 ^ 232);
                  } else {
                    BufferedSocket.g(param3 ^ 252);
                  }
                } else {
                  vi.c((byte) -124);
                }
              }
            } else {
              ContentTransitionDialog.d(false);
            }
          } else {
            this.submitLogin((byte) -32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ul.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_H.clearText(32);
        int var2 = 38 / ((29 - param0) / 45);
        this.field_J.clearText(32);
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ComponentLayout) null);
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
        ri var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        wh var9 = null;
        LabeledWidgetContainer var12 = null;
        LabeledWidgetContainer var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_M = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_K = stackIn_7_1;
          this.field_O = param1;
          stackIn_10_1 = (param2);
          this.field_P = stackIn_10_1;
          if (this.field_P && (this.field_M ||
            this.field_K)) {
            throw new IllegalStateException();
          }
          this.field_H = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_J = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (this.field_P) {
            this.field_I = new InteractiveWidget(uh.field_o, (WidgetEventListener) null);
            this.field_L = new InteractiveWidget(vk.field_K, (WidgetEventListener) null);
            this.field_H.field_D = false;
          } else {
            this.field_I = new InteractiveWidget(wi.field_h, (WidgetEventListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_K) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = TextHotspotBounds.field_k;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = tc.field_g;
            }
            this.field_L = new InteractiveWidget(stackIn_18_3, (WidgetEventListener) null);
            if (this.field_M) {
              this.field_N = new InteractiveWidget(qk.field_h, (WidgetEventListener) (this));
            }
          }
          this.field_H.field_p = (ComponentLayout) ((Object) new aa(10000536));
          this.field_J.field_p = (ComponentLayout) ((Object) new mh(10000536));
          var6 = new ri();
          this.field_I.field_p = (ComponentLayout) ((Object) var6);
          if (this.field_L != null) {
            this.field_L.field_p = (ComponentLayout) ((Object) var6);
          }
          this.field_H.field_m = uf.field_l;
          if (this.field_N != null) {
            this.field_N.field_p = (ComponentLayout) ((Object) var6);
          }
          if (this.field_N != null) {
            this.field_N.field_m = se.field_f;
          }
          if (!this.field_P) {
            if (this.field_K) {
              this.field_L.field_m = AgeValidator.field_n;
              this.field_L.field_p = (ComponentLayout) ((Object) new me());
            } else {
              this.field_L.field_p = (ComponentLayout) ((Object) new me());
            }
          } else {
            this.field_L.field_m = ModalDialog.field_F;
          }
          this.field_z = 15;
          var7 = ug.field_e;
          if (this.field_O != null) {
            this.field_z = this.field_z + (var7.textHeight(this.field_O, this.field_u - 40, var7.field_H) + 5);
          }
          var8 = se.field_e;
          var9 = ByteStorage.a(true, BoundedRandomAccessFile.getApplet((byte) -107));
          if (LabeledWidgetContainer.field_F != var9) {
            if (wd.field_b == var9) {
              var8 = l.field_a;
            }
          } else {
            var8 = ConfirmedEmailAvailabilityValidator.field_q;
          }
          dupTemp$0 = new LabeledWidgetContainer(10, this.field_z, this.field_u - 20, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild((UiComponent) (dupTemp$0), (byte) -61);
          this.field_z = this.field_z + (5 + ((UiComponent) ((Object) var12)).field_j);
          dupTemp$1 = new LabeledWidgetContainer(10, this.field_z, this.field_u - 20, 25, this.field_J, false, 80, 3, var7, 16777215, kc.field_g);
          var13 = dupTemp$1;
          this.addChild((UiComponent) (dupTemp$1), (byte) -118);
          this.field_I.field_s = (WidgetEventListener) (this);
          this.field_z = this.field_z + (((UiComponent) ((Object) var13)).field_j + 5);
          if (null != this.field_N) {
            this.field_N.field_s = (WidgetEventListener) (this);
          }
          if (null != this.field_L) {
            this.field_L.field_s = (WidgetEventListener) (this);
          }
          if (null == this.field_N) {
            this.field_I.setBounds(8, -6 + this.field_u - 10, this.field_z, 30, 80);
            this.field_z = this.field_z + 35;
          } else {
            this.field_I.setBounds(85, -95 + this.field_u, this.field_z, 30, 80);
            this.field_z = this.field_z + 60;
          }
          if (null != this.field_N) {
            this.field_N.setBounds(8, -6 + this.field_u - 10, this.field_z, 30, 80);
            this.field_z = this.field_z + 35;
          }
          if (this.field_L != null) {
            if (!this.field_P &&
              !this.field_K) {
              this.field_L.setBounds(8, 40, this.field_z, 20, 80);
              this.field_z = this.field_z + 25;
            } else {
              this.field_L.setBounds(8, -6 + this.field_u - 10, this.field_z, 30, 80);
              this.field_z = this.field_z + 35;
            }
          }
          this.setBounds(0, this.field_u, 0, this.field_z + 3, 80);
          this.addChild((UiComponent) (this.field_I), (byte) -76);
          if (null != this.field_N) {
            this.addChild((UiComponent) (this.field_N), (byte) -42);
          }
          if (null != this.field_L) {
            this.addChild((UiComponent) (this.field_L), (byte) -33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ul.<init>(");
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
          throw pf.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
