/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestPlayConfirmationForm extends DequeWidgetContainer implements WidgetActivationListener {
    static String field_H;
    private InteractiveWidget field_E;
    static String field_D;
    static AccountRequestState field_F;
    private InteractiveWidget field_G;
    private InteractiveWidget field_I;
    static String field_J;
    static boolean field_K;

    public static void clearDeclaredStaticReferences(int param0) {
        field_D = null;
        field_F = null;
        if (param0 == 0) {
          field_H = null;
          field_J = null;
          return;
        }
        field_D = (String) null;
        field_H = null;
        field_J = null;
    }

    final boolean handleKey(char param0, byte param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, (byte) -117, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_5_0 = this.focusPreviousChild(127, param3);
            return stackIn_5_0;
          }
          if (param2 == 99) {
            stackIn_8_0 = this.focusNextChild(param3, (byte) -28);
            return stackIn_8_0;
          }
          if (param1 >= -99) {
            this.drawWidget(-88, -56, 19, 33);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public GuestPlayConfirmationForm() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_E = new InteractiveWidget(mg.field_K, (WidgetEventListener) null);
        this.field_I = new InteractiveWidget(dl.field_j, (WidgetEventListener) null);
        this.field_G = new InteractiveWidget(oa.field_b, (WidgetEventListener) null);
        ki var1 = new ki();
        this.field_E.field_v = (WidgetRenderer) ((Object) var1);
        this.field_I.field_v = (WidgetRenderer) ((Object) var1);
        this.field_G.field_v = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_I.setBounds(30, -48 + (this.field_q - var2), var4, -var3 + this.field_h >> 1, true);
        this.field_G.setBounds(30, -48 + this.field_q - var2, var4, (this.field_h - var3 >> 1) - (-var4 - var2), true);
        this.field_E.setBounds(30, this.field_q - 78 - var2 * 2, var3, -var3 + this.field_h >> 1, true);
        this.field_I.field_k = (WidgetEventListener) (this);
        this.field_E.field_k = (WidgetEventListener) (this);
        this.field_G.field_k = (WidgetEventListener) (this);
        this.field_E.field_n = bl.field_b;
        this.field_G.field_n = BitPacketBuffer.field_m;
        this.addChild(this.field_I, (byte) 118);
        this.addChild(this.field_E, (byte) 118);
        this.addChild(this.field_G, (byte) 118);
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var5 = this.field_o + param0;
        int var6 = this.field_i + param1;
        ModalDialogHost.field_C.drawParagraph(FrameTimer.field_e, var5 + 20, 20 + var6, this.field_h - 40, -50 + this.field_q, 16777215, param2, 1, 0, ModalDialogHost.field_C.field_s);
        super.drawWidget(param0, param1, -1, param3);
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.applet.Applet var4 = null;
          java.net.URL var5 = null;
          try {
            try {
              var5 = param1.getCodeBase();
              var3 = DisplayNameSelectionPanel.a(param1, var5, -1).getFile();
              if (!param0) {
                var4 = (java.applet.Applet) null;
                GuestPlayConfirmationForm.a(false, (java.applet.Applet) null);
              }
              JavaScriptBridge.callWithArguments(new Object[]{"home", var3 + "home.ws"}, "updatelinks", (byte) -30, param1);
              JavaScriptBridge.callWithArguments(new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", (byte) 121, param1);
              JavaScriptBridge.callWithArguments(new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", (byte) 117, param1);
              JavaScriptBridge.callWithArguments(new Object[]{"options", var3 + "options.ws"}, "updatelinks", (byte) 118, param1);
              JavaScriptBridge.callWithArguments(new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", (byte) -43, param1);
              JavaScriptBridge.callWithArguments(new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", (byte) 119, param1);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          if (this.field_I != param3) {
            if (this.field_E == param3) {
              jk.a(false);
            } else {
              if (param3 == this.field_G) {
                lc.a(4);
              }
            }
          } else {
            RichTextLayout.c(0);
          }
          var6_int = 59 % ((param1 + 62) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("tj.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_H = "Please wait...";
        field_D = "MISSES";
        field_J = "Start Game";
        field_F = new AccountRequestState();
    }
}
