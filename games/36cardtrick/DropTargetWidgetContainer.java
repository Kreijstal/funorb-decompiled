/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static MouseInputHandler field_B;
    static bj field_A;

    final static void j(int param0) {
        if (param0 != -9636) {
          DropTargetWidgetContainer.a(-106, -89, 43);
        }
    }

    final static void a(int param0, int param1, int param2) {
        ca.field_a = param2;
        ug.field_h = param0;
        if (param1 != -16923) {
          field_B = (MouseInputHandler) null;
        }
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_y = param6;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "wc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_B = null;
        if (param0 != -21693) {
          field_A = (bj) null;
          field_A = null;
          return;
        }
        field_A = null;
    }

    final void pointerReleased(boolean param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        DraggableWidgetContainer var7 = null;
        try {
          super.pointerReleased(param0, param1, param2, param3, param4, param5);
          var7 = sh.field_i;
          if (var7 != null &&
            this.containsPointer(-77, param3, param5, param2, param4)) {
            if (this.field_k instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_k)).widgetDropped(this, 15254, var7);
              sh.field_i = null;
              return;
            }
            if (var7.field_k instanceof WidgetDropListener) {
              ((WidgetDropListener) (var7.field_k)).widgetDropped(this, 15254, var7);
              sh.field_i = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "wc.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_B = new MouseInputHandler();
        field_A = null;
    }
}
