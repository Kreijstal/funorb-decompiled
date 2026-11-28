/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends WidgetContainer implements TextHotspotListener, WidgetActivationListener {
    static n[] field_B;
    private RichTextWidget field_G;
    private InteractiveWidget field_D;
    static double field_I;
    static int field_K;
    static java.awt.Font field_F;
    static int[] field_J;
    static String field_C;
    private AccountCreationResultPanel field_H;
    static String field_E;

    private final String d(boolean param0) {
        if (param0) {
          this.field_H = (AccountCreationResultPanel) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void onTextHotspotActivated(int param0, int param1, RichTextWidget param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        UiWidget var7 = null;
        var6 = stellarshard.field_B;
        try {
          if (0 != param0) {
            if (param0 == 1) {
              sf.a("privacy.ws", param1 + 14);
            } else {
              if (param0 == 2) {
                sf.a("conduct.ws", 12);
              }
            }
          } else {
            sf.a("terms.ws", param1 ^ -14);
          }
          if (param1 == -2) {
            return;
          }
          var7 = (UiWidget) null;
          this.handleKey(100, 104, 'ﾇ', (UiWidget) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    sj(AccountCreationResultPanel param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        DefaultTextWidgetRenderer var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_H = param0;
          this.field_D = new InteractiveWidget(tc.field_q, (WidgetEventListener) null);
          this.field_D.field_u = (WidgetRenderer) ((Object) new b());
          var7 = h.a(nj.field_s, 0, new String[]{this.d(false), this.a(0)});
          var3 = 20;
          var4 = new DefaultTextWidgetRenderer(si.field_V, 0, 0, 0, 0, 16777215, -1, 3, 0, si.field_V.field_N, -1, 2147483647, true);
          this.field_G = new RichTextWidget(var7, var4);
          this.field_G.field_x = "";
          this.field_G.a(ni.field_b, 0, 1);
          this.field_G.a(ni.field_b, 1, 1);
          this.field_G.field_v = (WidgetEventListener) (this);
          this.field_G.field_p = -40 + this.field_p;
          this.field_G.b(-40 + this.field_p, (byte) -11, 26, var3);
          var3 = var3 + (this.field_G.field_t + 15);
          this.addChild(4, this.field_G);
          var5 = 4;
          var6 = 200;
          this.field_D.setBounds(var6, 300 - var6 >> 1, var3, 40, 23987);
          this.field_D.field_v = (WidgetEventListener) (this);
          this.addChild(4, this.field_D);
          this.setBounds(300, 0, 0, 55 + var3 + var5, 23987);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onWidgetActivated(int param0, int param1, InteractiveWidget param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D == param2) {
            IterableNodeHashTable.a((byte) 70);
            this.field_H.o(3);
          }
          if (!param3) {
            return;
          }
          field_F = (java.awt.Font) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("sj.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String a(int param0) {
        if (param0 != 0) {
          field_I = -0.873653220573416;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public static void clearStaticReferences(byte param0) {
        field_F = null;
        field_J = null;
        field_E = null;
        field_B = null;
        field_C = null;
        if (param0 != 23) {
          sj.clearStaticReferences((byte) 57);
        }
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param0 != 29657) {
            field_J = (int[]) null;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param3, -8666);
            return stackIn_7_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(param3, (byte) 90);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("sj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_I = Math.atan2(1.0, 0.0);
        field_C = "Friends can be added in multiplayer<nbsp>games";
        field_E = "Please try again in a few minutes.";
    }
}
