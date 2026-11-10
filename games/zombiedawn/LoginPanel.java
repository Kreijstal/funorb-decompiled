/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends UiContainer implements TextInputListener, ButtonActionListener {
    static int field_J;
    static int field_F;
    private TextButton field_K;
    private TextButton field_Q;
    private EditableTextWidget field_M;
    private EditableTextWidget field_N;
    static String field_T;
    private String field_P;
    private boolean field_H;
    private boolean field_O;
    private boolean field_L;
    static boolean field_S;
    private TextButton field_R;

    public final void onTextEdited(EditableTextWidget param0, int param1) {
        try {
          if (param1 != 8) {
            EditableTextWidget var4 = (EditableTextWidget) null;
            this.onTextEdited((EditableTextWidget) null, 89);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ih.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String getAccountIdentifier(boolean param0) {
        if (param0) {
          this.field_N = (EditableTextWidget) null;
        }
        if (null == this.field_N.field_o) {
          return "";
        }
        return this.field_N.field_o;
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        CaptionedContainer dupTemp$0 = null;
        CaptionedContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        TextButton stackIn_17_1 = null;
        TextButton stackIn_17_2 = null;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ThreeSliceButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        Font var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        CaptionedContainer var12 = null;
        CaptionedContainer var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_L = stackIn_4_1;
          this.field_P = param1;
          stackIn_7_1 = (param2);
          this.field_O = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_H = stackIn_10_1;
          if (this.field_O && (this.field_L ||
            this.field_H)) {
            throw new IllegalStateException();
          }
          this.field_N = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (WidgetListener) (this), 100));
          this.field_M = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) (this), 20));
          if (this.field_O) {
            this.field_R = new TextButton(MarkerSliderPainter.field_i, (WidgetListener) null);
            this.field_Q = new TextButton(CutsceneStateHelpers.field_d, (WidgetListener) null);
            this.field_N.field_C = false;
          } else {
            this.field_R = new TextButton(BloodSplat.field_H, (WidgetListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_H) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ArchivePreloader.field_g;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = NodeHashTableIterator.field_h;
            }
            this.field_Q = new TextButton(stackIn_18_3, (WidgetListener) null);
            if (this.field_L) {
              this.field_K = new TextButton(TrafficVehicle.field_P, (WidgetListener) (this));
            }
          }
          this.field_N.field_h = (WidgetPainter) ((Object) new InsetTextPainter(10000536));
          this.field_M.field_h = (WidgetPainter) ((Object) new PasswordFieldPainter(10000536));
          var6 = new ThreeSliceButtonPainter();
          this.field_R.field_h = (WidgetPainter) ((Object) var6);
          if (null != this.field_Q) {
            this.field_Q.field_h = (WidgetPainter) ((Object) var6);
          }
          this.field_N.field_s = MenuFontGlobals.field_a;
          if (null != this.field_K) {
            this.field_K.field_h = (WidgetPainter) ((Object) var6);
          }
          if (null != this.field_K) {
            this.field_K.field_s = LoginPayloadKind.field_f;
          }
          if (this.field_O) {
            this.field_Q.field_s = LoginNameSupport.field_a;
          } else {
            if (this.field_H) {
              this.field_Q.field_s = PageReloadHelpers.field_c;
              this.field_Q.field_h = (WidgetPainter) ((Object) new LinkTextPainter());
            } else {
              this.field_Q.field_h = (WidgetPainter) ((Object) new LinkTextPainter());
            }
          }
          this.field_j = 15;
          var7 = MenuFontGlobals.field_e;
          if (this.field_P != null) {
            this.field_j = this.field_j + (5 + var7.paragraphHeight(this.field_P, -40 + this.field_i, var7.field_I));
          }
          var8 = ScrollContainer.field_C;
          var9 = LoginMethodCookieHelpers.readLastLoginMethod(AppletHostHelpers.getHostApplet(0), 0);
          if (var9 != Scrollbar.field_J) {
            if (AudioSetupHelpers.field_a == var9) {
              var8 = PowerupBar.field_h;
            }
          } else {
            var8 = RandomAccessCacheFile.field_a;
          }
          dupTemp$0 = new CaptionedContainer(10, this.field_j, -20 + this.field_i, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, 10);
          this.field_j = this.field_j + (((UiWidget) ((Object) var12)).field_n + 5);
          dupTemp$1 = new CaptionedContainer(10, this.field_j, this.field_i - 20, 25, this.field_M, false, 80, 3, var7, 16777215, AudioMixerHelpers.field_c);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, 10);
          this.field_R.field_v = (WidgetListener) (this);
          this.field_j = this.field_j + (5 + ((UiWidget) ((Object) var13)).field_n);
          if (null != this.field_K) {
            this.field_K.field_v = (WidgetListener) (this);
          }
          if (this.field_Q != null) {
            this.field_Q.field_v = (WidgetListener) (this);
          }
          if (this.field_K == null) {
            this.field_R.setBounds(80, this.field_j, 8, this.field_i - 6 - 10, 30);
            this.field_j = this.field_j + 35;
          } else {
            this.field_R.setBounds(30, this.field_j, 85, this.field_i - 95, 30);
            this.field_j = this.field_j + 60;
          }
          if (null != this.field_K) {
            this.field_K.setBounds(94, this.field_j, 8, -6 + (this.field_i - 10), 30);
            this.field_j = this.field_j + 35;
          }
          if (null != this.field_Q) {
            if (!this.field_O &&
              !this.field_H) {
              this.field_Q.setBounds(81, this.field_j, 8, 40, 20);
              this.field_j = this.field_j + 25;
            } else {
              this.field_Q.setBounds(-126, this.field_j, 8, this.field_i - 6 - 10, 30);
              this.field_j = this.field_j + 35;
            }
          }
          this.setBounds(-116, 0, 0, this.field_i, this.field_j + 3);
          this.addChild(this.field_R, 10);
          if (this.field_K != null) {
            this.addChild(this.field_K, 10);
          }
          if (null != this.field_Q) {
            this.addChild(this.field_Q, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ih.<init>(");
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
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void clearInputs(int param0) {
        if (param0 >= -89) {
          field_F = -81;
        }
        this.field_N.clearText(0);
        this.field_M.clearText(0);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_P != null) {
          MenuFontGlobals.field_e.drawParagraph(this.field_P, 20 + (param2 + this.field_k), param0 - (-this.field_j - 15), this.field_i - 40, this.field_n, 16777215, -1, 1, 0, MenuFontGlobals.field_e.field_I);
        }
        if (this.field_K != null) {
          Rasterizer.drawHorizontalLine(10 + param2, param0 + 134, -20 + this.field_i, 4210752);
        }
        super.drawLayer(param0, param1, param2, param3);
    }

    final static void resetTutorialTipState(int param0, int param1, boolean param2) {
        HighscoresScreen.field_q = 0;
        QuickChatPhraseCache.field_f = false;
        KeyStateHelpers.field_e = false;
        HighscoresScreen.field_o = 0;
        IntRecordReplyHelpers.field_b = false;
        if (param2) {
          TextWidgetPainter.field_f = param1;
          MusicPatch.field_r = -1;
          IsaacCipher.field_d = false;
          InputValidationResult.field_c = param0;
          MouseInputHandler.field_d = false;
          FullscreenErrorReason.field_a = -1;
          return;
        }
    }

    final void setAccountAndClearPassword(String param0, int param1) {
        EditableTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          if (param1 != 20) {
            this.field_R = (TextButton) null;
          }
          var4 = param0;
          var3.setText(false, false, var4);
          this.field_M.clearText(0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ih.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onTextSubmitted(EditableTextWidget param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_N) {
            this.field_M.focusNext((byte) 125, (UiWidget) (this));
          }
          var3_int = -126 / ((param1 - 35) / 38);
          if (this.field_M == param0) {
            this.submitLogin((byte) -127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ih.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (this.field_R != param2) {
            if (this.field_K == param2) {
              HighscoresScreen.showAccountCreationDialog(51);
            } else {
              if (param2 == this.field_Q) {
                if (!this.field_O) {
                  if (this.field_H) {
                    ZombieDawn.showLoginChoiceDialog(-10401);
                  } else {
                    DialogLayerFrameHelpers.choosePlayOffline((byte) -121);
                  }
                } else {
                  IntrusiveDequeCursor.selectAlternateLoginAction((byte) 111);
                }
              }
            }
          } else {
            this.submitLogin((byte) -66);
          }
          if (param1 != -6) {
            this.field_L = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ih.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.requestKeyboardFocus(-123, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.focusPreviousChild((byte) 120, param2);
            return stackIn_5_0;
          }
          if (99 == param1) {
            stackIn_8_0 = this.focusNextChild(1, param2);
            return stackIn_8_0;
          }
          var5_int = 116 / ((param0 + 83) / 32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ih.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void submitLogin(byte param0) {
        if (param0 > -23) {
          return;
        }
        if (AccountServerResult.isReconnectLogin(127) ||
          !(this.field_N.field_o.length() <= 0) &&
          !(this.field_M.field_o.length() <= 0)) {
          ScrollViewport.startLoginAs(this.field_N.field_o, -27, this.field_M.field_o);
        }
    }

    public static void releaseStatics(int param0) {
        field_T = null;
        if (param0 != -31608) {
          LoginPanel.resetTutorialTipState(120, -75, true);
        }
    }

    static {
        field_T = "Unable to connect to the data server. Please check any firewall you are using.";
        field_F = 0;
    }
}
