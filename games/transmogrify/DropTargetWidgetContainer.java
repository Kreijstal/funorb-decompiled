/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static hi field_y;
    static boolean field_A;
    static int field_z;

    final void pointerReleased(int param0, int param1, UiWidget param2, int param3, int param4, int param5) {
        DraggableWidgetContainer var7 = null;
        RuntimeException var7_ref = null;
        DraggableWidgetContainer var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.pointerReleased(param0, param1, param2, param3 ^ 0, param4, param5);
          var8 = b.field_i;
          var7 = var8;
          if (var8 != null &&
            this.containsPointer(param5, param0, -1, param1, param4)) {
            if (this.field_m instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_m)).widgetDropped(this, 2089, var8);
              b.field_i = null;
            } else {
              if (var8.field_m instanceof WidgetDropListener) {
                ((WidgetDropListener) (var8.field_m)).widgetDropped(this, param3 + 2090, var8);
                b.field_i = null;
              }
            }
          }
          if (param3 == -1) {
            return;
          }
          DropTargetWidgetContainer.resetStaticState(-34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_11_0 = var7_ref;
          stackIn_11_1 = new StringBuilder().append("g.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_v = param6;
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "g.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void resetStaticState(int param0) {
        field_y = null;
        if (param0 != 19224) {
          field_z = 81;
        }
    }

    static {
        field_y = new hi();
    }
}
