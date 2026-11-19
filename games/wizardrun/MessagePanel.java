/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessagePanel extends WidgetContainer implements ButtonActionListener {
    static int field_G;
    private String field_I;
    static boolean field_M;
    private AccountProgressDialog field_L;
    private int[] field_E;
    static MouseWheelInput field_K;
    private BitmapFont field_J;
    private int field_H;
    private TextButton[] field_F;

    final TextButton a(int param0, String param1, WidgetListener param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param1, param2);
          var4.renderer = (WidgetRenderer) ((Object) new SpriteButtonPainter());
          var5 = -2 + this.height;
          this.setBounds(param0 ^ 111, 0, this.height + 34, this.width, param0);
          var4.setBounds(110, var5, 30, this.width - 14, 7);
          this.addChild((UiWidget) (var4), (byte) 98);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("vc.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1, int param2) {
        int var4_int = 0;
        try {
          if (param0 != -31) {
            this.field_E = (int[]) null;
          }
          var4_int = this.field_H;
          this.a(1 + var4_int, (byte) 109);
          this.field_F[var4_int] = this.a(0, param1, (WidgetListener) (this));
          this.field_E[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "vc.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1 + 0, param2, param3);
        this.field_J.a(this.field_I, param0 + this.x + 14, this.y + (param3 + 10), this.width - 28, this.height, 16777215, -1, param1, 0, this.field_J.field_M);
    }

    public static void releaseStatics(boolean param0) {
        field_K = null;
        if (param0) {
          field_K = (MouseWheelInput) null;
        }
    }

    MessagePanel(AccountProgressDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.field_H = 0;
        try {
          this.field_I = param2;
          this.field_L = param0;
          this.field_J = param1;
          var4_int = this.field_I != null ? this.field_J.measureWrappedHeight(this.field_I, 260, this.field_J.field_M) : 0;
          this.setBounds(123, 0, 22 + var4_int, 288, 0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = wizardrun.field_H;
        try {
          if (param0 != -18905) {
            this.field_L = (AccountProgressDialog) null;
          }
          for (var6_int = 0; this.field_H > var6_int; var6_int++) {
            if (param1 != this.field_F[var6_int]) {
              continue;
            }
            var7 = this.field_E[var6_int];
            if (-1 != var7) {
              OpacityWidget.setAccountWorkflowState((byte) 94, this.field_E[var6_int]);
            } else {
              this.field_L.closeProgressDialog(param0 ^ 9704);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("vc.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = wizardrun.field_H;
        QuickChatDynamicCommand.field_a = null;
        WrappedTextLayout.field_i = false;
        if (param0 != 260) {
          field_M = false;
        }
        if (DialogLayer.field_J) {
          FriendEntry.field_lb.n(8);
        } else {
          var1 = RasterSnapshot.field_t;
          if (var1 > 0) {
            if (var1 == 1) {
              QuickChatDynamicCommand.field_a = SocketConnector.field_d;
            } else {
              QuickChatDynamicCommand.field_a = WeightedLruCache.formatPlaceholders(new String[]{Integer.toString(var1)}, (byte) 46, RankingRequest.field_m);
            }
            QuickChatDynamicCommand.field_a = AccountSocketHelpers.joinAll(new CharSequence[]{(CharSequence) ((Object) QuickChatDynamicCommand.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) IntrusiveDequeCursor.field_c)}, 550);
          }
          FriendEntry.field_lb.closeProgressDialog(-27697);
          LoginCredentials.a((byte) 125);
        }
    }

    private final void a(int param0, byte param1) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        if (this.field_H >= param0) {
          return;
        }
        TextButton[] var8 = new TextButton[param0];
        TextButton[] var3 = var8;
        int var4 = 125 % ((param1 - 8) / 33);
        int[] var5 = new int[param0];
        for (var6 = 0; var6 < this.field_H; var6++) {
          var8[var6] = this.field_F[var6];
          var5[var6] = this.field_E[var6];
        }
        this.field_F = var3;
        this.field_H = param0;
        this.field_E = var5;
    }

    final static void a(int param0, String param1) {
        try {
          PacketBuffer.setOptionalLoginText(-2, param1);
          if (param0 >= -67) {
            field_G = -79;
          }
          DateFormattingHelpers.showAccountProgress(LoginCredentialKind.field_c, false, -120);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "vc.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = 4;
    }
}
