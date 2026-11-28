/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestPlayConfirmationForm extends DequeWidgetContainer implements WidgetActivationListener {
    private InteractiveWidget field_J;
    static String field_K;
    private InteractiveWidget field_L;
    private InteractiveWidget field_M;
    static ResourceArchive field_P;
    static IntrusiveDeque field_O;
    static double[] field_N;
    static he[] field_R;
    static he[][] field_Q;

    public GuestPlayConfirmationForm() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_L = new InteractiveWidget(ai.field_v, (WidgetEventListener) null);
        this.field_M = new InteractiveWidget(ej.field_c, (WidgetEventListener) null);
        this.field_J = new InteractiveWidget(ml.field_m, (WidgetEventListener) null);
        ie var1 = new ie();
        this.field_L.field_l = (WidgetRenderer) ((Object) var1);
        this.field_M.field_l = (WidgetRenderer) ((Object) var1);
        this.field_J.field_l = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_M.setBounds(this.field_k - 48 - var2, 30, -var3 + this.field_w >> 1, 16535, var4);
        this.field_J.setBounds(this.field_k - 48 - var2, 30, var2 + ((this.field_w - var3 >> 1) + var4), 16535, var4);
        this.field_L.setBounds(-(2 * var2) + (-78 + this.field_k), 30, -var3 + this.field_w >> 1, 16535, var3);
        this.field_M.field_u = (WidgetEventListener) (this);
        this.field_L.field_u = (WidgetEventListener) (this);
        this.field_L.field_v = ai.field_w;
        this.field_J.field_u = (WidgetEventListener) (this);
        this.field_J.field_v = AccountRegistrationPanel.field_X;
        this.addChild(this.field_M, (byte) 101);
        this.addChild(this.field_L, (byte) 95);
        this.addChild(this.field_J, (byte) 82);
    }

    static long bitwiseXor(long param0, long param1) {
        return param0 ^ param1;
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + this.field_o;
        int var6 = this.field_m + param3;
        DualLinkNode.field_i.drawParagraph(ProxyAuthenticationRequiredException.field_a, var5 + 20, 20 + var6, -40 + this.field_w, this.field_k - 50, 16777215, -1, 1, 0, DualLinkNode.field_i.field_x);
        super.drawWidget(param0, param1, param2, param3);
    }

    public final void onWidgetActivated(int param0, int param1, boolean param2, InteractiveWidget param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_M != param3) {
            if (param3 != this.field_L) {
              if (param3 == this.field_J) {
                ka.a((byte) -123);
              }
            } else {
              IsaacRandom.b(false);
            }
          } else {
            h.d(-126);
          }
          if (param2) {
            return;
          }
          GuestPlayConfirmationForm.i(99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ff.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        java.applet.Applet var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 != -2) {
            var5 = (java.applet.Applet) null;
            GuestPlayConfirmationForm.a(-48, (String) null, (java.applet.Applet) null);
          }
          var6 = DualLinkNode.field_h;
          var1 = var6;
          var2 = 0;
          var3 = var6.length;
          while (var3 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) var1_ref), "ff.B(" + param0 + ')');
        }
    }

    final boolean handleKey(int param0, char param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        InteractiveWidget var6 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 63) {
            var6 = (InteractiveWidget) null;
            this.onWidgetActivated(-113, 58, true, (InteractiveWidget) null, 25);
          }
          if (super.handleKey(param0, param1, param2, 97)) {
            return true;
          }
          if (98 == param0) {
            stackIn_8_0 = this.focusPreviousChild(param2, 65535);
            return stackIn_8_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(param2, (byte) 61);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ff.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 == -1) {
          field_O = null;
          field_R = null;
          field_K = null;
          field_N = null;
          field_Q = (he[][]) null;
          field_P = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        GuestPlayConfirmationForm.a(121, (String) null, (java.applet.Applet) null);
        field_O = null;
        field_R = null;
        field_K = null;
        field_N = null;
        field_Q = (he[][]) null;
        field_P = null;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          int var4 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param1);
              var3 = kk.a(var3, param2, 4767999);
              LoginPanel.a(var3.toString(), true, param2, (byte) 9);
              var4 = 4 % ((param0 - 33) / 48);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var3_ref2;
            stackIn_6_1 = new StringBuilder().append("ff.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
            if (param2 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ie.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_K = "Cancel";
        field_O = new IntrusiveDeque();
        field_N = new double[]{0.0, 5.0, 8.0, 10.0, 10.0, 1.5, 0.0, 5.0, 4.5, 3.0, 1.5, 1.5, 0.0, 0.0, 0.0, 3.0, 3.0, 1.5, 1.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5.0, 5.0, 8.0, 3.5, 5.0, 2.5, 0.0, 0.0, 0.0, 0.0, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        field_Q = new he[77][];
    }
}
