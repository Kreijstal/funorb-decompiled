/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv implements WidgetRenderer {
    static String friendsCanBeAddedText;
    private int field_a;
    private int field_d;
    private LegacyBitmapFont field_c;

    public static void b(int param0) {
        if (param0 < 38) {
          bv.a(31);
          friendsCanBeAddedText = null;
          return;
        }
        friendsCanBeAddedText = null;
    }

    public bv() {
        this.field_a = 1;
        this.field_d = 1;
        this.field_c = kw.field_b;
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!widget.hovered &&
            !widget.hasFocus(-1)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + widget.text + "</u>", parentX + widget.x, widget.y + parentY, widget.width, widget.height, var6_int, -1, this.field_d, this.field_a, this.field_c.field_s + this.field_c.field_I);
          if (widget.hasFocus(-1)) {
            var7 = this.field_c.a(widget.text);
            var8 = this.field_c.field_s + this.field_c.field_I;
            var9 = parentX + widget.x;
            if (2 == this.field_d) {
              var9 = var9 + (-var7 + widget.width);
            } else {
              if (1 == this.field_d) {
                var9 = var9 + (widget.width - var7 >> 1);
              }
            }
            var10 = widget.y + parentY;
            if (this.field_a == 2) {
              var10 = var10 + (widget.height - var8);
            } else {
              if (this.field_a == 1) {
                var10 = var10 + (widget.height - var8 >> 1);
              }
            }
            AudioServiceThread.drawDottedRectangle(var10 + 2, 4 + var7, guard ^ -5596714, var9 - 2, var8);
          }
          if (guard == 5592405) {
            return;
          }
          this.field_a = 59;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("bv.A(");
          if (widget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    bv(LegacyBitmapFont param0, int param1, int param2) {
        try {
          this.field_a = param2;
          this.field_c = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        String var2 = (String) null;
        wv.a((byte) 99, FadingWidget.field_C, (String) null);
        if (param0 != -363927231) {
          bv.a(-108);
        }
    }

    static {
        friendsCanBeAddedText = "Friends can be added in multiplayer<nbsp>games";
    }
}
