/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ResizableDialog implements ButtonActivationListener {
    static int field_hb;
    static String[] field_gb;
    static Sprite field_lb;
    private ButtonWidget field_kb;
    static int field_ib;
    static String field_jb;

    final static LobbyPlayer a(long param0, byte param1) {
        if (param1 > -35) {
          return (LobbyPlayer) null;
        }
        return (LobbyPlayer) (kp.field_o.a(param0, -22877));
    }

    private final void l(int param0) {
        if (param0 != 0) {
          return;
        }
        if (!this.field_R) {
          return;
        }
        this.field_R = false;
    }

    final static void d(int param0, int param1, int param2) {
        int var3 = -36 / ((param0 - 11) / 62);
        wp.a(param2, param1, 255, 0);
    }

    vm(DialogLayer param0, db param1) {
        super(param0, 200, 150);
        Object var3 = null;
        UiWidget var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != GameKeyHandler.field_c) {
            if (hl.field_b == param1) {
              this.field_w = this.field_w + 10;
              var3 = on.field_cb;
              if (gj.b(-26966)) {
                var3 = UiTheme.field_r;
                this.field_w = this.field_w + 20;
              }
            } else {
              if (param1 == lp.field_s) {
                var3 = CipherPacketBuffer.field_t;
                this.field_w = this.field_w + 30;
              }
            }
          } else {
            var3 = aa.field_j;
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.field_n = this.field_n;
          var4.field_i = 50;
          var4.field_w = 80;
          var4.field_y = 0;
          var4.painter = (WidgetPainter) ((Object) new TextWidgetPainter(DisplayNamePanel.field_H, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b((byte) 70, var4);
          this.field_kb = this.a((byte) -103, (WidgetListener) (this), ic.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vm.<init>(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void k(byte param0) {
        field_lb = null;
        if (param0 != -29) {
          field_lb = (Sprite) null;
          field_jb = null;
          field_gb = null;
          return;
        }
        field_jb = null;
        field_gb = null;
    }

    private final ButtonWidget a(byte param0, WidgetListener param1, String param2) {
        ButtonWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ButtonWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ButtonWidget(param2, param1);
          var4.painter = (WidgetPainter) ((Object) new oq());
          var5 = -6 + this.field_w;
          this.field_w = this.field_w + 38;
          var4.setWidgetBounds(15, var5, 28972, -16 + (-14 + this.field_n), 30);
          this.b((byte) 83, var4);
          if (param0 >= -71) {
            field_jb = (String) null;
          }
          this.e(-1);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vm.B(").append(param0).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, ButtonWidget param2, int param3, int param4) {
        if (param3 > -83) {
          return;
        }
        try {
          if (this.field_kb == param2) {
            this.l(0);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vm.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(String param0, int param1, String param2, String param3, int param4, int param5) {
        ChatMessage var6 = null;
        try {
          if (param5 != 0) {
            String var7 = (String) null;
            vm.a((String) null, -13, (String) null, (String) null, -118, 91);
          }
          var6 = new ChatMessage(param4, param0, param1, param2, param3);
          DialogLayer.a(var6, (byte) 83);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_jb = "Fear";
        field_ib = 4;
    }
}
