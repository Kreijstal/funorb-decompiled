/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountTermsPanel extends WidgetContainer implements HotspotClickListener, ButtonActionListener {
    private NameCheckProgressDialog field_K;
    static String field_I;
    private TextHotspotWidget field_F;
    static IntrusiveDeque field_O;
    private TextButton field_M;
    static int[] field_L;
    static String field_J;
    static String field_N;
    static int field_G;

    public static void clearSharedReferences(int param0) {
        field_N = null;
        field_L = null;
        field_J = null;
        field_O = null;
        field_I = null;
        if (param0 != -9251) {
          field_L = (int[]) null;
        }
    }

    public final void onHotspotClick(TextHotspotWidget param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          if (param2 != -106) {
            this.field_F = (TextHotspotWidget) null;
          }
          if (param1 == 0) {
            oc.a(param2 + 16711786, "terms.ws");
            return;
          }
          if (param1 == 1) {
            oc.a(16711680, "privacy.ws");
            return;
          }
          if (2 != param1) {
            return;
          }
          oc.a(16711680, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("bj.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String a(byte param0) {
        int var2 = 35 / ((-66 - param0) / 52);
        return "</col></u>";
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -4) {
            discarded$1 = this.g((byte) 9);
          }
          if (this.field_M != param1) {
            return;
          }
          hk.a(true);
          this.field_K.h((byte) -103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("bj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String g(byte param0) {
        if (param0 >= -84) {
          this.field_M = (TextButton) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    AccountTermsPanel(NameCheckProgressDialog param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        TextWidgetStyle var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_K = param0;
          this.field_M = new TextButton(ImageProducerRasterBuffer.field_j, (WidgetListener) null);
          this.field_M.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
          var7 = LoginCredentials.substituteIndexedTokens(ta.field_b, new String[]{this.g((byte) -120), this.a((byte) -119)}, true);
          var3 = 20;
          var4 = new TextWidgetStyle(IntrusiveNode.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, IntrusiveNode.field_g.ascent, -1, 2147483647, true);
          this.field_F = new TextHotspotWidget(var7, var4);
          this.field_F.tooltip = "";
          this.field_F.a(0, m.field_d, true);
          this.field_F.a(1, m.field_d, true);
          this.field_F.listener = (WidgetListener) (this);
          this.field_F.width = -40 + this.width;
          this.field_F.a(-40 + this.width, (byte) -64, var3, 26);
          var3 = var3 + (this.field_F.height + 15);
          this.a(true, this.field_F);
          var5 = 4;
          var6 = 200;
          this.field_M.setBounds(300 - var6 >> 1, (byte) 122, var3, 40, var6);
          this.field_M.listener = (WidgetListener) (this);
          this.a(true, this.field_M);
          this.setBounds(0, (byte) 122, 0, 55 + (var3 + var5), 300);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_5_0 = this.c(param0, -1);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param0, 121);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("bj.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_I = "Best: ";
        field_O = new IntrusiveDeque();
        field_J = "Mine";
        field_L = new int[4];
        field_N = "Use this alternative as your account name";
    }
}
