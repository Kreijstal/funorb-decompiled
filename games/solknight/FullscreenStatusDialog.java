/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenStatusDialog extends ResizableModalDialog implements WidgetActivationListener {
    static String field_X;
    static int field_V;
    static int[] field_W;
    static int field_S;
    private InteractiveWidget field_T;
    static int field_U;

    FullscreenStatusDialog(ModalDialogHost param0, FullscreenNoticeType param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiWidget var4 = null;
        try {
          var3 = null;
          if (AlphaWidgetContainer.field_L == param1) {
            var3 = NetworkArchiveRequest.field_x;
          } else {
            if (param1 == ArchiveSourceManager.field_i) {
              var3 = ak.field_c;
              this.field_x = this.field_x + 10;
              if (pe.a((byte) -108)) {
                var3 = IntrusiveDeque.field_b;
                this.field_x = this.field_x + 20;
              }
            } else {
              if (pc.field_c == param1) {
                this.field_x = this.field_x + 30;
                var3 = vh.field_b;
              }
            }
          }
          var4 = new UiWidget((String) (var3), (WidgetEventListener) null);
          var4.field_j = 50;
          var4.field_m = 0;
          var4.field_t = this.field_t;
          var4.field_x = 80;
          var4.field_w = (WidgetRenderer) ((Object) new DefaultTextWidgetRenderer(jh.field_g, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, 5411);
          this.field_T = this.createCloseButton(38, (WidgetEventListener) (this), TextLineMetrics.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nf.<init>(");
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
          throw MusicPatch.wrapClientException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        DisplayNameSelectionPanel.field_G = param0;
        if (param2 >= -94) {
          return;
        }
        try {
          ce.field_b = true;
          ah.field_e = new ProgressMessageDialog(u.field_b, uc.field_g, param1, k.field_b, DisplayNameSelectionPanel.field_G);
          u.field_b.showDialog(ah.field_e, -55);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "nf.PA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(Archive param0, int param1, Archive param2) {
        ValidationStatusIcon.field_Q = param2;
        if (param1 >= -57) {
          return;
        }
        try {
          eb.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "nf.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void discardDeclaredStaticReferences(int param0) {
        field_X = null;
        field_W = null;
        if (param0 != -1) {
          field_X = (String) null;
        }
    }

    private final void closeStatusNotice(int param0) {
        if (!this.field_J) {
          return;
        }
        this.field_J = false;
        if (param0 > -94) {
          field_S = -84;
        }
    }

    final static boolean a(int param0, boolean param1, String param2, String param3, AccountRegistrationPanel param4, String param5, byte param6) {
        AccountCreationResultPanel var7 = null;
        RuntimeException var7_ref = null;
        AccountCreationResultPanel var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ma.field_o != MatchingFieldValidator.field_p) {
            return false;
          }
          if (param6 <= 110) {
            FullscreenStatusDialog.discardDeclaredStaticReferences(118);
          }
          var8 = new AccountCreationResultPanel(u.field_b, param4);
          var7 = var8;
          u.field_b.showDialog(var8, -113);
          if (Asteroid.a(-1)) {
            var8.showAccountCreationConnectionFailure((byte) -63);
            return true;
          }
          MouseWheelInput.field_e = param5;
          SocketConnector.field_d = param2;
          ma.field_o = ContentTransitionDialog.field_Z;
          og.field_b = param1;
          AlphaWidgetContainer.field_K = param3;
          vb.field_j = null;
          uh.field_d = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("nf.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, boolean param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            var7 = (String) null;
            FullscreenStatusDialog.a(120, false, (String) null, (String) null, (AccountRegistrationPanel) null, (String) null, (byte) -93);
          }
          if (param3 != this.field_T) {
            return;
          }
          this.closeStatusNotice(-124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    private final InteractiveWidget createCloseButton(int param0, WidgetEventListener param1, String param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param2, param1);
          var4.field_w = (WidgetRenderer) ((Object) new gh());
          var5 = -6 + this.field_x;
          this.field_x = this.field_x + param0;
          var4.setBounds(30, this.field_t - 14 - 16, 15, 0, var5);
          this.addChild(var4, 5411);
          this.refreshLayout(1);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("nf.M(").append(param0).append(',');
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
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_V = 0;
        field_X = "Cancel";
        field_U = -1;
    }
}
