/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextEntryWidgetPainter extends BitmapTextWidgetPainter {
    static ClientUiComponent field_u;
    static String field_v;

    TextEntryWidgetPainter(BitmapFont font, int textColour) {
        super(font, 4, 2, 2, 2, textColour, -1, 0, 1, font.maxAscent, -1, 2147483647, false);
    }

    public static void a(int param0) {
        field_v = null;
        field_u = null;
        if (param0 != 1) {
          field_v = (String) null;
        }
    }

    TextEntryWidgetPainter(int textColour) {
        this(ArmiesOfGielinor.field_J, textColour);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = EmailValidator.outgoingPacket;
        var2.writeCipheredOpcode(32161, param1);
        if (param0 < -99) {
          var2.writeByte(1, 1);
          var2.writeByte(1, 1);
          return;
        }
        field_u = (ClientUiComponent) null;
        var2.writeByte(1, 1);
        var2.writeByte(1, 1);
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (renderFlag) {
            StateChangeEvent.a(widget.width, widget.x + originX, widget.height, 94, originY + widget.y);
          }
          super.paintWidget(widget, originX, -120, renderFlag, originY);
          if (obfuscationGuard <= -79) {
            return;
          }
          TextEntryWidgetPainter.a(-66, -37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("lu.C(");
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    static {
        field_v = "<%0> / <%1> (+<%2>)";
    }
}
