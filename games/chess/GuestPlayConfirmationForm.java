/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestPlayConfirmationForm extends DequeWidgetContainer implements WidgetActivationListener {
    static int field_Q;
    static String field_N;
    static String field_O;
    static String field_K;
    private InteractiveWidget field_U;
    private InteractiveWidget field_M;
    private InteractiveWidget field_R;
    static tk field_P;
    static MouseWheelInput field_L;
    static String field_S;
    static String field_T;

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param2 <= -80) {
          var5 = param3 + this.field_u;
          var6 = this.field_r + param0;
          rb.field_b.drawParagraph(pe.field_e, 20 + var5, 20 + var6, this.field_y - 40, this.field_C - 50, 16777215, -1, 1, 0, rb.field_b.field_C);
          super.drawWidget(param0, param1, -90, param3);
          return;
        }
        this.field_M = (InteractiveWidget) null;
        var5Lifetime1 = param3 + this.field_u;
        var6Lifetime1 = this.field_r + param0;
        rb.field_b.drawParagraph(pe.field_e, 20 + var5Lifetime1, 20 + var6Lifetime1, this.field_y - 40, this.field_C - 50, 16777215, -1, 1, 0, rb.field_b.field_C);
        super.drawWidget(param0, param1, -90, param3);
    }

    final boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        InteractiveWidget var6 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2 + 0, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param3, param2 ^ -27965);
            return stackIn_7_0;
          }
          if (param2 != -1) {
            var6 = (InteractiveWidget) null;
            this.onWidgetActivated((InteractiveWidget) null, -72, -53, -40, -75);
          }
          if (99 != param1) {
            return false;
          }
          stackIn_13_0 = this.focusNextChild(param3, (byte) -73);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ii.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_P = null;
        field_T = null;
        if (param0 >= 40) {
          field_K = null;
          field_N = null;
          field_S = null;
          field_L = null;
          field_O = null;
          return;
        }
    }

    public GuestPlayConfirmationForm() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_R = new InteractiveWidget(fd.field_o, (WidgetEventListener) null);
        this.field_M = new InteractiveWidget(vf.field_c, (WidgetEventListener) null);
        this.field_U = new InteractiveWidget(jd.field_g, (WidgetEventListener) null);
        sf var1 = new sf();
        this.field_R.field_n = (WidgetRenderer) ((Object) var1);
        this.field_M.field_n = (WidgetRenderer) ((Object) var1);
        this.field_U.field_n = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_M.setBounds(-var2 - 48 + this.field_C, 34, 30, var4, this.field_y - var3 >> 1);
        this.field_U.setBounds(-var2 + this.field_C - 48, 34, 30, var4, (-var3 + this.field_y >> 1) + (var4 + var2));
        this.field_R.setBounds(this.field_C - (78 + 2 * var2), 34, 30, var3, this.field_y - var3 >> 1);
        this.field_M.field_p = (WidgetEventListener) (this);
        this.field_R.field_p = (WidgetEventListener) (this);
        this.field_R.field_j = sl.field_d;
        this.field_U.field_p = (WidgetEventListener) (this);
        this.field_U.field_j = MusicPatchNode.field_I;
        this.addChild(this.field_M, 95);
        this.addChild(this.field_R, 95);
        this.addChild(this.field_U, 95);
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          if (param4 != -24221) {
            return;
          }
          if (this.field_M == param0) {
            UiWidget.e(param4 ^ -24297);
            return;
          }
          if (this.field_R == param0) {
            dc.c((byte) 126);
            return;
          }
          if (param0 != this.field_U) {
            return;
          }
          BirthDateChatEnableForm.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ii.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_O = "Service unavailable";
        field_N = "Advertising websites";
        field_K = "Off";
        field_P = new tk();
        field_S = "<%0> has joined your game.";
        field_T = "Logging in...";
    }
}
