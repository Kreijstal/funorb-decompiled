/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static AccountRequestState COMPLETE;
    static String field_B;

    final void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        DraggableWidget var7 = null;
        try {
          super.onPointerReleased(root, guard, parentX, pointerY, pointerX, parentY);
          var7 = MessageDialog.field_gb;
          if (var7 != null) {
            if (!this.containsPoint(pointerX, -1, parentX, pointerY, parentY)) {
              return;
            }
            if (this.listener instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.listener)).onDrop(var7, this, 20302);
              MessageDialog.field_gb = null;
              return;
            }
            if (!(var7.listener instanceof WidgetDropListener)) {
              return;
            }
            ((WidgetDropListener) (var7.listener)).onDrop(var7, this, 20302);
            MessageDialog.field_gb = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "st.T(" + (root != null ? "{...}" : "null") + ',' + guard + ',' + parentX + ',' + pointerY + ',' + pointerX + ',' + parentY + ')');
        }
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.child = param6;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "st.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        COMPLETE = null;
        if (param0 < 111) {
          return;
        }
        field_B = null;
    }

    final static float a(int param0, float[] param1, float[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        float stackIn_1_0 = 0.0f;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -42 % ((14 - param0) / 55);
          stackIn_1_0 = param2[0] * param1[0] + param1[1] * param2[1];
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("st.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        COMPLETE = new AccountRequestState();
    }
}
