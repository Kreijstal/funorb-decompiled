/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends WidgetWrapper {
    static String field_M;
    static byte[][] field_O;
    static String field_N;
    static Archive field_G;
    static String field_L;
    static String field_J;
    static int[] field_I;
    static int[] field_K;

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetListener param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_C = param6;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ac.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_G = null;
        field_M = null;
        field_K = null;
        field_I = null;
        if (param0 > 61) {
          field_O = (byte[][]) null;
          field_L = null;
          field_J = null;
          field_N = null;
          return;
        }
        field_G = (Archive) null;
        field_O = (byte[][]) null;
        field_L = null;
        field_J = null;
        field_N = null;
    }

    final void pointerReleased(UiWidget param0, byte param1, int param2, int param3, int param4, int param5) {
        DraggableWidgetContainer var7 = null;
        try {
          super.pointerReleased(param0, param1, param2, param3, param4, param5);
          var7 = ArrayWidgetContainer.field_E;
          if (var7 != null &&
            this.containsPointer(0, param3, param2, param4, param5)) {
            if (this.field_v instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_v)).widgetDropped(param1 ^ -13387, var7, this);
              ArrayWidgetContainer.field_E = null;
              return;
            }
            if (!(var7.field_v instanceof WidgetDropListener)) {
              return;
            }
            ((WidgetDropListener) (var7.field_v)).widgetDropped(param1 ^ -13387, var7, this);
            ArrayWidgetContainer.field_E = null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ac.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_M = "Offensive account name";
        field_J = "<%0> might change the options - wait and see.";
        field_N = "Shortcut Reference";
        field_L = "Creating your account";
        field_O = new byte[1000][];
        field_K = new int[16384];
    }
}
