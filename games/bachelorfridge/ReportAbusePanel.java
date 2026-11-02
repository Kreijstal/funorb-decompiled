/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportAbusePanel extends WidgetContainer implements WidgetActionListener {
    private InteractiveWidget field_F;
    private InteractiveWidget field_E;
    static String field_D;
    private InteractiveWidget field_C;
    static af field_G;

    final static void a(nv param0, byte param1) {
        try {
          if (param1 != 59) {
            field_G = (af) null;
          }
          fo.field_a.a(param1 ^ -60, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "dka.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public ReportAbusePanel() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_E = new InteractiveWidget(MouseWheelInput.field_b, (WidgetListener) null);
        this.field_C = new InteractiveWidget(SuperSpeedAllAnimation.field_x, (WidgetListener) null);
        this.field_F = new InteractiveWidget(tja.field_b, (WidgetListener) null);
        ff var1 = new ff();
        this.field_E.renderer = (WidgetRenderer) ((Object) var1);
        this.field_C.renderer = (WidgetRenderer) ((Object) var1);
        this.field_F.renderer = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_C.a(this.width - var3 >> 1, 30, (byte) 59, var4, -var2 + (-48 + this.height));
        this.field_F.a((this.width - var3 >> 1) + var4 + var2, 30, (byte) 59, var4, -var2 + this.height - 48);
        this.field_E.a(this.width - var3 >> 1, 30, (byte) 59, var3, -(2 * var2) + this.height - 78);
        this.field_C.listener = (WidgetListener) (this);
        this.field_E.listener = (WidgetListener) (this);
        this.field_F.listener = (WidgetListener) (this);
        this.field_E.tooltip = qha.field_h;
        this.field_F.tooltip = lna.field_h;
        this.c(this.field_C, -121);
        this.c(this.field_E, 122);
        this.c(this.field_F, 33);
    }

    public final void a(int param0, InteractiveWidget param1, int param2, byte param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        nv var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (this.field_C != param1) {
            if (this.field_E == param1) {
              qfa.f(114);
            } else {
              if (this.field_F == param1) {
                SuperSpeedAllAnimation.e((byte) 123);
              }
            }
          } else {
            dd.d((byte) -88);
          }
          if (param3 >= 50) {
            return;
          }
          var8 = (nv) null;
          ReportAbusePanel.a((nv) null, (byte) -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("dka.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void draw(byte param0, int param1, int param2, int param3) {
        int var5 = param3 + this.x;
        int var6 = param1 + this.y;
        jca.field_a.drawParagraph(FullHealEvent.field_q, var5 + 20, 20 + var6, this.width - 40, this.height - 50, 16777215, -1, 1, 0, jca.field_a.field_u);
        super.draw((byte) 74, param1, param2, param3);
        int var7 = -39 / ((param0 + 20) / 54);
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            ReportAbusePanel.a(28);
          }
          if (super.handleKey(param0 + 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_8_0 = this.a(-123, param3);
            return stackIn_8_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(param3, 1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("dka.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_D = null;
        if (param0 != 26727) {
          nv var2 = (nv) null;
          ReportAbusePanel.a((nv) null, (byte) -57);
          field_G = null;
          return;
        }
        field_G = null;
    }

    static {
        field_D = "Report abuse";
    }
}
