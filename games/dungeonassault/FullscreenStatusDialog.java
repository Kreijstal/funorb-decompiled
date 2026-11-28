/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenStatusDialog extends ResizableModalDialog implements WidgetActivationListener {
    private InteractiveWidget field_kb;
    static String field_lb;
    static String field_jb;
    static int[] field_ib;
    static String field_mb;

    public final void onWidgetActivated(InteractiveWidget param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 98) {
            field_mb = (String) null;
          }
          if (param0 != this.field_kb) {
            return;
          }
          this.closeStatusNotice(110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("nm.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void closeStatusNotice(int param0) {
        int var2 = 106 % ((47 - param0) / 49);
        if (!this.field_T) {
          return;
        }
        this.field_T = false;
    }

    private final InteractiveWidget createCloseButton(int param0, WidgetEventListener param1, String param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param2, param1);
          var4.field_o = (WidgetRenderer) ((Object) new na());
          var5 = this.field_s - 6;
          if (param0 != 26414) {
            this.field_kb = (InteractiveWidget) null;
          }
          this.field_s = this.field_s + 38;
          var4.setBounds(0, -16 + (this.field_x - 14), var5, 15, 30);
          this.addChild((byte) -127, var4);
          this.refreshLayout(12591);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("nm.G(").append(param0).append(',');
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
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

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
          if (param1 == gl.field_Gb) {
            var3 = oh.field_a;
          } else {
            if (param1 == of.field_g) {
              var3 = jg.field_b;
              this.field_s = this.field_s + 10;
              if (eh.b(119)) {
                this.field_s = this.field_s + 20;
                var3 = ti.field_v;
              }
            } else {
              if (param1 == mc.field_x) {
                this.field_s = this.field_s + 30;
                var3 = SecondaryNodeDequeIterator.field_g;
              }
            }
          }
          var4 = new UiWidget((String) (var3), (WidgetEventListener) null);
          var4.field_s = 80;
          var4.field_x = this.field_x;
          var4.field_v = 50;
          var4.field_q = 0;
          var4.field_o = (WidgetRenderer) ((Object) new DefaultTextWidgetRenderer(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) -66, var4);
          this.field_kb = this.createCloseButton(26414, (WidgetEventListener) (this), sp.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nm.<init>(");
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
          throw AccountServiceResult.wrapClientException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_lb = null;
        field_jb = null;
        field_ib = null;
        if (param0 != 38) {
          return;
        }
        field_mb = null;
    }

    static {
        field_lb = "A pathetic wretch; the runt's sole redeeming feature is its expendability, so common is its kind in the realm of Dungaria that it can be easily replaced.";
        field_jb = "Treasure: ";
        field_mb = "Hidden Nails";
    }
}
