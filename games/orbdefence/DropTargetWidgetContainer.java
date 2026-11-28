/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static int field_C;
    static String field_B;
    static String field_E;
    static vg field_A;

    public static void releaseDeclaredStaticReferences(int param0) {
        field_B = null;
        field_E = null;
        if (param0 != 21006) {
          return;
        }
        field_A = null;
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_y = param6;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "mm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 23) {
            return false;
          }
          if (param0 != null &&
            param0.length() >= EmailFormatValidator.field_q &&
            param0.length() <= na.field_b) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("mm.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void pointerReleased(int param0, int param1, byte param2, UiWidget param3, int param4, int param5) {
        DraggableWidgetContainer var7 = null;
        try {
          super.pointerReleased(param0, param1, (byte) -120, param3, param4, param5);
          var7 = DelegatingCanvas.field_c;
          if (param2 > -91) {
            field_E = (String) null;
          }
          if (var7 != null &&
            this.containsPointer((byte) 3, param1, param5, param0, param4)) {
            if (!(this.field_h instanceof WidgetDropListener)) {
              if (!(var7.field_h instanceof WidgetDropListener)) {
                return;
              }
              ((WidgetDropListener) (var7.field_h)).widgetDropped(47, var7, this);
              DelegatingCanvas.field_c = null;
              return;
            }
            ((WidgetDropListener) (this.field_h)).widgetDropped(22, var7, this);
            DelegatingCanvas.field_c = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "mm.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_B = "More suggestions";
        field_E = "members-only content";
        field_A = null;
    }
}
