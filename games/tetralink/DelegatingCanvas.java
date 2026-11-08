/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static UiComponent field_a;
    static DualLinkNodeHashTable field_f;
    private java.awt.Component field_d;
    static String field_b;
    static int field_c;
    static UiComponent field_e;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wb.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0 > -47) {
          DelegatingCanvas.createGameOptions(false, -3);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_d.update(param0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wb.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void createGameOptions(boolean param0, int param1) {
        MenuLabelGlobals.field_d = new GraphicsSettings(GameKeyHandler.field_g);
        MenuLabelGlobals.field_d.field_n = MenuLabelGlobals.field_d.field_n | param0;
        if (param1 != -7869) {
          return;
        }
        TextHighlightSpan.field_p = -1;
    }

    static {
        field_b = "Your rating is <%0>";
        field_c = 256;
    }
}
