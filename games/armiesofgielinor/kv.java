/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv extends tj implements WidgetActivationListener {
    private String[] field_H;
    static String field_J;
    private InteractiveWidget[] field_E;
    private mf field_G;
    static String field_I;
    static int field_F;

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        td var4 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_D.clear(param0 - 11);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_H = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_H[var4_int] = ug.a(GrowthEvent.bitwiseXor(param0, 116), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new td(ArmiesOfGielinor.field_J, 0, 1);
            this.field_E = new InteractiveWidget[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_E[var5] = new InteractiveWidget(this.field_H[var5], (WidgetListener) (this));
              this.field_E[var5].painter = (WidgetPainter) ((Object) var4);
              this.field_E[var5].tooltipText = wl.field_J;
              this.field_E[var5].setBounds(0, 80, 20 + 16 * var5, 8192, 15);
              this.a((byte) 10, (Widget) (this.field_E[var5]));
            }
            this.field_E[var3_int] = new InteractiveWidget(h.field_h, (WidgetListener) (this));
            this.field_E[var3_int].painter = (WidgetPainter) ((Object) var4);
            this.field_E[var3_int].setBounds(0, param0, var3_int * 16 + 16 + 20, param0 ^ 8292, 15);
            this.a((byte) 10, (Widget) (this.field_E[var3_int]));
            return;
          }
          this.field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("kv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[0] = 1;
        var2[2] = 16777215;
        var2[1] = 14737632;
        VerticalScrollbar.field_Rb = new CombatSandbox(ChannelBaseVolumeConsoleCommand.field_J, IsaacRandom.field_k, rs.field_n, var2, 0, 0);
        if (param0 != -28541) {
          field_F = 18;
        }
        le.field_b = new cg();
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.b(0.75f);
    }

    final static fl k(int param0) {
        if (param0 != 5) {
          field_J = (String) null;
        }
        if (iv.field_b == null) {
          iv.field_b = new fl();
          iv.field_b.a(13421772, ArmiesOfGielinor.field_J);
          iv.field_b.field_s = 7697781;
          iv.field_b.field_o = 14;
          iv.field_b.field_h = 0;
          iv.field_b.field_c = 2763306;
          iv.field_b.field_m = gl.field_e;
          iv.field_b.field_d = 4;
          iv.field_b.field_x = 6;
          iv.field_b.field_r = 5;
        }
        return iv.field_b;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        super.drawWidget(originX, originY, (byte) -95, renderLayer);
        if (0 != renderLayer) {
          return;
        }
        BitmapFont var5 = ArmiesOfGielinor.field_J;
        if (obfuscationGuard > -82) {
          kv.b(true);
        }
        if (this.field_H != null) {
          var5.drawParagraph(we.field_i, originX + this.x, originY + this.y, this.width, 20, 16777215, -1, 0, 0, var5.maxDescent + var5.maxAscent);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ph.isAccountNameCharacter(-19, param2)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (param0) {
            field_F = 103;
          }
          if (var3_int >= 12) {
            return false;
          }
          if (!rs.isAccountNameSeparator(param2, (byte) -87)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kv.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -12215) {
            return false;
          }
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard ^ 0)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_8_0 = this.a(false, rootWidget);
            return stackIn_8_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_12_0 = this.b((byte) -125, rootWidget);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("kv.F(");
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    kv(mf param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 11) {
            kv.a(false, (CharSequence) null, 'ﾪ');
          }
          for (var6_int = 0; this.field_H.length > var6_int; var6_int++) {
            if (widget == this.field_E[var6_int]) {
              this.field_G.a(-1, this.field_H[var6_int]);
            }
          }
          if (this.field_E[this.field_H.length] == widget) {
            this.field_G.a((byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("kv.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
          return;
        }
        field_J = null;
    }

    static {
        field_J = "No special action";
        field_I = "You cannot use this equipment until turn <%0>.";
    }
}
