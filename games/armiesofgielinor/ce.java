/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends DequeWidgetContainer implements WidgetActivationListener {
    static RgbSprite[] field_F;
    static int[] field_I;
    static String field_P;
    static String field_H;
    static int field_J;
    private InteractiveWidget field_G;
    static int field_N;
    private InteractiveWidget field_E;
    static ResourceArchive field_M;
    static int field_Q;
    static QuickChatPhraseRepository quickChatPhrases;
    static int[] turnDurationTicks;
    private InteractiveWidget field_L;

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_6_0 = this.focusPreviousChild(false, rootWidget);
            return stackIn_6_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild((byte) -126, rootWidget);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ce.F(");
          if (rootWidget == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int[] a(int param0) {
        if (param0 > -26) {
          return (int[]) null;
        }
        return new int[8];
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int var5 = originX + this.x;
        int var6 = this.y + originY;
        if (obfuscationGuard < -82) {
          ArmiesOfGielinor.field_J.drawParagraph(aq.field_a, 20 + var5, var6 + 20, -40 + this.width, -50 + this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
          super.drawWidget(originX, originY, (byte) -107, renderLayer);
          return;
        }
        field_F = (RgbSprite[]) null;
        ArmiesOfGielinor.field_J.drawParagraph(aq.field_a, 20 + var5, var6 + 20, -40 + this.width, -50 + this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
        super.drawWidget(originX, originY, (byte) -107, renderLayer);
    }

    public static void k(int param0) {
        field_P = null;
        field_I = null;
        field_M = null;
        if (param0 == 12000) {
          field_H = null;
          quickChatPhrases = null;
          field_F = null;
          turnDurationTicks = null;
          return;
        }
        field_Q = -81;
        field_H = null;
        quickChatPhrases = null;
        field_F = null;
        turnDurationTicks = null;
    }

    public ce() {
        super(0, 0, 476, 225, (WidgetPainter) null);
        this.field_L = new InteractiveWidget(li.field_p, (WidgetListener) null);
        this.field_G = new InteractiveWidget(pt.field_Y, (WidgetListener) null);
        this.field_E = new InteractiveWidget(pi.field_O, (WidgetListener) null);
        nu var1 = new nu();
        this.field_L.painter = (WidgetPainter) ((Object) var1);
        this.field_G.painter = (WidgetPainter) ((Object) var1);
        this.field_E.painter = (WidgetPainter) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_G.setBounds(this.width - var3 >> 1, var4, this.height - 48 - var2, 8192, 30);
        this.field_E.setBounds((-var3 + this.width >> 1) + var4 + var2, var4, -var2 + this.height - 48, 8192, 30);
        this.field_L.setBounds(-var3 + this.width >> 1, var3, -(2 * var2) + this.height - 78, 8192, 30);
        this.field_G.listener = (WidgetListener) (this);
        this.field_L.listener = (WidgetListener) (this);
        this.field_E.listener = (WidgetListener) (this);
        this.field_L.tooltipText = hb.field_b;
        this.field_E.tooltipText = CombatSandbox.field_e;
        this.addChild((byte) 10, (Widget) (this.field_G));
        this.addChild((byte) 10, (Widget) (this.field_L));
        this.addChild((byte) 10, (Widget) (this.field_E));
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        InteractiveWidget var8 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_G == widget) {
            MapRepository.b((byte) 126);
          } else {
            if (this.field_L != widget) {
              if (this.field_E == widget) {
                di.c((byte) -127);
              }
            } else {
              ConsoleTextNode.a(false);
            }
          }
          if (obfuscationGuard == 11) {
            return;
          }
          var8 = (InteractiveWidget) null;
          this.widgetActivated(47, 86, -42, 41, (InteractiveWidget) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ce.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_P = "(Exit)";
        field_Q = 640;
        field_H = "Your turn";
        field_I = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_J = 10;
        turnDurationTicks = new int[]{12000, 9000, 7500, 6000, 4500, 3000, 1500};
    }
}
