/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nl extends TextWidgetRenderer {
    static iw field_p;
    static mp field_n;
    static boolean field_o;

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 != 2147483647) {
          field_n = (mp) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    nl(LegacyBitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_s, -1, 2147483647, false);
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        try {
          if (isEnabled) {
            ByteArrayStorage.drawBeveledBorder(widget.height, widget.x + parentX, widget.width, (byte) -84, parentY + widget.y);
          }
          super.renderWidget(widget, parentY, guard, isEnabled, parentX);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nl.A(" + (widget != null ? "{...}" : "null") + ',' + parentY + ',' + guard + ',' + isEnabled + ',' + parentX + ')');
        }
    }

    nl(int param0) {
        this(kw.field_b, param0);
    }

    static {
        field_p = new iw(4);
        field_n = new mp();
    }
}
