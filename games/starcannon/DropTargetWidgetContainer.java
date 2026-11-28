/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static id[] field_w;
    static long field_x;
    static BinaryBitmapFont field_y;

    final void pointerReleased(int param0, int param1, int param2, UiWidget param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        DraggableWidgetContainer var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.pointerReleased(param0, param1, param2, param3, param4, param5);
          var7 = il.field_k;
          if (var7 != null) {
            if (!this.containsPointer(param1, param2, param0, param5, param4 - 12768)) {
              return;
            }
            if (this.field_g instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_g)).widgetDropped(var7, this, param4 + 138);
              il.field_k = null;
              return;
            }
            if (var7.field_g instanceof WidgetDropListener) {
              ((WidgetDropListener) (var7.field_g)).widgetDropped(var7, this, 106);
              il.field_k = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("af.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_t = param6;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void resetDeclaredStaticState(int param0) {
        field_y = null;
        field_w = null;
        if (param0 != 9392) {
          field_x = -117L;
        }
    }

    static {
    }
}
