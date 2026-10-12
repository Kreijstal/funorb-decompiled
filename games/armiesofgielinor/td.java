/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements WidgetPainter {
    static ClientUiComponent field_g;
    private BitmapFont field_b;
    private int field_e;
    static String field_h;
    static sn[][] field_d;
    private int field_c;
    static dg field_f;
    static String field_a;

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 < -9) {
          field_f = null;
          field_d = (sn[][]) null;
          field_g = null;
          return;
        }
        field_g = (ClientUiComponent) null;
        field_f = null;
        field_d = (sn[][]) null;
        field_g = null;
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard > -79) {
            return;
          }
          if (!widget.field_t &&
            !widget.a(false)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + widget.field_v + "</u>", widget.x + originX, widget.y + originY, widget.width, widget.height, var6_int, -1, this.field_e, this.field_c, this.field_b.field_H + this.field_b.field_L);
          if (widget.a(false)) {
            var7 = this.field_b.a(widget.field_v);
            var8 = this.field_b.field_H + this.field_b.field_L;
            var9 = originX + widget.x;
            if (this.field_e == 2) {
              var9 = var9 + (-var7 + widget.width);
            } else {
              if (this.field_e == 1) {
                var9 = var9 + (widget.width - var7 >> 1);
              }
            }
            var10 = originY + widget.y;
            if (this.field_c == 2) {
              var10 = var10 + (widget.height - var8);
            } else {
              if (this.field_c == 1) {
                var10 = var10 + (widget.height - var8 >> 1);
              }
            }
            na.c(4 + var7, -2 + var9, -70, var8, 2 + var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("td.C(");
          if (widget == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = param0;
        if (var2 == 59) {
          return 2;
        }
        if (var2 == 53) {
          return 3;
        }
        if (var2 == 43) {
          return 4;
        }
        if (var2 == 63) {
          return 0;
        }
        if (var2 == 58) {
          return 1;
        }
        if (param1 <= -40) {
          return -1;
        }
        return -5;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        rn.a(3, (String) null, param0, param1);
        if (param2 <= 4) {
          td.a(46, (byte) -104);
        }
    }

    public td() {
        this.field_b = ArmiesOfGielinor.field_J;
        this.field_e = 1;
        this.field_c = 1;
    }

    td(BitmapFont param0, int param1, int param2) {
        try {
          this.field_b = param0;
          this.field_c = param2;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = "This unit has ingested a cloning catalyst and will leave behind a perfect replica when it next moves.";
        field_a = "<%0>-<%1>";
    }
}
