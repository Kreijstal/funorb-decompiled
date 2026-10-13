/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends tj implements he {
    static RgbSprite[] field_F;
    static int[] field_I;
    static String field_P;
    static String field_H;
    static int field_J;
    private fw field_G;
    static int field_N;
    private fw field_E;
    static ResourceArchive field_M;
    static int field_Q;
    static QuickChatPhraseRepository quickChatPhrases;
    static int[] turnDurationTicks;
    private fw field_L;

    final boolean a(Widget param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(false, param0);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.b((byte) -126, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ce.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int[] a(int param0) {
        if (param0 > -26) {
          return (int[]) null;
        }
        return new int[8];
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + this.x;
        int var6 = this.y + param1;
        if (param2 < -82) {
          ArmiesOfGielinor.field_J.drawParagraph(aq.field_a, 20 + var5, var6 + 20, -40 + this.width, -50 + this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
          super.a(param0, param1, (byte) -107, param3);
          return;
        }
        field_F = (RgbSprite[]) null;
        ArmiesOfGielinor.field_J.drawParagraph(aq.field_a, 20 + var5, var6 + 20, -40 + this.width, -50 + this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
        super.a(param0, param1, (byte) -107, param3);
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
        this.field_L = new fw(li.field_p, (qo) null);
        this.field_G = new fw(pt.field_Y, (qo) null);
        this.field_E = new fw(pi.field_O, (qo) null);
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
        this.field_G.field_x = (qo) (this);
        this.field_L.field_x = (qo) (this);
        this.field_E.field_x = (qo) (this);
        this.field_L.field_s = hb.field_b;
        this.field_E.field_s = CombatSandbox.field_e;
        this.a((byte) 10, (Widget) (this.field_G));
        this.a((byte) 10, (Widget) (this.field_L));
        this.a((byte) 10, (Widget) (this.field_E));
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        fw var8 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_G == param4) {
            MapRepository.b((byte) 126);
          } else {
            if (this.field_L != param4) {
              if (this.field_E == param4) {
                di.c((byte) -127);
              }
            } else {
              ConsoleTextNode.a(false);
            }
          }
          if (param1 == 11) {
            return;
          }
          var8 = (fw) null;
          this.a(47, 86, -42, 41, (fw) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ce.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
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
