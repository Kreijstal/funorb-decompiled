/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends nl {
    static String field_I;
    static String field_H;
    static int field_L;
    static DualNodeHashTable lobbyRoomsById;
    static int[] decodedSpriteWidths;

    final void b(boolean param0) {
        this.field_E.e(0);
        if (!param0) {
          field_I = (String) null;
        }
    }

    qm(int param0, int param1, int param2, int param3, WidgetPainter param4, Widget param5) {
        super(param0, param1, param2, param3, param4, (WidgetListener) null);
        try {
          this.field_E = param5;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (obfuscationGuard > -82) {
          return;
        }
        if (0 != renderLayer) {
          if (this.width == 0) {
            return;
          }
          if (this.height != 0) {
            t.field_c.a(this.y + originY + this.height, this.x + originX + this.width, this.y + originY, -101, this.x + originX);
            this.field_E.drawWidget(this.x + originX, this.y + originY, (byte) -110, renderLayer);
            t.field_c.a(58);
            return;
          }
          return;
        }
        if (this.painter == null) {
          if (this.width == 0) {
            return;
          }
          if (this.height != 0) {
            t.field_c.a(this.y + originY + this.height, this.x + originX + this.width, this.y + originY, -101, this.x + originX);
            this.field_E.drawWidget(this.x + originX, this.y + originY, (byte) -110, renderLayer);
            t.field_c.a(58);
            return;
          }
          return;
        }
        this.painter.paintWidget((Widget) (this), originX, -102, true, originY);
        if (this.width == 0) {
          return;
        }
        if (this.height != 0) {
          t.field_c.a(this.y + originY + this.height, this.x + originX + this.width, this.y + originY, -101, this.x + originX);
          this.field_E.drawWidget(this.x + originX, this.y + originY, (byte) -110, renderLayer);
          t.field_c.a(58);
          return;
        }
    }

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 103) {
            lobbyRoomsById = (DualNodeHashTable) null;
          }
          stackIn_6_0 = (this.containsPointer(1, originX, pointerY, pointerX, originY)) && (super.pointerPressed(pointerX, originX, originY, 127, rootWidget, pointerY, button));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qm.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_H = null;
        if (param0 >= 38) {
          lobbyRoomsById = null;
          field_I = null;
          decodedSpriteWidths = null;
          return;
        }
        decodedSpriteWidths = (int[]) null;
        lobbyRoomsById = null;
        field_I = null;
        decodedSpriteWidths = null;
    }

    static {
        field_I = "Map size: ";
        field_L = 0;
        field_H = "This game has started.";
    }
}
