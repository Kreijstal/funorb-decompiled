/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenStatusDialog extends ResizableModalDialog implements WidgetActivationListener {
    private InteractiveWidget field_J;
    static int field_K;

    FullscreenStatusDialog(ModalDialogHost param0, FullscreenNoticeType param1) {
        super(param0, 200, 150);
        Object var3 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          var3 = null;
          if (param1 == TextLineMetrics.field_k) {
            var3 = ht.field_h;
          } else if (param1 == OpenGlIndexBuffer.field_r) {
            var3 = tt.field_b;
            this.field_n = this.field_n + 10;
            if (uf.a(false)) {
              this.field_n = this.field_n + 20;
              var3 = bi.field_o;
            }
          } else if (ArchiveNetworkClient.field_o == param1) {
            var3 = ur.field_c;
            this.field_n = this.field_n + 30;
          }
          UiWidget var4 = new UiWidget((String) (var3), (WidgetEventListener) null);
          var4.field_q = this.field_q;
          var4.field_h = 50;
          var4.field_n = 80;
          var4.field_p = 0;
          var4.field_e = (WidgetRenderer) ((Object) new DefaultTextWidgetRenderer(oi.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, 1);
          this.field_J = this.createCloseButton(ne.field_e, -83, (WidgetEventListener) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          Object stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oq.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, InteractiveWidget param1, int param2, int param3, byte param4) {
        try {
          if (this.field_J == param1) {
            this.closeStatusNotice((byte) 22);
          }
          int var6_int = 109 / ((param4 + 27) / 61);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "oq.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void closeStatusNotice(byte param0) {
        if (!this.field_z) {
          return;
        }
        if (param0 != 22) {
          return;
        }
        this.field_z = false;
    }

    private final InteractiveWidget createCloseButton(String param0, int param1, WidgetEventListener param2) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          InteractiveWidget var4 = new InteractiveWidget(param0, param2);
          var4.field_e = (WidgetRenderer) ((Object) new qb());
          int var5 = this.field_n - 6;
          this.field_n = this.field_n + 38;
          var4.setBounds(30, 15, var5, -16 + (-14 + this.field_q), (byte) 125);
          this.addChild(var4, 1);
          int var6 = -20 / ((param1 - 1) / 59);
          this.refreshLayout(false);
          InteractiveWidget stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4_ref;
          StringBuilder stackIn_4_1 = new StringBuilder().append("oq.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static AccountServiceResult createAccountSuggestionsResult(byte param0, String[] param1) {
        String stackIn_8_2 = null;
        try {
          if (param0 >= -37) {
            AccountServiceResult stackIn_2_0 = (AccountServiceResult) null;
            return stackIn_2_0;
          }
          AccountServiceResult var2 = new AccountServiceResult(false);
          var2.suggestions = param1;
          AccountServiceResult stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("oq.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
