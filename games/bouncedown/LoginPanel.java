/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends DequeWidgetContainer implements TextFieldListener, WidgetActivationListener {
    private boolean field_J;
    private String field_E;
    private InteractiveWidget field_H;
    private EditableTextField field_z;
    private EditableTextField field_I;
    private boolean field_B;
    private InteractiveWidget field_D;
    private InteractiveWidget field_K;
    static IntrusiveDeque field_F;
    static RgbSprite[] field_G;
    private boolean field_C;
    static AccountServiceResult field_L;

    final void setAccountAndClearPassword(int param0, String param1) {
        EditableTextField var3 = null;
        String var4 = null;
        try {
          if (param0 != 190) {
            LoginPanel.k(125);
          }
          var3 = this.field_I;
          var4 = param1;
          var3.setText(false, var4, true);
          this.field_z.clearText(117);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "ci.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        if (null != this.field_E) {
          FrameTimer.field_a.drawParagraph(this.field_E, this.field_r + (param3 + 20), 15 + (param1 + this.field_i), -40 + this.field_k, this.field_m, 16777215, -1, 1, 0, FrameTimer.field_a.field_s);
        }
        if (this.field_H != null) {
          SoftwareRasterizer.drawHorizontalLine(10 + param3, 134 + param1, this.field_k - 20, 4210752);
        }
        super.drawWidget(param0, param1, 37, param3);
        if (param2 <= 33) {
          this.field_C = true;
        }
    }

    final static void a(byte param0, ResourceArchive param1) {
        int var3 = 0;
        int var4 = 0;
        jk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        int var9 = 0;
        CipherPacketBuffer var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Bounce.field_N;
        try {
          var8 = new CipherPacketBuffer(param1.getFileByName("logo.fo3d", "", -88));
          var10 = var8;
          var3 = var10.readUnsignedByte((byte) -124);
          var10.o(8);
          PacketBuffer.field_g = lb.a(98, var10);
          li.field_e = new int[var3][];
          DisplayNameSelectionPanel.field_G = new jk[var3];
          for (var4 = 0; var3 > var4; var4++) {
            DisplayNameSelectionPanel.field_G[var4] = NetworkArchiveRequest.a(var8, (byte) -111);
          }
          var10.m(-91);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = DisplayNameSelectionPanel.field_G[var9];
            var5.a((byte) -26, 6, 6, 6, 1);
            var5.a(true);
            var6 = new int[]{var5.field_n + var5.field_e >> 1, var5.field_N + var5.field_H >> 1, var5.field_D + var5.field_R >> 1};
            li.field_e[var9] = var6;
            var5.a(-var6[1], 126, -var6[2], -var6[0]);
            var9++;
          }
          if (param0 != -116) {
            LoginPanel.k(-56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ci.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onWidgetActivated(byte param0, int param1, int param2, int param3, InteractiveWidget param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Bounce.field_N;
        try {
          if (param0 <= 6) {
            this.field_J = false;
          }
          if (param4 == this.field_D) {
            this.submitLogin(false);
          } else {
            if (this.field_H != param4) {
              if (param4 == this.field_K) {
                if (this.field_J) {
                  hh.c((byte) -60);
                } else {
                  if (this.field_B) {
                    oh.b(true);
                  } else {
                    ResizableModalDialog.h((byte) -124);
                  }
                }
              }
            } else {
              CipherPacketBuffer.n(8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ci.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String getAccountIdentifier(int param0) {
        if (null == this.field_I.field_h) {
          return "";
        }
        if (param0 != 0) {
          this.field_B = false;
        }
        return this.field_I.field_h;
    }

    public static void a(boolean param0) {
        field_L = null;
        field_F = null;
        field_G = null;
        if (param0) {
          LoginPanel.k(29);
        }
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
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
        jh var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        ph var9 = null;
        LabeledWidgetContainer var12 = null;
        LabeledWidgetContainer var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_B = stackIn_4_1;
          this.field_E = param1;
          stackIn_7_1 = (param3);
          this.field_C = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_J = stackIn_10_1;
          if (this.field_J && (this.field_C ||
            this.field_B)) {
            throw new IllegalStateException();
          }
          this.field_I = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_z = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (this.field_J) {
            this.field_D = new InteractiveWidget(ContentTransitionDialog.field_W, (WidgetEventListener) null);
            this.field_K = new InteractiveWidget(SoundCache.field_g, (WidgetEventListener) null);
            this.field_I.field_y = false;
          } else {
            this.field_D = new InteractiveWidget(bi.field_k, (WidgetEventListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_B) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = pe.field_h;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = bi.field_i;
            }
            this.field_K = new InteractiveWidget(stackIn_18_3, (WidgetEventListener) null);
            if (this.field_C) {
              this.field_H = new InteractiveWidget(ResourceArchive.field_m, (WidgetEventListener) (this));
            }
          }
          this.field_I.field_j = (WidgetRenderer) ((Object) new tc(10000536));
          this.field_z.field_j = (WidgetRenderer) ((Object) new wg(10000536));
          var6 = new jh();
          this.field_D.field_j = (WidgetRenderer) ((Object) var6);
          if (null != this.field_K) {
            this.field_K.field_j = (WidgetRenderer) ((Object) var6);
          }
          if (this.field_H != null) {
            this.field_H.field_j = (WidgetRenderer) ((Object) var6);
          }
          this.field_I.field_q = hf.field_a;
          if (null != this.field_H) {
            this.field_H.field_q = ge.field_a;
          }
          if (this.field_J) {
            this.field_K.field_q = mi.field_e;
          } else {
            if (!this.field_B) {
              this.field_K.field_j = (WidgetRenderer) ((Object) new r());
            } else {
              this.field_K.field_q = nf.field_a;
              this.field_K.field_j = (WidgetRenderer) ((Object) new r());
            }
          }
          this.field_i = 15;
          var7 = FrameTimer.field_a;
          if (this.field_E != null) {
            this.field_i = this.field_i + (5 + var7.textHeight(this.field_E, this.field_k - 40, var7.field_s));
          }
          var8 = wj.field_b;
          var9 = ImageProducerRasterBuffer.a(DiskCacheWorker.b(0), (byte) -90);
          if (EmailFormatValidator.field_k != var9) {
            if (w.field_g == var9) {
              var8 = dl.field_a;
            }
          } else {
            var8 = ha.field_j;
          }
          dupTemp$0 = new LabeledWidgetContainer(10, this.field_i, this.field_k - 20, 25, this.field_I, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, true);
          this.field_i = this.field_i + (5 + ((UiWidget) ((Object) var12)).field_m);
          dupTemp$1 = new LabeledWidgetContainer(10, this.field_i, -20 + this.field_k, 25, this.field_z, false, 80, 3, var7, 16777215, ae.field_d);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, true);
          this.field_D.field_n = (WidgetEventListener) (this);
          this.field_i = this.field_i + (5 + ((UiWidget) ((Object) var13)).field_m);
          if (this.field_H != null) {
            this.field_H.field_n = (WidgetEventListener) (this);
          }
          if (null != this.field_K) {
            this.field_K.field_n = (WidgetEventListener) (this);
          }
          if (this.field_H != null) {
            this.field_D.setBounds(30, 80, -95 + this.field_k, 85, this.field_i);
            this.field_i = this.field_i + 60;
          } else {
            this.field_D.setBounds(30, 80, -10 + this.field_k - 6, 8, this.field_i);
            this.field_i = this.field_i + 35;
          }
          if (null != this.field_H) {
            this.field_H.setBounds(30, 80, -6 + (this.field_k - 10), 8, this.field_i);
            this.field_i = this.field_i + 35;
          }
          if (null != this.field_K) {
            if (!this.field_J &&
              !this.field_B) {
              this.field_K.setBounds(20, 80, 40, 8, this.field_i);
              this.field_i = this.field_i + 25;
            } else {
              this.field_K.setBounds(30, 80, -10 + (-6 + this.field_k), 8, this.field_i);
              this.field_i = this.field_i + 35;
            }
          }
          this.setBounds(this.field_i + 3, 80, this.field_k, 0, 0);
          this.addChild(this.field_D, true);
          if (null != this.field_H) {
            this.addChild(this.field_H, true);
          }
          if (this.field_K != null) {
            this.addChild(this.field_K, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ci.<init>(");
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
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void clearCredentials(byte param0) {
        if (param0 != -100) {
          return;
        }
        this.field_I.clearText(123);
        this.field_z.clearText(param0 + 225);
    }

    public final void onTextSubmitted(byte param0, EditableTextField param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 12 / ((0 - param0) / 33);
          if (this.field_I == param1) {
            this.field_z.takeFocus((UiWidget) (this), false);
          }
          if (this.field_z == param1) {
            this.submitLogin(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ci.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void submitLogin(boolean param0) {
        if (td.a(1) ||
          !(this.field_I.field_h.length() <= 0) &&
          !(0 >= this.field_z.field_h.length())) {
          AccountServiceResult.a(-8742, this.field_I.field_h, this.field_z.field_h);
        }
        if (param0) {
          this.field_J = true;
        }
    }

    final boolean handleKey(UiWidget param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_5_0 = this.focusPreviousChild((byte) -102, param0);
            return stackIn_5_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param0, 19755);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ci.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean k(int param0) {
        ResourceArchive var2;
        boolean stackIn_9_0 = false;
        if (param0 != -31077) {
          var2 = (ResourceArchive) null;
          LoginPanel.a((byte) -62, (ResourceArchive) null);
        }
        boolean decompiledFrameRemainder0 = true;
        if (sa.field_k >= 20 &&
          hi.a((byte) -126) && (!(0 < nb.field_d) ||
          cg.a(param0 + 31078))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public final void onTextChanged(EditableTextField param0, byte param1) {
        try {
          if (param1 < 81) {
            this.field_I = (EditableTextField) null;
          }
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "ci.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_F = new IntrusiveDeque();
    }
}
