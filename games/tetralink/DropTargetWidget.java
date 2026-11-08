/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static UiComponent field_O;
    static String field_N;
    static String field_Q;
    static int field_P;
    static int field_R;

    final void handlePointerRelease(int param0, boolean param1, UiWidget param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        DraggableWidget var7 = null;
        DraggableWidget var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.handlePointerRelease(param0, param1, param2, param3, param4, param5);
          var8 = InterfaceTextLoader.field_c;
          var7 = var8;
          if (var8 != null) {
            if (!this.containsPoint(param4, 1343807649, param5, param3, param0)) {
              return;
            }
            if (this.field_s instanceof DropTargetListener) {
              ((DropTargetListener) (this.field_s)).onWidgetDropped(var8, 108, this);
              InterfaceTextLoader.field_c = null;
              return;
            }
            if (var8.field_s instanceof DropTargetListener) {
              ((DropTargetListener) (var8.field_s)).onWidgetDropped(var8, 92, this);
              InterfaceTextLoader.field_c = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("te.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 <= -6) {
          field_N = null;
          field_Q = null;
          field_O = null;
          return;
        }
        DropTargetWidget.releaseStatics(115);
        field_N = null;
        field_Q = null;
        field_O = null;
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_J = param6;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "te.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "Account created successfully!";
        field_P = 480;
        field_Q = "Unable to delete friend - system busy";
    }
}
