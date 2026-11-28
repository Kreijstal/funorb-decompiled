/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends DequeWidgetContainer implements TextFieldListener, WidgetActivationListener {
    private String field_V;
    static RgbSprite field_Q;
    private EditableTextField field_N;
    private boolean field_Y;
    private InteractiveWidget field_M;
    static MusicTrack field_R;
    private InteractiveWidget field_L;
    private boolean field_T;
    static String field_X;
    private InteractiveWidget field_O;
    static String field_S;
    static String field_P;
    private boolean field_K;
    static id field_W;
    private EditableTextField field_U;

    public final void onTextSubmitted(EditableTextField param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 3) {
            return;
          }
          if (this.field_N == param0) {
            this.field_U.takeFocus(0, (UiWidget) (this));
          }
          if (this.field_U == param0) {
            this.submitLogin((byte) -85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wf.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
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
        sf var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        jd var9 = null;
        LabeledWidgetContainer var12 = null;
        LabeledWidgetContainer var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_Y = stackIn_4_1;
          this.field_V = param1;
          stackIn_7_1 = (param2);
          this.field_T = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_K = stackIn_10_1;
          if (this.field_T && (this.field_Y ||
            this.field_K)) {
            throw new IllegalStateException();
          }
          this.field_N = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_U = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (!this.field_T) {
            this.field_M = new InteractiveWidget(ArchiveProvider.field_c, (WidgetEventListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_K) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = GameAppletShell.field_k;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = jd.field_g;
            }
            this.field_O = new InteractiveWidget(stackIn_19_3, (WidgetEventListener) null);
            if (this.field_Y) {
              this.field_L = new InteractiveWidget(fd.field_o, (WidgetEventListener) (this));
            }
          } else {
            this.field_M = new InteractiveWidget(DefaultTextWidgetRenderer.field_f, (WidgetEventListener) null);
            this.field_O = new InteractiveWidget(HuffmanCodec.field_b, (WidgetEventListener) null);
            this.field_N.field_H = false;
          }
          this.field_N.field_n = (WidgetRenderer) ((Object) new wc(10000536));
          this.field_U.field_n = (WidgetRenderer) ((Object) new hk(10000536));
          var6 = new sf();
          this.field_M.field_n = (WidgetRenderer) ((Object) var6);
          if (null != this.field_O) {
            this.field_O.field_n = (WidgetRenderer) ((Object) var6);
          }
          this.field_N.field_j = lk.field_b;
          if (null != this.field_L) {
            this.field_L.field_n = (WidgetRenderer) ((Object) var6);
          }
          if (null != this.field_L) {
            this.field_L.field_j = sl.field_d;
          }
          if (!this.field_T) {
            if (!this.field_K) {
              this.field_O.field_n = (WidgetRenderer) ((Object) new wj());
            } else {
              this.field_O.field_j = qd.field_I;
              this.field_O.field_n = (WidgetRenderer) ((Object) new wj());
            }
          } else {
            this.field_O.field_j = ao.field_i;
          }
          this.field_r = 15;
          var7 = rb.field_b;
          if (this.field_V != null) {
            this.field_r = this.field_r + (5 + var7.textHeight(this.field_V, this.field_y - 40, var7.field_C));
          }
          var8 = rc.field_e;
          var9 = DirectByteStorage.a((byte) 127, ArrayWidgetContainer.i(81));
          if (var9 != ph.field_g) {
            if (le.field_g == var9) {
              var8 = oj.field_a;
            }
          } else {
            var8 = em.field_k;
          }
          dupTemp$0 = new LabeledWidgetContainer(10, this.field_r, this.field_y - 20, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, 95);
          this.field_r = this.field_r + (((UiWidget) ((Object) var12)).field_C + 5);
          dupTemp$1 = new LabeledWidgetContainer(10, this.field_r, this.field_y - 20, 25, this.field_U, false, 80, 3, var7, 16777215, di.field_Qb);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, 95);
          this.field_r = this.field_r + (5 + ((UiWidget) ((Object) var13)).field_C);
          this.field_M.field_p = (WidgetEventListener) (this);
          if (null != this.field_L) {
            this.field_L.field_p = (WidgetEventListener) (this);
          }
          if (this.field_O != null) {
            this.field_O.field_p = (WidgetEventListener) (this);
          }
          if (null == this.field_L) {
            this.field_M.setBounds(this.field_r, 34, 30, -6 + this.field_y - 10, 8);
            this.field_r = this.field_r + 35;
          } else {
            this.field_M.setBounds(this.field_r, 34, 30, -95 + this.field_y, 85);
            this.field_r = this.field_r + 60;
          }
          if (this.field_L != null) {
            this.field_L.setBounds(this.field_r, 34, 30, -6 + this.field_y - 10, 8);
            this.field_r = this.field_r + 35;
          }
          if (null != this.field_O) {
            if (!this.field_T &&
              !this.field_K) {
              this.field_O.setBounds(this.field_r, 34, 20, 40, 8);
              this.field_r = this.field_r + 25;
            } else {
              this.field_O.setBounds(this.field_r, 34, 30, -10 + (this.field_y - 6), 8);
              this.field_r = this.field_r + 35;
            }
          }
          this.setBounds(0, 34, this.field_r + 3, this.field_y, 0);
          this.addChild(this.field_M, 95);
          if (null != this.field_L) {
            this.addChild(this.field_L, 95);
          }
          if (this.field_O != null) {
            this.addChild(this.field_O, 95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("wf.<init>(");
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
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        if (param2 >= -80) {
          LoginPanel.clearDeclaredStaticReferences(-118);
        }
        if (this.field_V != null) {
          rb.field_b.drawParagraph(this.field_V, 20 + (this.field_u + param3), this.field_r + param0 + 15, -40 + this.field_y, this.field_C, 16777215, -1, 1, 0, rb.field_b.field_C);
        }
        if (null != this.field_L) {
          SoftwareRasterizer.drawHorizontalLine(param3 + 10, 134 + param0, -20 + this.field_y, 4210752);
        }
        super.drawWidget(param0, param1, -117, param3);
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_S = null;
        if (param0 != 35) {
          field_W = (id) null;
        }
        field_W = null;
        field_X = null;
        field_Q = null;
        field_R = null;
        field_P = null;
    }

    final static void a(PcmSample param0, int param1) {
        if (param0 == null) {
          return;
        }
        try {
          ContentTransitionDialog.a(PcmSampleStream.createForPlaybackRate(param0, 100, 96), true);
          int var2_int = -101 % ((param1 + 24) / 39);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "wf.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void submitLogin(byte param0) {
        int var2;
        if (dc.a(124) ||
          !(this.field_N.field_v.length() <= 0) &&
          !(this.field_U.field_v.length() <= 0)) {
          cb.a(82, this.field_U.field_v, this.field_N.field_v);
        }
        var2 = 39 % ((-30 - param0) / 52);
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Chess.field_G;
        try {
          if (this.field_M != param0) {
            if (this.field_L != param0) {
              if (this.field_O == param0) {
                if (this.field_T) {
                  ProxyAuthenticationRequiredException.b(-16586);
                } else {
                  if (!this.field_K) {
                    el.h(-117);
                  } else {
                    qf.a(108);
                  }
                }
              }
            } else {
              dc.c((byte) 127);
            }
          } else {
            this.submitLogin((byte) -121);
          }
          if (param4 != -24221) {
            this.field_K = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("wf.DA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onTextChanged(EditableTextField param0, int param1) {
        try {
          if (param1 != 10999) {
            LoginPanel.clearDeclaredStaticReferences(-13);
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "wf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void exitFullscreenFrame(java.awt.Frame param0, PlatformTaskDispatcher param1, int param2) {
        PlatformTask var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Chess.field_G;
        try {
          while (true) {
            var3 = param1.requestFullscreenExit(param0, false);
            while (0 == var3.status) {
              bc.sleepMillis(10L, (byte) 17);
            }
            if (var3.status != 1) {
              bc.sleepMillis(100L, (byte) -104);
              continue;
            }
            break;
          }
          if (param2 < 48) {
            return;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("wf.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void g(byte param0) {
        int var2 = -102 % ((param0 - 40) / 38);
        this.field_N.clearText(-12881);
        this.field_U.clearText(-12881);
    }

    final void a(String param0, int param1) {
        EditableTextField var3 = null;
        String var4 = null;
        if (param1 != 20) {
          return;
        }
        try {
          var3 = this.field_N;
          var4 = param0;
          var3.setText(0, false, var4);
          this.field_U.clearText(param1 ^ -12869);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "wf.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String i(byte param0) {
        if (this.field_N.field_v == null) {
          return "";
        }
        int var2 = 33 % ((param0 + 23) / 48);
        return this.field_N.field_v;
    }

    final static int c(boolean param0) {
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        PlatformTaskDispatcher var8 = null;
        var7 = Chess.field_G;
        try {
          var1_int = 0;
          if (!param0) {
            var8 = (PlatformTaskDispatcher) null;
            LoginPanel.exitFullscreenFrame((java.awt.Frame) null, (PlatformTaskDispatcher) null, -94);
          }
          var2 = 0;
          while (kf.d(18954)) {
            AccountRegistrationPanel.field_R.c((byte) -42);
            if (AccountRegistrationPanel.field_R.d((byte) 101)) {
              var1_int = 1;
            }
            if (13 != vg.field_a) {
              continue;
            }
            var2 = 1;
          }
          AccountRegistrationPanel.field_R.a(SoundCache.findMenuActionAt(TextHotspotBounds.field_m, 1, ag.field_f), 99, SoundCache.findMenuActionAt(BufferedSocket.field_k, 1, rf.field_b));
          if (AccountRegistrationPanel.field_R.d((byte) 124)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            AccountRegistrationPanel.field_R.field_h >= 0) {
            var3 = fi.field_c[AccountRegistrationPanel.field_R.field_h];
            if (var3 == 2 ||
              var3 == 5) {
              mh.b(13);
            }
          } else {
            if (var2 != 0 &&
              FrameTimer.field_f != 2) {
              mh.b(13);
            }
          }
          if (0 == var3 &&
            FrameTimer.field_f == 2) {
            var4 = -BirthDateChatEnableForm.field_M + ud.correctedCurrentTimeMillis(2);
            var6 = (int)((10999L - var4) / 1000L);
            if (0 >= var6) {
              qh.a(false, true, 5);
              var3 = 2;
            }
          }
          stackIn_30_0 = var3;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) var1), "wf.J(" + param0 + ')');
        }
    }

    final boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param3, 27964);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(param3, (byte) -73);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wf.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_X = "Only show private chat from my friends and opponents";
        field_S = "<%0>%";
        field_P = "Bishop";
    }
}
