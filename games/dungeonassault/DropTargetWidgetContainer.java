/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static String field_J;
    static boolean field_G;
    static String[] field_H;
    static String field_I;
    static ef field_K;
    static RgbSprite field_F;

    final static String a(int param0, int param1) {
        if (param1 > 29) {
          return 1 + param0 + "/" + en.field_a.length;
        }
        DropTargetWidgetContainer.i(58);
        return 1 + param0 + "/" + en.field_a.length;
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_D = param6;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void pointerReleased(int param0, boolean param1, int param2, UiWidget param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        DraggableWidgetContainer var7 = null;
        DraggableWidgetContainer var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.pointerReleased(param0, param1, param2, param3, param4, param5);
          var8 = ah.field_b;
          var7 = var8;
          if (var8 != null) {
            if (!this.containsPointer(param5, param4, param0, -1, param2)) {
              return;
            }
            if (this.field_n instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_n)).widgetDropped(this, var8, false);
              ah.field_b = null;
              return;
            }
            if (var8.field_n instanceof WidgetDropListener) {
              ((WidgetDropListener) (var8.field_n)).widgetDropped(this, var8, false);
              ah.field_b = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("bj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void i(int param0) {
        if (!tl.field_l) {
          throw new IllegalStateException();
        }
        oj.field_b = true;
        t.a(true, 0);
        if (param0 > 71) {
          AccountNameAvailabilityValidator.field_n = 0;
          return;
        }
        DropTargetWidgetContainer.h(-16);
        AccountNameAvailabilityValidator.field_n = 0;
    }

    public static void h(int param0) {
        field_J = null;
        if (param0 == 31029) {
          field_K = null;
          field_H = null;
          field_I = null;
          field_F = null;
          return;
        }
        DropTargetWidgetContainer.i(54);
        field_K = null;
        field_H = null;
        field_I = null;
        field_F = null;
    }

    static {
        field_J = "Raiders cost you 5 Treasure less to recruit.";
        field_I = "Waiting for game to start. Select an entrance or use special abilities.";
        field_H = new String[]{"Retreat", "Automatically retreat. (Single use)"};
        field_K = new ef();
    }
}
