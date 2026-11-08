/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends UiContainer implements TextInputListener, ButtonActionListener {
    private TextButton field_cb;
    static String field_Y;
    private EditableTextWidget field_S;
    private boolean field_L;
    static int field_Q;
    static UiComponent field_P;
    private boolean field_V;
    static int field_X;
    static String field_N;
    static String field_bb;
    private EditableTextWidget field_ab;
    private String field_K;
    private TextButton field_U;
    static String field_O;
    static volatile boolean field_M;
    static String field_Z;
    static String field_T;
    private boolean field_R;
    private TextButton field_W;

    public static void releaseStatics(int param0) {
        field_bb = null;
        field_Z = null;
        field_P = null;
        field_N = null;
        field_T = null;
        field_Y = null;
        field_O = null;
        if (param0 != 20) {
          field_P = (UiComponent) null;
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
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
          if (param0 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param3, param2 + 109);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(param3, param2 ^ 117);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("tl.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_K != null) {
          NumericDateInputWidget.field_S.drawParagraph(this.field_K, 20 + param1 + this.field_t, this.field_w + param2 + 15, this.field_F - 40, this.field_u, 16777215, -1, 1, 0, NumericDateInputWidget.field_S.field_N);
        }
        if (null != this.field_W) {
          SoftwareRasterizer.drawHorizontalLine(param1 + 10, 134 + param2, -20 + this.field_F, 4210752);
        }
        super.drawLayer(param0, param1, param2, param3);
    }

    public final void onTextEdited(byte param0, EditableTextWidget param1) {
        try {
          int var3_int = -45 / ((-18 - param0) / 63);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "tl.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String getVisibleTooltipText(int param0) {
        if (param0 != 8) {
          return (String) null;
        }
        if (BufferedSocket.field_s) {
          return null;
        }
        if (WeightedLruCache.field_i < LobbyPlayerEntry.field_Mb) {
          return null;
        }
        if (!(WeightedLruCache.field_i >= PieceDropAnimation.field_z + LobbyPlayerEntry.field_Mb)) {
          return TooltipTextGlobals.field_c;
        }
        return null;
    }

    public final void onButtonActivated(byte param0, TextButton param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TetraLink.field_J;
        try {
          if (param0 > 0) {
            return;
          }
          if (this.field_U == param1) {
            this.submitLogin(false);
          } else {
            if (this.field_W == param1) {
              WidgetTheme.openAccountCreationPanel(-100);
            } else {
              if (param1 == this.field_cb) {
                if (!this.field_V) {
                  if (this.field_R) {
                    MenuStyleHelpers.showAccountChoicePanel((byte) -122);
                  } else {
                    PageReloadHelpers.selectBackFromLogin(31212);
                  }
                } else {
                  MenuReturnHelpers.requestLeaveLobby((byte) -63);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("tl.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onTextSubmitted(EditableTextWidget param0, byte param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_ab) {
            this.field_S.focusNext((UiWidget) (this), -384169950);
          }
          if (param0 == this.field_S) {
            this.submitLogin(false);
          }
          if (param1 != 101) {
            this.field_W = (TextButton) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("tl.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setAccountAndClearPassword(boolean param0, String param1) {
        EditableTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_ab;
          if (!param0) {
            this.drawLayer(33, 126, 119, -2);
          }
          var4 = param1;
          var3.setText(false, 74, var4);
          this.field_S.clearText(0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "tl.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void clearInputs(int param0) {
        this.field_ab.clearText(0);
        if (param0 != 1379) {
          this.getAccountIdentifier(true);
        }
        this.field_S.clearText(0);
    }

    private final void submitLogin(boolean param0) {
        TextButton var3;
        if (RasterBuffer.isFrontEndShown((byte) -101) ||
          !(0 >= this.field_ab.field_A.length()) &&
          !(this.field_S.field_A.length() <= 0)) {
          DisplayMode.showLoginProgressMessage(this.field_S.field_A, 39, this.field_ab.field_A);
        }
        if (param0) {
          var3 = (TextButton) null;
          this.onButtonActivated((byte) 76, (TextButton) null, 98, -102, 110);
        }
    }

    final static String getAccountNameValidationMessage(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 35) {
            field_Q = -123;
          }
          stackIn_3_0 = EditableTextWidget.displayNameValidationMessage(param1, false, 82);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String getAccountIdentifier(boolean param0) {
        if (this.field_ab.field_A == null) {
          return "";
        }
        if (param0) {
          this.field_cb = (TextButton) null;
        }
        return this.field_ab.field_A;
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        CaptionedContainer dupTemp$0 = null;
        CaptionedContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        TextButton stackIn_19_1 = null;
        TextButton stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ThreeSliceButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        CaptionedContainer var12 = null;
        CaptionedContainer var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_R = stackIn_4_1;
          this.field_K = param1;
          stackIn_7_1 = (param3);
          this.field_L = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_V = stackIn_10_1;
          if (this.field_V && (this.field_L ||
            this.field_R)) {
            throw new IllegalStateException();
          }
          this.field_ab = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (WidgetListener) (this), 100));
          this.field_S = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (WidgetListener) (this), 20));
          if (!this.field_V) {
            this.field_U = new TextButton(GameOptionTextTables.field_a, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_R) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = PasswordLengthHelpers.field_d;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ResizableDialog.field_T;
            }
            this.field_cb = new TextButton(stackIn_19_3, (WidgetListener) null);
            if (this.field_L) {
              this.field_W = new TextButton(AccountTextGlobals.field_f, (WidgetListener) (this));
            }
          } else {
            this.field_U = new TextButton(CacheEntry.field_v, (WidgetListener) null);
            this.field_cb = new TextButton(GameClock.field_a, (WidgetListener) null);
            this.field_ab.field_K = false;
          }
          this.field_ab.field_H = (WidgetPainter) ((Object) new InsetTextPainter(10000536));
          this.field_S.field_H = (WidgetPainter) ((Object) new PasswordFieldPainter(10000536));
          var6 = new ThreeSliceButtonPainter();
          this.field_U.field_H = (WidgetPainter) ((Object) var6);
          if (null != this.field_cb) {
            this.field_cb.field_H = (WidgetPainter) ((Object) var6);
          }
          this.field_ab.field_C = CheckboxWidget.field_T;
          if (this.field_W != null) {
            this.field_W.field_H = (WidgetPainter) ((Object) var6);
          }
          if (this.field_W != null) {
            this.field_W.field_C = DefaultQuickChatContext.field_e;
          }
          if (!this.field_V) {
            if (!this.field_R) {
              this.field_cb.field_H = (WidgetPainter) ((Object) new LinkTextPainter());
            } else {
              this.field_cb.field_C = SecondaryNodeDeque.field_a;
              this.field_cb.field_H = (WidgetPainter) ((Object) new LinkTextPainter());
            }
          } else {
            this.field_cb.field_C = HotspotTextWidget.field_Y;
          }
          this.field_w = 15;
          var7 = NumericDateInputWidget.field_S;
          if (null != this.field_K) {
            this.field_w = this.field_w + (5 + var7.paragraphHeight(this.field_K, this.field_F - 40, var7.field_N));
          }
          var8 = HighscoreQuery.field_n;
          var9 = DualLinkNode.readLastLoginMethod((byte) 91, ProgressMessageDialog.getHostApplet(13));
          if (var9 == EmailSyntaxValidator.field_s) {
            var8 = PendingReplyNode.field_t;
          } else {
            if (ChatPanelSlideHelpers.field_j == var9) {
              var8 = RasterStackHelpers.field_i;
            }
          }
          dupTemp$0 = new CaptionedContainer(10, this.field_w, -20 + this.field_F, 25, this.field_ab, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, 10);
          this.field_w = this.field_w + (((UiWidget) ((Object) var12)).field_u + 5);
          dupTemp$1 = new CaptionedContainer(10, this.field_w, -20 + this.field_F, 25, this.field_S, false, 80, 3, var7, 16777215, MenuStyleHelpers.field_a);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, 10);
          this.field_w = this.field_w + (((UiWidget) ((Object) var13)).field_u + 5);
          this.field_U.field_s = (WidgetListener) (this);
          if (null != this.field_W) {
            this.field_W.field_s = (WidgetListener) (this);
          }
          if (this.field_cb != null) {
            this.field_cb.field_s = (WidgetListener) (this);
          }
          if (this.field_W == null) {
            this.field_U.setBounds(30, this.field_w, -116, 8, -6 + this.field_F - 10);
            this.field_w = this.field_w + 35;
          } else {
            this.field_U.setBounds(30, this.field_w, -123, 85, this.field_F - 95);
            this.field_w = this.field_w + 60;
          }
          if (null != this.field_W) {
            this.field_W.setBounds(30, this.field_w, 3, 8, -10 + (-6 + this.field_F));
            this.field_w = this.field_w + 35;
          }
          if (this.field_cb != null) {
            if (!this.field_V &&
              !this.field_R) {
              this.field_cb.setBounds(20, this.field_w, 101, 8, 40);
              this.field_w = this.field_w + 25;
            } else {
              this.field_cb.setBounds(30, this.field_w, -128, 8, -10 + (-6 + this.field_F));
              this.field_w = this.field_w + 35;
            }
          }
          this.setBounds(this.field_w + 3, 0, 64, 0, this.field_F);
          this.addChild(this.field_U, 10);
          if (this.field_W != null) {
            this.addChild(this.field_W, 10);
          }
          if (this.field_cb != null) {
            this.addChild(this.field_cb, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("tl.<init>(");
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
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_N = "This entry doesn't match";
        field_Z = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_O = "Try changing the '<%0>' setting.";
        field_T = "New Game";
        field_M = false;
        field_bb = "Auto-respond to <%0>";
        field_Y = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
